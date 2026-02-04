package com.clancy.clancycraft.entitys.client.boss.model;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.custom.boss.YetiEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YetiModel extends AnimatedGeoModel<YetiEntity> {
    @Override
    public ResourceLocation getModelLocation(YetiEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "geo/yeti.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(YetiEntity object) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "textures/entity/yeti/yeti.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(YetiEntity animatable) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "animations/yeti.json");
    }
}

