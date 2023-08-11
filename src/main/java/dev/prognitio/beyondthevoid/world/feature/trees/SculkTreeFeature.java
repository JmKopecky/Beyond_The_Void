package dev.prognitio.beyondthevoid.world.feature.trees;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

public class SculkTreeFeature extends TreeFeature {
    public SculkTreeFeature(Codec<TreeConfiguration> p_67201_) {
        super(p_67201_);
    }

    @Override
    public boolean place(TreeConfiguration p_225029_, WorldGenLevel world, ChunkGenerator p_225031_, RandomSource p_225032_, BlockPos target) {
        if (isDirt(world.getBlockState(target.below()))) {
            return super.place(p_225029_, world, p_225031_, p_225032_, target);
        }
        return false;
    }
}
