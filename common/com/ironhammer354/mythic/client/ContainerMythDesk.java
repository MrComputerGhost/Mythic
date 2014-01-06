package com.ironhammer354.mythic.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;

public class ContainerMythDesk extends Container {

	public ContainerMythDesk(InventoryPlayer inventory, World world, int x,	int y, int z) {

	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {

		return true;
	}
}