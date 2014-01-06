package com.ironhammer354.mythic.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.ironhammer354.mythic.Mythic;
import com.ironhammer354.mythic.lib.Reference;
import com.ironhammer354.mythic.lib.Strings;

public class MythDesk extends BlockContainer {

	public MythDesk(int par1) {
		
		super(par1, Material.wood);
		setCreativeTab(Mythic.tabMyth);
		setUnlocalizedName(Strings.MYTHDESK_NAME);
	}
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		
		if(!par5EntityPlayer.isSneaking() && par5EntityPlayer.getDistanceSq(par2, par3, par4) < 20){
			
			par5EntityPlayer.openGui(Mythic.instance, Reference.MYTHDESK_GUI_ID, par1World, par2, par3, par4);
		}

		return true;
    }
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		// TODO Auto-generated method stub
		return null;
	}
}