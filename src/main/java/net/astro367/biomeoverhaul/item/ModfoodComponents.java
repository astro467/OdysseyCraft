package net.astro367.biomeoverhaul.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModfoodComponents {

    public static final FoodComponent GARLIC_BREAD = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.8F) .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 2), 0.6F).meat().build();

}
