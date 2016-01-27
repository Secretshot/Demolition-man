package com.ubersoldat.dman.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recepies {
	public static void init(){

		OreDictionary.registerOre("obsidian", Blocks.obsidian);
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.enrichedGunPowder, 2), new ItemStack(Items.gunpowder), "dustRedstone"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.superEnrichedGunPowder, 2), new ItemStack(ModItems.enrichedGunPowder), "dustGlowstone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Threex3x3), "XXX", "YYX", "XXX", 'Y', new ItemStack(ModItems.enrichedGunPowder) , 'X',"stone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Threex3x3, 1), "YXX", "YYX", "YXX", 'Y', new ItemStack(ModItems.enrichedGunPowder) , 'X',"stone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Threex3x3, 1), "YXX", "YYX", "YXX", 'Y', new ItemStack(ModItems.superEnrichedGunPowder) , 'X',"ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Threex3x3, 1), "YXX", "YYX", "YXX", 'Y',  new ItemStack(ModItems.superEnrichedGunPowder) , 'X',"obsidian"));

	}
}
