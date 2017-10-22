package me.andre.utils;

import me.andre.Main;

import java.io.IOException;

public class ConfigUtils {

    public static void saveConfig(){
        try {
            Main.ConfigYML.save(Main.config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void defaultConfig(){
        if(!Main.ConfigYML.contains("Server Name")) Main.ConfigYML.set("Server Name", "LabelleRPG");
        if(!Main.ConfigYML.contains("Server IP")) Main.ConfigYML.set("Server IP", "labellehosting.us");
        saveConfig();
    }
}
