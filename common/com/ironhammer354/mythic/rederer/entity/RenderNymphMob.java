package com.ironhammer354.mythic.rederer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderNymphMob extends RenderLiving {
    private static final ResourceLocation NymphTexture = new ResourceLocation("mythic:textures/mobs/Nymph.png" /*texture path*/ );

    public RenderNymphMob(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return NymphTexture;
    }
}