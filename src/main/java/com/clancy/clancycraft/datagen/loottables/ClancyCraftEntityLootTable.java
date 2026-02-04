package com.clancy.clancycraft.datagen.loottables;

import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.entitys.ModEntityTypes;
import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.HashSet;
import java.util.Set;

public class ClancyCraftEntityLootTable extends net.minecraft.data.loot.EntityLoot {

    private final Set<EntityType<?>> knownEntities = new HashSet<>();

    @Override
    protected void add(EntityType<?> entity, LootTable.Builder builder) {
        super.add(entity, builder);
        knownEntities.add(entity);
    }

    @Override
    protected void add(ResourceLocation id, LootTable.Builder table) {
        super.add(id, table);
    }

    @Override
    protected void addTables() {
        add(ModEntityTypes.CERB.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModBlocks.CITRINE_BLOCK.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(10)))
                                .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0, 1))))

                        .withPool(LootPool.lootPool().setRolls(UniformGenerator.between(5.0F, 10.0F))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_NUGGETIEM.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_IRON).setWeight(20)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_GOLD).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 7.0F))))
                                .add(LootItem.lootTableItem(Items.GOLDEN_APPLE).setWeight(5)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(5.0F, 10.0F))))
                                .add(LootItem.lootTableItem(Items.ANCIENT_DEBRIS).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(5.0F, 10.0F))))));



        add(ModEntityTypes.MINITAUR.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(14))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_NUGGETIEM.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_MAGNITE.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_IRON).setWeight(20)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_GOLD).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))
                                .add(LootItem.lootTableItem(Items.GOLDEN_APPLE).setWeight(5)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(5.0F, 10.0F))))
                                .add(LootItem.lootTableItem(Items.ANCIENT_DEBRIS).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(5.0F, 10.0F))))
                                .add(LootItem.lootTableItem(Items.COAL).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))));



        add(ModEntityTypes.DEMON.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(14))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_NUGGETIEM.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.LIGHT_SHARDS.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_MAGNITE.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_IRON).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_GOLD).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))
                                .add(LootItem.lootTableItem(Items.GOLDEN_APPLE).setWeight(5)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(5.0F, 10.0F))))
                                .add(LootItem.lootTableItem(Items.BLAZE_ROD).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))));



        add(ModEntityTypes.MEDUSA.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(16))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_NUGGETIEM.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_BLACK_METAL.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.LIGHT_SHARDS.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_MAGNITE.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_IRON).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_GOLD).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))
                                .add(LootItem.lootTableItem(Items.GOLDEN_APPLE).setWeight(5)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(5.0F, 10.0F))))
                                .add(LootItem.lootTableItem(Items.BLAZE_ROD).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))));



        add(ModEntityTypes.YETI.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(16))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_NUGGETIEM.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.LIGHT_METAL_INGOT.get()).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_BLACK_METAL.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.LIGHT_SHARDS.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(ClancyCraftItems.RAW_MAGNITE.get()).setWeight(15)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_IRON).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))
                                .add(LootItem.lootTableItem(Items.RAW_GOLD).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))
                                .add(LootItem.lootTableItem(Items.GOLDEN_APPLE).setWeight(5)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(5.0F, 10.0F))))
                                .add(LootItem.lootTableItem(Items.BLAZE_ROD).setWeight(10)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(32.0F, 64.0F))))));


    }

    public LootTable.Builder emptyLootTable() {
        return LootTable.lootTable();
    }

    public LootTable.Builder fromEntityLootTable(EntityType<?> parent) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootTableReference.lootTableReference(parent.getDefaultLootTable())));
    }

    private static LootTable.Builder sheepLootTableBuilderWithDrop(ItemLike wool) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(wool))).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(LootTableReference.lootTableReference(EntityType.SHEEP.getDefaultLootTable())));
    }

    @Override
    public Set<EntityType<?>> getKnownEntities() {
        return knownEntities;
    }
}
