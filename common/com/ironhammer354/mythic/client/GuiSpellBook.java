package com.ironhammer354.mythic.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiSpellBook extends GuiContainer {

    public GuiSpellBook(EntityPlayer player, World world, int x, int y, int z) {

        super(new ContainerSpellBook(player.inventory, world, x, y, z));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {

    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {

    }
}