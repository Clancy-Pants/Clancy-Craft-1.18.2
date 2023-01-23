package com.clancy.clancycraft.datagen.tink;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;

import javax.annotation.Nonnull;

public class ClancyCraftRenderInfo extends AbstractMaterialRenderInfoProvider {

    public ClancyCraftRenderInfo(DataGenerator gen, AbstractMaterialSpriteProvider spriteProvider) {
        super(gen, spriteProvider);
    }

    @Override
    protected void addMaterialRenderInfo() {
        buildRenderInfo(ClancyCraftMaterialsIds.nuggetiem).color(0xDEA618).fallbacks("metal");
        buildRenderInfo(ClancyCraftMaterialsIds.magnite).color(0xFB8B24).fallbacks("metal");
        buildRenderInfo(ClancyCraftMaterialsIds.light).color(0xA1C8E3).fallbacks("metal");
        buildRenderInfo(ClancyCraftMaterialsIds.dark).color(0xFB8B24).fallbacks("metal");
        buildRenderInfo(ClancyCraftMaterialsIds.lightmetal).color(0xFB8B24).fallbacks("metal");
    }
    @Nonnull
    @Override
    public String getName() {
        return "ClancyCraft Render info provider!";
    }
}

