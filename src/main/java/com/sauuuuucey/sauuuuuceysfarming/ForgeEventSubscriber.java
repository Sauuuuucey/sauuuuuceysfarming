package com.sauuuuucey.sauuuuuceysfarming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

/**
 * Subscribe to events from the FORGE EventBus that should be handled on both PHYSICAL sides in this class
 *
 */
@EventBusSubscriber(modid = SauuuuuceysFarming.MODID, bus = EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber 
{
	private static final Logger LOGGER = LogManager.getLogger(SauuuuuceysFarming.MODID + " Forge Event Subscriber.");
}
