package com.clancy.clancycraft.world.biome;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRuleData {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource BASALT = makeStateRule(Blocks.BASALT);
    private static final SurfaceRules.RuleSource SNOW = makeStateRule(Blocks.SNOW_BLOCK);
    private static final SurfaceRules.RuleSource COARSE_DIRT = makeStateRule(Blocks.COARSE_DIRT);


    public static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeRegistry.VOLCANIC_WASTELANDS), BASALT),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeRegistry.RAINBOW_FORREST), GRASS_BLOCK),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeRegistry.ARTIC), SNOW),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeRegistry.DARK_JUNGLE), GRASS_BLOCK),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeRegistry.INFESTED_PLAINS), COARSE_DIRT),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}


