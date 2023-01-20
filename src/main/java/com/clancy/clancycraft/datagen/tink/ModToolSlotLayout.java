package com.clancy.clancycraft.datagen.tink;

import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractStationSlotLayoutProvider;
import slimeknights.tconstruct.tools.TinkerToolParts;

import javax.annotation.Nonnull;

public class ModToolSlotLayout extends AbstractStationSlotLayoutProvider {

    public ModToolSlotLayout(DataGenerator generator) {
        super(generator);
    }
    @Override
    protected void addLayouts() {
        defineModifiable(ClancyCraftItems.KATANA)
                .sortIndex(SORT_WEAPON)
                .addInputItem(TinkerToolParts.broadBlade.get(), 48, 26)
                .addInputItem(TinkerToolParts.toolHandle, 12, 62)
                .addInputItem(TinkerToolParts.toolHandle, 30, 44)
                .build();


        defineModifiable(ClancyCraftItems.WARHAMMER)
                .sortIndex(SORT_WEAPON)
                .addInputItem(TinkerToolParts.hammerHead.get(), 48, 26)
                .addInputItem(TinkerToolParts.toolBinding, 12, 26)
                .addInputItem(TinkerToolParts.toughHandle, 30, 44)
                .addInputItem(TinkerToolParts.toughHandle,12,62)
                .build();

        defineModifiable(ClancyCraftItems.HALBERD)
                .sortIndex(SORT_WEAPON)
                .addInputItem(TinkerToolParts.hammerHead.get(), 48, 26)
                .addInputItem(TinkerToolParts.broadAxeHead,30,26)
                .addInputItem(TinkerToolParts.toolBinding, 12, 44)
                .addInputItem(TinkerToolParts.toughHandle, 30, 44)
                .addInputItem(TinkerToolParts.toughHandle,12,62)
                .build();

        defineModifiable(ClancyCraftItems.BATTLEAXE)
                .sortIndex(SORT_WEAPON)
                .addInputItem(TinkerToolParts.broadAxeHead.get(), 48, 26)
                .addInputItem(TinkerToolParts.broadAxeHead,30,26)
                .addInputItem(TinkerToolParts.toolBinding, 12, 44)
                .addInputItem(TinkerToolParts.toughHandle, 30, 44)
                .addInputItem(TinkerToolParts.toughHandle,12,62)
                .build();
    }

    @Nonnull
    @Override
    public String getName() {
        return "ClancyCraft Tool Slot Layout";
    }

}
