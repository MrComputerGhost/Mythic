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

public class WitherBlock extends Block {

	@SideOnly(Side.CLIENT)
	public Icon[] icons;

	public WitherBlock(int id) {

		super(id, Material.rock);
		setCreativeTab(Mythic.tabMyth);
		setUnlocalizedName(Strings.WITHERBLOCK_NAME);
		setHardness(3.0F);
		setResistance(8.0F);
		setTickRandomly(true);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {

        blockIcon = iconRegister.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
	
	public void randomDisplayTick(World world, int par2, int par3, int par4, Random random)
    {
            this.sparkle(world, par2, par3, par4);
    }

    private void sparkle(World world, int par2, int par3, int par4)
    {
            Random random = world.rand;
            double d0 = 0.0625D;
            for(int i = 0; i < 4; i++)
            {
                    double d1 = (double)((float)par2 + random.nextFloat());
                    double d2 = (double)((float)par3 + random.nextFloat());
                    double d3 = (double)((float)par4 + random.nextFloat());

                    if(i == 0 && !world.isBlockOpaqueCube(par2, par3 + 1, par4))
                    {
                            d2 = (double)(par3 + 1) + d0;
                    }

                    if(i == 1 && !world.isBlockOpaqueCube(par2, par3 - 1, par4))
                    {
                            d2 = (double)(par3 + 0) - d0;
                    }

                    if(i == 2 && !world.isBlockOpaqueCube(par2, par3, par4 + 1))
                    {
                            d3 = (double)(par4 + 1) + d0;
                    }

                    if(i == 3 && !world.isBlockOpaqueCube(par2, par3, par4 - 1))
                    {
                            d3 = (double)(par4 + 0) - d0;
                    }

                    if(i == 4 && !world.isBlockOpaqueCube(par2 + 1, par3, par4))
                    {
                            d1 = (double)(par2 + 1) + d0;
                    }

                    if(i == 5 && !world.isBlockOpaqueCube(par2 - 1, par3, par4))
                    {
                            d1 = (double)(par2 + 0) - d0;
                    }

                    if (d1 < (double)par2 || d1 > (double)(par2 + 1) || d2 < 0.0D || d2 > (double)(par3 + 1) || d3 < (double)par4 || d3 > (double)(par4 + 1))
                    {
                    	world.spawnParticle("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
                    }

            }

    }
}