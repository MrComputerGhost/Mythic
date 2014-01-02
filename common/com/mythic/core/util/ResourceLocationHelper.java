package com.mythic.core.util;

import net.minecraft.util.ResourceLocation;

import com.mythic.lib.Reference;

public class ResourceLocationHelper {

	public static ResourceLocation getResourceLocation(String path) {

		return new ResourceLocation(Reference.MOD_ID.toLowerCase(), path);
	}
}
