package com.clancy.clancycraft.util;

import com.clancy.clancycraft.ClancyCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class ModTags {
    public static void init() {
        Blocks.init();
        Fluids.init();
        Items.init();
    }
    public static class Blocks {
        public static void init() {}
        public static final TagKey<Block> PORTAL_FRAME_BLOCKS
                = tag("portal_frame_blocks");

        public static final TagKey<Block> NUGGETIEM = forgeTag("storage_blocks/nuggetiem");

        public static final TagKey<Block> MAGNITE = forgeTag("storage_blocks/magnite");

        public static final TagKey<Block> LIGHT = forgeTag("storage_blocks/light");

        public static final TagKey<Block> DARK = forgeTag("storage_blocks/dark");

        public static final TagKey<Block> LIGHTMETAL = forgeTag("storage_blocks/lightmetal");





        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ClancyCraft.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Fluids {

        public static void init() {}

        private static TagKey<Fluid> create(String name) {
            return FluidTags.create(new ResourceLocation(name));
        }

        // forge tags
        public static final TagKey<Fluid> NUGGETIEM = create("forge:nuggetiem");
        public static final TagKey<Fluid> NUGGETIEM_ = create("clancycraft:nuggetiem");

        public static final TagKey<Fluid> MAGNITE = create("forge:magnite");
        public static final TagKey<Fluid> MAGNITE_ = create("clancycraft:magnite");

        public static final TagKey<Fluid> LIGHT = create("forge:light");
        public static final TagKey<Fluid> LIGHT_ = create("clancycraft:light");

        public static final TagKey<Fluid> DARK = create("forge:dark");
        public static final TagKey<Fluid> DARK_ = create("clancycraft:dark");

        public static final TagKey<Fluid> LIGHTMETAL = create("forge:lightmetal");
        public static final TagKey<Fluid> LIGHTMETAL_ = create("clancycraft:lightmetal");


    }

    public static class Items {

        public static void init() {}

        private static TagKey<Item> create(String name) {return ItemTags.create(new ResourceLocation(name));}

        public static final TagKey<Item> NUGGETIEM_INGOT = create("forge:ingots/nuggetiem");

        public static final TagKey<Item> NUGGETIEM_NUGGET = create("forge:nuggets/nuggetiem");
        public static final TagKey<Item> RAW_NUGGETIEM = create("forge:ores/nuggetiem");

        public static final TagKey<Item> MAGNITE_INGOT = create("forge:ingots/magnite");
        public static final TagKey<Item> MAGNITE_NUGGET = create("forge:nuggets/magnite");
        public static final TagKey<Item> RAW_MAGNITE = create("forge:ores/magnite");

        public static final TagKey<Item> LIGHT_INGOT = create("forge:ingots/light");
        public static final TagKey<Item> LIGHT_NUGGET = create("forge:nuggets/light");
        public static final TagKey<Item> RAW_LIGHT = create("forge:ores/light");

        public static final TagKey<Item> DARK_INGOT = create("forge:ingots/dark");
        public static final TagKey<Item> DARK_NUGGET = create("forge:nuggets/dark");
        public static final TagKey<Item> RAW_DARK = create("forge:ores/dark");

        public static final TagKey<Item> LIGHT_METAL_INGOT = create("forge:ingots/lightmetal");
        public static final TagKey<Item> LIGHT_METAL_NUGGET = create("forge:nuggets/lightmetal");

}
}

