// 
// Decompiled by Procyon v0.5.36
// 

public class class147 extends class155
{
    static int menuHeight;
    int field1345;
    static ClanChannel field1346;
    static final int co = 10;
    final /* synthetic */ class156 this$0;
    
    class147(final class156 this$0) {
        this.this$0 = this$0;
        this.field1345 = 1937399629;
    }
    
    static final void method837(final byte[] array, final int n, final int n2, final Scene scene, final CollisionMap[] array2, final int n3) {
        try {
            final Buffer buffer = new Buffer(array);
            int n4 = -1;
            while (true) {
                final int method2518 = Buffer.method2518(buffer, (byte)(-44));
                if (method2518 == 0) {
                    if (n3 <= 1034837602) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    n4 += method2518;
                    int n5 = 0;
                    while (true) {
                        final int uShortSmart = buffer.readUShortSmart(-1555573512);
                        if (uShortSmart == 0) {
                            break;
                        }
                        n5 += uShortSmart - 1;
                        final int n6 = n5 & 0x3F;
                        final int n7 = n5 >> 6 & 0x3F;
                        final int n8 = n5 >> 12;
                        final int ra = Buffer.ra(buffer, (byte)7);
                        final int n9 = ra >> 2;
                        final int n10 = ra & 0x3;
                        final int n11 = n7 + n;
                        final int n12 = n6 + n2;
                        if (n11 <= 0) {
                            continue;
                        }
                        if (n3 <= 1034837602) {
                            throw new IllegalStateException();
                        }
                        if (n12 <= 0) {
                            continue;
                        }
                        if (n3 <= 1034837602) {
                            throw new IllegalStateException();
                        }
                        if (n11 >= 103) {
                            continue;
                        }
                        if (n3 <= 1034837602) {
                            throw new IllegalStateException();
                        }
                        if (n12 >= 103) {
                            continue;
                        }
                        if (n3 <= 1034837602) {
                            return;
                        }
                        int n13 = n8;
                        if (0x2 == (Client.gk.oo[1][n11][n12] & 0x2)) {
                            if (n3 <= 1034837602) {
                                throw new IllegalStateException();
                            }
                            --n13;
                        }
                        CollisionMap collisionMap = null;
                        if (n13 >= 0) {
                            collisionMap = array2[n13];
                        }
                        class207.addObjects(n8, n11, n12, n4, n10, n9, scene, collisionMap, -1625886951);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fq.at(" + ')');
        }
    }
    
    public static boolean sz(final Archive archive, final int n) {
        if (archive == null) {
            archive.ah();
        }
        return AbstractArchive.yk(archive, n, 320059254) != null;
    }
    
    @Override
    void aw(final Buffer buffer) {
        this.field1345 = buffer.readUnsignedShort(99167194) * -1937399629;
        Buffer.ra(buffer, (byte)7);
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            Buffer.ks(buffer, (byte)1);
        }
    }
    
    @Override
    void vmethod3239(final ClanChannel clanChannel, final byte b) {
        try {
            clanChannel.removeMember(-1141502341 * this.field1345, (byte)(-27));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fq.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1345 = buffer.readUnsignedShort(-1941828411) * -1937399629;
        Buffer.ra(buffer, (byte)7);
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            Buffer.ks(buffer, (byte)1);
        }
    }
    
    static final int getTileHeight(final int n, final int n2, final int n3, final byte b) {
        try {
            final int n4 = n >> 7;
            final int n5 = n2 >> 7;
            if (n4 >= 0) {
                if (b >= 15) {
                    throw new IllegalStateException();
                }
                if (n5 >= 0) {
                    if (b >= 15) {
                        throw new IllegalStateException();
                    }
                    if (n4 <= 103 && n5 <= 103) {
                        int n6 = n3;
                        if (n6 < 3) {
                            if (b >= 15) {
                                throw new IllegalStateException();
                            }
                            if (0x2 == (Tiles.Tiles_renderFlags[1][n4][n5] & 0x2)) {
                                if (b >= 15) {
                                    throw new IllegalStateException();
                                }
                                ++n6;
                            }
                        }
                        final int n7 = n & 0x7F;
                        final int n8 = n2 & 0x7F;
                        return n8 * (n7 * Tiles.Tiles_heights[n6][n4 + 1][n5 + 1] + Tiles.Tiles_heights[n6][n4][1 + n5] * (128 - n7) >> 7) + (n7 * Tiles.Tiles_heights[n6][1 + n4][n5] + Tiles.Tiles_heights[n6][n4][n5] * (128 - n7) >> 7) * (128 - n8) >> 7;
                    }
                }
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fq.jw(" + ')');
        }
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1345 = buffer.readUnsignedShort(-976324830) * -1937399629;
        Buffer.ra(buffer, (byte)7);
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            Buffer.ks(buffer, (byte)1);
        }
    }
    
    @Override
    void vmethod3238(final Buffer buffer, final int n) {
        try {
            this.field1345 = buffer.readUnsignedShort(-418477728) * -1937399629;
            Buffer.ra(buffer, (byte)7);
            if (Buffer.ra(buffer, (byte)7) != 255) {
                if (n != -1949352075) {
                    throw new IllegalStateException();
                }
                buffer.offset += 1516355947;
                Buffer.ks(buffer, (byte)1);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fq.af(" + ')');
        }
    }
    
    @Override
    void ab(final ClanChannel clanChannel) {
        clanChannel.removeMember(-372360065 * this.field1345, (byte)36);
    }
    
    @Override
    void aq(final ClanChannel clanChannel) {
        clanChannel.removeMember(-1141502341 * this.field1345, (byte)6);
    }
    
    public static void qq(final class424 class424) {
        if (class424 == null) {
            class424.aht();
        }
        synchronized (class424.field3787) {
            if (-2133937525 * class424.field3786 < -1819670561 * class424.field3785 - 1) {
                class424.field3787[(class424.field3786 -= 1968654739) * -2133937525 - 1] = class424;
            }
        }
    }
}
