package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.creativetab.CreativeTabDman;
import com.ubersoldat.dman.reference.Resource;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Soldat on 1/26/2016.
 */
public class BlockDman extends Block
{
    public BlockDman(Material material)
    {
        super(material);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeMetal);
        this.setCreativeTab(CreativeTabDman.DemoMan);
    }

    public BlockDman() //generic constructor using iron as a material
    {
        this(Material.iron);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeMetal);
        this.setCreativeTab(CreativeTabDman.DemoMan);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Resource.Mod_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
