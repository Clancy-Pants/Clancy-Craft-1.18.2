package com.clancy.clancycraft.entitys.client.boss.renderer;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.client.boss.model.MinitaurModel;
import com.clancy.clancycraft.entitys.client.boss.model.YetiModel;
import com.clancy.clancycraft.entitys.custom.boss.MinitaurEntity;
import com.clancy.clancycraft.entitys.custom.boss.YetiEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class YetiRenderer extends GeoEntityRenderer<YetiEntity> {
    public YetiRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new YetiModel());
        this.shadowRadius = 1f;
    }

    @Override
    public ResourceLocation getTextureLocation(YetiEntity instance) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "textures/entity/yeti/yeti_texture.png");
    }

    @Override
    public RenderType getRenderType(YetiEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
