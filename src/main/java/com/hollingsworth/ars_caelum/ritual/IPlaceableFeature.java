package com.hollingsworth.ars_caelum.ritual;

import com.hollingsworth.arsnouveau.common.block.tile.RitualBrazierTile;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public interface IPlaceableFeature {

    double distanceFromOthers();

    boolean onPlace(Level level, BlockPos pos, FeaturePlacementRitual placementRitual, RitualBrazierTile brazierTile);

    String getFeatureName();

}