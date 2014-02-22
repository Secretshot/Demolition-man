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
	public static Block SevenBySeven;
	
	
	public static void InitalizeBlocks(){
		ShapeCharge = new dman.blocks.BlockShapeCharge(dman.library.Reasource.BlockShapeChargeID, Material.iron);
		ThreeByThree = new dman.blocks.ThreeByThree(dman.library.Reasource.BlockThreeByThreeID, Material.iron);
		FiveByFive = new dman.blocks.FiveByFive(dman.library.Reasource.BlockFiveByFiveID, Material.iron);
		NineByNine = new dman.blocks.NineByNine(dman.library.Reasource.BlockNineByNineID, Material.iron);
		SevenBySeven = new dman.blocks.SevenBySeven(dman.library.Reasource.BlockSevenBySevenID, Material.iron);
		
	}
	
	public static void RegisterBlocks(){
		//Registers the Shape Charge Block
		GameRegistry.registerBlock(dman.Blocks.ShapeCharge, Reasource.Mod_ID + dman.library.Reasource.BlockShapeChargeULName );
		LanguageRegistry.addName(dman.Blocks.ShapeCharge, dman.library.Reasource.BlockShapeChargeName);
		
		GameRegistry.registerBlock(dman.Blocks.ThreeByThree,  Reasource.Mod_ID + dman.library.Reasource.BlockThreeByThreeULName );
		LanguageRegistry.addName(dman.Blocks.ThreeByThree, dman.library.Reasource.BlockThreeByThreeName);
		
		GameRegistry.registerBlock(dman.Blocks.FiveByFive,  Reasource.Mod_ID + dman.library.Reasource.BlockFiveByFiveULName );
		LanguageRegistry.addName(dman.Blocks.FiveByFive, dman.library.Reasource.BlockFiveByFiveName);
		
		GameRegistry.registerBlock(dman.Blocks.NineByNine,  Reasource.Mod_ID + dman.library.Reasource.BlockNineByNineULName );
		LanguageRegistry.addName(dman.Blocks.NineByNine, dman.library.Reasource.BlockNineByNineName);
		
		GameRegistry.registerBlock(dman.Blocks.SevenBySeven,  Reasource.Mod_ID + dman.library.Reasource.BlockSevenBySevenULName );
		LanguageRegistry.addName(dman.Blocks.SevenBySeven, dman.library.Reasource.BlockSevenBySevenName);
	}
	
	
	
}
