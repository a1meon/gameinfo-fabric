package com.amu.gameinfo;

import com.amu.gameinfo.command.GameInfoCommand;
import com.amu.gameinfo.config.GameInfoConfig;
import com.amu.gameinfo.hud.HudOverlay;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class GameinfoClient implements ClientModInitializer {

    public static GameInfoConfig config = new GameInfoConfig();

    @Override
    public void onInitializeClient() {
        HudOverlay hudOverlay = new HudOverlay();
        HudRenderCallback.EVENT.register(hudOverlay); // 注册HUD渲染回调
        CommandRegistrationCallback.EVENT.register(GameInfoCommand::register);
    }
}
