package com.clancy.clancycraft.blocks;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.custom.PortalBlock;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.items.ModCreativeModeTab;
import com.clancy.clancycraft.world.dimenesion.portals.ModPortalBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ClancyCraft.MOD_ID);
//metal blocks
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    //ores
    public static final RegistryObject<Block> NUGGETIEM_ORE = registerBlock("nuggetiem_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> MAGNITE_ORE = registerBlock("magnite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> SHARDS_OF_LIGHT = registerBlock("shards_of_light",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> BLACK_METAL_ORE = registerBlock("black_metal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);





















    public  static final RegistryObject<Block> CLANCY_PORTAL = registerBlockWithoutBlockItem("clancy_portal",
            PortalBlock::new);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ClancyCraftItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
