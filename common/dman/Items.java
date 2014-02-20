package dman;

import items.ItemShapeCharge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items{
	
	//Define Items
	public static Item ShapeCharge;
	
	
	public static void InitalizeItems(){
		
		ShapeCharge = new ItemShapeCharge(3001);
	}
	
	
	public static void RegisterItems(){
		//Registers the Shape Charge Item
		GameRegistry.registerItem(dman.Items.ShapeCharge, dman.Items.ShapeCharge.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(dman.Items.ShapeCharge, "Shape Charge");
		
		
	}
	
	
	
}
