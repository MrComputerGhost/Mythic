package com.ironhammer354.mythic.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.ironhammer354.mythic.lib.Strings;

public class WandBoom extends ItemMyth {
//TheComputerGhost send this to me to add. 
	public WandBoom(int id) {

		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.WANDBOOM_NAME);
	}
	
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
        final double RANGE = 100;
        Vec3 lookdir = player.getLook(1);  
        Vec3 src = world.getWorldVec3Pool().getVecFromPool(player.posX+lookdir.xCoord, player.posY+lookdir.yCoord+player.getEyeHeight(), player.posZ+lookdir.zCoord);
        Vec3 dst = src.addVector(lookdir.xCoord*RANGE, lookdir.yCoord*RANGE, lookdir.zCoord*RANGE);
        MovingObjectPosition mop = world.rayTraceBlocks_do_do(src, dst, true, true);
        if(mop == null) return item;
        int i = MathHelper.floor_double(mop.hitVec.xCoord);
        int j = MathHelper.floor_double(mop.hitVec.yCoord);
        int k = MathHelper.floor_double(mop.hitVec.zCoord);    
               
        if(!world.isRemote) world.createExplosion(player, mop.hitVec.xCoord, mop.hitVec.yCoord, mop.hitVec.zCoord, 5, false); 
        //Change last false to true if you want blocks to be damaged as well, otherwise leave that false.
       
        return item;
      }
}