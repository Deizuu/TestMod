package deizu.testmod.testmod.core.customblocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class FastSandBlock extends Block {
    public FastSandBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void entityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity) {
        super.entityInside(blockState, level, blockPos, entity);
        entity.makeStuckInBlock(blockState, new Vec3(0.2D, 0.2D, 0.2D));
    }
}

