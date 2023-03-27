package com.clancy.clancycraft.datagen.tags;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.util.ModTags;
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
        tag(ModTags.Items.RAW_NUGGETIEM).add(ClancyCraftItems.RAW_NUGGETIEM.get());
        tag(ModTags.Items.NUGGETIEM_INGOT).add(ClancyCraftItems.NUGGETIEM_INGOT.get());
        tag(ModTags.Items.NUGGETIEM_NUGGET).add(ClancyCraftItems.NUGGETIEM_NUGGET.get());


        tag(ModTags.Items.RAW_MAGNITE).add(ClancyCraftItems.RAW_MAGNITE.get());
        tag(ModTags.Items.MAGNITE_INGOT).add(ClancyCraftItems.MAGNITE_INGOT.get());
        tag(ModTags.Items.MAGNITE_NUGGET).add(ClancyCraftItems.MAGNITE_NUGGET.get());


        tag(ModTags.Items.RAW_LIGHT).add(ClancyCraftItems.LIGHT_SHARDS.get());
        tag(ModTags.Items.LIGHT_INGOT).add(ClancyCraftItems.BAR_OF_LIGHT.get());
        tag(ModTags.Items.LIGHT_NUGGET).add(ClancyCraftItems.LIGHT_NUGGET.get());


        tag(ModTags.Items.RAW_DARK).add(ClancyCraftItems.RAW_BLACK_METAL.get());
        tag(ModTags.Items.DARK_INGOT).add(ClancyCraftItems.DARK_METAL_INGOT.get());
        tag(ModTags.Items.DARK_NUGGET).add(ClancyCraftItems.DARK_METAL_NUGGET.get());


        tag(ModTags.Items.LIGHT_METAL_INGOT).add(ClancyCraftItems.LIGHT_METAL_INGOT.get());
        tag(ModTags.Items.LIGHT_METAL_NUGGET).add(ClancyCraftItems.LIGHT_METAL_NUGGET.get());


        tag(TinkerTags.Items.MODIFIABLE).add(ClancyCraftItems.KATANA.get());
        tag(TinkerTags.Items.MELEE).add(ClancyCraftItems.KATANA.get());
        tag(TinkerTags.Items.MODIFIABLE).add(ClancyCraftItems.WARHAMMER.get());
        tag(TinkerTags.Items.MELEE).add(ClancyCraftItems.WARHAMMER.get());
        tag(TinkerTags.Items.MODIFIABLE).add(ClancyCraftItems.HALBERD.get());
        tag(TinkerTags.Items.MELEE).add(ClancyCraftItems.HALBERD.get());
    }
}
