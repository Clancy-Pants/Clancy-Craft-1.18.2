package com.clancy.clancycraft.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CLANCY_TAB = new CreativeModeTab("clancytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ClancyCraftItems.CITRINE.get());
        }
    };
}
