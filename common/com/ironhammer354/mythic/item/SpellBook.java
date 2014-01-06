package com.ironhammer354.mythic.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.ironhammer354.mythic.Mythic;
import com.ironhammer354.mythic.lib.Reference;
import com.ironhammer354.mythic.lib.Strings;

public class SpellBook extends ItemMyth {

	public SpellBook(int id) {

		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.SPELLBOOK_NAME);
	}
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        
		if(!par2EntityPlayer.isSneaking()){
			
			par2EntityPlayer.openGui(Mythic.instance, Reference.SPELLBOOK_GUI_ID, par3World, (int)par2EntityPlayer.posX, (int)par2EntityPlayer.posY, (int)par2EntityPlayer.posZ);
		}
		return true;
    }
}