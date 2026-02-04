package com.clancy.clancycraft.items.custom;

import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.items.ClancyCraftItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;


public enum ModArmorMaterials implements ArmorMaterial {
    NUGGETIEM("nuggetiem", 28, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_GOLD,
            2.0F, 0.5F, () -> Ingredient.of(ClancyCraftItems.NUGGETIEM_INGOT.get())),
    MAGNITE("magnite", 28, new int[]{5, 8, 10, 5}, 20, SoundEvents.ARMOR_EQUIP_GOLD,
            3.0F, 0.5F, () -> Ingredient.of(ClancyCraftItems.MAGNITE_INGOT.get())),
    LIGHT("light", 28, new int[]{6, 9, 11, 6}, 20, SoundEvents.ARMOR_EQUIP_GOLD,
            3.0F, 0.5F, () -> Ingredient.of(ClancyCraftItems.BAR_OF_LIGHT.get())),

    DARK("dark", 28, new int[]{7, 10, 12, 7}, 20, SoundEvents.ARMOR_EQUIP_GOLD,
            3.0F, 0.5F, () -> Ingredient.of(ClancyCraftItems.DARK_METAL_INGOT.get())),

    LIGHTMETAL("lightmetal", 28, new int[]{8, 11, 13, 8}, 25, SoundEvents.ARMOR_EQUIP_GOLD,
            4.0F, 0.5F, () -> Ingredient.of(ClancyCraftItems.LIGHT_METAL_INGOT.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                      SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return ClancyCraft.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
