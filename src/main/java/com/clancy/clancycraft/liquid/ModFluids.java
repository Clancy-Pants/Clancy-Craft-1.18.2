package com.clancy.clancycraft.liquid;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, ClancyCraft.MOD_ID);


    public static final RegistryObject<FlowingFluid> MOLTEN_NUGGETIEM_FLUID
            = FLUIDS.register("molten_nuggetiem_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NUGGETIEM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_NUGGETIEM_FLOWING
            = FLUIDS.register("molten_nuggetiem_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NUGGETIEM_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MOLTEN_NUGGETIEM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_NUGGETIEM_FLUID.get(), () -> MOLTEN_NUGGETIEM_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.BUCKET_FILL).overlay(WATER_OVERLAY_RL)
            .color(0xbffcba03)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_NUGGETIEM_BLOCK.get()).bucket(() -> ClancyCraftItems.MOLTEN_NUGGETIEM_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_NUGGETIEM_BLOCK = ModBlocks.BLOCKS.register("molten_nuggetiem",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_NUGGETIEM_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> MOLTEN_MAGNITE_FLUID
            = FLUIDS.register("molten_magnite_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_MAGNITE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_MAGNITE_FLOWING
        = FLUIDS.register("molten_magnite_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_MAGNITE_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MOLTEN_MAGNITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_MAGNITE_FLUID.get(), () -> MOLTEN_MAGNITE_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.BUCKET_FILL).overlay(WATER_OVERLAY_RL)
            .color(0xbff40408)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_MAGNITE_BLOCK.get()).bucket(() -> ClancyCraftItems.MOLTEN_MAGNITE_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_MAGNITE_BLOCK = ModBlocks.BLOCKS.register("molten_magnite",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_MAGNITE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> LIQUID_LIGHT_FLUID
            = FLUIDS.register("liquid_light_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_LIGHT_PROPERTIES));

    public static final RegistryObject<FlowingFluid> LIQUID_LIGHT_FLOWING
            = FLUIDS.register("liquid_light_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_LIGHT_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LIQUID_LIGHT_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LIQUID_LIGHT_FLUID.get(), () -> LIQUID_LIGHT_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.BUCKET_FILL).overlay(WATER_OVERLAY_RL)
            .color(0xbff9C9CE)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.LIQUID_LIGHT_BLOCK.get()).bucket(() -> ClancyCraftItems.LIQUID_LIGHT_BUCKET.get());

    public static final RegistryObject<LiquidBlock> LIQUID_LIGHT_BLOCK = ModBlocks.BLOCKS.register("liquid_light",
            () -> new LiquidBlock(() -> ModFluids.LIQUID_LIGHT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> MOLTEN_DARK_METAL_FLUID
            = FLUIDS.register("molten_dark_metal_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_DARK_METAL_PROPERTIES));

    public static final RegistryObject<FlowingFluid>MOLTEN_DARK_METAL_FLOWING
            = FLUIDS.register("molten_dark_metal_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_DARK_METAL_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MOLTEN_DARK_METAL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_DARK_METAL_FLUID.get(), () -> MOLTEN_DARK_METAL_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.BUCKET_FILL).overlay(WATER_OVERLAY_RL)
            .color(0xb9000000)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_DARK_METAL_BLOCK.get()).bucket(() -> ClancyCraftItems.MOLTEN_DARK_METAL_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_DARK_METAL_BLOCK = ModBlocks.BLOCKS.register("molten_dark_metal",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_DARK_METAL_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));


    public static final RegistryObject<FlowingFluid> MOLTEN_LIGHT_METAL_FLUID
            = FLUIDS.register("molten_light_metal_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LIGHT_METAL_PROPERTIES));

    public static final RegistryObject<FlowingFluid>MOLTEN_LIGHT_METAL_FLOWING
            = FLUIDS.register("molten_light_metal_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LIGHT_METAL_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MOLTEN_LIGHT_METAL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_LIGHT_METAL_FLUID.get(), () -> MOLTEN_LIGHT_METAL_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.BUCKET_FILL).overlay(WATER_OVERLAY_RL)
            .color(0xE9589897)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_LIGHT_METAL_BLOCK.get()).bucket(() -> ClancyCraftItems.MOLTEN_LIGHT_METAL_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_LIGHT_METAL_BLOCK = ModBlocks.BLOCKS.register("molten_light_metal",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_LIGHT_METAL_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));









    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
