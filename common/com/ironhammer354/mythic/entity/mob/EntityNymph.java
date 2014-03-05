package com.ironhammer354.mythic.entity.mob;

//Do Ctrl+Chift+O to clean this up.
import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
<<<<<<< HEAD
=======
import net.minecraft.entity.monster.EntityMob;
>>>>>>> origin/Development
import net.minecraft.entity.player.*;
import net.minecraft.item.*;

public class EntityNymph extends EntityMob {

    private float heightOffset = 0.5F;

    private int heightOffsetUpdateTime;
    private int field_70846_g;
    
    /** List of items a nymph should drop on death. */
    private static final int[] nymphDrops = new int[] {Item.glowstone.itemID, Item.feather.itemID, Item.silk.itemID};

    public EntityNymph(World par1World) {
        super(par1World);
        this.setSize(0.9F, 1.3F);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }
    
    /**
      * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
      * par2 - Level of Looting used to kill this mob.
      */
    protected void dropFewItems(boolean par1, int par2) {
         int j = this.rand.nextInt(3) + 1;
 
         for (int k = 0; k < j; ++k)
         {
             int l = this.rand.nextInt(3);
             int i1 = nymphDrops[this.rand.nextInt(nymphDrops.length)];
 
             if (par2 > 0)
             {
                 l += this.rand.nextInt(par2 + 1);
             }
 
             for (int j1 = 0; j1 < l; ++j1)
             {
                 this.dropItem(i1, 1);
             }
         }
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(1.0D);
    }

    @Override
    protected String getLivingSound() {
        return "mythic:mob.nymph.living" /*sound path*/ ;
    }

    @Override
    protected String getHurtSound() {
        return "mythic:mob.nymph.hurt" /*sound path*/ ;
    }

    @Override
    protected String getDeathSound() {
        return "mythic:mob.nymph.death" /*sound path*/ ;
    }

    @Override
    protected float getSoundVolume() {
        return 0.4F;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        return true;
    }
}
