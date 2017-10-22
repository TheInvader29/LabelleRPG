package me.andre.api;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.List;

public class ItemAPI {

    // ItemAPI.build(Material.SNOW_BALL, 1, "§aEsconder Players", Arrays.asList(new String[] {"§6§lSelecionado"}))

    public static ItemStack build(Material mat, int amount, String name, List<String> lore) {
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack build(Material mat, int amount, String name, short Short) {
        ItemStack item = new ItemStack(mat, amount, Short);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack build(Material mat, byte metaData, String name, List<String> lore) {
        @SuppressWarnings("deprecation")
        ItemStack item = new ItemStack(mat, (byte) 1, (short) 0, (byte) metaData);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack build(Material mat, byte metaData, int amount, String name, List<String> lore) {
        @SuppressWarnings("deprecation")
        ItemStack item = new ItemStack(mat, amount, (short) 0, (byte) metaData);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack build(Material mat, int amount, String name, short damage, List<String> lore) {
        ItemStack item = new ItemStack(mat, amount, damage);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack build(Material mat, int amount, String name, short damage, Enchantment enchant,
                                  int enchantl, List<String> lore) {
        ItemStack item = new ItemStack(mat, amount, damage);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        meta.setDisplayName(name);
        meta.addEnchant(enchant, enchantl, true);
        item.addUnsafeEnchantment(enchant, enchantl);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack skull(String name, String owner) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM);
        skull.setDurability((short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setOwner(owner);
        skullMeta.setDisplayName(name);
        skull.setItemMeta(skullMeta);
        return skull;
    }

    public static ItemStack skull(String name, Short metaData) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM);
        skull.setDurability(metaData);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName(name);
        skull.setItemMeta(skullMeta);
        return skull;
    }

    public static ItemStack skull(String name, String owner, List<String> lore) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM);
        skull.setDurability((short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setLore(lore);
        skullMeta.setOwner(owner);
        skullMeta.setDisplayName(name);
        skull.setItemMeta(skullMeta);
        return skull;
    }

    public static ItemStack skull(String name, Short metaData, List<String> lore) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM);
        skull.setDurability(metaData);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setLore(lore);
        skullMeta.setDisplayName(name);
        skull.setItemMeta(skullMeta);
        return skull;
    }
}
