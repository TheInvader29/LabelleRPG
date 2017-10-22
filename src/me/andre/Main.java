package me.andre;

import me.andre.events.AsyncPlayerChatEvent_Listener;
import me.andre.events.PlayerJoinEvent_Listener;
import me.andre.utils.ConfigUtils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    public static File location = new File("plugins/LabelleRPG", "location.yml");
    public static FileConfiguration LocationYML = YamlConfiguration.loadConfiguration(location);

    public static File config = new File("plugins/LabelleRPG", "config.yml");
    public static FileConfiguration ConfigYML = YamlConfiguration.loadConfiguration(config);

    public static PluginManager pm = Bukkit.getServer().getPluginManager();

    @Override
    public void onEnable() {
        registerEvents();
        registerCommands();

        ConfigUtils.defaultLocationConfig();
        ConfigUtils.defaultConfig();
    }

    public void registerEvents(){
        pm.registerEvents(new AsyncPlayerChatEvent_Listener(), this);
        pm.registerEvents(new PlayerJoinEvent_Listener(), this);
    }

    public void registerCommands(){
    }
}
