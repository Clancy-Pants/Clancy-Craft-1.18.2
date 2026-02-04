package com.clancy.clancycraft.items;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.entitys.ModEntityTypes;
import com.clancy.clancycraft.init.ModToolDefinitions;
import com.clancy.clancycraft.items.custom.PortalLighter;
import com.clancy.clancycraft.items.custom.armor.*;
import com.clancy.clancycraft.items.custom.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.tconstruct.library.tools.item.ModifiableItem;

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




    //raw metals



    public static final RegistryObject<Item> RAW_BLACK_METAL = ITEMS.register("raw_black_metal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> LIGHT_SHARDS = ITEMS.register("light_shards",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> RAW_NUGGETIEM = ITEMS.register("raw_nuggetiem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> RAW_MAGNITE = ITEMS.register("raw_magnite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    // ARMOR SETS
    public static final RegistryObject<Item> NUGGETIEM_HELMET = ITEMS.register("nuggetiem_helmet",
            () -> new NuggetiemArmourItem(ModArmorMaterials.NUGGETIEM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> NUGGETIEM_CHESTPLATE = ITEMS.register("nuggetiem_chestplate",
            () -> new NuggetiemArmourItem(ModArmorMaterials.NUGGETIEM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> NUGGETIEM_LEGGING = ITEMS.register("nuggetiem_leggings",
            () -> new NuggetiemArmourItem(ModArmorMaterials.NUGGETIEM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> NUGGETIEM_BOOTS = ITEMS.register("nuggetiem_boots",
            () -> new NuggetiemArmourItem(ModArmorMaterials.NUGGETIEM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));


    public static final RegistryObject<Item> MAGNITE_HELMET = ITEMS.register("magnite_helmet",
            () -> new MagniteArmourItem(ModArmorMaterials.MAGNITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> MAGNITE_CHESTPLATE = ITEMS.register("magnite_chestplate",
            () -> new MagniteArmourItem(ModArmorMaterials.MAGNITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> MAGNITE_LEGGING = ITEMS.register("magnite_leggings",
            () -> new MagniteArmourItem(ModArmorMaterials.MAGNITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> MAGNITE_BOOTS = ITEMS.register("magnite_boots",
            () -> new MagniteArmourItem(ModArmorMaterials.MAGNITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));


    public static final RegistryObject<Item> LIGHT_HELMET = ITEMS.register("light_helmet",
            () -> new LightArmorItem(ModArmorMaterials.LIGHT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> LIGHT_CHESTPLATE = ITEMS.register("light_chestplate",
            () -> new LightArmorItem(ModArmorMaterials.LIGHT, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> LIGHT_LEGGING = ITEMS.register("light_leggings",
            () -> new LightArmorItem(ModArmorMaterials.LIGHT, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> LIGHT_BOOTS = ITEMS.register("light_boots",
            () -> new LightArmorItem(ModArmorMaterials.LIGHT, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));


    public static final RegistryObject<Item> BLACK_METAL_HELMET = ITEMS.register("black_metal_helmet",
            () -> new BlackMetalArmorItem(ModArmorMaterials.DARK, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> BLACK_METAL_CHESTPLATE = ITEMS.register("black_metal_chestplate",
            () -> new BlackMetalArmorItem(ModArmorMaterials.DARK, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> BLACK_METAL_LEGGING = ITEMS.register("black_metal_leggings",
            () -> new BlackMetalArmorItem(ModArmorMaterials.DARK, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> BLACK_METAL_BOOTS = ITEMS.register("black_metal_boots",
            () -> new BlackMetalArmorItem(ModArmorMaterials.DARK, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));


    public static final RegistryObject<Item> LIGHT_METAL_HELMET = ITEMS.register("light_metal_helmet",
            () -> new LightMetalArmorItem(ModArmorMaterials.LIGHTMETAL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> LIGHT_METAL_CHESTPLATE = ITEMS.register("light_metal_chestplate",
            () -> new LightMetalArmorItem(ModArmorMaterials.LIGHTMETAL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> LIGHT_METAL_LEGGING = ITEMS.register("light_metal_leggings",
            () -> new LightMetalArmorItem(ModArmorMaterials.LIGHTMETAL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));
    public static final RegistryObject<Item> LIGHT_METAL_BOOTS = ITEMS.register("light_metal_boots",
            () -> new LightMetalArmorItem(ModArmorMaterials.LIGHTMETAL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));



    //Spawn Eggs


    public static final RegistryObject<Item> CERB_SPAWN_EGG = ITEMS.register("cerb_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CERB,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> MINITAUR_SPAWN_EGG = ITEMS.register("minitaur_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MINITAUR,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> DEMON_SPAWN_EGG = ITEMS.register("demon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DEMON,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> MEDUSA_SPAWN_EGG = ITEMS.register("medusa_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MEDUSA,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));

    public static final RegistryObject<Item> YETI_SPAWN_EGG = ITEMS.register("yeti_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.YETI,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.CLANCY_TAB)));










    //wepons//
    private static final Item.Properties TOOL = new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<ModifiableItem> KATANA = ITEMS.register("katana",
            () -> new ModifiableItem(TOOL, ModToolDefinitions.KATANA));

    public static final RegistryObject<ModifiableItem> WARHAMMER = ITEMS.register("warhammer",
            () -> new ModifiableItem(TOOL, ModToolDefinitions.WARHAMMER));
    public static final RegistryObject<ModifiableItem> HALBERD = ITEMS.register("halberd",
            () -> new ModifiableItem(TOOL, ModToolDefinitions.HALBERD));
    public static final RegistryObject<ModifiableItem> BATTLEAXE = ITEMS.register("battleaxe",
            () -> new ModifiableItem(TOOL, ModToolDefinitions.BATTLEAXE));










    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
