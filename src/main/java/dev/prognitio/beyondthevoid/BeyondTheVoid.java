package dev.prognitio.beyondthevoid;

import com.mojang.logging.LogUtils;
import dev.prognitio.beyondthevoid.items.BlocksRegistry;
import dev.prognitio.beyondthevoid.items.ItemsRegistry;
import dev.prognitio.beyondthevoid.world.feature.ConfiguredFeatures;
import dev.prognitio.beyondthevoid.world.feature.CustomFeatures;
import dev.prognitio.beyondthevoid.world.feature.PlacedFeatures;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BeyondTheVoid.MODID)
public class BeyondTheVoid
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "beyondthevoid";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public BeyondTheVoid()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ItemsRegistry.ITEMS.register(modEventBus);
        BlocksRegistry.BLOCKS.register(modEventBus);
        BlocksRegistry.BLOCKITEMS.register(modEventBus);
        CustomFeatures.FEATURES_REGISTER.register(modEventBus);
        ConfiguredFeatures.CONFIG_FEATURES.register(modEventBus);
        PlacedFeatures.PLACED_FEATURES.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code

        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlocksRegistry.SCULKLIGHT_ROSE.getId(), BlocksRegistry.POTTED_SCULKLIGHT_ROSE);
        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code

        }
    }
}
