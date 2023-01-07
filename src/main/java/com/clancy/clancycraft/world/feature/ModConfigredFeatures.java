package com.clancy.clancycraft.world.feature;

import com.clancy.clancycraft.blocks.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfigredFeatures {

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> RAINBOW_TREE =
            FeatureUtils.register("rainbow", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.RAINBOW_LOG.get()),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(ModBlocks.RAINBOW_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> RAINBOW_CHECKED = PlacementUtils.register("rainbow_checked", RAINBOW_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.RAINBOW_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> RAINBOW_SPAWN =
            FeatureUtils.register("rainbow_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(RAINBOW_CHECKED,
                            0.5F)), RAINBOW_CHECKED));
    public static void addRainbowTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.RAINBOW_PLACED);
}

//Ore Features


    public static final List<OreConfiguration.TargetBlockState> NUGGETIEM_WORLD_GEN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.NUGGETIEM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.NUGGETIEM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NUGGETIEM_ORE = FeatureUtils.register("nuggetiem_ore",
            Feature.ORE, new OreConfiguration(NUGGETIEM_WORLD_GEN, 9));
    public static void addNuggetiemOre(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.NUGGETIEM_ORE_PLACED);
    }


    public static final List<OreConfiguration.TargetBlockState> MAGNITE_WORLD_GEN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MAGNITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MAGNITE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MAGNITE_ORE = FeatureUtils.register("magnite_ore",
            Feature.ORE, new OreConfiguration(MAGNITE_WORLD_GEN, 9));
    public static void addMagniteOre(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.MAGNITE_ORE_PLACED);
    }


    public static final List<OreConfiguration.TargetBlockState> SHARDS_WORLD_GEN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SHARDS_OF_LIGHT.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.SHARDS_OF_LIGHT.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SHARD_ORE = FeatureUtils.register("shards_ore",
            Feature.ORE, new OreConfiguration(SHARDS_WORLD_GEN, 9));
    public static void addShardsOre(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SHARDS_ORE_PLACED);
    }



    public static final List<OreConfiguration.TargetBlockState> BLACK_WORLD_GEN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLACK_METAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.BLACK_METAL_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLACK_ORE = FeatureUtils.register("black_ore",
            Feature.ORE, new OreConfiguration(SHARDS_WORLD_GEN, 9));
    public static void addBlackOre(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.BLACK_ORE_PLACED);
    }






}
