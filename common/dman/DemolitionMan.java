package dman;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dman.library.Reasource;
import dman.proxy.CommonProxy;


// Mod and NetworkMod
@Mod(modid = Reasource.Mod_ID, name = Reasource.Mod_Name, version = Reasource.Version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class DemolitionMan {
	
	@Instance(Reasource.Mod_ID)
	public static DemolitionMan instance;
	
	public static CreativeTabs DemoMan;
	
	@SidedProxy(clientSide = "dman.proxy.ClientProxy", serverSide = "dman.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Initialize the creative tab
		DemoMan = new CreativeTabs("dmantab"){
			@SideOnly(Side.CLIENT)
			public int getTabIconIndex(){
				return dman.library.Reasource.BlockThreeByThreeID;
			}
		};
		
		//Initialize blocks
		dman.Blocks.InitalizeBlocks();
				
		//Initialize Items
		dman.items.Items.InitalizeItems();
		
		//register Tile Entity
		GameRegistry.registerTileEntity(dman.tileEntity.TileEntityShapeCharge.class, dman.library.Reasource.BlockShapeChargeName);
		
		//Register BLocks
		dman.Blocks.RegisterBlocks();
		
		//Register Items
		dman.items.Items.RegisterItems();
		
		//Register Recipies
		dman.Recepies.RegisterRecipes();
		
		proxy.registerVariousThings();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		
	}
	
}
