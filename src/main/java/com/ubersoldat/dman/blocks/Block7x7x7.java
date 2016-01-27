package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.tileEntity.TileEntSevenBySeven;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Block7x7x7 extends BlockShapeCharge{
	private final int BlockOffset = 4;
	private final int ClearCenterOffset = 3;

	public Block7x7x7() {
		super();
		this.setBlockName(Resource.Block7x7x7Name);
	}

	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntSevenBySeven();
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
		ShapeObject.Demolish(world,x,y,z, BlockOffset, ClearCenterOffset);
		return true;
	}
}
