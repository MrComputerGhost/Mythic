package com.ironhammer354.mythic.block.ore;

import java.util.Random;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.ironhammer354.mythic.Mythic;
import com.ironhammer354.mythic.item.MythItems;
import com.ironhammer354.mythic.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreAquadite extends Block {

	@SideOnly(Side.CLIENT)
	public Icon[] icons;

	public OreAquadite(int id) {

		super(id, Material.rock);
		setCreativeTab(Mythic.tabMyth);
		setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.AQUADITEORE_NAME);
		setHardness(3.0F);
		setResistance(8.0F);
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {

		return MythItems.aquadite.itemID;
	}
}