package dev.prognitio.beyondthevoid.event;

import com.mojang.blaze3d.platform.InputConstants;
import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.networking.ActivateAbilityPacketCS;
import dev.prognitio.beyondthevoid.networking.Messages;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.lwjgl.glfw.GLFW;

import javax.swing.text.JTextComponent;

@Mod.EventBusSubscriber(modid = BeyondTheVoid.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvent {

    @SubscribeEvent
    public static void onKeyRegister(RegisterKeyMappingsEvent event) {
        event.register(Keybinding.FIRE_ABILITY_KEY);
    }

    @Mod.EventBusSubscriber(modid = BeyondTheVoid.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(Keybinding.FIRE_ABILITY_KEY.consumeClick()) {
                //trigger ability
                Messages.sendToServer(new ActivateAbilityPacketCS(true));
            }
        }
    }
}
