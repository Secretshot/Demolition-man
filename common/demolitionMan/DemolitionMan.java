package demolitionMan;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import demolitionMan.proxy.CommonProxy;
import library.Reasource;
/*
 * 
 */


@Mod(modid = Reasource.Mod_ID, name = Reasource.Mod_Name, version = Reasource.Version)
public class DemolitionMan {
	
	@Instance(Reasource.Mod_ID)
	public static DemolitionMan instance;
	
	
	@SidedProxy(clientSide = "demolitionMan.proxy.ClientProxy", serverSide = "demolitionMan.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	/***
	 * 
	 * 
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		
	}
	
}
