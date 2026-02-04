package com.clancy.clancycraft.armour.custom.renderers;

import com.clancy.clancycraft.armour.custom.BlackMetalArmor;
import com.clancy.clancycraft.armour.custom.LightArmour;
import com.clancy.clancycraft.items.custom.armor.BlackMetalArmorItem;
import com.clancy.clancycraft.items.custom.armor.LightArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackMetalArmourRenderer extends GeoArmorRenderer<BlackMetalArmorItem> {
    public BlackMetalArmourRenderer() {
        super(new BlackMetalArmor());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
