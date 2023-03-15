package com.clancy.clancycraft.events;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.ModEntityTypes;
import com.clancy.clancycraft.entitys.custom.boss.CerbEntity;
import com.clancy.clancycraft.entitys.custom.boss.DemonEntity;
import com.clancy.clancycraft.entitys.custom.boss.MedusaEntity;
import com.clancy.clancycraft.entitys.custom.boss.MinitaurEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ClancyCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.CERB.get(), CerbEntity.setAttributes());
        event.put(ModEntityTypes.MINITAUR.get(), MinitaurEntity.setAttributes());
        event.put(ModEntityTypes.DEMON.get(), DemonEntity.setAttributes());
        event.put(ModEntityTypes.MEDUSA.get(), MedusaEntity.setAttributes());
        event.put(ModEntityTypes.YETI.get(), MedusaEntity.setAttributes());
    }

}
