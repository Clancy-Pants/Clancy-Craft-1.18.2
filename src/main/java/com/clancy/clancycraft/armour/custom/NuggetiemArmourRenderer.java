package com.clancy.clancycraft.armour.custom;

import com.clancy.clancycraft.items.custom.armor.NuggetiemArmourItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class NuggetiemArmourRenderer extends GeoArmorRenderer<NuggetiemArmourItem> {
    public NuggetiemArmourRenderer() {
        super(new NuggetiemArmour());

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
