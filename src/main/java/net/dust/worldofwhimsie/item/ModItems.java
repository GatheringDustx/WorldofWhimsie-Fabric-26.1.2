package net.dust.worldofwhimsie.item;

import net.dust.worldofwhimsie.WorldofWhimsie;
import net.dust.worldofwhimsie.food.ModFoods;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.function.Function;

public class ModItems {
    public static final Item CHEESE = registerItem("cheese", properties -> new Item(properties.food(ModFoods.CHEESE)));
    public static final Item BEEFSTEW = registerItem("beefstew", properties -> new Item(properties.stacksTo(1).food(ModFoods.BEEFSTEW).usingConvertsTo(Items.BOWL)));
    public static final Item CAKESLICE = registerItem("cakeslice", properties -> new Item(properties.food(ModFoods.CAKESLICE)));
    public static final Item CUPCAKE = registerItem("cupcake", properties -> new Item(properties.food(ModFoods.CUPCAKE)));
    public static final Item QUICHE = registerItem("quiche", properties -> new Item(properties.food(ModFoods.QUICHE)));



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(WorldofWhimsie.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(WorldofWhimsie.MOD_ID, name)))));
    }

    public static void registerModItems() {
        WorldofWhimsie.LOGGER.info("Registering Mod Items for " + WorldofWhimsie.MOD_ID);
    }
}
