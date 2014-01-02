package com.mythic;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.mythic.block.MythBlocks;
import com.mythic.config.ConfigurationHandler;
import com.mythic.core.proxy.CommonProxy;
import com.mythic.creativetab.TabMyth;
import com.mythic.item.MythItems;
import com.mythic.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Mythic {

	@Instance(Reference.MOD_ID)
	public static Mythic instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	public static final CreativeTabs tabMyth = new TabMyth(CreativeTabs.getNextID(), Reference.MOD_ID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {

		ConfigurationHandler.init(new File(e.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.MOD_ID + File.separator + Reference.MOD_ID + ".cfg"));

		MythBlocks.initBlocks();

		MythItems.initItems();}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		
		proxy.registerRenderThings();
		
		addNames();
		oreRegistration();
		addOreRecipes();
	}
	
	public static void addNames(){}
	public static void oreRegistration(){}
	public static void addOreRecipes(){}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {

	}
}
