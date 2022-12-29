package deizu.testmod.testmod.core.customitems;

import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class KillGemItem extends Item {
    public KillGemItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult interactLivingEntity(ItemStack item, Player player, LivingEntity entity, InteractionHand interactionHand) {
        ItemStack itemstack = player.getItemInHand(interactionHand);
        player.awardStat(Stats.ITEM_USED.get(this));
        if(entity.getType() != EntityType.PIG) {
            entity.kill();
            if(!player.getAbilities().instabuild) {
                itemstack.shrink(1);
        }
        }
        return super.interactLivingEntity(item, player, entity, interactionHand);
    }
}
