package net.dust.worldofwhimsie;

import net.dust.worldofwhimsie.creativemodetab.ModCreativeModeTabs;
import net.dust.worldofwhimsie.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldofWhimsie implements ModInitializer {
	public static final String MOD_ID = "worldofwhimsie";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
