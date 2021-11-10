package kleksystudio.KleksySettings.events;

import java.util.*;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.*;
import org.bukkit.entity.*;
import org.bukkit.event.world.*;
import kleksystudio.KleksySettings.*;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.*;
import kleksystudio.KleksySettings.utils.*;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class EventListener implements Listener {

    private static Main plugin = Main.getPlugin();

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(PlayerJoinEvent e) {
        if (plugin.getConfig().getBoolean("settings.join", true)) {
            e.setJoinMessage(null);
        }
        if (plugin.getConfig().getBoolean("settings.heal.enable", true)) {
            e.getPlayer().setMaxHealth(20);
        }
        Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective o = sb.getObjective(DisplaySlot.SIDEBAR);
        if (o == null) {
            o = sb.registerNewObjective("WinLocker", "dummy");
            o.setDisplaySlot(DisplaySlot.SIDEBAR);
        } else {
            for (String en : sb.getEntries()) {
                Team t = sb.getEntryTeam(en);
                sb.resetScores(en);
                if (t != null)
                    t.unregister();
            }
        }
       /* o.setDisplayName(ChatColor.translateAlternateColorCodes('&', " &9&lＭ&f&lＳＴ Ｎｅｔｗｏｒｋ "));
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &715/01/2020 ")).setScore(14);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&9")).setScore(13);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fНик: &6JudPower")).setScore(12);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fРанг: &cЛегенда")).setScore(11);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&b")).setScore(10);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fБаланс: &6$909.48 ")).setScore(9);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fПинг: &624 ")).setScore(8);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&6")).setScore(7);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fВкл/выкл это ")).setScore(6);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "  &7▪ &6/menu ")).setScore(5);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&5")).setScore(4);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fСайт &6www.mstnw.net ")).setScore(3);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fОбщий онлайн: &61071 ")).setScore(2);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fОнлайн: &6114 ")).setScore(1);
        o.getScore(ChatColor.translateAlternateColorCodes('&', " &fСервер: &6Анархия-1 ")).setScore(0); */
        o.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lSunRise"));
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7╚═   &6&lwww.sunmc.ru")).setScore(1);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &fКредиты: &69500 &6❖")).setScore(2);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7╠═ &6&nБаланс:")).setScore(3);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &fЧасов в игре: &63 ч.")).setScore(4);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &fВремени в живых: &6186 м")).setScore(5);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &c&l⚔ &l&7| &9&l✝&f: &61.9")).setScore(6);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &fСмертей &9&l✝&f: &60")).setScore(7);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &fУбийств &c&l⚔&f: &60")).setScore(8);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7╠═ &6&nСтатистика:")).setScore(9);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &fКлан: &8(Без клана)")).setScore(10);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &fГруппа: &a&lHELPER")).setScore(11);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7║ &fНик: &6Pupsikmopsik")).setScore(12);
        o.getScore(ChatColor.translateAlternateColorCodes('&', "&7╔═ &6&nПрофиль:")).setScore(13);
        e.getPlayer().setScoreboard(sb);
    }

    @EventHandler
    public void onCmd(PlayerCommandPreprocessEvent e) {
        if(e.getMessage().equals("/fff")) {
            e.setCancelled(true);
            Player p = e.getPlayer();
            p.sendMessage(ServerUtils.s("&8(&aG&8) [&4&lStaX&7] Игрок &fTaShEr2o21 &8» &7кто пвп тп (в чем хотите)"));
           // p.sendMessage(ServerUtils.s("&8[&aG&8] &f&lBelarus &6Странник &fAnsar91 &8» &7TaShEr2o21 тп"));
           // p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7(G) [&0Birds&7] &b&lLEGEND &7Rastu2009&b:  не мы просто в тиме а они нас таргетят"));
           // p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7(G) [&0Crows&7] &b&lLEGEND &7Olezder &bНасвай&b:  Rastu2009 так ты оскал всех в конфе"));
           p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7(G) [&4&lFKEY&7] &e&lWITHER &7YoungZXC &eОвнер&b: &e/warp pvp all z4"));
         /*  p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7(G) [&4&lFKEY&7] &e&lWITHER &7YoungZXC &eОвнер&b: &e/warp pvp all z4"));
           p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7(G) [&4&lFKEY&7] &e&lWITHER &7YoungZXC &eОвнер&b: &e/warp pvp all z4"));
           p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7(G) [&4&lFKEY&7] &e&lWITHER &7YoungZXC &eОвнер&b: &e/warp pvp all z4"));
           p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7(G) [&4&lFKEY&7] &e&lWITHER &7YoungZXC &eОвнер&b: &e/warp pvp all z4")); */
            /*p.sendMessage(ServerUtils.s("&cYasha2006 &6выдал вам мут, правило &c1.2&6, коммент: &cМать шлюха"));
            p.sendMessage(ServerUtils.s("&7[&6SunMC&7] &6Yasha2006 &7выдал игроку &6Zorgan_YT_1221 мут&7, правило &61.2&7."));
            p.sendMessage(ServerUtils.s("&7[&6SunMC&7] &6Yasha2006 &7выдал игроку &6Zorgan_YT_1221 мут&7, правило &61.2&7."));
            p.sendMessage(ServerUtils.s("&7[&6SunMC&7] &6Yasha2006 &7выдал игроку &6Zorgan_YT_1221 мут&7, правило &61.2&7.")); */
       }else if(e.getMessage().equals("/gg")) {
            e.getPlayer().kickPlayer(ServerUtils.s( "&c&lВас &f(Zorgan_YT_1221) &c&lкикнул &f&lfab1511 \n&6Дата: &731.01.2021 21:12\n &6Причина: &72.1 читы"));

        }

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onQuit(PlayerQuitEvent e) {
        if(plugin.getConfig().getBoolean("settings.quit", true)) {
            e.setQuitMessage(null);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDeath(PlayerDeathEvent e) {
        if(plugin.getConfig().getBoolean("settings.death", true)) {
            e.setDeathMessage(null);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBreak(BlockBreakEvent e) {
        if(plugin.getConfig().getBoolean("settings.blocks", true)) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlace(BlockPlaceEvent e) {
        if(plugin.getConfig().getBoolean("settings.blocks", true)) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent e) {
        if(plugin.getConfig().getBoolean("settings.chat", true)) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onFire(BlockBurnEvent e) {
        if(plugin.getConfig().getBoolean("settings.burn", true)) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onGrow(BlockGrowEvent e) {
        if(plugin.getConfig().getBoolean("settings.grow", true)) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onFire(BlockIgniteEvent e) {
        if(plugin.getConfig().getBoolean("settings.ignite", true)) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onExplosions(EntityExplodeEvent e) {
        if(plugin.getConfig().getBoolean("settings.explosions", true)) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onWorldLoad(WorldLoadEvent e) {
        if(plugin.getConfig().getBoolean("settings.advancements", true)) {
            e.getWorld().setGameRuleValue("announceAdvancements", "false");
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e) {
        if(plugin.getConfig().getBoolean("settings.commands", true)) {
            for(String command : plugin.getConfig().getStringList("settings.commandsWhitelist")) {
                if(command.startsWith(e.getMessage().toLowerCase())) {
                    e.setCancelled(false);
                    break;
                }
                e.setCancelled(true);
            }
        }
    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerLogin(PlayerLoginEvent e) {
        Player p = e.getPlayer();
        if(e.getAddress().equals(null) && plugin.getConfig().getBoolean("settings.fix.nullAddress", true)) {
            e.setKickMessage(ServerUtils.s(plugin.getConfig().getString("messages.fix.nullAddress", "&cВы были кикнуты!\n&cВаш айпи адрес не распознан!")));
            e.setResult(PlayerLoginEvent.Result.KICK_OTHER);
        }
        if(p.getUniqueId().equals(null) && plugin.getConfig().getBoolean("settings.fix.nullUUID", true)) {
            e.setKickMessage(ServerUtils.s(plugin.getConfig().getString("messages.fix.nullUUID", "&cВы были кикнуты!\n&cНеизвестный UUID!")));
            e.setResult(PlayerLoginEvent.Result.KICK_OTHER);
        }
        if(!p.getUniqueId().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + p.getName()).getBytes()))) {
            try {
                if (ServerUtils.getOnlineUUID(p).equals(null)) {
                    e.setKickMessage(ServerUtils.s(plugin.getConfig().getString("messages.fix.nullUUID", "&cВы были кикнуты!\n&cНеизвестный UUID!")));
                    e.setResult(PlayerLoginEvent.Result.KICK_OTHER);
                }else{
                    if(!ServerUtils.getOnlineUUID(p).equals(p.getUniqueId())) {
                        e.setKickMessage(ServerUtils.s(plugin.getConfig().getString("messages.fix.sproofUUID", "&cВы были кикнуты!\n&cПопытка подмены UUID!")));
                        e.setResult(PlayerLoginEvent.Result.KICK_OTHER);
                    }
                }
            } catch (IllegalStateException|java.io.IOException ex) {
                e.setKickMessage(ServerUtils.s(plugin.getConfig().getString("messages.fix.mojangDown", "&cВы были кикнуты!\n&cСервера Mojang не работают!")));
                e.setResult(PlayerLoginEvent.Result.KICK_OTHER);
            }
        }

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void chunkNull(PlayerMoveEvent e) {
        if(e.getFrom().getChunk().equals(null) || !e.getFrom().getWorld().isChunkLoaded(e.getFrom().getChunk())) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDamage(EntityDamageEvent e) {
        if(e.getEntity() instanceof Player && !e.getEntity().equals(null) && plugin.getConfig().getBoolean("settings.damage", true)) {
            e.setDamage(0);
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onFeed(FoodLevelChangeEvent e) {
        if(plugin.getConfig().getBoolean("settings.feed", true)) {
            e.setFoodLevel(20);
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onKick(PlayerKickEvent e) {
        if(!e.getPlayer().equals(null) && plugin.getConfig().getBoolean("settings.fix.antiDisconnectSpam", true) && (e.getReason().equals("disconnect.spam") || e.getReason().equals("Kicked for spamming"))) {
            e.setCancelled(true);
            e.setLeaveMessage(null);
        }
    }


}
