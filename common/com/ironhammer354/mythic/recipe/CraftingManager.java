package com.ironhammer354.mythic.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.ironhammer354.mythic.block.MythBlocks;
import com.ironhammer354.mythic.item.MythItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

    public static ItemStack zarfron = new ItemStack(MythItems.zarfron);
    public static ItemStack bone = new ItemStack(Item.bone);
    public static ItemStack boneChunk = new ItemStack(MythItems.boneChunk);
    public static ItemStack soulsand = new ItemStack(Block.slowSand);
    public static ItemStack coal = new ItemStack(Item.coal);
    public static ItemStack sskull = new ItemStack(Item.skull);
    public static ItemStack wskull = new ItemStack(Item.skull, 1, 1);
    public static ItemStack clay = new ItemStack(Item.clay);
    public static ItemStack wither = new ItemStack(MythBlocks.witherBlock);
    public static ItemStack sword = new ItemStack(Item.swordDiamond);
    public static ItemStack white = new ItemStack(MythBlocks.quartisStone);
    public static ItemStack gray = new ItemStack(Block.cobblestone);

    /*Insert ItemStacks Here*/

    public static void addRecipes() {
        GameRegistry.addRecipe(new ItemStack(Item.skull), "###", "#$#", "###", '#', boneChunk, '$', soulsand);
        GameRegistry.addRecipe(new ItemStack(Item.skull, 1, 1), "###", "#$#", "###", '#', coal, '$', sskull);
        GameRegistry.addRecipe(new ItemStack(MythItems.boneChunk), "###", "#$#", "###", '#', bone, '$', clay);
        GameRegistry.addRecipe(new ItemStack(MythBlocks.witherBlock), "###", "$$$", " $ ", '#', wskull, '$', soulsand);
        GameRegistry.addRecipe(new ItemStack(Item.netherStar), "###", "#$#", "###", '#', sword, '$', wither);
        GameRegistry.addRecipe(new ItemStack(MythBlocks.quartisStone, 8), "###", "#$#", "###", '#', gray, '$', clay);
    }

}