package com.clancy.clancycraft.events;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.datagen.*;
import com.clancy.clancycraft.datagen.tags.ClancyCraftBlockTags;
import com.clancy.clancycraft.datagen.tags.ClancyCraftFluidTags;
import com.clancy.clancycraft.datagen.tags.ClancyCraftItemTags;
import com.clancy.clancycraft.datagen.tink.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.material.MaterialPartTextureGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.tools.data.sprite.TinkerMaterialSpriteProvider;
import slimeknights.tconstruct.tools.data.sprite.TinkerPartSpriteProvider;
@Mod.EventBusSubscriber(modid = ClancyCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {

    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        net.minecraft.data.DataGenerator gen = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        if (event.includeServer()) {
            AbstractMaterialDataProvider materials = new ClancyCraftMaterials(gen);
            gen.addProvider(materials);
            gen.addProvider(new ClancycraftTraits(gen, materials));
            gen.addProvider(new ClancyCraftMaterialStats(gen, materials));
            gen.addProvider(new ModToolDefinitionProvider(gen));
            gen.addProvider(new ModToolSlotLayout(gen));
            gen.addProvider(new ClancyCraftTinkersRecipes(gen));
            gen.addProvider(new ClancyCraftRecipes(gen));
            ClancyCraftBlockTags tags = new ClancyCraftBlockTags(gen, fileHelper);
            gen.addProvider(tags);
            gen.addProvider(new ClancyCraftFluidTags(gen, fileHelper));
            gen.addProvider(new ClancyCraftItemTags(gen, tags, fileHelper));
            gen.addProvider(new ClancyCraftLootTableProvider(gen));
        }
        if(event.includeClient()) {
            gen.addProvider(new ModBlockStates(gen, fileHelper));
            gen.addProvider(new ClancyCraftLangEn(gen));
            AbstractMaterialSpriteProvider provider = new MaterialSpriteProvider();
            AbstractMaterialSpriteProvider tinkersProvider = new TinkerMaterialSpriteProvider();
            gen.addProvider(new MaterialPartTextureGenerator(gen, fileHelper, new TinkerPartSpriteProvider(), provider));
            gen.addProvider(new MaterialPartTextureGenerator(gen, fileHelper, new ClancyCraftPartSpriteProvider(), provider));
            gen.addProvider(new MaterialPartTextureGenerator(gen, fileHelper, new ClancyCraftPartSpriteProvider(), tinkersProvider));
            gen.addProvider(new ClancyCraftRenderInfo(gen, provider));

        }
    }
}
