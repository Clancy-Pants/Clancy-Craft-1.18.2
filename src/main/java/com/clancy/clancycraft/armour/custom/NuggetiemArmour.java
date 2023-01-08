package com.clancy.clancycraft.armour.custom;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.custom.armor.NuggetiemArmourItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NuggetiemArmour extends AnimatedGeoModel<NuggetiemArmourItem> {
    @Override
    public ResourceLocation getModelLocation(NuggetiemArmourItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"geo/nuggetiem_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(NuggetiemArmourItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"textures/models/armor/nuggetiem_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(NuggetiemArmourItem animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"animations/armor_animations.json");
    }
}
