package com.clancy.clancycraft.datagen;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.util.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static com.clancy.clancycraft.util.ModTags.Blocks.*;

public class ClancyCraftBlockTags extends BlockTagsProvider {

    private static TagKey<Block> create(String name) {
        return BlockTags.create(new ResourceLocation(name));
    }

    public ClancyCraftBlockTags(DataGenerator gen, @Nullable ExistingFileHelper existingFileHelper) {
        super(gen, ClancyCraft.MOD_ID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {
        tag(PORTAL_FRAME_BLOCKS).add(ModBlocks.CITRINE_BLOCK.get());
        tag(NUGGETIEM).add(ModBlocks.NUGGETIEM_BLOCK.get());
        tag(MAGNITE).add(ModBlocks.MAGNITE_BLOCK.get());
        tag(LIGHT).add(ModBlocks.LIGHT_BLOCK.get());
        tag(DARK).add(ModBlocks.BLACK_METAL_BLOCK.get());
        tag(LIGHTMETAL).add(ModBlocks.LIGHT_METAL_BLOCK.get());



        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(
                        ModBlocks.NUGGETIEM_BLOCK.get(),
                        ModBlocks.MAGNITE_BLOCK.get(),
                        ModBlocks.LIGHT_BLOCK.get(),
                        ModBlocks.BLACK_METAL_BLOCK.get(),
                        ModBlocks.LIGHT_METAL_BLOCK.get()
                        );
        
    }
}
