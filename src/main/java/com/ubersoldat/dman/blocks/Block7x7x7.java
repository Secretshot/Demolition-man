package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.tileEntity.TileEntSevenBySeven;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Block7x7x7 extends BlockShapeCharge{
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	private IIcon iconFront;
	private IIcon iconLeft;
	private IIcon iconRight;
	private IIcon iconSideDown;
	private IIcon iconSideUp;
	private final int BlockOffset = 4;
	private final int ClearCenterOffset = 3;
	
	
	public Block7x7x7() {
		super();
		this.setBlockName(Resource.Block7x7x7Name);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon){
		this.iconTop = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeTopBottom);
		this.iconFront = icon.registerIcon(Resource.Mod_ID + ":" + Resource.Block7x7x7Name);
		this.iconLeft = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeLeft);
		this.iconRight = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeRight);
		this.iconSideDown = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeDown);
		this.iconSideUp = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeUp);
	}

	/*public int idDropped(int par1, Random random, int par3){
		return Resource.Block5x5x5Name;
	}
	*/

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata){
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
		return this.iconTop;
	}

	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntSevenBySeven();
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemstack){
		//System.out.println(entityLivingBase.rotationPitch);
		//Straight up is -90 straight down in 90 centered is 0
		//int h = MathHelper.floor_double((double)(entityLivingBase.rotationPitch * 3.0F / 180.0F ) + 0.5D);
		int h = 0;
		if (entityLivingBase.rotationPitch <= -50){
			h = -1;
		}
		if (entityLivingBase.rotationPitch >= 50){
			h = 1;
		}
		if (entityLivingBase.rotationPitch > -50 && entityLivingBase.rotationPitch < 50){
			h = 0;
		}

		int l = MathHelper.floor_double((double)(entityLivingBase.rotationYaw * 4.0F / 360.0F ) + 0.5D) & 3;
		System.out.println(h);
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
			world.getTileEntity(x, y, z);
		}
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
		ShapeObject.Demolish(world,x,y,z, BlockOffset, ClearCenterOffset);
		return super.onBlockActivated(world, x, y, z, player, side, hitx, hity, hitz);
	}
}
