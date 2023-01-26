package com.hollingsworth.ars_caelum.ritual;

import com.hollingsworth.ars_caelum.ArsCaelum;
import com.hollingsworth.ars_caelum.lib.RitualLang;
import com.hollingsworth.ars_caelum.ritual.features.BonemealFeature;
import com.hollingsworth.ars_caelum.ritual.features.FlowerFeature;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FloweringRitual extends FeaturePlacementRitual {

    List<Block> flowers;

    public FloweringRitual() {
        flowers = new ArrayList<>();
        flowers.addAll(Arrays.asList(Blocks.DANDELION, Blocks.POPPY, Blocks.BLUE_ORCHID, Blocks.ALLIUM, Blocks.AZURE_BLUET, Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.WHITE_TULIP, Blocks.PINK_TULIP, Blocks.OXEYE_DAISY, Blocks.CORNFLOWER, Blocks.LILY_OF_THE_VALLEY, Blocks.SUNFLOWER, Blocks.LILAC, Blocks.PEONY, Blocks.ROSE_BUSH));

    }

    @Override
    void addFeatures(List<IPlaceableFeature> features) {
        features.add(new FlowerFeature(1.5, 0.8, () -> flowers.get(getWorld().random.nextInt(flowers.size())).defaultBlockState()));
        features.add(new BonemealFeature(8));
    }

    @Override
    public ResourceLocation getRegistryName() {
        return new ResourceLocation(ArsCaelum.MODID, RitualLang.FLOWERING);
    }
}