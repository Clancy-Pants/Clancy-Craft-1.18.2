package com.clancy.clancycraft.items.custom.armor.tinkers;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import com.clancy.clancycraft.items.custom.ModArmorMaterials;

public class ModularHelmetItem extends ArmorItem {

    public ModularHelmetItem(ArmorMaterial material, Properties properties) {
        super(material, EquipmentSlot.HEAD, properties);
    }
}
