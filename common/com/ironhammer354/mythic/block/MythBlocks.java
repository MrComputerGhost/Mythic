package com.ironhammer354.mythic.block;

import net.minecraft.block.Block;

import com.ironhammer354.mythic.block.ore.OreAquadite;
import com.ironhammer354.mythic.block.ore.OreErie;
import com.ironhammer354.mythic.block.ore.OreZarfron;
import com.ironhammer354.mythic.lib.BlockIDs;
import com.ironhammer354.mythic.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class MythBlocks {

	public static Block aquaditeOre;
	public static Block zarfronOre;
	public static Block erieOre;
	public static Block mythDesk;
	public static Block quartisBlock;
	public static Block witherBlock;

	public static void initBlocks() {

		aquaditeOre = new OreAquadite(BlockIDs.aquaditeOreID);
		zarfronOre = new OreZarfron(BlockIDs.zarfronOreID);
		erieOre = new OreErie(BlockIDs.erieOreID);
		mythDesk = new MythDesk(BlockIDs.mythDeskID);
		quartisBlock = new QuartisBlock(BlockIDs.quartisBlockID);
		witherBlock = new WitherBlock(BlockIDs.witherBlockID);

		GameRegistry.registerBlock(aquaditeOre, Strings.AQUADITEORE_NAME);
		GameRegistry.registerBlock(zarfronOre, Strings.ZARFRONORE_NAME);
		GameRegistry.registerBlock(erieOre, Strings.ERIEORE_NAME);
		GameRegistry.registerBlock(mythDesk, Strings.MYTHDESK_NAME);
		GameRegistry.registerBlock(quartisBlock, Strings.QUARTISBLOCK_NAME);
		GameRegistry.registerBlock(witherBlock, Strings.WITHERBLOCK_NAME);
	}
}