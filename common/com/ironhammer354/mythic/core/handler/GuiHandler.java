package com.ironhammer354.mythic.core.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.ironhammer354.mythic.client.ContainerMythDesk;
import com.ironhammer354.mythic.client.ContainerSpellBook;
import com.ironhammer354.mythic.client.GuiMythDesk;
import com.ironhammer354.mythic.client.GuiSpellBook;
import com.ironhammer354.mythic.lib.Reference;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {

		if(ID == Reference.SPELLBOOK_GUI_ID)
			return new ContainerSpellBook(player.inventory, world, x, y, z);
		if(ID == Reference.MYTHDESK_GUI_ID)
			return new ContainerMythDesk(player.inventory, world, x, y, z);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		if(ID == Reference.SPELLBOOK_GUI_ID)
			return new GuiSpellBook(player, world, x, y, z);
		if(ID == Reference.MYTHDESK_GUI_ID)
			return new GuiMythDesk(player, world, x, y, z);
		return null;
	}
}