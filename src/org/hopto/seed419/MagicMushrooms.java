package org.hopto.seed419;

import org.bukkit.plugin.java.JavaPlugin;
import org.hopto.seed419.Listeners.MushroomListener;

public class MagicMushrooms extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MushroomListener(this), this);}
    }
