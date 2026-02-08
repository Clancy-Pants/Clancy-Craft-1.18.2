package com.clancy.clancycraft.init.menus;


import com.clancy.clancycraft.ClancyCraft;
import com.clancy.clancycraft.blocks.custom.workstations.armorstation.menu.ArmorSmithingMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenus {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, ClancyCraft.MOD_ID);

    public static final RegistryObject<MenuType<ArmorSmithingMenu>> ARMOR_SMITHING =
            MENUS.register("armor_smithing",
                    () -> IForgeMenuType.create(ArmorSmithingMenu::new));


}
