package dev.prognitio.beyondthevoid.event;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BeyondTheVoid.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {
        //EntityRenderers.register(EntityRegister.SPELL_PROJECTILE.get(), SpellProjectileRenderer::new);
    }
}
