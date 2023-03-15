package com.clancy.clancycraft.entitys.client.boss.renderer;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.client.boss.model.CerbModel;
import com.clancy.clancycraft.entitys.custom.boss.CerbEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CerbRenderer extends GeoEntityRenderer<CerbEntity> {
    public CerbRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CerbModel());
        this.shadowRadius = 1f;
    }

    @Override
    public ResourceLocation getTextureLocation(CerbEntity instance) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "textures/entity/cerb/cerb.png");
    }

    @Override
    public RenderType getRenderType(CerbEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(3F, 3F, 3F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
