package com.ironhammer354.mythic.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;

public class ContainerSpellBook extends Container {

	public ContainerSpellBook(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) {
		
		
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {

		return true;
	}
}