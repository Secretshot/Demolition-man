package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.tileEntity.TileEntFiveByFive;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by gregory.dere on 1/28/2016.
 */
public class Block5x5x15 extends BlockShapeCharge {
    private final int BlockOffset = 3;
    private final int ClearCenterOffset = 2; // Blocks around the center
    private final int Depth = 14; // Desired Depth -1

    public Block5x5x15() {
        super();
        this.setBlockName(Resource.Block5x5x15Name);
    }

    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntFiveByFive();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
        ShapeObject.DemolishDeep(world,x,y,z, BlockOffset, ClearCenterOffset,Depth);
        return true;
    }

}
