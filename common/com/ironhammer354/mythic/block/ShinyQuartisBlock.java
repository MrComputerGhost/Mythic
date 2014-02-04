package com.ironhammer354.mythic.block;

import javax.swing.Icon;

import net.minecraft.block.BlockPortal;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

import com.ironhammer354.mythic.Mythic;
import com.ironhammer354.mythic.lib.Reference;
import com.ironhammer354.mythic.lib.Strings;
import com.ironhammer354.mythic.world.gen.mythicworld.MythTeleport;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ShinyQuartisBlock  extends BlockPortal {

	@SideOnly(Side.CLIENT)
	public Icon[] icons;

	public ShinyQuartisBlock(int id) {

		super(id);
		setCreativeTab(Mythic.tabMyth);
		setUnlocalizedName(Strings.SHINYQUARTISBLOCK_NAME);
		setHardness(3.0F);
		setResistance(8.0F);
		setLightValue(0.1F);
	}
	  public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
      {
             if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
             {
                    EntityPlayerMP player = (EntityPlayerMP) par5Entity;
                    ModLoader.getMinecraftServerInstance();
                    MinecraftServer mServer = MinecraftServer.getServer();

                    if (player.timeUntilPortal > 0)
                    {
                          player.timeUntilPortal = 10;
                    }
                    else if (player.dimension != Mythic.myth1Id)
                    {
                          player.timeUntilPortal = 10;

                          player.mcServer.getConfigurationManager().transferPlayerToDimension(player, Mythic.myth1Id, new MythTeleport (mServer.worldServerForDimension(Mythic.myth1Id)));
                    }
                    else
                    {
                          player.timeUntilPortal = 10;
                          player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new MythTeleport(mServer.worldServerForDimension(1)));
                    }
                    }
             }
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {

        blockIcon = iconRegister.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
