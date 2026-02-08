package com.clancy.clancycraft.blocks.custom.workstations.armorstation.menu;

import com.clancy.clancycraft.init.menus.ModMenus;
import com.clancy.clancycraft.items.ClancyCraftItems;
import com.clancy.clancycraft.items.custom.armor.tinkers.ArmorBindingItem;
import com.clancy.clancycraft.items.custom.armor.tinkers.ArmorPlateItem;
import com.clancy.clancycraft.items.custom.armor.tinkers.HelmetCoreItem;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class ArmorSmithingMenu extends AbstractContainerMenu {

    private final Container container;

    // 🔹 Constructor used by Forge networking
    public ArmorSmithingMenu(int id, Inventory playerInv, FriendlyByteBuf buf) {
        super(ModMenus.ARMOR_SMITHING.get(), id);

        // 4 slots: core, plate, binding, output
        this.container = new SimpleContainer(4);

        // ───────── INPUT SLOTS ─────────

        // Helmet core
        this.addSlot(new Slot(container, 0, 30, 34) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.getItem() instanceof HelmetCoreItem;
            }
        });

        // Plate
        this.addSlot(new Slot(container, 1, 50, 34) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.getItem() instanceof ArmorPlateItem;
            }
        });

        // Binding
        this.addSlot(new Slot(container, 2, 70, 34) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.getItem() instanceof ArmorBindingItem;
            }
        });

        // ───────── OUTPUT SLOT ─────────
        this.addSlot(new Slot(container, 3, 124, 34) {

            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                // Consume inputs
                for (int i = 0; i < 3; i++) {
                    container.removeItem(i, 1);
                }
                super.onTake(player, stack);
            }
        });

        // ───────── PLAYER INVENTORY ─────────
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(
                        playerInv,
                        col + row * 9 + 9,
                        8 + col * 18,
                        84 + row * 18
                ));
            }
        }

        // ───────── HOTBAR ─────────
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(
                    playerInv,
                    col,
                    8 + col * 18,
                    142
            ));
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    // 🔹 Auto-crafting logic
    @Override
    public void slotsChanged(Container container) {
        ItemStack core = container.getItem(0);
        ItemStack plate = container.getItem(1);
        ItemStack binding = container.getItem(2);

        if (core.getItem() instanceof HelmetCoreItem &&
                plate.getItem() instanceof ArmorPlateItem &&
                binding.getItem() instanceof ArmorBindingItem) {

            container.setItem(3,
                    new ItemStack(ClancyCraftItems.MODULAR_HELMET.get()));
        } else {
            container.setItem(3, ItemStack.EMPTY);
        }
    }
}
