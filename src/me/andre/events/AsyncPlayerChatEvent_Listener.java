package me.andre.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncPlayerChatEvent_Listener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        e.setMessage(e.getMessage().substring(0,1).toUpperCase() + e.getMessage().substring(1).toLowerCase());
        e.setFormat("%s §f» %s");
    }
}
