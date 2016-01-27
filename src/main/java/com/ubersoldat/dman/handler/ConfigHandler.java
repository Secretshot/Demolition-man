package com.ubersoldat.dman.handler;

import com.ubersoldat.dman.reference.Resource;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{

	public static Configuration config;
	public static boolean testValue = false;

	public static void init(File configFile)
	{
		if (config == null)
		{
			config = new Configuration(configFile);
			loadConfiguration();

		}

	} //end of init

	private static void loadConfiguration()
	{
		testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false,"This is an example of a configuration value" );

		if (config.hasChanged())
		{
			config.save();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Resource.Mod_ID))
		{
			//Resync the configs
			loadConfiguration();
		}

	}
} //end of class
