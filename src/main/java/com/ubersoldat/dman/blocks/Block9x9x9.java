package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.tileEntity.TileEntNineByNine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Block9x9x9 extends BlockShapeCharge{
	private final int BlockOffset = 5;
	private final int ClearCenterOffset = 4;

	public Block9x9x9() {
		super();
		this.setBlockName(Resource.Block9x9x9Name);
	}

	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntNineByNine();
	}

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
        ShapeObject.Demolish(world,x,y,z, BlockOffset, ClearCenterOffset);
		return true;
    }
}
