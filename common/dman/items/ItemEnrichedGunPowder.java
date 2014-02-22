package dman.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dman.DemolitionMan;
import dman.library.Reasource;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemEnrichedGunPowder extends Item{

	public ItemEnrichedGunPowder(int id) {
		super(id);
		this.setCreativeTab(DemolitionMan.DemoMan);
		this.setUnlocalizedName(dman.library.Reasource.ItemEnrichedGunPowderULName);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Reasource.Mod_ID + ":" + dman.library.Reasource.ItemEnrichedGunPowderTextName);
	}
	
}
