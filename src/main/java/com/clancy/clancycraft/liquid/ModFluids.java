package com.clancy.clancycraft.liquid;

import com.clancy.clancycraft.ClancyCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import org.jetbrains.annotations.NotNull;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.object.FluidObject;

public class ModFluids {
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(ClancyCraft.MOD_ID);

    public static FluidObject<ForgeFlowingFluid> nuggetiem = register("nuggetiem", 1000);

    public static FluidObject<ForgeFlowingFluid> magnite = register("magnite", 1000);

    public static FluidObject<ForgeFlowingFluid> light = register("light", 1000);

    public static FluidObject<ForgeFlowingFluid> dark = register("dark", 1000);

    public static FluidObject<ForgeFlowingFluid> lightmetal = register("lightmetal", 1000);

    public static FluidObject<ForgeFlowingFluid> liquid_coal = register("liquid_coal", 1300);

    private static @NotNull FluidObject<ForgeFlowingFluid> register(String name, int temp) {
        String still = String.format("%s:block/fluid/%s/still", ClancyCraft.MOD_ID, name);
        String flow = String.format("%s:block/fluid/%s/flowing", ClancyCraft.MOD_ID, name);
        return FLUIDS.register(name, FluidAttributes.builder(new ResourceLocation(still),
                new ResourceLocation(flow)).density(2000).viscosity(10000).temperature(temp)
                .sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA), Material.LAVA, 15);
    }
}
