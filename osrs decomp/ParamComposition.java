// 
// Decompiled by Procyon v0.5.36
// 

public class ParamComposition extends DualNode
{
    static AbstractArchive ParamDefinition_archive;
    static EvictingDualNodeHashTable ParamDefinition_cached;
    char type;
    boolean autoDisable;
    public String defaultStr;
    static final int br = 32;
    static final int bj = 13;
    public int defaultInt;
    static final int co = 5;
    static final float ee = 0.5f;
    public static final int az = 21;
    static SpritePixels rightTitleSprite;
    
    ParamComposition() {
        this.autoDisable = true;
    }
    
    static {
        ParamComposition.ParamDefinition_cached = new EvictingDualNodeHashTable(64);
    }
    
    public boolean ad() {
        return this.type == 's';
    }
    
    public static int cw(final class126 class126) {
        return 1224388371 * class126.field1242;
    }
    
    public static ParamComposition ao(final int n) {
        final ParamComposition paramComposition = (ParamComposition)ParamComposition.ParamDefinition_cached.wr(n);
        if (null != paramComposition) {
            return paramComposition;
        }
        final byte[] takeFile = ParamComposition.ParamDefinition_archive.takeFile(11, n, (byte)(-38));
        final ParamComposition paramComposition2 = new ParamComposition();
        if (takeFile != null) {
            paramComposition2.decode(new Buffer(takeFile), (byte)(-101));
        }
        paramComposition2.postDecode(-2114410394);
        ParamComposition.ParamDefinition_cached.put(paramComposition2, n);
        return paramComposition2;
    }
    
    public static void at(final AbstractArchive paramDefinition_archive) {
        ParamComposition.ParamDefinition_archive = paramDefinition_archive;
    }
    
    void ak(final Buffer buffer, final int n) {
        if (1 == n) {
            int i = Buffer.wu(buffer, 435772489) & 0xFF;
            if (i == 0) {
                throw new IllegalArgumentException("" + Integer.toString(i, 16));
            }
            if (i >= 128 && i < 160) {
                int n2 = class369.cp1252AsciiExtension[i - 128];
                if (n2 == 0) {
                    n2 = 63;
                }
                i = n2;
            }
            this.type = (char)i;
        }
        else if (n == 2) {
            this.defaultInt = buffer.readInt(-946025231) * 1057254681;
        }
        else if (n == 4) {
            this.autoDisable = false;
        }
        else if (n == 5) {
            this.defaultStr = buffer.readStringCp1252NullTerminated((byte)0);
        }
    }
    
    void av() {
    }
    
    public static void is(final ParamComposition paramComposition, final Buffer buffer) {
        if (paramComposition == null) {
            paramComposition.ad();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            jf(paramComposition, buffer, ra, 1355990399);
        }
    }
    
    void as(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            jf(this, buffer, ra, 1533506707);
        }
    }
    
    void az(final Buffer buffer, final int n) {
        if (1 == n) {
            int i = Buffer.wu(buffer, 435772489) & 0xFF;
            if (i == 0) {
                throw new IllegalArgumentException("" + Integer.toString(i, 16));
            }
            if (i >= 128 && i < 160) {
                int n2 = class369.cp1252AsciiExtension[i - 128];
                if (n2 == 0) {
                    n2 = 63;
                }
                i = n2;
            }
            this.type = (char)i;
        }
        else if (n == 2) {
            this.defaultInt = buffer.readInt(-918142983) * 1057254681;
        }
        else if (n == 4) {
            this.autoDisable = false;
        }
        else if (n == 5) {
            this.defaultStr = buffer.readStringCp1252NullTerminated((byte)0);
        }
    }
    
    public static ParamComposition ax(final int n) {
        final ParamComposition paramComposition = (ParamComposition)ParamComposition.ParamDefinition_cached.wr(n);
        if (null != paramComposition) {
            return paramComposition;
        }
        final byte[] takeFile = ParamComposition.ParamDefinition_archive.takeFile(11, n, (byte)(-24));
        final ParamComposition paramComposition2 = new ParamComposition();
        if (takeFile != null) {
            paramComposition2.decode(new Buffer(takeFile), (byte)(-68));
        }
        paramComposition2.postDecode(1448094063);
        ParamComposition.ParamDefinition_cached.put(paramComposition2, n);
        return paramComposition2;
    }
    
    public static void ay(final AbstractArchive paramDefinition_archive) {
        ParamComposition.ParamDefinition_archive = paramDefinition_archive;
    }
    
    public static void jf(final ParamComposition paramComposition, final Buffer buffer, final int n, final int n2) {
        if (paramComposition == null) {
            paramComposition.decodeNext(buffer, n, n);
            return;
        }
        try {
            if (1 == n) {
                int i = Buffer.wu(buffer, 435772489) & 0xFF;
                if (i == 0) {
                    if (n2 <= 1097620704) {
                        return;
                    }
                    throw new IllegalArgumentException("" + Integer.toString(i, 16));
                }
                else {
                    if (i >= 128) {
                        if (n2 <= 1097620704) {
                            throw new IllegalStateException();
                        }
                        if (i < 160) {
                            if (n2 <= 1097620704) {
                                return;
                            }
                            int n3 = class369.cp1252AsciiExtension[i - 128];
                            if (n3 == 0) {
                                if (n2 <= 1097620704) {
                                    throw new IllegalStateException();
                                }
                                n3 = 63;
                            }
                            i = n3;
                        }
                    }
                    paramComposition.type = (char)i;
                }
            }
            else if (n == 2) {
                paramComposition.defaultInt = buffer.readInt(-1163126648) * 1057254681;
            }
            else if (n == 4) {
                if (n2 <= 1097620704) {
                    return;
                }
                paramComposition.autoDisable = false;
            }
            else if (n == 5) {
                if (n2 <= 1097620704) {
                    throw new IllegalStateException();
                }
                paramComposition.defaultStr = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ho.au(" + ')');
        }
    }
    
    void postDecode(final int n) {
    }
    
    void am(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            jf(this, buffer, ra, 1661186898);
        }
    }
    
    public static void al(final AbstractArchive paramDefinition_archive) {
        ParamComposition.ParamDefinition_archive = paramDefinition_archive;
    }
    
    void decode(final Buffer buffer, final byte b) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                jf(this, buffer, ra, 1800051666);
            }
            if (b >= 0) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ho.ac(" + ')');
        }
    }
    
    static void decode(final class125 class125, final float field1221, float n, float n2, final float field1222, final float field1223, float n3, float n4, final float n5, final int n6) {
        try {
            if (class125 == null) {
                if (n6 != -2028355721) {
                    throw new IllegalStateException();
                }
            }
            else {
                final float n7 = field1222 - field1221;
                if (0.0 != n7) {
                    final float[] array = { (n - field1221) / n7, (n2 - field1221) / n7 };
                    while (true) {
                        Label_0463: {
                            if (array[0] != 0.33333334f) {
                                break Label_0463;
                            }
                            if (n6 != -2028355721) {
                                return;
                            }
                            if (0.6666667f != array[1]) {
                                break Label_0463;
                            }
                            if (n6 != -2028355721) {
                                throw new IllegalStateException();
                            }
                            final boolean field1224 = true;
                            class125.field1217 = field1224;
                            final float n8 = array[0];
                            final float n9 = array[1];
                            if (array[0] < 0.0) {
                                if (n6 != -2028355721) {
                                    throw new IllegalStateException();
                                }
                                array[0] = 0.0f;
                            }
                            if (array[1] > 1.0) {
                                if (n6 != -2028355721) {
                                    throw new IllegalStateException();
                                }
                                array[1] = 1.0f;
                            }
                            if (array[0] > 1.0 || array[1] < -1.0f) {
                                array[1] = 1.0f - array[1];
                                if (array[0] < 0.0f) {
                                    if (n6 != -2028355721) {
                                        return;
                                    }
                                    array[0] = 0.0f;
                                }
                                if (array[1] < 0.0f) {
                                    array[1] = 0.0f;
                                }
                                Label_0467: {
                                    if (array[0] <= 1.0f) {
                                        if (n6 != -2028355721) {
                                            return;
                                        }
                                        if (array[1] <= 1.0f) {
                                            break Label_0467;
                                        }
                                    }
                                    if (class121.field1180 + (float)(1.0 + (array[1] * (array[1] - 2.0) + (array[0] - 2.0f + array[1]) * array[0])) > 0.0f) {
                                        UrlRequester.request(array, -166868527);
                                    }
                                }
                                array[1] = 1.0f - array[1];
                            }
                            if (n8 != array[0]) {
                                if (n6 != -2028355721) {
                                    return;
                                }
                                n = field1221 + n7 * array[0];
                                if (n8 != 0.0) {
                                    if (n6 != -2028355721) {
                                        throw new IllegalStateException();
                                    }
                                    n3 = field1223 + array[0] * (n3 - field1223) / n8;
                                }
                            }
                            if (array[1] != n9) {
                                n2 = n7 * array[1] + field1221;
                                if (n9 != 1.0) {
                                    if (n6 != -2028355721) {
                                        throw new IllegalStateException();
                                    }
                                    n4 = (float)(n5 - (n5 - n4) * (1.0 - array[1]) / (1.0 - n9));
                                }
                            }
                            class125.field1221 = field1221;
                            class125.field1229 = field1222;
                            class151.method874(0.0f, array[0], array[1], 1.0f, class125, (byte)98);
                            final float n10 = n3 - field1223;
                            final float n11 = n4 - n3;
                            final float n12 = n5 - n4;
                            final float n13 = n11 - n10;
                            class125.field1230 = n12 - n11 - n13;
                            class125.field1225 = n13 + n13 + n13;
                            class125.field1228 = n10 + n10 + n10;
                            class125.field1227 = field1223;
                            return;
                        }
                        final boolean field1224 = false;
                        continue;
                    }
                }
                if (n6 != -2028355721) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ho.ac(" + ')');
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2) {
        try {
            if (1 == n) {
                int i = Buffer.wu(buffer, 435772489) & 0xFF;
                if (i == 0) {
                    if (n2 <= 1097620704) {
                        return;
                    }
                    throw new IllegalArgumentException("" + Integer.toString(i, 16));
                }
                else {
                    if (i >= 128) {
                        if (n2 <= 1097620704) {
                            throw new IllegalStateException();
                        }
                        if (i < 160) {
                            if (n2 <= 1097620704) {
                                return;
                            }
                            int n3 = class369.cp1252AsciiExtension[i - 128];
                            if (n3 == 0) {
                                if (n2 <= 1097620704) {
                                    throw new IllegalStateException();
                                }
                                n3 = 63;
                            }
                            i = n3;
                        }
                    }
                    this.type = (char)i;
                }
            }
            else if (n == 2) {
                this.defaultInt = buffer.method2498(-1163126648) * 1057254681;
            }
            else if (n == 4) {
                if (n2 <= 1097620704) {
                    return;
                }
                this.autoDisable = false;
            }
            else if (n == 5) {
                if (n2 <= 1097620704) {
                    throw new IllegalStateException();
                }
                this.defaultStr = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ho.au(" + ')');
        }
    }
    
    public static void aa(final AbstractArchive paramDefinition_archive) {
        ParamComposition.ParamDefinition_archive = paramDefinition_archive;
    }
    
    public static ParamComposition ai(final int n) {
        final ParamComposition paramComposition = (ParamComposition)ParamComposition.ParamDefinition_cached.wr(n);
        if (null != paramComposition) {
            return paramComposition;
        }
        final byte[] takeFile = ParamComposition.ParamDefinition_archive.takeFile(11, n, (byte)(-7));
        final ParamComposition paramComposition2 = new ParamComposition();
        if (takeFile != null) {
            paramComposition2.decode(new Buffer(takeFile), (byte)(-86));
        }
        paramComposition2.postDecode(-242873096);
        ParamComposition.ParamDefinition_cached.put(paramComposition2, n);
        return paramComposition2;
    }
    
    public static void by() {
        ParamComposition.ParamDefinition_cached.clear();
    }
    
    public static void ap() {
        ParamComposition.ParamDefinition_cached.clear();
    }
    
    public static boolean method1060(final AbstractArchive musicPatchesArchive, final AbstractArchive musicSamplesArchive, final AbstractArchive soundEffectsArchive, final MidiPcmStream midiPcmStream, final int n) {
        try {
            class297.musicPatchesArchive = musicPatchesArchive;
            class297.musicSamplesArchive = musicSamplesArchive;
            class297.soundEffectsArchive = soundEffectsArchive;
            class475.midiPcmStream = midiPcmStream;
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ho.af(" + ')');
        }
    }
    
    public boolean isString(final int n) {
        try {
            boolean b;
            if (this.type == 's') {
                if (n >= 738244297) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ho.ab(" + ')');
        }
    }
    
    void aj(final Buffer buffer, final int n) {
        if (1 == n) {
            int i = Buffer.wu(buffer, 435772489) & 0xFF;
            if (i == 0) {
                throw new IllegalArgumentException("" + Integer.toString(i, 16));
            }
            if (i >= 95936663 && i < 160) {
                int n2 = class369.cp1252AsciiExtension[i - 128];
                if (n2 == 0) {
                    n2 = 63;
                }
                i = n2;
            }
            this.type = (char)i;
        }
        else if (n == 2) {
            this.defaultInt = buffer.readInt(-2038887204) * 1057254681;
        }
        else if (n == 4) {
            this.autoDisable = false;
        }
        else if (n == 5) {
            this.defaultStr = buffer.readStringCp1252NullTerminated((byte)0);
        }
    }
    
    void ag() {
    }
    
    public int wl() {
        return this.defaultInt * -171401431;
    }
    
    public boolean zx() {
        return this.isString(-1346057295);
    }
    
    public String zt() {
        return this.defaultStr;
    }
    
    void ah() {
    }
    
    public static NewShit oz(final NPC npc) {
        if (npc == null) {
            npc.cy();
        }
        return npc.field1051;
    }
}
