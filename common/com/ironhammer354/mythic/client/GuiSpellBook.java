package com.ironhammer354.mythic.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class GuiSpellBook extends GuiContainer {

	public GuiSpellBook(EntityPlayer player, World world, int x, int y,  int z) {
		super(new ContainerSpellBook(player.inventory, world, x, y, z));
	}

	@Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {

        fontRenderer.drawString(StatCollector.translateToLocal("he"), 28, 6, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal("there"), 8, ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int var5 = (width - xSize) / 2;
        int var6 = (height - ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, xSize, ySize);
    }
}