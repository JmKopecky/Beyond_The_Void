package dev.prognitio.beyondthevoid.items.custom.curios;

import dev.prognitio.beyondthevoid.effects.ModEffects;
import dev.prognitio.beyondthevoid.event.Keybinding;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;

public class CharmOfAcceleration extends Item implements ICurioItem {

    public CharmOfAcceleration(Properties p_41383_) {
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

                Vec3 lookAngle = entity.getViewVector(0);
                lookAngle = lookAngle.scale(2);
                entity.setDeltaMovement(lookAngle);

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

    @Override
    public void appendHoverText(ItemStack item, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.literal("This charm uses the power of the wind to accelerate your movements.").withStyle(ChatFormatting.AQUA));

        if (Screen.hasShiftDown()) {
            Keybinding.FIRE_ABILITY_KEY.getKey().getName();
            components.add(Component.literal("ACTIVE ABILITY: amplifies the movement of the user by 5 times.").withStyle(ChatFormatting.BLUE));
            components.add(Component.literal("(Applies Speed 1)").withStyle(ChatFormatting.BLUE));
        }

        super.appendHoverText(item, level, components, tooltipFlag);
    }
}
