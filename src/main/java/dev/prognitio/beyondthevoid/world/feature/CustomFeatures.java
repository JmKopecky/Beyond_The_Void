package dev.prognitio.beyondthevoid.world.feature;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.world.feature.trees.CustomTreeConfig;
import dev.prognitio.beyondthevoid.world.feature.trees.SculkTreeFeature;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CustomFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES_REGISTER = DeferredRegister.create(Registry.FEATURE_REGISTRY, BeyondTheVoid.MODID);

    public static final RegistryObject<Feature<TreeConfiguration>> SCULK_TREE_FEATURE = FEATURES_REGISTER.register("base_sculk_tree",
            () -> new SculkTreeFeature(TreeConfiguration.CODEC));
}
