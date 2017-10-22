package me.andre.utils;

import me.andre.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.io.IOException;

public class ConfigUtils {

    public static void saveConfig(){
        try {
            Main.ConfigYML.save(Main.config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveLocationConfig(){
        try {
            Main.LocationYML.save(Main.location);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void defaultLocationConfig(){
        Location spawn = Bukkit.getWorld("world").getSpawnLocation();
        int x = spawn.getBlockX(),y = spawn.getBlockY(),z = spawn.getBlockZ(),yaw = (int) spawn.getYaw(),pitch = (int) spawn.getPitch();
        if(!Main.LocationYML.contains("spawn.World")) Main.LocationYML.set("spawn.World", "world");
        if(!Main.LocationYML.contains("spawn.X")) Main.LocationYML.set("spawn.X", x);
        if(!Main.LocationYML.contains("spawn.Y")) Main.LocationYML.set("spawn.Y", y);
        if(!Main.LocationYML.contains("spawn.Z")) Main.LocationYML.set("spawn.Z", z);
        if(!Main.LocationYML.contains("spawn.Pitch")) Main.LocationYML.set("spawn.Pitch", pitch);
        if(!Main.LocationYML.contains("spawn.Yaw")) Main.LocationYML.set("spawn.Yaw", yaw);
        saveLocationConfig();
    }

    public static void defaultConfig(){
        if(!Main.ConfigYML.contains("Server Name")) Main.ConfigYML.set("Server Name", "&9&lLabelleRPG");
        if(!Main.ConfigYML.contains("Server IP")) Main.ConfigYML.set("Server IP", "labellehosting.us");
        saveConfig();
    }
}
