package dman.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items{
	
	//Define Items
	public static Item EnrichedGunpowder;
	public static Item SuperEnrichedGunpowder;
	
	
	public static void InitalizeItems(){
		
		EnrichedGunpowder = new ItemEnrichedGunPowder(dman.library.Reasource.ItemEnrichedGunPowderID);
		SuperEnrichedGunpowder = new ItemSuperEnrichedGunPowder(dman.library.Reasource.ItemSuperEnrichedGunPowderID);
	}
	
	
	public static void RegisterItems(){
		//Registers the Shape Charge Item
		GameRegistry.registerItem(dman.items.Items.EnrichedGunpowder, dman.library.Reasource.ItemEnrichedGunPowderULName);
		LanguageRegistry.addName(dman.items.Items.EnrichedGunpowder, dman.library.Reasource.ItemEnrichedGunPowderName);
		GameRegistry.registerItem(dman.items.Items.SuperEnrichedGunpowder, dman.library.Reasource.ItemSuperEnrichedGunPowderULName);
		LanguageRegistry.addName(dman.items.Items.SuperEnrichedGunpowder, dman.library.Reasource.ItemSuperEnrichedGunPowderName);
		
	}
	
	
	
}
