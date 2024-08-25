package modtutorial.modtutorial.item.custom;

import modtutorial.modtutorial.sounds.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModItemSound extends Item {
    public ModItemSound(Properties p_41383_) {
        super(p_41383_);
    }
    
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        BlockPos blockPos = player.getOnPos();
        level.playLocalSound(blockPos, SoundEvents.AMETHYST_BLOCK_BREAK, SoundSource.PLAYERS,1.0f,1.0f,true);
        System.out.println("llegue");

//        if (itemstack.isEdible()) {
//            if (player.canEat(itemstack.getFoodProperties(player).canAlwaysEat())) {
//                player.startUsingItem(hand);
//                return InteractionResultHolder.consume(itemstack);
//            } else {
//                return InteractionResultHolder.fail(itemstack);
//            }
//        } else {
//            return InteractionResultHolder.pass(player.getItemInHand(hand));
//        }
        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }
    
}
