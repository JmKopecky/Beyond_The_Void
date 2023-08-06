package dev.prognitio.beyondthevoid.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {

    public static final CreativeModeTab BEYONDTHEVOIDTAB = new CreativeModeTab("beyond_the_void_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.SONIC_CORE.get());
        }
    };
}
