package com.clancy.clancycraft.datagen;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.liquid.ModFluids;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.mantle.registration.object.FluidObject;

public class ModBlockStates extends BlockStateProvider {

    public ModBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ClancyCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.CITRINE_BLOCK);
        blockWithItem(ModBlocks.NUGGETIEM_BLOCK);
        blockWithItem(ModBlocks.MAGNITE_BLOCK);
        blockWithItem(ModBlocks.LIGHT_BLOCK);
        blockWithItem(ModBlocks.BLACK_METAL_BLOCK);
        blockWithItem(ModBlocks.LIGHT_METAL_BLOCK);


        blockWithItem(ModBlocks.NUGGETIEM_ORE);
        blockWithItem(ModBlocks.MAGNITE_ORE);
        blockWithItem(ModBlocks.SHARDS_OF_LIGHT);
        blockWithItem(ModBlocks.BLACK_METAL_ORE);

        blockWithItem(ModBlocks.RAINBOW_PLANKS);
        blockWithItem(ModBlocks.RAINBOW_LEAVES);

        buttonBlock((ButtonBlock)ModBlocks.RAINBOW_BUTTON.get(), blockTexture(ModBlocks.RAINBOW_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RAINBOW_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RAINBOW_PLANKS.get()));
        wallBlock((WallBlock) ModBlocks.RAINBOW_WALL.get(), blockTexture(ModBlocks.RAINBOW_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.RAINBOW_FENCE.get(), blockTexture(ModBlocks.RAINBOW_PLANKS.get()));

        fenceGateBlock((FenceGateBlock) ModBlocks.RAINBOW_FENCE_GATE.get(), blockTexture(ModBlocks.RAINBOW_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.RAINBOW_SLAB.get(), blockTexture(ModBlocks.RAINBOW_PLANKS.get()),
                blockTexture(ModBlocks.RAINBOW_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.RAINBOW_STAIRS.get(), blockTexture(ModBlocks.RAINBOW_PLANKS.get()));

        doorBlock((DoorBlock) ModBlocks.RAINBOW_DOOR.get(), new ResourceLocation(ClancyCraft.MOD_ID, "block/rainbow_door_bottom"),
                new ResourceLocation(ClancyCraft.MOD_ID, "block/rainbow_door_top"));
        trapdoorBlock((TrapDoorBlock) ModBlocks.RAINBOW_TRAPDOOR.get(), blockTexture(ModBlocks.RAINBOW_TRAPDOOR.get()), true);

        logBlock((RotatedPillarBlock) ModBlocks.RAINBOW_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.RAINBOW_WOOD.get(), blockTexture(ModBlocks.RAINBOW_LOG.get()), blockTexture(ModBlocks.RAINBOW_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_RAINBOW_LOG.get(), new ResourceLocation(ClancyCraft.MOD_ID, "block/stripped_rainbow_log"),
                new ResourceLocation(ClancyCraft.MOD_ID, "block/stripped_rainbow_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_RAINBOW_WOOD.get(), new ResourceLocation(ClancyCraft.MOD_ID, "block/stripped_rainbow_log"),
                new ResourceLocation(ClancyCraft.MOD_ID, "block/stripped_rainbow_top"));
        simpleBlock(ModBlocks.RAINBOW_SAPLING.get(), models().cross(ModBlocks.RAINBOW_SAPLING.get().getRegistryName().getPath(),
                blockTexture(ModBlocks.RAINBOW_SAPLING.get())));

        fluid(ModFluids.nuggetiem);
        fluid(ModFluids.magnite);
        fluid(ModFluids.light);
        fluid(ModFluids.dark);
        fluid(ModFluids.lightmetal);
        fluid(ModFluids.liquid_coal);
    }

    public void fluid(FluidObject<ForgeFlowingFluid> fluid) {
        ResourceLocation name = fluid.getBlock().getRegistryName();
        simpleBlock(fluid.getBlock(), models().cubeAll(name.getPath().replace("_fluid", ""),
                new ResourceLocation(name.getNamespace(), ModelProvider.BLOCK_FOLDER + "/fluid/" +
                        name.getPath().replace("_fluid", "")+"/still")));
        itemModels().cubeAll(name.getPath(), new ResourceLocation(name.getNamespace(), ModelProvider.BLOCK_FOLDER + "/fluid/" +
                name.getPath().replace("_fluid", "")+"/still"));
    }

    public void blockWithItem(RegistryObject<Block> registryObject) {
        //block model
        simpleBlock(registryObject.get());
        //itemblock model
        ResourceLocation id = registryObject.getId();
        ResourceLocation textureLocation = new ResourceLocation(id.getNamespace(), "block/" + id.getPath());
        itemModels().cubeAll(id.getPath(), textureLocation);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(block.getAgeProperty()),
                new ResourceLocation(ClancyCraft.MOD_ID, "block/" + textureName + state.getValue(block.getAgeProperty()))));

        return models;
    }
}
