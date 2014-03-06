package com.ironhammer354.mythic.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.ironhammer354.mythic.lib.Strings;

public class WandBoom extends ItemMyth {
//TheComputerGhost added this.
	public WandBoom(int id) {

		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.WANDBOOM_NAME);
	}
	
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
	 boolean flag = false;
	 if ((player.inventory.hasItem(Item.gunpowder.itemID)) && (player.inventory.hasItem(Item.redstone.itemID))) flag = true; //Checks if player has gunpowder and redstone in their inventory.
	 if ((flag) || (player.capabilities.isCreativeMode)) //Checks if flag (from above) is true or if the player is in creative.
	 {
	    player.inventory.consumeInventoryItem(Item.redstone.itemID);
	    player.inventory.consumeInventoryItem(Item.gunpowder.itemID); 
        final double RANGE = 100; //Sets the Range for our Moving Object Position
        Vec3 lookdir = player.getLook(1);  //Gets the look direction
        Vec3 src = world.getWorldVec3Pool().getVecFromPool(player.posX+lookdir.xCoord, player.posY+lookdir.yCoord+player.getEyeHeight(), player.posZ+lookdir.zCoord); 
        Vec3 dst = src.addVector(lookdir.xCoord*RANGE, lookdir.yCoord*RANGE, lookdir.zCoord*RANGE);
        MovingObjectPosition mop = world.rayTraceBlocks_do_do(src, dst, true, true);
        if(mop == null) return item; //Self explanatory   

        if(!world.isRemote) {
            world.createExplosion(null, mop.hitVec.xCoord, mop.hitVec.yCoord, mop.hitVec.zCoord, 5, false);
            //Change last false to true if you want blocks to be damaged as well, otherwise leave that false.
        }
	 }
        return item;
     }
}

//