package com.ubersoldat.dman.init;

import com.ubersoldat.dman.blocks.*;
import com.ubersoldat.dman.reference.Resource;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Soldat on 1/26/2016.
 */
public class ModBlocks
{
    public static final BlockDman Threex3x3 = new Block3x3x3();
    public static final BlockDman Threex3x6 = new Block3x3x6();
    public static final BlockDman Threex3x9 = new Block3x3x9();
    public static final BlockDman Threex3x12 = new Block3x3x12();
    public static final BlockDman Fivex5x5 = new Block5x5x5();
    public static final BlockDman Sevenx7x7 = new Block7x7x7();
    public static final BlockDman Ninex9x9 = new Block9x9x9();

    public static void init()
    {
        GameRegistry.registerBlock(Threex3x3, Resource.Block3x3x3Name);
        GameRegistry.registerBlock(Threex3x6, Resource.Block3x3x6Name);
        GameRegistry.registerBlock(Threex3x9, Resource.Block3x3x9Name);
        GameRegistry.registerBlock(Threex3x12, Resource.Block3x3x12Name);
        GameRegistry.registerBlock(Fivex5x5, Resource.Block5x5x5Name);
        GameRegistry.registerBlock(Sevenx7x7, Resource.Block7x7x7Name);
        GameRegistry.registerBlock(Ninex9x9, Resource.Block9x9x9Name);
    }
}
