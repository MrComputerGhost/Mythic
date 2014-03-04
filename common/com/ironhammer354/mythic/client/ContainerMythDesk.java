package com.ironhammer354.mythic.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;

import com.ironhammer354.mythic.block.TileEntityMythicDesk;

public class ContainerMythDesk extends Container {

    protected TileEntityMythicDesk te;

    public ContainerMythDesk(InventoryPlayer inventory, World world, int x, int y, int z) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                addSlotToContainer(new Slot(te, j + i * 3, 62 + j * 18, 17 + i * 18));
            }
        }
        bindPlayerInventory(inventory);
    }
    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
                    8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
            addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }
    }

    @
    Override
    public boolean canInteractWith(EntityPlayer entityplayer) {

        return true;
    }
}