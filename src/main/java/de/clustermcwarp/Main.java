package de.clustermcwarp;

import de.clustermcwarp.commands.WarpCommand;
import de.clustermcwarp.utils.CreateItem;
import de.clustermcwarp.utils.InventoryManager;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;


    public static String PREFIX = "§8[§3ClusterMC§8] §r";

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info(" started.");
        getCommand("clusterwarp").setExecutor(new WarpCommand());
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new InventoryManager(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info(" stopped.");
        instance = null;
    }

    public static Main getInstance() {
        return instance;
    }
}
