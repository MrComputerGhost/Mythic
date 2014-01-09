package com.ironhammer354.mythic.item;

import com.ironhammer354.mythic.lib.Strings;

public class BoneChunk extends ItemMyth {

	public BoneChunk(int id) {

		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.BONECHUNK_NAME);
	}
}