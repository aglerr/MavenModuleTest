package com.muhammaddaffa.mavenmodule;

import com.muhammaddaffa.mavenmodule.modulewrapper.ModuleWrapper;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MavenModule extends JavaPlugin {

    @Override
    public void onEnable(){
        Bukkit.getScheduler().runTaskLater(this, ModuleWrapper::random, 100L);
    }

}
