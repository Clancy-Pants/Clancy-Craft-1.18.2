package com.clancy.clancycraft.armour.custom;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.custom.armor.MagniteArmourItem;
import com.clancy.clancycraft.items.custom.armor.NuggetiemArmourItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MagniteArmour extends AnimatedGeoModel<MagniteArmourItem> {
    @Override
    public ResourceLocation getModelLocation(MagniteArmourItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"geo/magnite_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MagniteArmourItem object) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"textures/models/armor/magnite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MagniteArmourItem animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID,"animations/magnite_wings_idle.json");
    }


        }

