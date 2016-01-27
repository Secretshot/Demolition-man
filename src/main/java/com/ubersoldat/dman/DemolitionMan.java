package com.ubersoldat.dman;

import com.ubersoldat.dman.handler.ConfigHandler;
import com.ubersoldat.dman.init.ModBlocks;
import com.ubersoldat.dman.init.ModItems;
import com.ubersoldat.dman.init.Recepies;
import com.ubersoldat.dman.proxy.IProxy;
import com.ubersoldat.dman.reference.Resource;
import com.ubersoldat.dman.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;


// Mod and NetworkMod
@Mod(modid = Resource.Mod_ID, name = Resource.Mod_Name, version = Resource.Version, guiFactory = Resource.Gui_Factory_class)
//@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class DemolitionMan {
	
	@Instance(Resource.Mod_ID)
	public static DemolitionMan instance;
	
	public static CreativeTabs DemoMan;
	
	@SidedProxy(clientSide = Resource.Client_Proxy_Class, serverSide = Resource.Server_Proxy_Class)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());

		ModItems.init(); //Initialize Items

        ModBlocks.init(); //Initialize blocks

		LogHelper.info("Pre Initialization Complete!");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){

		Recepies.init();

		proxy.registerVariousThings();

		LogHelper.info("Initialization Complete!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){

		LogHelper.info("Post Initialization Complete!");
	}
	
}
