package com.sauuuuucey.sauuuuuceysfarming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;
import com.sauuuuucey.sauuuuuceysfarming.block.BarleyCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.CornCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.LettuceCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.PeanutCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.RiceCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.RyeCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.SorghumCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.SoybeanCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.TomatoCrop;
import com.sauuuuucey.sauuuuuceysfarming.block.YamCrop;
import com.sauuuuucey.sauuuuuceysfarming.config.ConfigHelper;
import com.sauuuuucey.sauuuuuceysfarming.config.ConfigHolder;
import com.sauuuuucey.sauuuuuceysfarming.init.ModGroup;
import com.sauuuuucey.sauuuuuceysfarming.world.OreGeneration;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = SauuuuuceysFarming.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber 
{
	private static final Logger LOGGER = LogManager.getLogger(SauuuuuceysFarming.MODID + " Mod Event Subscriber");
	
	@SubscribeEvent
	public static void onCommonSetup(final FMLCommonSetupEvent event) {
		OreGeneration.setupOreGeneration();
		LOGGER.debug("Common setup complete.");
	}
	/**
	 * This method will be called by Forge when it is time for the mod to register its Blocks.
	 * This method will always be called before the Item registry method.
	 */
	@SubscribeEvent
	public static void onRegisterBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll
		(
			//salt
			setup(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "salt_ore"),
			setup(new OreBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), "salt_block"),
			
			//crops
			setup(new BarleyCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "barley_crop"),
			setup(new CornCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "corn_crop"),
			setup(new LettuceCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "lettuce_crop"),
			setup(new PeanutCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "peanut_crop"),
			setup(new RiceCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "rice_crop"),
			setup(new RyeCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "rye_crop"),
			setup(new SorghumCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "sorghum_crop"),
			setup(new SoybeanCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "soybean_crop"),
			setup(new TomatoCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "tomato_crop"),
			setup(new YamCrop(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)), "yam_crop")

		);
		LOGGER.debug("Registered Blocks.");
	}
	/**
	 * This method will be called by Forge when it is time for the mod to register its Items.
	 * This method will always be called after the Block registry method.
	 */
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		//salt
		registry.registerAll
		(
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "salt")
			
		);
		
		//crops
		registry.registerAll
		(
			//edible raw crops
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "corn"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "sorghum"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "lettuce"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "barley"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "rye"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tomato"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "plantain"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "banana"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "orange"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "coconut"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "walnuts"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "almonds"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cherries"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "strawberry"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "blueberries"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "raspberries"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "grapes")
						
			//seeds
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "barley_seeds"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "corn_seeds"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "lettuce_seeds"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "peanuts"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "rice"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "rye_seeds"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "sorghum_seeds"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "soybeans"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "tomato_seeds"),
			//setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "yam")
			
		);
		
		//crafted foods
		registry.registerAll(
			//non-meats
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cheese"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "rice_bowl"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "nut_mix"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "salad"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "sorghum_bread"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "barley_bread"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "rye_bread"),
			
			//meats
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "salted_beef"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "salted_pork"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "salted_cod"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "salted_salmon"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "salted_mutton"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "salted_rotten_flesh"),
			
			//stews
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "beef_stew"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "pork_stew"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "chicken_stew"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "mutton_stew"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "rotten_flesh_stew")
				
		);
		
		//cooked foods
		registry.registerAll
		( 
			//non-meats
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cooked_corn"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "cooked_rice"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "fried_plantain"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "baked_yam"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "roasted_peanuts"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "roasted_almonds"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "roasted_walnuts"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "roasted_nut_mix"),
			
			//meats
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "smoked_beef"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "smoked_pork"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "smoked_cod"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "smoked_salmon"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "smoked_mutton"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "smoked_rotten_flesh")
	
		);
		
		//crafted drinks
		registry.registerAll
		( 
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "wheat_beer"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "sorghum_beer"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "barley_beer"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "rye_beer"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "orange_cider"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "strawberry_cider"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "blueberry_cider"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "raspberry_cider"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "coconut_cider"),
			setup(new Item(new Item.Properties().group(ModGroup.MOD_ITEM_GROUP)), "wine")
			
		);
		
		// We need to go over the entire registry so that we include any potential Registry Overrides
		for (final Block block : ForgeRegistries.BLOCKS.getValues()) {

			final ResourceLocation blockRegistryName = block.getRegistryName();
			// An extra safe-guard against badly registered blocks
			Preconditions.checkNotNull(blockRegistryName, "Registry Name of Block \"" + block + "\" is null! This is not allowed!");

			// Check that the blocks is from our mod, if not, continue to the next block
			if (!blockRegistryName.getNamespace().equals(SauuuuuceysFarming.MODID)) {
				continue;
			}
			
			// Make the properties, and make it so that the item will be on our ItemGroup (CreativeTab)
			final Item.Properties properties = new Item.Properties().group(ModGroup.MOD_ITEM_GROUP);
			// Create the new BlockItem with the block and it's properties
			final BlockItem blockItem = new BlockItem(block, properties);
			// Setup the new BlockItem with the block's registry name and register it
			registry.register(setup(blockItem, blockRegistryName));
		}
		LOGGER.debug("Registered Items");
	}
	
	@SubscribeEvent
	public static void onModConfigEvent(final ModConfig.ModConfigEvent event) {
		final ModConfig config = event.getConfig();
		// Rebake the configs when they change
		if (config.getSpec() == ConfigHolder.SERVER_SPEC) {
			ConfigHelper.bakeServer(config);
			LOGGER.debug("Baked server config");
		}
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(SauuuuuceysFarming.MODID, name));
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}
	
}
