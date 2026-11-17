package net.dust.worldofwhimsie.item;

import net.dust.worldofwhimsie.WorldofWhimsie;
import net.dust.worldofwhimsie.food.ModFoods;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item CHEESE = registerItem("cheese", properties -> new Item(properties.food(ModFoods.CHEESE)));



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(WorldofWhimsie.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(WorldofWhimsie.MOD_ID, name)))));
    }

    public static void registerModItems() {
        WorldofWhimsie.LOGGER.info("Registering Mod Items for " + WorldofWhimsie.MOD_ID);
    }
}
