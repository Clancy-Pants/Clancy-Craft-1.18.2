package com.clancy.clancycraft.datagen.tink;

import com.clancy.clancycraft.datagen.tink.ClancyCraftMaterialsIds;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;
import slimeknights.tconstruct.tools.TinkerModifiers;

import javax.annotation.Nonnull;

public class ClancycraftTraits extends AbstractMaterialTraitDataProvider {

    public ClancycraftTraits(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Override
    protected void addMaterialTraits() {

        addDefaultTraits(ClancyCraftMaterialsIds.nuggetiem, TinkerModifiers.haste);

        addDefaultTraits(ClancyCraftMaterialsIds.magnite, TinkerModifiers.fiery);

        addDefaultTraits(ClancyCraftMaterialsIds.light, TinkerModifiers.glowing);

        addDefaultTraits(ClancyCraftMaterialsIds.dark, TinkerModifiers.necrotic);

        addDefaultTraits(ClancyCraftMaterialsIds.lightmetal, TinkerModifiers.necrotic,TinkerModifiers.glowing);


    }

    @Nonnull
    @Override
    public String getName() {
        return "ClancyCraft Material Traits";
    }
}

