package com.clancy.clancycraft.world.biome;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class ModSurfaceRuleData {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource BASALT = makeStateRule(Blocks.BASALT);
    private static final SurfaceRules.RuleSource SNOW = makeStateRule(Blocks.SNOW_BLOCK);
    private static final SurfaceRules.RuleSource COARSE_DIRT = makeStateRule(Blocks.COARSE_DIRT);
    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);



    public static SurfaceRules.RuleSource makeRules()
    {   SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);


        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);
        SurfaceRules.RuleSource basaltSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel,BASALT),STONE);
        SurfaceRules.RuleSource snowSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel,SNOW),STONE);
        SurfaceRules.RuleSource coarseSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel,COARSE_DIRT),STONE);


        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeRegistry.VOLCANIC_WASTELANDS),SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,basaltSurface)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeRegistry.ARTIC), SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,snowSurface)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeRegistry.INFESTED_PLAINS),SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,coarseSurface)),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)


        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}


