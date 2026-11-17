package net.dust.wowfarmyardfriends;

import net.dust.wowfarmyardfriends.creativemodtab.ModCreativeModeTabs;
import net.dust.wowfarmyardfriends.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WOWFarmyardFriends implements ModInitializer {
	public static final String MOD_ID = "wowfarmyardfriends";
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
