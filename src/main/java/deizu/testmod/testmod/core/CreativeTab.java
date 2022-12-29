package deizu.testmod.testmod.core;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab BLOCKS_TAB = new CreativeModeTab("blocks_tab") {

        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CONSTRUCTION_BLOCK.get());
        }
    };
    public static final CreativeModeTab ITEMS_TAB = new CreativeModeTab("items_tab") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.KILL_GEM.get());
        }
    };
}
