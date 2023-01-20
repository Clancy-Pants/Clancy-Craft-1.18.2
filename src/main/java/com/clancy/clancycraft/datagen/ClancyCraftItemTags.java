package com.clancy.clancycraft.datagen;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import slimeknights.tconstruct.common.TinkerTags;
import slimeknights.tconstruct.common.data.tags.ItemTagProvider;

import javax.annotation.Nullable;


public class ClancyCraftItemTags extends ItemTagProvider {
    private static TagKey<Item> create(String name) {
        return ItemTags.create(new ResourceLocation(name));
    }

    public ClancyCraftItemTags(DataGenerator gen, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(gen, blockTagsProvider,  existingFileHelper);
    }


    @Override
    protected void addTags() {

        tag(TinkerTags.Items.MODIFIABLE).add(ClancyCraftItems.KATANA.get());
        tag(TinkerTags.Items.MELEE).add(ClancyCraftItems.KATANA.get());
        tag(TinkerTags.Items.MODIFIABLE).add(ClancyCraftItems.WARHAMMER.get());
        tag(TinkerTags.Items.MELEE).add(ClancyCraftItems.WARHAMMER.get());
        tag(TinkerTags.Items.MODIFIABLE).add(ClancyCraftItems.HALBERD.get());
        tag(TinkerTags.Items.MELEE).add(ClancyCraftItems.HALBERD.get());
    }
}
