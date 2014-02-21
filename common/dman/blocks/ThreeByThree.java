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
	private Icon iconSideDown;
	private Icon iconSideUp;
	
	//private int BlockFront;
	
	
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
		this.iconSideDown = icon.registerIcon(Reasource.Mod_ID + ":" + "3x3down");
		this.iconSideUp = icon.registerIcon(Reasource.Mod_ID + ":" + "3x3up");
	}
	
	public int idDropped(int par1, Random random, int par3){
		return dman.Blocks.ThreeByThree.blockID;
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata){
		switch(metadata){
			case 0:{
				if (side >= 2){
					return this.iconSideUp;
				}
				if (side == 1){
					return this.iconFront;
				} 
			}
			break;
			case 1:{
				if (side >= 2){
					return this.iconSideDown;
				}
				if (side == 0){
					return this.iconFront;
				}
			}
			break;
			case 2:{
				if (side == 4){
					return this.iconRight;
				}
				if (side == 5){
					return this.iconLeft;
				}
				if (side == metadata){
					return this.iconFront;
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
				if (side == metadata){
					return this.iconFront;
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
				if (side == metadata){
					return this.iconFront;
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
				if (side == metadata){
					return this.iconFront;
				}
			}
			break;
			
			}
		return this.blockIcon;
	}
	
	public TileEntity createNewTileEntity(World world){
		 return new dman.tileEntity.TileEntTheeByThree();
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemstack){
		int h = MathHelper.floor_double((double)(entityLivingBase.rotationPitch * 3.0F / 180.0F ) + 0.5D);
		int l = MathHelper.floor_double((double)(entityLivingBase.rotationYaw * 4.0F / 360.0F ) + 0.5D) & 3;
		switch(h){
		case -1:{
			world.setBlockMetadataWithNotify(x, y, z, 1, 2);
			//BlockFront = 1;
		}
		break;
		case 0: {
			
			if (l == 0){
				world.setBlockMetadataWithNotify(x, y, z, 2, 2);
				//BlockFront = 2;
			}
			if (l == 1){
				world.setBlockMetadataWithNotify(x, y, z, 5, 2);
				//BlockFront = 5;
					}
			if (l == 2){
				world.setBlockMetadataWithNotify(x, y, z, 3, 2);
				//BlockFront = 3;
			}
			if (l == 3){
				world.setBlockMetadataWithNotify(x, y, z, 4, 2);
				//BlockFront = 4;
			}
		}
		break;
		case 1:{
			world.setBlockMetadataWithNotify(x, y, z, 0, 2);
			//BlockFront = 0;
		}
		break;
		}
		if(itemstack.hasDisplayName()){
			world.getBlockTileEntity(x, y, z);
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
		//System.out.println("(" + x + "," + y + "," + z + ")");
		//System.out.println(world.getBlockMetadata(x, y, z));
		switch (world.getBlockMetadata(x, y, z)){
			case 0:{
				y -= 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //x loop
						for(int zl = z-1; zl <= z+1; zl ++){ //z loop
							if (world.getBlockId(xl, yl, zl) == 7){
								
							}
							else{
							world.destroyBlock(xl, yl, zl, false);
							}
						}
					}
				}
				y +=2;
			}
			break;
			case 1:{
				y += 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							if (world.getBlockId(xl, yl, zl) == 7){
								
							}
							else{
							world.destroyBlock(xl, yl, zl, false);
							}
						}
					}
				}
				y -= 2;
			}
			break;
			case 2:{
				z += 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							if (world.getBlockId(xl, yl, zl) == 7){
								
							}
							else{
							world.destroyBlock(xl, yl, zl, false);
							}
						}
					}
				}
				z -= 2;
			}
			break;
			case 3:{
				z -= 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							if (world.getBlockId(xl, yl, zl) == 7){
								
							}
							else{
							world.destroyBlock(xl, yl, zl, false);
							}
						}
					}
				}
				z += 2;
			}
			break;
			case 4:{
				x += 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							if (world.getBlockId(xl, yl, zl) == 7){
								
							}
							else{
							world.destroyBlock(xl, yl, zl, false);
							}
						}
					}
				}
				x-=2;
			}
			break;
			case 5:{
				x -= 2;
				for(int yl = y-1; yl <= y+1; yl ++){ //y loop
					for(int xl = x-1; xl <= x+1; xl ++){ //y loop
						for(int zl = z-1; zl <= z+1; zl ++){ //y loop
							if (world.getBlockId(xl, yl, zl) == 7){
								
							}
							else{
							world.destroyBlock(xl, yl, zl, false);
							}
						}
					}
				}
				x += 2;
			}
			break;
			}
		world.destroyBlock(x, y, z, false);
		return true;
	}
}