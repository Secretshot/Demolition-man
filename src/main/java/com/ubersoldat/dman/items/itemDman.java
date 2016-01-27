package com.ubersoldat.dman.items;

import com.ubersoldat.dman.creativetab.CreativeTabDman;
import com.ubersoldat.dman.reference.Resource;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Soldat on 1/26/2016.
 */
public class ItemDman extends Item
{
    public ItemDman()
    {
        super();
        this.setCreativeTab(CreativeTabDman.DemoMan);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Resource.Mod_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Resource.Mod_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
