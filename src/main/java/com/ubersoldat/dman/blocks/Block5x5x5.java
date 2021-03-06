package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.tileEntity.TileEntFiveByFive;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Block5x5x5 extends BlockShapeCharge{
	private final int BlockOffset = 3;
	private final int ClearCenterOffset = 2;
	
	public Block5x5x5() {
		super();
		this.setBlockName(Resource.Block5x5x5Name);
	}

	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntFiveByFive();
	}

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
        ShapeObject.Demolish(world,x,y,z, BlockOffset, ClearCenterOffset);
		return true;
    }
}
