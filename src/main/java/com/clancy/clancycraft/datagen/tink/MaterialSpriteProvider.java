package com.clancy.clancycraft.datagen.tink;

import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;

import javax.annotation.Nonnull;

public class MaterialSpriteProvider extends AbstractMaterialSpriteProvider {

    @Nonnull
    @Override
    public String getName() {
        return "ClancyCraft Material Sprite Provider";
    }

    @Override
    protected void addAllMaterials() {}
}
