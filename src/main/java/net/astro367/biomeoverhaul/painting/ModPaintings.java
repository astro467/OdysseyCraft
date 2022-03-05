package net.astro367.biomeoverhaul.painting;

import net.astro367.biomeoverhaul.BiomeOverhaul;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingMotive THEO = registerPainting("theo", new PaintingMotive(32, 32));

    private  static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(BiomeOverhaul.MOD_ID, name), paintingMotive );
    }

    public  static  void registerPaintings() {
        BiomeOverhaul.LOGGER.info("Registering Paintings for " + BiomeOverhaul.MOD_ID);
    }

}
