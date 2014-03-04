package com.ironhammer354.mythic.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.ironhammer354.mythic.lib.Reference;

public class GuiMythDesk extends GuiContainer {

    public GuiMythDesk(EntityPlayer player, World world, int x, int y, int z) {
        super(new ContainerMythDesk(player.inventory, world, x, y, z));
        // TODO Auto-generated constructor stub
    }

    @
    Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        //draw text and stuff here
        //the parameters for drawString are: string, x, y, color
        fontRenderer.drawString("Tiny", 8, 6, 4210752);
        //draws "Inventory" or your regional equivalent
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
    }

    @
    Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2,
        int par3) {
        //draw your Gui here, only thing you need to change is the path
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}