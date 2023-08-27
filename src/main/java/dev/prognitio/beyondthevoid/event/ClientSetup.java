package dev.prognitio.beyondthevoid.event;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.entity.EntityTypes;
import dev.prognitio.beyondthevoid.entity.projectile.TeleportationProjectileRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BeyondTheVoid.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {
        //EntityRenderers.register(EntityRegister.SPELL_PROJECTILE.get(), SpellProjectileRenderer::new);
        EntityRenderers.register(EntityTypes.TELEPORTATION_PROJECTILE.get(), TeleportationProjectileRenderer::new);
    }
}
