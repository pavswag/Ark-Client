import java.applet.Applet;

// 
// Decompiled by Procyon v0.5.36
// 

public class ScriptFrame
{
    static final int ml = 2;
    int pc;
    Script script;
    String[] stringLocals;
    static Client client;
    int[] intLocals;
    static final int wo = 14;
    static final String ht = "jagex.disableBouncyCastle";
    static int field343;
    
    ScriptFrame() {
        this.pc = 1031782053;
    }
    
    static void method343(final String s, final byte b) {
        try {
            class108.param9 = s;
            try {
                final String string = ScriptFrame.client.getParameter(Integer.toString(18)) + "settings=" + s + "; version=1; path=/; domain=" + ScriptFrame.client.getParameter(Integer.toString(13));
                String str;
                if (s.length() == 0) {
                    if (b == 99) {
                        throw new IllegalStateException();
                    }
                    str = string + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                else {
                    str = string + "; Expires=" + class136.vmethod3254(class96.clockNow(-257579037) + 94608000000L) + "; Max-Age=" + 94608000L;
                }
                class26.method111(ScriptFrame.client, "document.cookie=\"" + str + "\"", (byte)90);
            }
            catch (Throwable t) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ck.nt(" + ')');
        }
    }
    
    public static void dm(final class379 class379, final AbstractFont field3612) {
        if (field3612 != class379.field3612) {
            class379.field3612 = field3612;
            if (null != class379.field3612) {
                if (class379.field3617 * -1059679999 == 0) {
                    class379.field3617 = class379.field3612.ascent * 1279946497;
                }
                if (!class379.method2004(-2000348474)) {
                    class379.method2025(-224307219);
                }
            }
        }
    }
    
    static final void addSceneMenuOptions(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            if (-303899309 * Client.isItemSelected == 0) {
                if (n5 != -1708655552) {
                    throw new IllegalStateException();
                }
                if (!Client.isSpellSelected) {
                    if (n5 != -1708655552) {
                        throw new IllegalStateException();
                    }
                    MenuAction.insertMenuItemNoShift(Strings.gc, "", 23, 0, n - n3, n2 - n4, (byte)116);
                }
            }
            long n6 = -1L;
            long n7 = -1L;
            for (int i = 0; i < KeyHandler.method100((byte)(-10)); ++i) {
                if (n5 != -1708655552) {
                    throw new IllegalStateException();
                }
                final long method130 = class30.method130(i, 2061308557);
                if (n7 == method130) {
                    if (n5 != -1708655552) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    n7 = method130;
                    final int method131 = FaceNormal.method1294(i, -1628059522);
                    final int method132 = method344(i, -1705605824);
                    final int animate = TextureProvider.animate(ViewportMouse.ViewportMouse_entityTags[i]);
                    final int entity_unpackID = InterfaceParent.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[i]);
                    if (2 == animate) {
                        if (n5 != -1708655552) {
                            return;
                        }
                        if (class31.scene.getObjectFlags(GameEngine.Client_plane * -1727408401, method131, method132, method130) >= 0) {
                            ObjectComposition objectComposition = class144.vmethod3248(entity_unpackID, (short)30393);
                            if (null != objectComposition.soundEffectIds) {
                                if (n5 != -1708655552) {
                                    throw new IllegalStateException();
                                }
                                objectComposition = objectComposition.transform((byte)45);
                            }
                            if (null == objectComposition) {
                                if (n5 != -1708655552) {
                                    throw new IllegalStateException();
                                }
                                continue;
                            }
                            else {
                                PendingSpawn pendingSpawn = null;
                                for (PendingSpawn pendingSpawn2 = (PendingSpawn)Client.pendingSpawns.last(); pendingSpawn2 != null; pendingSpawn2 = (PendingSpawn)Client.pendingSpawns.previous()) {
                                    if (n5 != -1708655552) {
                                        throw new IllegalStateException();
                                    }
                                    if (593068225 * pendingSpawn2.plane == -1727408401 * GameEngine.Client_plane) {
                                        if (n5 != -1708655552) {
                                            throw new IllegalStateException();
                                        }
                                        if (pendingSpawn2.x * 68300005 == method131 && 800888185 * pendingSpawn2.y == method132) {
                                            if (n5 != -1708655552) {
                                                throw new IllegalStateException();
                                            }
                                            if (entity_unpackID == 552715177 * pendingSpawn2.id) {
                                                if (n5 != -1708655552) {
                                                    return;
                                                }
                                                pendingSpawn = pendingSpawn2;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (1 == -303899309 * Client.isItemSelected) {
                                    if (n5 != -1708655552) {
                                        throw new IllegalStateException();
                                    }
                                    MenuAction.insertMenuItemNoShift(Strings.gu, Client.field364 + " " + class96.ab + " " + class383.method2081(65535, -1198768404) + objectComposition.name, 1, entity_unpackID, method131, method132, (byte)54);
                                }
                                else if (Client.isSpellSelected) {
                                    if (n5 != -1708655552) {
                                        throw new IllegalStateException();
                                    }
                                    if ((SecureRandomFuture.selectedSpellFlags * 1457791911 & 0x4) == 0x4) {
                                        if (n5 != -1708655552) {
                                            return;
                                        }
                                        MenuAction.insertMenuItemNoShift(Client.field530, Client.field522 + " " + class96.ab + " " + class383.method2081(65535, 1981502739) + objectComposition.name, 2, entity_unpackID, method131, method132, (byte)64);
                                    }
                                }
                                else {
                                    final String[] actions = objectComposition.actions;
                                    if (actions != null) {
                                        if (n5 != -1708655552) {
                                            throw new IllegalStateException();
                                        }
                                        int j = 4;
                                    Label_0569_Outer:
                                        while (j >= 0) {
                                            while (true) {
                                                Label_0708: {
                                                    if (pendingSpawn == null) {
                                                        break Label_0708;
                                                    }
                                                    if (n5 != -1708655552) {
                                                        return;
                                                    }
                                                    if (pendingSpawn.method525(j, -633273091)) {
                                                        break Label_0708;
                                                    }
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    --j;
                                                    continue Label_0569_Outer;
                                                }
                                                if (null == actions[j]) {
                                                    continue;
                                                }
                                                if (n5 != -1708655552) {
                                                    return;
                                                }
                                                int n8 = 0;
                                                if (j == 0) {
                                                    n8 = 3;
                                                }
                                                if (j == 1) {
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n8 = 4;
                                                }
                                                if (j == 2) {
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n8 = 5;
                                                }
                                                if (j == 3) {
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n8 = 6;
                                                }
                                                if (j == 4) {
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n8 = 1001;
                                                }
                                                MenuAction.insertMenuItemNoShift(actions[j], class383.method2081(65535, -1061937089) + objectComposition.name, n8, entity_unpackID, method131, method132, (byte)120);
                                                continue;
                                            }
                                        }
                                    }
                                    MenuAction.insertMenuItemNoShift(Strings.gh, class383.method2081(65535, -107881886) + objectComposition.name, 1002, -1529817365 * objectComposition.id, method131, method132, (byte)73);
                                }
                            }
                        }
                    }
                    if (animate != 0) {
                        if (n5 != -1708655552) {
                            throw new IllegalStateException();
                        }
                        final NPC npc = Client.npcs[entity_unpackID];
                        if (null == npc) {
                            if (n5 != -1708655552) {
                                throw new IllegalStateException();
                            }
                            continue;
                        }
                        else {
                            if (npc.definition.size * 1458410691 == 1) {
                                if (n5 != -1708655552) {
                                    throw new IllegalStateException();
                                }
                                if (0x40 == (npc.br * 1144428983 & 0x7F) && 0x40 == (npc.ep * -411750205 & 0x7F)) {
                                    if (n5 != -1708655552) {
                                        return;
                                    }
                                    for (int k = 0; k < 265474485 * Client.npcCount; ++k) {
                                        if (n5 != -1708655552) {
                                            throw new IllegalStateException();
                                        }
                                        final NPC npc2 = Client.npcs[Client.npcIndices[k]];
                                        if (null != npc2) {
                                            if (n5 != -1708655552) {
                                                throw new IllegalStateException();
                                            }
                                            if (npc != npc2) {
                                                if (n5 != -1708655552) {
                                                    return;
                                                }
                                                if (1458410691 * npc2.definition.size == 1) {
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (npc.br * 1144428983 == npc2.br * 1144428983 && -411750205 * npc.ep == -411750205 * npc2.ep) {
                                                        if (n5 != -1708655552) {
                                                            return;
                                                        }
                                                        InvDefinition.addNpcToMenu(npc2, Client.npcIndices[k], method131, method132, (short)31551);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    final int n9 = Players.Players_count * -2010934433;
                                    final int[] players_indices = Players.Players_indices;
                                    for (int l = 0; l < n9; ++l) {
                                        if (n5 != -1708655552) {
                                            throw new IllegalStateException();
                                        }
                                        final Player player = Client.players[players_indices[l]];
                                        if (null != player) {
                                            if (n5 != -1708655552) {
                                                throw new IllegalStateException();
                                            }
                                            if (1144428983 * player.br == 1144428983 * npc.br) {
                                                if (n5 != -1708655552) {
                                                    throw new IllegalStateException();
                                                }
                                                if (-411750205 * player.ep == npc.ep * -411750205) {
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    DynamicObject.addPlayerToMenu(player, players_indices[l], method131, method132, 1402248095);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            InvDefinition.addNpcToMenu(npc, entity_unpackID, method131, method132, (short)3751);
                        }
                    }
                    if (animate == 0) {
                        final Player player2 = Client.players[entity_unpackID];
                        if (null == player2) {
                            continue;
                        }
                        if (0x40 == (1144428983 * player2.br & 0x7F)) {
                            if (n5 != -1708655552) {
                                throw new IllegalStateException();
                            }
                            if (0x40 == (-411750205 * player2.ep & 0x7F)) {
                                for (int n10 = 0; n10 < Client.npcCount * 265474485; ++n10) {
                                    if (n5 != -1708655552) {
                                        throw new IllegalStateException();
                                    }
                                    final NPC npc3 = Client.npcs[Client.npcIndices[n10]];
                                    if (npc3 != null) {
                                        if (n5 != -1708655552) {
                                            throw new IllegalStateException();
                                        }
                                        if (1458410691 * npc3.definition.size == 1) {
                                            if (n5 != -1708655552) {
                                                throw new IllegalStateException();
                                            }
                                            if (1144428983 * player2.br == npc3.br * 1144428983) {
                                                if (n5 != -1708655552) {
                                                    throw new IllegalStateException();
                                                }
                                                if (npc3.ep * -411750205 == player2.ep * -411750205) {
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    InvDefinition.addNpcToMenu(npc3, Client.npcIndices[n10], method131, method132, (short)25450);
                                                }
                                            }
                                        }
                                    }
                                }
                                final int n11 = Players.Players_count * -2010934433;
                                final int[] players_indices2 = Players.Players_indices;
                                for (int n12 = 0; n12 < n11; ++n12) {
                                    if (n5 != -1708655552) {
                                        return;
                                    }
                                    final Player player3 = Client.players[players_indices2[n12]];
                                    if (null != player3) {
                                        if (n5 != -1708655552) {
                                            throw new IllegalStateException();
                                        }
                                        if (player2 != player3) {
                                            if (n5 != -1708655552) {
                                                throw new IllegalStateException();
                                            }
                                            if (1144428983 * player2.br == player3.br * 1144428983) {
                                                if (n5 != -1708655552) {
                                                    throw new IllegalStateException();
                                                }
                                                if (-411750205 * player3.ep == -411750205 * player2.ep) {
                                                    if (n5 != -1708655552) {
                                                        throw new IllegalStateException();
                                                    }
                                                    DynamicObject.addPlayerToMenu(player3, players_indices2[n12], method131, method132, 1402248095);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (entity_unpackID != Client.combatTargetPlayerIndex * -1565733637) {
                            if (n5 != -1708655552) {
                                return;
                            }
                            DynamicObject.addPlayerToMenu(player2, entity_unpackID, method131, method132, 1402248095);
                        }
                        else {
                            n6 = n7;
                        }
                    }
                    if (animate == 3) {
                        if (n5 != -1708655552) {
                            throw new IllegalStateException();
                        }
                        final NodeDeque nodeDeque = Client.groundItems[-1727408401 * GameEngine.Client_plane][method131][method132];
                        if (null != nodeDeque) {
                            if (n5 != -1708655552) {
                                throw new IllegalStateException();
                            }
                            for (TileItem tileItem = (TileItem)nodeDeque.first(); null != tileItem; tileItem = (TileItem)nodeDeque.next()) {
                                final ItemComposition set = HealthBarUpdate.set(176307405 * tileItem.id, (byte)127);
                                if (1 == Client.isItemSelected * -303899309) {
                                    if (n5 != -1708655552) {
                                        throw new IllegalStateException();
                                    }
                                    MenuAction.insertMenuItemNoShift(Strings.gu, Client.field364 + " " + class96.ab + " " + class383.method2081(16748608, -1283759671) + set.name, 16, tileItem.id * 176307405, method131, method132, (byte)81);
                                }
                                else if (Client.isSpellSelected) {
                                    if (n5 != -1708655552) {
                                        return;
                                    }
                                    if (0x1 == (1457791911 * SecureRandomFuture.selectedSpellFlags & 0x1)) {
                                        if (n5 != -1708655552) {
                                            return;
                                        }
                                        MenuAction.insertMenuItemNoShift(Client.field530, Client.field522 + " " + class96.ab + " " + class383.method2081(16748608, -25704293) + set.name, 17, 176307405 * tileItem.id, method131, method132, (byte)67);
                                    }
                                }
                                else {
                                    final String[] groundActions = set.groundActions;
                                    for (int n13 = 4; n13 >= 0; --n13) {
                                        if (n5 != -1708655552) {
                                            throw new IllegalStateException();
                                        }
                                        if (!TileItem.rm(tileItem, n13, 1791885272)) {
                                            if (n5 != -1708655552) {
                                                return;
                                            }
                                        }
                                        else {
                                            if (groundActions != null) {
                                                if (n5 != -1708655552) {
                                                    throw new IllegalStateException();
                                                }
                                                if (groundActions[n13] != null) {
                                                    if (n5 != -1708655552) {
                                                        return;
                                                    }
                                                    int n14 = 0;
                                                    if (n13 == 0) {
                                                        n14 = 18;
                                                    }
                                                    if (n13 == 1) {
                                                        if (n5 != -1708655552) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n14 = 19;
                                                    }
                                                    if (n13 == 2) {
                                                        if (n5 != -1708655552) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n14 = 20;
                                                    }
                                                    if (n13 == 3) {
                                                        if (n5 != -1708655552) {
                                                            return;
                                                        }
                                                        n14 = 21;
                                                    }
                                                    if (4 == n13) {
                                                        if (n5 != -1708655552) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n14 = 22;
                                                    }
                                                    MenuAction.insertMenuItemNoShift(groundActions[n13], class383.method2081(16748608, 942127261) + set.name, n14, 176307405 * tileItem.id, method131, method132, (byte)90);
                                                    continue;
                                                }
                                            }
                                            if (n13 == 2) {
                                                if (n5 != -1708655552) {
                                                    throw new IllegalStateException();
                                                }
                                                MenuAction.insertMenuItemNoShift(Strings.an, class383.method2081(16748608, 1669674345) + set.name, 20, 176307405 * tileItem.id, method131, method132, (byte)102);
                                            }
                                        }
                                    }
                                    MenuAction.insertMenuItemNoShift(Strings.gh, class383.method2081(16748608, 80782411) + set.name, 1004, tileItem.id * 176307405, method131, method132, (byte)40);
                                }
                            }
                        }
                    }
                }
            }
            if (n6 != -1L) {
                DynamicObject.addPlayerToMenu(Client.players[Client.combatTargetPlayerIndex * -1565733637], -1565733637 * Client.combatTargetPlayerIndex, (int)(n6 >>> 0 & 0x7FL), NPCComposition.method1022(n6), 1402248095);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ck.ls(" + ')');
        }
    }
    
    public static int method344(final int n, final int n2) {
        try {
            return NPCComposition.method1022(ViewportMouse.ViewportMouse_entityTags[n]);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ck.ab(" + ')');
        }
    }
    
    static final void method341(final double n) {
        try {
            class18.method65(n);
            ((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(n);
            class127.method761(1285226307);
            class20.clientPreferences.setBrightness(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ck.mg(" + ')');
        }
    }
}
