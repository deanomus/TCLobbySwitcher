package de.deanomus.tclobbyswitcher;

import java.util.logging.Logger;

import de.deanomus.tclobbyswitcher.cmd.LobbySwitcher_CMD;
import de.deanomus.tclobbyswitcher.objects.ItemBuilder;
import de.deanomus.tclobbyswitcher.utils.chat.Colors;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Command;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

/**
 * Main Class of the plugin
 * set all required parameters for the plugin.yml
 * with this annotations
 */
@Plugin(name="TCLobbySwitcher", version="3.0")
@Description(value="An TimoCloud Addon which adds an LobbySwitcher")
@Author(value="deanomus")
@Commands(
        @Command(name = "lobbyswitcher", desc = "Open's the lobbyswitcher gui")
)
//@Dependency (value="TimoCloud")
public class TCLobbySwitcher extends JavaPlugin {



    public void onEnable() {
        Logger log = Bukkit.getLogger();

        getCommand("lobbyswitcher").setExecutor(new LobbySwitcher_CMD());

        log.info("It's starting o.O");
    }


    public void onDisable() {


    }




}
