package com.ubersoldat.dman.creativetab;

import com.ubersoldat.dman.init.ModBlocks;
import com.ubersoldat.dman.reference.Resource;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Soldat on 1/26/2016.
 */
public class CreativeTabDman {
    public static final CreativeTabs DemoMan = new CreativeTabs(Resource.Mod_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return  Item.getItemFromBlock(ModBlocks.Threex3x3);
        }

    };

}