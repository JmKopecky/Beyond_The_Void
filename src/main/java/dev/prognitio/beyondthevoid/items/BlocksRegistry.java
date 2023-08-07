package dev.prognitio.beyondthevoid.items;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

public class BlocksRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeyondTheVoid.MODID);
    public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeyondTheVoid.MODID);


    public static ToIntFunction<BlockState> lightLevel15 = BlockState -> 15;
    public static ToIntFunction<BlockState> lightLevel10 = BlockState -> 10;


    public static final RegistryObject<Block> VOID_RIFT_CORE = BLOCKS.register("void_rift_core",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0f).noOcclusion().lightLevel(lightLevel15)));
    public static final RegistryObject<Item> VOID_RIFT_CORE_ITEM = BLOCKITEMS.register("void_rift_core_item",
            () -> new BlockItem(VOID_RIFT_CORE.get(), new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Block> VOID_RIFT_PEDESTAL = BLOCKS.register("void_rift_pedestal",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0f).noOcclusion().lightLevel(lightLevel10)));
    public static final RegistryObject<Item> VOID_RIFT_PEDESTAL_ITEM = BLOCKITEMS.register("void_rift_pedestal_item",
            () -> new BlockItem(VOID_RIFT_PEDESTAL.get(), new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));

    public static final RegistryObject<Block> SCULK_PLANKS = BLOCKS.register("sculk_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f, 3.0f)));
    public static final RegistryObject<Item> SCULK_PLANKS_ITEM = BLOCKITEMS.register("sculk_planks_item",
            () -> new BlockItem(SCULK_PLANKS.get(), new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));
}
