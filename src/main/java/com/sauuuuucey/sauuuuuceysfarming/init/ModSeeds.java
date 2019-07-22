package com.sauuuuucey.sauuuuuceysfarming.init;

import com.sauuuuucey.sauuuuuceysfarming.ModUtil;
import com.sauuuuucey.sauuuuuceysfarming.SauuuuuceysFarming;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SauuuuuceysFarming.MODID)
@EventBusSubscriber(modid = SauuuuuceysFarming.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModSeeds extends BlockNamedItem 
{
	public ModSeeds(Block crop, String name) {
		super(crop, new Item.Properties().group(ModGroup.MOD_ITEM_GROUP).maxStackSize(64));
		this.setRegistryName(new ResourceLocation(SauuuuuceysFarming.MODID, name));
	}
	
	public static ModSeeds barley_seeds = ModUtil._null();
	public static ModSeeds corn_seeds = ModUtil._null();
	public static ModSeeds lettuce_seeds = ModUtil._null();
	public static ModSeeds peanuts = ModUtil._null();
	public static ModSeeds rice = ModUtil._null();
	public static ModSeeds rye_seeds = ModUtil._null();
	public static ModSeeds sorghum_seeds = ModUtil._null();
	public static ModSeeds soybeans = ModUtil._null();
	public static ModSeeds tomato_seeds = ModUtil._null();
	public static ModSeeds yam = ModUtil._null();

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		registry.registerAll
		(
				new ModSeeds(ModBlocks.barley_crop, "barley_seeds"),
				new ModSeeds(ModBlocks.corn_crop, "corn_seeds"),
				new ModSeeds(ModBlocks.lettuce_crop, "lettuce_seeds"),
				new ModSeeds(ModBlocks.peanut_crop, "peanuts"),
				new ModSeeds(ModBlocks.rice_crop, "rice"),
				new ModSeeds(ModBlocks.rye_crop, "rye_seeds"),
				new ModSeeds(ModBlocks.sorghum_crop, "sorghum_seeds"),
				new ModSeeds(ModBlocks.soybean_crop, "soybeans"),
				new ModSeeds(ModBlocks.tomato_crop, "tomato_seeds"),
				new ModSeeds(ModBlocks.yam_crop, "yam")
				
		);
	}
}
