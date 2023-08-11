package dev.prognitio.beyondthevoid.world.feature.trees;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.Objects;

/**
 *
 */
public final class CustomTreeConfig implements FeatureConfiguration {

    public static Codec<CustomTreeConfig> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    BlockStateProvider.CODEC.fieldOf("log").forGetter(CustomTreeConfig::log),
                    BlockStateProvider.CODEC.fieldOf("leaves").forGetter(CustomTreeConfig::leaves),
                    FoliagePlacer.CODEC.fieldOf("foliage_placer").forGetter(CustomTreeConfig::foliage_placer),
                    Codec.STRING.fieldOf("type").forGetter(CustomTreeConfig::type)
            ).apply(instance, CustomTreeConfig::new)
    );
    private final BlockStateProvider log;
    private final BlockStateProvider leaves;
    private final String type;
    private final FoliagePlacer foliage_placer;

    /**
     *
     */
    public CustomTreeConfig(BlockStateProvider log, BlockStateProvider leaves, FoliagePlacer foliage_placer, String type) {
        this.log = log;
        this.leaves = leaves;
        this.type = type;
        this.foliage_placer = foliage_placer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CustomTreeConfig) obj;
        return Objects.equals(this.log, that.log) &&
                Objects.equals(this.leaves, that.leaves);
    }

    @Override
    public String toString() {
        return "CustomTreeConfig[" +
                "log=" + log + ", " +
                "leaves=" + leaves + ']';
    }

    public BlockStateProvider log() {
        return log;
    }

    public BlockStateProvider leaves() {
        return leaves;
    }

    public String type() {
        return type;
    }

    public FoliagePlacer foliage_placer() {
        return foliage_placer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(log, leaves, type, foliage_placer);
    }


}
