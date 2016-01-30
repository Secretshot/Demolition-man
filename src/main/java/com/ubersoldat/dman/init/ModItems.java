package com.ubersoldat.dman.init;

import com.ubersoldat.dman.items.*;
import com.ubersoldat.dman.reference.Resource;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Soldat on 1/26/2016.
 */
public class ModItems
{
    public static final ItemDman enrichedGunPowder = new ItemEnrichedGunPowder();
    public static final ItemDman superEnrichedGunPowder = new ItemSuperEnrichedGunPowder();
    public static final ItemDman kevlar = new ItemKevlar();
    public static final ItemDman kevlarplate = new ItemKevlarPlate();
    public static final ItemDman unrefinedkevlarplate = new ItemUnRefinedKevlarPlate();

    public static final ItemBombSuit BombSuitHelmet = new ItemBombSuit(Resource.BombSuitHelmet, Resource.KevlarMaterial, Resource.BombSuitTexture, 0);
    public static final ItemBombSuit BombSuitChestPlate = new ItemBombSuit(Resource.BombSuitChestPlate, Resource.KevlarMaterial, Resource.BombSuitTexture, 1);
    public static final ItemBombSuit BombSuitLeggins = new ItemBombSuit(Resource.BombSuitLeggings, Resource.KevlarMaterial, Resource.BombSuitTexture, 2);
    public static final ItemBombSuit BombSuitBoots = new ItemBombSuit(Resource.BombSuitBoots, Resource.KevlarMaterial, Resource.BombSuitTexture, 3);

    public static void init()
    {
        GameRegistry.registerItem(enrichedGunPowder, Resource.ItemEnrichedGunPowderULName);
        GameRegistry.registerItem(superEnrichedGunPowder, Resource.ItemSuperEnrichedGunPowderULName);
        GameRegistry.registerItem(kevlar, Resource.ItemKevlarULName);
        GameRegistry.registerItem(kevlarplate, Resource.ItemKevlarPlateULName);
        GameRegistry.registerItem(unrefinedkevlarplate, Resource.ItemUnRefinedKevlarPlateULName);
        GameRegistry.registerItem(BombSuitHelmet, Resource.BombSuitHelmet);
        GameRegistry.registerItem(BombSuitBoots, Resource.BombSuitBoots);
        GameRegistry.registerItem(BombSuitChestPlate, Resource.BombSuitChestPlate);
        GameRegistry.registerItem(BombSuitLeggins, Resource.BombSuitLeggings);
    }


}
