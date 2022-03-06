package net.astro367.odysseycraft.painting;

import net.astro367.odysseycraft.OdysseyCraft;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingMotive THEO = registerPainting("theo", new PaintingMotive(32,32));
    public static final PaintingMotive DAISYCAT = registerPainting("daisycat", new PaintingMotive(64,64));
    public static final PaintingMotive SHREK = registerPainting("shrek", new PaintingMotive(48, 48));

    private  static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(OdysseyCraft.MOD_ID, name), paintingMotive );
    }

    public  static  void registerPaintings() {
        OdysseyCraft.LOGGER.info("Registering Paintings for " + OdysseyCraft.MOD_ID);
    }

}
