package com.ironhammer354.mythic.item;

import net.minecraft.item.Item;

import com.ironhammer354.mythic.lib.ItemIDs;

public class MythItems {

	public static Item spellBook;
	public static Item zarfron;
	public static Item aquadite;
	public static Item erieDrop;
	public static Item boneChunk;
	public static Item wandQuartz;
	public static Item wandEnder;
	public static Item wandFarie;

	public static void initItems() {

		spellBook = new SpellBook(ItemIDs.spellBookID);
		zarfron = new Zarfron(ItemIDs.zarfronID);
		aquadite = new Aquadite(ItemIDs.aquaditeID);
		erieDrop = new ErieDrop(ItemIDs.erieDropID);
		boneChunk = new BoneChunk(ItemIDs.boneChunkID);
		wandQuartz = new WandQuartz(ItemIDs.wandQuartzID);
		wandEnder = new WandEnder(ItemIDs.wandEnderID);
		wandFarie = new WandFarie(ItemIDs.wandFarieID);

	}
}