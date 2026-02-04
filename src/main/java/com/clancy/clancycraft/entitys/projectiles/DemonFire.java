package com.clancy.clancycraft.entitys.projectiles;

import com.clancy.clancycraft.entitys.custom.boss.DemonEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;

import java.util.List;

public class DemonFire extends CCThrowable {
    private int explosionPower = 1;
    private int zoneTimer = 80;
    private boolean hasHit;

    public DemonFire(EntityType<? extends DemonFire> type, Level world) {
        super(type, world);
    }

    public DemonFire(EntityType<? extends DemonFire> type, Level world, LivingEntity thrower) {
        super(type, world, thrower);
    }
    @Override
    protected void onHit(HitResult ray) {
        this.setDeltaMovement(0.0D, 0.0D, 0.0D);
        this.hasHit = true;


    }
    @Override
    public void tick() {
        super.tick();

        if (this.hasHit) {
            this.getDeltaMovement().multiply(0.1D, 0.1D, 0.1D);

            this.zoneTimer--;
            makeIceZone();

            if (!level.isClientSide && this.zoneTimer <= 0) {
                level.levelEvent(2001, new BlockPos(this.blockPosition()), Block.getId(Blocks.ICE.defaultBlockState()));
                discard();
            }
        } else {
            makeTrail();
        }
    }


    public void makeTrail() {
        BlockState stateId = Blocks.FIRE.defaultBlockState();
        for (int i = 0; i < 5; i++) {
            double dx = getX() + 1.5F * (random.nextFloat() - 0.5F);
            double dy = getY() + 1.5F * (random.nextFloat() - 0.5F);
            double dz = getZ() + 1.5F * (random.nextFloat() - 0.5F);

            level.addParticle(new BlockParticleOption(ParticleTypes.FALLING_DUST, stateId), dx, dy, dz, -getDeltaMovement().x(), -getDeltaMovement().y(), -getDeltaMovement().z());
        }
    }
    private void hitNearbyEntities() {
        List<LivingEntity> nearby = this.level.getEntitiesOfClass(LivingEntity.class, this.getBoundingBox().inflate(3, 2, 3));

        for (LivingEntity entity : nearby) {
            if (entity != this.getOwner()) {
                if (entity instanceof LivingEntity) {

                    BlockPos pos = new BlockPos(entity.xOld, entity.yOld, entity.zOld);
                    level.setBlockAndUpdate(pos, Blocks.FIRE.defaultBlockState());
                    level.setBlockAndUpdate(pos.above(), Blocks.FIRE.defaultBlockState());
                    entity.hurt(DamageSource.indirectMagic(this,  this.getOwner()),  5);
                    entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 20 * 5));
                    }
                }
            }
        }

    private void makeIceZone() {
        if (this.level.isClientSide) {
            // sparkles
            BlockState stateId = Blocks.FIRE.defaultBlockState();
            for (int i = 0; i < 15; i++) {
                double dx = this.getX() + (random.nextFloat() - random.nextFloat()) * 3.0F;
                double dy = this.getY() + (random.nextFloat() - random.nextFloat()) * 3.0F;
                double dz = this.getZ() + (random.nextFloat() - random.nextFloat()) * 3.0F;

                level.addParticle(new BlockParticleOption(ParticleTypes.FALLING_DUST, stateId), dx, dy, dz, 0, 0, 0);
            }
        } else {
            if (this.zoneTimer % 20 == 0) {
                hitNearbyEntities();
            }
        }
    }
}




