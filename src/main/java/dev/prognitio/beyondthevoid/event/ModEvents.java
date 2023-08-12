package dev.prognitio.beyondthevoid.event;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.entity.EntityTypes;
import dev.prognitio.beyondthevoid.entity.custom.AncientKnight;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


public class ModEvents {

    @Mod.EventBusSubscriber(modid = BeyondTheVoid.MODID)
    public class ForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = BeyondTheVoid.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ModEventBus {

        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(EntityTypes.ANCIENT_KNIGHT.get(), AncientKnight.setAttributes());
        }
    }
}
