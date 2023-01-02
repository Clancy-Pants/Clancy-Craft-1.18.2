package com.clancy.clancycraft;

import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.liquid.ModFluids;
import com.clancy.clancycraft.world.biome.ModRegions;
import com.clancy.clancycraft.world.biome.ModSurfaceRuleData;
import com.clancy.clancycraft.world.dimenesion.ClancyCraftDimensions;
import com.clancy.clancycraft.world.dimenesion.portals.ModPOIS;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ClancyCraft.MOD_ID)
public class ClancyCraft
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "clancycraft";

    public ClancyCraft()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ClancyCraftItems.register(eventBus);
        ModBlocks.register(eventBus);
        ClancyCraftDimensions.register();
        ModFluids.register(eventBus);


        ModPOIS.register(eventBus);



        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_NUGGETIEM_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_NUGGETIEM_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_NUGGETIEM_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_MAGNITE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_MAGNITE_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_MAGNITE_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModFluids.LIQUID_LIGHT_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.LIQUID_LIGHT_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.LIQUID_LIGHT_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_DARK_METAL_BLOCK.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_DARK_METAL_FLUID.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_DARK_METAL_FLOWING.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_LIGHT_METAL_BLOCK.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_LIGHT_METAL_FLUID.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_LIGHT_METAL_FLOWING.get(), RenderType.solid());

    }
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        event.enqueueWork(() ->
        {
            // Given we only add two biomes, we should keep our weight relatively low.
            Regions.register(new ModRegions(new ResourceLocation(MOD_ID, "overworld"), 2));

            // Register our surface rules
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModSurfaceRuleData.makeRules());
        });
        // Some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // Some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            // Register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
