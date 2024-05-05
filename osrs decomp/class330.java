// 
// Decompiled by Procyon v0.5.36
// 

public class class330
{
    static final class330 field3071;
    static final class330 field3072;
    final int field3073;
    final int field3074;
    static final int wb = 2;
    
    class330(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.field3073 = -383400655 * n5;
        this.field3074 = 1549082123 * n6;
    }
    
    static {
        field3071 = new class330(51, 27, 800, 0, 16, 16);
        field3072 = new class330(25, 28, 800, 656, 40, 40);
    }
    
    static int method1846(final byte b) {
        try {
            return Login.loginIndex * 1145608355;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mi.az(" + ')');
        }
    }
    
    static class330[] aw() {
        return new class330[] { class330.field3071, class330.field3072 };
    }
    
    public static PacketBufferNode getPacketBufferNode(final ClientPacket clientPacket, final IsaacCipher isaacCipher, final short n) {
        try {
            final PacketBufferNode method1044 = SpotAnimationDefinition.method1044((byte)0);
            method1044.clientPacket = clientPacket;
            method1044.clientPacketLength = -474143459 * clientPacket.id;
            if (-1 == method1044.clientPacketLength * -1245059367) {
                if (n >= 1132) {
                    throw new IllegalStateException();
                }
                method1044.packetBuffer = new PacketBuffer(260);
            }
            else if (method1044.clientPacketLength * -1245059367 == -2) {
                method1044.packetBuffer = new PacketBuffer(10000);
            }
            else if (method1044.clientPacketLength * -1245059367 <= 18) {
                method1044.packetBuffer = new PacketBuffer(20);
            }
            else if (-1245059367 * method1044.clientPacketLength <= 98) {
                if (n >= 1132) {
                    throw new IllegalStateException();
                }
                method1044.packetBuffer = new PacketBuffer(100);
            }
            else {
                method1044.packetBuffer = new PacketBuffer(260);
            }
            PacketBuffer.np(method1044.packetBuffer, isaacCipher, -1962868632);
            method1044.packetBuffer.writeByteIsaac(1546470819 * method1044.clientPacket.length, (byte)(-107));
            method1044.index = 0;
            return method1044;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mi.an(" + ')');
        }
    }
    
    static class330[] getPacketBufferNode() {
        return new class330[] { class330.field3071, class330.field3072 };
    }
    
    static class330[] readPlayerUpdate() {
        return new class330[] { class330.field3071, class330.field3072 };
    }
    
    static void readPlayerUpdate(final PacketBuffer packetBuffer, final int n, final int n2) {
        try {
            int n3;
            if (packetBuffer.bitsRemaining(1, -1838068044) == 1) {
                if (n2 == 1995081372) {
                    throw new IllegalStateException();
                }
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            final int n4 = n3;
            if (n4 != 0) {
                Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
            }
            final int bitsRemaining = packetBuffer.bitsRemaining(2, -1385119441);
            final Player player = Client.players[n];
            if (bitsRemaining == 0) {
                if (n4 != 0) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    player.hasMovementPending = false;
                }
                else {
                    if (-549033243 * Client.localPlayerIndex != n) {
                        Players.Players_regions[n] = (WorldMapData_0.baseX * -1232093375 + player.cf[0] >> 13 << 14) + (player.plane * -1900490645 << 28) + (player.dy[0] + GameObject.baseY * 827352769 >> 13);
                        if (player.di * -283165269 != -1) {
                            if (n2 == 1995081372) {
                                throw new IllegalStateException();
                            }
                            Players.Players_orientations[n] = player.di * -283165269;
                        }
                        else {
                            Players.Players_orientations[n] = -1751341433 * player.bj;
                        }
                        Players.Players_targetIndices[n] = player.bz * 1005900761;
                        Client.players[n] = null;
                        Client.js5Error(n);
                        if (packetBuffer.bitsRemaining(1, -549893763) != 0) {
                            if (n2 == 1995081372) {
                                throw new IllegalStateException();
                            }
                            WorldMapID.updateExternalPlayer(packetBuffer, n, 93651592);
                        }
                        return;
                    }
                    if (n2 == 1995081372) {
                        return;
                    }
                    throw new RuntimeException();
                }
            }
            else if (bitsRemaining == 1) {
                if (n2 == 1995081372) {
                    throw new IllegalStateException();
                }
                final int bitsRemaining2 = packetBuffer.bitsRemaining(3, 388873533);
                int n5 = player.cf[0];
                int n6 = player.dy[0];
                if (bitsRemaining2 == 0) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    --n5;
                    --n6;
                }
                else if (bitsRemaining2 != 0) {
                    if (n2 == 1995081372) {
                        return;
                    }
                    --n6;
                }
                else if (2 == bitsRemaining2) {
                    ++n5;
                    --n6;
                }
                else if (3 == bitsRemaining2) {
                    if (n2 == 1995081372) {
                        return;
                    }
                    --n5;
                }
                else if (bitsRemaining2 == 4) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    ++n5;
                }
                else if (bitsRemaining2 == 5) {
                    if (n2 == 1995081372) {
                        return;
                    }
                    --n5;
                    ++n6;
                }
                else if (6 == bitsRemaining2) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    ++n6;
                }
                else if (7 == bitsRemaining2) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    ++n5;
                    ++n6;
                }
                Label_1349: {
                    if (n != -549033243 * Client.localPlayerIndex) {
                        break Label_1349;
                    }
                    if (1144428983 * player.br >= 1536 && -411750205 * player.ep >= 1536) {
                        if (n2 == 1995081372) {
                            return;
                        }
                        if (player.br * 1144428983 < 11776) {
                            if (n2 == 1995081372) {
                                throw new IllegalStateException();
                            }
                            if (player.ep * -411750205 < 11776) {
                                break Label_1349;
                            }
                            if (n2 == 1995081372) {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    player.resetPath(n5, n6, -1060497849);
                    player.hasMovementPending = false;
                    return;
                }
                if (n4 == 0) {
                    player.hasMovementPending = false;
                    player.move(n5, n6, Players.playerMovementSpeeds[n], (byte)(-1));
                    return;
                }
                if (n2 == 1995081372) {
                    throw new IllegalStateException();
                }
                player.hasMovementPending = true;
                player.tileX = -700518347 * n5;
                player.tileY = n6 * -1699085727;
            }
            else if (bitsRemaining == 2) {
                if (n2 == 1995081372) {
                    return;
                }
                final int bitsRemaining3 = packetBuffer.bitsRemaining(4, -1597041933);
                int n7 = player.cf[0];
                int n8 = player.dy[0];
                if (bitsRemaining3 == 0) {
                    n7 -= 2;
                    n8 -= 2;
                }
                else if (bitsRemaining3 == 1) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    --n7;
                    n8 -= 2;
                }
                else if (bitsRemaining3 == 2) {
                    n8 -= 2;
                }
                else if (bitsRemaining3 == 3) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    ++n7;
                    n8 -= 2;
                }
                else if (4 == bitsRemaining3) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    n7 += 2;
                    n8 -= 2;
                }
                else if (5 == bitsRemaining3) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    n7 -= 2;
                    --n8;
                }
                else if (bitsRemaining3 == 6) {
                    if (n2 == 1995081372) {
                        return;
                    }
                    n7 += 2;
                    --n8;
                }
                else if (bitsRemaining3 == 7) {
                    if (n2 == 1995081372) {
                        return;
                    }
                    n7 -= 2;
                }
                else if (8 == bitsRemaining3) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    n7 += 2;
                }
                else if (9 == bitsRemaining3) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    n7 -= 2;
                    ++n8;
                }
                else if (10 == bitsRemaining3) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    n7 += 2;
                    ++n8;
                }
                else if (11 == bitsRemaining3) {
                    n7 -= 2;
                    n8 += 2;
                }
                else if (12 == bitsRemaining3) {
                    if (n2 == 1995081372) {
                        return;
                    }
                    --n7;
                    n8 += 2;
                }
                else if (13 == bitsRemaining3) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    n8 += 2;
                }
                else if (bitsRemaining3 == 14) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    ++n7;
                    n8 += 2;
                }
                else if (15 == bitsRemaining3) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    n7 += 2;
                    n8 += 2;
                }
                Label_1376: {
                    if (n == Client.localPlayerIndex * -549033243) {
                        if (n2 == 1995081372) {
                            throw new IllegalStateException();
                        }
                        if (1144428983 * player.br >= 1536 && player.ep * -411750205 >= 1536) {
                            if (n2 == 1995081372) {
                                throw new IllegalStateException();
                            }
                            if (player.br * 1144428983 < 11776) {
                                if (n2 == 1995081372) {
                                    throw new IllegalStateException();
                                }
                                if (player.ep * -411750205 < 11776) {
                                    break Label_1376;
                                }
                            }
                        }
                        player.resetPath(n7, n8, -887988772);
                        player.hasMovementPending = false;
                        return;
                    }
                }
                if (n4 != 0) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n7;
                    player.tileY = -1699085727 * n8;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n7, n8, Players.playerMovementSpeeds[n], (byte)(-111));
                }
            }
            else {
                if (0 != packetBuffer.bitsRemaining(1, -1890954794)) {
                    final int bitsRemaining4 = packetBuffer.bitsRemaining(30, 187616942);
                    final int n9 = bitsRemaining4 >> 28;
                    final int n10 = bitsRemaining4 >> 14 & 0x3FFF;
                    final int n11 = bitsRemaining4 & 0x3FFF;
                    final int n12 = (n10 + (player.cf[0] + -1232093375 * WorldMapData_0.baseX) & 0x3FFF) - -1232093375 * WorldMapData_0.baseX;
                    final int n13 = (n11 + (player.dy[0] + 827352769 * GameObject.baseY) & 0x3FFF) - GameObject.baseY * 827352769;
                    Label_2128: {
                        Label_2066: {
                            if (-549033243 * Client.localPlayerIndex == n) {
                                if (player.br * 1144428983 >= 1536) {
                                    if (n2 == 1995081372) {
                                        throw new IllegalStateException();
                                    }
                                    if (-411750205 * player.ep >= 1536) {
                                        if (n2 == 1995081372) {
                                            return;
                                        }
                                        if (player.br * 1144428983 < 11776) {
                                            if (n2 == 1995081372) {
                                                throw new IllegalStateException();
                                            }
                                            if (player.ep * -411750205 < 11776) {
                                                break Label_2066;
                                            }
                                        }
                                    }
                                }
                                player.resetPath(n12, n13, -736842232);
                                player.hasMovementPending = false;
                                break Label_2128;
                            }
                        }
                        if (n4 != 0) {
                            player.hasMovementPending = true;
                            player.tileX = -700518347 * n12;
                            player.tileY = -1699085727 * n13;
                        }
                        else {
                            player.hasMovementPending = false;
                            player.move(n12, n13, Players.playerMovementSpeeds[n], (byte)8);
                        }
                    }
                    player.plane = -1829675965 * (byte)(n9 + player.plane * -1900490645 & 0x3);
                    if (-549033243 * Client.localPlayerIndex == n) {
                        if (n2 == 1995081372) {
                            return;
                        }
                        GameEngine.Client_plane = player.plane * 1128021573;
                    }
                    return;
                }
                if (n2 == 1995081372) {
                    return;
                }
                final int bitsRemaining5 = packetBuffer.bitsRemaining(12, -351033677);
                final int n14 = bitsRemaining5 >> 10;
                int n15 = bitsRemaining5 >> 5 & 0x1F;
                if (n15 > 15) {
                    if (n2 == 1995081372) {
                        throw new IllegalStateException();
                    }
                    n15 -= 32;
                }
                int n16 = bitsRemaining5 & 0x1F;
                if (n16 > 15) {
                    if (n2 == 1995081372) {
                        return;
                    }
                    n16 -= 32;
                }
                final int n17 = n15 + player.cf[0];
                final int n18 = player.dy[0] + n16;
                while (true) {
                    Label_1784: {
                        if (-549033243 * Client.localPlayerIndex != n) {
                            break Label_1784;
                        }
                        if (n2 == 1995081372) {
                            throw new IllegalStateException();
                        }
                        if (1144428983 * player.br >= 1536) {
                            if (n2 == 1995081372) {
                                throw new IllegalStateException();
                            }
                            if (player.ep * -411750205 >= 1536 && player.br * 1144428983 < 11776) {
                                if (n2 == 1995081372) {
                                    throw new IllegalStateException();
                                }
                                if (-411750205 * player.ep < 11776) {
                                    break Label_1784;
                                }
                                if (n2 == 1995081372) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        player.resetPath(n17, n18, -2116502672);
                        player.hasMovementPending = false;
                        player.plane = (byte)(-1900490645 * player.plane + n14 & 0x3) * -1829675965;
                        if (n == Client.localPlayerIndex * -549033243) {
                            if (n2 == 1995081372) {
                                throw new IllegalStateException();
                            }
                            GameEngine.Client_plane = player.plane * 1128021573;
                        }
                        return;
                    }
                    if (n4 == 0) {
                        player.hasMovementPending = false;
                        player.move(n17, n18, Players.playerMovementSpeeds[n], (byte)(-84));
                        continue;
                    }
                    if (n2 == 1995081372) {
                        return;
                    }
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n17;
                    player.tileY = -1699085727 * n18;
                    continue;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mi.ac(" + ')');
        }
    }
    
    static class330[] au() {
        return new class330[] { class330.field3071, class330.field3072 };
    }
}
