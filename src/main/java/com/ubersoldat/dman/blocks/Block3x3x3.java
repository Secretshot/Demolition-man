package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.tileEntity.TileEntTheeByThree;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Block3x3x3 extends BlockShapeCharge{
	private final int BlockOffset = 2;
	private final int ClearCenterOffset = 1;

	public Block3x3x3() {
		super();
		this.setBlockName(Resource.Block3x3x3Name);
	}

	public TileEntity createNewTileEntity(World world)
	{
		 return new TileEntTheeByThree();
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
        ShapeObject.Demolish(world,x,y,z, BlockOffset, ClearCenterOffset);
		return true;
    }
}
