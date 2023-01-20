package com.clancy.clancycraft.datagen.tink;

import com.clancy.clancycraft.ClancyCraft;
import slimeknights.tconstruct.library.client.data.material.AbstractPartSpriteProvider;

import javax.annotation.Nonnull;

public class ClancyCraftPartSpriteProvider extends AbstractPartSpriteProvider {
    public ClancyCraftPartSpriteProvider() {
        super(ClancyCraft.MOD_ID);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Clancy Craft Parts Generator";
    }

    @Override
    protected void addAllSpites() {

        buildTool("katana").addHandle("guard").addHandle("handle").addHead("blade");
        buildTool("warhammer").addHandle("handle").addHead("blade");
        buildTool("halberd").addHandle("handle").addHead("blade");
        buildTool("battleaxe").addHandle("handle").addHead("blade");
    }
}
