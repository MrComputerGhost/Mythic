package com.ironhammer354.mythic.config;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.ironhammer354.mythic.lib.BlockIDs;
import com.ironhammer354.mythic.lib.ItemIDs;
import com.ironhammer354.mythic.lib.Reference;
import com.ironhammer354.mythic.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

	public static Configuration config;

	public static void init(File configFile) {

		config = new Configuration(configFile);

		try {

			config.load();

			BlockIDs.aquaditeOreID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.AQUADITEORE_NAME, BlockIDs.AQUADITEORE_DEFAULT).getInt(BlockIDs.AQUADITEORE_DEFAULT);
			BlockIDs.zarfronOreID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.ZARFRONORE_NAME, BlockIDs.ZARFRONORE_DEFAULT).getInt(BlockIDs.ZARFRONORE_DEFAULT);
			BlockIDs.erieOreID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.ERIEORE_NAME, BlockIDs.ERIEORE_DEFAULT).getInt(BlockIDs.ERIEORE_DEFAULT);
			BlockIDs.mythDeskID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.MYTHDESK_NAME, BlockIDs.MYTHDESK_DEFAULT).getInt(BlockIDs.MYTHDESK_DEFAULT);
			BlockIDs.quartisBlockID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISBLOCK_NAME, BlockIDs.QUARTISBLOCK_DEFAULT).getInt(BlockIDs.QUARTISBLOCK_DEFAULT);
			BlockIDs.witherBlockID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.WITHERBLOCK_NAME, BlockIDs.WITHERBLOCK_DEFAULT).getInt(BlockIDs.WITHERBLOCK_DEFAULT);
			BlockIDs.angelSandBlockID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.ANGELSANDBLOCK_NAME, BlockIDs.ANGELSANDBLOCK_DEFAULT).getInt(BlockIDs.ANGELSANDBLOCK_DEFAULT);
			BlockIDs.shinyQuartisBlockID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.SHINYQUARTISBLOCK_NAME, BlockIDs.SHINYQUARTISBLOCK_DEFAULT).getInt(BlockIDs.SHINYQUARTISBLOCK_DEFAULT);
			BlockIDs.forbidRuneID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.FORBIDRUNE_NAME, BlockIDs.FORBIDRUNE_DEFAULT).getInt(BlockIDs.FORBIDRUNE_DEFAULT);
			BlockIDs.quartisSmallBrickID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISSMALLBRICK_NAME, BlockIDs.QUARTISSMALLBRICK_DEFAULT).getInt(BlockIDs.QUARTISSMALLBRICK_DEFAULT);
			BlockIDs.quartisLargeBrickID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISLARGEBRICK_NAME, BlockIDs.QUARTISLARGEBRICK_DEFAULT).getInt(BlockIDs.QUARTISLARGEBRICK_DEFAULT);
			BlockIDs.quartisLargeBrickID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISLARGEBRICK_NAME, BlockIDs.QUARTISLARGEBRICK_DEFAULT).getInt(BlockIDs.QUARTISLARGEBRICK_DEFAULT);
			BlockIDs.quartisSolidBlockID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISSOLIDBLOCK_NAME, BlockIDs.QUARTISSOLIDBLOCK_DEFAULT).getInt(BlockIDs.QUARTISSOLIDBLOCK_DEFAULT);
			BlockIDs.netherStoneBrickID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.NETHERSTONEBRICK_NAME, BlockIDs.NETHERSTONEBRICK_DEFAULT).getInt(BlockIDs.NETHERSTONEBRICK_DEFAULT);
			BlockIDs.netherStoneID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.NETHERSTONE_NAME, BlockIDs.NETHERSTONE_DEFAULT).getInt(BlockIDs.NETHERSTONE_DEFAULT);
			
			ItemIDs.spellBookID = config.getItem(Configuration.CATEGORY_ITEM, Strings.SPELLBOOK_NAME, ItemIDs.SPELLBOOK_DEFAULT).getInt(ItemIDs.SPELLBOOK_DEFAULT);
			ItemIDs.zarfronID = config.getItem(Configuration.CATEGORY_ITEM, Strings.ZARFRON_NAME, ItemIDs.ZARFRON_DEFAULT).getInt(ItemIDs.ZARFRON_DEFAULT);
			ItemIDs.aquaditeID = config.getItem(Configuration.CATEGORY_ITEM, Strings.AQUADITE_NAME, ItemIDs.AQUADITE_DEFAULT).getInt(ItemIDs.AQUADITE_DEFAULT);
			ItemIDs.erieDropID = config.getItem(Configuration.CATEGORY_ITEM, Strings.ERIEDROP_NAME, ItemIDs.ERIEDROP_DEFAULT).getInt(ItemIDs.ERIEDROP_DEFAULT);
			ItemIDs.boneChunkID = config.getItem(Configuration.CATEGORY_ITEM, Strings.BONECHUNK_NAME, ItemIDs.BONECHUNK_DEFAULT).getInt(ItemIDs.BONECHUNK_DEFAULT);
			ItemIDs.wandQuartzID = config.getItem(Configuration.CATEGORY_ITEM, Strings.WANDQUARTZ_NAME, ItemIDs.WANDQUARTZ_DEFAULT).getInt(ItemIDs.WANDQUARTZ_DEFAULT);
			ItemIDs.wandEnderID = config.getItem(Configuration.CATEGORY_ITEM, Strings.WANDENDER_NAME, ItemIDs.WANDENDER_DEFAULT).getInt(ItemIDs.WANDENDER_DEFAULT);
			ItemIDs.wandFarieID = config.getItem(Configuration.CATEGORY_ITEM, Strings.WANDFARIE_NAME, ItemIDs.WANDFARIE_DEFAULT).getInt(ItemIDs.WANDFARIE_DEFAULT);
			
			

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + " had a problem loading its configuration file.");
		} finally {
			config.save();
		}
	}
}