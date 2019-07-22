package com.sauuuuucey.sauuuuuceysfarming.config;

import com.sauuuuucey.sauuuuuceysfarming.SauuuuuceysFarming;

import net.minecraftforge.common.ForgeConfigSpec;

/**
 * For configuration settings that change the behaviour of code on the LOGICAL SERVER.
 * This can be moved to an inner class of ExampleModConfig, but is separate because of personal preference and to keep the code organised
 *
 */
final class ServerConfig {
	
	final ForgeConfigSpec.BooleanValue serverEnableSaltOre;
	
	ServerConfig(final ForgeConfigSpec.Builder builder) {
		builder.push("general");
		serverEnableSaltOre = builder
				.comment("Enable Salt Ore generation?")
				.translation(SauuuuuceysFarming.MODID + ".config.serverEnableSaltOre")
				.define("serverEnableSaltOre", true);
		builder.pop();
	}
	
}
