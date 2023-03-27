package com.clancy.clancycraft.datagen.loottables;

import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ClancyCraftBlockLootTable extends BlockLoot {

    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] { 0.05F, 0.0625F, 0.083333336F, 0.1F };

    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.CITRINE_BLOCK.get());

        //metal blocks
        this.dropSelf(ModBlocks.NUGGETIEM_BLOCK.get());
        this.dropSelf(ModBlocks.MAGNITE_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_BLOCK.get());
        this.dropSelf(ModBlocks.BLACK_METAL_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_METAL_BLOCK.get());


        //Rainbow tree
        this.dropSelf(ModBlocks.RAINBOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_RAINBOW_LOG.get());
        this.dropSelf(ModBlocks.RAINBOW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_RAINBOW_WOOD.get());
        this.dropSelf(ModBlocks.RAINBOW_SAPLING.get());
        this.dropSelf(ModBlocks.RAINBOW_PLANKS.get());
        this.add(ModBlocks.RAINBOW_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.RAINBOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));


        //ore drops

        this.add(ModBlocks.NUGGETIEM_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NUGGETIEM_ORE.get(), ClancyCraftItems.RAW_NUGGETIEM.get()));
        this.add(ModBlocks.MAGNITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.MAGNITE_ORE.get(), ClancyCraftItems.RAW_MAGNITE.get()));
        this.add(ModBlocks.SHARDS_OF_LIGHT.get(),
                (block) -> createOreDrop(ModBlocks.SHARDS_OF_LIGHT.get(), ClancyCraftItems.LIGHT_SHARDS.get()));
        this.add(ModBlocks.BLACK_METAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BLACK_METAL_ORE.get(), ClancyCraftItems.RAW_BLACK_METAL.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
