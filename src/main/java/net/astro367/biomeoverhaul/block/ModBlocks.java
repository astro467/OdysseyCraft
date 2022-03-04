package net.astro367.biomeoverhaul.block;

import net.astro367.biomeoverhaul.BiomeOverhaul;
import net.astro367.biomeoverhaul.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    //blocks
    public static final Block RHODONITE_BLOCK = registerBlock("rhodonite_block", new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK)), ModItemGroup.BIOME);



    private static Block registerBlock(String name, Block block, ItemGroup group) {registerBlockItem(name, block, group);return Registry.register(Registry.BLOCK, new Identifier(BiomeOverhaul.MOD_ID, name), block);}
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {return Registry.register(Registry.ITEM, new Identifier(BiomeOverhaul.MOD_ID, name),new BlockItem(block, new FabricItemSettings().group(group)));}

    public static void registerModBlocks() {
        BiomeOverhaul.LOGGER.info("Registering ModBlocks for " + BiomeOverhaul.MOD_ID);
    }

}
