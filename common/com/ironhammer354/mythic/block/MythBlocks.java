package com.ironhammer354.mythic.block;

import net.minecraft.block.Block;

import com.ironhammer354.mythic.block.ore.OreAquadite;
import com.ironhammer354.mythic.block.ore.OreErie;
import com.ironhammer354.mythic.block.ore.OreZarfron;
import com.ironhammer354.mythic.lib.BlockIDs;
import com.ironhammer354.mythic.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class MythBlocks {

	public static Block placeHolderBlock;
	public static Block aquaditeOre;
	public static Block zarfronOre;
	public static Block erieOre;
	public static Block mythDesk;
	public static Block quartisBlock;

	public static void initBlocks() {

		placeHolderBlock = new BlockPlaceHolderBlock(BlockIDs.placeHolderBlockID);
		aquaditeOre = new OreAquadite(BlockIDs.aquaditeOreID);
		zarfronOre = new OreZarfron(BlockIDs.zarfronOreID);
		erieOre = new OreErie(BlockIDs.erieOreID);
		mythDesk = new MythDesk(BlockIDs.mythDeskID);
		quartisBlock = new QuartisBlock(BlockIDs.quartisBlockID);

		GameRegistry.registerBlock(placeHolderBlock, Strings.PLACEHOLDERBLOCK_NAME);
		GameRegistry.registerBlock(aquaditeOre, Strings.AQUADITEORE_NAME);
		GameRegistry.registerBlock(zarfronOre, Strings.ZARFRONORE_NAME);
		GameRegistry.registerBlock(erieOre, Strings.ERIEORE_NAME);
		GameRegistry.registerBlock(mythDesk, Strings.MYTHDESK_NAME);
		GameRegistry.registerBlock(quartisBlock, Strings.QUARTISBLOCK_NAME);
	}
}