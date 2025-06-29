/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Abexlry <abexlry@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.keyremapping;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.*;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.JagexColors;
import net.runelite.client.util.ColorUtil;

import javax.inject.Inject;
import java.awt.*;

@PluginDescriptor(
        name = "Key Remapping",
        description = "Allows use of WASD keys for camera movement with 'Press Enter to Chat', and remapping number keys to F-keys",
        tags = {"enter", "chat", "wasd", "camera"},
        enabledByDefault = false
)
public class KeyRemappingPlugin extends Plugin {
    private static final String PRESS_ENTER_TO_CHAT = "Press Enter to Chat...";
    private static final String SCRIPT_EVENT_SET_CHATBOX_INPUT = "setChatboxInput";
    private static final String SCRIPT_EVENT_BLOCK_CHAT_INPUT = "blockChatInput";

    public static KeyRemappingPlugin instance;

    @Inject
    private Client client;

    @Inject
    private ClientThread clientThread;

    @Inject
    private KeyManager keyManager;

    @Inject
    private KeyRemappingListener inputListener;

    @Getter(AccessLevel.PACKAGE)
    @Setter(AccessLevel.PACKAGE)
    private boolean typing;

    @Override
    protected void startUp() throws Exception {
        typing = false;
        keyManager.registerKeyListener(inputListener);//needs a mouse input listener :D

        clientThread.invoke(() ->
        {
            if (client.getGameState() == GameState.LOGGED_IN) {
                lockChat();
                // Clear any typed text
                client.setVar(VarClientStr.CHATBOX_TYPED_TEXT, "");
            }
        });
    }

    @Override
    protected void shutDown() throws Exception {
        clientThread.invoke(() ->
        {
            if (client.getGameState() == GameState.LOGGED_IN) {
                unlockChat();
            }
        });

        keyManager.unregisterKeyListener(inputListener);
    }

    @Provides
    KeyRemappingConfig getConfig(ConfigManager configManager) {
        return configManager.getConfig(KeyRemappingConfig.class);
    }

    boolean chatboxFocused() {
        Widget chatboxParent = client.getWidget(WidgetInfo.CHATBOX_PARENT);
        if (chatboxParent == null || chatboxParent.getOnKeyListener() == null) {
            return false;
        }

        // the search box on the world map can be focused, and chat input goes there, even
        // though the chatbox still has its key listener.
        Widget worldMapSearch = client.getWidget(WidgetInfo.WORLD_MAP_SEARCH);
        return worldMapSearch == null || client.getVar(VarClientInt.WORLD_MAP_SEARCH_FOCUSED) != 1;
    }

    /**
     * Check if a dialog is open that will grab numerical input, to prevent F-key remapping
     * from triggering.
     *
     * @return
     */
    boolean isDialogOpen() {
        return client.getChatboxInterface() != null;
    }

    boolean isOptionsDialogOpen() {
        return client.getChatboxInterface() != null;
    }

    private boolean isHidden(WidgetInfo widgetInfo) {
        Widget w = client.getWidget(widgetInfo);
        return w == null || w.isSelfHidden();
    }

    @Subscribe
    public void onScriptCallbackEvent(ScriptCallbackEvent scriptCallbackEvent) {
        switch (scriptCallbackEvent.getEventName()) {
            case SCRIPT_EVENT_SET_CHATBOX_INPUT:
                Widget chatboxInput = client.getWidget(WidgetInfo.CHATBOX_INPUT);
                if (chatboxInput != null && !typing) {
                    setChatboxWidgetInput(chatboxInput, PRESS_ENTER_TO_CHAT);
                }
                break;
            case SCRIPT_EVENT_BLOCK_CHAT_INPUT:
                if (!typing) {
                    int[] intStack = client.getIntStack();
                    int intStackSize = client.getIntStackSize();
                    intStack[intStackSize - 1] = 1;
                }
                break;//ye scripts but could be done with simple boolean
        }
    }

    void lockChat() {
        client.setChatboxLocked(true);
    }

    void unlockChat() {
        client.setChatboxLocked(false);
    }

    private void setChatboxWidgetInput(Widget widget, String input) {
        String text = widget.getText();
        int idx = text.indexOf(':');
        if (idx != -1) {
            String newText = text.substring(0, idx) + ": " + input;
            widget.setText(newText);
        }
    }
}
