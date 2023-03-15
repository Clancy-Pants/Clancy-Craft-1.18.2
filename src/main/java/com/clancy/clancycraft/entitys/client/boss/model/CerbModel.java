package com.clancy.clancycraft.entitys.client.boss.model;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.custom.boss.CerbEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CerbModel extends AnimatedGeoModel<CerbEntity> {
    @Override
    public ResourceLocation getModelLocation(CerbEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "geo/cerb.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CerbEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "textures/entity/cerb/cerb.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CerbEntity animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "animations/cerb.json");
    }
}

