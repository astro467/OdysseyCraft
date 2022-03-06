package net.astro367.odysseycraft;

import net.astro367.odysseycraft.block.ModBlocks;
import net.astro367.odysseycraft.item.ModItems;
import net.astro367.odysseycraft.painting.ModPaintings;
import net.astro367.odysseycraft.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OdysseyCraft implements ModInitializer {
	public static final String MOD_ID = "odys";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModPaintings.registerPaintings();

		ModRegistries.registerStrippables();

	}
}
