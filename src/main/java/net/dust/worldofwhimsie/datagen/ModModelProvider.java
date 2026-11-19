package net.dust.worldofwhimsie.datagen;

import net.dust.worldofwhimsie.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.CHEESE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BEEFSTEW, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CAKESLICE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CUPCAKE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUICHE, ModelTemplates.FLAT_ITEM);

    }
}
