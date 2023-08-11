package dev.prognitio.beyondthevoid.world.feature;


import com.google.common.collect.ImmutableList;
import dev.prognitio.beyondthevoid.BeyondTheVoid;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, BeyondTheVoid.MODID);

    public static final RegistryObject<PlacedFeature> CANOPY_SCULK_TREE_PLACED = PLACED_FEATURES.register("canopy_sculk_tree_placed",
            () -> new PlacedFeature(ConfiguredFeatures.CANOPY_SCULK_TREE.getHolder().get(), ImmutableList.<PlacementModifier>builder().add(InSquarePlacement.spread()).add(PlacementUtils.countExtra(156, 1.0f, 100)).add(
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-31), VerticalAnchor.absolute(481))).build()));

    public static final RegistryObject<PlacedFeature> MASSIVE_SCULK_TREE_PLACED = PLACED_FEATURES.register("massive_sculk_tree_placed",
            () -> new PlacedFeature(ConfiguredFeatures.MASSIVE_SCULK_TREE.getHolder().get(), ImmutableList.<PlacementModifier>builder().add(InSquarePlacement.spread()).add(PlacementUtils.countExtra(156, 1.0f, 100)).add(
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-31), VerticalAnchor.absolute(481))).build()));

}
