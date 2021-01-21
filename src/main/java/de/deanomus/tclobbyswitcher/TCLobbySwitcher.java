package de.deanomus.tclobbyswitcher;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

/**
 * Main Class of the plugin
 * set all required parameters for the plugin.yml
 * with this annotations
 */
@Plugin (name="TCLobbySwitcher", version="3.0")
@Description (value="An TimoCloud Addon which adds an LobbySwitcher")
@Author (value="deanomus")
//@Dependency (value="TimoCloud")
public class TCLobbySwitcher extends JavaPlugin {



    public void onEnable(Integer id) {
        Logger log = Bukkit.getLogger();

        log.info("$aIt's starting o.O");
    }


    public void onDisable() {

    }


}
