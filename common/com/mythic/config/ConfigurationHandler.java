package com.mythic.config;

import java.io.File;
import java.util.logging.Level;
import net.minecraftforge.common.Configuration;
import com.mythic.lib.BlockIDs;
import com.mythic.lib.ItemIDs;
import com.mythic.lib.Reference;
import com.mythic.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

	public static Configuration config;

	public static void init(File configFile) {

		config = new Configuration(configFile);

		try {

			config.load();

			BlockIDs.placeHolderBlockID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.PLACEHOLDERBLOCK_NAME, BlockIDs.PLACEHOLDERBLOCK_DEFAULT).getInt(BlockIDs.PLACEHOLDERBLOCK_DEFAULT);


			ItemIDs.spellBookID = config.getItem(Configuration.CATEGORY_ITEM, Strings.SPELLBOOK_NAME, ItemIDs.SPELLBOOK_DEFAULT).getInt(ItemIDs.SPELLBOOK_DEFAULT);
			ItemIDs.zarfronID = config.getItem(Configuration.CATEGORY_ITEM, Strings.ZARFRON_NAME, ItemIDs.ZARFRON_DEFAULT).getInt(ItemIDs.ZARFRON_DEFAULT);
			ItemIDs.aquaditeID = config.getItem(Configuration.CATEGORY_ITEM, Strings.AQUADITE_NAME, ItemIDs.AQUADITE_DEFAULT).getInt(ItemIDs.AQUADITE_DEFAULT);
			ItemIDs.erieDropID = config.getItem(Configuration.CATEGORY_ITEM, Strings.ERIEDROP_NAME, ItemIDs.ERIEDROP_DEFAULT).getInt(ItemIDs.ERIEDROP_DEFAULT);

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + " had a problem loading its configuration file.");
		} finally {
			config.save();
		}
	}

}
