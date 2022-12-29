package deizu.testmod.testmod.core;

import deizu.testmod.testmod.Testmod;
import deizu.testmod.testmod.core.customblocks.FastSandBlock;
import deizu.testmod.testmod.core.customblocks.JumpBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Testmod.MOD_ID);

    public static final RegistryObject<Block> CONSTRUCTION_BLOCK = BLOCKS.register("construction_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<FastSandBlock> FAST_SAND = BLOCKS.register("fast_sand", () ->
            new FastSandBlock(BlockBehaviour.Properties.of(Material.SAND).noCollission().sound(SoundType.SAND).strength(1.5F)));

    public static final RegistryObject<JumpBlock> JUMP_BLOCK = BLOCKS.register("jump_block", () ->
            new JumpBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(2.0F).requiresCorrectToolForDrops()));
}