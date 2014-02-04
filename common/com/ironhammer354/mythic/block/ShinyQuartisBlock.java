package com.ironhammer354.mythic.block;

import java.util.Random;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

import com.ironhammer354.mythic.Mythic;
import com.ironhammer354.mythic.lib.Reference;
import com.ironhammer354.mythic.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ShinyQuartisBlock extends Block {

	@SideOnly(Side.CLIENT)
	public Icon[] icons;

	public ShinyQuartisBlock(int id) {

		super(id, Material.rock);
		setCreativeTab(Mythic.tabMyth);
		setUnlocalizedName(Strings.SHINYQUARTISBLOCK_NAME);
		setHardness(3.0F);
		setResistance(8.0F);
		setLightValue(0.1F);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {

        blockIcon = iconRegister.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}