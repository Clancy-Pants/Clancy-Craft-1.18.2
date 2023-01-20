package com.clancy.clancycraft.init;

import com.clancy.clancycraft.items.ClancyCraftItems;
import slimeknights.tconstruct.library.tools.definition.ToolDefinition;

public class ModToolDefinitions {

    public static final ToolDefinition KATANA = ToolDefinition.builder(ClancyCraftItems.KATANA).meleeHarvest().build();
    public static final ToolDefinition WARHAMMER = ToolDefinition.builder(ClancyCraftItems.WARHAMMER).meleeHarvest().build();
    public static final ToolDefinition HALBERD = ToolDefinition.builder(ClancyCraftItems.HALBERD).meleeHarvest().build();
    public static final ToolDefinition BATTLEAXE = ToolDefinition.builder(ClancyCraftItems.BATTLEAXE).meleeHarvest().build();
}

