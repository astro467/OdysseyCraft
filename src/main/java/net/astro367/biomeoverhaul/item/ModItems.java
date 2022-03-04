package net.astro367.biomeoverhaul.item;

import net.astro367.biomeoverhaul.BiomeOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
    public static final Item RHODONITE_GEM = registerItem("rhodonite_gem", new Item(new FabricItemSettings().group(ModItemGroup.BIOME)));
    public static final Item RHODONITE_SHARD = registerItem("rhodonite_shard", new Item(new FabricItemSettings().group(ModItemGroup.BIOME)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BiomeOverhaul.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BiomeOverhaul.LOGGER.info("Registering Mod Items for" + BiomeOverhaul.MOD_ID);
    }
}
