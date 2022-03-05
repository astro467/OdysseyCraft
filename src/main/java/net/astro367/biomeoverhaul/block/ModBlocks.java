package net.astro367.biomeoverhaul.block;

import net.astro367.biomeoverhaul.BiomeOverhaul;
import net.astro367.biomeoverhaul.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    //blocks
    public static final Block RHODONITE_BLOCK = registerBlock("rhodonite_block", new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK)), ModItemGroup.BIOME);
    public static final Block REDWOOD_LOG = registerBlock("redwood_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.BIOME);
    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.BIOME);
    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.BIOME);
    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.BIOME);
    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.BIOME);




    private static Block registerBlock(String name, Block block, ItemGroup group) {registerBlockItem(name, block, group);return Registry.register(Registry.BLOCK, new Identifier(BiomeOverhaul.MOD_ID, name), block);}
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {return Registry.register(Registry.ITEM, new Identifier(BiomeOverhaul.MOD_ID, name),new BlockItem(block, new FabricItemSettings().group(group)));}

    public static void registerModBlocks() {
        BiomeOverhaul.LOGGER.info("Registering ModBlocks for " + BiomeOverhaul.MOD_ID);
    }

}
