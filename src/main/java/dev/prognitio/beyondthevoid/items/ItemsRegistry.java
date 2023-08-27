package dev.prognitio.beyondthevoid.items;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.entity.EntityTypes;
import dev.prognitio.beyondthevoid.items.custom.curios.CharmOfAcceleration;
import dev.prognitio.beyondthevoid.items.custom.curios.CharmOfTeleportation;
import dev.prognitio.beyondthevoid.items.custom.curios.RingOfProjection;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

    public static final RegistryObject<Item> ANCIENT_KNIGHT_SPAWN_EGG = ITEMS.register(
            "ancient_knight_spawn_egg", () -> new ForgeSpawnEggItem(EntityTypes.ANCIENT_KNIGHT, 0x06002a, 0x050311, new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> TENEBRAE_INGOT = ITEMS.register(
            "tenebrae_ingot", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> VITALIZED_TENEBRAE_INGOT = ITEMS.register(
            "vitalized_tenebrae_ingot", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> VITALIZING_SAP = ITEMS.register(
            "vitalizing_sap", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> OBSIDIAN_NETHERITE_ALLOY = ITEMS.register(
            "obsidian_netherite_alloy", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> RAW_PRIMORDIAL_INGOT = ITEMS.register(
            "raw_primordial_ingot", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> PRIMORDIAL_INGOT = ITEMS.register(
            "primordial_ingot", () -> new Item(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> RING_OF_PROJECTION = ITEMS.register(
            "ring_of_projection", () -> new RingOfProjection(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> CHARM_OF_ACCELERATION = ITEMS.register(
            "charm_of_acceleration", () -> new CharmOfAcceleration(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Item> CHARM_OF_TELEPORTATION = ITEMS.register(
            "charm_of_teleportation", () -> new CharmOfTeleportation(new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

}
