package com.clancy.clancycraft.datagen.tink;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.items.custom.CastObject;
import com.clancy.clancycraft.liquid.ModFluids;
import com.clancy.clancycraft.util.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.CompoundIngredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fluids.FluidStack;
import slimeknights.tconstruct.common.TinkerTags;
import slimeknights.tconstruct.fluids.TinkerFluids;
import slimeknights.tconstruct.library.data.recipe.ICommonRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.IMaterialRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.ISmelteryRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.IToolRecipeHelper;
import slimeknights.tconstruct.library.recipe.FluidValues;
import slimeknights.tconstruct.library.recipe.alloying.AlloyRecipeBuilder;
import slimeknights.tconstruct.library.recipe.casting.ItemCastingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.casting.material.CompositeCastingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.casting.material.MaterialCastingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.ingredient.MaterialIngredient;
import slimeknights.tconstruct.library.recipe.melting.MeltingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.molding.MoldingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.partbuilder.PartRecipeBuilder;
import slimeknights.tconstruct.library.tools.part.IMaterialItem;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import slimeknights.tconstruct.tools.TinkerToolParts;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.clancy.clancycraft.liquid.ModFluids.*;


public class ClancyCraftTinkersRecipes extends RecipeProvider implements IConditionBuilder, IMaterialRecipeHelper,
        IToolRecipeHelper, ISmelteryRecipeHelper, ICommonRecipeHelper {

    public ClancyCraftTinkersRecipes(DataGenerator gen) {
        super(gen);
    }

    public void craftingRecipes(Consumer<FinishedRecipe> consumer) {


}
public void alloyRecipes(Consumer<FinishedRecipe> consumer) {
    String alloyFolder = "smeltery/alloy/";


    AlloyRecipeBuilder.alloy(lightmetal.get(), FluidValues.INGOT * 3)
            .addInput(light.get(), FluidValues.INGOT)
            .addInput(dark.get(), FluidValues.INGOT * 2)
            .save(consumer, modResource(alloyFolder + "lightmetal"));
}
    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {
        String materialFolder = "materials/";
        String meltingFolder = "smeltery/melting/";
        String castingFolder = "smeltery/casting/";
        String castFolder = "smeltery/casts/";
        String toolFolder = "tools/building/";
        String partFolder = "tools/parts/";
        String slotless = "tools/modifiers/slotless/";


        this.alloyRecipes(consumer);
        this.craftingRecipes(consumer);

        toolBuilding(consumer, ClancyCraftItems.KATANA, toolFolder);
        toolBuilding(consumer, ClancyCraftItems.WARHAMMER, toolFolder);
        toolBuilding(consumer, ClancyCraftItems.HALBERD, toolFolder);
        toolBuilding(consumer, ClancyCraftItems.BATTLEAXE, toolFolder);

        metalMelting(consumer, nuggetiem.get(), "nuggetiem",
                false, meltingFolder, false);
        metalCasting(consumer, nuggetiem,
                false, ModBlocks.NUGGETIEM_BLOCK.get(), ClancyCraftItems.NUGGETIEM_INGOT.get(),
                ClancyCraftItems.NUGGETIEM_NUGGET.get(), castingFolder, "nuggetiem");
        metalMaterialRecipe(consumer, ClancyCraftMaterialsIds.nuggetiem, materialFolder, "nuggetiem", true);
        materialMeltingCasting(consumer, ClancyCraftMaterialsIds.nuggetiem, nuggetiem, materialFolder);
        oreFurnace(consumer, ModTags.Items.RAW_NUGGETIEM, ClancyCraftItems.NUGGETIEM_INGOT, "nuggetiem", false);
        MeltingRecipeBuilder.melting(Ingredient.of(ModTags.Items.RAW_NUGGETIEM), new FluidStack(nuggetiem.get(),
                FluidValues.INGOT*2), 1000, 30).save
                (consumer, new ResourceLocation(ClancyCraft.MOD_ID, "smeltery/melting/raw/nuggetiem"));


        metalMelting(consumer, ModFluids.magnite.get(), "magnite",
                false, meltingFolder, false);
        metalCasting(consumer, magnite,
                false, ModBlocks.MAGNITE_BLOCK.get(), ClancyCraftItems.MAGNITE_INGOT.get(),
                ClancyCraftItems.MAGNITE_NUGGET.get(), castingFolder, "magnite");
        metalMaterialRecipe(consumer, ClancyCraftMaterialsIds.magnite, materialFolder, "magnite", true);
        materialMeltingCasting(consumer, ClancyCraftMaterialsIds.magnite, ModFluids.magnite, materialFolder);
        oreFurnace(consumer, ModTags.Items.RAW_MAGNITE, ClancyCraftItems.MAGNITE_INGOT, "magnite", false);
        MeltingRecipeBuilder.melting(Ingredient.of(ModTags.Items.RAW_MAGNITE), new FluidStack(magnite.get(),
                FluidValues.INGOT*2), 1000, 30).save
                (consumer, new ResourceLocation(ClancyCraft.MOD_ID, "smeltery/melting/raw/magnite"));


        metalMelting(consumer, ModFluids.light.get(), "light",
                false, meltingFolder, false);
        metalCasting(consumer, light,
                false, ModBlocks.LIGHT_BLOCK.get(), ClancyCraftItems.BAR_OF_LIGHT.get(),
                ClancyCraftItems.LIGHT_NUGGET.get(), castingFolder, "light");
        metalMaterialRecipe(consumer, ClancyCraftMaterialsIds.light, materialFolder, "light", true);
        materialMeltingCasting(consumer, ClancyCraftMaterialsIds.light, ModFluids.light, materialFolder);
        oreFurnace(consumer, ModTags.Items.RAW_LIGHT, ClancyCraftItems.BAR_OF_LIGHT, "light", false);
        MeltingRecipeBuilder.melting(Ingredient.of(ModTags.Items.RAW_LIGHT), new FluidStack(light.get(),
                FluidValues.INGOT*2), 1000, 30).save
                (consumer, new ResourceLocation(ClancyCraft.MOD_ID, "smeltery/melting/raw/light"));


        metalMelting(consumer, dark.get(), "dark",
                false, meltingFolder, false);
        metalCasting(consumer, dark,
                true, ModBlocks.BLACK_METAL_BLOCK.get(), ClancyCraftItems.DARK_METAL_INGOT.get(),
                ClancyCraftItems.DARK_METAL_NUGGET.get(), castingFolder, "dark");
        metalMaterialRecipe(consumer, ClancyCraftMaterialsIds.dark, materialFolder, "dark", true);
        materialMeltingCasting(consumer, ClancyCraftMaterialsIds.dark, ModFluids.dark, materialFolder);
        oreFurnace(consumer, ModTags.Items.RAW_DARK, ClancyCraftItems.DARK_METAL_INGOT, "dark", false);
        MeltingRecipeBuilder.melting(Ingredient.of(ModTags.Items.RAW_DARK), new FluidStack(dark.get(),
                FluidValues.INGOT*2), 1000, 30).save
                (consumer, new ResourceLocation(ClancyCraft.MOD_ID, "smeltery/melting/raw/dark"));


        metalMelting(consumer, lightmetal.get(), "lightmetal",
                false, meltingFolder, false);
        metalCasting(consumer, lightmetal,
                true, ModBlocks.LIGHT_METAL_BLOCK.get(), ClancyCraftItems.LIGHT_METAL_INGOT.get(),
                ClancyCraftItems.LIGHT_METAL_NUGGET.get(), castingFolder, "lightmetal");
        metalMaterialRecipe(consumer, ClancyCraftMaterialsIds.lightmetal, materialFolder, "lightmetal", true);
        materialMeltingCasting(consumer, ClancyCraftMaterialsIds.lightmetal, ModFluids.lightmetal, materialFolder);








        partRecipes(consumer, TinkerToolParts.repairKit, TinkerSmeltery.repairKitCast, 2, partFolder, castFolder);
        // head
        partRecipes(consumer, TinkerToolParts.pickHead,     TinkerSmeltery.pickHeadCast,     2, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.hammerHead,   TinkerSmeltery.hammerHeadCast,   8, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.smallAxeHead, TinkerSmeltery.smallAxeHeadCast, 2, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.broadAxeHead, TinkerSmeltery.broadAxeHeadCast, 8, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.smallBlade,   TinkerSmeltery.smallBladeCast,   2, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.broadBlade,   TinkerSmeltery.broadBladeCast,   8, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.bowLimb,      TinkerSmeltery.bowLimbCast,      2, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.bowGrip,      TinkerSmeltery.bowGripCast,      2, partFolder, castFolder);
        // other parts
        partRecipes(consumer, TinkerToolParts.toolBinding, TinkerSmeltery.toolBindingCast, 1, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.roundPlate,  TinkerSmeltery.roundPlateCast,  2, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.largePlate,  TinkerSmeltery.largePlateCast,  4, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.toolHandle,  TinkerSmeltery.toolHandleCast,  1, partFolder, castFolder);
        partRecipes(consumer, TinkerToolParts.toughHandle, TinkerSmeltery.toughHandleCast, 3, partFolder, castFolder);
}





    private void partRecipes(Consumer<FinishedRecipe> consumer, IMaterialItem part, CastObject cast, int cost, String partFolder, String castFolder) {
        String name = Objects.requireNonNull(part.asItem().getRegistryName()).getPath();

        // Part Builder
        PartRecipeBuilder.partRecipe(part)
                .setPattern(modResource(name))
                .setPatternItem(CompoundIngredient.of(Ingredient.of(TinkerTags.Items.DEFAULT_PATTERNS), Ingredient.of(cast.getGoldCast().get())))
                .setCost(cost)
                .save(consumer, modResource(partFolder + "builder/" + name));

        // Material Casting
        String castingFolder = partFolder + "casting/";
        MaterialCastingRecipeBuilder.tableRecipe(part)
                .setItemCost(cost)
                .setCast(cast.getMultiUseTag(), false)
                .save(consumer, modResource(castingFolder + name + "_gold_cast"));
        MaterialCastingRecipeBuilder.tableRecipe(part)
                .setItemCost(cost)
                .setCast(cast.getSingleUseTag(), true)
                .save(consumer, modResource(castingFolder + name + "_sand_cast"));
        CompositeCastingRecipeBuilder.table(part, cost)
                .save(consumer, modResource(castingFolder + name + "_composite"));

        // Cast Casting
        MaterialIngredient ingredient = MaterialIngredient.fromItem(part);
        castCreation(consumer, ingredient, cast, castFolder, Objects.requireNonNull(part.asItem().getRegistryName()).getPath());
    }

    private void castCreation(Consumer<FinishedRecipe> consumer, Ingredient input, CastObject cast, String folder, String name) {
        ItemCastingRecipeBuilder.tableRecipe(cast.getGoldCast().get())
                .setFluidAndTime(TinkerFluids.moltenGold, true, FluidValues.INGOT)
                .setCast(input, true)
                .setSwitchSlots()
                .save(consumer, modResource(folder + "gold_casts/" + name));
        MoldingRecipeBuilder.moldingTable(cast.getSandCast().get())
                .setMaterial(TinkerSmeltery.blankSandCast)
                .setPattern(input, false)
                .save(consumer, modResource(folder + "sand_casts/" + name));
        MoldingRecipeBuilder.moldingTable(cast.getRedSandCast().get())
                .setMaterial(TinkerSmeltery.blankRedSandCast)
                .setPattern(input, false)
                .save(consumer, modResource(folder + "red_sand_casts/" + name));



    }





    @Nonnull
    @Override
    public String getModId() {
        return ClancyCraft.MOD_ID;
    }

    private void oreFurnace(Consumer<FinishedRecipe> consumer, TagKey<Item> ore, Supplier<Item> item, String name, boolean value) {
        String end = value ? "raw": "ore";
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ore), item.get(), 0, 200).unlockedBy("has_item", has(item.get())).save(consumer, modResource("smelting/"+end+"/"+name));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ore), item.get(), 0.5f, 100).unlockedBy("has_item", has(item.get())).save(consumer, modResource("blasting/"+end+"/"+name));
    }

}

