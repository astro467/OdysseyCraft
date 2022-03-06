package net.astro367.odysseycraft.item;

import net.astro367.odysseycraft.OdysseyCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ODYSSEY = FabricItemGroupBuilder.build(new Identifier(OdysseyCraft.MOD_ID, "odyssey"),
            () -> new ItemStack(ModItems.RHODONITE_GEM));
}
