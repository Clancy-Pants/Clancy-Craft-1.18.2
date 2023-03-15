package com.clancy.clancycraft.entitys.client.boss.renderer;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.client.boss.model.DemonModel;
import com.clancy.clancycraft.entitys.client.boss.model.MedusaModel;
import com.clancy.clancycraft.entitys.custom.boss.DemonEntity;
import com.clancy.clancycraft.entitys.custom.boss.MedusaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MedusaRenderer extends GeoEntityRenderer<MedusaEntity> {
    public MedusaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MedusaModel());
        this.shadowRadius = 1f;
    }

    @Override
    public ResourceLocation getTextureLocation(MedusaEntity instance) {
        return new ResourceLocation(ClancyCraft.MOD_ID, "textures/entity/medusa/medusa.png");
    }

    @Override
    public RenderType getRenderType(MedusaEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
