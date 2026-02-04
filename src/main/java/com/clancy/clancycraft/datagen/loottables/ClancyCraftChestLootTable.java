package com.clancy.clancycraft.datagen.loottables;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.data.loot.ChestLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

public class ClancyCraftChestLootTable extends ChestLoot {
    private static final ResourceLocation CERB_CHEST_LOOT =
            new ResourceLocation(ClancyCraft.MOD_ID, "chests/cerb_chest_loot");

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> p_124363_) {
        p_124363_.accept(CERB_CHEST_LOOT, LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2.0F, 8.0F))
                        .add(LootItem.lootTableItem(ClancyCraftItems.RAW_NUGGETIEM.get()).setWeight(15)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))));

    }
}
