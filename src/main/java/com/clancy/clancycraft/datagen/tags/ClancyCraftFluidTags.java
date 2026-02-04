package com.clancy.clancycraft.datagen.tags;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.liquid.ModFluids;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static com.clancy.clancycraft.util.ModTags.Fluids.*;

public class ClancyCraftFluidTags extends FluidTagsProvider {

    private static TagKey<Fluid> create(String name) {
        return FluidTags.create(new ResourceLocation(name));
    }

    public ClancyCraftFluidTags(DataGenerator gen, @Nullable ExistingFileHelper existingFileHelper) {
        super(gen, ClancyCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        tag(NUGGETIEM).add(ModFluids.nuggetiem.get());
        tag(NUGGETIEM_).add(ModFluids.nuggetiem.get());
        tag(MAGNITE).add(ModFluids.magnite.get());
        tag(MAGNITE_).add(ModFluids.magnite.get());
        tag(LIGHT).add(ModFluids.light.get());
        tag(LIGHT_).add(ModFluids.light.get());
        tag(DARK).add(ModFluids.dark.get());
        tag(DARK_).add(ModFluids.dark.get());
        tag(LIGHTMETAL).add(ModFluids.lightmetal.get());
        tag(LIGHTMETAL_).add(ModFluids.lightmetal.get());
        tag(LIQUID_COAL).add(ModFluids.liquid_coal.get());
        tag(LIQUID_COAL_).add(ModFluids.liquid_coal.get());

    }
}

