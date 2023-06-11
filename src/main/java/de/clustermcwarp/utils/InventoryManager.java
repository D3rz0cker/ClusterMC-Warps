package de.clustermcwarp.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

/**
 * Klasse erstellt am, 10.06.2023, von D3rz0cker für ClusterMC-Warp
 **/

public class InventoryManager implements Listener {


    @EventHandler
    public void onInvClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        Inventory inventory = e.getClickedInventory();
        String title = e.getView().getTitle();
        int slot = e.getRawSlot();

        if (!title.equals("§3ClusterWarps")) return;
        if (e.getClickedInventory() == null) return;

        e.setCancelled(true);
        player.updateInventory();

        if (slot == 20) {
            player.performCommand("essentials:warp farmwelt");
        } else if (slot == 22) {
            player.performCommand("essentials:warp citybuild");
        } else if (slot == 24) {
            player.performCommand("essentials:warp nether");
        }
    }


    public void openWarpsInventory(Player player) {

        Inventory inventory = Bukkit.createInventory(null, 9*5, "§3ClusterWarps");

        for (int i = 0; i<9*5; i++) {
            inventory.setItem(i, CreateItem.create(Material.GRAY_STAINED_GLASS_PANE, 1, "§1"));
        }

        inventory.setItem(20, CreateItem.create(Material.STONE, "§3Farmwelt", 1, "§aKlicken um zur Farmwelt zu kommen!"));
        inventory.setItem(22, CreateItem.create(Material.GRASS_BLOCK, "§aCitybuild", 1, "§aKlicken um zum Citybuild zu kommen!"));
        inventory.setItem(24, CreateItem.create(Material.NETHERRACK, "§cNether", 1, "§aKlicken um zum Nether zu kommen!"));


        player.openInventory(inventory);
    }

}
