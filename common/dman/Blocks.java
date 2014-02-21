package dman;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dman.library.Reasource;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class Blocks {
	
	//Define Blocks Used
	public static Block ShapeCharge;
	public static Block ThreeByThree;
	public static Block FiveByFive;
	public static Block NineByNine;
	
	
	public static void InitalizeBlocks(){
		//ShapeCharge = new BlockShapeCharge(3001, Material.rock);
		ThreeByThree = new dman.blocks.ThreeByThree(3002, Material.iron);
		FiveByFive = new dman.blocks.FiveByFive(3003, Material.iron);
		NineByNine = new dman.blocks.NineByNine(3004, Material.iron);
		
	}
	
	public static void RegisterBlocks(){
		//Registers the Shape Charge Block
		//GameRegistry.registerBlock(dman.Blocks.ShapeCharge, Reasource.Mod_ID + dman.Blocks.ShapeCharge.getUnlocalizedName().substring(5) );
		//LanguageRegistry.addName(dman.Blocks.ShapeCharge, "Shape Charge");
		
		GameRegistry.registerBlock(dman.Blocks.ThreeByThree,  Reasource.Mod_ID + dman.Blocks.ThreeByThree.getUnlocalizedName().substring(5) );
		LanguageRegistry.addName(dman.Blocks.ThreeByThree, "3x3 Charge");
		GameRegistry.registerBlock(dman.Blocks.FiveByFive,  Reasource.Mod_ID + dman.Blocks.FiveByFive.getUnlocalizedName().substring(5) );
		LanguageRegistry.addName(dman.Blocks.FiveByFive, "5x5 Charge");
		GameRegistry.registerBlock(dman.Blocks.NineByNine,  Reasource.Mod_ID + dman.Blocks.NineByNine.getUnlocalizedName().substring(5) );
		LanguageRegistry.addName(dman.Blocks.NineByNine, "9x9 Charge");
		
	}
	
	
	
}