package com.clancy.clancycraft.datagen.tink;

import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;

import javax.annotation.Nonnull;

public class MaterialSpriteProvider extends AbstractMaterialSpriteProvider {

    @Nonnull
    @Override
    public String getName() {
        return "ClancyCraft Material Sprite Provider";
    }

    @Override
    protected void addAllMaterials() {
        buildMaterial(ClancyCraftMaterialsIds.nuggetiem)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack()
                        .addARGB(63, 0xFFDEA618)
                        .addARGB(102, 0xFFC89516).addARGB(140, 0xFFCEA02D)
                        .addARGB(178, 0xFFB48614).addARGB(216, 0xFFBE9A3E)
                        .addARGB(255, 0xFFA27912).build());

        buildMaterial(ClancyCraftMaterialsIds.magnite)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack()
                        .addARGB(63, 0xFF9A031E)
                        .addARGB(102, 0xFFA7261D).addARGB(140, 0xFFBA3E1B)
                        .addARGB(178, 0xFFCF5218).addARGB(216, 0xFFEC751B)
                        .addARGB(255, 0xFFFB8B24).build());

        buildMaterial(ClancyCraftMaterialsIds.light)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack()
                        .addARGB(63, 0xFFA1C8E3)
                        .addARGB(102, 0xFF91B4CC).addARGB(140, 0xFF8FAFC4)
                        .addARGB(178, 0xFF8EAABD).addARGB(216, 0xFF487FA8)
                        .addARGB(255, 0xFF56799C).build());

        buildMaterial(ClancyCraftMaterialsIds.dark)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack()
                        .addARGB(63, 0xFF062F00)
                        .addARGB(102, 0xFF062F00).addARGB(140, 0xFF062F00)
                        .addARGB(178, 0xFF062F00).addARGB(216, 0xFF062F00)
                        .addARGB(255, 0xFF062F00).build());

        buildMaterial(ClancyCraftMaterialsIds.lightmetal)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack()
                        .addARGB(63, 0xFF56799C)
                        .addARGB(102, 0xFF26949C).addARGB(140, 0xFF0F9C86)
                        .addARGB(178, 0xFF049C44).addARGB(216, 0xFF036D2F)
                        .addARGB(255, 0xFF062F00).build());
    }
}
