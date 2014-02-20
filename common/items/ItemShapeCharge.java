package items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dman.DemolitionMan;
import dman.library.Reasource;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemShapeCharge extends Item{

	public ItemShapeCharge(int id) {
		super(id);
		this.setCreativeTab(DemolitionMan.DemoMan);
		this.setUnlocalizedName("Shape Charge");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Reasource.Mod_ID + ":" + "3x3");
	}
	
}
