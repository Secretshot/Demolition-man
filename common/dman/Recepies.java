package dman;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recepies {
	public static void RegisterRecipes(){
		
		GameRegistry.addShapelessRecipe(new ItemStack(dman.items.Items.EnrichedGunpowder, 2), new Object[]{Item.gunpowder, Item.redstone});
		GameRegistry.addShapelessRecipe(new ItemStack(dman.items.Items.SuperEnrichedGunpowder, 2), new Object[]{dman.items.Items.EnrichedGunpowder, Item.glowstone});
		GameRegistry.addRecipe(new ItemStack(dman.Blocks.ThreeByThree, 1), new Object[]{"XXX", "YYX", "XXX", 'Y', dman.items.Items.EnrichedGunpowder , 'X',Block.stone});
		GameRegistry.addRecipe(new ItemStack(dman.Blocks.FiveByFive, 1), new Object[]{"YXX", "YYX", "YXX", 'Y', dman.items.Items.EnrichedGunpowder , 'X',Block.stone});
		GameRegistry.addRecipe(new ItemStack(dman.Blocks.SevenBySeven, 1), new Object[]{"YXX", "YYX", "YXX", 'Y', dman.items.Items.SuperEnrichedGunpowder , 'X',Block.obsidian});
		GameRegistry.addRecipe(new ItemStack(dman.Blocks.NineByNine, 1), new Object[]{"YXX", "YYX", "YXX", 'Y', dman.items.Items.SuperEnrichedGunpowder , 'X', Item.ingotIron});
	}
}
