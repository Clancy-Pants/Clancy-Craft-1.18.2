package com.clancy.clancycraft.datagen.tink;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.init.ModToolDefinitions;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractToolDefinitionDataProvider;
import slimeknights.tconstruct.library.tools.stat.ToolStats;
import slimeknights.tconstruct.tools.TinkerModifiers;

import javax.annotation.Nonnull;

import static slimeknights.tconstruct.tools.TinkerToolParts.*;

public class ModToolDefinitionProvider extends AbstractToolDefinitionDataProvider {
    public ModToolDefinitionProvider(DataGenerator generator) {
        super(generator, ClancyCraft.MOD_ID);
    }

    @Override
    protected void addToolDefinitions() {

        define(ModToolDefinitions.KATANA)
                // parts
                .part(broadBlade)
                .part(toolHandle)
                .part(toolHandle)
                // stats
                .stat(ToolStats.ATTACK_DAMAGE, 4f)
                .stat(ToolStats.ATTACK_SPEED, 0.75f)
                .multiplier(ToolStats.MINING_SPEED, 0.5f)
                .multiplier(ToolStats.DURABILITY, 1.1f)
                .largeToolStartingSlots()
                // traits
                .trait(TinkerModifiers.lacerating);

        define(ModToolDefinitions.WARHAMMER)
                // parts
                .part(hammerHead)
                .part(toolBinding)
                .part(toughHandle)
                .part(toughHandle)
                // stats
                .stat(ToolStats.ATTACK_DAMAGE, 4f)
                .stat(ToolStats.ATTACK_SPEED, 0.75f)
                .multiplier(ToolStats.MINING_SPEED, 0.5f)
                .multiplier(ToolStats.DURABILITY, 1.1f)
                .largeToolStartingSlots()
                // traits
                .trait(TinkerModifiers.knockback)
                .trait(TinkerModifiers.fiery);

        define(ModToolDefinitions.HALBERD)
                // parts
                .part(hammerHead)
                .part(broadAxeHead)
                .part(toolBinding)
                .part(toughHandle)
                .part(toughHandle)
                // stats
                .stat(ToolStats.ATTACK_DAMAGE, 4f)
                .stat(ToolStats.ATTACK_SPEED, 0.75f)
                .multiplier(ToolStats.MINING_SPEED, 0.5f)
                .multiplier(ToolStats.DURABILITY, 1.1f)
                .largeToolStartingSlots()
                // traits
                .trait(TinkerModifiers.knockback)
                .trait(TinkerModifiers.lacerating)
                .trait(TinkerModifiers.axeStrip);

        define(ModToolDefinitions.BATTLEAXE)
                // parts
                .part(broadAxeHead)
                .part(broadAxeHead)
                .part(toolBinding)
                .part(toughHandle)
                .part(toughHandle)
                // stats
                .stat(ToolStats.ATTACK_DAMAGE, 4f)
                .stat(ToolStats.ATTACK_SPEED, 0.75f)
                .multiplier(ToolStats.MINING_SPEED, 0.5f)
                .multiplier(ToolStats.DURABILITY, 1.1f)
                .largeToolStartingSlots()
                // traits
                .trait(TinkerModifiers.knockback)
                .trait(TinkerModifiers.necrotic)
                .trait(TinkerModifiers.axeStrip);
    }
    @Nonnull
    @Override
    public String getName() {
        return "ClancyCraft Tool Definitions";
    }
}
