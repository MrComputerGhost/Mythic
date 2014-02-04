package com.ironhammer354.mythic;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

import com.ironhammer354.mythic.block.MythBlocks;
import com.ironhammer354.mythic.config.ConfigurationHandler;
import com.ironhammer354.mythic.core.handler.GuiHandler;
import com.ironhammer354.mythic.core.proxy.CommonProxy;
import com.ironhammer354.mythic.creativetab.TabMyth;
import com.ironhammer354.mythic.entity.mob.EntityNymph;
import com.ironhammer354.mythic.entity.mob.SpawnEntityEggs;
import com.ironhammer354.mythic.item.MythItems;
import com.ironhammer354.mythic.lib.Reference;
import com.ironhammer354.mythic.recipe.CraftingManager;
import com.ironhammer354.mythic.world.gen.WorldGen;
import com.ironhammer354.mythic.world.gen.mythicworld.MythWorld1;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Mythic {
	public static int myth1Id = 8;

	@Instance(Reference.MOD_ID)
	public static Mythic instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	public static final CreativeTabs tabMyth = new TabMyth(CreativeTabs.getNextID(), Reference.MOD_ID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		NetworkRegistry.instance().registerGuiHandler(instance, new GuiHandler());

		ConfigurationHandler.init(new File(e.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.MOD_ID + File.separator + Reference.MOD_ID + ".cfg"));
		
		MythBlocks.initBlocks();
		
		MythItems.initItems();
		
		WorldGen.init();
		
		CraftingManager.addRecipes();
		
		SpawnEntityEggs.CreateSpawnEggs();
		
		proxy.registerSound();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {

		 EntityRegistry.registerModEntity(EntityNymph.class, "Nypmh", 0, this, 80, 1, true);
	     EntityRegistry.addSpawn(EntityNymph.class, 17, 2, 8, EnumCreatureType.creature,
                    BiomeGenBase.forest, BiomeGenBase.river);
		 LanguageRegistry.instance().addStringLocalization("entity.mythic.Nymph.name", "en_US","Nymph");
		 
		 DimensionManager.registerProviderType(Mythic.myth1Id, MythWorld1.class, false);
			DimensionManager.registerDimension(Mythic.myth1Id, Mythic.myth1Id);
		
		proxy.registerRenderThings();
		
		addNames();
		
		oreRegistration();
		
		addOreRecipes();
	}
	
	public static void addNames(){}
	public static void oreRegistration(){}
	public static void addOreRecipes(){}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {}
}