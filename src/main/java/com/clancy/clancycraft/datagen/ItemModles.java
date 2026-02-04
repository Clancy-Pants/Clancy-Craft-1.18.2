package com.clancy.clancycraft.datagen;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.init.CastType;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.items.custom.CastObject;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModles extends ItemModelProvider {

    public ItemModles(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ClancyCraft.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {

        itemWithModel(ClancyCraftItems.CITRINE, "item/generated");


        itemWithModel(ClancyCraftItems.RAW_NUGGETIEM, "item/generated");
        itemWithModel(ClancyCraftItems.NUGGETIEM_NUGGET, "item/generated");
        itemWithModel(ClancyCraftItems.NUGGETIEM_INGOT, "item/generated");
        itemWithModel(ClancyCraftItems.NUGGETIEM_BOOTS, "item/generated");
        itemWithModel(ClancyCraftItems.NUGGETIEM_CHESTPLATE, "item/generated");
        itemWithModel(ClancyCraftItems.NUGGETIEM_LEGGING, "item/generated");
        itemWithModel(ClancyCraftItems.NUGGETIEM_HELMET, "item/generated");

        itemWithModel(ClancyCraftItems.RAW_MAGNITE, "item/generated");
        itemWithModel(ClancyCraftItems.MAGNITE_INGOT, "item/generated");
        itemWithModel(ClancyCraftItems.MAGNITE_NUGGET, "item/generated");
        itemWithModel(ClancyCraftItems.MAGNITE_BOOTS, "item/generated");
        itemWithModel(ClancyCraftItems.MAGNITE_HELMET, "item/generated");
        itemWithModel(ClancyCraftItems.MAGNITE_LEGGING, "item/generated");
        itemWithModel(ClancyCraftItems.MAGNITE_CHESTPLATE, "item/generated");

        itemWithModel(ClancyCraftItems.BAR_OF_LIGHT, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_SHARDS, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_BOOTS, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_CHESTPLATE, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_LEGGING, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_NUGGET, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_HELMET, "item/generated");

        itemWithModel(ClancyCraftItems.RAW_BLACK_METAL, "item/generated");
        itemWithModel(ClancyCraftItems.DARK_METAL_INGOT, "item/generated");
        itemWithModel(ClancyCraftItems.DARK_METAL_NUGGET, "item/generated");
        itemWithModel(ClancyCraftItems.BLACK_METAL_BOOTS, "item/generated");
        itemWithModel(ClancyCraftItems.BLACK_METAL_CHESTPLATE, "item/generated");
        itemWithModel(ClancyCraftItems.BLACK_METAL_HELMET, "item/generated");
        itemWithModel(ClancyCraftItems.BLACK_METAL_LEGGING, "item/generated");

        itemWithModel(ClancyCraftItems.LIGHT_METAL_INGOT, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_METAL_NUGGET, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_METAL_BOOTS, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_METAL_CHESTPLATE, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_METAL_HELMET, "item/generated");
        itemWithModel(ClancyCraftItems.LIGHT_METAL_LEGGING, "item/generated");



    }




    public void castModel(CastObject object) {
        itemWithModel(object.getGoldCast(), "item/generated");
        itemWithModel(object.getSandCast(), "item/generated");
        itemWithModel(object.getRedSandCast(), "item/generated");
    }

    public void itemWithModel(RegistryObject<? extends Item> registryObject, String model) {
        ResourceLocation id = registryObject.getId();
        ResourceLocation textureLocation = new ResourceLocation(id.getNamespace(), "item/" + id.getPath());
        singleTexture(id.getPath(), new ResourceLocation(model), "layer0", textureLocation);
    }

    public void castModel(RegistryObject<? extends Item> registryObject, CastType type) {
        ResourceLocation id = registryObject.getId();
        ResourceLocation textureLocation = new ResourceLocation(id.getNamespace(), "item/cast/" + type.name().toLowerCase());
        singleTexture(id.getPath(), new ResourceLocation("item/generated"), "layer0", textureLocation);
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ClancyCraft.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ClancyCraft.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }
}
