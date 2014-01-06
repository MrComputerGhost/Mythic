package com.ironhammer354.mythic.entity.mob;

import com.ironhammer354.mythic.lib.MobIDs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;

public class SpawnEntityEggs {


		public static void CreateSpawnEggs(){
			registerEntityEgg(EntityNymph.class, 0x522900, 0x339966, MobIDs.nymph);
		}
		
		public static void registerEntityEgg(Class<? extends Entity>entity, int primaryColor, int secondaryColor, int eid) {
			int id = eid;
			EntityList.IDtoClassMapping.put(id, entity);
			EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
		}
	}
