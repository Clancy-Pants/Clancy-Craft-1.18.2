package com.clancy.clancycraft.entitys.projectiles;

import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.registries.RegistryObject;

public abstract class CCThrowable extends ThrowableProjectile implements ICCProjectile {

    public CCThrowable(EntityType<? extends CCThrowable> type, Level worldIn) {
        super(type, worldIn);
    }

    public CCThrowable(EntityType<? extends CCThrowable> type, Level worldIn, double x, double y, double z) {
        super(type, x, y, z, worldIn);
    }

    public CCThrowable(EntityType<? extends CCThrowable> type, Level worldIn, LivingEntity throwerIn) {
        super(type, throwerIn, worldIn);
    }



    @Override
    protected void defineSynchedData() {

    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
