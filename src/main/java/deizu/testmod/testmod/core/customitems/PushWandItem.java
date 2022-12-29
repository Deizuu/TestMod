package deizu.testmod.testmod.core.customitems;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

public class PushWandItem extends Item {
    public PushWandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack item, Player player, LivingEntity entity, InteractionHand hand) {
        double firstCoordX = entity.getX();
        double firstCoordY = entity.getY();
        double firstCoordZ = entity.getZ();

        double finalCoordX = entity.getX() - firstCoordX;
        double finalCoordY = entity.getY() - firstCoordY;
        double finalCoordZ = entity.getZ() - firstCoordZ;

        return super.interactLivingEntity(item, player, entity, hand);
    }
}

