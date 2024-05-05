// 
// Decompiled by Procyon v0.5.36
// 

public class class422
{
    class422() throws Throwable {
        throw new Error();
    }
    
    static final void updatePlayer(final PacketBuffer packetBuffer, final byte b) {
        try {
            PacketBuffer.jb(packetBuffer, (byte)30);
            final int n = Client.localPlayerIndex * -549033243;
            final Player[] players = Client.players;
            final int n2 = n;
            final Player localPlayer = new Player();
            players[n2] = localPlayer;
            Client.js5Error(n);
            MusicPatchNode.localPlayer = localPlayer;
            final Player player = localPlayer;
            player.index = n * -710946309;
            final int bitsRemaining = packetBuffer.bitsRemaining(30, -654106999);
            final byte b2 = (byte)(bitsRemaining >> 28);
            final int n3 = bitsRemaining >> 14 & 0x3FFF;
            final int n4 = bitsRemaining & 0x3FFF;
            player.cf[0] = n3 - WorldMapData_0.baseX * -1232093375;
            player.br = ((player.cf[0] << 7) + (player.transformedSize((byte)(-83)) << 6)) * -881028089;
            player.dy[0] = n4 - 827352769 * GameObject.baseY;
            player.ep = ((player.dy[0] << 7) + (player.transformedSize((byte)(-17)) << 6)) * 1193213931;
            final Player player2 = player;
            final int plane = b2 * -1829675965;
            player2.plane = plane;
            GameEngine.Client_plane = plane * 1128021573;
            if (null != Players.cachedAppearanceBuffer[n]) {
                if (b >= 8) {
                    throw new IllegalStateException();
                }
                player.read(Players.cachedAppearanceBuffer[n], -1448794473);
            }
            Players.Players_count = 0;
            Players.Players_indices[(Players.Players_count += 511936671) * -2010934433 - 1] = n;
            Players.activityFlags[n] = 0;
            Players.Players_emptyIdxCount = 0;
            for (int i = 1; i < 2048; ++i) {
                if (b >= 8) {
                    return;
                }
                if (i == n) {
                    if (b >= 8) {
                        return;
                    }
                }
                else {
                    final int bitsRemaining2 = packetBuffer.bitsRemaining(18, -1097525919);
                    Players.Players_regions[i] = (bitsRemaining2 >> 16 << 28) + ((bitsRemaining2 >> 8 & 0x255) << 14) + (bitsRemaining2 & 0x255);
                    Players.Players_orientations[i] = 0;
                    Players.Players_targetIndices[i] = -1;
                    Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 2033203949) * 228405989 - 1] = i;
                    Players.activityFlags[i] = 0;
                }
            }
            packetBuffer.exportIndex((byte)(-60));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qi.af(" + ')');
        }
    }
    
    public static int ew(final StructComposition structComposition, final int n, final int n2) {
        final IterableNodeHashTable params = structComposition.params;
        int integer;
        if (params == null) {
            integer = n2;
        }
        else {
            final IntegerNode integerNode = (IntegerNode)params.aa(n);
            if (null == integerNode) {
                integer = n2;
            }
            else {
                integer = integerNode.integer;
            }
        }
        return integer;
    }
    
    public static int bm(final class397 class397, final Object o, final Object o2) {
        if (class397 == null) {
            return class397.compare(o, o);
        }
        return class397.ov(class397, (class399)o, (class399)o2, 1414463712);
    }
}
