package com.sauuuuucey.sauuuuuceysfarming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sauuuuucey.sauuuuuceysfarming.config.ConfigHolder;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod("sauuuuuceysfarming")
public class SauuuuuceysFarming 
{
	public static final String MODID = "sauuuuuceysfarming";
	private static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public SauuuuuceysFarming() {
		LOGGER.info("Hello from Sauuuuucey's Farming!");
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		
		modLoadingContext.registerConfig(ModConfig.Type.SERVER, ConfigHolder.SERVER_SPEC);
	}
	
}
