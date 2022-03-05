package net.astro367.biomeoverhaul.item;

import net.astro367.biomeoverhaul.BiomeOverhaul;
import net.astro367.biomeoverhaul.item.custom.ModAxeItem;
import net.astro367.biomeoverhaul.item.custom.ModHoeItem;
import net.astro367.biomeoverhaul.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
    public static final Item RHODONITE_GEM = registerItem("rhodonite_gem", new Item(new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item RHODONITE_SHARD = registerItem("rhodonite_shard", new Item(new FabricItemSettings().group(ModItemGroup.BIOME)));

    //tools
    public static final Item INCIDIUM_SWORD = registerItem("incidium_sword", new SwordItem(ModToolMaterials.INCIDIUM, 6, -2.4f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_AXE = registerItem("incidium_axe", new ModAxeItem(ModToolMaterials.INCIDIUM, 8, -3.0f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_HOE = registerItem("incidium_hoe", new ModHoeItem(ModToolMaterials.INCIDIUM, 0, -3.0f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_SHOVEL = registerItem("incidium_shovel", new ShovelItem(ModToolMaterials.INCIDIUM, 1.5f, -2.4f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_PICKAXE = registerItem("incidium_pickaxe", new ModPickaxeItem(ModToolMaterials.INCIDIUM, 2, -2.8f, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_HELMET = registerItem("incidium_helmet", new ArmorItem(ModArmorMaterials.INCIDIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_CHESTPLATE  = registerItem("incidium_chestplate", new ArmorItem(ModArmorMaterials.INCIDIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_LEGGINGS = registerItem("incidium_leggings", new ArmorItem(ModArmorMaterials.INCIDIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item INCIDIUM_BOOTS  = registerItem("incidium_boots", new ArmorItem(ModArmorMaterials.INCIDIUM, EquipmentSlot.FEET , new FabricItemSettings().group(ModItemGroup.BIOME)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BiomeOverhaul.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BiomeOverhaul.LOGGER.info("Registering Mod Items for" + BiomeOverhaul.MOD_ID);
    }
}
