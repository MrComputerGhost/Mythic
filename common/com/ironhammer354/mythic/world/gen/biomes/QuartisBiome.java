package com.ironhammer354.mythic.world.gen.biomes;

import java.util.Random;

import com.ironhammer354.mythic.block.MythBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;

public class QuartisBiome extends BiomeGenBase
{
    public QuartisBiome(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)MythBlocks.quartisBlock.blockID;
        this.fillerBlock = (byte)MythBlocks.quartisBlock.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        if (par2Random.nextInt(1000) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
            worldgendesertwells.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
    }
}
