package com.ironhammer354.mythic.world.gen.mythicworld;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class MythWorld1 extends WorldProvider
{
       public void registerWorldChunkManager()
       {
              this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.desertHills, 0.8F, 0.1F);
              this.dimensionId = MythWorlds.myth1ID;
       }
      
       public IChunkProvider createChunkGenerator()
       {
              return new MythChunkProvider(worldObj, worldObj.getSeed(), true);
       }
      
       @Override
       public String getDimensionName()
       {
              return "Spirt";
       }
}