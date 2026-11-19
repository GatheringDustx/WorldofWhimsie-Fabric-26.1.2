package net.dust.worldofwhimsie.creativemodetab;

import net.dust.worldofwhimsie.WorldofWhimsie;
import net.dust.worldofwhimsie.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab WOW_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(WorldofWhimsie.MOD_ID, "wow_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHEESE))
                    .title(Component.translatable("creativemodetab.worldofwhimsie.wow_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BEEFSTEW);
                        output.accept(ModItems.CAKESLICE);
                        output.accept(ModItems.CHEESE);
                        output.accept(ModItems.CUPCAKE);
                        output.accept(ModItems.QUICHE);

                    }).build());


    public static void registerModCreativeModeTabs() {
        WorldofWhimsie.LOGGER.info("Registering Creative Mod Tabs for " + WorldofWhimsie.MOD_ID);
    }
}
