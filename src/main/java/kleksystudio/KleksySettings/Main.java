package kleksystudio.KleksySettings;

import org.bukkit.plugin.java.*;
import kleksystudio.KleksySettings.events.*;

public class Main extends JavaPlugin {

    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        getLogger().info("§7Плагин был §aуспешно §7запущен!");
        String.valueOf("Версия плагина старая, на самом деле новая уже появилась. Она уже под новой обфсой.");
    }


    public static Main getPlugin(){
        return plugin;
    }

}
