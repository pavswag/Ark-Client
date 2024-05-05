// 
// Decompiled by Procyon v0.5.36
// 

public class VarbitComposition extends DualNode implements net.runelite.api.VarbitComposition
{
    public int endBit;
    static AbstractArchive VarbitDefinition_archive;
    public static EvictingDualNodeHashTable VarbitDefinition_cached;
    public int startBit;
    public int baseVar;
    static final int[] field1651;
    static final int ak = 19136899;
    static final int if = 65536;
    public static final int ag = 19;
    public static final int ax = 15;
    public static byte[][] SpriteBuffer_pixels;
    
    VarbitComposition() {
    }
    
    static {
        VarbitComposition.VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
        field1651 = new int[32];
        int n = 2;
        for (int i = 0; i < 32; ++i) {
            VarbitComposition.field1651[i] = n - 1;
            n += n;
        }
    }
    
    public static void cl(final VarbitComposition varbitComposition, final Buffer buffer) {
        if (varbitComposition == null) {
            varbitComposition.aa(buffer);
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            varbitComposition.decodeNext(buffer, ra, 1719013354);
        }
    }
    
    void ao(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, 2008839740);
        }
    }
    
    public static VarbitComposition at(final int n) {
        final VarbitComposition varbitComposition = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.wr(n);
        if (varbitComposition != null) {
            return varbitComposition;
        }
        final byte[] takeFile = VarbitComposition.VarbitDefinition_archive.takeFile(14, n, (byte)(-33));
        final VarbitComposition varbitComposition2 = new VarbitComposition();
        if (takeFile != null) {
            rt(varbitComposition2, new Buffer(takeFile), -2075712490);
        }
        VarbitComposition.VarbitDefinition_cached.put(varbitComposition2, n);
        return varbitComposition2;
    }
    
    void av(final Buffer buffer, final int n) {
        if (n == 1) {
            this.baseVar = buffer.readUnsignedShort(494943276) * -893309655;
            this.startBit = Buffer.ra(buffer, (byte)7) * 831281458;
            this.endBit = Buffer.ra(buffer, (byte)7) * -285596520;
        }
    }
    
    public int getIndex() {
        return this.baseVar * 470400793;
    }
    
    void ax(final Buffer buffer, final int n) {
        if (n == 1) {
            this.baseVar = buffer.readUnsignedShort(-1582055364) * -893309655;
            this.startBit = Buffer.ra(buffer, (byte)7) * -1466027509;
            this.endBit = Buffer.ra(buffer, (byte)7) * 909304255;
        }
    }
    
    void ay(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, 1907961877);
        }
    }
    
    public static void rt(final VarbitComposition varbitComposition, final Buffer buffer, final int n) {
        Label_0010: {
            if (varbitComposition != null) {
                break Label_0010;
            }
            varbitComposition.decode(buffer, n);
            try {
                while (true) {
                    final int ra = Buffer.ra(buffer, (byte)7);
                    if (ra == 0) {
                        break;
                    }
                    varbitComposition.decodeNext(buffer, ra, 2050323828);
                }
                if (n == -1975223962) {
                    throw new IllegalStateException();
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "hg.aw(" + ')');
            }
        }
    }
    
    void decode(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, 2050323828);
            }
            if (n == -1975223962) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hg.aw(" + ')');
        }
    }
    
    public static VarbitComposition al(final int n) {
        final VarbitComposition varbitComposition = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.wr(n);
        if (varbitComposition != null) {
            return varbitComposition;
        }
        final byte[] takeFile = VarbitComposition.VarbitDefinition_archive.takeFile(14, n, (byte)(-82));
        final VarbitComposition varbitComposition2 = new VarbitComposition();
        if (takeFile != null) {
            rt(varbitComposition2, new Buffer(takeFile), -1240631703);
        }
        VarbitComposition.VarbitDefinition_cached.put(varbitComposition2, n);
        return varbitComposition2;
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2) {
        try {
            if (n == 1) {
                if (n2 <= 1119051334) {
                    return;
                }
                this.baseVar = buffer.readUnsignedShort(-1693677876) * -893309655;
                this.startBit = Buffer.ra(buffer, (byte)7) * -1466027509;
                this.endBit = Buffer.ra(buffer, (byte)7) * 909304255;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hg.ac(" + ')');
        }
    }
    
    public static void au(final AbstractArchive varbitDefinition_archive) {
        VarbitComposition.VarbitDefinition_archive = varbitDefinition_archive;
    }
    
    void aa(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, 1719013354);
        }
    }
    
    public static void ab(final AbstractArchive varbitDefinition_archive) {
        VarbitComposition.VarbitDefinition_archive = varbitDefinition_archive;
    }
    
    public static void aq(final AbstractArchive varbitDefinition_archive) {
        VarbitComposition.VarbitDefinition_archive = varbitDefinition_archive;
    }
    
    void ag(final Buffer buffer, final int n) {
        if (n == 1) {
            this.baseVar = buffer.readUnsignedShort(403959128) * -893309655;
            this.startBit = Buffer.ra(buffer, (byte)7) * -1772347024;
            this.endBit = Buffer.ra(buffer, (byte)7) * 745088788;
        }
    }
    
    public int getLeastSignificantBit() {
        return this.startBit * 1050888611;
    }
    
    public int getMostSignificantBit() {
        return this.endBit * 1130237503;
    }
    
    void ah(final Buffer buffer, final int n) {
        if (n == 1) {
            this.baseVar = buffer.readUnsignedShort(576013569) * -893309655;
            this.startBit = Buffer.ra(buffer, (byte)7) * -1466027509;
            this.endBit = Buffer.ra(buffer, (byte)7) * 909304255;
        }
    }
    
    public static void wq(final Actor actor, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (actor == null) {
            actor.getOverheadText();
        }
        boolean b = true;
        int n7 = 1;
        for (int i = 0; i < 4; ++i) {
            if (actor.hitSplatValues[i] > n5) {
                b = false;
            }
            else {
                n7 = 0;
            }
        }
        int n8 = -1;
        int n9 = -1;
        int n10 = 0;
        if (n >= 0) {
            final HitSplatDefinition method725 = class122.method725(n, (byte)4);
            n9 = 1742391276 * method725.field1678;
            n10 = 292771999 * method725.field1672;
        }
        if (n7 != 0) {
            if (n9 == -1) {
                return;
            }
            n8 = 0;
            int n11 = 0;
            if (n9 == 0) {
                n11 = actor.hitSplatValues[0];
            }
            else if (n9 != 0) {
                n11 = actor.hitSplatTypes[0];
            }
            for (int j = 1; j < 4; ++j) {
                if (n9 == 0) {
                    if (actor.hitSplatValues[j] < n11) {
                        n8 = j;
                        n11 = actor.hitSplatValues[j];
                    }
                }
                else if (n9 && actor.hitSplatTypes[j] < n11) {
                    n8 = j;
                    n11 = actor.hitSplatTypes[j];
                }
            }
            if (n9 && n11 >= n2) {
                return;
            }
        }
        else {
            if (b) {
                actor.hitSplatCount = 0;
            }
            for (int k = 0; k < 4; ++k) {
                final byte hitSplatCount = actor.hitSplatCount;
                actor.hitSplatCount = (byte)((1 + actor.hitSplatCount) % 4);
                if (actor.hitSplatValues[hitSplatCount] <= n5) {
                    n8 = hitSplatCount;
                    break;
                }
            }
        }
        if (n8 < 0) {
            return;
        }
        actor.pathY[n8] = n;
        actor.hitSplatTypes[n8] = n2;
        actor.hitSplatValues2[n8] = n3;
        actor.hitSplatCycles[n8] = n4;
        actor.hitSplatValues[n8] = n5 + n10 + n6;
    }
}
