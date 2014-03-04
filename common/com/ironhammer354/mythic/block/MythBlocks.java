package com.ironhammer354.mythic.block;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

import com.ironhammer354.mythic.block.ore.OreAquadite;
import com.ironhammer354.mythic.block.ore.OreErie;
import com.ironhammer354.mythic.block.ore.OreZarfron;
import com.ironhammer354.mythic.block.rune.ForbidRune;
import com.ironhammer354.mythic.lib.BlockIDs;
import com.ironhammer354.mythic.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class MythBlocks {

    public static Block aquaditeOre;
    public static Block zarfronOre;
    public static Block erieOre;
    public static Block angelSandBlock;
    public static Block witherBlock;
    public static Block mythDesk;
    public static Block forbidRune;
    public static Block quartisStone;
    public static Block quartisCobble;
    public static Block quartisCobbleMossy;
    public static Block quartisBrickLarge;
    public static Block quartisBrickSmall;
    public static Block netherBrickLarge;
    public static Block netherStone;

    public static void initBlocks() {

        aquaditeOre = new OreAquadite(BlockIDs.aquaditeOreID);
        zarfronOre = new OreZarfron(BlockIDs.zarfronOreID);
        erieOre = new OreErie(BlockIDs.erieOreID);
        angelSandBlock = new AngelSandBlock(BlockIDs.angelSandBlockID);
        witherBlock = new WitherBlock(BlockIDs.witherBlockID);
        mythDesk = new MythDesk(BlockIDs.mythDeskID);
        forbidRune = new ForbidRune(BlockIDs.forbidRuneID);
        quartisStone = new QuartisStone(BlockIDs.quartisStoneID);
        quartisCobble = new QuartisCobble(BlockIDs.quartisCobbleID);
        quartisCobbleMossy = new QuartisCobbleMossy(BlockIDs.quartisCobbleMossyID);
        quartisBrickLarge = new QuartisBrickLarge(BlockIDs.quartisBrickLargeID);
        quartisBrickSmall = new QuartisBrickSmall(BlockIDs.quartisBrickSmallID);
        netherBrickLarge = new NetherBrickLarge(BlockIDs.netherBrickLargeID);
        netherStone = new NetherStone(BlockIDs.netherStoneID);

        //Registry
        GameRegistry.registerBlock(aquaditeOre, Strings.AQUADITEORE_NAME);
        GameRegistry.registerBlock(zarfronOre, Strings.ZARFRONORE_NAME);
        GameRegistry.registerBlock(erieOre, Strings.ERIEORE_NAME);
        GameRegistry.registerBlock(angelSandBlock, Strings.ANGELSANDBLOCK_NAME);
        GameRegistry.registerBlock(witherBlock, Strings.WITHERBLOCK_NAME);
        GameRegistry.registerBlock(mythDesk, Strings.MYTHDESK_NAME);
        GameRegistry.registerBlock(forbidRune, Strings.FORBIDRUNE_NAME);
        GameRegistry.registerBlock(quartisStone, Strings.QUARTISSTONE_NAME);
        GameRegistry.registerBlock(quartisCobble, Strings.QUARTISCOBBLE_NAME);
        GameRegistry.registerBlock(quartisCobbleMossy, Strings.QUARTISCOBBLEMOSSY_NAME);
        GameRegistry.registerBlock(quartisBrickLarge, Strings.QUARTISBRICKLARGE_NAME);
        GameRegistry.registerBlock(quartisBrickSmall, Strings.QUARTISBRICKSMALL_NAME);
        GameRegistry.registerBlock(netherBrickLarge, Strings.NETHERSTONEBRICK_NAME);
        GameRegistry.registerBlock(netherStone, Strings.NETHERSTONE_NAME);

        MinecraftForge.setBlockHarvestLevel(aquaditeOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(zarfronOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(erieOre, "pickaxe", 2);
    }
}