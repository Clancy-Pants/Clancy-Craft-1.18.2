package com.clancy.clancycraft.world.biome;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class TestBiome {
    public static final ResourceKey<Biome> TEST_BIOME = ResourceKey.create(Registry.BIOME_REGISTRY,
            new ResourceLocation("clancycraft", "test_biome"));

    public static void registerBiomes() {
        BiomeDictionary.addTypes(TEST_BIOME, BiomeDictionary.Type.FOREST);
        BiomeManager.addAdditionalOverworldBiomes(TEST_BIOME);
    }


}

