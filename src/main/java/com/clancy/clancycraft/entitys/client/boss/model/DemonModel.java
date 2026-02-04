package com.clancy.clancycraft.entitys.client.boss.model;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.custom.boss.DemonEntity;
import com.clancy.clancycraft.entitys.custom.boss.MinitaurEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DemonModel extends AnimatedGeoModel<DemonEntity> {
    @Override
    public ResourceLocation getModelLocation(DemonEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "geo/demon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DemonEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "textures/entity/demon/demon_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DemonEntity animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "animations/demon.json");
    }
}

