package com.ubersoldat.dman.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class BlockShapeCharge extends BlockDman {


	public BlockShapeCharge() {
		super();

	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
		// Nothing Happens Here
		return true;
	}
}
