package com.ironhammer354.mythic.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.ironhammer354.mythic.Mythic;
import com.ironhammer354.mythic.lib.Reference;

public class ItemMyth extends Item {

	public ItemMyth(int id) {

		super(id - Reference.VANILLA_ITEMID_FIX);
		setCreativeTab(Mythic.tabMyth);
	}

	public void registerIcons(IconRegister iconRegister) {

		itemIcon = iconRegister.registerIcon(getUnlocalizedName().substring(getUnlocalizedName().indexOf('.') + 1));
	}
}