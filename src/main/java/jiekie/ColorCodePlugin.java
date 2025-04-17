package jiekie;

import jiekie.command.ColorCodeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class ColorCodePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // 명령어 등록
        getCommand("색코드").setExecutor(new ColorCodeCommand(this));

        getLogger().info("색코드 확인 플러그인 by Jiekie");
        getLogger().info("Copyright © 2025 Jiekie. All rights reserved.");
    }

    @Override
    public void onDisable() {}
}
