package com.clancy.clancycraft.events;


import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.armour.custom.NuggetiemArmourRenderer;
import com.clancy.clancycraft.items.custom.armor.NuggetiemArmourItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = ClancyCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(NuggetiemArmourItem.class, new NuggetiemArmourRenderer());
    }
}
