package de.deanomus.tclobbyswitcher.cmd;

import de.deanomus.tclobbyswitcher.utils.chat.Colors;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LobbySwitcher_CMD implements CommandExecutor { //TODO: Gui

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Colors.RED + "Only players can execute this command!");
            return false;
        }
        Player p = (Player)sender;

        p.sendMessage(Colors.ForestGreen + "Hello " + Colors.Aqua + p.getDisplayName() + Colors.ForestGreen + ".");

        return false;
    }
}
