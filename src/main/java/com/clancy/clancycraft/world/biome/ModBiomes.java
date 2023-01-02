package com.clancy.clancycraft.world.biome;

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes
{
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event)
    {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registry.register(DimensionBiomes.volcanic_wastelands().setRegistryName(ModBiomeRegistry.VOLCANIC_WASTELANDS.location()));
        registry.register(DimensionBiomes.rainbow_forrest().setRegistryName(ModBiomeRegistry.RAINBOW_FORREST.location()));
        registry.register(DimensionBiomes.artic().setRegistryName(ModBiomeRegistry.ARTIC.location()));
        registry.register(DimensionBiomes.dark_jungle().setRegistryName(ModBiomeRegistry.DARK_JUNGLE.location()));
        registry.register(DimensionBiomes.infested_plains().setRegistryName(ModBiomeRegistry.INFESTED_PLAINS.location()));
    }
}

