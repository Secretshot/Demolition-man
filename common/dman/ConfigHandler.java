package dman;

import java.io.File;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
	Configuration config = new Configuration(configFile);
	
	config.load();
	
	//ds.tutBlock_actual = config.getBlock(Names.tutBlock_name, Ids.tutBlock_default).getInt();
	dman.library.Reasource.BlockShapeChargeID = config.getBlock(dman.library.Reasource.BlockShapeChargeName, dman.library.Reasource.BlockShapeChargeIDdefault).getInt();
	dman.library.Reasource.BlockThreeByThreeID = config.getBlock(dman.library.Reasource.BlockThreeByThreeName, dman.library.Reasource.BlockThreeByThreeIDdefualt).getInt();
	dman.library.Reasource.BlockFiveByFiveID = config.getBlock(dman.library.Reasource.BlockFiveByFiveName, dman.library.Reasource.BlockFiveByFiveIDdefault).getInt();
	dman.library.Reasource.BlockSevenBySevenID = config.getBlock(dman.library.Reasource.BlockSevenBySevenName, dman.library.Reasource.BlockSevenBySevenIDdefault).getInt();
	dman.library.Reasource.BlockNineByNineID = config.getBlock(dman.library.Reasource.BlockNineByNineName, dman.library.Reasource.BlockNineByNineIDdefault).getInt();
	
	dman.library.Reasource.ItemEnrichedGunPowderID = config.getItem(dman.library.Reasource.ItemEnrichedGunPowderName, dman.library.Reasource.ItemEnrichedGunPowderIDdefault).getInt();
	dman.library.Reasource.ItemSuperEnrichedGunPowderID = config.getItem(dman.library.Reasource.ItemSuperEnrichedGunPowderName, dman.library.Reasource.ItemSuperEnrichedGunPowderIDdefault).getInt();
	
	config.save();
	
	}

}
