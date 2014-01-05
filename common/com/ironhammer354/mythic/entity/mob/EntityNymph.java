package com.ironhammer354.mythic.entity.mob;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityNymph extends EntityMob
{
    public EntityNymph(World par1World)
    {
        super(par1World);
        this.setSize(0.9F, 1.3F);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.20000000298023224D);
    }

    @Override
    protected String getLivingSound()
    {
        return ""/*sound path*/;
    }

    @Override
    protected String getHurtSound()
    {
        return ""/*sound path*/;
    }

    @Override
    protected String getDeathSound()
    {
        return ""/*sound path*/;
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }
    
}