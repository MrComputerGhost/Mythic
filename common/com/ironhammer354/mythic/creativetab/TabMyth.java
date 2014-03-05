package com.ironhammer354.mythic.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.ironhammer354.mythic.item.MythItems;

public class TabMyth extends CreativeTabs {

	public TabMyth(int id, String name) {
		
		super(id, name);
	}

	public ItemStack getIconItemStack() {

		return new ItemStack(MythItems.spellBook);
	}
}