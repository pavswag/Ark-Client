// 
// Decompiled by Procyon v0.5.36
// 

public class Clips
{
    int field2225;
    public boolean field2226;
    public int field2227;
    static final int ac = 128;
    int[] Rasterizer3D_rowOffsets;
    int field2229;
    public TextureLoader Rasterizer3D_textureLoader;
    int field2231;
    int field2232;
    int field2233;
    boolean field2234;
    int clipNegativeMidX;
    int field2236;
    int clipNegativeMidY;
    int field2238;
    static final int au = 512;
    static int selectedSpellWidget;
    public static final int al = 8;
    static final int pl = 2;
    static final int bu = 53;
    
    Clips() {
        this.field2234 = false;
        this.field2226 = true;
        this.field2225 = 0;
        this.field2227 = 1538564608;
        this.Rasterizer3D_rowOffsets = new int[1024];
    }
    
    public void pa(final boolean field2234) {
        this.field2234 = field2234;
    }
    
    public int ma() {
        return this.field2229 * 1666539507;
    }
    
    void at(final int n, final int n2, final int n3, final int n4) {
        this.field2231 = 1695415347 * (n - n2);
        this.field2229 = -1393733317 * (n3 - n4);
        this.clipNegativeMidX = -(this.field2231 * -1402340704);
        this.field2236 = 540333763 * this.field2233 - this.field2231 * -2084847753;
        this.clipNegativeMidY = -(this.field2229 * 756446203);
        this.field2238 = this.field2232 * -1130425185 - this.field2229 * 1303915237;
    }
    
    public static void av(final MidiPcmStream midiPcmStream, final int n, final int n2) {
        if (midiPcmStream == null) {
            midiPcmStream.dx(n, n);
        }
    }
    
    public static void be(final Clips clips) {
        if (clips == null) {
            clips.ac();
        }
        clips.field2231 = 151442000 * (571147771 * clips.field2233 / 2);
        clips.field2229 = clips.field2232 * -1347859351 / 2 * -814991598;
        clips.clipNegativeMidX = -(-1668277193 * clips.field2231);
        clips.field2236 = 115528311 * clips.field2233 - -2084847753 * clips.field2231;
        clips.clipNegativeMidY = -(clips.field2229 * -674673885);
        clips.field2238 = -1093683961 * clips.field2232 - clips.field2229 * 1303915237;
    }
    
    public boolean pe() {
        return this.field2226;
    }
    
    void ay(final int n, final int n2, final int n3) {
        this.field2234 = (n < 0 || n > this.field2233 * 571147771 || n2 < 0 || n2 > this.field2233 * 571147771 || n3 < 0 || n3 > this.field2233 * 571147771);
    }
    
    public static void bv(final Clips clips, final int n, final int n2, final int n3) {
        if (clips == null) {
            clips.ay(n, n, n);
        }
        clips.field2234 = (n < 0 || n > clips.field2233 * 571147771 || n2 < 0 || n2 > clips.field2233 * -809142185 || n3 < 0 || n3 > clips.field2233 * 158778278);
    }
    
    public int ok() {
        return this.clipNegativeMidY * 1380452969;
    }
    
    public int ha() {
        return this.field2225 * 918495667;
    }
    
    void method1360(final int n, final int n2, final int n3, final int n4) {
        try {
            boolean field2234 = false;
            Label_0029: {
                if (n >= 0) {
                    if (n4 == 1077457352) {
                        return;
                    }
                    if (n <= this.field2233 * 571147771 && n2 >= 0) {
                        if (n4 == 1077457352) {
                            return;
                        }
                        if (n2 <= this.field2233 * 571147771) {
                            if (n4 == 1077457352) {
                                throw new IllegalStateException();
                            }
                            if (n3 >= 0) {
                                if (n4 == 1077457352) {
                                    throw new IllegalStateException();
                                }
                                if (n3 <= this.field2233 * 571147771) {
                                    field2234 = false;
                                    break Label_0029;
                                }
                                if (n4 == 1077457352) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                }
                field2234 = true;
            }
            this.field2234 = field2234;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jg.aw(" + ')');
        }
    }
    
    void al(final int n, final int n2, final int n3, final int n4) {
        this.field2231 = -1347394730 * (n - n2);
        this.field2229 = -1393733317 * (n3 - n4);
        this.clipNegativeMidX = -(this.field2231 * -1316298270);
        this.field2236 = 115528311 * this.field2233 - this.field2231 * -1539940010;
        this.clipNegativeMidY = -(this.field2229 * 756446203);
        this.field2238 = this.field2232 * -1130425185 - this.field2229 * 495315592;
    }
    
    public static void lk(final Clips clips) {
        if (clips == null) {
            clips.fi();
        }
        clips.field2231 = -843414824 * (581627574 * clips.field2233 / 2);
        clips.field2229 = clips.field2232 * -1036175734 / 2 * 682141406;
        clips.clipNegativeMidX = -(-1719496509 * clips.field2231);
        clips.field2236 = 115528311 * clips.field2233 - -2084847753 * clips.field2231;
        clips.clipNegativeMidY = -(clips.field2229 * 756446203);
        clips.field2238 = -1130425185 * clips.field2232 - clips.field2229 * 1303915237;
    }
    
    static void method1359(final int n, final ArchiveDisk archiveDisk, final Archive archive, final int n2) {
        try {
            final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
            archiveDiskAction.type = -1330450855;
            archiveDiskAction.hr = n;
            archiveDiskAction.archiveDisk = archiveDisk;
            archiveDiskAction.archive = archive;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
            }
            class124.method741(1442694367);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jg.an(" + ')');
        }
    }
    
    void method1359(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            this.field2231 = 1695415347 * (n - n2);
            this.field2229 = -1393733317 * (n3 - n4);
            this.clipNegativeMidX = -(this.field2231 * -1719496509);
            this.field2236 = 115528311 * this.field2233 - this.field2231 * -2084847753;
            this.clipNegativeMidY = -(this.field2229 * 756446203);
            this.field2238 = this.field2232 * -1130425185 - this.field2229 * 1303915237;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jg.an(" + ')');
        }
    }
    
    void ac() {
        this.clipNegativeMidX = 151442000 * (571147771 * this.field2238 / 2);
        this.field2236 = this.clipNegativeMidY * -1347859351 / 2 * -814991598;
        this.field2231 = -(-1668277193 * this.field2229);
        this.field2229 = 115528311 * this.field2231 - -2084847753 * this.field2229;
        this.field2238 = -(this.clipNegativeMidY * -674673885);
        this.field2229 = -1093683961 * this.field2225 - this.field2225 * 1303915237;
    }
    
    void au() {
        this.field2231 = 1695415347 * (571147771 * this.field2233 / 2);
        this.field2229 = this.field2232 * -1347859351 / 2 * -1393733317;
        this.clipNegativeMidX = -(-1719496509 * this.field2231);
        this.field2236 = 115528311 * this.field2233 - -2084847753 * this.field2231;
        this.clipNegativeMidY = -(this.field2229 * 756446203);
        this.field2238 = -1130425185 * this.field2232 - this.field2229 * 1303915237;
    }
    
    public void kg(final int n) {
        this.field2225 = n * -1087605381;
    }
    
    public int fi() {
        return this.field2236 * -1643027043;
    }
    
    public int ic() {
        return this.field2238 * 1145780727;
    }
    
    public boolean cy() {
        return this.field2234;
    }
    
    void method1358(final byte b) {
        try {
            this.field2231 = 1695415347 * (571147771 * this.field2233 / 2);
            this.field2229 = this.field2232 * -1347859351 / 2 * -1393733317;
            this.clipNegativeMidX = -(-1719496509 * this.field2231);
            this.field2236 = 115528311 * this.field2233 - -2084847753 * this.field2231;
            this.clipNegativeMidY = -(this.field2229 * 756446203);
            this.field2238 = -1130425185 * this.field2232 - this.field2229 * 1303915237;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jg.af(" + ')');
        }
    }
    
    void aq(final int n, final int n2, final int n3, final int n4) {
        this.field2231 = 1695415347 * (n - n2);
        this.field2229 = -1393733317 * (n3 - n4);
        this.clipNegativeMidX = -(this.field2231 * -1719496509);
        this.field2236 = 115528311 * this.field2233 - this.field2231 * -2084847753;
        this.clipNegativeMidY = -(this.field2229 * 756446203);
        this.field2238 = this.field2232 * -1130425185 - this.field2229 * 1303915237;
    }
    
    public int nj() {
        return this.field2227 * -1734758735;
    }
    
    public int qw() {
        return this.clipNegativeMidX * -1346890391;
    }
    
    public void tj(final boolean field2226) {
        this.field2226 = field2226;
    }
    
    public void ug(final int n) {
        this.field2227 = n * 1001249361;
    }
    
    public int kh() {
        return this.field2231 * 93675259;
    }
}
