package me.realwuf.hu;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin implements Listener{



    private GM_CMD gmcmd = new GM_CMD();

    PluginDescriptionFile pdfFile = getDescription();
    ConsoleCommandSender console = getServer().getConsoleSender();
    String prefix = "§8§l[§6Wufnet§8§l] ";

    @Override
    public void onEnable() {
        console.sendMessage(ChatColor.GOLD + "++++++++++ " + prefix + "§6++++++++++");
        console.sendMessage(ChatColor.AQUA + "Plugin Neve: §8" + pdfFile.getName());
        console.sendMessage(ChatColor.AQUA + "Plugin Verzio: §8" + pdfFile.getVersion());
        console.sendMessage(ChatColor.AQUA + "Plugin Keszito: §8" + pdfFile.getAuthors());
        console.sendMessage(ChatColor.AQUA + "Plugin Leiras: §8" + pdfFile.getDescription());
        console.sendMessage(ChatColor.AQUA + "Plugin Weboldal: §8" + pdfFile.getWebsite());
        console.sendMessage(ChatColor.GREEN + "A plugin sikeresen elindult!");
        console.sendMessage(ChatColor.GOLD + "++++++++++ " + prefix + "§6++++++++++");

    }

    @Override
    public void onDisable() {
        console.sendMessage(ChatColor.GOLD + "++++++++++ " + prefix + "§6++++++++++");
        console.sendMessage(ChatColor.AQUA + "Plugin Neve: §8" + pdfFile.getName());
        console.sendMessage(ChatColor.AQUA + "Plugin Verzio: §8" + pdfFile.getVersion());
        console.sendMessage(ChatColor.AQUA + "Plugin Készito: §8" + pdfFile.getAuthors());
        console.sendMessage(ChatColor.AQUA + "Plugin Leiras: §8" + pdfFile.getDescription());
        console.sendMessage(ChatColor.AQUA + "Plugin Weboldal: §8" + pdfFile.getWebsite() + ChatColor.RESET + "\r\n");
        console.sendMessage(ChatColor.RED + "A plugin sikeresen kikapcsolt!");
        console.sendMessage(ChatColor.GOLD + "++++++++++ " + prefix + "§6++++++++++");
    }

    }

