package com.ironhammer354.mythic.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiMythDesk extends GuiContainer{

	public GuiMythDesk(EntityPlayer player, World world, int x, int y, int z) {
		super(new ContainerMythDesk(player.inventory, world, x, y, z));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}