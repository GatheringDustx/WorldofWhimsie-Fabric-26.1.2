package net.dust.wowfarmyardfriends.creativemodtab;

import net.dust.wowfarmyardfriends.WOWFarmyardFriends;
import net.dust.wowfarmyardfriends.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab WOW_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(WOWFarmyardFriends.MOD_ID, "wow_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHEESE))
                    .title(Component.translatable("creativemodtab.wowfarmyardfriends.wow_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.CHEESE);

                    }).build());


    public static void registerModCreativeModeTabs() {
        WOWFarmyardFriends.LOGGER.info("Registering Creative Mod Tabs for " + WOWFarmyardFriends.MOD_ID);
    }
}
