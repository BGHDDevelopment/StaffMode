package me.noodles.staff.items;

import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.inventory.meta.*;
import java.util.*;
import org.bukkit.inventory.*;

public class Items
{
    public static ItemStack stone(Player p) {
        ItemStack stone = new ItemStack(Material.STONE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Creative");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack dirt(Player p) {
        ItemStack stone = new ItemStack(Material.DIRT);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Survival");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack CobbleStone(Player p) {
        ItemStack stone = new ItemStack(Material.COBBLESTONE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Adventure");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Sponge(Player p) {
        ItemStack stone = new ItemStack(Material.SPONGE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GREEN).append(ChatColor.UNDERLINE).append("Heal").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Bread(Player p) {
        ItemStack stone = new ItemStack(Material.BREAD);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GREEN).append(ChatColor.UNDERLINE).append("Feed").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Grass(Player p) {
        ItemStack stone = new ItemStack(Material.GRASS);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Spectator");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Glass(Player p) {
        ItemStack stone = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)7);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(" ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Blaze(Player p) {
        ItemStack stone = new ItemStack(Material.BLAZE_ROD);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Gamemodes Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "=====================");
        lore.add(ChatColor.YELLOW + "(Change Your Gamemode)");
        lore.add(ChatColor.GRAY + "=====================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Gravel(Player p) {
        ItemStack stone = new ItemStack(Material.GRAVEL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.RED).append(ChatColor.UNDERLINE).append("Health & Food Menu").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Reset(Player p) {
    	ItemStack lapiz = new ItemStack(Material.LAPIS_BLOCK);
    	ItemMeta lapizmeta = lapiz.getItemMeta();
    	lapizmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.UNDERLINE + "Reset Players Menu");
    	lapiz.setItemMeta(lapizmeta);
    	return lapiz;
    }
    
    public static ItemStack Barrier(Player p) {
        ItemStack stone = new ItemStack(Material.COMPASS);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Set Time Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "======================");
        lore.add(ChatColor.YELLOW + "(Change The Server Time)");
        lore.add(ChatColor.GRAY + "======================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Night(Player p) {
        ItemStack stone = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Time Set Night");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack SIXAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 6AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack SEVENAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 7AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack EIGHTAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 8AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack NINEAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 9AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack TENAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 10AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack ELEVENAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 11AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack TWELVEPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 12PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack ONEPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 1PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack TWOPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 2PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack THREEPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 3PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack FOURPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 4PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack FIVEPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 5PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack SIXPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 6PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack SEVENPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 7PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack EIGHTPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 8PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack NINEPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 9PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack TENPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 10PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack ELEVENPM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 11PM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack TWELVEAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 12AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack ONEAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 1AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack TWOAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 2AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack THREEAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 3AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack FOURAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 4AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack FIVEAM(Player p) {
        ItemStack stone = new ItemStack(Material.WOOL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Set Time To" + ChatColor.YELLOW + " 5AM");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Day(Player p) {
        ItemStack stone = new ItemStack(Material.LAPIS_BLOCK);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GOLD + "Time Set Day");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Whitelist(Player p) {
        ItemStack stone = new ItemStack(Material.PAPER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Whitelist Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "=====================");
        lore.add(ChatColor.YELLOW + "(Toggle Server Whitelist)");
        lore.add(ChatColor.GRAY + "=====================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack WhitelistON(Player p) {
        ItemStack stone = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GOLD + "Turn" + ChatColor.GREEN + " ON" + ChatColor.GOLD + " the Whitelist");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack WhitelistOFF(Player p) {
        ItemStack stone = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GOLD + "Turn" + ChatColor.RED + " OFF" + ChatColor.GOLD + " the Whitelist");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Weather(Player p) {
        ItemStack stone = new ItemStack(Material.WATER_BUCKET);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Weather Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "======================");
        lore.add(ChatColor.YELLOW + "(Change Server Weather)");
        lore.add(ChatColor.GRAY + "======================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack WeatherRain(Player p) {
        ItemStack stone = new ItemStack(Material.WATER_BUCKET);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GOLD + "Change Weather To Rain");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack WeatherClear(Player p) {
        ItemStack stone = new ItemStack(Material.BUCKET);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GOLD + "Change Weather To Clear");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack BACK(Player p) {
        ItemStack stone = new ItemStack(Material.ARROW);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Return To Menu").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack TOOLS(Player p) {
        ItemStack stone = new ItemStack(Material.COMMAND);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Tools").toString());
        ArrayList<String> loreTOOLS = new ArrayList<String>();
        loreTOOLS.add(ChatColor.GRAY + "==================================");
        loreTOOLS.add(ChatColor.YELLOW + "(Toggle Fly, Heal, Feed, Inv Clear, Vanish)");
        loreTOOLS.add(ChatColor.GRAY + "==================================");
        stonem.setLore(loreTOOLS);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack EFFECTS(Player p) {
        ItemStack stone = new ItemStack(Material.BREWING_STAND_ITEM);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Effects").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "========");
        lore.add(ChatColor.YELLOW + "(Potions)");
        lore.add(ChatColor.GRAY + "========");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack FlyOn(Player p) {
        ItemStack stone = new ItemStack(Material.FEATHER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GREEN).append(ChatColor.UNDERLINE).append("Toggle Fly" + ChatColor.DARK_GREEN + " On").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack FlyOff(Player p) {
        ItemStack stone = new ItemStack(Material.FEATHER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GREEN).append(ChatColor.UNDERLINE).append("Toggle Fly" + ChatColor.RED + " Off").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack InvClear(Player p) {
        ItemStack stone = new ItemStack(Material.DEAD_BUSH);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GREEN).append(ChatColor.UNDERLINE).append("Clear Your Inventory").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(WARNING: REMOVES ALL ITEMS!)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.UNDERLINE).append("Open Speed Effect Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Opens GUI)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack JumpBoost(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.UNDERLINE).append("Open Jump Boost Effect Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Opens GUI)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed1(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Speed-1 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack RemoveEffects(Player p) {
        ItemStack stone = new ItemStack(Material.MILK_BUCKET);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.RED).append(ChatColor.UNDERLINE).append("Clear Effects").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed2(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Speed-2 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed3(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Speed-3 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed4(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Speed-4 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed5(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Speed-5 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed6(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Speed-6 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed7(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Speed-7 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Speed8(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Speed-8 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Jumpboost1(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Jumpboost-1 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Jumpboost2(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Jumpboost-2 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Jumpboost3(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Jumpboost-3 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Jumpboost4(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Jumpboost-4 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Jumpboost5(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Jumpboost-5 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Jumpboost6(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Jumpboost-6 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Jumpboost7(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Jumpboost-7 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Jumpboost8(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Jumpboost-8 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobMenu(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Mob Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "===========");
        lore.add(ChatColor.YELLOW + "(Spawn Mobs)");
        lore.add(ChatColor.GRAY + "===========");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobSkeleton(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Skeleton").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobSpider(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Spider").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobZombie(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Zombie").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobSlime(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Slime").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(Random Size)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobCreeper(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Creeper").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobGhast(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Ghast").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobZombiePig(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Zombie Pigman").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobEnderman(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Enderman").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobCaveSpider(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Cave Spider").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobSilverFish(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Silverfish").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobBlaze(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Blaze").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack PotionNight(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.UNDERLINE).append("Night Vision").append(ChatColor.RED).append(" (FOREVER)").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobMagmaCube(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Magma Cube").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(Random Size)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobBat(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Bat").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobWitch(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Witch").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobPig(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Pig").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobSheep(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Sheep").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobCow(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Cow").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobChicken(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Chicken").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobSquid(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Squid").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(WARNING: THIS MOB NEEDS WATER!)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobWolf(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Wolf").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobMooshroom(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Mushroom").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobOcelot(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Ocelot").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobHorse(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Horse").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobVillager(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Villager").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobRabbit(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Rabbit").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobGuardian(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Guardian").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(WARNING: THIS MOB NEEDS WATER!)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack ExtraMobs(Player p) {
        ItemStack stone = new ItemStack(Material.ENDER_CHEST);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Extra Mobs").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobIron(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Iron Golem").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobSnow(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Snow Golem").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobGiant(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Giant").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(HUGE ZOMBIE)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobWither(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn Wither!").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(WARNING: THIS MOB CAN BREAK BLOCKS ON YOUR SERVER!)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack MobDragon(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Spawn EnderDragon!").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(WARNING: THIS MOB CAN BREAK BLOCKS ON YOUR SERVER!)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack VanishON(Player p) {
        ItemStack stone = new ItemStack(Material.EXPLOSIVE_MINECART);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GREEN).append(ChatColor.UNDERLINE).append("Turn Vanish").append(ChatColor.DARK_GREEN).append(" ON!").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(Also Enables Fly)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack VanishOFF(Player p) {
        ItemStack stone = new ItemStack(Material.MINECART);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GREEN).append(ChatColor.UNDERLINE).append("Turn Vanish").append(ChatColor.RED).append(" OFF!").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "(Also Disables Fly)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack VanishMenu(Player p) {
        ItemStack stone = new ItemStack(Material.IRON_TRAPDOOR);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Vanish Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "=============");
        lore.add(ChatColor.YELLOW + "(Toggle Vanish)");
        lore.add(ChatColor.GRAY + "=============");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Invis(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.UNDERLINE).append("Invisibility").append(ChatColor.RED).append(" (FOREVER)").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack PotionWater(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.UNDERLINE).append("Water Breathing").append(ChatColor.RED).append(" (FOREVER)").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack StrengthMenu(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.UNDERLINE).append("Strength Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Opens GUI)");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Strength1(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Strength-1 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Strength2(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Strength-2 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Strength3(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Strength-3 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Strength4(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Strength-4 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Strength5(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Strength-5 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Strength6(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Strength-6 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Strength7(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Strength-7 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Strength8(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.BLUE + "Strength-8 for" + ChatColor.RED + " FOREVER ");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Slowness(Player p) {
        ItemStack stone = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.UNDERLINE).append("Slowness").append(ChatColor.RED).append(" (FOREVER) ").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack Support(Player p) {
        ItemStack stone = new ItemStack(Material.BOOK);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.UNDERLINE).append("Click For Support Link").toString());
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack ServerManager(Player p) {
        ItemStack stone = new ItemStack(Material.REDSTONE);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Server Manager Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "================");
        lore.add(ChatColor.YELLOW + "(Weather, Whitelist, Kill Mobs)");
        lore.add(ChatColor.GRAY + "================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack AdminSword(Player p) {
        ItemStack stone = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GOLD).append(ChatColor.UNDERLINE).append("Admin Sword").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "================");
        lore.add(ChatColor.RED + "(Very dangerous!)");
        lore.add(ChatColor.GRAY + "================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack AdminBow(Player p) {
        ItemStack stone = new ItemStack(Material.BOW);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GOLD).append(ChatColor.UNDERLINE).append("Admin Bow").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "================");
        lore.add(ChatColor.RED + "(Very dangerous!)");
        lore.add(ChatColor.GRAY + "================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack AdminStick(Player p) {
        ItemStack stone = new ItemStack(Material.STICK);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.GOLD).append(ChatColor.UNDERLINE).append("Admin Stick").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "================");
        lore.add(ChatColor.RED + "(Very dangerous!)");
        lore.add(ChatColor.GRAY + "================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack AdminItemMenu(Player p) {
        ItemStack stone = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Admin Item Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "===========");
        lore.add(ChatColor.YELLOW + "(Admin Items)");
        lore.add(ChatColor.GRAY + "===========");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack DifficultyPeace(Player p) {
        ItemStack stone = new ItemStack(Material.BEACON);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Change Difficulty To" + ChatColor.GRAY + " Peaceful!");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack DifficultyEasy(Player p) {
        ItemStack stone = new ItemStack(Material.BEACON);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Change Difficulty To" + ChatColor.GREEN + " Easy!");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack DifficultyNormal(Player p) {
        ItemStack stone = new ItemStack(Material.BEACON);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Change Difficulty To" + ChatColor.GOLD + " Normal!");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack DifficultyHard(Player p) {
        ItemStack stone = new ItemStack(Material.BEACON);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(ChatColor.GRAY + "Change Difficulty To" + ChatColor.RED + " Hard!");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack DifficultyMenu(Player p) {
        ItemStack stone = new ItemStack(Material.BEACON);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Difficulty Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "================");
        lore.add(ChatColor.YELLOW + "(Change Difficulty)");
        lore.add(ChatColor.GRAY + "================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack ClearChat(Player p) {
        ItemStack stone = new ItemStack(Material.PAPER);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Clears for whole server!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Clear Chat!");
        stone.setItemMeta(stonem);
        return stone;
    }
    
    public static ItemStack CowTroll(Player p) {
        ItemStack stone = new ItemStack(Material.MOB_SPAWNER);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Spawns a cow on all players!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Cow Troll!");
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack TrollMenu(Player p) {
        ItemStack stone = new ItemStack(Material.CACTUS);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Troll Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "==================");
        lore.add(ChatColor.YELLOW + "(Troll Players)");
        lore.add(ChatColor.GRAY + "==================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack LightningTroll(Player p) {
        ItemStack stone = new ItemStack(Material.FLINT_AND_STEEL);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Spawns a Lightning Strike on all players!)");
        lore.add(ChatColor.AQUA + "(No Damage!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Lightning Troll!");
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack BlindnessTroll(Player p) {
        ItemStack stone = new ItemStack(Material.INK_SACK);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Give blindness to all players!)");
        lore.add(ChatColor.AQUA + "(Lasts 10 Seconds!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Blindness Troll!");
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack SlownessTroll(Player p) {
        ItemStack stone = new ItemStack(Material.SOUL_SAND);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Give slowness to all players!)");
        lore.add(ChatColor.AQUA + "(Lasts 10 Seconds!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Slowness Troll!");
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack NauseaTroll(Player p) {
        ItemStack stone = new ItemStack(Material.MAGMA_CREAM);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Give nausea to all players!)");
        lore.add(ChatColor.AQUA + "(Lasts 10 Seconds!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Nausea Troll!");
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack JumpTroll(Player p) {
        ItemStack stone = new ItemStack(Material.SADDLE);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Give jump boost to all players!)");
        lore.add(ChatColor.AQUA + "(Lasts 10 Seconds!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Jump Boost Troll!");
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack WeaknessTroll(Player p) {
        ItemStack stone = new ItemStack(Material.OBSIDIAN);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Give weakness to all players!)");
        lore.add(ChatColor.AQUA + "(Lasts 10 Seconds!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Weakness Troll!");
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack MobManagerMenu(Player p) {
        ItemStack stone = new ItemStack(Material.ANVIL);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Mob Manager Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "==================");
        lore.add(ChatColor.YELLOW + "(Mob Manager Menu)");
        lore.add(ChatColor.GRAY + "==================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack MobClear(Player p) {
        ItemStack stone = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta stonem = stone.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.YELLOW + "(Removes all mobs on the server!)");
        stonem.setLore(lore);
        stonem.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Remove Mobs!");
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack FlyMenu(Player p) {
        ItemStack stone = new ItemStack(Material.FEATHER);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Fly Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "================");
        lore.add(ChatColor.YELLOW + "(Toggle Fly)");
        lore.add(ChatColor.GRAY + "================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    public static ItemStack FeedAndHealMenu(Player p) {
        ItemStack stone = new ItemStack(Material.BREAD);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName(new StringBuilder().append(ChatColor.DARK_AQUA).append(ChatColor.UNDERLINE).append("Heal & Feed Menu").toString());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "================");
        lore.add(ChatColor.YELLOW + "(Heal,Feed Menu)");
        lore.add(ChatColor.GRAY + "================");
        stonem.setLore(lore);
        stone.setItemMeta(stonem);
        return stone;
    }
    
}
