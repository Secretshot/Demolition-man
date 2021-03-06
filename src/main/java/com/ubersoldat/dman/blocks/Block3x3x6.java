package com.ubersoldat.dman.blocks;

import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.tileEntity.TileEntTheeByThree;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Block3x3x6 extends BlockShapeCharge {
    private final int BlockOffset = 2;
    private final int ClearCenterOffset = 1; // Blocks around the center
    private final int Depth = 5; // Desired Depth -1

    public Block3x3x6() {
        super();
        this.setBlockName(Resource.Block3x3x6Name);
    }

    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntTheeByThree();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
        ShapeObject.DemolishDeep(world,x,y,z, BlockOffset, ClearCenterOffset,Depth);
        return true;
    }

}
