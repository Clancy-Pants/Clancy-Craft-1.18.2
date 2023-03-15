package com.clancy.clancycraft.entitys.client.boss.model;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.custom.boss.CerbEntity;
import com.clancy.clancycraft.entitys.custom.boss.MinitaurEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MinitaurModel extends AnimatedGeoModel<MinitaurEntity> {
    @Override
    public ResourceLocation getModelLocation(MinitaurEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "geo/minitaur.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MinitaurEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "textures/entity/minitaur/minitaur.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MinitaurEntity animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "animations/minitaur.json");
    }
}

