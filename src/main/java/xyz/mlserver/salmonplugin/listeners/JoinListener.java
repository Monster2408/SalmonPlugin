package xyz.mlserver.salmonplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class JoinListener implements Listener {

    @EventHandler
    public void on(PlayerJoinEvent e) {
        if (e.getPlayer().hasPlayedBefore()) return;
        e.setJoinMessage(ChatColor.YELLOW + e.getPlayer().getName() + "さんが新規で参加しました！");
        e.getPlayer().getInventory().addItem(new ItemStack(Material.WOODEN_PICKAXE));
        e.getPlayer().getInventory().addItem(new ItemStack(Material.WOODEN_AXE));
        e.getPlayer().getInventory().addItem(new ItemStack(Material.BAKED_POTATO, 32));
    }

}
