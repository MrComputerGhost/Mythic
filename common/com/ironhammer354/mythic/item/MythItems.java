package com.ironhammer354.mythic.item;

import net.minecraft.item.Item;

import com.ironhammer354.mythic.lib.ItemIDs;

public class MythItems {

	public static Item spellBook;
	public static Item zarfron;
	public static Item aquadite;
	public static Item erieDrop;

	public static void initItems() {

		spellBook = new SpellBook(ItemIDs.spellBookID);
		zarfron = new Zarfron(ItemIDs.zarfronID);
		aquadite = new Aquadite(ItemIDs.aquaditeID);
		erieDrop = new ErieDrop(ItemIDs.erieDropID);

	}

}
