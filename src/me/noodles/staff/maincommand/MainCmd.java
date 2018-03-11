package me.noodles.staff.maincommand;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;

import me.noodles.staff.Main;
import me.noodles.staff.inv.InvCreator;
import me.noodles.staff.items.Items;
import me.noodles.staff.util.UpdateChecker;

public class MainCmd implements CommandExecutor, Listener {
	

	public UpdateChecker checker;

	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if (!(sender instanceof Player)) {
			Bukkit.getServer().getLogger().info("Only players can do this!");
			return true;
		}
		Player p = (Player) sender;
		if (p.hasPermission("staffmode.open")) {
			if (args.length == 0) {
                sender.sendMessage(ChatColor.YELLOW + "=========================");
                sender.sendMessage(ChatColor.RED + "Commands:");
                sender.sendMessage(ChatColor.GOLD + "/staffmode open (opensgui)");
                sender.sendMessage(ChatColor.GOLD + "/staffmode permissions (Lists all permissions)");
                sender.sendMessage(ChatColor.GOLD + "/staffmode update (Checks for a update)");
                sender.sendMessage(ChatColor.GOLD + "/staffmode help (Shows plugin info)");
                sender.sendMessage(ChatColor.RED + "Permssions:");
                sender.sendMessage(ChatColor.GOLD + "staffmode.update (Update message on-join)");
                sender.sendMessage(ChatColor.GOLD + "(If enabled in config.yml)");
                sender.sendMessage(ChatColor.GOLD + "staffmode.open (Main GUI)");
                sender.sendMessage(ChatColor.GOLD + "staffmode.help (All Help Menus)");
                sender.sendMessage(ChatColor.YELLOW + "=========================");
			}
			if(args.length == 1){
        		if(args[0].equalsIgnoreCase("permissions")){	
                    sender.sendMessage(ChatColor.YELLOW + "=========================");
                    sender.sendMessage(ChatColor.RED + "Menu Permssions:");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.gamemode (Gamemodes Menu)");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.tools (Tools Menu)");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.mobs (Mobs Menu)");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.time (Time Menu)");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.difficulty (Difficulty Menu)");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.effects (Effects Menu)");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.servermanager (Server Manager Menu)");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.adminitems (Admin Items Menu)");
                    sender.sendMessage(ChatColor.GOLD + "staffmode.trolls (Trolls Menu)");
                    sender.sendMessage(ChatColor.YELLOW + "=========================");
        		}
    			if(args.length == 1){
            		if(args[0].equalsIgnoreCase("update")){	
                        sender.sendMessage(ChatColor.RED + "Checking for updates...");
                        this.checker = new UpdateChecker(Main.plugin);
                        if (this.checker.isConnected()) {
                            if (this.checker.hasUpdate()) {
                                sender.sendMessage(ChatColor.GRAY + "=========================");
                                sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "StaffMode is outdated!");
                                sender.sendMessage(ChatColor.GREEN + "Newest version: " + this.checker.getLatestVersion());
                                sender.sendMessage(ChatColor.RED + "Your version: " + Main.plugin.getDescription().getVersion());
                                sender.sendMessage(ChatColor.GOLD + "Download: https://www.spigotmc.org/resources/40929");
                                sender.sendMessage(ChatColor.GRAY + "=========================");
                            }
                            else {
                                sender.sendMessage(ChatColor.GREEN + "StaffMode is up to date!");
                                }
                        }
                    }
            	}
				if(args.length == 1){
            		if(args[0].equalsIgnoreCase("help")){	
                        sender.sendMessage(ChatColor.YELLOW + "=========================");
                        sender.sendMessage(ChatColor.RED + "Plugin Info:");
                        sender.sendMessage(ChatColor.GOLD + "Plugin made by BGHDNetwork(Noodles)");
                        sender.sendMessage(ChatColor.GOLD + "Current plugin version " + ChatColor.GREEN + Main.plugin.getDescription().getVersion());
                        sender.sendMessage(ChatColor.RED + "Support:");
                        sender.sendMessage(ChatColor.GOLD + "https://discord.gg/QbbXPNG");
                        sender.sendMessage(ChatColor.RED + "Get All Commands:");
                        sender.sendMessage(ChatColor.GOLD + "/staffmode");
                        sender.sendMessage(ChatColor.YELLOW + "=========================");
            		}	
				}
			}
				if(args.length == 1){
            		if(args[0].equalsIgnoreCase("open")){	
				InvCreator.StaffGui.setItem(9, Items.Blaze(p));
				InvCreator.StaffGui.setItem(11, Items.TOOLS(p));
				InvCreator.StaffGui.setItem(13, Items.Barrier(p));
				InvCreator.StaffGui.setItem(17, Items.EFFECTS(p));
				InvCreator.StaffGui.setItem(15, Items.MobMenu(p));
				InvCreator.StaffGui.setItem(28, Items.ServerManager(p));
				InvCreator.StaffGui.setItem(30, Items.AdminItemMenu(p));
				InvCreator.StaffGui.setItem(32, Items.DifficultyMenu(p));
				InvCreator.StaffGui.setItem(34, Items.TrollMenu(p));
				for (int i = 0; i < 54; ++i) {
					if (InvCreator.StaffGui.getItem(i) == null) {
						InvCreator.StaffGui.setItem(i, Items.Glass(p));
					}
				}
            
				p.openInventory(InvCreator.StaffGui);
				p.sendMessage(String.valueOf(ChatColor.translateAlternateColorCodes('&',Main.plugin.getConfig().getString("Messages.Prefix")))+ ChatColor.DARK_GRAY + ChatColor.BOLD + " >> " + ChatColor.GRAY + "You have opened the"+ ChatColor.AQUA + " " + ChatColor.BOLD + "STAFFMODE-GUI");
			} else if (args.length >= 2) {
				p.sendMessage(ChatColor.RED + "Too many arguments!" + " Use the command like" + ChatColor.DARK_AQUA+ " /staffmode");
			}
				}
		} else {
			sender.sendMessage(ChatColor.RED + "(!) You don't have permssion to use this command!");
		}
		return true;
	}
}