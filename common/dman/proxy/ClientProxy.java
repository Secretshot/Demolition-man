package dman.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientProxy extends CommonProxy {

	
	public void registerVariousThings() {
		ClientRegistry.bindTileEntitySpecialRenderer(dman.tileEntity.TileEntityShapeCharge.class, new dman.renderer.RenderShapeCharge());
		LanguageRegistry.instance().addStringLocalization(dman.DemolitionMan.DemoMan.getTranslatedTabLabel(), "Demolition Man");
	}
}
