package dev.prognitio.beyondthevoid.items;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeyondTheVoid.MODID);

    //Item warden drops on death, used in ancient focus
    public static final RegistryObject<Item> SONIC_CORE = ITEMS.register(
            "sonic_core", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));
    //Ancient focus, used in portal structure to reach the 1st dimension
    public static final RegistryObject<Item> ANCIENT_FOCUS = ITEMS.register(
            "ancient_focus", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));
    //focus used in creation of portal building block
    public static final RegistryObject<Item> VOID_FOCUS = ITEMS.register(
            "void_focus", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));
}
