package net.dust.worldofwhimsie.datagen;

import net.dust.worldofwhimsie.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.impl.datagen.TagAliasGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> ANY_MUSHROOM = List.of(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM);
                shapeless(RecipeCategory.FOOD, ModItems.CHEESE)
                        .requires(Items.MILK_BUCKET)
                        .requires(Items.FERMENTED_SPIDER_EYE)
                        .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItems.BEEFSTEW)
                        .requires(Items.COOKED_BEEF)
                        .requires(Items.BAKED_POTATO)
                        .requires(Items.CARROT)
                        .requires(Ingredient.of(ANY_MUSHROOM.toArray(new ItemLike[0])))
                        .requires(Items.BOWL)
                        .unlockedBy(getHasName(Items.COOKED_BEEF), has(Items.COOKED_BEEF))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItems.CAKESLICE, 7)
                        .requires(Items.CAKE)
                        .requires(ItemTags.SWORDS)
                        .unlockedBy(getHasName(Items.CAKE), has(Items.CAKE))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "WorldofWhimsie Recipes";
    }
}
