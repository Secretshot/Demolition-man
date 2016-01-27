package com.ubersoldat.dman.init;

import com.ubersoldat.dman.items.ItemDman;
import com.ubersoldat.dman.items.ItemEnrichedGunPowder;
import com.ubersoldat.dman.items.ItemSuperEnrichedGunPowder;
import com.ubersoldat.dman.reference.Resource;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Soldat on 1/26/2016.
 */
public class ModItems
{
    public static final ItemDman enrichedGunPowder = new ItemEnrichedGunPowder();
    public static final ItemDman superEnrichedGunPowder = new ItemSuperEnrichedGunPowder();

    public static void init()
    {
        GameRegistry.registerItem(enrichedGunPowder, Resource.ItemEnrichedGunPowderULName);
        GameRegistry.registerItem(superEnrichedGunPowder, Resource.ItemSuperEnrichedGunPowderULName);
    }


}
