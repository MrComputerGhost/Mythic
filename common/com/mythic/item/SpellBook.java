package com.mythic.item;

import com.mythic.lib.Strings;

public class SpellBook extends ItemMyth {

	public SpellBook(int id) {

		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.SPELLBOOK_NAME);
	}
}
