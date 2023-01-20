package com.clancy.clancycraft.datagen.tink;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import slimeknights.tconstruct.library.data.recipe.ICommonRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.IMaterialRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.ISmelteryRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.IToolRecipeHelper;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class ClancyCraftRecipes extends RecipeProvider implements IConditionBuilder, IMaterialRecipeHelper,
        IToolRecipeHelper, ISmelteryRecipeHelper, ICommonRecipeHelper {

    public ClancyCraftRecipes(DataGenerator gen) {
        super(gen);
    }

    public void craftingRecipes(Consumer<FinishedRecipe> consumer) {


}

    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {

        String toolFolder = "tools/building/";


        this.craftingRecipes(consumer);

        toolBuilding(consumer, ClancyCraftItems.KATANA, toolFolder);
        toolBuilding(consumer, ClancyCraftItems.WARHAMMER, toolFolder);
        toolBuilding(consumer, ClancyCraftItems.HALBERD, toolFolder);
        toolBuilding(consumer, ClancyCraftItems.BATTLEAXE, toolFolder);


}

    @Nonnull
    @Override
    public String getModId() {
        return ClancyCraft.MOD_ID;
    }

}

