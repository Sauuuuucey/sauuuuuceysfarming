package com.sauuuuucey.sauuuuuceysfarming.world;

import com.sauuuuucey.sauuuuuceysfarming.config.SauuuuuceysFarmingConfig;
import com.sauuuuucey.sauuuuuceysfarming.init.ModBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration 
{
	private static final CountRangeConfig salt_placement = new CountRangeConfig(20, 1, 1, 218);
	private static final int salt_size = 10;
	
	public static void setupOreGeneration() {
		
		for(Biome biome : ForgeRegistries.BIOMES)
			{
			if (SauuuuuceysFarmingConfig.enableSalt) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.salt_ore.getDefaultState(), salt_size), Placement.COUNT_RANGE, salt_placement));
			}

		}
	}
	
}

