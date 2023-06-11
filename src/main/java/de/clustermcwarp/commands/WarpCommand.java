package de.clustermcwarp.commands;

import de.clustermcwarp.Main;
import de.clustermcwarp.utils.InventoryManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Klasse erstellt am, 10.06.2023, von D3rz0cker für ClusterMC-Warp
 **/

public class WarpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command c, String label, String[] args) {
        if (!(cs instanceof Player)) {
            cs.sendMessage(Main.PREFIX + "Du musst ein Spieler sein!");
        }
        Player player = (Player) cs;

        switch (args.length) {

            // /clusterwarp
            case 0:

                new InventoryManager().openWarpsInventory(player);
                break;
            case 1:

                if (args[0].equalsIgnoreCase("help")) {
                    if (player.hasPermission("clusterwarps.admin")) {
                        player.sendMessage(Main.PREFIX + "§7/warp");
                        player.sendMessage(Main.PREFIX + "§7/warp set <farmwelt|nether|citybuild>");
                    } else {
                        player.sendMessage(Main.PREFIX + "§7/warp");
                    }
                } else {
                    String argument = args[0];
                    player.performCommand("essentials:warp " + argument);
                }

                break;
            case 2:
                if (player.hasPermission("clusterwarps.admin")) {
                    if (!args[0].equalsIgnoreCase("set")) {
                        player.performCommand("clusterwarp help");
                        break;
                    }
                    String argument = args[1];
                    switch (args[1]) {
                        case "fw":
                        case "farmworld":
                        case "farmwelt":
                            player.performCommand("essentials:delwarp farmwelt");
                            player.performCommand("essentials:setwarp farmwelt");
                            player.sendMessage(Main.PREFIX + "§aWarp für die Farmwelt wurde gesetzt!");
                            break;

                        case "nether":
                            player.performCommand("essentials:delwarp nether");
                            player.performCommand("essentials:setwarp nether");
                            player.sendMessage(Main.PREFIX + "§aWarp für den Nether wurde gesetzt!");
                            break;

                        case "cb":
                        case "citybuild":
                            player.performCommand("essentials:delwarp citybuild");
                            player.performCommand("essentials:setwarp citybuild");
                            player.sendMessage(Main.PREFIX + "§aWarp für den Citybuild wurde gesetzt!");
                            break;

                        default:
                            player.performCommand("essentials:delwarp " + argument);
                            player.performCommand("essentials:setwarp " + argument);
                            player.sendMessage(Main.PREFIX + "§aWarp " + argument + " wurde gesetzt!");
                            break;
                    }

                } else {
                    player.sendMessage(Main.PREFIX + "Keine Berechtigung! clusterwarps.admin");
                }
        }

        return true;
    }
}
