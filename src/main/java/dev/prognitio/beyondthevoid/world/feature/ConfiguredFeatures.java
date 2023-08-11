package dev.prognitio.beyondthevoid.world.feature;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.items.BlocksRegistry;
import dev.prognitio.beyondthevoid.world.feature.trees.CustomTreeConfig;
import dev.prognitio.beyondthevoid.world.feature.trees.SculkTreeFeature;
import net.minecraft.core.Registry;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;

public class ConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIG_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, BeyondTheVoid.MODID);

    /*
    public static final RegistryObject<ConfiguredFeature<?, ?>> SCULK_TREE = CONFIG_FEATURES.register("sculk_tree_config",
            () -> new ConfiguredFeature<>((SculkTreeFeature) CustomFeatures.SCULK_TREE_FEATURE.get(), new CustomTreeConfig(BlockStateProvider.simple(BlocksRegistry.SCULK_WOOD.get()),
                    BlockStateProvider.simple(BlocksRegistry.SCULK_LEAVES.get()),
                    new RandomSpreadFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), ConstantInt.of(2), 100), "big_tree")));



     */

    public static final RegistryObject<ConfiguredFeature<?, ?>> CANOPY_SCULK_TREE = CONFIG_FEATURES.register("canopy_sculk_tree_config",
            () -> new ConfiguredFeature<>((SculkTreeFeature) CustomFeatures.SCULK_TREE_FEATURE.get(), new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(BlocksRegistry.SCULK_WOOD.get()),
                    new BendingTrunkPlacer(10, 6, 3, 11, ConstantInt.of(6)),
                    BlockStateProvider.simple(BlocksRegistry.SCULK_LEAVES.get()),
                    new RandomSpreadFoliagePlacer(ConstantInt.of(16), ConstantInt.of(0), ConstantInt.of(3), 100),
                    new TwoLayersFeatureSize(1, 0, 2)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>> MASSIVE_SCULK_TREE = CONFIG_FEATURES.register("massive_sculk_tree_config",
            () -> new ConfiguredFeature<>((SculkTreeFeature) CustomFeatures.SCULK_TREE_FEATURE.get(), new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(BlocksRegistry.SCULK_WOOD.get()),
                    new GiantTrunkPlacer(10, 3, 3),
                    BlockStateProvider.simple(BlocksRegistry.SCULK_LEAVES.get()),
                    new RandomSpreadFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(8), 225),
                    new TwoLayersFeatureSize(1, 0, 2)).build()));

}
