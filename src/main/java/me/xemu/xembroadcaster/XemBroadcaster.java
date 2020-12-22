/*
Plugin Developed & Maintained by Xemu
 */
package me.xemu.xembroadcaster;

import org.bukkit.plugin.java.JavaPlugin;

public final class XemBroadcaster extends JavaPlugin 
{

    private static XemBroadcaster instance;

    @Override public void onEnable()
    {
        getLogger().info("Plugin Enabled");
    };

    @Override public void onDisable() 
    {
        getLogger().info("Plugin Disabled");
    };

    
    public static XemBroadcaster getInstance()
    {
        return instance;
    };

};
