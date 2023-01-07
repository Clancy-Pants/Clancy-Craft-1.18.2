package com.clancy.clancycraft.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> RAINBOW_PLACED = PlacementUtils.register("rainbow_placed",
        ModConfigredFeatures.RAINBOW_SPAWN, VegetationPlacements.treePlacement(
                PlacementUtils.countExtra(3, 0.1f, 2)));
}
