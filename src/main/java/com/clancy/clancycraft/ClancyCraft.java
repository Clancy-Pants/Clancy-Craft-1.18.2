package com.clancy.clancycraft;

import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.entitys.ModEntityTypes;
import com.clancy.clancycraft.entitys.client.boss.renderer.*;
import com.clancy.clancycraft.entitys.projectiles.DemonFireRenderer;
import com.clancy.clancycraft.entitys.projectiles.PoisonArrowRenderer;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.world.biome.ModRegions;
import com.clancy.clancycraft.world.biome.ModSurfaceRuleData;
import com.clancy.clancycraft.world.dimenesion.ClancyCraftDimensions;
import com.clancy.clancycraft.world.dimenesion.portals.ModPOIS;
import com.clancy.clancycraft.world.structures.ClancyCraftStructures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
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
import slimeknights.tconstruct.library.client.model.tools.ToolModel;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.util.Locale;
import java.util.stream.Collectors;

import static com.clancy.clancycraft.liquid.ModFluids.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ClancyCraft.MOD_ID)
public class ClancyCraft
{
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "clancycraft";

    public ClancyCraft()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(eventBus);
        ClancyCraftItems.register(eventBus);
        FLUIDS.register(eventBus);
        ClancyCraftDimensions.register();
        ModEntityTypes.ENTITY_TYPES.register(eventBus);
        ClancyCraftStructures.register(eventBus);






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

        //LEAVES
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RAINBOW_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RAINBOW_SAPLING.get(), RenderType.cutout());


//mobs
        EntityRenderers.register(ModEntityTypes.CERB.get(), CerbRenderer::new);
        EntityRenderers.register(ModEntityTypes.MINITAUR.get(), MinitaurRenderer::new);
        EntityRenderers.register(ModEntityTypes.DEMON.get(), DemonRenderer::new);
        EntityRenderers.register(ModEntityTypes.MEDUSA.get(), MedusaRenderer::new);
        EntityRenderers.register(ModEntityTypes.YETI.get(), YetiRenderer::new);

        EntityRenderers.register(ModEntityTypes.DEMON_FIRE.get(), DemonFireRenderer::new);
        EntityRenderers.register(ModEntityTypes.POISON_ARROW.get(), PoisonArrowRenderer::new);


        //doors
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RAINBOW_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RAINBOW_TRAPDOOR.get(), RenderType.translucent());

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

    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(ClancyCraft.MOD_ID, name.toLowerCase(Locale.ROOT));
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MOD_ID, value = Dist.CLIENT)
    public static class ClancyCraftReforgedClient {
        public @SubscribeEvent
        static void itemColors(ColorHandlerEvent.Item event) {
            final ItemColors colors = event.getItemColors();

            ToolModel.registerItemColors(colors, ClancyCraftItems.KATANA);
            ToolModel.registerItemColors(colors, ClancyCraftItems.WARHAMMER);
            ToolModel.registerItemColors(colors, ClancyCraftItems.HALBERD);
            ToolModel.registerItemColors(colors, ClancyCraftItems.BATTLEAXE);
        }
    }
}
