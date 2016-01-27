package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class BlockShapeCharge extends BlockDman {
	private IIcon iconTop;
	private IIcon iconFront;
	private IIcon iconLeft;
	private IIcon iconRight;
	private IIcon iconSideDown;
	private IIcon iconSideUp;

	public BlockShapeCharge() {
		super();

	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
		// Nothing Happens Here
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon){
		this.iconTop = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeTopBottom);
		this.iconFront = icon.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
		this.iconLeft = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeLeft);
		this.iconRight = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeRight);
		this.iconSideDown = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeDown);
		this.iconSideUp = icon.registerIcon(Resource.Mod_ID + ":" + Resource.ChargeUp);
	}

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

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemstack){

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
		LogHelper.info(("H:"+h+" L:"+l));
		switch(h){
			case -1:{ //Block Facing Up
				world.setBlockMetadataWithNotify(x, y, z, 1, 2);

			}
			break;
			case 0: { //Block Facing Horizontally

				if (l == 0){
					world.setBlockMetadataWithNotify(x, y, z, 2, 2);
					//Block facing South or Z+
				}
				if (l == 1){
					world.setBlockMetadataWithNotify(x, y, z, 5, 2);
					//Block facing West or X-
				}
				if (l == 2){
					world.setBlockMetadataWithNotify(x, y, z, 3, 2);
					//Block facing North or Z-
				}
				if (l == 3){
					world.setBlockMetadataWithNotify(x, y, z, 4, 2);
					//Block facing East or X+
				}
			}
			break;
			case 1:{ //Block Facing Down
				world.setBlockMetadataWithNotify(x, y, z, 0, 2);
			}
			break;
		}
		if(itemstack.hasDisplayName()){
			world.getTileEntity(x, y, z);
		}
	}


}
