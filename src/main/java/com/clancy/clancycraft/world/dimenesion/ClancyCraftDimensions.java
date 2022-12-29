package com.clancy.clancycraft.world.dimenesion;

import com.clancy.clancycraft.ClancyCraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ClancyCraftDimensions {

    public static final ResourceKey<Level> CLANCY_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(ClancyCraft.MOD_ID, "clancy"));
    public static final ResourceKey<DimensionType> CLANCY_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, CLANCY_KEY.getRegistryName());

    public static void register() {
        System.out.println("Registering ModDimensions for " + ClancyCraft.MOD_ID);
    }
}
