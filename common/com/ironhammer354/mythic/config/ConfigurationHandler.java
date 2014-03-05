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
            BlockIDs.angelSandBlockID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.ANGELSANDBLOCK_NAME, BlockIDs.ANGELSANDBLOCK_DEFAULT).getInt(BlockIDs.ANGELSANDBLOCK_DEFAULT);
            BlockIDs.witherBlockID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.WITHERBLOCK_NAME, BlockIDs.WITHERBLOCK_DEFAULT).getInt(BlockIDs.WITHERBLOCK_DEFAULT);
            BlockIDs.mythDeskID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.MYTHDESK_NAME, BlockIDs.MYTHDESK_DEFAULT).getInt(BlockIDs.MYTHDESK_DEFAULT);
            BlockIDs.forbidRuneID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.FORBIDRUNE_NAME, BlockIDs.FORBIDRUNE_DEFAULT).getInt(BlockIDs.FORBIDRUNE_DEFAULT);   
            BlockIDs.quartisStoneID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISSTONE_NAME, BlockIDs.QUARTISSTONE_DEFAULT).getInt(BlockIDs.QUARTISSTONE_DEFAULT);
            BlockIDs.quartisCobbleID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISCOBBLE_NAME, BlockIDs.QUARTISCOBBLE_DEFAULT).getInt(BlockIDs.QUARTISCOBBLE_DEFAULT);
            BlockIDs.quartisCobbleMossyID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISCOBBLEMOSSY_NAME, BlockIDs.QUARTISCOBBLEMOSSY_DEFAULT).getInt(BlockIDs.QUARTISCOBBLEMOSSY_DEFAULT);
            BlockIDs.quartisBrickLargeID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISBRICKLARGE_NAME, BlockIDs.QUARTISBRICKLARGE_DEFAULT).getInt(BlockIDs.QUARTISBRICKLARGE_DEFAULT);
            BlockIDs.quartisBrickSmallID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.QUARTISBRICKSMALL_NAME, BlockIDs.QUARTISBRICKSMALL_DEFAULT).getInt(BlockIDs.QUARTISBRICKSMALL_DEFAULT);
            BlockIDs.netherBrickLargeID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.NETHERSTONEBRICK_NAME, BlockIDs.NETHERSTONEBRICK_DEFAULT).getInt(BlockIDs.NETHERSTONEBRICK_DEFAULT);
            BlockIDs.netherStoneID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.NETHERSTONE_NAME, BlockIDs.NETHERSTONE_DEFAULT).getInt(BlockIDs.NETHERSTONE_DEFAULT);
            BlockIDs.netherStoneMossyID = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.NETHERSTONEMOSSY_NAME, BlockIDs.NETHERSTONEMOSSY_DEFAULT).getInt(BlockIDs.NETHERSTONEMOSSY_DEFAULT);

            ItemIDs.spellBookID = config.getItem(Configuration.CATEGORY_ITEM, Strings.SPELLBOOK_NAME, ItemIDs.SPELLBOOK_DEFAULT).getInt(ItemIDs.SPELLBOOK_DEFAULT);
            ItemIDs.zarfronID = config.getItem(Configuration.CATEGORY_ITEM, Strings.ZARFRON_NAME, ItemIDs.ZARFRON_DEFAULT).getInt(ItemIDs.ZARFRON_DEFAULT);
            ItemIDs.aquaditeID = config.getItem(Configuration.CATEGORY_ITEM, Strings.AQUADITE_NAME, ItemIDs.AQUADITE_DEFAULT).getInt(ItemIDs.AQUADITE_DEFAULT);
            ItemIDs.erieDropID = config.getItem(Configuration.CATEGORY_ITEM, Strings.ERIEDROP_NAME, ItemIDs.ERIEDROP_DEFAULT).getInt(ItemIDs.ERIEDROP_DEFAULT);
            ItemIDs.boneChunkID = config.getItem(Configuration.CATEGORY_ITEM, Strings.BONECHUNK_NAME, ItemIDs.BONECHUNK_DEFAULT).getInt(ItemIDs.BONECHUNK_DEFAULT);
            ItemIDs.wandQuartzID = config.getItem(Configuration.CATEGORY_ITEM, Strings.WANDQUARTZ_NAME, ItemIDs.WANDQUARTZ_DEFAULT).getInt(ItemIDs.WANDQUARTZ_DEFAULT);
            ItemIDs.wandEnderID = config.getItem(Configuration.CATEGORY_ITEM, Strings.WANDENDER_NAME, ItemIDs.WANDENDER_DEFAULT).getInt(ItemIDs.WANDENDER_DEFAULT);
            ItemIDs.wandFarieID = config.getItem(Configuration.CATEGORY_ITEM, Strings.WANDFARIE_NAME, ItemIDs.WANDFARIE_DEFAULT).getInt(ItemIDs.WANDFARIE_DEFAULT);
            ItemIDs.wandDarkID = config.getItem(Configuration.CATEGORY_ITEM, Strings.WANDDARK_NAME, ItemIDs.WANDDARK_DEFAULT).getInt(ItemIDs.WANDDARK_DEFAULT);
            ItemIDs.wandBoomID = config.getItem(Configuration.CATEGORY_ITEM, Strings.WANDBOOM_NAME, ItemIDs.WANDBOOM_DEFAULT).getInt(ItemIDs.WANDBOOM_DEFAULT);
            
        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + " had a problem loading its configuration file.");
        } finally {
            config.save();
        }
    }
}