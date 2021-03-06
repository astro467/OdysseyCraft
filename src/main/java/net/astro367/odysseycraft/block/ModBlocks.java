package net.astro367.odysseycraft.block;

import net.astro367.odysseycraft.OdysseyCraft;
import net.astro367.odysseycraft.block.custom.*;
import net.astro367.odysseycraft.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    //blocks
    public static final Block RHODONITE_BLOCK = registerBlock("rhodonite_block", new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_LOG = registerBlock("redwood_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ODYSSEY);
    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.ODYSSEY);
    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_BUTTON = registerBlock("redwood_button", new ModWoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_PRESSURE_PLATE = registerBlock("redwood_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_FENCE = registerBlock("redwood_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_FENCE_GATE = registerBlock("redwood_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_SLAB = registerBlock("redwood_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_STAIRS = registerBlock("redwood_stairs", new ModStairsBlock(ModBlocks.REDWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_DOOR = registerBlock("redwood_door", new ModDoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)), ModItemGroup.ODYSSEY);
    public static final Block REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)), ModItemGroup.ODYSSEY);
    public static final Block RHODONITE_ORE = registerBlock("rhodonite_ore", new Block(FabricBlockSettings.copy(Blocks.DIAMOND_ORE)), ModItemGroup.ODYSSEY);

    private static Block registerBlock(String name, Block block, ItemGroup group) {registerBlockItem(name, block, group);return Registry.register(Registry.BLOCK, new Identifier(OdysseyCraft.MOD_ID, name), block);}
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {return Registry.register(Registry.ITEM, new Identifier(OdysseyCraft.MOD_ID, name),new BlockItem(block, new FabricItemSettings().group(group)));}

    public static void registerModBlocks() {
        OdysseyCraft.LOGGER.info("Registering ModBlocks for " + OdysseyCraft.MOD_ID);
    }

}
