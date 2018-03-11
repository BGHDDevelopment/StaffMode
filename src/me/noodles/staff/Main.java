package me.noodles.staff;

import org.bukkit.plugin.java.*;

import me.noodles.staff.join.JoinEvent;
import me.noodles.staff.maincommand.MainCmd;
import me.noodles.staff.menu.Event;
import me.noodles.staff.util.Glow;
import me.noodles.staff.util.UpdateChecker;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.enchantments.*;
import java.lang.reflect.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;

public class Main extends JavaPlugin {
	public static Main plugin;
	private UpdateChecker checker;
	String DownloaderType;
	String GsonEntry;
	String SpigotHost;
	Object data = new Object();

	public void onEnable() {
		Main.plugin = this;
		Bukkit.getPluginManager().registerEvents(new MainCmd(), this);
		PluginDescriptionFile VarUtilType = this.getDescription();
		this.getLogger().info("STAFFMODE V" + VarUtilType.getVersion() + " starting...");
		this.getLogger().info("STAFFMODE V" + VarUtilType.getVersion() + " loading commands...");
		this.getCommand("staffmode").setExecutor((CommandExecutor) new MainCmd());
		this.getLogger().info("STAFFMODE V" + VarUtilType.getVersion() + " loading your configuration...");
		registerEvents((Plugin) this, new JoinEvent());
		this.saveDefaultConfig();
		this.reloadConfig();
		this.register();
		this.registerGlow();
		this.setEnabled(true);
		getLogger().info("STAFFMODE V" + VarUtilType.getVersion() + " started!");
		this.getLogger().info("STAFFMODE V" + VarUtilType.getVersion() + " checking for updates...");
		this.checker = new UpdateChecker(this);
		if (this.checker.isConnected()) {
			if (this.checker.hasUpdate()) {
				getServer().getConsoleSender().sendMessage("------------------------");
				getServer().getConsoleSender().sendMessage("StaffMode is outdated!");
				getServer().getConsoleSender().sendMessage("Newest version: " + this.checker.getLatestVersion());
				getServer().getConsoleSender().sendMessage("Your version: " + Main.plugin.getDescription().getVersion());
				getServer().getConsoleSender().sendMessage("Please Update Here: https://www.spigotmc.org/resources/40929");
				getServer().getConsoleSender().sendMessage("------------------------");
			} else {
				getServer().getConsoleSender().sendMessage("------------------------");
				getServer().getConsoleSender().sendMessage("StaffMode is up to date!");
				getServer().getConsoleSender().sendMessage("------------------------");
			}
		}
	}

	public void registerGlow() {
		try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Glow glow = new Glow(70);
			Enchantment.registerEnchantment((Enchantment) glow);
		} catch (IllegalArgumentException ex) {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Main getPlugin() {
		return (Main) getPlugin((Class) Main.class);
	}

	public static Plugin getPlugin2() {
		return Main.plugin;
	}

	public void register() {
		this.getCommand("staffmode").setExecutor((CommandExecutor) new MainCmd());
		this.getServer().getPluginManager().registerEvents((Listener) new Event(), (Plugin) this);
	}

	public static void registerEvents(final Plugin plugin, final Listener... listeners) {
		for (final Listener listener : listeners) {
			Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
		}
	}
}
