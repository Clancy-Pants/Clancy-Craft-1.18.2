package com.clancy.clancycraft.world.biome;

import com.clancy.clancycraft.ClancyCraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeRegistry {

    public static final ResourceKey<Biome> VOLCANIC_WASTELANDS = register("volcanic_wasteland");
    public static final ResourceKey<Biome> RAINBOW_FORREST = register("rainbow_forrest");
    public static final ResourceKey<Biome> ARTIC = register("artic");
    public static final ResourceKey<Biome> DARK_JUNGLE = register("dark_jungle");
    public static final ResourceKey<Biome> INFESTED_PLAINS = register("infested_plains");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ClancyCraft.MOD_ID, name));
    }
}
