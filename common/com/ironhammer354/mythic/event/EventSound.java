package com.ironhammer354.mythic.event;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class EventSound 
{
        @ForgeSubscribe
        public void onSoundLoad(SoundLoadEvent event) {
                event.manager.addSound("mythic:sound/mob/nymph/hurt.ogg"/*sound path*/);
                event.manager.addSound("mythic:sound/mob/nymph/living.ogg"/*sound path*/);
                event.manager.addSound("mythic:sound/mob/nymph/death.ogg"/*sound path*/);
        }
}
