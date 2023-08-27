package dev.prognitio.beyondthevoid.items.custom.curios;

import dev.prognitio.beyondthevoid.effects.ModEffects;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;

public class RingOfProjection extends Item implements ICurioItem {

    public RingOfProjection(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void curioTick(SlotContext context, ItemStack stack) {
        if (!(context.entity().hasEffect(ModEffects.BLADE_PROJECTION_EFFECT.get()))) {
            int effectDuration = 20;
            int effectModifier = 4;
            context.entity().addEffect(new MobEffectInstance(ModEffects.BLADE_PROJECTION_EFFECT.get(), effectDuration, effectModifier));
        }
        ICurioItem.super.curioTick(context, stack);
    }

    @Override
    public void appendHoverText(ItemStack item, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.literal("Projects the edge of your blade further, allowing you to hit targets further away.").withStyle(ChatFormatting.AQUA));

        if (Screen.hasShiftDown()) {
            components.add(Component.literal("(Applies Blade Projection V)").withStyle(ChatFormatting.BLUE));
        }

        super.appendHoverText(item, level, components, tooltipFlag);
    }
}
