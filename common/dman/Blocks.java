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
	
	
	public static void InitalizeBlocks(){
		//ShapeCharge = new BlockShapeCharge(3001, Material.rock);
		ThreeByThree = new dman.blocks.ThreeByThree(3002, Material.rock);
		
	}
	
	public static void RegisterBlocks(){
		//Registers the Shape Charge Block
		//GameRegistry.registerBlock(dman.Blocks.ShapeCharge, Reasource.Mod_ID + dman.Blocks.ShapeCharge.getUnlocalizedName().substring(5) );
		//LanguageRegistry.addName(dman.Blocks.ShapeCharge, "Shape Charge");
		
		GameRegistry.registerBlock(dman.Blocks.ThreeByThree,  Reasource.Mod_ID + dman.Blocks.ThreeByThree.getUnlocalizedName().substring(5) );
		LanguageRegistry.addName(dman.Blocks.ThreeByThree, "3x3 Charge");
		
	}
	
	
	
}
