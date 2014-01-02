package com.mythic.item;

import net.minecraft.item.Item;

import com.mythic.lib.ItemIDs;

public class MythItems {

	public static Item placeHolderItem;

	public static void initItems() {

		placeHolderItem = new ItemPlaceHolderItem(ItemIDs.placeHolderItemID);				

	}

}
