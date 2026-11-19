package net.dust.worldofwhimsie.loot;

import net.dust.worldofwhimsie.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class ModLootTableModifiers {
    public static void modifyLootTables(ResourceKey<LootTable> key, FabricLootTableBuilder builder, LootTableSource source, HolderLookup.Provider provider) {
        if (key.identifier().equals(Identifier.withDefaultNamespace("blocks/cake"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1f))
                    .add(LootItem.lootTableItem(ModItems.CAKESLICE))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(7f)).build());

            builder.pool(poolBuilder.build());
        }
    }
}