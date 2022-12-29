package deizu.testmod.testmod.core;

import deizu.testmod.testmod.core.customblocks.SelfJumpWandItem;
import deizu.testmod.testmod.core.customitems.KillGemItem;
import deizu.testmod.testmod.Testmod;
import deizu.testmod.testmod.core.customitems.JumpWandItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Testmod.MOD_ID);

    public static final RegistryObject<Item> CONSTRUCTION_BLOCK = ITEMS.register("construction_block", () ->
            new BlockItem(ModBlocks.CONSTRUCTION_BLOCK.get(), new Item.Properties().tab(CreativeTab.BLOCKS_TAB)));
    
    public static final RegistryObject<Item> FAST_SAND = ITEMS.register("fast_sand", () ->
            new BlockItem(ModBlocks.FAST_SAND.get(), new Item.Properties().tab(CreativeTab.BLOCKS_TAB)));

    public static final RegistryObject<KillGemItem> KILL_GEM = ITEMS.register("kill_gem", () ->
            new KillGemItem(new Item.Properties().tab(CreativeTab.ITEMS_TAB)));

    public static final RegistryObject<JumpWandItem> JUMP_WAND = ITEMS.register("jump_wand", () ->
            new JumpWandItem(new Item.Properties().tab(CreativeTab.ITEMS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> JUMP_BLOCK = ITEMS.register("jump_block", () ->
            new BlockItem(ModBlocks.JUMP_BLOCK.get(), new Item.Properties().tab(CreativeTab.BLOCKS_TAB)));

    public static final RegistryObject<Item> SELF_JUMP_WAND = ITEMS.register("self_jump_wand", () ->
            new SelfJumpWandItem(new Item.Properties().tab(CreativeTab.ITEMS_TAB)));
}
