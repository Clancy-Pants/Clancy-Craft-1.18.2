package com.clancy.clancycraft.events;


import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.liquid.ModFluids;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ClancyCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FluidEvents {
    @SubscribeEvent
    static void onFurnaceFuel(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().getItem() == ModFluids.liquid_coal.asItem()) {
            // 150% efficiency compared to lava bucket, compare to casting blaze rods, which cast into 120%
            event.setBurnTime(30000);
        }
    }
}