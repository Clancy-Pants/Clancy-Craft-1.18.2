package com.clancy.clancycraft.datagen;

import com.clancy.clancycraft.blocks.ModBlocks;
import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

import static com.clancy.clancycraft.util.ModTags.Items.NUGGETIEM_INGOT;

public class ClancyCraftRecipes extends RecipeProvider implements IConditionBuilder {
    public ClancyCraftRecipes(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {


        //misc

        ShapedRecipeBuilder.shaped(ClancyCraftItems.CITRINE.get())
                .define('E', Items.NETHER_STAR)
                .define('Q', Items.LAVA_BUCKET)
                .define('W', Items.DIAMOND)
                .pattern(" E ")
                .pattern("WQW")
                .pattern("WWW")
                .unlockedBy("has_nether_star", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHER_STAR).build()))
                .save(consumer,"portal_lighter");


        //wood

        ShapelessRecipeBuilder.shapeless(ModBlocks.RAINBOW_PLANKS.get(),4)
                .requires(ModBlocks.RAINBOW_LOG.get())
                .unlockedBy("has_rainbow_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RAINBOW_LOG.get()).build()))
                .save(consumer,"rainbow_planks");

//Nuggetiem//
        ShapedRecipeBuilder.shaped(ModBlocks.NUGGETIEM_BLOCK.get())
                .define('E', ClancyCraftItems.NUGGETIEM_INGOT.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_nuggetiem_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NUGGETIEM_INGOT).build()))
                .save(consumer,"nuggetiem_block");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.NUGGETIEM_INGOT.get(),9)
                .requires(ModBlocks.NUGGETIEM_BLOCK.get())
                .unlockedBy("has_nuggetiem_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.NUGGETIEM_BLOCK.get()).build()))
                .save(consumer,"nuggetiem_ingot_block");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.NUGGETIEM_INGOT.get())
                .define('E', ClancyCraftItems.NUGGETIEM_NUGGET.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_nuggetiem_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.NUGGETIEM_NUGGET.get()).build()))
                .save(consumer,"nuggetiem_ingot_nuggets");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.NUGGETIEM_NUGGET.get(),9)
                .requires(ClancyCraftItems.NUGGETIEM_INGOT.get())
                .unlockedBy("has_nuggetiem_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.NUGGETIEM_INGOT.get()).build()))
                .save(consumer,"nuggetiem_nuggets_ingot");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.NUGGETIEM_HELMET.get())
                .define('E', ClancyCraftItems.NUGGETIEM_INGOT.get())
                .pattern("EEE")
                .pattern("E E")

                .unlockedBy("has_nuggetiem_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NUGGETIEM_INGOT).build()))
                .save(consumer,"nuggetiem_helm");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.NUGGETIEM_LEGGING.get())
                .define('E', ClancyCraftItems.NUGGETIEM_INGOT.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_nuggetiem_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NUGGETIEM_INGOT).build()))
                .save(consumer,"nuggetiem_legs");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.NUGGETIEM_CHESTPLATE.get())
                .define('E', ClancyCraftItems.NUGGETIEM_INGOT.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_nuggetiem_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NUGGETIEM_INGOT).build()))
                .save(consumer,"nuggetiem_chest");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.NUGGETIEM_BOOTS.get())
                .define('E', ClancyCraftItems.NUGGETIEM_INGOT.get())
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_nuggetiem_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NUGGETIEM_INGOT).build()))
                .save(consumer,"nuggetiem_boots");

        //magnite

        ShapedRecipeBuilder.shaped(ModBlocks.MAGNITE_BLOCK.get())
                .define('E', ClancyCraftItems.MAGNITE_INGOT.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_magnite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.MAGNITE_INGOT.get()).build()))
                .save(consumer,"magnite_block");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.MAGNITE_INGOT.get(),9)
                .requires(ModBlocks.MAGNITE_BLOCK.get())
                .unlockedBy("has_magnite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGNITE_BLOCK.get()).build()))
                .save(consumer,"magnite_ingot_block");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.MAGNITE_INGOT.get())
                .define('E', ClancyCraftItems.MAGNITE_NUGGET.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_magnite_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.MAGNITE_NUGGET.get()).build()))
                .save(consumer,"magnite_ingot_nuggets");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.MAGNITE_NUGGET.get(),9)
                .requires(ClancyCraftItems.MAGNITE_INGOT.get())
                .unlockedBy("has_magnite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.MAGNITE_INGOT.get()).build()))
                .save(consumer,"magnite_nuggets_ingot");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.MAGNITE_HELMET.get())
                .define('E', ClancyCraftItems.MAGNITE_INGOT.get())
                .pattern("EEE")
                .pattern("E E")

                .unlockedBy("has_magnite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.MAGNITE_INGOT.get()).build()))
                .save(consumer,"magnite_helm");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.MAGNITE_LEGGING.get())
                .define('E', ClancyCraftItems.MAGNITE_INGOT.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_magnite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.MAGNITE_INGOT.get()).build()))
                .save(consumer,"magnite_legs");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.MAGNITE_CHESTPLATE.get())
                .define('E', ClancyCraftItems.MAGNITE_INGOT.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_magnite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.MAGNITE_INGOT.get()).build()))
                .save(consumer,"magnite_chest");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.MAGNITE_BOOTS.get())
                .define('E', ClancyCraftItems.MAGNITE_INGOT.get())
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_magnite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.MAGNITE_INGOT.get()).build()))
                .save(consumer,"magnite_boots");

        //light

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLOCK.get())
                .define('E', ClancyCraftItems.BAR_OF_LIGHT.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_light_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.BAR_OF_LIGHT.get()).build()))
                .save(consumer,"light_block");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.BAR_OF_LIGHT.get(),9)
                .requires(ModBlocks.LIGHT_BLOCK.get())
                .unlockedBy("has_light_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLOCK.get()).build()))
                .save(consumer,"light_ingot_block");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.BAR_OF_LIGHT.get())
                .define('E', ClancyCraftItems.LIGHT_NUGGET.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_light_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.LIGHT_NUGGET.get()).build()))
                .save(consumer,"light_ingot_nuggets");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.LIGHT_NUGGET.get(),9)
                .requires(ClancyCraftItems.BAR_OF_LIGHT.get())
                .unlockedBy("has_light_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.BAR_OF_LIGHT.get()).build()))
                .save(consumer,"light_nuggets_ingot");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_HELMET.get())
                .define('E', ClancyCraftItems.BAR_OF_LIGHT.get())
                .pattern("EEE")
                .pattern("E E")

                .unlockedBy("has_light_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.BAR_OF_LIGHT.get()).build()))
                .save(consumer,"light_helm");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_LEGGING.get())
                .define('E', ClancyCraftItems.BAR_OF_LIGHT.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_light_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.BAR_OF_LIGHT.get()).build()))
                .save(consumer,"light_legs");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_CHESTPLATE.get())
                .define('E', ClancyCraftItems.BAR_OF_LIGHT.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_light_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.BAR_OF_LIGHT.get()).build()))
                .save(consumer,"light_chest");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_BOOTS.get())
                .define('E', ClancyCraftItems.BAR_OF_LIGHT.get())
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_light_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.BAR_OF_LIGHT.get()).build()))
                .save(consumer,"light_boots");

        //black metal


        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_METAL_BLOCK.get())
                .define('E', ClancyCraftItems.DARK_METAL_INGOT.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_black_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.DARK_METAL_INGOT.get()).build()))
                .save(consumer,"black_metal_block");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.DARK_METAL_INGOT.get(),9)
                .requires(ModBlocks.BLACK_METAL_BLOCK.get())
                .unlockedBy("has_black_metal_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_METAL_BLOCK.get()).build()))
                .save(consumer,"black_metal_ingot_block");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.DARK_METAL_INGOT.get())
                .define('E', ClancyCraftItems.DARK_METAL_NUGGET.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_black_metal_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.DARK_METAL_NUGGET.get()).build()))
                .save(consumer,"black_metal_ingot_nuggets");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.DARK_METAL_NUGGET.get(),9)
                .requires(ClancyCraftItems.DARK_METAL_INGOT.get())
                .unlockedBy("has_black_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.DARK_METAL_INGOT.get()).build()))
                .save(consumer,"black_metal_nuggets_ingot");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.BLACK_METAL_HELMET.get())
                .define('E', ClancyCraftItems.DARK_METAL_INGOT.get())
                .pattern("EEE")
                .pattern("E E")

                .unlockedBy("has_black_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.DARK_METAL_INGOT.get()).build()))
                .save(consumer,"black_metal_helm");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.BLACK_METAL_LEGGING.get())
                .define('E', ClancyCraftItems.DARK_METAL_INGOT.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_black_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.DARK_METAL_INGOT.get()).build()))
                .save(consumer,"black_metal_legs");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.BLACK_METAL_CHESTPLATE.get())
                .define('E', ClancyCraftItems.DARK_METAL_INGOT.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_black_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.DARK_METAL_INGOT.get()).build()))
                .save(consumer,"black_metal_chest");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.BLACK_METAL_BOOTS.get())
                .define('E', ClancyCraftItems.DARK_METAL_INGOT.get())
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_black_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.DARK_METAL_INGOT.get()).build()))
                .save(consumer,"black_metal_boots");

        //light metal


        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_METAL_BLOCK.get())
                .define('E', ClancyCraftItems.LIGHT_METAL_INGOT.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_light_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.LIGHT_METAL_INGOT.get()).build()))
                .save(consumer,"light_metal_block");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.LIGHT_METAL_INGOT.get(),9)
                .requires(ModBlocks.LIGHT_METAL_BLOCK.get())
                .unlockedBy("has_light_metal_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_METAL_BLOCK.get()).build()))
                .save(consumer,"light_metal_ingot_block");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_METAL_INGOT.get())
                .define('E', ClancyCraftItems.LIGHT_METAL_NUGGET.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_light_metal_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.LIGHT_METAL_NUGGET.get()).build()))
                .save(consumer,"light_metal_ingot_nuggets");

        ShapelessRecipeBuilder.shapeless(ClancyCraftItems.LIGHT_METAL_NUGGET.get(),9)
                .requires(ClancyCraftItems.LIGHT_METAL_INGOT.get())
                .unlockedBy("has_light_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.LIGHT_METAL_INGOT.get()).build()))
                .save(consumer,"light_metal_nuggets_ingot");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_METAL_HELMET.get())
                .define('E', ClancyCraftItems.LIGHT_METAL_INGOT.get())
                .pattern("EEE")
                .pattern("E E")

                .unlockedBy("has_light_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.LIGHT_METAL_INGOT.get()).build()))
                .save(consumer,"light_metal_helm");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_METAL_LEGGING.get())
                .define('E', ClancyCraftItems.LIGHT_METAL_INGOT.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_light_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.LIGHT_METAL_INGOT.get()).build()))
                .save(consumer,"light_metal_legs");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_METAL_CHESTPLATE.get())
                .define('E', ClancyCraftItems.LIGHT_METAL_INGOT.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_light_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.LIGHT_METAL_INGOT.get()).build()))
                .save(consumer,"light_metal_chest");

        ShapedRecipeBuilder.shaped(ClancyCraftItems.LIGHT_METAL_BOOTS.get())
                .define('E', ClancyCraftItems.LIGHT_METAL_INGOT.get())
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_light_metal_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ClancyCraftItems.LIGHT_METAL_INGOT.get()).build()))
                .save(consumer,"light_metal_boots");





    }
}