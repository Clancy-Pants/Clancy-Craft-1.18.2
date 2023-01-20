package com.clancy.clancycraft.datagen;

import com.clancy.clancycraft.ClancyCraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

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
        
    }
}
