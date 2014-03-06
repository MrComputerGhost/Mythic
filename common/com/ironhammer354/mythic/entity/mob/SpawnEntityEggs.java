package com.ironhammer354.mythic.entity.mob;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;

import com.ironhammer354.mythic.lib.MobIDs;

public class SpawnEntityEggs {

    public static void CreateSpawnEggs() {
        registerEntityEgg(EntityNymph.class, 0x99FF66, 0xFFB894, MobIDs.nymph);
    }

    public static void registerEntityEgg(Class <? extends Entity > entity, int primaryColor, int secondaryColor, int eid) {
        int id = eid;
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }
}