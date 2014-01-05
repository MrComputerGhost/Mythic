package com.ironhammer354.mythic.core.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.ironhammer354.mythic.entity.mob.EntityNymph;
import com.ironhammer354.mythic.entity.model.ModelNymph;
import com.ironhammer354.mythic.event.EventSound;
import com.ironhammer354.mythic.rederer.entity.RenderNymphMob;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderThings() 
    {
            RenderingRegistry.registerEntityRenderingHandler(EntityNymph.class, new RenderNymphMob(new ModelNymph(), 0.5F));
//the 0.5F is the shadowsize
    }
    
    @Override
    public void registerSound() {
            MinecraftForge.EVENT_BUS.register(new EventSound());//register the sound event handling class
    }
}