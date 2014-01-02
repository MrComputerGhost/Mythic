package com.mythic.item;

import com.mythic.lib.Strings;

public class ItemPlaceHolderItem extends ItemMyth {

	public ItemPlaceHolderItem(int id) {

		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.PLACEHOLDERITEM_NAME);
	}
}
