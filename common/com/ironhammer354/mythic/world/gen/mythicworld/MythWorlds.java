package com.ironhammer354.mythic.world.gen.mythicworld;

import net.minecraftforge.common.DimensionManager;

public class MythWorlds {
	public static int myth1ID = 5;
	
	public static void initWorlds() {
		DimensionManager.registerProviderType(MythWorlds.myth1ID, MythWorld1.class, false);
		DimensionManager.registerDimension(MythWorlds.myth1ID, MythWorlds.myth1ID);
	}
}
