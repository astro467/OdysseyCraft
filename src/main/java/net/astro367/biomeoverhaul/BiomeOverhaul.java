package net.astro367.biomeoverhaul;

import net.astro367.biomeoverhaul.block.ModBlocks;
import net.astro367.biomeoverhaul.item.ModItems;
import net.astro367.biomeoverhaul.painting.ModPaintings;
import net.astro367.biomeoverhaul.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiomeOverhaul implements ModInitializer {
	public static final String MOD_ID = "biomeoverh";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModPaintings.registerPaintings();

		ModRegistries.registerStrippables();

	}
}
