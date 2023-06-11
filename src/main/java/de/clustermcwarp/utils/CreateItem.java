package de.clustermcwarp.utils;

/**
 * Plugin Made by D3rz0cker | Dylan
 **/

import de.clustermcwarp.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.GameRule;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CreateItem implements Listener {


    public static ItemStack create(Material m, String ItemName, int amount, int durability) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);

        itemstackinvoid.setDurability((short)durability);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, int durability, ItemFlag flag) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(flag != null) itemmetainvoid.addItemFlags(flag);

        itemstackinvoid.setDurability((short)durability);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, int durability, Enchantment ench, int enchlvl) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);

        itemstackinvoid.setDurability((short)durability);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int enchlvl, int amount, int durability, ItemFlag flag, Enchantment ench) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(flag != null) itemmetainvoid.addItemFlags(flag);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);

        itemstackinvoid.setDurability((short)durability);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, int durability, ItemFlag flag, Enchantment ench, int enchlvl, String lore1, String lore2, String lore3, String lore4) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(flag != null) itemmetainvoid.addItemFlags(flag);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);

        itemmetainvoid.setLore(lore);
        itemstackinvoid.setDurability((short)durability);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, int amount, Enchantment ench, int enchlvl, String lore1, String lore2) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4, String lore5) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4, String lore5, String lore6) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7, String lore8) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7, String lore8, String lore9) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7, String lore8, String lore9, String lore10) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7, String lore8, String lore9, String lore10, String lore11) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7, String lore8, String lore9, String lore10, String lore11, String lore12) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1, String lore2, String lore3) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if(ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if (lore3 != null) lore.add(lore3);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, Enchantment ench, int enchlvl, String lore1, String lore2) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if (ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, Enchantment ench, int enchlvl, String lore1) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if (ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);
        if(lore1 != null) lore.add(lore1);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, Enchantment ench, int enchlvl, boolean show, String lore1) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if (ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);
        if(lore1 != null) lore.add(lore1);

        if (!show) itemmetainvoid.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        if (!show) itemmetainvoid.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, Enchantment ench, int enchlvl, boolean show, String lore1, String lore2, String lore3, String lore4) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if (ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);

        if (!show) itemmetainvoid.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        if (!show) itemmetainvoid.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }public static ItemStack create(Material m, String ItemName, int amount, Enchantment ench, int enchlvl, boolean show, String lore1, String lore2, String lore3, String lore4, String lore5) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if (ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);
        if(lore1 != null) lore.add(lore1);
        if(lore2 != null) lore.add(lore2);
        if(lore3 != null) lore.add(lore3);
        if(lore4 != null) lore.add(lore4);
        if(lore5 != null) lore.add(lore5);

        if (!show) itemmetainvoid.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        if (!show) itemmetainvoid.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, Enchantment ench, int enchlvl) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if (ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, Enchantment ench, int enchlvl, boolean show) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if (ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);

        if (!show) itemmetainvoid.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        if (!show) itemmetainvoid.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String ItemName, int amount, String lore1) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        List<String> lore=new ArrayList<String>();
        lore.clear();

        if (ItemName != null) itemmetainvoid.setDisplayName(ItemName);
        if(lore1 != null) lore.add(lore1);

        itemmetainvoid.setLore(lore);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, int amount, Enchantment ench, int enchlvl) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        if(ench != null) itemmetainvoid.addEnchant(ench, enchlvl, true);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, int amount, String s) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        itemmetainvoid.setDisplayName(s);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, String s) {
        ItemStack itemstackinvoid = new ItemStack(m);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();

        itemmetainvoid.setDisplayName(s);

        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
    public static ItemStack create(Material m, int amount) {
        ItemStack itemstackinvoid = new ItemStack(m, amount);
        ItemMeta itemmetainvoid = itemstackinvoid.getItemMeta();
        itemstackinvoid.setItemMeta(itemmetainvoid);
        return itemstackinvoid;
    }
}
