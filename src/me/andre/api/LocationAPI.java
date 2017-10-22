package me.andre.api;

import me.andre.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class LocationAPI {

    public static void teleportToSpawn(Player p){
        World world = Bukkit.getWorld(Main.LocationYML.getString("spawn.World"));
        int x = Main.LocationYML.getInt("spawn.X"),y = Main.LocationYML.getInt("spawn.Y"),z = Main.LocationYML.getInt("spawn.Z"),pitch = Main.LocationYML.getInt("spawn.Pitch"),yaw = Main.LocationYML.getInt("spawn.Yaw");
        Location spawn = new Location(world, x, y, z, yaw, pitch);
        p.teleport(spawn);
    }
}
