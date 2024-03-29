package com.clancy.clancycraft.blocks;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.custom.ModFlammableRotatedPillarBlock;
import com.clancy.clancycraft.blocks.custom.PortalBlock;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.items.ModCreativeModeTab;
import com.clancy.clancycraft.world.dimenesion.portals.ModPortalBlock;
import com.clancy.clancycraft.world.feature.tree.RainbowTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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

    public static final RegistryObject<Block> NUGGETIEM_BLOCK = registerBlock("nuggetiem_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> MAGNITE_BLOCK = registerBlock("magnite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> LIGHT_BLOCK = registerBlock("light_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> BLACK_METAL_BLOCK = registerBlock("black_metal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> LIGHT_METAL_BLOCK = registerBlock("light_metal_block",
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

    //TREES

    public static final RegistryObject<Block> RAINBOW_LOG = registerBlock("rainbow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
                    ModCreativeModeTab.CLANCY_TAB);
    public static final RegistryObject<Block> STRIPPED_RAINBOW_LOG = registerBlock("stripped_rainbow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.CLANCY_TAB);
    public static final RegistryObject<Block> RAINBOW_WOOD = registerBlock("rainbow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.CLANCY_TAB);
    public static final RegistryObject<Block> STRIPPED_RAINBOW_WOOD = registerBlock("stripped_rainbow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> RAINBOW_SAPLING = registerBlock("rainbow_sapling",
            () -> new SaplingBlock(new RainbowTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.CLANCY_TAB);

    //PLANKS

    public static final RegistryObject<Block> RAINBOW_PLANKS = registerBlock("rainbow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.CLANCY_TAB);

    //LEAVES

    public static final RegistryObject<Block> RAINBOW_LEAVES = registerBlock("rainbow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.CLANCY_TAB);


    public static final RegistryObject<Block> RAINBOW_STAIRS = registerBlock("rainbow_stairs",
            () -> new StairBlock(() -> ModBlocks.RAINBOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.CLANCY_TAB);
    public static final RegistryObject<Block> RAINBOW_SLAB = registerBlock("rainbow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> RAINBOW_FENCE = registerBlock("rainbow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);
    public static final RegistryObject<Block> RAINBOW_FENCE_GATE = registerBlock("rainbow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);
    public static final RegistryObject<Block> RAINBOW_WALL = registerBlock("rainbow_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> RAINBOW_BUTTON = registerBlock("rainbow_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.CLANCY_TAB);
    public static final RegistryObject<Block> RAINBOW_PRESSURE_PLATE = registerBlock("rainbow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CLANCY_TAB);

    public static final RegistryObject<Block> RAINBOW_DOOR = registerBlock("rainbow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.CLANCY_TAB);
    public static final RegistryObject<Block> RAINBOW_TRAPDOOR = registerBlock("rainbow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.CLANCY_TAB);
























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
