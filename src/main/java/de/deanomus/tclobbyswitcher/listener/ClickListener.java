package de.deanomus.tclobbyswitcher.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.MaterialData;

public class ClickListener implements Listener {

    @EventHandler
    public void onLeftClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();

        if (e.getItem().getItemMeta().hasDisplayName()) {
            p.sendMessage("Item: " + e.getItem().getItemMeta().getDisplayName());
        } else {
            p.sendMessage("Item");
        }

    }

}
