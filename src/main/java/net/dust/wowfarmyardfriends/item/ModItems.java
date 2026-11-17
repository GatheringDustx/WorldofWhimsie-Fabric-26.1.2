package net.dust.wowfarmyardfriends.item;

import net.dust.wowfarmyardfriends.WOWFarmyardFriends;
import net.dust.wowfarmyardfriends.food.ModFoods;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item CHEESE = registerItem("cheese", properties -> new Item(properties.food(ModFoods.CHEESE)));



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(WOWFarmyardFriends.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(WOWFarmyardFriends.MOD_ID, name)))));
    }

    public static void registerModItems() {
        WOWFarmyardFriends.LOGGER.info("Registering Mod Items for " + WOWFarmyardFriends.MOD_ID);
    }
}
