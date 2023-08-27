package dev.prognitio.beyondthevoid.items.custom.curios;

import dev.prognitio.beyondthevoid.effects.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.Column;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class CharmOfTeleportation extends Item implements ICurioItem {

    public CharmOfTeleportation(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        if (slotContext.entity().hasEffect(ModEffects.ABILITY_CHARGING_EFFECT.get())) {
            LivingEntity entity = slotContext.entity();
            int remainingDuration = entity.getEffect(ModEffects.ABILITY_CHARGING_EFFECT.get()).getDuration();
            if (remainingDuration == 1) {
                if (entity instanceof Player && ((Player) entity).getCooldowns().isOnCooldown(stack.getItem())) {
                    return;
                }
                //activate ability
                //create what is basically an ender pearl and shoot that.


                entity.removeEffect(ModEffects.ABILITY_CHARGING_EFFECT.get());
                //add cooldown
                if (entity instanceof Player) {
                    Player player = (Player) entity;
                    player.getCooldowns().addCooldown(stack.getItem(), 20);
                }
            }
        }
        slotContext.entity().addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20));
        ICurioItem.super.curioTick(slotContext, stack);
    }
}
