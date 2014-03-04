package com.ironhammer354.mythic.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.ironhammer354.mythic.block.MythBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator {

    @
    Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.dimensionId) {

        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            genereateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
    }

    private void generateNether(World world, Random random, int x, int z) {}

    private void genereateSurface(World world, Random random, int x, int z) {

        addOreSpawn(MythBlocks.aquaditeOre, Block.stone, world, random, x, z, 16, 16, 6 + random.nextInt(5), 10, 0, 100);
        addOreSpawn(MythBlocks.zarfronOre, Block.stone, world, random, x, z, 16, 16, 6 + random.nextInt(5), 10, 0, 100);
    }

    private void generateEnd(World world, Random random, int x, int z) {

        addOreSpawn(MythBlocks.erieOre, Block.whiteStone, world, random, x, z, 16, 16, 6 + random.nextInt(5), 10, 0, 100);
    }

    public void addOreSpawn(Block block, Block blockBeingReplaced, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {

        assert maxY > minY: "addOreSpawn: The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int differenceInY = maxY - minY;

        for (int i = 0; i < chanceToSpawn; ++i) {

            int xPos = blockXPos + random.nextInt(maxX);
            int yPos = minY + random.nextInt(differenceInY);
            int zPos = blockZPos + random.nextInt(maxZ);

            (new WorldGenMinable(block.blockID, maxVeinSize, blockBeingReplaced.blockID)).generate(world, random, xPos, yPos, zPos);
        }
    }
}