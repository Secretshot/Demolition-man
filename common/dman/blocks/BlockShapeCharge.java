package dman.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dman.DemolitionMan;
import dman.library.Reasource;
import dman.tileEntity.TileEntityShapeCharge;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockShapeCharge extends BlockContainer {
	
	public BlockShapeCharge(int ID, Material Material) {
		super(ID, Material);
		this.setHardness(2.0F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setCreativeTab(DemolitionMan.DemoMan);
		this.setUnlocalizedName("Shape Charge");
	}

	
	public TileEntity createNewTileEntity(World world){
		return new TileEntityShapeCharge();	
	}
	
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		this.blockIcon = icon.registerIcon(Reasource.Mod_ID + ":" + "3x3");
	}
	
	public int idDropped(int par1, Random random, int par3){
		return dman.Blocks.ShapeCharge.blockID;
	}
	
	
}
