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

import static net.minecraft.world.item.crafting.Ingredient.of;

public enum ModArmorMaterials implements ArmorMaterial {

    NUGGETIEM("nuggetiem", 28, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_GOLD,
            2.0F, 0.5F, () -> of(ClancyCraftItems.NUGGETIEM_INGOT.get())),

    MAGNITE("magnite", 28, new int[]{5, 8, 10, 5}, 20, SoundEvents.ARMOR_EQUIP_GOLD,
            3.0F, 0.5F, () -> of(ClancyCraftItems.MAGNITE_INGOT.get())),

    LIGHT("light", 28, new int[]{6, 9, 11, 6}, 20, SoundEvents.ARMOR_EQUIP_GOLD,
            3.0F, 0.5F, () -> of(ClancyCraftItems.BAR_OF_LIGHT.get())),

    DARK("dark", 28, new int[]{7, 10, 12, 7}, 20, SoundEvents.ARMOR_EQUIP_GOLD,
            3.0F, 0.5F, () -> of(ClancyCraftItems.DARK_METAL_INGOT.get())),

    LIGHTMETAL("lightmetal", 28, new int[]{8, 11, 13, 8}, 25, SoundEvents.ARMOR_EQUIP_GOLD,
            4.0F, 0.5F, () -> of(ClancyCraftItems.LIGHT_METAL_INGOT.get())),

    // ✅ MUST be before the semicolon
    MODULAR("modular", 15, new int[]{2, 5, 6, 2}, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.EMPTY);

    // ------------------------------

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections,
                      int enchantmentValue, SoundEvent sound,
                      float toughness, float knockbackResistance,
                      Supplier<Ingredient> repairIngredient) {

        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.slotProtections[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return ClancyCraft.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
