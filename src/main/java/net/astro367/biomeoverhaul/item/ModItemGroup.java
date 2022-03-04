package net.astro367.biomeoverhaul.item;

import net.astro367.biomeoverhaul.BiomeOverhaul;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BIOME = FabricItemGroupBuilder.build(new Identifier(BiomeOverhaul.MOD_ID, "biome"),
            () -> new ItemStack(ModItems.RHODONITE_GEM));
}
