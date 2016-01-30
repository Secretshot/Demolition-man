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

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Threex3x6), new ItemStack(ModBlocks.Threex3x3),new ItemStack(ModBlocks.Threex3x3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Threex3x9), new ItemStack(ModBlocks.Threex3x6),new ItemStack(ModBlocks.Threex3x3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Threex3x9), new ItemStack(ModBlocks.Threex3x3),new ItemStack(ModBlocks.Threex3x3),new ItemStack(ModBlocks.Threex3x3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Threex3x12), new ItemStack(ModBlocks.Threex3x3),new ItemStack(ModBlocks.Threex3x3),new ItemStack(ModBlocks.Threex3x3), new ItemStack(ModBlocks.Threex3x3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Threex3x12), new ItemStack(ModBlocks.Threex3x6),new ItemStack(ModBlocks.Threex3x3),new ItemStack(ModBlocks.Threex3x3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Threex3x12), new ItemStack(ModBlocks.Threex3x6),new ItemStack(ModBlocks.Threex3x6));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Threex3x15), new ItemStack(ModBlocks.Threex3x6),new ItemStack(ModBlocks.Threex3x9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Threex3x15), new ItemStack(ModBlocks.Threex3x3),new ItemStack(ModBlocks.Threex3x3),new ItemStack(ModBlocks.Threex3x3), new ItemStack(ModBlocks.Threex3x3), new ItemStack(ModBlocks.Threex3x3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Fivex5x10), new ItemStack(ModBlocks.Fivex5x5),new ItemStack(ModBlocks.Fivex5x5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Fivex5x15), new ItemStack(ModBlocks.Fivex5x5),new ItemStack(ModBlocks.Fivex5x5),new ItemStack(ModBlocks.Fivex5x5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Fivex5x15), new ItemStack(ModBlocks.Fivex5x5),new ItemStack(ModBlocks.Fivex5x10));

		GameRegistry.addSmelting(new ItemStack(Items.wheat), new ItemStack(ModItems.kevlar), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.unrefinedkevlarplate), new ItemStack(ModItems.kevlarplate), 0F);

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.unrefinedkevlarplate), "XYX", "YXY", "XYX", 'Y', "ingotIron", 'X',new ItemStack(ModItems.kevlar)));
		GameRegistry.addRecipe(new ItemStack(ModItems.BombSuitBoots), "   ", "X X", "XYX", 'Y', new ItemStack(ModItems.enrichedGunPowder) , 'X',new ItemStack(ModItems.kevlarplate));
		GameRegistry.addRecipe(new ItemStack(ModItems.BombSuitLeggins), "XXX", "XYX", "X X", 'Y', new ItemStack(ModItems.enrichedGunPowder) , 'X',new ItemStack(ModItems.kevlarplate));
		GameRegistry.addRecipe(new ItemStack(ModItems.BombSuitChestPlate), "XYX", "XXX", "XXX", 'Y', new ItemStack(ModItems.enrichedGunPowder) , 'X',new ItemStack(ModItems.kevlarplate));
		GameRegistry.addRecipe(new ItemStack(ModItems.BombSuitHelmet), "XXX", "XYX", "   ", 'Y', new ItemStack(ModItems.enrichedGunPowder) , 'X',new ItemStack(ModItems.kevlarplate));



		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Threex3x3), "XXX", "YYX", "XXX", 'Y', new ItemStack(ModItems.enrichedGunPowder) , 'X',"stone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Fivex5x5, 1), "YXX", "YYX", "YXX", 'Y', new ItemStack(ModItems.enrichedGunPowder) , 'X',"stone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Sevenx7x7, 1), "YXX", "YYX", "YXX", 'Y', new ItemStack(ModItems.superEnrichedGunPowder) , 'X',"ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Ninex9x9, 1), "YXX", "YYX", "YXX", 'Y',  new ItemStack(ModItems.superEnrichedGunPowder) , 'X',"obsidian"));

	}
}
