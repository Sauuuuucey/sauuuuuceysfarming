package com.sauuuuucey.sauuuuuceysfarming.item.food;

import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoods extends Foods {
	
	//raw foods
	public static final Food corn = (new Food.Builder()).hunger(4).saturation(3.6f).build();
	public static final Food sorghum = (new Food.Builder()).hunger(1).saturation(1.0f).build();
	public static final Food lettuce = (new Food.Builder()).hunger(3).saturation(1.5f).build();
	public static final Food tomato = (new Food.Builder()).hunger(1).saturation(0.6f).build();
	public static final Food banana = (new Food.Builder()).hunger(3).saturation(2.4f).build();
	public static final Food orange = (new Food.Builder()).hunger(3).saturation(2.4f).build();
	public static final Food peanuts = (new Food.Builder()).hunger(2).saturation(1.2f).build();	
	public static final Food walnuts = (new Food.Builder()).hunger(2).saturation(1.2f).build();
	public static final Food almonds = (new Food.Builder()).hunger(2).saturation(1.2f).build();
	public static final Food cherries = (new Food.Builder()).hunger(2).saturation(1.2f).build();
	public static final Food strawberry = (new Food.Builder()).hunger(2).saturation(1.2f).build();
	public static final Food blueberries = (new Food.Builder()).hunger(2).saturation(1.2f).build();
	public static final Food raspberries = (new Food.Builder()).hunger(2).saturation(1.2f).build();
	public static final Food grapes = (new Food.Builder()).hunger(3).saturation(1.2f).build();

	//crafted foods
	public static final Food cheese = (new Food.Builder()).hunger(4).saturation(3.6f).build();
	public static final Food rice_bowl = (new Food.Builder()).hunger(5).saturation(4.0f).build();
	public static final Food nut_mix = (new Food.Builder()).hunger(3).saturation(4.0f).build();
	public static final Food salad = (new Food.Builder()).hunger(4).saturation(7.0f).build();
	public static final Food sorghum_bread = (new Food.Builder()).hunger(5).saturation(6.0f).build();
	public static final Food barley_bread = (new Food.Builder()).hunger(5).saturation(6.0f).build();
	public static final Food rye_bread = (new Food.Builder()).hunger(5).saturation(6.0f).build();
	public static final Food salted_beef = (new Food.Builder()).hunger(4).saturation(1.8f).meat().build();
	public static final Food salted_pork = (new Food.Builder()).hunger(5).saturation(1.8f).meat().build();
	public static final Food salted_cod = (new Food.Builder()).hunger(3).saturation(0.8f).meat().build();
	public static final Food salted_salmon = (new Food.Builder()).hunger(3).saturation(0.8f).meat().build();
	public static final Food salted_mutton = (new Food.Builder()).hunger(3).saturation(1.2f).meat().build();
	public static final Food beef_stew = buildStew(10);
	public static final Food pork_stew = buildStew(10);
	public static final Food chicken_stew = buildStew(10);
	public static final Food mutton_stew = buildStew(10);

	//cooked foods
	public static final Food cooked_corn = (new Food.Builder()).hunger(4).saturation(4.8f).build();
	public static final Food cooked_rice = (new Food.Builder()).hunger(3).saturation(3.6f).build();
	public static final Food fried_plantain = (new Food.Builder()).hunger(4).saturation(2.4f).build();
	public static final Food baked_yam = (new Food.Builder()).hunger(5).saturation(6.0f).build();
	public static final Food roasted_peanuts = (new Food.Builder()).hunger(3).saturation(2.4f).build();
	public static final Food roasted_almonds = (new Food.Builder()).hunger(3).saturation(2.4f).build();
	public static final Food roasted_walnuts = (new Food.Builder()).hunger(3).saturation(2.4f).build();
	public static final Food roasted_nut_mix = (new Food.Builder()).hunger(4).saturation(5.0f).build();
	public static final Food smoked_beef = (new Food.Builder()).hunger(10).saturation(12.8f).build();
	public static final Food smoked_pork = (new Food.Builder()).hunger(10).saturation(12.8f).meat().build();
	public static final Food smoked_cod = (new Food.Builder()).hunger(7).saturation(6.0f).meat().build();
	public static final Food smoked_salmon = (new Food.Builder()).hunger(8).saturation(9.6f).meat().build();
	public static final Food smoked_mutton = (new Food.Builder()).hunger(8).saturation(9.6f).meat().build();
	
	//special foods
	public static final Food coconut = (new Food.Builder()).hunger(1).saturation(0.8f).effect(new EffectInstance(Effects.NAUSEA, 300, 0), 0.3F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.8F).build();
	public static final Food salted_rotten_flesh = (new Food.Builder()).hunger(5).saturation(0.8f).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.8F).meat().build();
	public static final Food rotten_flesh_stew = (new Food.Builder()).hunger(5).saturation(1.2f).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.8F).build();
	public static final Food smoked_rotten_flesh = (new Food.Builder()).hunger(6).saturation(2.4f).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.8F).meat().build();

	public static final Food wheat_beer = (new Food.Builder()).hunger(2).saturation(2.4f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food sorghum_beer = (new Food.Builder()).hunger(2).saturation(2.4f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food barley_beer = (new Food.Builder()).hunger(2).saturation(2.4f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food rye_beer = (new Food.Builder()).hunger(2).saturation(2.4f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food orange_cider = (new Food.Builder()).hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food strawberry_cider = (new Food.Builder()).hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food blueberry_cider = (new Food.Builder()).hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food raspberry_cider = (new Food.Builder()).hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food coconut_cider = (new Food.Builder()).hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();
	public static final Food wine = (new Food.Builder()).hunger(2).saturation(1.2f).effect(new EffectInstance(Effects.NAUSEA, 100, 0), 0.3F).build();

	
	private static Food buildStew(int p_221412_0_) {
		return (new Food.Builder()).hunger(p_221412_0_).saturation(0.6F).build();
	}
}
