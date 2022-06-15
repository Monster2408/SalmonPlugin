package xyz.mlserver.salmonplugin;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.mlserver.salmonplugin.listeners.JoinListener;

public final class SalmonPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
