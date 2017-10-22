package me.andre.events;

import me.andre.utils.TextUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinEvent_Listener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        e.setJoinMessage(null);

        joinMessage(p);
    }

    public void joinMessage(Player p){
        for (int i = 0; i < 80; i++) {
            p.sendMessage(" ");
        }
        p.sendMessage(" §m+-------------------------------------------------+");
        p.sendMessage(" ");
        p.sendMessage("                                 " + TextUtils.serverName);
        p.sendMessage("           §7Welcome to the server, §e§l" + p.getName());
        p.sendMessage(" ");
        p.sendMessage(" §m+-------------------------------------------------+");
        p.sendMessage(" ");
    }
}
