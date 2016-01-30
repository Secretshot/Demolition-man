package com.ubersoldat.dman.items;

import com.ubersoldat.dman.init.ModItems;
import com.ubersoldat.dman.reference.Resource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Soldat on 1/30/2016.
 */
public class ItemBombSuit extends ItemArmor {
    public String textureName;

    public ItemBombSuit(String unlocalizedName, ArmorMaterial material, String textureNameInput, int type) {
        super(material, 0, type);
        this.textureName = textureNameInput;
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Resource.Mod_ID.toLowerCase() + ":" + unlocalizedName);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.BombSuitHelmet))
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40));
        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.BombSuitHelmet))
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40));
        if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.BombSuitChestPlate))
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40));
        if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.BombSuitChestPlate))
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40));
    }


    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Resource.Mod_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Resource.Mod_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return (Resource.Mod_ID.toLowerCase() + ":/textures/items/" + this.textureName.toLowerCase() + "_" + (this.armorType == 2 ? "2" : "1") + ".png");
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
