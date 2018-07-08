package me.edin;

import lombok.Getter;
import me.edin.listener.OreListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Ores extends JavaPlugin {

    @Getter public static Ores instance;

    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getServer().getPluginManager().registerEvents(new OreListener(), this);

    }

    @Override
    public void onDisable() {
        instance = null;

    }
}
