package com.a1meon.gameinfo;

import com.a1meon.gameinfo.command.GameInfoCommand;
import com.a1meon.gameinfo.config.GameInfoConfig;
import com.a1meon.gameinfo.hud.HudOverlay;
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
