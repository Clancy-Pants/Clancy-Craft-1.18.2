package com.clancy.clancycraft.datagen.tink;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialStatsDataProvider;
import slimeknights.tconstruct.tools.stats.*;

import javax.annotation.Nonnull;

import static net.minecraft.world.item.Tiers.*;

public class ClancyCraftMaterialStats extends AbstractMaterialStatsDataProvider {

    public ClancyCraftMaterialStats(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Nonnull
    @Override
    public String getName() {
        return "ClancyCraft Material Stats";
    }

    @Override
    protected void addMaterialStats() {


        addMaterialStats(ClancyCraftMaterialsIds.nuggetiem,
                new HeadMaterialStats(1250, 6.5f, DIAMOND, 2.5f),
                HandleMaterialStats.DEFAULT.withDurability(1.1f).withMiningSpeed(0.9f).withAttackSpeed(0.95f).withAttackDamage(1.25f),
                ExtraMaterialStats.DEFAULT,
                new LimbMaterialStats(1250, -0.35f, -0.05f, -0.10f),
                new GripMaterialStats(1.1f, -0.20f, 3.5f));

        addMaterialStats(ClancyCraftMaterialsIds.magnite,
                new HeadMaterialStats(1300, 7f, DIAMOND, 2.75f),
                HandleMaterialStats.DEFAULT.withDurability(1.2f).withMiningSpeed(1f).withAttackSpeed(0.95f).withAttackDamage(1.50f),
                ExtraMaterialStats.DEFAULT,
                new LimbMaterialStats(1300, -0.25f, 0f, 0f),
                new GripMaterialStats(1.2f, -0.10f, 4f));

        addMaterialStats(ClancyCraftMaterialsIds.light,
                new HeadMaterialStats(1350, 7.5f, DIAMOND, 3f),
                HandleMaterialStats.DEFAULT.withDurability(1.3f).withMiningSpeed(1.1f).withAttackSpeed(0.95f).withAttackDamage(1.75f),
                ExtraMaterialStats.DEFAULT,
                new LimbMaterialStats(1350, -0.15f, 0.05f, 0.1f),
                new GripMaterialStats(1.3f, 0.5f, 4.5f));

        addMaterialStats(ClancyCraftMaterialsIds.dark,
                new HeadMaterialStats(1400, 8f, DIAMOND, 3.25f),
                HandleMaterialStats.DEFAULT.withDurability(1.4f).withMiningSpeed(1.2f).withAttackSpeed(0.95f).withAttackDamage(2f),
                ExtraMaterialStats.DEFAULT,
                new LimbMaterialStats(1400, -0.5f, 0.15f, 0.2f),
                new GripMaterialStats(1.4f, 0.15f, 5f));


        addMaterialStats(ClancyCraftMaterialsIds.lightmetal,
                new HeadMaterialStats(1450, 8.5f, DIAMOND, 3.5f),
                HandleMaterialStats.DEFAULT.withDurability(1.5f).withMiningSpeed(1.3f).withAttackSpeed(0.95f).withAttackDamage(2.25f),
                ExtraMaterialStats.DEFAULT,
                new LimbMaterialStats(1450, 0.5f, 0.25f, 0.3f),
                new GripMaterialStats(1.5f, 0.25f, 5.5f));



    }
}
