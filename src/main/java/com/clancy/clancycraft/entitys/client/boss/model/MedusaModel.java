package com.clancy.clancycraft.entitys.client.boss.model;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.custom.boss.DemonEntity;
import com.clancy.clancycraft.entitys.custom.boss.MedusaEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MedusaModel extends AnimatedGeoModel<MedusaEntity> {
    @Override
    public ResourceLocation getModelLocation(MedusaEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "geo/medusa.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MedusaEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "textures/entity/medusa/medusa.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MedusaEntity animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "animations/medusa.json");
    }
}

