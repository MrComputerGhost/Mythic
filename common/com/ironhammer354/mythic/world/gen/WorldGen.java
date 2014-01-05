package com.ironhammer354.mythic.world.gen;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGen {

	private static WorldGenOres ores = new WorldGenOres();

	public static void init() {

		GameRegistry.registerWorldGenerator(ores);
	}
}
