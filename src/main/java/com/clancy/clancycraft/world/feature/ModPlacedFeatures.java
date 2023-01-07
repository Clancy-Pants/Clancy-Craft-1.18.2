package com.clancy.clancycraft.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> RAINBOW_PLACED = PlacementUtils.register("rainbow_placed",
        ModConfigredFeatures.RAINBOW_SPAWN, VegetationPlacements.treePlacement(
                PlacementUtils.countExtra(3, 0.1f, 2)));

//ores
    public static final Holder<PlacedFeature> NUGGETIEM_ORE_PLACED = PlacementUtils.register("nuggetiem_ore_placed",
            ModConfigredFeatures.NUGGETIEM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> MAGNITE_ORE_PLACED = PlacementUtils.register("magnite_ore_placed",
            ModConfigredFeatures.MAGNITE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> SHARDS_ORE_PLACED = PlacementUtils.register("shards_ore_placed",
            ModConfigredFeatures.SHARD_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> BLACK_ORE_PLACED = PlacementUtils.register("black_ore_placed",
            ModConfigredFeatures.BLACK_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}

