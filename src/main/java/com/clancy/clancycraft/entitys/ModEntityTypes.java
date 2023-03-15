package com.clancy.clancycraft.entitys;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.custom.boss.*;
import com.clancy.clancycraft.entitys.projectiles.DemonFire;
import com.clancy.clancycraft.entitys.projectiles.PoisonArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, ClancyCraft.MOD_ID);

    public static final RegistryObject<EntityType<CerbEntity>> CERB =
            ENTITY_TYPES.register("cerb",
                    () -> EntityType.Builder.of(CerbEntity::new, MobCategory.MONSTER)
                            .sized(3f, 3f)
                            .build(new ResourceLocation(ClancyCraft.MOD_ID, "cerb").toString()));

    public static final RegistryObject<EntityType<MinitaurEntity>> MINITAUR =
            ENTITY_TYPES.register("minitaur",
                    () -> EntityType.Builder.of(MinitaurEntity::new, MobCategory.MONSTER)
                            .sized(1f, 2f)
                            .build(new ResourceLocation(ClancyCraft.MOD_ID, "minitaur").toString()));

    public static final RegistryObject<EntityType<DemonEntity>> DEMON =
            ENTITY_TYPES.register("demon",
                    () -> EntityType.Builder.of(DemonEntity::new, MobCategory.MONSTER)
                            .sized(1f, 2f)
                            .build(new ResourceLocation(ClancyCraft.MOD_ID, "demon").toString()));

    public static final RegistryObject<EntityType<MedusaEntity>> MEDUSA =
            ENTITY_TYPES.register("medusa",
                    () -> EntityType.Builder.of(MedusaEntity::new, MobCategory.MONSTER)
                            .sized(1f, 2f)
                            .build(new ResourceLocation(ClancyCraft.MOD_ID, "medusa").toString()));

    public static final RegistryObject<EntityType<YetiEntity>> YETI =
            ENTITY_TYPES.register("yeti",
                    () -> EntityType.Builder.of(YetiEntity::new, MobCategory.MONSTER)
                            .sized(1f, 2f)
                            .build(new ResourceLocation(ClancyCraft.MOD_ID, "yeti").toString()));









    public static final RegistryObject<EntityType<DemonFire>> DEMON_FIRE = build(ProjectileNames.DEMON_FIRE,
            makeCastedBuilder(DemonFire.class, DemonFire::new, 1.0F, 1.0F, 80, 2), true);

    public static final RegistryObject<EntityType<PoisonArrow>> POISON_ARROW = build(ProjectileNames.POISON_ARROW,
            makeCastedBuilder(PoisonArrow.class, PoisonArrow::new, 1.0F, 1.0F, 80, 2), true);









    private static <E extends Entity> RegistryObject<EntityType<E>> build(ResourceLocation id, EntityType.Builder<E> builder, boolean fireProof) {
        return build(id, builder, fireProof, 0, 0);
    }

    @SuppressWarnings("unchecked")
    private static <E extends Entity> RegistryObject<EntityType<E>> build(ResourceLocation id, EntityType.Builder<E> builder, boolean fireproof, int primary, int secondary) {
        if (fireproof) builder.fireImmune();
        RegistryObject<EntityType<E>> ret = ENTITY_TYPES.register(id.getPath(), () -> builder.build(id.toString()));

        return ret;
    }
    private static <E extends Entity> EntityType.Builder<E> makeCastedBuilder(@SuppressWarnings("unused") Class<E> cast, EntityType.EntityFactory<E> factory, float width, float height, int range, int interval) {
        return makeBuilder(factory, MobCategory.MISC, width, height, range, interval);
    }

    private static <E extends Entity> EntityType.Builder<E> makeBuilder(EntityType.EntityFactory<E> factory, MobCategory classification, float width, float height, int range, int interval) {
        return EntityType.Builder.of(factory, classification).
                sized(width, height).
                setTrackingRange(range).
                setUpdateInterval(interval).
                setShouldReceiveVelocityUpdates(true);
    }
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
