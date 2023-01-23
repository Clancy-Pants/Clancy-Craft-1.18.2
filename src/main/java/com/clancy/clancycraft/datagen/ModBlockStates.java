package com.clancy.clancycraft.datagen;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.liquid.ModFluids;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.mantle.registration.object.FluidObject;

import java.util.Random;

public class ModBlockStates extends BlockStateProvider {

    public ModBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ClancyCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


        fluid(ModFluids.nuggetiem);
        fluid(ModFluids.magnite);
        fluid(ModFluids.light);
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
}
