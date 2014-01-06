package com.ironhammer354.mythic.entity.mob;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityNymph extends EntityMob
{
	

    private float heightOffset = 0.5F;


    private int heightOffsetUpdateTime;
    private int field_70846_g;
    
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
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(1.0D);
    }

    @Override
    protected String getLivingSound()
    {
        return "mythic:mob.nymph.living"/*sound path*/;
    }

    @Override
    protected String getHurtSound()
    {
        return "mythic:mob.nymph.hurt"/*sound path*/;
    }

    @Override
    protected String getDeathSound()
    {
        return "mythic:mob.nymph.death"/*sound path*/;
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }
}