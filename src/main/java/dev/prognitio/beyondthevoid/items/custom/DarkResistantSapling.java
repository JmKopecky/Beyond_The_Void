package dev.prognitio.beyondthevoid.items.custom;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;

public class DarkResistantSapling extends SaplingBlock {
    public DarkResistantSapling(AbstractTreeGrower p_55978_, Properties p_55979_) {
        super(p_55978_, p_55979_);
    }

    @Override
    public void randomTick(BlockState p_222011_, ServerLevel p_222012_, BlockPos p_222013_, RandomSource p_222014_) {
        if (!p_222012_.isAreaLoaded(p_222013_, 1)) return;
        if (p_222014_.nextInt(7) == 0) {
            this.advanceTree(p_222012_, p_222013_, p_222011_, p_222014_);
        }
    }

    @Override
    public boolean canSurvive(BlockState p_51028_, LevelReader p_51029_, BlockPos p_51030_) {
        return true;
    }
}
