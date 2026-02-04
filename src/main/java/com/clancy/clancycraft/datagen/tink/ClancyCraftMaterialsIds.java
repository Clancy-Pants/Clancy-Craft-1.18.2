package com.clancy.clancycraft.datagen.tink;

import com.clancy.clancycraft.ClancyCraft;
import net.minecraft.resources.ResourceLocation;
import slimeknights.tconstruct.library.materials.definition.MaterialId;

public class ClancyCraftMaterialsIds {

    public static final MaterialId nuggetiem = createMaterial("nuggetiem");

    public static final MaterialId magnite = createMaterial("magnite");

    public static final MaterialId light = createMaterial("light");

    public static final MaterialId dark = createMaterial("dark");
    public static final MaterialId lightmetal = createMaterial("lightmetal");



    public static MaterialId createMaterial(String name) {
        return new MaterialId(new ResourceLocation(ClancyCraft.MOD_ID, name));
    }
}
