package com.ironhammer354.mythic.creativetab;

import com.ironhammer354.mythic.item.MythItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMyth extends CreativeTabs {

	public TabMyth(int id, String name) {
		
		super(id, name);
	}

	public ItemStack getIconItemStack() {

		return new ItemStack(MythItems.spellBook);
	}
}