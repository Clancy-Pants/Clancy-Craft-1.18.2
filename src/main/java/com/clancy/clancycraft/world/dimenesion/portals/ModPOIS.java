package com.clancy.clancycraft.world.dimenesion.portals;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIS {

    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, ClancyCraft.MOD_ID);

    public static final RegistryObject<PoiType> CLANCY_PORTAL =
            POI.register("clancy_portal", () -> new PoiType("clancy_portal",
                    PoiType.getBlockStates(ModBlocks.CLANCY_PORTAL.get()), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
