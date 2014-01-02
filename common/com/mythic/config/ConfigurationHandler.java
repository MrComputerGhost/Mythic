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


			ItemIDs.placeHolderItemID = config.getItem(Configuration.CATEGORY_ITEM, Strings.PLACEHOLDERITEM_NAME, ItemIDs.PLACEHOLDERITEM_DEFAULT).getInt(ItemIDs.PLACEHOLDERITEM_DEFAULT);

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + " had a problem loading its configuration file.");
		} finally {
			config.save();
		}
	}

}
