package dman.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dman.DemolitionMan;
import dman.library.Reasource;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ThreeByThree extends Block{
	
	@SideOnly(Side.CLIENT)
	private Icon iconTop;
	private Icon iconFront;
	private Icon iconLeft;
	private Icon iconRight;
	
	private int BlockFront;
	
	
	public ThreeByThree(int ID, Material Material) {
		super(ID, Material);
		this.setHardness(2.0F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setCreativeTab(DemolitionMan.DemoMan);
		this.setUnlocalizedName("3x3 Charge");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		this.blockIcon = icon.registerIcon(Reasource.Mod_ID + ":" + "3x3tb");
		this.iconFront = icon.registerIcon(Reasource.Mod_ID + ":" + "3x3");
		this.iconLeft = icon.registerIcon(Reasource.Mod_ID + ":" + "3x3left");
		this.iconRight = icon.registerIcon(Reasource.Mod_ID + ":" + "3x3right");
	}
	
	public int idDropped(int par1, Random random, int par3){
		return dman.Blocks.ThreeByThree.blockID;
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata){
		if (side == metadata){
			return this.iconFront;
		}
		switch(metadata){
			case 2:{
				if (side == 4){
					return this.iconRight;
				}
				if (side == 5){
					return this.iconLeft;
				}
			}
			break;
			case 3:{ 
				if (side == 5){
					return this.iconRight;
				}
				if (side == 4){
					return this.iconLeft;
				}
			}
			break;
			case 4:{
				if (side == 3){
					return this.iconRight;
				}
				if (side == 2){
					return this.iconLeft;
				}
			}
			break;
			case 5:{
				if (side == 2){
					return this.iconRight;
				}
				if (side == 3){
					return this.iconLeft;
				}
			}
			break;
			
			}
		return this.blockIcon;
	}
	
	
	public void onBlockAdded(World world, int x, int y, int z){
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}

	private void setDefaultDirection(World world, int x, int y, int z) {
		if (!world.isRemote){
			int l = world.getBlockId(x, y, z - 1); //block to the west
			int il = world.getBlockId(x, y, z + 1); //block to the east
			int jl = world.getBlockId(x - 1, y, z);
			int kl = world.getBlockId(x + 1, y, z); //block to the south
			byte b0 = 3; //sides are 2,3,4,and 5 top is 0 and bottom is 1
			
			if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[il]){
				b0 = 3;
			}
			if (Block.opaqueCubeLookup[il] && !Block.opaqueCubeLookup[l]){
				b0 = 2;
			}
			if (Block.opaqueCubeLookup[kl] && !Block.opaqueCubeLookup[jl]){
				b0 = 5;
			}
			if (Block.opaqueCubeLookup[jl] && !Block.opaqueCubeLookup[kl]){
				b0 = 4;
			}
			
			world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
	}
	
	public TileEntity createNewTileEntity(World world){
		 return new dman.tileEntity.TileEntTheeByThree();
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemstack){
		int l = MathHelper.floor_double((double)(entityLivingBase.rotationYaw * 4.0F / 360.0F ) + 0.5D) & 3;
		
		if (l == 0){
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
			//System.out.println("2");
			BlockFront = 2;
		}
		if (l == 1){
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
			//System.out.println("5");
			BlockFront = 5;
				}
		if (l == 2){
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
			//System.out.println("3");
			BlockFront = 3;
		}
		if (l == 3){
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);;
			//System.out.println("4");
			BlockFront = 4;
		}
		if(itemstack.hasDisplayName()){
			world.getBlockTileEntity(x, y, z);
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
		world.destroyBlock(x, y, z, false);
		switch (BlockFront){
			case 2:{
				z += 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							world.destroyBlock(xl, yl, zl, false);
						}
					}
				}
			}
			break;
			case 3:{
				z -= 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							world.destroyBlock(xl, yl, zl, false);
						}
					}
				}
			}
			break;
			case 4:{
				x += 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							world.destroyBlock(xl, yl, zl, false);
						}
					}
				}
			}
			break;
			case 5:{
				x -= 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							world.destroyBlock(xl, yl, zl, false);
						}
					}
				}
			}
			break;
			}
		return true;
	}
}
