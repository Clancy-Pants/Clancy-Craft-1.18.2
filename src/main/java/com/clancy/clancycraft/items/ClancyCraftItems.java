package com.clancy.clancycraft.items;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.custom.PortalLighter;
import com.clancy.clancycraft.liquid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ClancyCraftItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ClancyCraft.MOD_ID);
//portal stuff
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", PortalLighter::new);


    //Ingots
    public static final RegistryObject<Item> NUGGETIEM_INGOT = ITEMS.register("nuggetiem_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> MAGNITE_INGOT = ITEMS.register("magnite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> BAR_OF_LIGHT = ITEMS.register("bar_of_light",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> DARK_METAL_INGOT = ITEMS.register("dark_metal_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> LIGHT_METAL_INGOT = ITEMS.register("light_metal_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    //Nuggets

    public static final RegistryObject<Item> NUGGETIEM_NUGGET = ITEMS.register("nuggetiem_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> MAGNITE_NUGGET = ITEMS.register("magnite_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> LIGHT_NUGGET = ITEMS.register("light_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> DARK_METAL_NUGGET = ITEMS.register("dark_metal_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> LIGHT_METAL_NUGGET = ITEMS.register("light_metal_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    //Molten Metal
    public static final RegistryObject<Item> MOLTEN_NUGGETIEM_BUCKET = ITEMS.register("molten_nuggetiem_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_NUGGETIEM_FLUID,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_MAGNITE_BUCKET = ITEMS.register("molten_magnite_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_MAGNITE_FLUID,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB).stacksTo(1)));

    public static final RegistryObject<Item> LIQUID_LIGHT_BUCKET = ITEMS.register("liquid_light_bucket",
            () -> new BucketItem(ModFluids.LIQUID_LIGHT_FLUID,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_DARK_METAL_BUCKET = ITEMS.register("molten_dark_metal_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_DARK_METAL_FLUID,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_LIGHT_METAL_BUCKET = ITEMS.register("molten_light_metal_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_LIGHT_METAL_FLUID,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB).stacksTo(1)));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
