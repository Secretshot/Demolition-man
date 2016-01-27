package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.tileEntity.TileEntNineByNine;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Block9x9x9 extends BlockDman{
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	private IIcon iconFront;
	private IIcon iconLeft;
	private IIcon iconRight;
	private IIcon iconSideDown;
	private IIcon iconSideUp;
	private final int BlockOffset = 5;
	private final int ClearCenterOffset = 4;
	
	
	
	public Block9x9x9() {
		super();
		this.setBlockName(Resource.Block9x9x9Name);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon){
		this.iconTop = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeTopBottom);
		this.iconFront = icon.registerIcon(Resource.Mod_ID + ":" + Resource.Block5x5x5Name);
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
		return new TileEntNineByNine();
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
		//System.out.println("(" + x + "," + y + "," + z + ")");
		//System.out.println(world.getBlockMetadata(x, y, z));
		switch (world.getBlockMetadata(x, y, z)){
			case 0:{
				y -= BlockOffset;
				for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
					for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
						for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
							if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

							}
							else{
								world.func_147480_a(xl, yl, zl,true);
							}
						}
					}
				}
				y +=BlockOffset;
			}
			break;
			case 1:{
				y += BlockOffset;
				for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
					for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
						for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
							if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

							}
							else{
								world.func_147480_a(xl, yl, zl,true);
							}
						}
					}
				}
				y -= BlockOffset;
			}
			break;
			case 2:{
				z += BlockOffset;
				for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
					for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
						for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
							if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

							}
							else{
								world.func_147480_a(xl, yl, zl,true);
							}
						}
					}
				}
				z -= BlockOffset;
			}
			break;
			case 3:{
				z -= BlockOffset;
				for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
					for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
						for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
							if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

							}
							else{
								world.func_147480_a(xl, yl, zl,true);
							}
						}
					}
				}
				z += BlockOffset;
			}
			break;
			case 4:{
				x += BlockOffset;
				for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
					for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
						for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
							if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

							}
							else{
								world.func_147480_a(xl, yl, zl,true);
							}
						}
					}
				}
				x-=BlockOffset;
			}
			break;
			case 5:{
				x -= BlockOffset;
				for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
					for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
						for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
							if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

							}
							else{
								world.func_147480_a(xl, yl, zl,true);
							}
						}
					}
				}
				x += BlockOffset;
			}
			break;
		}
		world.destroyBlockInWorldPartially(x, y, z, 1 , 1);
		return true;
	}
}
