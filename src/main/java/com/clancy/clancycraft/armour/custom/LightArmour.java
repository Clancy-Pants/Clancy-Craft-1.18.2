package com.clancy.clancycraft.armour.custom;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.custom.armor.LightArmorItem;
import com.clancy.clancycraft.items.custom.armor.MagniteArmourItem;
import com.clancy.clancycraft.items.custom.armor.NuggetiemArmourItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LightArmour extends AnimatedGeoModel<LightArmorItem> {
    @Override
    public ResourceLocation getModelLocation(LightArmorItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"geo/light_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LightArmorItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"textures/models/armor/light_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LightArmorItem animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"animations/armor_animations.json");
    }


    }

