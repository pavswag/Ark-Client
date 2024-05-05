import java.util.Comparator;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.5.36
// 

public class class18
{
    static int field56;
    String field57;
    public static final int ck = 81;
    static String field58;
    static final int kr = 334;
    Future field59;
    static final int bf = 1006;
    public static final int as = 18;
    
    class18(final String s) {
        this.method64(s, 1664829632);
    }
    
    class18(final Future field59) {
        this.field59 = field59;
    }
    
    public static int nb(final class314 class314) {
        if (class314 == null) {
            return class314.jg();
        }
        return -947277461 * class314.field2844;
    }
    
    static final void drawEntities(int n, int n2, int n3, int n4, final int n5) {
        try {
            Client.viewportDrawCount += 1160286419;
            if (MusicPatchNode.localPlayer.br * 1144428983 >> 7 == 1494100363 * Client.destinationX) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                if (Client.destinationY * -1748014035 == MusicPatchNode.localPlayer.ep * -411750205 >> 7) {
                    Client.destinationX = 0;
                }
            }
            TileItem.method627((byte)0);
            if (-1565733637 * Client.combatTargetPlayerIndex >= 0 && Client.players[-1565733637 * Client.combatTargetPlayerIndex] != null) {
                if (n5 >= 809634404) {
                    return;
                }
                MouseHandler.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex * -1565733637], false, -1861126010);
            }
            RouteStrategy.addNpcsToScene(true, (short)17477);
            final int n6 = Players.Players_count * -2010934433;
            final int[] players_indices = Players.Players_indices;
            for (int i = 0; i < n6; ++i) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                if (Client.combatTargetPlayerIndex * -1565733637 != players_indices[i]) {
                    if (n5 >= 809634404) {
                        return;
                    }
                    if (Client.localPlayerIndex * -549033243 == players_indices[i]) {
                        if (n5 >= 809634404) {
                            return;
                        }
                    }
                    else {
                        MouseHandler.addPlayerToScene(Client.players[players_indices[i]], true, -1861126010);
                    }
                }
            }
            RouteStrategy.addNpcsToScene(false, (short)15358);
            class142.method810(1215119663);
            GraphicsDefaults.method2228((byte)(-93));
            class36.setViewportShape(n, n2, n3, n4, true, -1386012109);
            n = -82629945 * Client.viewportOffsetX;
            n2 = Client.viewportOffsetY * 1352043351;
            n3 = 433849721 * Client.viewportWidth;
            n4 = 2042096749 * Client.viewportHeight;
            Rasterizer2D.Rasterizer2D_setClip(n, n2, n3 + n, n2 + n4);
            method68(339858857);
            Rasterizer2D.method2586();
            int n7 = -954734641 * Client.camAngleX;
            if (205350563 * Client.field456 / 256 > n7) {
                n7 = Client.field456 * 205350563 / 256;
            }
            if (Client.field620[4]) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                if (Client.field643[4] + 128 > n7) {
                    if (n5 >= 809634404) {
                        return;
                    }
                    n7 = Client.field643[4] + 128;
                }
            }
            final int n8 = 704283033 * Client.camAngleY & 0x7FF;
            final int n9 = class33.oculusOrbFocalPointX * -1958669353;
            final int n10 = class96.field1064 * 470489225;
            final int n11 = class144.oculusOrbFocalPointY * -365969735;
            final int method1389 = WorldMapData_0.method1389(n7, (byte)(-99));
            int n12 = n4 - 334;
            if (n12 < 0) {
                if (n5 >= 809634404) {
                    return;
                }
                n12 = 0;
            }
            else if (n12 > 100) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                n12 = 100;
            }
            final int n13 = method1389 * (Client.zoomHeight + n12 * (Client.zoomWidth - Client.zoomHeight) / 100) / 256;
            final int n14 = 2048 - n7 & 0x7FF;
            final int n15 = 2048 - n8 & 0x7FF;
            int n16 = 0;
            int n17 = 0;
            int n18 = n13;
            if (n14 != 0) {
                if (n5 >= 809634404) {
                    return;
                }
                final int n19 = Rasterizer3D.Rasterizer3D_sine[n14];
                final int n20 = Rasterizer3D.Rasterizer3D_cosine[n14];
                final int n21 = n20 * n17 - n19 * n18 >> 16;
                n18 = n19 * n17 + n18 * n20 >> 16;
                n17 = n21;
            }
            if (n15 != 0) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                final int n22 = Rasterizer3D.Rasterizer3D_sine[n15];
                final int n23 = Rasterizer3D.Rasterizer3D_cosine[n15];
                final int n24 = n16 * n23 + n22 * n18 >> 16;
                n18 = n18 * n23 - n22 * n16 >> 16;
                n16 = n24;
            }
            if (Client.isCameraLocked) {
                WorldMapRectangle.field2405 = (n9 - n16) * -1769642683;
                Players.field1095 = (n10 - n17) * -1412316127;
                KitDefinition.field1519 = 1637163077 * (n11 - n18);
                ScriptEvent.field851 = -268140793 * n7;
                class86.field888 = -523744247 * n8;
            }
            else {
                class36.cameraX = (n9 - n16) * -1682679895;
                class174.cameraY = -424093663 * (n10 - n17);
                class297.cameraZ = 46344275 * (n11 - n18);
                WorldMapSectionType.cameraPitch = n7 * 528729485;
                Client.bc(-1);
                class125.cameraYaw = n8 * -1545206147;
            }
            Label_1394: {
                if (1 == 986256295 * Client.oculusOrbState) {
                    if (n5 >= 809634404) {
                        throw new IllegalStateException();
                    }
                    if (Client.staffModLevel * 324465533 >= 2) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        if (0 == Client.cycle * -1886224337 % 50) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            if (1144428983 * MusicPatchNode.localPlayer.br >> 7 == -1958669353 * class33.oculusOrbFocalPointX >> 7) {
                                if (n5 >= 809634404) {
                                    throw new IllegalStateException();
                                }
                                if (-365969735 * class144.oculusOrbFocalPointY >> 7 == -411750205 * MusicPatchNode.localPlayer.ep >> 7) {
                                    break Label_1394;
                                }
                                if (n5 >= 809634404) {
                                    return;
                                }
                            }
                            final int n25 = MusicPatchNode.localPlayer.plane * -1900490645;
                            final int n26 = -1232093375 * WorldMapData_0.baseX + (class33.oculusOrbFocalPointX * -1958669353 >> 7);
                            final int n27 = 827352769 * GameObject.baseY + (class144.oculusOrbFocalPointY * -365969735 >> 7);
                            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2545, Client.packetWriter.isaacCipher, (short)(-3818));
                            packetBufferNode.packetBuffer.dy(1263827259 * Client.field444, (byte)39);
                            packetBufferNode.packetBuffer.bu(n26, (byte)96);
                            packetBufferNode.packetBuffer.eb(n25, (byte)(-110));
                            packetBufferNode.packetBuffer.ds(n27, -2118135666);
                            Client.packetWriter.addNode(packetBufferNode, 414135591);
                        }
                    }
                }
            }
            int method1390;
            if (!Client.isCameraLocked) {
                if (n5 >= 809634404) {
                    return;
                }
                method1390 = UserComparator3.method702((byte)76);
            }
            else {
                int n28 = 0;
                Label_1528: {
                    if (class20.clientPreferences.getRoofsHidden(-1957276732)) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        n28 = -1727408401 * GameEngine.Client_plane;
                    }
                    else {
                        if (class147.getTileHeight(-2100544359 * class36.cameraX, class297.cameraZ * -91399205, GameEngine.Client_plane * -1727408401, (byte)(-99)) - class174.cameraY * 1772923873 < 800) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            if (0x0 != (Tiles.Tiles_renderFlags[-1727408401 * GameEngine.Client_plane][-2100544359 * class36.cameraX >> 7][class297.cameraZ * -91399205 >> 7] & 0x4)) {
                                if (n5 >= 809634404) {
                                    throw new IllegalStateException();
                                }
                                n28 = GameEngine.Client_plane * -1727408401;
                                break Label_1528;
                            }
                        }
                        n28 = 3;
                    }
                }
                method1390 = n28;
            }
            final int n29 = -2100544359 * class36.cameraX;
            final int n30 = 1772923873 * class174.cameraY;
            final int n31 = -91399205 * class297.cameraZ;
            final int n32 = WorldMapSectionType.cameraPitch * 1897923909;
            final int n33 = -1010818347 * class125.cameraYaw;
            for (int j = 0; j < 5; ++j) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                if (Client.field620[j]) {
                    if (n5 >= 809634404) {
                        throw new IllegalStateException();
                    }
                    final int n34 = (int)(Math.random() * (Client.field621[j] * 2 + 1) - Client.field621[j] + Math.sin(Client.cameraShakeCycle[j] * (Client.field499[j] / 100.0)) * Client.field643[j]);
                    if (j == 0) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        class36.cameraX += -1682679895 * n34;
                    }
                    if (j != 0) {
                        class174.cameraY += -424093663 * n34;
                    }
                    if (j == 2) {
                        if (n5 >= 809634404) {
                            return;
                        }
                        class297.cameraZ += 46344275 * n34;
                    }
                    if (3 == j) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        class125.cameraYaw = (class125.cameraYaw * -1010818347 + n34 & 0x7FF) * -1545206147;
                    }
                    if (4 == j) {
                        WorldMapSectionType.cameraPitch += 528729485 * n34;
                        Client.bc(-1);
                        if (1897923909 * WorldMapSectionType.cameraPitch < 128) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            WorldMapSectionType.cameraPitch = -1042102656;
                            Client.bc(-1);
                        }
                        if (1897923909 * WorldMapSectionType.cameraPitch > 383) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            WorldMapSectionType.cameraPitch = 639929843;
                            Client.bc(-1);
                        }
                    }
                }
            }
            int n35 = -2063363905 * MouseHandler.MouseHandler_x;
            int n36 = -1224153235 * MouseHandler.MouseHandler_y;
            if (0 != MouseHandler.MouseHandler_lastButton * -1222491879) {
                if (n5 >= 809634404) {
                    return;
                }
                n35 = 2020601481 * MouseHandler.MouseHandler_lastPressedX;
                n36 = 1163896205 * MouseHandler.MouseHandler_lastPressedY;
            }
            Label_2190: {
                if (n35 >= n && n35 < n + n3) {
                    if (n5 >= 809634404) {
                        throw new IllegalStateException();
                    }
                    if (n36 >= n2) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        if (n36 < n2 + n4) {
                            final int n37 = n35 - n;
                            final int n38 = n36 - n2;
                            ViewportMouse.ViewportMouse_x = -580855267 * n37;
                            ViewportMouse.ViewportMouse_y = n38 * 1124836073;
                            ViewportMouse.ViewportMouse_isInViewport = true;
                            ViewportMouse.ViewportMouse_entityCount = 0;
                            ViewportMouse.ViewportMouse_false0 = false;
                            break Label_2190;
                        }
                    }
                }
                class146.method829(520752062);
            }
            class323.playPcmPlayers(-1758877538);
            Client.qb(n, n2, n3, n4, 0);
            class323.playPcmPlayers(-307340446);
            final int get3dZoom = UserComparator7.get3dZoom(-1532029373);
            class314.method1779(ScriptFrame.client.by, 114146742);
            Rasterizer3D.clips.field2227 = Client.viewportZoom * 1241253503;
            Scene.mq(class31.scene, -2100544359 * class36.cameraX, 1772923873 * class174.cameraY, -91399205 * class297.cameraZ, 1897923909 * WorldMapSectionType.cameraPitch, class125.cameraYaw * -1010818347, method1390);
            class314.method1779(false, -793944723);
            if (Client.renderSelf) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                Rasterizer2D.method2578();
            }
            Rasterizer3D.clips.field2227 = get3dZoom * 1001249361;
            class323.playPcmPlayers(-1226478906);
            class31.scene.clearTempGameObjects();
            Client.overheadTextCount = 0;
            boolean b = false;
            int n39 = -1;
            int n40 = -1;
            final int n41 = Players.Players_count * -2010934433;
            final int[] players_indices2 = Players.Players_indices;
            for (int k = 0; k < 265474485 * Client.npcCount + n41; ++k) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                Actor actor;
                if (k < n41) {
                    if (n5 >= 809634404) {
                        return;
                    }
                    actor = Client.players[players_indices2[k]];
                    if (players_indices2[k] == -1565733637 * Client.combatTargetPlayerIndex) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        b = true;
                        n39 = k;
                        continue;
                    }
                    else if (MusicPatchNode.localPlayer == actor) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        n40 = k;
                        continue;
                    }
                }
                else {
                    actor = Client.npcs[Client.npcIndices[k - n41]];
                }
                class33.drawActor2d(actor, k, n, n2, n3, n4, 1538298261);
            }
            if (Client.field482) {
                if (n5 >= 809634404) {
                    return;
                }
                if (-1 != n40) {
                    if (n5 >= 809634404) {
                        throw new IllegalStateException();
                    }
                    class33.drawActor2d(MusicPatchNode.localPlayer, n40, n, n2, n3, n4, 1538298261);
                }
            }
            if (b) {
                class33.drawActor2d(Client.players[-1565733637 * Client.combatTargetPlayerIndex], n39, n, n2, n3, n4, 1538298261);
            }
            for (int l = 0; l < Client.overheadTextCount * 734988573; ++l) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                final int n42 = Client.overheadTextXs[l];
                int n43 = Client.overheadTextYs[l];
                final int n44 = Client.overheadTextXOffsets[l];
                final int n45 = Client.overheadTextAscents[l];
                int n46 = 1;
                while (n46 != 0) {
                    if (n5 >= 809634404) {
                        throw new IllegalStateException();
                    }
                    n46 = 0;
                    for (int n47 = 0; n47 < l; ++n47) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        if (n43 + 2 > Client.overheadTextYs[n47] - Client.overheadTextAscents[n47]) {
                            if (n5 >= 809634404) {
                                return;
                            }
                            if (n43 - n45 < 2 + Client.overheadTextYs[n47] && n42 - n44 < Client.overheadTextXOffsets[n47] + Client.overheadTextXs[n47]) {
                                if (n5 >= 809634404) {
                                    throw new IllegalStateException();
                                }
                                if (n42 + n44 > Client.overheadTextXs[n47] - Client.overheadTextXOffsets[n47]) {
                                    if (n5 >= 809634404) {
                                        throw new IllegalStateException();
                                    }
                                    if (Client.overheadTextYs[n47] - Client.overheadTextAscents[n47] < n43) {
                                        if (n5 >= 809634404) {
                                            return;
                                        }
                                        n43 = Client.overheadTextYs[n47] - Client.overheadTextAscents[n47];
                                        n46 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                Client.viewportTempX = -846498395 * Client.overheadTextXs[l];
                final int[] overheadTextYs = Client.overheadTextYs;
                final int n48 = l;
                final int n49 = n43;
                overheadTextYs[n48] = n49;
                Client.viewportTempY = n49 * -1610031701;
                final String s = Client.overheadText[l];
                if (0 == Client.chatEffects * 395188193) {
                    if (n5 >= 809634404) {
                        throw new IllegalStateException();
                    }
                    int n50 = 16776960;
                    if (Client.overheadTextColors[l] < 6) {
                        n50 = Client.field583[Client.overheadTextColors[l]];
                    }
                    if (Client.overheadTextColors[l] == 6) {
                        if (n5 >= 809634404) {
                            return;
                        }
                        n50 = ((Client.viewportDrawCount * 2041464667 % 20 < 10) ? 16711680 : 16776960);
                    }
                    if (7 == Client.overheadTextColors[l]) {
                        if (n5 >= 809634404) {
                            return;
                        }
                        n50 = ((2041464667 * Client.viewportDrawCount % 20 < 10) ? 255 : 65535);
                    }
                    if (8 == Client.overheadTextColors[l]) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        int n51;
                        if (Client.viewportDrawCount * 2041464667 % 20 < 10) {
                            if (n5 >= 809634404) {
                                return;
                            }
                            n51 = 45056;
                        }
                        else {
                            n51 = 8454016;
                        }
                        n50 = n51;
                    }
                    if (9 == Client.overheadTextColors[l]) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        final int n52 = 150 - Client.overheadTextCyclesRemaining[l];
                        if (n52 < 50) {
                            n50 = n52 * 1280 + 16711680;
                        }
                        else if (n52 < 100) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n50 = 16776960 - (n52 - 50) * 327680;
                        }
                        else if (n52 < 150) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n50 = 5 * (n52 - 100) + 65280;
                        }
                    }
                    if (10 == Client.overheadTextColors[l]) {
                        if (n5 >= 809634404) {
                            return;
                        }
                        final int n53 = 150 - Client.overheadTextCyclesRemaining[l];
                        if (n53 < 50) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n50 = 5 * n53 + 16711680;
                        }
                        else if (n53 < 100) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n50 = 16711935 - (n53 - 50) * 327680;
                        }
                        else if (n53 < 150) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n50 = 255 + 327680 * (n53 - 100) - 5 * (n53 - 100);
                        }
                    }
                    if (11 == Client.overheadTextColors[l]) {
                        if (n5 >= 809634404) {
                            throw new IllegalStateException();
                        }
                        final int n54 = 150 - Client.overheadTextCyclesRemaining[l];
                        if (n54 < 50) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n50 = 16777215 - n54 * 327685;
                        }
                        else if (n54 < 100) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n50 = 65280 + 327685 * (n54 - 50);
                        }
                        else if (n54 < 150) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n50 = 16777215 - (n54 - 100) * 327680;
                        }
                    }
                    if (0 == Client.overheadTextEffects[l]) {
                        class137.fontBold12.aj(s, n + Client.viewportTempX * -1848743379, n2 + 318977283 * Client.viewportTempY, n50, 0);
                    }
                    if (Client.overheadTextEffects[l] == 1) {
                        class137.fontBold12.ae(s, -1848743379 * Client.viewportTempX + n, Client.viewportTempY * 318977283 + n2, n50, 0, Client.viewportDrawCount * 2041464667);
                    }
                    if (Client.overheadTextEffects[l] == 2) {
                        class137.fontBold12.ap(s, -1848743379 * Client.viewportTempX + n, n2 + 318977283 * Client.viewportTempY, n50, 0, Client.viewportDrawCount * 2041464667);
                    }
                    if (Client.overheadTextEffects[l] == 3) {
                        class137.fontBold12.by(s, n + Client.viewportTempX * -1848743379, n2 + 318977283 * Client.viewportTempY, n50, 0, 2041464667 * Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[l]);
                    }
                    if (4 == Client.overheadTextEffects[l]) {
                        final int n55 = (150 - Client.overheadTextCyclesRemaining[l]) * (class137.fontBold12.bf(s) + 100) / 150;
                        Rasterizer2D.Rasterizer2D_expandClip(-1848743379 * Client.viewportTempX + n - 50, n2, n + Client.viewportTempX * -1848743379 + 50, n4 + n2);
                        class492.xb(class137.fontBold12, s, 50 + (n + -1848743379 * Client.viewportTempX) - n55, n2 + Client.viewportTempY * 318977283, n50, 0);
                        Rasterizer2D.Rasterizer2D_setClip(n, n2, n + n3, n2 + n4);
                    }
                    if (Client.overheadTextEffects[l] == 5) {
                        if (n5 >= 809634404) {
                            return;
                        }
                        final int n56 = 150 - Client.overheadTextCyclesRemaining[l];
                        int n57 = 0;
                        if (n56 < 25) {
                            n57 = n56 - 25;
                        }
                        else if (n56 > 125) {
                            if (n5 >= 809634404) {
                                throw new IllegalStateException();
                            }
                            n57 = n56 - 125;
                        }
                        Rasterizer2D.Rasterizer2D_expandClip(n, n2 + 318977283 * Client.viewportTempY - class137.fontBold12.al - 1, n3 + n, 5 + (318977283 * Client.viewportTempY + n2));
                        class137.fontBold12.aj(s, n + Client.viewportTempX * -1848743379, n2 + 318977283 * Client.viewportTempY + n57, n50, 0);
                        Rasterizer2D.Rasterizer2D_setClip(n, n2, n3 + n, n4 + n2);
                    }
                }
                else {
                    class137.fontBold12.aj(s, Client.viewportTempX * -1848743379 + n, n2 + 318977283 * Client.viewportTempY, 16776960, 0);
                }
            }
            class317.method1828(n, n2, 2047832354);
            ((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.field432 * -1795081153, 224047431);
            Friend.method2153(-1530842203);
            class36.cameraX = -1682679895 * n29;
            class174.cameraY = -424093663 * n30;
            class297.cameraZ = n31 * 46344275;
            WorldMapSectionType.cameraPitch = n32 * 528729485;
            Client.bc(-1);
            class125.cameraYaw = n33 * -1545206147;
            if (Client.isLoading) {
                if (n5 >= 809634404) {
                    throw new IllegalStateException();
                }
                if (HorizontalAlignment.method1019(true, false, (byte)(-35)) == 0) {
                    if (n5 >= 809634404) {
                        throw new IllegalStateException();
                    }
                    Client.isLoading = false;
                }
            }
            if (Client.isLoading) {
                if (n5 >= 809634404) {
                    return;
                }
                Client.qb(n, n2, n3, n4, 0);
                WorldMapDecoration.drawLoadingMessage(Strings.ao, false, -927070495);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.id(" + ')');
        }
    }
    
    public static void method68(final int n) {
        try {
            final int rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            final int rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            final int rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_xClipEnd;
            final int rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_yClipEnd;
            Rasterizer3D.clips.field2233 = (rasterizer2D_xClipEnd - rasterizer2D_xClipStart) * 1163083059;
            Rasterizer3D.clips.field2232 = -508492839 * (rasterizer2D_yClipEnd - rasterizer2D_yClipStart);
            Tiles.method474(1441948024);
            if (Rasterizer3D.clips.Rasterizer3D_rowOffsets.length < Rasterizer3D.clips.field2232 * -1347859351) {
                if (n == -431492711) {
                    return;
                }
                Rasterizer3D.clips.Rasterizer3D_rowOffsets = new int[class70.method442(Rasterizer3D.clips.field2232 * -1347859351, 257172628)];
            }
            int n2 = rasterizer2D_xClipStart + Rasterizer2D.Rasterizer2D_width * rasterizer2D_yClipStart;
            for (int i = 0; i < Rasterizer3D.clips.field2232 * -1347859351; ++i) {
                if (n == -431492711) {
                    throw new IllegalStateException();
                }
                Rasterizer3D.clips.Rasterizer3D_rowOffsets[i] = n2;
                n2 += Rasterizer2D.Rasterizer2D_width;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.ao(" + ')');
        }
    }
    
    public final boolean method68() {
        return jm(this, (byte)106) || this.field59.isDone();
    }
    
    public final String at() {
        return this.field57;
    }
    
    public static void method75(final int n) {
        try {
            Widget.Widget_cachedSprites.clear();
            Widget.Widget_cachedModels.clear();
            Widget.Widget_cachedFonts.clear();
            Widget.Widget_cachedSpriteMasks.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.av(" + ')');
        }
    }
    
    public final boolean ax() {
        return jm(this, (byte)77) || this.field59.isDone();
    }
    
    public boolean ay() {
        return null != this.field57 || null == this.field59;
    }
    
    public static class20 ck(final class18 class18, final int n) {
        if (class18 == null) {
            class18.method67(n);
        }
        try {
            if (jm(class18, (byte)81)) {
                if (n >= -1038081302) {
                    throw new IllegalStateException();
                }
                return new class20(class18.field57);
            }
            else if (!class18.method66(-2135104783)) {
                if (n >= -1038081302) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                try {
                    return class18.field59.get();
                }
                catch (Exception obj) {
                    final String str = "Error retrieving REST request reply";
                    System.err.println(str + "\r\n" + obj);
                    class18.method64(str, -898122072);
                    return new class20(str);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.au(" + ')');
        }
    }
    
    public boolean method63(final byte b) {
        try {
            if (null == this.field57) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (null != this.field59) {
                    return false;
                }
                if (b <= 1) {
                    throw new IllegalStateException();
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.aw(" + ')');
        }
    }
    
    static String method63(final int n) {
        try {
            String s;
            if (ClientPreferences.ty(class20.clientPreferences, -2098308290)) {
                if (n == 16776960) {
                    throw new IllegalStateException();
                }
                s = WorldMapDecorationType.method1841(Login.Login_username, (byte)1);
            }
            else {
                s = Login.Login_username;
            }
            return s;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.aw(" + ')');
        }
    }
    
    public static int method63(int n, final int n2) {
        try {
            n = (n >>> 1 & 0x55555555) + (n & 0x55555555);
            n = (n >>> 2 & 0x33333333) + (n & 0x33333333);
            n = ((n >>> 4) + n & 0xF0F0F0F);
            n += n >>> 8;
            n += n >>> 16;
            return n & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.aw(" + ')');
        }
    }
    
    public static void method65(final double n) {
        try {
            class7.method22(n, 0, 512, -1907908914);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.an(" + ')');
        }
    }
    
    static void method65(final int n) {
        try {
            for (ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last(); objectSound != null; objectSound = (ObjectSound)ObjectSound.objectSounds.previous()) {
                if (n >= 1095129611) {
                    throw new IllegalStateException();
                }
                if (objectSound.obj != null) {
                    if (n >= 1095129611) {
                        throw new IllegalStateException();
                    }
                    objectSound.set(27660078);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.an(" + ')');
        }
    }
    
    public final String method65(final int n) {
        try {
            return this.field57;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.an(" + ')');
        }
    }
    
    public final boolean method66(final int n) {
        try {
            if (!jm(this, (byte)12)) {
                return this.field59.isDone();
            }
            if (n >= -1981617696) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.ac(" + ')');
        }
    }
    
    public final class20 method67(final int n) {
        try {
            if (jm(this, (byte)81)) {
                if (n >= -1038081302) {
                    throw new IllegalStateException();
                }
                return new class20(this.field57);
            }
            else if (!this.method66(-2135104783)) {
                if (n >= -1038081302) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                try {
                    return this.field59.get();
                }
                catch (Exception obj) {
                    final String str = "Error retrieving REST request reply";
                    System.err.println(str + "\r\n" + obj);
                    this.method64(str, -898122072);
                    return new class20(str);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.au(" + ')');
        }
    }
    
    public final boolean ai() {
        return jm(this, (byte)5) || this.field59.isDone();
    }
    
    static int method69(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (3903 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].type((byte)(-79));
                return 1;
            }
            if (n == 3904) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].id * -300881317;
                return 1;
            }
            if (n == 3905) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].unitPrice * -1994102707;
                return 1;
            }
            if (n == 3906) {
                if (n2 <= 854271946) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 857042809 * Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].totalQuantity;
                return 1;
            }
            else {
                if (n == 3907) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].currentQuantity * -52036157;
                    return 1;
                }
                if (n == 3908) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1510761213 * Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].currentPrice;
                    return 1;
                }
                if (3910 == n) {
                    if (n2 <= 854271946) {
                        throw new IllegalStateException();
                    }
                    final int status = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].status(-746702541);
                    final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                    final int n3 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b2;
                    if (status == 0) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    interpreter_intStack[n3] = (b2 ? 1 : 0);
                    return 1;
                }
                else if (3911 == n) {
                    if (n2 <= 854271946) {
                        throw new IllegalStateException();
                    }
                    final int status2 = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].status(-686657188);
                    final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                    final int n4 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b3;
                    if (2 == status2) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    interpreter_intStack2[n4] = (b3 ? 1 : 0);
                    return 1;
                }
                else if (n == 3912) {
                    if (n2 <= 854271946) {
                        throw new IllegalStateException();
                    }
                    final int status3 = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].status(-1291077953);
                    final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                    final int n5 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b4;
                    if (5 == status3) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    interpreter_intStack3[n5] = (b4 ? 1 : 0);
                    return 1;
                }
                else if (n == 3913) {
                    if (n2 <= 854271946) {
                        throw new IllegalStateException();
                    }
                    final int status4 = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].status(-1836937450);
                    final int[] interpreter_intStack4 = Interpreter.Interpreter_intStack;
                    final int n6 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b5;
                    if (status4 != 0) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        b5 = true;
                    }
                    else {
                        b5 = false;
                    }
                    interpreter_intStack4[n6] = (b5 ? 1 : 0);
                    return 1;
                }
                else if (3914 == n) {
                    if (n2 <= 854271946) {
                        throw new IllegalStateException();
                    }
                    boolean b6;
                    if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        b6 = true;
                    }
                    else {
                        b6 = false;
                    }
                    final boolean b7 = b6;
                    if (class375.grandExchangeEvents != null) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, b7, 694808074);
                    }
                    return 1;
                }
                else {
                    if (n == 3915) {
                        boolean b8;
                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            b8 = true;
                        }
                        else {
                            b8 = false;
                        }
                        final boolean b9 = b8;
                        if (null != class375.grandExchangeEvents) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, b9, 694808074);
                        }
                        return 1;
                    }
                    if (3916 == n) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        boolean b10;
                        if (1 == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539]) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            b10 = true;
                        }
                        else {
                            b10 = false;
                        }
                        final boolean b11 = b10;
                        boolean b12;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] == 1) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            b12 = true;
                        }
                        else {
                            b12 = false;
                        }
                        final boolean filterWorlds = b12;
                        if (class375.grandExchangeEvents != null) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            Client.GrandExchangeEvents_worldComparator.filterWorlds = filterWorlds;
                            class375.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, b11, 694808074);
                        }
                        return 1;
                    }
                    else if (n == 3917) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        boolean b13;
                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            b13 = true;
                        }
                        else {
                            b13 = false;
                        }
                        final boolean b14 = b13;
                        if (null != class375.grandExchangeEvents) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, b14, 694808074);
                        }
                        return 1;
                    }
                    else if (n == 3918) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        boolean b15;
                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            b15 = true;
                        }
                        else {
                            b15 = false;
                        }
                        final boolean b16 = b15;
                        if (class375.grandExchangeEvents != null) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, b16, 694808074);
                        }
                        return 1;
                    }
                    else if (3919 == n) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        final int[] interpreter_intStack5 = Interpreter.Interpreter_intStack;
                        final int n7 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        int size;
                        if (null == class375.grandExchangeEvents) {
                            if (n2 <= 854271946) {
                                throw new IllegalStateException();
                            }
                            size = 0;
                        }
                        else {
                            size = class375.grandExchangeEvents.events.size();
                        }
                        interpreter_intStack5[n7] = size;
                        return 1;
                    }
                    else if (3920 == n) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).world * -39392873;
                        return 1;
                    }
                    else if (3921 == n) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = GrandExchangeEvent.yc(class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]), -1523896735);
                        return 1;
                    }
                    else if (3922 == n) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).getPreviousOfferName(-171427168);
                        return 1;
                    }
                    else if (n == 3923) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        final long n8 = class96.clockNow(31054670) - class323.field3037 * -8156142729726467959L - -2107275097961185091L * class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).age;
                        final int i = (int)(n8 / 3600000L);
                        final int n9 = (int)((n8 - i * 3600000) / 60000L);
                        final int n10 = (int)((n8 - i * 3600000 - 60000 * n9) / 1000L);
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = i + ":" + n9 / 10 + n9 % 10 + ":" + n10 / 10 + n10 % 10;
                        return 1;
                    }
                    else if (n == 3924) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).grandExchangeOffer.totalQuantity * 857042809;
                        return 1;
                    }
                    else if (n == 3925) {
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1994102707 * class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).grandExchangeOffer.unitPrice;
                        return 1;
                    }
                    else {
                        if (3926 != n) {
                            return 2;
                        }
                        if (n2 <= 854271946) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).grandExchangeOffer.id * -300881317;
                        return 1;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.bx(" + ')');
        }
    }
    
    void method64(String field57, final int n) {
        try {
            if (field57 == null) {
                if (n == -210027489) {
                    throw new IllegalStateException();
                }
                field57 = "";
            }
            this.field57 = field57;
            if (this.field59 != null) {
                if (n == -210027489) {
                    throw new IllegalStateException();
                }
                this.field59.cancel(true);
                this.field59 = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.af(" + ')');
        }
    }
    
    void ab(String field57) {
        if (field57 == null) {
            field57 = "";
        }
        this.field57 = field57;
        if (this.field59 != null) {
            this.field59.cancel(true);
            this.field59 = null;
        }
    }
    
    public final String aq() {
        return this.field57;
    }
    
    static final int method77(final int a, final int n) {
        try {
            return Math.min(Math.max(a, 128), 383);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.iz(" + ')');
        }
    }
    
    public static boolean jm(final class18 class18, final byte b) {
        if (class18 == null) {
            return class18.method63(b);
        }
        try {
            if (null == class18.field57) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (null != class18.field59) {
                    return false;
                }
                if (b <= 1) {
                    throw new IllegalStateException();
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.aw(" + ')');
        }
    }
    
    public static boolean hk(final class18 class18) {
        if (class18 == null) {
            class18.ai();
        }
        return jm(class18, (byte)125) || class18.field59.isDone();
    }
    
    public final class20 ah() {
        if (jm(this, (byte)8)) {
            return new class20(this.field57);
        }
        if (!this.method66(-2060270308)) {
            return null;
        }
        try {
            return this.field59.get();
        }
        catch (Exception obj) {
            final String str = "Error retrieving REST request reply";
            System.err.println(str + "\r\n" + obj);
            this.method64(str, 214777403);
            return new class20(str);
        }
    }
    
    public static boolean hj(final class18 class18) {
        return null != class18.field57 || null == class18.field59;
    }
    
    static void selectSpell(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            final Widget widgetChild = SoundSystem.getWidgetChild(n, n2, 366054358);
            if (widgetChild != null && widgetChild.onTargetEnter != null) {
                if (n5 <= -886614037) {
                    throw new IllegalStateException();
                }
                final ScriptEvent scriptEvent = new ScriptEvent();
                scriptEvent.dragTarget = widgetChild;
                scriptEvent.args = widgetChild.onTargetEnter;
                HealthBarUpdate.set(scriptEvent, (byte)62);
            }
            Client.selectedSpellItemId = n4 * 35668549;
            Client.isSpellSelected = true;
            Clips.selectedSpellWidget = n * 1511366623;
            Client.selectedSpellChildIndex = -1204907975 * n2;
            SecureRandomFuture.selectedSpellFlags = n3 * 1300386839;
            class144.invalidateWidget(widgetChild, -1115510144);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "am.kh(" + ')');
        }
    }
}
