package com.clancy.clancycraft.armour.custom;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.custom.armor.BlackMetalArmorItem;
import com.clancy.clancycraft.items.custom.armor.LightMetalArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightMetalArmor extends AnimatedGeoModel<LightMetalArmorItem> {
    @Override
    public ResourceLocation getModelLocation(LightMetalArmorItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"geo/light_metal_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LightMetalArmorItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"textures/models/armor/light_metal_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LightMetalArmorItem animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"animations/armor_animations.json");
    }


    }

