import net.runelite.api.coords.LocalPoint;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class155 extends Node
{
    static final int at = 2;
    
    class155() {
    }
    
    abstract void aw(final Buffer p0);
    
    abstract void vmethod3239(final ClanChannel p0, final byte p1);
    
    abstract void ac(final Buffer p0);
    
    abstract void au(final Buffer p0);
    
    static final void drawMinimap(final Widget widget, final int n, final int n2, final int n3, final int n4) {
        final int cd = ScriptFrame.client.cd();
        if ((!Client.wp && Client.jc == Client.wp) || cd == 2 || cd == 5) {
            final int n5 = 715793835;
            try {
                class323.playPcmPlayers(-289164347);
                final SpriteMask vn = Widget.vn(widget, false, (byte)(-106));
                if (null != vn) {
                    Rasterizer2D.Rasterizer2D_setClip(n, n2, 1484188043 * vn.width + n, vn.height * 939947663 + n2);
                    while (true) {
                        Label_1919: {
                            if (2 == 1383336963 * Client.minimapState) {
                                break Label_1919;
                            }
                            if (n5 >= 1525351022) {
                                throw new IllegalStateException();
                            }
                            if (Client.minimapState * 1383336963 == 5) {
                                break Label_1919;
                            }
                            if (n5 >= 1525351022) {
                                return;
                            }
                            UrlRequester.sceneMinimapSprite.drawRotatedMaskedCenteredAround(n, n2, 1484188043 * vn.width, vn.height * 939947663, 48 + MusicPatchNode.localPlayer.br * 1144428983 / 32, 464 - -411750205 * MusicPatchNode.localPlayer.ep / 32, 704283033 * Client.camAngleY & 0x7FF, 256, vn.xStarts, vn.xWidths);
                            for (int i = 0; i < Client.mapIconCount * 1573101195; ++i) {
                                if (n5 >= 1525351022) {
                                    throw new IllegalStateException();
                                }
                                class426.drawSpriteOnMinimap(n, n2, 4 * Client.mapIconXs[i] + 2 - MusicPatchNode.localPlayer.br * 1144428983 / 32, 2 + Client.mapIconYs[i] * 4 - -411750205 * MusicPatchNode.localPlayer.ep / 32, Client.mapIcons[i], vn, -1609285207);
                            }
                            for (int j = 0; j < 104; ++j) {
                                for (int k = 0; k < 104; ++k) {
                                    if (null != Client.groundItems[GameEngine.Client_plane * -1727408401][j][k]) {
                                        class426.drawSpriteOnMinimap(n, n2, 4 * j + 2 - 1144428983 * MusicPatchNode.localPlayer.br / 32, k * 4 + 2 - -411750205 * MusicPatchNode.localPlayer.ep / 32, class477.mapDotSprites[0], vn, -1609285207);
                                    }
                                }
                            }
                            for (int l = 0; l < 265474485 * Client.npcCount; ++l) {
                                final NPC npc = Client.npcs[Client.npcIndices[l]];
                                if (null != npc) {
                                    if (n5 >= 1525351022) {
                                        throw new IllegalStateException();
                                    }
                                    if (npc.isVisible(1666539507)) {
                                        if (n5 >= 1525351022) {
                                            return;
                                        }
                                        NPCComposition npcComposition = npc.definition;
                                        if (null != npcComposition && null != npcComposition.transforms) {
                                            if (n5 >= 1525351022) {
                                                throw new IllegalStateException();
                                            }
                                            npcComposition = NPCComposition.ur(npcComposition, 2047465021);
                                        }
                                        if (npcComposition != null) {
                                            if (n5 >= 1525351022) {
                                                throw new IllegalStateException();
                                            }
                                            if (npcComposition.drawMapDot) {
                                                if (n5 >= 1525351022) {
                                                    throw new IllegalStateException();
                                                }
                                                if (npcComposition.isInteractable) {
                                                    if (n5 >= 1525351022) {
                                                        throw new IllegalStateException();
                                                    }
                                                    class426.drawSpriteOnMinimap(n, n2, npc.br * 1144428983 / 32 - MusicPatchNode.localPlayer.br * 1144428983 / 32, npc.ep * -411750205 / 32 - MusicPatchNode.localPlayer.ep * -411750205 / 32, class477.mapDotSprites[1], vn, -1609285207);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            final int n6 = Players.Players_count * -2010934433;
                            final int[] players_indices = Players.Players_indices;
                            for (int n7 = 0; n7 < n6; ++n7) {
                                if (n5 >= 1525351022) {
                                    throw new IllegalStateException();
                                }
                                final Player player = Client.players[players_indices[n7]];
                                if (null != player) {
                                    if (n5 >= 1525351022) {
                                        throw new IllegalStateException();
                                    }
                                    if (player.isVisible(1666539507)) {
                                        if (n5 >= 1525351022) {
                                            throw new IllegalStateException();
                                        }
                                        if (!player.isHidden) {
                                            if (n5 >= 1525351022) {
                                                throw new IllegalStateException();
                                            }
                                            if (MusicPatchNode.localPlayer != player) {
                                                if (n5 >= 1525351022) {
                                                    throw new IllegalStateException();
                                                }
                                                final int n8 = 1144428983 * player.br / 32 - 1144428983 * MusicPatchNode.localPlayer.br / 32;
                                                final int n9 = -411750205 * player.ep / 32 - -411750205 * MusicPatchNode.localPlayer.ep / 32;
                                                if (Player.yc(player, -1214578435)) {
                                                    if (n5 >= 1525351022) {
                                                        return;
                                                    }
                                                    class426.drawSpriteOnMinimap(n, n2, n8, n9, class477.mapDotSprites[3], vn, -1609285207);
                                                }
                                                else {
                                                    if (-55850951 * MusicPatchNode.localPlayer.team != 0) {
                                                        if (n5 >= 1525351022) {
                                                            return;
                                                        }
                                                        if (-55850951 * player.team != 0) {
                                                            if (n5 >= 1525351022) {
                                                                throw new IllegalStateException();
                                                            }
                                                            if (-55850951 * MusicPatchNode.localPlayer.team == -55850951 * player.team) {
                                                                if (n5 >= 1525351022) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                class426.drawSpriteOnMinimap(n, n2, n8, n9, class477.mapDotSprites[4], vn, -1609285207);
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    if (Player.zk(player, (byte)(-120))) {
                                                        class426.drawSpriteOnMinimap(n, n2, n8, n9, class477.mapDotSprites[5], vn, -1609285207);
                                                    }
                                                    else if (player.isClanMember((byte)0)) {
                                                        if (n5 >= 1525351022) {
                                                            throw new IllegalStateException();
                                                        }
                                                        class426.drawSpriteOnMinimap(n, n2, n8, n9, class477.mapDotSprites[6], vn, -1609285207);
                                                    }
                                                    else {
                                                        class426.drawSpriteOnMinimap(n, n2, n8, n9, class477.mapDotSprites[2], vn, -1609285207);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (0 != Client.hintArrowType * 633821975) {
                                if (n5 >= 1525351022) {
                                    return;
                                }
                                if (-1886224337 * Client.cycle % 20 < 10) {
                                    if (n5 >= 1525351022) {
                                        throw new IllegalStateException();
                                    }
                                    if (1 == Client.hintArrowType * 633821975) {
                                        if (n5 >= 1525351022) {
                                            throw new IllegalStateException();
                                        }
                                        if (920558921 * Client.hintArrowNpcIndex >= 0) {
                                            if (n5 >= 1525351022) {
                                                throw new IllegalStateException();
                                            }
                                            if (Client.hintArrowNpcIndex * 920558921 < Client.npcs.length) {
                                                if (n5 >= 1525351022) {
                                                    throw new IllegalStateException();
                                                }
                                                final NPC npc2 = Client.npcs[920558921 * Client.hintArrowNpcIndex];
                                                if (null != npc2) {
                                                    if (n5 >= 1525351022) {
                                                        throw new IllegalStateException();
                                                    }
                                                    class485.worldToMinimap(n, n2, npc2.br * 1144428983 / 32 - MusicPatchNode.localPlayer.br * 1144428983 / 32, npc2.ep * -411750205 / 32 - -411750205 * MusicPatchNode.localPlayer.ep / 32, Players.mapMarkerSprites[1], vn, 1850494258);
                                                }
                                            }
                                        }
                                    }
                                    if (2 == 633821975 * Client.hintArrowType) {
                                        if (n5 >= 1525351022) {
                                            throw new IllegalStateException();
                                        }
                                        class485.worldToMinimap(n, n2, -420453652 * Client.hintArrowX - -633406204 * WorldMapData_0.baseX + 2 - MusicPatchNode.localPlayer.br * 1144428983 / 32, 2 + (-1108154476 * Client.hintArrowY - GameObject.baseY * -985556220) - -411750205 * MusicPatchNode.localPlayer.ep / 32, Players.mapMarkerSprites[1], vn, 1850494258);
                                    }
                                    if (10 == 633821975 * Client.hintArrowType) {
                                        if (n5 >= 1525351022) {
                                            throw new IllegalStateException();
                                        }
                                        if (Client.hintArrowPlayerIndex * 561980131 >= 0 && Client.hintArrowPlayerIndex * 561980131 < Client.players.length) {
                                            if (n5 >= 1525351022) {
                                                throw new IllegalStateException();
                                            }
                                            final Player player2 = Client.players[Client.hintArrowPlayerIndex * 561980131];
                                            if (null != player2) {
                                                class485.worldToMinimap(n, n2, 1144428983 * player2.br / 32 - MusicPatchNode.localPlayer.br * 1144428983 / 32, player2.ep * -411750205 / 32 - MusicPatchNode.localPlayer.ep * -411750205 / 32, Players.mapMarkerSprites[1], vn, 1850494258);
                                            }
                                        }
                                    }
                                }
                            }
                            if (1494100363 * Client.destinationX != 0) {
                                if (n5 >= 1525351022) {
                                    throw new IllegalStateException();
                                }
                                class426.drawSpriteOnMinimap(n, n2, 2 + 1681434156 * Client.destinationX - 1144428983 * MusicPatchNode.localPlayer.br / 32, 2 + 1597878452 * Client.destinationY - -411750205 * MusicPatchNode.localPlayer.ep / 32, Players.mapMarkerSprites[0], vn, -1609285207);
                            }
                            if (!MusicPatchNode.localPlayer.isHidden) {
                                if (n5 >= 1525351022) {
                                    throw new IllegalStateException();
                                }
                                Rasterizer2D.Rasterizer2D_fillRectangle(n + 1484188043 * vn.width / 2 - 1, n2 + 939947663 * vn.height / 2 - 1, 3, 3, 16777215);
                            }
                            Client.field574[n3] = true;
                            return;
                        }
                        Rasterizer2D.Rasterizer2D_fillMaskedRectangle(n, n2, 0, vn.xStarts, vn.xWidths);
                        continue;
                    }
                }
                if (n5 >= 1525351022) {
                    throw new IllegalStateException();
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "fu.mb(" + ')');
            }
            return;
        }
        final SpriteMask un = widget.un(false);
        if (un == null) {
            return;
        }
        final LocalPoint localLocation = ScriptFrame.client.fv().getLocalLocation();
        final int n10 = ScriptFrame.client.getCameraYawTarget() & 0x7FF;
        try {
            final double xq = Client.xq;
            final double n11 = xq / 128.0;
            final int n12 = Math.max(un.he(), un.da()) * 3 / 2;
            if (Client.as == null || Client.as.getWidth() != n12) {
                Client.as = SpritePixels.zd(n12, n12);
            }
            final int n13 = (int)(n12 / 2 / n11);
            final int n14 = localLocation.getX() - n13;
            final int n15 = localLocation.getY() - n13;
            final int max = Math.max(0, n14 / 128);
            final int max2 = Math.max(0, n15 / 128);
            Client.cz(Client.as, xq, ScriptFrame.client.getPlane(), max, max2, (int)((max * 128 - n14) * n11), (int)((max2 * 128 - n15) * n11));
            Client.as.gs(n, n2, un.he(), un.da(), n12 / 2, n12 / 2, n10, 256, un.sb(), un.le());
        }
        catch (Exception ex2) {
            Client.nw.debug("minimap", (Throwable)ex2);
        }
        Client.ll(widget, n, n2, (float)Client.xq / 128.0f);
    }
    
    public static void cg(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.jy(n);
        }
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -80714593 - 1] = (byte)(n >> 8);
        final byte[] array2 = buffer.array;
        final int offset2 = buffer.offset - 1516355947;
        buffer.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)n;
        final byte[] array3 = buffer.array;
        final int offset3 = buffer.offset - 234073845;
        buffer.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 24);
        final byte[] array4 = buffer.array;
        final int offset4 = buffer.offset - 759357293;
        buffer.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
    }
    
    abstract void vmethod3238(final Buffer p0, final int p1);
    
    abstract void ab(final ClanChannel p0);
    
    abstract void aq(final ClanChannel p0);
}
