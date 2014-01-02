package com.mythic.block;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.mythic.Mythic;
import com.mythic.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPlaceHolderBlock extends Block {


	@SideOnly(Side.CLIENT)
	public Icon[] icons;

	public BlockPlaceHolderBlock(int id) {

		super(id, Material.rock);
		setCreativeTab(Mythic.tabMyth);
		setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.PLACEHOLDERBLOCK_NAME);
		setHardness(3.0F);
		setResistance(8.0F);
	}

}
