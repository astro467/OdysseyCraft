package net.astro367.biomeoverhaul.item;

import net.astro367.biomeoverhaul.BiomeOverhaul;
import net.astro367.biomeoverhaul.item.custom.ModAxeItem;
import net.astro367.biomeoverhaul.item.custom.ModHoeItem;
import net.astro367.biomeoverhaul.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
    public static final Item RHODONITE_GEM = registerItem("rhodonite_gem", new Item(new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item RHODONITE_SHARD = registerItem("rhodonite_shard", new Item(new FabricItemSettings().group(ModItemGroup.BIOME)));

    //tools
    public static final Item INCIDIUM_SWORD = registerItem("incidium_sword", new SwordItem(ModToolMaterials.INCIDIUM, 6, 1.6f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_AXE = registerItem("incidium_axe", new ModAxeItem(ModToolMaterials.INCIDIUM, 8, 1.0f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_HOE = registerItem("incidium_hoe", new ModHoeItem(ModToolMaterials.INCIDIUM, 0, 1.0f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_SHOVEL = registerItem("incidium_shovel", new ShovelItem(ModToolMaterials.INCIDIUM, 1.6f, 7.5f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_PICKAXE = registerItem("incidium_pickaxe", new ModPickaxeItem(ModToolMaterials.INCIDIUM, 2, 1.2f, new FabricItemSettings().group(ModItemGroup.BIOME)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BiomeOverhaul.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BiomeOverhaul.LOGGER.info("Registering Mod Items for" + BiomeOverhaul.MOD_ID);
    }
}
