package deizu.testmod.testmod.core.customblocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class JumpBlock extends Block {
    public JumpBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos blockpos, BlockState blockstate, Entity entity) {
        if(level.isClientSide()) {
             entity.push(0.0D,1.0D,0.0D);
            super.stepOn(level, blockpos, blockstate, entity);
        }
    }
}