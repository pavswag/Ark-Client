// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator7 extends AbstractUserComparator
{
    public static final int ac = 5;
    static final int as = 1;
    final boolean reversed;
    static final int aw = 8;
    
    public UserComparator7(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-76));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eu.compare(" + ')');
        }
    }
    
    int get3dZoom(final Buddy buddy, final Buddy buddy2) {
        if (0 != 177258591 * buddy.world && 177258591 * buddy2.world != 0) {
            return this.reversed ? (1907692493 * buddy.int2 - buddy2.int2 * 1907692493) : (1907692493 * buddy2.int2 - buddy.int2 * 1907692493);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public static int get3dZoom(final int n) {
        try {
            return Rasterizer3D.clips.field2227 * -1734758735;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eu.at(" + ')');
        }
    }
    
    public static void rl(final class12 class12, final boolean b) {
        if (class12 == null) {
            class12.ag();
        }
    }
    
    static int method694(final int n, final Script script, final boolean b, final int n2) {
        try {
            return 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eu.bv(" + ')');
        }
    }
    
    int aw(final Buddy buddy, final Buddy buddy2) {
        if (0 != 177258591 * buddy.world && 177258591 * buddy2.world != 0) {
            return this.reversed ? (1907692493 * buddy.int2 - buddy2.int2 * 1907692493) : (1907692493 * buddy2.int2 - buddy.int2 * 1907692493);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public int al(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-64));
    }
    
    int an(final Buddy buddy, final Buddy buddy2) {
        if (0 != 177258591 * buddy.world && -272446157 * buddy2.world != 0) {
            return this.reversed ? (-1829128565 * buddy.world - buddy2.rank * -730550804) : (1907692493 * buddy2.rank - buddy.world * 1907692493);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public int au(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)27);
    }
    
    int aa(final Buddy buddy, final Buddy buddy2) {
        if (0 != 177258591 * buddy.world && 177258591 * buddy2.world != 0) {
            return this.reversed ? (661837582 * buddy.int2 - buddy2.int2 * 1907692493) : (1907692493 * buddy2.int2 - buddy.int2 * 1907692493);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    int compareBuddy(final Buddy buddy, final Buddy buddy2, final byte b) {
        try {
            if (0 != 177258591 * buddy.world) {
                if (b >= 32) {
                    throw new IllegalStateException();
                }
                if (177258591 * buddy2.world != 0) {
                    if (b >= 32) {
                        throw new IllegalStateException();
                    }
                    int n;
                    if (this.reversed) {
                        if (b >= 32) {
                            throw new IllegalStateException();
                        }
                        n = 1907692493 * buddy.int2 - buddy2.int2 * 1907692493;
                    }
                    else {
                        n = 1907692493 * buddy2.int2 - buddy.int2 * 1907692493;
                    }
                    return n;
                }
            }
            return this.ao((User)buddy, (User)buddy2, 641920470);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eu.af(" + ')');
        }
    }
    
    public static final int compareBuddy(final double n, final double n2, final double n3) {
        try {
            double n4 = n3;
            double n5 = n3;
            double n6 = n3;
            if (n2 != 0.0) {
                double n7;
                if (n3 < 0.5) {
                    n7 = n3 * (1.0 + n2);
                }
                else {
                    n7 = n3 + n2 - n2 * n3;
                }
                final double n8 = n3 * 2.0 - n7;
                double n9 = 0.3333333333333333 + n;
                if (n9 > 1.0) {
                    --n9;
                }
                double n10 = n - 0.3333333333333333;
                if (n10 < 0.0) {
                    ++n10;
                }
                if (n9 * 6.0 < 1.0) {
                    n4 = 6.0 * (n7 - n8) * n9 + n8;
                }
                else if (2.0 * n9 < 1.0) {
                    n4 = n7;
                }
                else if (n9 * 3.0 < 2.0) {
                    n4 = n8 + (0.6666666666666666 - n9) * (n7 - n8) * 6.0;
                }
                else {
                    n4 = n8;
                }
                if (n * 6.0 < 1.0) {
                    n5 = n8 + 6.0 * (n7 - n8) * n;
                }
                else if (n * 2.0 < 1.0) {
                    n5 = n7;
                }
                else if (3.0 * n < 2.0) {
                    n5 = n8 + 6.0 * ((n7 - n8) * (0.6666666666666666 - n));
                }
                else {
                    n5 = n8;
                }
                if (6.0 * n10 < 1.0) {
                    n6 = 6.0 * (n7 - n8) * n10 + n8;
                }
                else if (2.0 * n10 < 1.0) {
                    n6 = n7;
                }
                else if (n10 * 3.0 < 2.0) {
                    n6 = (0.6666666666666666 - n10) * (n7 - n8) * 6.0 + n8;
                }
                else {
                    n6 = n8;
                }
            }
            return ((int)(256.0 * n5) << 8) + ((int)(256.0 * n4) << 16) + (int)(256.0 * n6);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eu.af(" + ')');
        }
    }
    
    public static int method692(final UserComparator7 userComparator7, final Buddy buddy, final Buddy buddy2) {
        if (userComparator7 == null) {
            return userComparator7.an(buddy, buddy);
        }
        if (0 != 177258591 * buddy.world && -272446157 * buddy2.world != 0) {
            return userComparator7.reversed ? (-1829128565 * buddy.int2 - buddy2.int2 * -730550804) : (1907692493 * buddy2.int2 - buddy.int2 * 1907692493);
        }
        return userComparator7.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    static void method692(final int n, final String str, final int n2) {
        try {
            final int n3 = -2010934433 * Players.Players_count;
            final int[] players_indices = Players.Players_indices;
            boolean b = false;
            final Username username = new Username(str, class70.loginType);
            for (int i = 0; i < n3; ++i) {
                if (n2 == 858993459) {
                    return;
                }
                final Player player = Client.players[players_indices[i]];
                if (null != player) {
                    if (n2 == 858993459) {
                        throw new IllegalStateException();
                    }
                    if (player != MusicPatchNode.localPlayer) {
                        if (n2 == 858993459) {
                            throw new IllegalStateException();
                        }
                        if (null != player.username) {
                            if (n2 == 858993459) {
                                throw new IllegalStateException();
                            }
                            if (player.username.equals(username)) {
                                if (n2 == 858993459) {
                                    throw new IllegalStateException();
                                }
                                if (n == 1) {
                                    if (n2 == 858993459) {
                                        return;
                                    }
                                    final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher, (short)(-2396));
                                    packetBufferNode.packetBuffer.du(0, -126311178);
                                    packetBufferNode.packetBuffer.cq(players_indices[i], (byte)56);
                                    Client.packetWriter.addNode(packetBufferNode, 414135591);
                                }
                                else if (4 == n) {
                                    final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.field2526, Client.packetWriter.isaacCipher, (short)902);
                                    packetBufferNode2.packetBuffer.dp(0, 2064320426);
                                    Buffer.ap(packetBufferNode2.packetBuffer, players_indices[i], (byte)95);
                                    Client.packetWriter.addNode(packetBufferNode2, 414135591);
                                }
                                else if (n == 6) {
                                    if (n2 == 858993459) {
                                        throw new IllegalStateException();
                                    }
                                    final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher, (short)(-14436));
                                    packetBufferNode3.packetBuffer.bu(players_indices[i], (byte)98);
                                    packetBufferNode3.packetBuffer.dp(0, -1602108935);
                                    Client.packetWriter.addNode(packetBufferNode3, 414135591);
                                }
                                else if (n == 7) {
                                    if (n2 == 858993459) {
                                        throw new IllegalStateException();
                                    }
                                    final PacketBufferNode packetBufferNode4 = class330.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher, (short)(-25818));
                                    packetBufferNode4.packetBuffer.ds(players_indices[i], -1152572044);
                                    packetBufferNode4.packetBuffer.eb(0, (byte)(-86));
                                    Client.packetWriter.addNode(packetBufferNode4, 414135591);
                                }
                                b = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (!b) {
                if (n2 == 858993459) {
                    throw new IllegalStateException();
                }
                UserComparator5.addGameMessage(4, "", Strings.gt + str, -397121414);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eu.ky(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-87));
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-43));
    }
    
    public static int eo(final UserComparator7 userComparator7, final Buddy buddy, final Buddy buddy2) {
        if (userComparator7 == null) {
            userComparator7.get3dZoom(buddy, buddy);
        }
        if (0 != -1829783132 * buddy.world && -1438397780 * buddy2.world != 0) {
            return userComparator7.reversed ? (1711560298 * buddy.int2 - buddy2.int2 * 1012634167) : (-275175604 * buddy2.int2 - buddy.int2 * 1907692493);
        }
        return userComparator7.ao((User)buddy, (User)buddy2, 641920470);
    }
}
