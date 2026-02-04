package com.clancy.clancycraft.armour.custom.renderers;

import com.clancy.clancycraft.armour.custom.LightArmour;
import com.clancy.clancycraft.armour.custom.MagniteArmour;
import com.clancy.clancycraft.items.custom.armor.LightArmorItem;
import com.clancy.clancycraft.items.custom.armor.MagniteArmourItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LightArmourRenderer extends GeoArmorRenderer<LightArmorItem> {
    public LightArmourRenderer() {
        super(new LightArmour());

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
