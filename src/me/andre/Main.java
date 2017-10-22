package me.andre;

import me.andre.utils.ConfigUtils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin implements Listener{

    public static File config = new File("plugins/LabelleRPG", "config.yml");
    public static FileConfiguration ConfigYML = YamlConfiguration.loadConfiguration(config);

    public static PluginManager pm = Bukkit.getServer().getPluginManager();

    @Override
    public void onEnable() {
        registerEvents();
        ConfigUtils.saveConfig();
    }

    public void registerEvents(){
        pm.registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerRightClick(PlayerInteractAtEntityEvent e){
        Entity ent = e.getRightClicked();
        if(ent.getType().equals(EntityType.COW)){
            ent.setVelocity(ent.getVelocity().multiply(4));
        }
        return;
    }
}
