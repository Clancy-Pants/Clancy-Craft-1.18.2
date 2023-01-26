package com.clancy.clancycraft.armour.custom.renderers;

import com.clancy.clancycraft.armour.custom.BlackMetalArmor;
import com.clancy.clancycraft.armour.custom.LightMetalArmor;
import com.clancy.clancycraft.items.custom.armor.BlackMetalArmorItem;
import com.clancy.clancycraft.items.custom.armor.LightMetalArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LightMetalArmourRenderer extends GeoArmorRenderer<LightMetalArmorItem> {
    public LightMetalArmourRenderer() {
        super(new LightMetalArmor());

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
