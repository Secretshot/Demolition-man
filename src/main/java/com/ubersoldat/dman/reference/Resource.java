package com.ubersoldat.dman.reference;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Resource {
	/*
	 * MOD INFORMATION SECTION
	 */

	public static final String Mod_ID = "dman"; //The Mod ID stored for easy reference
	public static final String Mod_Name = "Demolition Man"; //The Mod Name stored for easy reference
	public static final String Version = "1.7.10-0.5"; 	//The Mod Version stored for easy reference
	public static final String Client_Proxy_Class ="com.ubersoldat.dman.proxy.ClientProxy";
	public static final String Server_Proxy_Class ="com.ubersoldat.dman.proxy.ServerProxy";
	public static final String Gui_Factory_class = "com.ubersoldat.dman.client.gui.GuiFactory";

	/*
	 * Texture Resources
	 */
	public static final String ChargeDown = "chargedown";
	public static final String ChargeUp = "chargeup";
	public static final String ChargeLeft = "chargeleft";
	public static final String ChargeRight = "chargeright";
	public static final String ChargeTopBottom = "chargetopbottom";
	
	
	/*
	 * BLOCK RESOURCE INFORMATION
	 */
	public static final String BlockShapeChargeName = "shapecharge";
	public static final String Block3x3x3Name = "3x3x3";
	public static final String Block3x3x6Name = "3x3x6";
	public static final String Block3x3x9Name = "3x3x9";
    public static final String Block3x3x12Name = "3x3x12";
	public static final String Block3x3x15Name = "3x3x15";
	public static final String Block5x5x5Name = "5x5x5";
	public static final String Block5x5x10Name = "5x5x10";
	public static final String Block5x5x15Name = "5x5x15";
	public static final String Block7x7x7Name = "7x7x7";
	public static final String Block9x9x9Name = "9x9x9";

	
	/*
	 * ITEM RESOURCE INFORMATION
	 */
	public static final int[] DamageReduction = new int[]{3,8,6,3};
	public static final ItemArmor.ArmorMaterial KevlarMaterial = EnumHelper.addArmorMaterial("KevlarMaterial", 55,DamageReduction ,30);
	public static final String BombSuitTexture = "BombSuit";
	public static final String BombSuitHelmet = "BombSuitHelmet";
	public static final String BombSuitBoots = "BombSuitBoots";
	public static final String BombSuitLeggings = "BombSuitLeggings";
	public static final String BombSuitChestPlate = "BombSuitChestPlate";

    public static final String ItemKevlarULName = "kevlar";
    public static final String ItemKevlarPlateULName = "kevlarplate";
    public static final String ItemUnRefinedKevlarPlateULName = "unrefinedkevlarplate";
	public static final String ItemEnrichedGunPowderULName = "enrichedgunpowder";
	public static final String ItemSuperEnrichedGunPowderULName = "superenrichedgunpowder";

}
