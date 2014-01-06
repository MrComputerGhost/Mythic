package com.ironhammer354.mythic.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.ironhammer354.mythic.Mythic;
import com.ironhammer354.mythic.lib.BlockIDs;
import com.ironhammer354.mythic.lib.Strings;

public class MythDesk extends BlockContainer {


	public MythDesk(int par1) {
		super(par1, Material.wood);
		setCreativeTab(Mythic.tabMyth);
		setUnlocalizedName(Strings.MYTHDESK_NAME);
	}
	
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
		byte placed = 0;
		
		System.out.println(par5EntityLivingBase.getRotationYawHead());
		if(placed == 0){
			
			if(par5EntityLivingBase.getRotationYawHead() <90){
				
				if(par1World.getBlockId(par2-1, par3, par4) == 0){
					
					par1World.setBlock(par2-1, par3, par4, BlockIDs.mythDeskID);
					par1World.setBlock(par2, par3, par4, BlockIDs.mythDeskID);
				}
			}
			else if (par5EntityLivingBase.getRotationYawHead() >=90 && par5EntityLivingBase.getRotationYawHead() <180){
				
				if(par1World.getBlockId(par2, par3, par4-1) == 0){
					
					par1World.setBlock(par2, par3, par4-1, BlockIDs.mythDeskID);
					par1World.setBlock(par2, par3, par4, BlockIDs.mythDeskID);
				}
			}
			else if (par5EntityLivingBase.getRotationYawHead() >=180 && par5EntityLivingBase.getRotationYawHead() <270){
				
					if(par1World.getBlockId(par2+1, par3, par4) == 0){
						
						par1World.setBlock(par2+1, par3, par4, BlockIDs.mythDeskID);
						par1World.setBlock(par2, par3, par4, BlockIDs.mythDeskID);
					}
			}
			else if (par5EntityLivingBase.getRotationYawHead() >270 && par5EntityLivingBase.getRotationYawHead() <=360){
				
					if(par1World.getBlockId(par2, par3, par4+1) == 0){
						
						par1World.setBlock(par2, par3, par4+1, BlockIDs.mythDeskID);
						par1World.setBlock(par2, par3, par4, BlockIDs.mythDeskID);
					}
			}
        placed = 1;
        }
    }

	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockId(par2, par3, par4);
        Block block = Block.blocksList[l];
        return block == null || block.isBlockReplaceable(par1World, par2, par3, par4);
    }
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		// TODO Auto-generated method stub
		return null;
	}

}
