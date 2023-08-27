package dev.prognitio.beyondthevoid.networking;

import dev.prognitio.beyondthevoid.effects.ModEffects;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ActivateAbilityPacketCS {

    private final boolean isPressed;


    public ActivateAbilityPacketCS(boolean isPressed) {
        this.isPressed = isPressed;
    }
    public ActivateAbilityPacketCS(
            FriendlyByteBuf buf) {
        this.isPressed = buf.readBoolean();
    }
    public void toBytes(FriendlyByteBuf buf) {
        buf.writeBoolean(isPressed);

    }
    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            supplier.get().getSender().addEffect(new MobEffectInstance(ModEffects.ABILITY_CHARGING_EFFECT.get(), 2, 1));
        });
        return true;
    }


}
