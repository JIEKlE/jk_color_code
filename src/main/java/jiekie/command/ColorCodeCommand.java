package jiekie.command;

import jiekie.ColorCodePlugin;
import jiekie.util.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ColorCodeCommand implements CommandExecutor {
    private final ColorCodePlugin plugin;

    public ColorCodeCommand(ColorCodePlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            ChatUtil.notPlayer(sender);
            return true;
        }

        Player player = (Player) sender;
        if(!player.isOp()) {
            ChatUtil.notOp(player);
            return true;
        }

        if(args == null || args.length == 0) {
            ChatUtil.showColorCode(player);
            return true;
        }

        return true;
    }
}
