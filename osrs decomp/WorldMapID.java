import java.awt.event.FocusEvent;

// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapID
{
    static final WorldMapID field2418;
    static final WorldMapID field2419;
    final int value;
    static final int ab = 3;
    static final int ae = 27;
    public static final int cr = 87;
    static ArchiveDisk masterDisk;
    
    WorldMapID(final int n) {
        this.value = -576222849 * n;
    }
    
    static {
        field2418 = new WorldMapID(0);
        field2419 = new WorldMapID(1);
    }
    
    static boolean updateExternalPlayer(final PacketBuffer packetBuffer, final int n, final int n2) {
        try {
            final int bitsRemaining = packetBuffer.bitsRemaining(2, -1776668599);
            if (bitsRemaining == 0) {
                if (n2 == -869866431) {
                    throw new IllegalStateException();
                }
                if (packetBuffer.bitsRemaining(1, 85325946) != 0) {
                    if (n2 == -869866431) {
                        throw new IllegalStateException();
                    }
                    updateExternalPlayer(packetBuffer, n, 480153681);
                }
                final int bitsRemaining2 = packetBuffer.bitsRemaining(13, -1195878756);
                final int bitsRemaining3 = packetBuffer.bitsRemaining(13, -1817426607);
                boolean b;
                if (packetBuffer.bitsRemaining(1, 54877744) == 1) {
                    if (n2 == -869866431) {
                        throw new IllegalStateException();
                    }
                    b = true;
                }
                else {
                    b = false;
                }
                if (b) {
                    if (n2 == -869866431) {
                        throw new IllegalStateException();
                    }
                    Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
                }
                if (null == Client.players[n]) {
                    final Player[] players = Client.players;
                    final Player player = new Player();
                    players[n] = player;
                    Client.js5Error(n);
                    final Player player2 = player;
                    player2.index = n * -710946309;
                    if (Players.cachedAppearanceBuffer[n] != null) {
                        player2.read(Players.cachedAppearanceBuffer[n], 403299594);
                    }
                    player2.bj = 385564471 * Players.Players_orientations[n];
                    player2.bz = Players.Players_targetIndices[n] * 1052277865;
                    player2.zr(-1);
                    final int n3 = Players.Players_regions[n];
                    final int n4 = n3 >> 28;
                    final int n5 = n3 >> 14 & 0xFF;
                    final int n6 = n3 & 0xFF;
                    player2.da[0] = Players.playerMovementSpeeds[n];
                    player2.plane = -1829675965 * (byte)n4;
                    player2.resetPath(bitsRemaining2 + (n5 << 13) - WorldMapData_0.baseX * -1232093375, bitsRemaining3 + (n6 << 13) - 827352769 * GameObject.baseY, -1736496502);
                    player2.hasMovementPending = false;
                    return true;
                }
                if (n2 == -869866431) {
                    throw new IllegalStateException();
                }
                throw new RuntimeException();
            }
            else if (bitsRemaining != 0) {
                if (n2 == -869866431) {
                    throw new IllegalStateException();
                }
                final int bitsRemaining4 = packetBuffer.bitsRemaining(2, -1417372014);
                final int n7 = Players.Players_regions[n];
                Players.Players_regions[n] = ((bitsRemaining4 + (n7 >> 28) & 0x3) << 28) + (n7 & 0xFFFFFFF);
                return false;
            }
            else {
                if (2 == bitsRemaining) {
                    final int bitsRemaining5 = packetBuffer.bitsRemaining(5, -1644483628);
                    final int n8 = bitsRemaining5 >> 3;
                    final int n9 = bitsRemaining5 & 0x7;
                    final int n10 = Players.Players_regions[n];
                    final int n11 = n8 + (n10 >> 28) & 0x3;
                    int n12 = n10 >> 14 & 0xFF;
                    int n13 = n10 & 0xFF;
                    if (n9 == 0) {
                        --n12;
                        --n13;
                    }
                    if (n9 != 0) {
                        if (n2 == -869866431) {
                            throw new IllegalStateException();
                        }
                        --n13;
                    }
                    if (n9 == 2) {
                        if (n2 == -869866431) {
                            throw new IllegalStateException();
                        }
                        ++n12;
                        --n13;
                    }
                    if (3 == n9) {
                        if (n2 == -869866431) {
                            throw new IllegalStateException();
                        }
                        --n12;
                    }
                    if (n9 == 4) {
                        if (n2 == -869866431) {
                            throw new IllegalStateException();
                        }
                        ++n12;
                    }
                    if (5 == n9) {
                        if (n2 == -869866431) {
                            throw new IllegalStateException();
                        }
                        --n12;
                        ++n13;
                    }
                    if (6 == n9) {
                        if (n2 == -869866431) {
                            throw new IllegalStateException();
                        }
                        ++n13;
                    }
                    if (7 == n9) {
                        ++n12;
                        ++n13;
                    }
                    Players.Players_regions[n] = (n12 << 14) + (n11 << 28) + n13;
                    return false;
                }
                final int bitsRemaining6 = packetBuffer.bitsRemaining(18, -1484294885);
                final int n14 = bitsRemaining6 >> 16;
                final int n15 = bitsRemaining6 >> 8 & 0xFF;
                final int n16 = bitsRemaining6 & 0xFF;
                final int n17 = Players.Players_regions[n];
                Players.Players_regions[n] = (n16 + n17 & 0xFF) + ((((n17 >> 14) + n15 & 0xFF) << 14) + ((n14 + (n17 >> 28) & 0x3) << 28));
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kb.au(" + ')');
        }
    }
    
    static Frames getFrames(final int n, final int n2) {
        try {
            final Frames frames = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.wr(n);
            if (frames != null) {
                return frames;
            }
            final Frames method524 = PendingSpawn.method524(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, -264326412);
            if (method524 != null) {
                if (n2 == 236330078) {
                    throw new IllegalStateException();
                }
                SequenceDefinition.SequenceDefinition_cachedFrames.put(method524, n);
            }
            return method524;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kb.ai(" + ')');
        }
    }
    
    public static void ik(final MouseHandler mouseHandler, final FocusEvent focusEvent) {
        if (mouseHandler == null) {
            mouseHandler.focusLost(focusEvent);
        }
    }
}
