package com.mythic.block;

import net.minecraft.block.Block;

import com.mythic.lib.BlockIDs;
import com.mythic.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class MythBlocks {

	public static Block placeHolderBlock;


	public static void initBlocks() {

		placeHolderBlock = new BlockPlaceHolderBlock(BlockIDs.placeHolderBlockID);


		GameRegistry.registerBlock(placeHolderBlock, Strings.PLACEHOLDERBLOCK_NAME);



	}

}
