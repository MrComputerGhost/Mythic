package com.ironhammer354.mythic.item;

import com.ironhammer354.mythic.lib.Strings;

public class SpellBook extends ItemMyth {

	public SpellBook(int id) {

		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.SPELLBOOK_NAME);
	}
}
