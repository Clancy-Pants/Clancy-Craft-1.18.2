package com.clancy.clancycraft.datagen.tink;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;

import javax.annotation.Nonnull;

public class ClancyCraftMaterials extends AbstractMaterialDataProvider {

    public ClancyCraftMaterials(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void addMaterials() {

        addMaterial(ClancyCraftMaterialsIds.nuggetiem, 4, ORDER_GENERAL, true);
        addMaterial(ClancyCraftMaterialsIds.magnite, 5, ORDER_GENERAL, true);
        addMaterial(ClancyCraftMaterialsIds.light, 6, ORDER_GENERAL, true);
        addMaterial(ClancyCraftMaterialsIds.dark, 7, ORDER_GENERAL, true);
        addMaterial(ClancyCraftMaterialsIds.lightmetal, 8, ORDER_GENERAL, true);
}

    @Nonnull
    @Override
    public String getName() {
        return "ClancCraft Materials";
    }

}
