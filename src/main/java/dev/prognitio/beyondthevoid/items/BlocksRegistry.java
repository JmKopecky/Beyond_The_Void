package dev.prognitio.beyondthevoid.items;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.items.custom.DarkResistantSapling;
import dev.prognitio.beyondthevoid.world.feature.trees.ActivatedSculkTreeGrower;
import dev.prognitio.beyondthevoid.world.feature.trees.SculkTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

public class BlocksRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeyondTheVoid.MODID);
    public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeyondTheVoid.MODID);


    public static ToIntFunction<BlockState> lightLevel15 = BlockState -> 15;
    public static ToIntFunction<BlockState> lightLevel13 = BlockState -> 13;
    public static ToIntFunction<BlockState> lightLevel10 = BlockState -> 10;
    public static ToIntFunction<BlockState> lightLevel5 = BlockState -> 5;


    public static final RegistryObject<Block> VOID_RIFT_CORE = BLOCKS.register("void_rift_core", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0f).noOcclusion().lightLevel(lightLevel15)));
    public static final RegistryObject<Item> VOID_RIFT_CORE_ITEM = defaultItem("void_rift_core", VOID_RIFT_CORE);

    public static final RegistryObject<Block> VOID_RIFT_PEDESTAL = BLOCKS.register("void_rift_pedestal", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0f).noOcclusion().lightLevel(lightLevel10)));
    public static final RegistryObject<Item> VOID_RIFT_PEDESTAL_ITEM = defaultItem("void_rift_pedestal", VOID_RIFT_PEDESTAL);

    public static final RegistryObject<Block> SCULK_STONE = BLOCKS.register("sculk_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(2.25f, 7.0f)));
    public static final RegistryObject<Item> SCULK_STONE_ITEM = defaultItem("sculk_stone", SCULK_STONE);

    public static final RegistryObject<Block> SCULK_SOIL = BLOCKS.register("sculk_soil", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BLUE).strength(1.75f, 6.0f)));
    public static final RegistryObject<Item> SCULK_SOIL_ITEM = defaultItem("sculk_soil", SCULK_SOIL);
    //trees and wood
    public static final RegistryObject<Block> SCULK_LEAVES = BLOCKS.register("sculk_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).color(MaterialColor.COLOR_BLUE)) {


        @Override
        public void randomTick(BlockState p_221379_, ServerLevel p_221380_, BlockPos p_221381_, RandomSource p_221382_) {
            //stop decay
        }

        @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 40;
                }
            });
    public static final RegistryObject<Item> SCULK_LEAVES_ITEM = defaultItem("sculk_leaves", SCULK_LEAVES);

    public static final RegistryObject<Block> SCULK_LOG = BLOCKS.register("sculk_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f, 3.0f))  {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 2;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 7;
                }
            });
    public static final RegistryObject<Item> SCULK_LOG_ITEM = defaultItem("sculk_log", SCULK_LOG);

    public static final RegistryObject<Block> SCULK_WOOD = BLOCKS.register("sculk_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f, 3.0f))  {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 2;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 7;
                }
            });
    public static final RegistryObject<Item> SCULK_WOOD_ITEM = defaultItem("sculk_wood", SCULK_WOOD);

    public static final RegistryObject<Block> SCULK_PLANKS = BLOCKS.register("sculk_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f, 3.0f))  {
                    @Override
                    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return true;
                    }

                    @Override
                    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 3;
                    }

                    @Override
                    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 10;
                    }
                });
    public static final RegistryObject<Item> SCULK_PLANKS_ITEM = defaultItem("sculk_planks", SCULK_PLANKS);

    public static final RegistryObject<Block> ACTIVATED_SCULK_LOG = BLOCKS.register("activated_sculk_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f, 3.0f).lightLevel(lightLevel13))  {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 1;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 3;
                }
            });
    public static final RegistryObject<Item> ACTIVATED_SCULK_LOG_ITEM = defaultItem("activated_sculk_log", ACTIVATED_SCULK_LOG);

    public static final RegistryObject<Block> ACTIVATED_SCULK_WOOD = BLOCKS.register("activated_sculk_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f, 3.0f).lightLevel(lightLevel13))  {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 1;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 3;
                }
            });
    public static final RegistryObject<Item> ACTIVATED_SCULK_WOOD_ITEM = defaultItem("activated_sculk_wood", ACTIVATED_SCULK_WOOD);
    //saplings
    public static final RegistryObject<Block> SCULK_SAPLING = BLOCKS.register("sculk_sapling", () -> new SaplingBlock(new SculkTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Item> SCULK_SAPLING_ITEM = defaultItem("sculk_sapling", SCULK_SAPLING);

    public static final RegistryObject<Block> ACTIVATED_SCULK_SAPLING = BLOCKS.register("activated_sculk_sapling", () -> new SaplingBlock(new ActivatedSculkTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Item> ACTIVATED_SCULK_SAPLING_ITEM = defaultItem("activated_sculk_sapling", ACTIVATED_SCULK_SAPLING);

    public static final RegistryObject<Block> SCULKLIGHT_ROSE = BLOCKS.register("sculklight_rose", () -> new FlowerBlock(MobEffects.DARKNESS, 5, BlockBehaviour.Properties.copy(Blocks.DANDELION).lightLevel(lightLevel5)));
    public static final RegistryObject<Item> SCULKLIGHT_ROSE_ITEM = defaultItem("sculklight_rose", SCULKLIGHT_ROSE);

    public static final RegistryObject<Block> POTTED_SCULKLIGHT_ROSE = BLOCKS.register("potted_sculklight_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), SCULKLIGHT_ROSE, BlockBehaviour.Properties.copy(Blocks.DANDELION).lightLevel(lightLevel5)));
    //public static final RegistryObject<Item> POTTED_SCULKLIGHT_ROSE_ITEM = defaultItem("potted_sculklight_rose", POTTED_SCULKLIGHT_ROSE);

    public static final RegistryObject<Block> REVITALIZED_SCULKLIGHT_ROSE = BLOCKS.register("revitalized_sculklight_rose", () -> new FlowerBlock(MobEffects.GLOWING, 5, BlockBehaviour.Properties.copy(Blocks.DANDELION).lightLevel(lightLevel10)));
    public static final RegistryObject<Item> REVITALIZED_SCULKLIGHT_ROSE_ITEM = defaultItem("revitalized_sculklight_rose", REVITALIZED_SCULKLIGHT_ROSE);

    public static final RegistryObject<Block> POTTED_REVITALIZED_SCULKLIGHT_ROSE = BLOCKS.register("potted_revitalized_sculklight_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REVITALIZED_SCULKLIGHT_ROSE, BlockBehaviour.Properties.copy(Blocks.DANDELION).lightLevel(lightLevel10)));


    private static RegistryObject<Item> defaultItem(String itemname, RegistryObject<Block> block) {
        RegistryObject<Item> output = null;
        output = BLOCKITEMS.register(itemname + "_item", () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeTabs.BEYONDTHEVOIDTAB)));
        return output;
    }

}
