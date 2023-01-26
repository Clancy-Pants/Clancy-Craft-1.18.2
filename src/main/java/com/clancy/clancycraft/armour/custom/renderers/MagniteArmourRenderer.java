package com.clancy.clancycraft.armour.custom.renderers;

import com.clancy.clancycraft.armour.custom.MagniteArmour;
import com.clancy.clancycraft.items.custom.armor.MagniteArmourItem;
import com.clancy.clancycraft.items.custom.armor.NuggetiemArmourItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MagniteArmourRenderer extends GeoArmorRenderer<MagniteArmourItem> {
    public MagniteArmourRenderer() {
        super(new MagniteArmour());

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
