package me.noodles.staff.inv;

import org.bukkit.*;

public class InvNames
{
    public static String invname;
    public static String secInv;
    public static String bInv;
    public static String vInv;
    public static String timeset;
    public static String whitelist;
    public static String weather;
    public static String effects;
    public static String tools;
    public static String jumpboost;
    public static String speed;
    public static String mobs;
    public static String extramobs;
    public static String difficulty;
    public static String strength;
    public static String servermanager;
    public static String adminitems;
    public static String mobmanager;
    public static String flymenu;
    public static String troll;
    public static String vanishmenu;
    public static String feedandhealmenu;
    
    static {
        InvNames.invname = new StringBuilder().append(ChatColor.AQUA).append(ChatColor.BOLD).append(ChatColor.UNDERLINE).append("STAFFMODE-GUI").toString();
        InvNames.secInv = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Gamemodes Menu").toString();
        InvNames.bInv = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Health & Food").toString();
        InvNames.timeset = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Set Time Menu").toString();
        InvNames.whitelist = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Whitelist Menu").toString();
        InvNames.weather = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Weather").toString();
        InvNames.effects = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Effects Menu").toString();
        InvNames.tools = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Tools Menu").toString();
        InvNames.jumpboost = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Jump Boost Menu").toString();
        InvNames.speed = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Speed Effect Menu").toString();
        InvNames.mobs = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Mobs Menu").toString();
        InvNames.extramobs = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Extra Mobs Menu").toString();
        InvNames.difficulty = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Difficulty Menu").toString();
        InvNames.strength = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Strength Effect Menu").toString();
        InvNames.servermanager = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Server Manager Menu").toString();
        InvNames.troll = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Troll Menu").toString();
        InvNames.adminitems = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Admin Items Menu").toString();
        InvNames.mobmanager = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Mob Manager Menu").toString();
        InvNames.flymenu = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Fly Menu").toString();
        InvNames.vanishmenu = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Vanish Menu").toString();
        InvNames.feedandhealmenu = new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Feed & Heal Menu").toString();


        InvNames.vInv = ChatColor.BOLD + "StaffModus";
    }
}
