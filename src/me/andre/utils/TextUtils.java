package me.andre.utils;

import me.andre.Main;
import org.bukkit.ChatColor;

public class TextUtils {

    public static String serverName = ChatColor.translateAlternateColorCodes('&', Main.ConfigYML.getString("Server Name"));
    public static String prefix = serverName + " §8» §a";
    public static String noPerm = prefix + "§cYou don't have permission to execute this command.";
    public static String neverPlayed = prefix + "§cYour player has never played before.";
    public static String playerOnly = "Only players can execute this command.";
    public static String ip = Main.ConfigYML.getString("Server IP");
    public static String invalidPlayer = prefix + "§cCould not find the player";

}
