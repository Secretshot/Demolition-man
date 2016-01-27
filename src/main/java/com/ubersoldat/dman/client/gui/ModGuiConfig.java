package com.ubersoldat.dman.client.gui;

import com.ubersoldat.dman.handler.ConfigHandler;
import com.ubersoldat.dman.reference.Resource;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by Soldat on 1/26/2016.
 */
public class ModGuiConfig extends GuiConfig
{

    public ModGuiConfig(GuiScreen parentScreen, List<IConfigElement> configElements, String modID, boolean allRequireWorldRestart, boolean allRequireMcRestart, String title)
    {
        super(parentScreen,
                new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Resource.Mod_ID,
                false, //allRequireWorldRestart
                false, //allRequireMcRestart
                GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}
