package com.clancy.clancycraft.armour.custom;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.custom.armor.BlackMetalArmorItem;
import com.clancy.clancycraft.items.custom.armor.LightArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackMetalArmor extends AnimatedGeoModel<BlackMetalArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BlackMetalArmorItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"geo/black_metal_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BlackMetalArmorItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"textures/models/armor/black_metal_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BlackMetalArmorItem animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"animations/armor_animations.json");
    }


    }

