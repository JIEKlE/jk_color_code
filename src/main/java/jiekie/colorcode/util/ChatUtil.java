package jiekie.colorcode.util;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatUtil {
    public static String getWarnPrefix() {
        return "\uA003 ";
    }

    public static void notPlayer(CommandSender sender) {
        sender.sendMessage(getWarnPrefix() + "플레이어가 아닙니다.");
    }

    public static void notOp(Player player) {
        player.sendMessage(getWarnPrefix() + "권한이 없습니다.");
    }

    public static void showColorCode(Player player) {
        player.sendMessage("");
        player.sendMessage(getWarnPrefix() + "색코드 목록");
        player.sendMessage("　　　" + ChatColor.BLACK + "&0" + ChatColor.DARK_BLUE + "　&1" + ChatColor.DARK_GREEN + "　&2" + ChatColor.DARK_AQUA + "　&3" + ChatColor.DARK_RED + "　&4" + ChatColor.DARK_PURPLE + "　&5");
        player.sendMessage("　　　" + ChatColor.GOLD + "&6" + ChatColor.GRAY + "　&7" + ChatColor.DARK_GRAY + "　&8" + ChatColor.BLUE + "　&9" + ChatColor.GREEN + "　&a" + ChatColor.AQUA + "　&b");
        player.sendMessage("　　　" + ChatColor.RED + "&c" + ChatColor.LIGHT_PURPLE + "　&d" + ChatColor.YELLOW + "　&e" + ChatColor.WHITE + "　&f");
        player.sendMessage("");
        player.sendMessage("　　　" + ChatColor.BOLD + "&l" + ChatColor.RESET + "　" + ChatColor.STRIKETHROUGH + "&m" + ChatColor.RESET + "　" + ChatColor.UNDERLINE + "&n" + ChatColor.RESET + ChatColor.ITALIC + "　&o" + ChatColor.RESET + ChatColor.RESET + "　&r");
        player.sendMessage("　　　" + "&k : magic");
        player.sendMessage("");
    }
}
