package de.deanomus.tclobbyswitcher;

import de.deanomus.tclobbyswitcher.storage.Constants;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.dependency.Dependency;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

import java.util.logging.Logger;

@Plugin(name="TCLobbySwitcher", version="3.0")
@Description(value="An TimoCloud Addon which adds an LobbySwitcher")
@Author(value="deanomus")
//@Dependency(value="TimoCloud")
public class TCLobbySwitcher extends JavaPlugin {


    @Override
    public void onEnable() {
        Logger log = Bukkit.getLogger();

        log.info("$aIt's starting o.O");
    }


    @Override
    public void onDisable() {
    }


}
