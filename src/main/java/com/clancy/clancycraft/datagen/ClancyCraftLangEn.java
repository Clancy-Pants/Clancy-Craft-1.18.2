package com.clancy.clancycraft.datagen;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.datagen.tink.ClancyCraftMaterialsIds;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.liquid.ModFluids;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import org.apache.commons.lang3.StringUtils;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.tconstruct.library.materials.definition.MaterialId;

public class ClancyCraftLangEn extends LanguageProvider {

    public ClancyCraftLangEn (DataGenerator gen) {
        super(gen, ClancyCraft.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addGroup("ClancyCraft Items");

        addItem(ClancyCraftItems.BATTLEAXE, "Battle Axe");
        addItem(ClancyCraftItems.HALBERD, "Halberd");
        addItem(ClancyCraftItems.KATANA, "Katana");
        addItem(ClancyCraftItems.WARHAMMER, "Warhammer");


        addItem(ClancyCraftItems.CITRINE, "Portal Lighter");
        addBlock(ModBlocks.CITRINE_BLOCK, "Portal Block");


        addItem(ClancyCraftItems.NUGGETIEM_INGOT, "Nuggetiem Ingot");
        addItem(ClancyCraftItems.NUGGETIEM_NUGGET, "Nuggetiem Nugget");
        addItem(ClancyCraftItems.RAW_NUGGETIEM, "Raw Nuggetiem");
        addBlock(ModBlocks.NUGGETIEM_BLOCK, "Block Of Nuggetiem");
        addBlock(ModBlocks.NUGGETIEM_ORE, "Nuggetiem Ore");


        addItem(ClancyCraftItems.MAGNITE_INGOT, "Magnite Ingot");
        addItem(ClancyCraftItems.MAGNITE_NUGGET, "Magnite Nugget");
        addItem(ClancyCraftItems.RAW_MAGNITE, "Raw Magnite");
        addBlock(ModBlocks.MAGNITE_BLOCK, "Block Of Magnite");
        addBlock(ModBlocks.MAGNITE_ORE, "Magnite Ore");


        addItem(ClancyCraftItems.LIGHT_METAL_INGOT, "Light Metal Ingot");
        addItem(ClancyCraftItems.LIGHT_METAL_NUGGET, "Light Metal Nugget");
        addBlock(ModBlocks.LIGHT_METAL_BLOCK, "Block Of Light Metal");


        addItem(ClancyCraftItems.DARK_METAL_INGOT, "Black Metal Ingot");
        addItem(ClancyCraftItems.DARK_METAL_NUGGET, "Black Metal Nugget");
        addItem(ClancyCraftItems.RAW_BLACK_METAL, "Raw Black Metal");
        addBlock(ModBlocks.BLACK_METAL_BLOCK, "Block Of Black Metal");
        addBlock(ModBlocks.BLACK_METAL_ORE, "Black Metal Ore");


        addItem(ClancyCraftItems.BAR_OF_LIGHT, "Bar Of Light");
        addItem(ClancyCraftItems.LIGHT_NUGGET, "Nugget Of Light");
        addItem(ClancyCraftItems.LIGHT_SHARDS, "Shards Of Light");
        addBlock(ModBlocks.LIGHT_BLOCK, "Block Of Light");
        addBlock(ModBlocks.SHARDS_OF_LIGHT, "Light Shards");


        addItem(ClancyCraftItems.NUGGETIEM_BOOTS, "Nuggetiem Boots");
        addItem(ClancyCraftItems.NUGGETIEM_HELMET, "Nuggetiem Helm");
        addItem(ClancyCraftItems.NUGGETIEM_CHESTPLATE, "Nuggetiem Chestplate");
        addItem(ClancyCraftItems.NUGGETIEM_LEGGING, "Nuggetiem Plate Legs");


        addBlock(ModBlocks.RAINBOW_LEAVES, "Rainbow Leaves");
        addBlock(ModBlocks.RAINBOW_LOG, "Rainbow Log");
        addBlock(ModBlocks.RAINBOW_PLANKS, "Rainbow Planks");
        addBlock(ModBlocks.RAINBOW_SAPLING, "Rainbow Sapling");
        addBlock(ModBlocks.RAINBOW_WOOD, "Rainbow Wood");
        addBlock(ModBlocks.STRIPPED_RAINBOW_LOG, "Stripped Rainbow Log");
        addBlock(ModBlocks.STRIPPED_RAINBOW_WOOD, "Stripped Rainbow wood");

        addFluid(ModFluids.nuggetiem, "Molten Nuggetiem");
        add(ModFluids.nuggetiem.get().getBucket(), "Molten Nuggetiem Bucket");
        addFluid(ModFluids.magnite, "Molten Magnite");
        add(ModFluids.magnite.get().getBucket(), "Molten Magnite Bucket");
        addFluid(ModFluids.light, "Molten Light Shards");
        add(ModFluids.light.get().getBucket(), "Molten Light Bucket");
        addFluid(ModFluids.dark, "Molten Black Metal");
        add(ModFluids.dark.get().getBucket(), "Molten Black Metal Bucket");
        addFluid(ModFluids.lightmetal, "Molten Light Metal");
        add(ModFluids.lightmetal.get().getBucket(), "Molten Light Metal Bucket");


        addMaterial(ClancyCraftMaterialsIds.nuggetiem, "Nuggetiem", "Strong and durable", "Nuggetiem Metal");
        addMaterial(ClancyCraftMaterialsIds.magnite, "Magnite", "Strong and durable", "Magnite Metal");
        addMaterial(ClancyCraftMaterialsIds.light, "Light", "Strong and durable", "Light");
        addMaterial(ClancyCraftMaterialsIds.dark, "Black Metal", "Strong and durable", "Black Metal");
        addMaterial(ClancyCraftMaterialsIds.lightmetal, "Light Metal", "Strong and durable", "Light Metal");
    }








    public void addFluid(FluidObject<ForgeFlowingFluid> supplier, String name) {
        add(String.format("fluid.%s.%s", ClancyCraft.MOD_ID, supplier.getId().getPath().replace("_flowing", "")), name);
    }



    public void addMaterial(MaterialId material, String name, String flavour, String desc) {
        String id = material.getPath();
        add("material.clancycraft." + id, name);
        if (!flavour.equals(""))
            add("material.clancycraft." + id + ".flavor", flavour);
        if (!desc.equals(""))
            add("material.clancycraft." + id + ".encyclopedia", desc);
    }



    public void addGroup(String value) {
        add(String.format("itemGroup.%s", ClancyCraft.MOD_ID), value);
    }

    public String capitalize(String input) {
        if(input.contains("_")) {
            String[] split = input.split("_");
            StringBuilder output = new StringBuilder();
            for(String s : split) {
                output.append(StringUtils.capitalize(s));
                output.append(" ");
            }
            return output.toString().trim();
        }
        return StringUtils.capitalize(input);
    }
}
