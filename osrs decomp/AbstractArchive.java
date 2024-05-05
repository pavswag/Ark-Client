import java.io.InputStream;
import com.google.common.io.CharStreams;
import java.io.InputStreamReader;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;
import java.io.IOException;
import com.google.common.io.ByteStreams;
import net.runelite.api.overlay.OverlayIndex;
import net.runelite.api.IndexDataBase;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class AbstractArchive implements IndexDataBase
{
    static int maximumContainerSize;
    int[][] fileIds;
    int[] groupNameHashes;
    IntHashTable groupNameHashTable;
    int[] groupCrcs;
    public int hash;
    int[] fileCounts;
    int[] groupVersions;
    int[][] fileNameHashes;
    public boolean vj;
    IntHashTable[] fileNameHashTables;
    Object[] groups;
    int[] groupIds;
    static GZipDecompressor gzipDecompressor;
    Object[][] files;
    boolean shallowFiles;
    boolean releaseGroups;
    public Object le;
    int groupCount;
    static final String hs = "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play";
    
    AbstractArchive(final boolean shallowFiles, final boolean releaseGroups) {
        this.shallowFiles = shallowFiles;
        this.releaseGroups = releaseGroups;
    }
    
    static {
        AbstractArchive.gzipDecompressor = new GZipDecompressor();
        AbstractArchive.maximumContainerSize = 0;
    }
    
    public boolean tryLoadGroup(final int n, final int n2) {
        if (n < 0 || n >= this.files.length || null == this.files[n] || n2 < 0 || n2 >= this.files[n].length) {
            return false;
        }
        if (null != this.files[n][n2]) {
            return true;
        }
        if (null != this.groups[n]) {
            return true;
        }
        this.loadGroup(n, -2097873384);
        return null != this.groups[n];
    }
    
    public byte[] dp(final int n) {
        if (this.files.length == 1) {
            return this.takeFile(0, n, (byte)(-75));
        }
        if (this.files[n].length == 1) {
            return this.takeFile(n, 0, (byte)(-102));
        }
        throw new RuntimeException();
    }
    
    public byte[] getFile(final int n, final int n2, final int n3) {
        if (n < 0 || n >= this.files.length || this.files[n] == null || n2 < 0 || n2 >= this.files[n].length) {
            return null;
        }
        Object o = this.files[n][n2];
        if (o == null) {
            synchronized (this) {
                if (this.groups[n] == null) {
                    this.clearGroups(n);
                }
                this.xd(n, null);
                o = this.files[n][n2];
            }
        }
        if (o == null) {
            return null;
        }
        return lb(o, false);
    }
    
    void ad(final int n) {
    }
    
    boolean buildFiles(final int i, final int[] array, final int n) {
        this.eg(i, array);
        try {
            if (this.groups[i] == null) {
                final boolean b = false;
                this.ia(i, array);
                return b;
            }
            final int n2 = this.groupIds[i];
            final int[] array2 = this.fileIds[i];
            final Object[] array3 = this.files[i];
            boolean b2 = true;
            int j = 0;
            while (j < n2) {
                if (n != -2109762247) {
                    throw new IllegalStateException();
                }
                if (array3[array2[j]] == null) {
                    if (n != -2109762247) {
                        throw new IllegalStateException();
                    }
                    b2 = false;
                    break;
                }
                else {
                    ++j;
                }
            }
            if (!b2) {
                byte[] decompressBytes = null;
                Label_0285: {
                    Label_0270: {
                        if (array != null) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            if (0 == array[0]) {
                                if (n != -2109762247) {
                                    throw new IllegalStateException();
                                }
                                if (0 == array[1]) {
                                    if (n != -2109762247) {
                                        throw new IllegalStateException();
                                    }
                                    if (0 == array[2]) {
                                        if (n != -2109762247) {
                                            throw new IllegalStateException();
                                        }
                                        if (array[3] == 0) {
                                            break Label_0270;
                                        }
                                    }
                                }
                            }
                            final byte[] array4 = HealthBarDefinition.decodeNext(this.groups[i], true, 992395884);
                            final Buffer buffer = new Buffer(array4);
                            buffer.xteaDecrypt(array, 5, buffer.array.length, -1350839672);
                            break Label_0285;
                        }
                    }
                    final byte[] array4 = HealthBarDefinition.decodeNext(this.groups[i], false, 1690301649);
                    try {
                        decompressBytes = class13.decompressBytes(array4, -1117233973);
                    }
                    catch (RuntimeException ex2) {
                        final RuntimeException ex = ex2;
                        final StringBuilder append = new StringBuilder().append("");
                        boolean b3;
                        if (null != array) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        throw HealthBar.get(ex, append.append(b3).append(",").append(i).append(",").append(array4.length).append(",").append(class220.method1228(array4, array4.length, (byte)(-125))).append(",").append(class220.method1228(array4, array4.length - 2, (byte)(-115))).append(",").append(this.groupCrcs[i]).append(",").append(this.hash * -159523507).toString());
                    }
                }
                if (this.shallowFiles) {
                    if (n != -2109762247) {
                        throw new IllegalStateException();
                    }
                    this.groups[i] = null;
                }
                if (n2 > 1) {
                    if (n != -2109762247) {
                        throw new IllegalStateException();
                    }
                    int length = decompressBytes.length;
                    final int n3 = decompressBytes[--length] & 0xFF;
                    final int n4 = length - 4 * (n2 * n3);
                    final Buffer buffer2 = new Buffer(decompressBytes);
                    final int[] array5 = new int[n2];
                    buffer2.offset = -1516355947 * n4;
                    for (int k = 0; k < n3; ++k) {
                        if (n != -2109762247) {
                            throw new IllegalStateException();
                        }
                        int n5 = 0;
                        for (int l = 0; l < n2; ++l) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            n5 += buffer2.jn(-1317867063);
                            final int[] array6 = array5;
                            final int n6 = l;
                            array6[n6] += n5;
                        }
                    }
                    final byte[][] array7 = new byte[n2][];
                    for (int n7 = 0; n7 < n2; ++n7) {
                        if (n != -2109762247) {
                            throw new IllegalStateException();
                        }
                        array7[n7] = new byte[array5[n7]];
                        array5[n7] = 0;
                    }
                    buffer2.offset = n4 * -1516355947;
                    int n8 = 0;
                    for (int n9 = 0; n9 < n3; ++n9) {
                        if (n != -2109762247) {
                            throw new IllegalStateException();
                        }
                        int n10 = 0;
                        for (int n11 = 0; n11 < n2; ++n11) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            n10 += buffer2.readShortSmart(-1475434261);
                            System.arraycopy(decompressBytes, n8, array7[n11], array5[n11], n10);
                            final int[] array8 = array5;
                            final int n12 = n11;
                            array8[n12] += n10;
                            n8 += n10;
                        }
                    }
                    for (int n13 = 0; n13 < n2; ++n13) {
                        if (!this.releaseGroups) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            array3[array2[n13]] = class108.vmethod2700(array7[n13], false, 898576795);
                        }
                        else {
                            array3[array2[n13]] = array7[n13];
                        }
                    }
                }
                else if (!this.shallowFiles) {
                    if (n != -2109762247) {
                        throw new IllegalStateException();
                    }
                    array3[array2[0]] = class108.vmethod2700(decompressBytes, false, 753943277);
                }
                else {
                    array3[array2[0]] = decompressBytes;
                }
                final boolean b4 = true;
                this.eg(i, array);
                return b4;
            }
            if (n != -2109762247) {
                throw new IllegalStateException();
            }
            final boolean b5 = true;
            this.eg(i, array);
            return b5;
        }
        catch (RuntimeException ex3) {
            throw HealthBar.get(ex3, "nm.cr(" + ')');
        }
    }
    
    public boolean tryLoadFile(final int n, final int n2, final byte b) {
        synchronized (this) {
            final int n3 = -35;
            boolean b2;
            try {
                if (n >= 0) {
                    if (n3 == 3) {
                        throw new IllegalStateException();
                    }
                    if (n < this.files.length) {
                        if (n3 == 3) {
                            throw new IllegalStateException();
                        }
                        if (null != this.files[n] && n2 >= 0) {
                            if (n3 == 3) {
                                throw new IllegalStateException();
                            }
                            if (n2 >= this.files[n].length) {
                                if (n3 == 3) {
                                    throw new IllegalStateException();
                                }
                            }
                            else if (null != this.files[n][n2]) {
                                if (n3 == 3) {
                                    throw new IllegalStateException();
                                }
                                b2 = true;
                                return b2;
                            }
                            else if (null != this.groups[n]) {
                                if (n3 == 3) {
                                    throw new IllegalStateException();
                                }
                                b2 = true;
                                return b2;
                            }
                            else {
                                this.loadGroup(n, -2127386977);
                                if (null == this.groups[n]) {
                                    b2 = false;
                                    return b2;
                                }
                                if (n3 == 3) {
                                    throw new IllegalStateException();
                                }
                                b2 = true;
                                return b2;
                            }
                        }
                    }
                }
                b2 = false;
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "nm.ce(" + ')');
            }
            return b2;
        }
    }
    
    public byte[] takeFileByNames(String lowerCase, String lowerCase2, final int n) {
        try {
            lowerCase = lowerCase.toLowerCase();
            lowerCase2 = lowerCase2.toLowerCase();
            final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1484453065), -1669080518);
            return this.takeFile(value, this.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 1599141995), 1684338933), (byte)(-113));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cb(" + ')');
        }
    }
    
    public void da() {
        for (int i = 0; i < this.files.length; ++i) {
            if (this.files[i] != null) {
                for (int j = 0; j < this.files[i].length; ++j) {
                    this.files[i][j] = null;
                }
            }
        }
    }
    
    public boolean el(String lowerCase, String lowerCase2) {
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1566672174), 1106630565);
        return this.tryLoadFile(value, this.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 1437289196), -690215282), (byte)4);
    }
    
    public void clearFilesGroup(final int n, final byte b) {
        for (int i = 0; i < this.files[n].length; ++i) {
            if (this.files[n][i] instanceof DirectByteArrayCopier) {
                ((DirectByteArrayCopier)this.files[n][i]).hx();
            }
            this.files[n][i] = null;
        }
    }
    
    public byte[] takeFileFlat(final int n, final byte b) {
        try {
            if (this.files.length == 1) {
                if (b == 2) {
                    throw new IllegalStateException();
                }
                return this.takeFile(0, n, (byte)(-123));
            }
            else {
                if (this.files[n].length == 1) {
                    return this.takeFile(n, 0, (byte)(-48));
                }
                throw new RuntimeException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cn(" + ')');
        }
    }
    
    public byte[] db(final int n, final int n2) {
        if (n >= 0 && n < this.files.length && null != this.files[n] && n2 >= 0 && n2 < this.files[n].length) {
            if (this.files[n][n2] == null && !bo(this, n, null, -2109762247)) {
                this.loadGroup(n, -2116330151);
                if (!bo(this, n, null, -2109762247)) {
                    return null;
                }
            }
            return HealthBarDefinition.decodeNext(this.files[n][n2], false, 996130584);
        }
        return null;
    }
    
    public byte[] dc(final int n, final int n2, final int[] array) {
        if (n < 0 || n >= this.files.length || this.files[n] == null || n2 < 0 || n2 >= this.files[n].length) {
            return null;
        }
        if (null == this.files[n][n2] && !bo(this, n, array, -2109762247)) {
            this.loadGroup(n, -2085061684);
            if (!bo(this, n, array, -2109762247)) {
                return null;
            }
        }
        final byte[] decodeNext = HealthBarDefinition.decodeNext(this.files[n][n2], false, 1740444942);
        if (this.releaseGroups) {
            this.files[n][n2] = null;
        }
        return decodeNext;
    }
    
    public byte[] dc(final int n, final int n2) {
        return this.getFile(n, n2, -606351717);
    }
    
    public byte[] takeFileEncrypted(final int n, final int n2, final int[] array, final int n3) {
        if (n < 0 || n >= this.files.length || this.files[n] == null || n2 < 0 || n2 >= this.files[n].length) {
            return null;
        }
        Object o = this.files[n][n2];
        if (o == null) {
            synchronized (this) {
                if (this.groups[n] == null) {
                    this.clearGroups(n);
                }
                if (!this.xd(n, array)) {
                    return null;
                }
                o = this.files[n][n2];
                if (this.releaseGroups) {
                    this.files[n][n2] = null;
                }
            }
        }
        if (o == null) {
            return null;
        }
        return lb(o, false);
    }
    
    public void clearGroups(final int n) {
        this.loadGroup(n, -1884547323);
    }
    
    public static boolean dn(final AbstractArchive abstractArchive, final int n) {
        if (abstractArchive.files.length == 1) {
            return abstractArchive.tryLoadFile(0, n, (byte)5);
        }
        if (1 == abstractArchive.files[n].length) {
            return abstractArchive.tryLoadFile(n, 0, (byte)(-98));
        }
        throw new RuntimeException();
    }
    
    public void dn() {
        for (int i = 0; i < this.groups.length; ++i) {
            this.groups[i] = null;
        }
    }
    
    public void loadRegionFromName(String lowerCase, final int n) {
        try {
            lowerCase = lowerCase.toLowerCase();
            final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1837625827), -310630090);
            if (value >= 0) {
                this.loadRegionFromGroup(value, -2103539915);
                return;
            }
            if (n == -1348062367) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cw(" + ')');
        }
    }
    
    public boolean isValidFileName(String lowerCase, String lowerCase2, final int n) {
        try {
            lowerCase = lowerCase.toLowerCase();
            lowerCase2 = lowerCase2.toLowerCase();
            final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 130372673), 694114618);
            if (value < 0) {
                if (n != -1313069490) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (this.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 1207681018), -48402496) >= 0) {
                    return true;
                }
                if (n != -1313069490) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cv(" + ')');
        }
    }
    
    public static String mt(final Coord coord) {
        if (coord == null) {
            coord.jl();
        }
        return coord.toString(",", 1308797197);
    }
    
    void ak(final int n) {
    }
    
    public byte[] dw(final int n, final int n2) {
        return this.takeFileEncrypted(n, n2, null, 2078518098);
    }
    
    public static boolean dw(final AbstractArchive abstractArchive, final int n) {
        if (abstractArchive.groups[n] != null) {
            return true;
        }
        abstractArchive.loadGroup(n, -1723895676);
        return null != abstractArchive.groups[n];
    }
    
    public int groupLoadPercentByName(String lowerCase, final int n) {
        try {
            lowerCase = lowerCase.toLowerCase();
            return this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 827030154), -924326194);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cy(" + ')');
        }
    }
    
    void cp(final byte[] array) {
        this.hash = class220.method1228(array, array.length, (byte)(-69)) * -175856763;
        final Buffer buffer = new Buffer(class13.decompressBytes(array, -1117233973));
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra < 5 || ra > 7) {
            throw new RuntimeException("");
        }
        if (ra >= 6) {
            buffer.readInt(-1970055211);
        }
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if (ra >= 7) {
            this.groupCount = buffer.method2541(1641433900) * 1692969259;
        }
        else {
            this.groupCount = buffer.readUnsignedShort(-1177475638) * 1692969259;
        }
        int n = 0;
        int n2 = -1;
        this.groupIds = new int[this.groupCount * -1754346109];
        if (ra >= 7) {
            for (int i = 0; i < -1754346109 * this.groupCount; ++i) {
                n = (this.groupIds[i] = n + buffer.method2541(731079159));
                if (this.groupIds[i] > n2) {
                    n2 = this.groupIds[i];
                }
            }
        }
        else {
            for (int j = 0; j < this.groupCount * -1754346109; ++j) {
                n = (this.groupIds[j] = n + buffer.readUnsignedShort(-1868853025));
                if (this.groupIds[j] > n2) {
                    n2 = this.groupIds[j];
                }
            }
        }
        this.groupCrcs = new int[1 + n2];
        this.groupVersions = new int[1 + n2];
        this.fileCounts = new int[n2 + 1];
        this.fileIds = new int[n2 + 1][];
        this.groups = new Object[1 + n2];
        this.files = new Object[1 + n2][];
        if (ra2 != 0) {
            this.groupNameHashes = new int[n2 + 1];
            for (int k = 0; k < -1754346109 * this.groupCount; ++k) {
                this.groupNameHashes[this.groupIds[k]] = buffer.readInt(-1610152830);
            }
            this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
        }
        for (int l = 0; l < this.groupCount * -1754346109; ++l) {
            this.groupCrcs[this.groupIds[l]] = buffer.readInt(-878130813);
        }
        for (int n3 = 0; n3 < this.groupCount * -1754346109; ++n3) {
            this.groupVersions[this.groupIds[n3]] = buffer.readInt(-1686542259);
        }
        for (int n4 = 0; n4 < this.groupCount * -1754346109; ++n4) {
            this.fileCounts[this.groupIds[n4]] = buffer.readUnsignedShort(-1152237756);
        }
        if (ra >= 7) {
            for (int n5 = 0; n5 < -1754346109 * this.groupCount; ++n5) {
                final int n6 = this.groupIds[n5];
                final int n7 = this.fileCounts[n6];
                int n8 = 0;
                int n9 = -1;
                this.fileIds[n6] = new int[n7];
                for (int n10 = 0; n10 < n7; ++n10) {
                    final int[] array2 = this.fileIds[n6];
                    final int n11 = n10;
                    final int n12 = n8 += buffer.method2541(2005214459);
                    array2[n11] = n12;
                    final int n13 = n12;
                    if (n13 > n9) {
                        n9 = n13;
                    }
                }
                this.files[n6] = new Object[1 + n9];
            }
        }
        else {
            for (int n14 = 0; n14 < -1754346109 * this.groupCount; ++n14) {
                final int n15 = this.groupIds[n14];
                final int n16 = this.fileCounts[n15];
                int n17 = 0;
                int n18 = -1;
                this.fileIds[n15] = new int[n16];
                for (int n19 = 0; n19 < n16; ++n19) {
                    final int[] array3 = this.fileIds[n15];
                    final int n20 = n19;
                    final int n21 = n17 += buffer.readUnsignedShort(803984307);
                    array3[n20] = n21;
                    final int n22 = n21;
                    if (n22 > n18) {
                        n18 = n22;
                    }
                }
                this.files[n15] = new Object[n18 + 1];
            }
        }
        if (ra2 != 0) {
            this.fileNameHashes = new int[1 + n2][];
            this.fileNameHashTables = new IntHashTable[1 + n2];
            for (int n23 = 0; n23 < this.groupCount * -1754346109; ++n23) {
                final int n24 = this.groupIds[n23];
                final int n25 = this.fileCounts[n24];
                this.fileNameHashes[n24] = new int[this.files[n24].length];
                for (int n26 = 0; n26 < n25; ++n26) {
                    this.fileNameHashes[n24][this.fileIds[n24][n26]] = buffer.readInt(-1583125500);
                }
                this.fileNameHashTables[n24] = new IntHashTable(this.fileNameHashes[n24]);
            }
        }
    }
    
    void as(final int n) {
    }
    
    public static boolean kc(final AbstractArchive abstractArchive, final int i, final int[] array) {
        if (abstractArchive.groups[i] == null) {
            return false;
        }
        final int n = abstractArchive.fileCounts[i];
        final int[] array2 = abstractArchive.fileIds[i];
        final Object[] array3 = abstractArchive.files[i];
        boolean b = true;
        for (int j = 0; j < n; ++j) {
            if (array3[array2[j]] == null) {
                b = false;
                break;
            }
        }
        if (b) {
            return true;
        }
        byte[] array4;
        if (array != null && (0 != array[0] || 0 != array[1] || 0 != array[2] || array[3] != 0)) {
            array4 = HealthBarDefinition.decodeNext(abstractArchive.groups[i], true, 1865652819);
            final Buffer buffer = new Buffer(array4);
            buffer.xteaDecrypt(array, 5, buffer.array.length, -1350839672);
        }
        else {
            array4 = HealthBarDefinition.decodeNext(abstractArchive.groups[i], false, 1269108154);
        }
        byte[] decompressBytes;
        try {
            decompressBytes = class13.decompressBytes(array4, -1117233973);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "" + (null != array) + "," + i + "," + array4.length + "," + class220.method1228(array4, array4.length, (byte)(-76)) + "," + class220.method1228(array4, array4.length - 2, (byte)(-95)) + "," + abstractArchive.groupCrcs[i] + "," + abstractArchive.hash * -612458785);
        }
        if (abstractArchive.shallowFiles) {
            abstractArchive.groups[i] = null;
        }
        if (n > 1) {
            int length = decompressBytes.length;
            final int n2 = decompressBytes[--length] & 0xFF;
            final int n3 = length - 4 * (n * n2);
            final Buffer buffer2 = new Buffer(decompressBytes);
            final int[] array5 = new int[n];
            buffer2.offset = -1516355947 * n3;
            for (int k = 0; k < n2; ++k) {
                int n4 = 0;
                for (int l = 0; l < n; ++l) {
                    n4 += buffer2.readInt(-1158395402);
                    final int[] array6 = array5;
                    final int n5 = l;
                    array6[n5] += n4;
                }
            }
            final byte[][] array7 = new byte[n][];
            for (int n6 = 0; n6 < n; ++n6) {
                array7[n6] = new byte[array5[n6]];
                array5[n6] = 0;
            }
            buffer2.offset = n3 * -1516355947;
            int n7 = 0;
            for (int n8 = 0; n8 < n2; ++n8) {
                int n9 = 0;
                for (int n10 = 0; n10 < n; ++n10) {
                    n9 += buffer2.readInt(-1800635982);
                    System.arraycopy(decompressBytes, n7, array7[n10], array5[n10], n9);
                    final int[] array8 = array5;
                    final int n11 = n10;
                    array8[n11] += n9;
                    n7 += n9;
                }
            }
            for (int n12 = 0; n12 < n; ++n12) {
                if (!abstractArchive.releaseGroups) {
                    array3[array2[n12]] = class108.vmethod2700(array7[n12], false, 1307185018);
                }
                else {
                    array3[array2[n12]] = array7[n12];
                }
            }
        }
        else if (!abstractArchive.releaseGroups) {
            array3[array2[0]] = class108.vmethod2700(decompressBytes, false, 1816646364);
        }
        else {
            array3[array2[0]] = decompressBytes;
        }
        return true;
    }
    
    public boolean ev(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.method1889(this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 235221225), -1695524455), 199153288);
    }
    
    public boolean es(String lowerCase, String lowerCase2) {
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1596341578), 1990606555);
        return value >= 0 && this.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 767426970), 819977633) >= 0;
    }
    
    public static int qk(final AbstractArchive abstractArchive, String lowerCase, final int n) {
        if (abstractArchive == null) {
            abstractArchive.groupLoadPercentByName(lowerCase, n);
        }
        try {
            lowerCase = lowerCase.toLowerCase();
            return abstractArchive.groupLoadPercent(abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1707483541), -1894150109), -2021657849);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cj(" + ')');
        }
    }
    
    public static void hd(final AbstractArchive abstractArchive, final byte[] array) {
        if (abstractArchive == null) {
            abstractArchive.cp(array);
        }
        abstractArchive.hash = class220.method1228(array, array.length, (byte)(-36)) * -175856763;
        final Buffer buffer = new Buffer(class13.decompressBytes(array, -1117233973));
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra >= 5 && ra <= 7) {
            if (ra >= 6) {
                buffer.readInt(-1462662351);
            }
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra >= 7) {
                abstractArchive.groupCount = buffer.method2541(623051155) * 1692969259;
            }
            else {
                abstractArchive.groupCount = buffer.readUnsignedShort(530576760) * 1692969259;
            }
            int n = 0;
            int n2 = -1;
            abstractArchive.groupIds = new int[abstractArchive.groupCount * -1754346109];
            if (ra >= 7) {
                for (int i = 0; i < -1754346109 * abstractArchive.groupCount; ++i) {
                    n = (abstractArchive.groupIds[i] = n + buffer.method2541(239990367));
                    if (abstractArchive.groupIds[i] > n2) {
                        n2 = abstractArchive.groupIds[i];
                    }
                }
            }
            else {
                for (int j = 0; j < abstractArchive.groupCount * -1754346109; ++j) {
                    n = (abstractArchive.groupIds[j] = n + buffer.readUnsignedShort(-2133130004));
                    if (abstractArchive.groupIds[j] > n2) {
                        n2 = abstractArchive.groupIds[j];
                    }
                }
            }
            abstractArchive.groupCrcs = new int[1 + n2];
            abstractArchive.groupVersions = new int[1 + n2];
            abstractArchive.fileCounts = new int[n2 + 1];
            abstractArchive.fileIds = new int[n2 + 1][];
            abstractArchive.groups = new Object[1 + n2];
            abstractArchive.files = new Object[1 + n2][];
            if (ra2 != 0) {
                abstractArchive.groupNameHashes = new int[n2 + 1];
                for (int k = 0; k < -1754346109 * abstractArchive.groupCount; ++k) {
                    abstractArchive.groupNameHashes[abstractArchive.groupIds[k]] = buffer.readInt(-1638061572);
                }
                abstractArchive.groupNameHashTable = new IntHashTable(abstractArchive.groupNameHashes);
            }
            for (int l = 0; l < abstractArchive.groupCount * -1754346109; ++l) {
                abstractArchive.groupCrcs[abstractArchive.groupIds[l]] = buffer.readInt(-1345263796);
            }
            for (int n3 = 0; n3 < abstractArchive.groupCount * -1754346109; ++n3) {
                abstractArchive.groupVersions[abstractArchive.groupIds[n3]] = buffer.readInt(-1077636511);
            }
            for (int n4 = 0; n4 < abstractArchive.groupCount * -1754346109; ++n4) {
                abstractArchive.fileCounts[abstractArchive.groupIds[n4]] = buffer.readUnsignedShort(-60864629);
            }
            if (ra >= 7) {
                for (int n5 = 0; n5 < -1754346109 * abstractArchive.groupCount; ++n5) {
                    final int n6 = abstractArchive.groupIds[n5];
                    final int n7 = abstractArchive.fileCounts[n6];
                    int n8 = 0;
                    int n9 = -1;
                    abstractArchive.fileIds[n6] = new int[n7];
                    for (int n10 = 0; n10 < n7; ++n10) {
                        final int[] array2 = abstractArchive.fileIds[n6];
                        final int n11 = n10;
                        final int n12 = n8 += buffer.method2541(1474600737);
                        array2[n11] = n12;
                        final int n13 = n12;
                        if (n13 > n9) {
                            n9 = n13;
                        }
                    }
                    abstractArchive.files[n6] = new Object[1 + n9];
                }
            }
            else {
                for (int n14 = 0; n14 < -1754346109 * abstractArchive.groupCount; ++n14) {
                    final int n15 = abstractArchive.groupIds[n14];
                    final int n16 = abstractArchive.fileCounts[n15];
                    int n17 = 0;
                    int n18 = -1;
                    abstractArchive.fileIds[n15] = new int[n16];
                    for (int n19 = 0; n19 < n16; ++n19) {
                        final int[] array3 = abstractArchive.fileIds[n15];
                        final int n20 = n19;
                        final int n21 = n17 += buffer.readUnsignedShort(151377234);
                        array3[n20] = n21;
                        final int n22 = n21;
                        if (n22 > n18) {
                            n18 = n22;
                        }
                    }
                    abstractArchive.files[n15] = new Object[n18 + 1];
                }
            }
            if (ra2 != 0) {
                abstractArchive.fileNameHashes = new int[1 + n2][];
                abstractArchive.fileNameHashTables = new IntHashTable[1 + n2];
                for (int n23 = 0; n23 < abstractArchive.groupCount * -1754346109; ++n23) {
                    final int n24 = abstractArchive.groupIds[n23];
                    final int n25 = abstractArchive.fileCounts[n24];
                    abstractArchive.fileNameHashes[n24] = new int[abstractArchive.files[n24].length];
                    for (int n26 = 0; n26 < n25; ++n26) {
                        abstractArchive.fileNameHashes[n24][abstractArchive.fileIds[n24][n26]] = buffer.readInt(-910564245);
                    }
                    abstractArchive.fileNameHashTables[n24] = new IntHashTable(abstractArchive.fileNameHashes[n24]);
                }
            }
            return;
        }
        throw new RuntimeException("");
    }
    
    boolean eq(final int i, final int[] array) {
        if (this.groups[i] == null) {
            return false;
        }
        final int n = this.fileCounts[i];
        final int[] array2 = this.fileIds[i];
        final Object[] array3 = this.files[i];
        boolean b = true;
        for (int j = 0; j < n; ++j) {
            if (array3[array2[j]] == null) {
                b = false;
                break;
            }
        }
        if (b) {
            return true;
        }
        byte[] array4;
        if (array != null && (0 != array[0] || 0 != array[1] || 0 != array[2] || array[3] != 0)) {
            array4 = HealthBarDefinition.decodeNext(this.groups[i], true, 714897877);
            final Buffer buffer = new Buffer(array4);
            buffer.xteaDecrypt(array, 5, buffer.array.length, -1350839672);
        }
        else {
            array4 = HealthBarDefinition.decodeNext(this.groups[i], false, 780309641);
        }
        byte[] decompressBytes;
        try {
            decompressBytes = class13.decompressBytes(array4, -1117233973);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "" + (null != array) + "," + i + "," + array4.length + "," + class220.method1228(array4, array4.length, (byte)(-66)) + "," + class220.method1228(array4, array4.length - 2, (byte)(-49)) + "," + this.groupCrcs[i] + "," + this.hash * -159523507);
        }
        if (this.shallowFiles) {
            this.groups[i] = null;
        }
        if (n > 1) {
            int length = decompressBytes.length;
            final int n2 = decompressBytes[--length] & 0xFF;
            final int n3 = length - 4 * (n * n2);
            final Buffer buffer2 = new Buffer(decompressBytes);
            final int[] array5 = new int[n];
            buffer2.offset = -1516355947 * n3;
            for (int k = 0; k < n2; ++k) {
                int n4 = 0;
                for (int l = 0; l < n; ++l) {
                    n4 += buffer2.readInt(-989085731);
                    final int[] array6 = array5;
                    final int n5 = l;
                    array6[n5] += n4;
                }
            }
            final byte[][] array7 = new byte[n][];
            for (int n6 = 0; n6 < n; ++n6) {
                array7[n6] = new byte[array5[n6]];
                array5[n6] = 0;
            }
            buffer2.offset = n3 * -1516355947;
            int n7 = 0;
            for (int n8 = 0; n8 < n2; ++n8) {
                int n9 = 0;
                for (int n10 = 0; n10 < n; ++n10) {
                    n9 += buffer2.readInt(-1415682342);
                    System.arraycopy(decompressBytes, n7, array7[n10], array5[n10], n9);
                    final int[] array8 = array5;
                    final int n11 = n10;
                    array8[n11] += n9;
                    n7 += n9;
                }
            }
            for (int n12 = 0; n12 < n; ++n12) {
                if (!this.releaseGroups) {
                    array3[array2[n12]] = class108.vmethod2700(array7[n12], false, 1517681727);
                }
                else {
                    array3[array2[n12]] = array7[n12];
                }
            }
        }
        else if (!this.releaseGroups) {
            array3[array2[0]] = class108.vmethod2700(decompressBytes, false, 450255419);
        }
        else {
            array3[array2[0]] = decompressBytes;
        }
        return true;
    }
    
    public static byte[] sh(final AbstractArchive abstractArchive, final int n, final byte b) {
        if (abstractArchive == null) {
            return abstractArchive.takeFileFlat(n, b);
        }
        try {
            if (abstractArchive.files.length == 1) {
                if (b == 2) {
                    throw new IllegalStateException();
                }
                return abstractArchive.takeFile(0, n, (byte)(-123));
            }
            else {
                if (abstractArchive.files[n].length == 1) {
                    return abstractArchive.takeFile(n, 0, (byte)(-48));
                }
                throw new RuntimeException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cn(" + ')');
        }
    }
    
    public static boolean sh(final AbstractArchive abstractArchive, String lowerCase, String lowerCase2, final int n) {
        if (abstractArchive == null) {
            return abstractArchive.isValidFileName(lowerCase, lowerCase, n);
        }
        try {
            lowerCase = lowerCase.toLowerCase();
            lowerCase2 = lowerCase2.toLowerCase();
            final int value = abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 130372673), 694114618);
            if (value < 0) {
                if (n != -1313069490) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (abstractArchive.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 1207681018), -48402496) >= 0) {
                    return true;
                }
                if (n != -1313069490) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cv(" + ')');
        }
    }
    
    void az(final int n) {
    }
    
    public void ua(final int n) {
        for (int i = 0; i < this.files.length; ++i) {
            if (this.files[i] != null) {
                for (int j = 0; j < this.files[i].length; ++j) {
                    if (this.files[i][j] instanceof DirectByteArrayCopier) {
                        ((DirectByteArrayCopier)this.files[i][j]).hx();
                    }
                    this.files[i][j] = null;
                }
            }
        }
    }
    
    public int[] getGroupFileIds(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n2 <= 100789159) {
                    throw new IllegalStateException();
                }
                if (n < this.fileNameHashes.length) {
                    return this.fileNameHashes[n];
                }
                if (n2 <= 100789159) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.ck(" + ')');
        }
    }
    
    public static boolean bo(final AbstractArchive abstractArchive, final int i, final int[] array, final int n) {
        if (abstractArchive == null) {
            return abstractArchive.buildFiles(i, array, i);
        }
        abstractArchive.eg(i, array);
        try {
            if (abstractArchive.groups[i] == null) {
                final boolean b = false;
                abstractArchive.ia(i, array);
                return b;
            }
            final int n2 = abstractArchive.fileCounts[i];
            final int[] array2 = abstractArchive.fileIds[i];
            final Object[] array3 = abstractArchive.files[i];
            boolean b2 = true;
            int j = 0;
            while (j < n2) {
                if (n != -2109762247) {
                    throw new IllegalStateException();
                }
                if (array3[array2[j]] == null) {
                    if (n != -2109762247) {
                        throw new IllegalStateException();
                    }
                    b2 = false;
                    break;
                }
                else {
                    ++j;
                }
            }
            if (!b2) {
                byte[] decompressBytes = null;
                Label_0297: {
                    Label_0282: {
                        if (array != null) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            if (0 == array[0]) {
                                if (n != -2109762247) {
                                    throw new IllegalStateException();
                                }
                                if (0 == array[1]) {
                                    if (n != -2109762247) {
                                        throw new IllegalStateException();
                                    }
                                    if (0 == array[2]) {
                                        if (n != -2109762247) {
                                            throw new IllegalStateException();
                                        }
                                        if (array[3] == 0) {
                                            break Label_0282;
                                        }
                                    }
                                }
                            }
                            final byte[] array4 = HealthBarDefinition.decodeNext(abstractArchive.groups[i], true, 992395884);
                            final Buffer buffer = new Buffer(array4);
                            buffer.xteaDecrypt(array, 5, buffer.array.length, -1350839672);
                            break Label_0297;
                        }
                    }
                    final byte[] array4 = HealthBarDefinition.decodeNext(abstractArchive.groups[i], false, 1690301649);
                    try {
                        decompressBytes = class13.decompressBytes(array4, -1117233973);
                    }
                    catch (RuntimeException ex2) {
                        final RuntimeException ex = ex2;
                        final StringBuilder append = new StringBuilder().append("");
                        boolean b3;
                        if (null != array) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        throw HealthBar.get(ex, append.append(b3).append(",").append(i).append(",").append(array4.length).append(",").append(class220.method1228(array4, array4.length, (byte)(-125))).append(",").append(class220.method1228(array4, array4.length - 2, (byte)(-115))).append(",").append(abstractArchive.groupCrcs[i]).append(",").append(abstractArchive.hash * -159523507).toString());
                    }
                }
                if (abstractArchive.shallowFiles) {
                    if (n != -2109762247) {
                        throw new IllegalStateException();
                    }
                    abstractArchive.groups[i] = null;
                }
                if (n2 > 1) {
                    if (n != -2109762247) {
                        throw new IllegalStateException();
                    }
                    int length = decompressBytes.length;
                    final int n3 = decompressBytes[--length] & 0xFF;
                    final int n4 = length - 4 * (n2 * n3);
                    final Buffer buffer2 = new Buffer(decompressBytes);
                    final int[] array5 = new int[n2];
                    buffer2.offset = -1516355947 * n4;
                    for (int k = 0; k < n3; ++k) {
                        if (n != -2109762247) {
                            throw new IllegalStateException();
                        }
                        int n5 = 0;
                        for (int l = 0; l < n2; ++l) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            n5 += buffer2.readInt(-1317867063);
                            final int[] array6 = array5;
                            final int n6 = l;
                            array6[n6] += n5;
                        }
                    }
                    final byte[][] array7 = new byte[n2][];
                    for (int n7 = 0; n7 < n2; ++n7) {
                        if (n != -2109762247) {
                            throw new IllegalStateException();
                        }
                        array7[n7] = new byte[array5[n7]];
                        array5[n7] = 0;
                    }
                    buffer2.offset = n4 * -1516355947;
                    int n8 = 0;
                    for (int n9 = 0; n9 < n3; ++n9) {
                        if (n != -2109762247) {
                            throw new IllegalStateException();
                        }
                        int n10 = 0;
                        for (int n11 = 0; n11 < n2; ++n11) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            n10 += buffer2.readInt(-1475434261);
                            System.arraycopy(decompressBytes, n8, array7[n11], array5[n11], n10);
                            final int[] array8 = array5;
                            final int n12 = n11;
                            array8[n12] += n10;
                            n8 += n10;
                        }
                    }
                    for (int n13 = 0; n13 < n2; ++n13) {
                        if (!abstractArchive.releaseGroups) {
                            if (n != -2109762247) {
                                throw new IllegalStateException();
                            }
                            array3[array2[n13]] = class108.vmethod2700(array7[n13], false, 898576795);
                        }
                        else {
                            array3[array2[n13]] = array7[n13];
                        }
                    }
                }
                else if (!abstractArchive.releaseGroups) {
                    if (n != -2109762247) {
                        throw new IllegalStateException();
                    }
                    array3[array2[0]] = class108.vmethod2700(decompressBytes, false, 753943277);
                }
                else {
                    array3[array2[0]] = decompressBytes;
                }
                final boolean b4 = true;
                abstractArchive.ia(i, array);
                return b4;
            }
            if (n != -2109762247) {
                throw new IllegalStateException();
            }
            final boolean b5 = true;
            abstractArchive.ia(i, array);
            return b5;
        }
        catch (RuntimeException ex3) {
            throw HealthBar.get(ex3, "nm.cr(" + ')');
        }
    }
    
    public boolean di(final int n, final int n2) {
        try {
            if (this.files.length == 1) {
                if (n2 != 953853219) {
                    throw new IllegalStateException();
                }
                return this.tryLoadFile(0, n, (byte)(-21));
            }
            else {
                if (1 != this.files[n].length) {
                    throw new RuntimeException();
                }
                if (n2 != 953853219) {
                    throw new IllegalStateException();
                }
                return this.tryLoadFile(n, 0, (byte)(-8));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.ci(" + ')');
        }
    }
    
    public static byte[] ui(final AbstractArchive abstractArchive, String lowerCase, String lowerCase2, final int n) {
        if (abstractArchive == null) {
            abstractArchive.takeFileByNames(lowerCase, lowerCase, n);
        }
        try {
            lowerCase = lowerCase.toLowerCase();
            lowerCase2 = lowerCase2.toLowerCase();
            final int value = abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1484453065), -1669080518);
            return abstractArchive.takeFile(value, abstractArchive.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 1599141995), 1684338933), (byte)(-113));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cb(" + ')');
        }
    }
    
    public boolean isFullyLoaded(final short n) {
        try {
            boolean b = true;
            for (int i = 0; i < this.groupIds.length; ++i) {
                if (n != 128) {
                    throw new IllegalStateException();
                }
                final int n2 = this.groupIds[i];
                if (null == this.groups[n2]) {
                    if (n != 128) {
                        throw new IllegalStateException();
                    }
                    this.loadGroup(n2, -1834872375);
                    if (null == this.groups[n2]) {
                        if (n != 128) {
                            throw new IllegalStateException();
                        }
                        b = false;
                    }
                }
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cc(" + ')');
        }
    }
    
    public boolean dv(final int n) {
        if (this.groups[n] != null) {
            return true;
        }
        this.loadGroup(n, -2132778146);
        return null != this.groups[n];
    }
    
    int bt(final int n) {
        if (null != this.groups[n]) {
            return 100;
        }
        return 0;
    }
    
    public void ds() {
        for (int i = 0; i < this.files.length; ++i) {
            if (this.files[i] != null) {
                for (int j = 0; j < this.files[i].length; ++j) {
                    this.files[i][j] = null;
                }
            }
        }
    }
    
    public byte[] dh(final int n) {
        if (this.files.length == 1) {
            return this.takeFile(0, n, (byte)(-16));
        }
        if (this.files[n].length == 1) {
            return this.takeFile(n, 0, (byte)(-38));
        }
        throw new RuntimeException();
    }
    
    void decodeIndex(final byte[] array, final byte b) {
        try {
            this.hash = class220.method1228(array, array.length, (byte)(-5)) * -175856763;
            final Buffer buffer = new Buffer(class13.decompressBytes(array, -1117233973));
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra >= 5) {
                if (b != 104) {
                    throw new IllegalStateException();
                }
                if (ra <= 7) {
                    if (ra >= 6) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        buffer.readVarInt(-1255336140);
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    if (ra >= 7) {
                        if (b != 104) {
                            return;
                        }
                        this.groupCount = buffer.method2518(714180890) * 1692969259;
                    }
                    else {
                        this.groupCount = buffer._readUnsignedByteSub(-675267339) * 1692969259;
                    }
                    int n = 0;
                    int n2 = -1;
                    this.groupIds = new int[this.groupCount * -1754346109];
                    if (ra >= 7) {
                        if (b != 104) {
                            return;
                        }
                        for (int i = 0; i < -1754346109 * this.groupCount; ++i) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            n = (this.groupVersions[i] = n + buffer.readUnsignedShort(436410285));
                            if (this.groupCrcs[i] > n2) {
                                if (b != 104) {
                                    throw new IllegalStateException();
                                }
                                n2 = this.groupCrcs[i];
                            }
                        }
                    }
                    else {
                        for (int j = 0; j < this.groupCount * -1754346109; ++j) {
                            if (b != 104) {
                                return;
                            }
                            n = (this.groupNameHashes[j] = n + buffer.readUShortSmart(-969585391));
                            if (this.groupCrcs[j] > n2) {
                                n2 = this.groupCrcs[j];
                            }
                        }
                    }
                    this.groupIds = new int[1 + n2];
                    this.fileCounts = new int[1 + n2];
                    this.groupNameHashes = new int[n2 + 1];
                    this.fileNameHashes = new int[n2 + 1][];
                    this.groups = new Object[1 + n2];
                    this.files = new Object[1 + n2][];
                    if (ra2 != 0) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        this.groupCrcs = new int[n2 + 1];
                        for (int k = 0; k < -1754346109 * this.groupCount; ++k) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            this.groupIds[this.fileCounts[k]] = buffer.readVarInt(-1309175100);
                        }
                        this.groupNameHashTable = new IntHashTable(this.fileCounts);
                    }
                    for (int l = 0; l < this.groupCount * -1754346109; ++l) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        this.groupNameHashes[this.groupNameHashes[l]] = buffer.readUnsignedShort(-2087180508);
                    }
                    for (int n3 = 0; n3 < this.groupCount * -1754346109; ++n3) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        this.groupIds[this.groupNameHashes[n3]] = buffer.jn(-1463194794);
                    }
                    for (int n4 = 0; n4 < this.groupCount * -1754346109; ++n4) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        this.groupIds[this.groupNameHashes[n4]] = buffer.readInt(-1288330663);
                    }
                    if (ra >= 7) {
                        if (b != 104) {
                            return;
                        }
                        for (int n5 = 0; n5 < -1754346109 * this.groupCount; ++n5) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            final int n6 = this.groupCrcs[n5];
                            final int n7 = this.groupVersions[n6];
                            int n8 = 0;
                            int n9 = -1;
                            this.fileNameHashes[n6] = new int[n7];
                            for (int n10 = 0; n10 < n7; ++n10) {
                                final int[] array2 = this.fileNameHashes[n6];
                                final int n11 = n10;
                                final int n12 = n8 += buffer.readInt(835405681);
                                array2[n11] = n12;
                                final int n13 = n12;
                                if (n13 > n9) {
                                    if (b != 104) {
                                        return;
                                    }
                                    n9 = n13;
                                }
                            }
                            this.files[n6] = new Object[1 + n9];
                        }
                    }
                    else {
                        for (int n14 = 0; n14 < -1754346109 * this.groupCount; ++n14) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            final int n15 = this.groupVersions[n14];
                            final int n16 = this.groupVersions[n15];
                            int n17 = 0;
                            int n18 = -1;
                            this.fileIds[n15] = new int[n16];
                            for (int n19 = 0; n19 < n16; ++n19) {
                                if (b != 104) {
                                    throw new IllegalStateException();
                                }
                                final int[] array3 = this.fileIds[n15];
                                final int n20 = n19;
                                final int n21 = n17 += buffer.readShortSmart(-1578757249);
                                array3[n20] = n21;
                                final int n22 = n21;
                                if (n22 > n18) {
                                    if (b != 104) {
                                        return;
                                    }
                                    n18 = n22;
                                }
                            }
                            this.files[n15] = new Object[n18 + 1];
                        }
                    }
                    if (ra2 != 0) {
                        this.fileIds = new int[1 + n2][];
                        this.fileNameHashTables = new IntHashTable[1 + n2];
                        for (int n23 = 0; n23 < this.groupCount * -1754346109; ++n23) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            final int n24 = this.groupIds[n23];
                            final int n25 = this.groupVersions[n24];
                            this.fileNameHashes[n24] = new int[this.files[n24].length];
                            for (int n26 = 0; n26 < n25; ++n26) {
                                this.fileNameHashes[n24][this.fileNameHashes[n24][n26]] = buffer.method2513(-1705050856);
                            }
                            this.fileNameHashTables[n24] = new IntHashTable(this.fileIds[n24]);
                        }
                    }
                    return;
                }
                if (b != 104) {
                    throw new IllegalStateException();
                }
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.bc(" + ')');
        }
    }
    
    public void ia(final int n, final int[] array) {
        if (this.shallowFiles && this.groups[n] == null && this.le instanceof DirectByteArrayCopier) {
            ((DirectByteArrayCopier)this.le).hx();
        }
        this.le = null;
    }
    
    public static void tz(final AbstractArchive abstractArchive, final byte[] array) {
        if (abstractArchive == null) {
            abstractArchive.dm(array);
            return;
        }
        abstractArchive.hash = class220.method1228(array, array.length, (byte)(-36)) * -175856763;
        final Buffer buffer = new Buffer(class13.decompressBytes(array, -1117233973));
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra < 5 || ra > 7) {
            throw new RuntimeException("");
        }
        if (ra >= 6) {
            buffer.readInt(-1719929798);
        }
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if (ra >= 7) {
            abstractArchive.groupCount = buffer.method2541(460541294) * 1692969259;
        }
        else {
            abstractArchive.groupCount = buffer.readUnsignedShort(634653042) * 1692969259;
        }
        int n = 0;
        int n2 = -1;
        abstractArchive.groupIds = new int[abstractArchive.groupCount * -1754346109];
        if (ra >= 7) {
            for (int i = 0; i < -1754346109 * abstractArchive.groupCount; ++i) {
                n = (abstractArchive.groupIds[i] = n + buffer.method2541(357759643));
                if (abstractArchive.groupIds[i] > n2) {
                    n2 = abstractArchive.groupIds[i];
                }
            }
        }
        else {
            for (int j = 0; j < abstractArchive.groupCount * -1754346109; ++j) {
                n = (abstractArchive.groupIds[j] = n + buffer.readUnsignedShort(238078309));
                if (abstractArchive.groupIds[j] > n2) {
                    n2 = abstractArchive.groupIds[j];
                }
            }
        }
        abstractArchive.groupCrcs = new int[1 + n2];
        abstractArchive.groupVersions = new int[1 + n2];
        abstractArchive.fileCounts = new int[n2 + 1];
        abstractArchive.fileIds = new int[n2 + 1][];
        abstractArchive.groups = new Object[1 + n2];
        abstractArchive.files = new Object[1 + n2][];
        if (ra2 != 0) {
            abstractArchive.groupNameHashes = new int[n2 + 1];
            for (int k = 0; k < -1754346109 * abstractArchive.groupCount; ++k) {
                abstractArchive.groupNameHashes[abstractArchive.groupIds[k]] = buffer.readInt(-949258250);
            }
            abstractArchive.groupNameHashTable = new IntHashTable(abstractArchive.groupNameHashes);
        }
        for (int l = 0; l < abstractArchive.groupCount * -1754346109; ++l) {
            abstractArchive.groupCrcs[abstractArchive.groupIds[l]] = buffer.readInt(-1875338228);
        }
        for (int n3 = 0; n3 < abstractArchive.groupCount * -1754346109; ++n3) {
            abstractArchive.groupVersions[abstractArchive.groupIds[n3]] = buffer.readInt(-903723973);
        }
        for (int n4 = 0; n4 < abstractArchive.groupCount * -1754346109; ++n4) {
            abstractArchive.fileCounts[abstractArchive.groupIds[n4]] = buffer.readUnsignedShort(-869365980);
        }
        if (ra >= 7) {
            for (int n5 = 0; n5 < -1754346109 * abstractArchive.groupCount; ++n5) {
                final int n6 = abstractArchive.groupIds[n5];
                final int n7 = abstractArchive.fileCounts[n6];
                int n8 = 0;
                int n9 = -1;
                abstractArchive.fileIds[n6] = new int[n7];
                for (int n10 = 0; n10 < n7; ++n10) {
                    final int[] array2 = abstractArchive.fileIds[n6];
                    final int n11 = n10;
                    final int n12 = n8 += buffer.method2541(1535037708);
                    array2[n11] = n12;
                    final int n13 = n12;
                    if (n13 > n9) {
                        n9 = n13;
                    }
                }
                abstractArchive.files[n6] = new Object[1 + n9];
            }
        }
        else {
            for (int n14 = 0; n14 < -1754346109 * abstractArchive.groupCount; ++n14) {
                final int n15 = abstractArchive.groupIds[n14];
                final int n16 = abstractArchive.fileCounts[n15];
                int n17 = 0;
                int n18 = -1;
                abstractArchive.fileIds[n15] = new int[n16];
                for (int n19 = 0; n19 < n16; ++n19) {
                    final int[] array3 = abstractArchive.fileIds[n15];
                    final int n20 = n19;
                    final int n21 = n17 += buffer.readUnsignedShort(-755376672);
                    array3[n20] = n21;
                    final int n22 = n21;
                    if (n22 > n18) {
                        n18 = n22;
                    }
                }
                abstractArchive.files[n15] = new Object[n18 + 1];
            }
        }
        if (ra2 != 0) {
            abstractArchive.fileNameHashes = new int[1 + n2][];
            abstractArchive.fileNameHashTables = new IntHashTable[1 + n2];
            for (int n23 = 0; n23 < abstractArchive.groupCount * -1754346109; ++n23) {
                final int n24 = abstractArchive.groupIds[n23];
                final int n25 = abstractArchive.fileCounts[n24];
                abstractArchive.fileNameHashes[n24] = new int[abstractArchive.files[n24].length];
                for (int n26 = 0; n26 < n25; ++n26) {
                    abstractArchive.fileNameHashes[n24][abstractArchive.fileIds[n24][n26]] = buffer.readInt(-2134813579);
                }
                abstractArchive.fileNameHashTables[n24] = new IntHashTable(abstractArchive.fileNameHashes[n24]);
            }
        }
    }
    
    public boolean method1889(final int n, final int n2) {
        synchronized (this) {
            final int n3 = 1653429081;
            boolean b;
            try {
                if (this.groups[n] != null) {
                    if (n3 == 12434877) {
                        throw new IllegalStateException();
                    }
                    b = true;
                }
                else {
                    this.loadGroup(n, -2013494015);
                    if (null != this.groups[n]) {
                        if (n3 == 12434877) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "nm.cs(" + ')');
            }
            return b;
        }
    }
    
    void loadRegionFromGroup(final int n, final int n2) {
    }
    
    public byte[] df(final int n) {
        if (1 == this.files.length) {
            return this.getFile(0, n, -606351717);
        }
        if (1 == this.files[n].length) {
            return this.getFile(n, 0, -606351717);
        }
        throw new RuntimeException();
    }
    
    public static int getFileFlat(final AbstractArchive abstractArchive, String lowerCase, final int n) {
        if (abstractArchive == null) {
            abstractArchive.getGroupId(lowerCase, n);
        }
        try {
            lowerCase = lowerCase.toLowerCase();
            return abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 827030154), -924326194);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cy(" + ')');
        }
    }
    
    public byte[] getFileFlat(final int n, final int n2) {
        if (n >= 0 && n < this.files.length && null != this.files[n] && n2 >= 0 && n2 < this.files[n].length) {
            if (this.files[n][n2] == null && !bo(this, n, null, -2109762247)) {
                this.loadRegionFromGroup(n, -2116330151);
                if (!bo(this, n, null, -2109762247)) {
                    return null;
                }
            }
            return HealthBarDefinition.decodeNext(this.files[n][n2], false, 996130584);
        }
        return null;
    }
    
    void dm(final byte[] array) {
        this.hash = class220.method1228(array, array.length, (byte)(-46)) * -175856763;
        final Buffer buffer = new Buffer(class13.decompressBytes(array, -1117233973));
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra < 5 || ra > 7) {
            throw new RuntimeException("");
        }
        if (ra >= 6) {
            buffer.readInt(-961816597);
        }
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if (ra >= 7) {
            this.groupCount = buffer.method2541(1949486244) * 1692969259;
        }
        else {
            this.groupCount = buffer.readUnsignedShort(-292108770) * 1692969259;
        }
        int n = 0;
        int n2 = -1;
        this.groupIds = new int[this.groupCount * -1754346109];
        if (ra >= 7) {
            for (int i = 0; i < -1754346109 * this.groupCount; ++i) {
                n = (this.groupIds[i] = n + buffer.method2541(619852198));
                if (this.groupIds[i] > n2) {
                    n2 = this.groupIds[i];
                }
            }
        }
        else {
            for (int j = 0; j < this.groupCount * -1754346109; ++j) {
                n = (this.groupIds[j] = n + buffer.readUnsignedShort(-118000344));
                if (this.groupIds[j] > n2) {
                    n2 = this.groupIds[j];
                }
            }
        }
        this.groupCrcs = new int[1 + n2];
        this.groupVersions = new int[1 + n2];
        this.fileCounts = new int[n2 + 1];
        this.fileIds = new int[n2 + 1][];
        this.groups = new Object[1 + n2];
        this.files = new Object[1 + n2][];
        if (ra2 != 0) {
            this.groupNameHashes = new int[n2 + 1];
            for (int k = 0; k < -1754346109 * this.groupCount; ++k) {
                this.groupNameHashes[this.groupIds[k]] = buffer.readInt(-1673257423);
            }
            this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
        }
        for (int l = 0; l < this.groupCount * -1754346109; ++l) {
            this.groupCrcs[this.groupIds[l]] = buffer.readInt(-1988960964);
        }
        for (int n3 = 0; n3 < this.groupCount * -1754346109; ++n3) {
            this.groupVersions[this.groupIds[n3]] = buffer.readInt(-1804561683);
        }
        for (int n4 = 0; n4 < this.groupCount * -1754346109; ++n4) {
            this.fileCounts[this.groupIds[n4]] = buffer.readUnsignedShort(392027868);
        }
        if (ra >= 7) {
            for (int n5 = 0; n5 < -1754346109 * this.groupCount; ++n5) {
                final int n6 = this.groupIds[n5];
                final int n7 = this.fileCounts[n6];
                int n8 = 0;
                int n9 = -1;
                this.fileIds[n6] = new int[n7];
                for (int n10 = 0; n10 < n7; ++n10) {
                    final int[] array2 = this.fileIds[n6];
                    final int n11 = n10;
                    final int n12 = n8 += buffer.method2541(1813801302);
                    array2[n11] = n12;
                    final int n13 = n12;
                    if (n13 > n9) {
                        n9 = n13;
                    }
                }
                this.files[n6] = new Object[1 + n9];
            }
        }
        else {
            for (int n14 = 0; n14 < -1754346109 * this.groupCount; ++n14) {
                final int n15 = this.groupIds[n14];
                final int n16 = this.fileCounts[n15];
                int n17 = 0;
                int n18 = -1;
                this.fileIds[n15] = new int[n16];
                for (int n19 = 0; n19 < n16; ++n19) {
                    final int[] array3 = this.fileIds[n15];
                    final int n20 = n19;
                    final int n21 = n17 += buffer.readUnsignedShort(202165640);
                    array3[n20] = n21;
                    final int n22 = n21;
                    if (n22 > n18) {
                        n18 = n22;
                    }
                }
                this.files[n15] = new Object[n18 + 1];
            }
        }
        if (ra2 != 0) {
            this.fileNameHashes = new int[1 + n2][];
            this.fileNameHashTables = new IntHashTable[1 + n2];
            for (int n23 = 0; n23 < this.groupCount * -1754346109; ++n23) {
                final int n24 = this.groupIds[n23];
                final int n25 = this.fileCounts[n24];
                this.fileNameHashes[n24] = new int[this.files[n24].length];
                for (int n26 = 0; n26 < n25; ++n26) {
                    this.fileNameHashes[n24][this.fileIds[n24][n26]] = buffer.readInt(-1599538646);
                }
                this.fileNameHashTables[n24] = new IntHashTable(this.fileNameHashes[n24]);
            }
        }
    }
    
    static char getNpcDefinition(final char c, final Language language, final byte b) {
        try {
            Label_0579: {
                if (c >= '\u00c0' && c <= '\u00ff') {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    if (c >= '\u00c0') {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        if (c <= '\u00c6') {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            return 'A';
                        }
                    }
                    if (c == '\u00c7') {
                        return 'C';
                    }
                    if (c >= '\u00c8') {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        if (c <= '\u00cb') {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            return 'E';
                        }
                    }
                    if (c >= '\u00cc') {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        if (c <= '\u00cf') {
                            return 'I';
                        }
                    }
                    if ('\u00d1' == c) {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        if (Language.Language_ES != language) {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            return 'N';
                        }
                    }
                    if (c >= '\u00d2' && c <= '\u00d6') {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        return 'O';
                    }
                    else if (c >= '\u00d9' && c <= '\u00dc') {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        return 'U';
                    }
                    else {
                        if (c == '\u00dd') {
                            return 'Y';
                        }
                        if (c == '\u00df') {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            return 's';
                        }
                        else if (c >= '\u00e0' && c <= '\u00e6') {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            return 'a';
                        }
                        else {
                            if ('\u00e7' == c) {
                                return 'c';
                            }
                            if (c >= '\u00e8') {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                if (c <= '\u00eb') {
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                    return 'e';
                                }
                            }
                            if (c >= '\u00ec') {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                if (c <= '\u00ef') {
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                    return 'i';
                                }
                            }
                            if ('\u00f1' == c) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                if (language != Language.Language_ES) {
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                    return 'n';
                                }
                            }
                            if (c < '\u00f2' || c > '\u00f6') {
                                if (c >= '\u00f9') {
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                    if (c <= '\u00fc') {
                                        if (b >= 50) {
                                            throw new IllegalStateException();
                                        }
                                        return 'u';
                                    }
                                }
                                if (c != '\u00fd') {
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                    if (c != '\u00ff') {
                                        break Label_0579;
                                    }
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                }
                                return 'y';
                            }
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            return 'o';
                        }
                    }
                }
            }
            if (c == '\u0152') {
                return 'O';
            }
            if ('\u0153' == c) {
                if (b >= 50) {
                    throw new IllegalStateException();
                }
                return 'o';
            }
            else {
                if ('\u0178' == c) {
                    return 'Y';
                }
                return c;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.an(" + ')');
        }
    }
    
    public static NPCComposition getNpcDefinition(final int n, final byte b) {
        try {
            final NPCComposition npcComposition = (NPCComposition)NPCComposition.NpcDefinition_cached.wr(n);
            if (null == npcComposition) {
                final byte[] takeFile = NPCComposition.NpcDefinition_archive.takeFile(9, n, (byte)(-94));
                final NPCComposition npcComposition2 = new NPCComposition();
                npcComposition2.id = -1772751813 * n;
                if (null != takeFile) {
                    if (b >= 16) {
                        throw new IllegalStateException();
                    }
                    npcComposition2.decode(new Buffer(takeFile), -247932803);
                }
                npcComposition2.postDecode(835833293);
                NPCComposition.NpcDefinition_cached.put(npcComposition2, n);
                return npcComposition2;
            }
            if (b >= 16) {
                throw new IllegalStateException();
            }
            return npcComposition;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.an(" + ')');
        }
    }
    
    void loadGroup(final int n, final int n2) {
    }
    
    public int getFileId(final int n, String lowerCase, final short n2) {
        try {
            lowerCase = lowerCase.toLowerCase();
            return this.fileNameHashTables[n].get(VerticalAlignment.hashString(lowerCase, 1358651763), -11499816);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cx(" + ')');
        }
    }
    
    public static byte[] lb(final Object o, final boolean b) {
        return HealthBarDefinition.decodeNext(o, b, 2040236777);
    }
    
    public boolean dk(final int n) {
        if (this.groups[n] != null) {
            return true;
        }
        this.loadGroup(n, -1889742080);
        return null != this.groups[n];
    }
    
    public static int gk(final AbstractArchive abstractArchive, String lowerCase) {
        if (abstractArchive == null) {
            abstractArchive.ew(lowerCase);
        }
        lowerCase = lowerCase.toLowerCase();
        return abstractArchive.groupLoadPercent(abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1977178380), 199743309), -2142076413);
    }
    
    public boolean do(final int n, final int n2) {
        if (n < 0 || n >= this.files.length || null == this.files[n] || n2 < 0 || n2 >= this.files[n].length) {
            return false;
        }
        if (null != this.files[n][n2]) {
            return true;
        }
        if (null != this.groups[n]) {
            return true;
        }
        this.loadGroup(n, -2062113138);
        return null != this.groups[n];
    }
    
    public boolean dz() {
        boolean b = true;
        for (int i = 0; i < this.groupIds.length; ++i) {
            final int n = this.groupIds[i];
            if (null == this.groups[n]) {
                this.loadGroup(n, -1840369660);
                if (null == this.groups[n]) {
                    b = false;
                }
            }
        }
        return b;
    }
    
    public byte[] de(final int n) {
        if (this.files.length == 1) {
            return this.takeFile(0, n, (byte)(-115));
        }
        if (this.files[n].length == 1) {
            return this.takeFile(n, 0, (byte)(-120));
        }
        throw new RuntimeException();
    }
    
    public static void pw(final AbstractArchive abstractArchive, final byte[] array, final byte b) {
        if (abstractArchive == null) {
            abstractArchive.decodeIndex(array, b);
        }
        try {
            abstractArchive.hash = class220.method1228(array, array.length, (byte)(-5)) * -175856763;
            final Buffer buffer = new Buffer(class13.decompressBytes(array, -1117233973));
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra >= 5) {
                if (b != 104) {
                    throw new IllegalStateException();
                }
                if (ra <= 7) {
                    if (ra >= 6) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        buffer.readInt(-1255336140);
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    if (ra >= 7) {
                        if (b != 104) {
                            return;
                        }
                        abstractArchive.groupCount = buffer.method2541(714180890) * 1692969259;
                    }
                    else {
                        abstractArchive.groupCount = buffer.readUnsignedShort(-675267339) * 1692969259;
                    }
                    int n = 0;
                    int n2 = -1;
                    abstractArchive.groupIds = new int[abstractArchive.groupCount * -1754346109];
                    if (ra >= 7) {
                        if (b != 104) {
                            return;
                        }
                        for (int i = 0; i < -1754346109 * abstractArchive.groupCount; ++i) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            n = (abstractArchive.groupIds[i] = n + buffer.method2541(436410285));
                            if (abstractArchive.groupIds[i] > n2) {
                                if (b != 104) {
                                    throw new IllegalStateException();
                                }
                                n2 = abstractArchive.groupIds[i];
                            }
                        }
                    }
                    else {
                        for (int j = 0; j < abstractArchive.groupCount * -1754346109; ++j) {
                            if (b != 104) {
                                return;
                            }
                            n = (abstractArchive.groupIds[j] = n + buffer.readUnsignedShort(-969585391));
                            if (abstractArchive.groupIds[j] > n2) {
                                n2 = abstractArchive.groupIds[j];
                            }
                        }
                    }
                    abstractArchive.groupCrcs = new int[1 + n2];
                    abstractArchive.groupVersions = new int[1 + n2];
                    abstractArchive.fileCounts = new int[n2 + 1];
                    abstractArchive.fileIds = new int[n2 + 1][];
                    abstractArchive.groups = new Object[1 + n2];
                    abstractArchive.files = new Object[1 + n2][];
                    if (ra2 != 0) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        abstractArchive.groupNameHashes = new int[n2 + 1];
                        for (int k = 0; k < -1754346109 * abstractArchive.groupCount; ++k) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            abstractArchive.groupNameHashes[abstractArchive.groupIds[k]] = buffer.readInt(-1309175100);
                        }
                        abstractArchive.groupNameHashTable = new IntHashTable(abstractArchive.groupNameHashes);
                    }
                    for (int l = 0; l < abstractArchive.groupCount * -1754346109; ++l) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        abstractArchive.groupCrcs[abstractArchive.groupIds[l]] = buffer.readInt(-2087180508);
                    }
                    for (int n3 = 0; n3 < abstractArchive.groupCount * -1754346109; ++n3) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        abstractArchive.groupVersions[abstractArchive.groupIds[n3]] = buffer.readInt(-1463194794);
                    }
                    for (int n4 = 0; n4 < abstractArchive.groupCount * -1754346109; ++n4) {
                        if (b != 104) {
                            throw new IllegalStateException();
                        }
                        abstractArchive.fileCounts[abstractArchive.groupIds[n4]] = buffer.readUnsignedShort(-1288330663);
                    }
                    if (ra >= 7) {
                        if (b != 104) {
                            return;
                        }
                        for (int n5 = 0; n5 < -1754346109 * abstractArchive.groupCount; ++n5) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            final int n6 = abstractArchive.groupIds[n5];
                            final int n7 = abstractArchive.fileCounts[n6];
                            int n8 = 0;
                            int n9 = -1;
                            abstractArchive.fileIds[n6] = new int[n7];
                            for (int n10 = 0; n10 < n7; ++n10) {
                                final int[] array2 = abstractArchive.fileIds[n6];
                                final int n11 = n10;
                                final int n12 = n8 += buffer.method2541(835405681);
                                array2[n11] = n12;
                                final int n13 = n12;
                                if (n13 > n9) {
                                    if (b != 104) {
                                        return;
                                    }
                                    n9 = n13;
                                }
                            }
                            abstractArchive.files[n6] = new Object[1 + n9];
                        }
                    }
                    else {
                        for (int n14 = 0; n14 < -1754346109 * abstractArchive.groupCount; ++n14) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            final int n15 = abstractArchive.groupIds[n14];
                            final int n16 = abstractArchive.fileCounts[n15];
                            int n17 = 0;
                            int n18 = -1;
                            abstractArchive.fileIds[n15] = new int[n16];
                            for (int n19 = 0; n19 < n16; ++n19) {
                                if (b != 104) {
                                    throw new IllegalStateException();
                                }
                                final int[] array3 = abstractArchive.fileIds[n15];
                                final int n20 = n19;
                                final int n21 = n17 += buffer.readUnsignedShort(-1578757249);
                                array3[n20] = n21;
                                final int n22 = n21;
                                if (n22 > n18) {
                                    if (b != 104) {
                                        return;
                                    }
                                    n18 = n22;
                                }
                            }
                            abstractArchive.files[n15] = new Object[n18 + 1];
                        }
                    }
                    if (ra2 != 0) {
                        abstractArchive.fileNameHashes = new int[1 + n2][];
                        abstractArchive.fileNameHashTables = new IntHashTable[1 + n2];
                        for (int n23 = 0; n23 < abstractArchive.groupCount * -1754346109; ++n23) {
                            if (b != 104) {
                                throw new IllegalStateException();
                            }
                            final int n24 = abstractArchive.groupIds[n23];
                            final int n25 = abstractArchive.fileCounts[n24];
                            abstractArchive.fileNameHashes[n24] = new int[abstractArchive.files[n24].length];
                            for (int n26 = 0; n26 < n25; ++n26) {
                                abstractArchive.fileNameHashes[n24][abstractArchive.fileIds[n24][n26]] = buffer.readInt(-1705050856);
                            }
                            abstractArchive.fileNameHashTables[n24] = new IntHashTable(abstractArchive.fileNameHashes[n24]);
                        }
                    }
                    return;
                }
                if (b != 104) {
                    throw new IllegalStateException();
                }
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.bc(" + ')');
        }
    }
    
    public boolean ed(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.method1889(this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 959542224), -2093854532), 1090627686);
    }
    
    public byte[] tf(final int n, final int n2, final int[] array) {
        return this.takeFileEncrypted(n, n2, array, 1331353922);
    }
    
    public int ea(final int n, String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.fileNameHashTables[n].get(VerticalAlignment.hashString(lowerCase, 117404481), 576178803);
    }
    
    int groupLoadPercent(final int n, final int n2) {
        try {
            if (null == this.groups[n]) {
                return 0;
            }
            if (n2 >= -1633313603) {
                throw new IllegalStateException();
            }
            return 100;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.aa(" + ')');
        }
    }
    
    public void dx() {
        for (int i = 0; i < this.groups.length; ++i) {
            this.groups[i] = null;
        }
    }
    
    public byte[] takeFile(final int n, final int n2, final byte b) {
        byte[] takeFileEncrypted;
        try {
            takeFileEncrypted = this.takeFileEncrypted(n, n2, null, 1331353922);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.bh(" + ')');
        }
        final byte[] array = takeFileEncrypted;
        final Archive archive = (Archive)this;
        if (!OverlayIndex.hasOverlay(archive.en(), n)) {
            return array;
        }
        final InputStream resourceAsStream = this.getClass().getResourceAsStream("/runelite/" + archive.en() + "/" + n);
        if (resourceAsStream == null) {
            Client.nw.warn("Missing overlay data for {}/{}", (Object)archive.en(), (Object)n);
            return array;
        }
        try {
            final InputStream resourceAsStream2 = this.getClass().getResourceAsStream("/runelite/" + archive.en() + "/" + n + ".hash");
            try {
                if (array == null) {
                    if (resourceAsStream2 != null) {
                        Client.nw.warn("Hash file for non existing archive {}/{}", (Object)archive.en(), (Object)n);
                        return null;
                    }
                    Client.nw.debug("Adding archive {}/{}", (Object)archive.en(), (Object)n);
                    try {
                        return ByteStreams.toByteArray(resourceAsStream);
                    }
                    catch (IOException ex2) {
                        Client.nw.warn("error loading archive replacement", (Throwable)ex2);
                        return null;
                    }
                }
                if (resourceAsStream2 == null) {
                    Client.nw.warn("Missing hash file for {}/{}", (Object)archive.en(), (Object)n);
                    return array;
                }
                final String encode = BaseEncoding.base16().encode(Hashing.sha256().hashBytes(array).asBytes());
                try {
                    final String string = CharStreams.toString((Readable)new InputStreamReader(resourceAsStream2));
                    if (string.equals(encode)) {
                        Client.nw.debug("Replacing archive {}/{}", (Object)archive.en(), (Object)n);
                        return ByteStreams.toByteArray(resourceAsStream);
                    }
                    Client.nw.warn("Mismatch in overlaid cache archive hash for {}/{}: {} != {}", new Object[] { archive.en(), n, string, encode });
                    this.vj = true;
                }
                catch (IOException ex3) {
                    Client.nw.warn("error checking hash", (Throwable)ex3);
                }
                return array;
            }
            finally {
                if (resourceAsStream2 != null) {}
            }
        }
        finally {
            try {
                resourceAsStream.close();
            }
            catch (IOException ex4) {
                Client.nw.warn((String)null, (Throwable)ex4);
            }
        }
    }
    
    public int getGroupCount(final int n) {
        try {
            return this.files.length;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cm(" + ')');
        }
    }
    
    public void clearFiles(final int n) {
        for (int i = 0; i < this.groups.length; ++i) {
            if (this.groups[i] instanceof DirectByteArrayCopier) {
                ((DirectByteArrayCopier)this.groups[i]).hx();
            }
            this.groups[i] = null;
        }
    }
    
    public boolean tryLoadFileByNames(String lowerCase, String lowerCase2, final int n) {
        try {
            lowerCase = lowerCase.toLowerCase();
            lowerCase2 = lowerCase2.toLowerCase();
            final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 270279938), -1903688410);
            return this.tryLoadFile(value, this.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 406077475), 888685160), (byte)(-35));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.co(" + ')');
        }
    }
    
    public int getGroupId(String lowerCase, final int n) {
        try {
            lowerCase = lowerCase.toLowerCase();
            return this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 827030154), -924326194);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cy(" + ')');
        }
    }
    
    public boolean eu(String lowerCase, String lowerCase2) {
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 604112997), -397022320);
        return value >= 0 && this.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 876935485), -66013933) >= 0;
    }
    
    int bn(final int n) {
        if (null != this.groups[n]) {
            return 100;
        }
        return 0;
    }
    
    public boolean tryLoadGroupByName(String lowerCase, final int n) {
        try {
            lowerCase = lowerCase.toLowerCase();
            return this.method1889(this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1459523498), -1348513416), 1653429081);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cz(" + ')');
        }
    }
    
    public int tryLoadGroupByName(final int n) {
        return this.getGroupFileCount(n, (byte)65);
    }
    
    public boolean dr(final int n) {
        if (this.files.length == 1) {
            return this.tryLoadFile(0, n, (byte)(-50));
        }
        if (1 == this.files[n].length) {
            return this.tryLoadFile(n, 0, (byte)(-10));
        }
        throw new RuntimeException();
    }
    
    public static boolean ga(final AbstractArchive abstractArchive, String lowerCase, String lowerCase2) {
        if (abstractArchive == null) {
            abstractArchive.el(lowerCase, lowerCase);
        }
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int value = abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1422091556), -1320714634);
        return abstractArchive.tryLoadFile(value, abstractArchive.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 1592385313), -1155765232), (byte)(-51));
    }
    
    void aj(final int n) {
    }
    
    boolean ep(final int i, final int[] array) {
        if (this.groups[i] == null) {
            return false;
        }
        final int n = this.fileCounts[i];
        final int[] array2 = this.fileIds[i];
        final Object[] array3 = this.files[i];
        boolean b = true;
        for (int j = 0; j < n; ++j) {
            if (array3[array2[j]] == null) {
                b = false;
                break;
            }
        }
        if (b) {
            return true;
        }
        byte[] array4;
        if (array != null && (0 != array[0] || 0 != array[1] || 0 != array[2] || array[3] != 0)) {
            array4 = HealthBarDefinition.decodeNext(this.groups[i], true, 1950443721);
            final Buffer buffer = new Buffer(array4);
            buffer.xteaDecrypt(array, 5, buffer.array.length, -1350839672);
        }
        else {
            array4 = HealthBarDefinition.decodeNext(this.groups[i], false, 1575785694);
        }
        byte[] decompressBytes;
        try {
            decompressBytes = class13.decompressBytes(array4, -1117233973);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "" + (null != array) + "," + i + "," + array4.length + "," + class220.method1228(array4, array4.length, (byte)(-82)) + "," + class220.method1228(array4, array4.length - 2, (byte)(-2)) + "," + this.groupCrcs[i] + "," + this.hash * -159523507);
        }
        if (this.shallowFiles) {
            this.groups[i] = null;
        }
        if (n > 1) {
            int length = decompressBytes.length;
            final int n2 = decompressBytes[--length] & 0xFF;
            final int n3 = length - 4 * (n * n2);
            final Buffer buffer2 = new Buffer(decompressBytes);
            final int[] array5 = new int[n];
            buffer2.offset = -1516355947 * n3;
            for (int k = 0; k < n2; ++k) {
                int n4 = 0;
                for (int l = 0; l < n; ++l) {
                    n4 += buffer2.readInt(-1925251970);
                    final int[] array6 = array5;
                    final int n5 = l;
                    array6[n5] += n4;
                }
            }
            final byte[][] array7 = new byte[n][];
            for (int n6 = 0; n6 < n; ++n6) {
                array7[n6] = new byte[array5[n6]];
                array5[n6] = 0;
            }
            buffer2.offset = n3 * -1516355947;
            int n7 = 0;
            for (int n8 = 0; n8 < n2; ++n8) {
                int n9 = 0;
                for (int n10 = 0; n10 < n; ++n10) {
                    n9 += buffer2.readInt(-1889991658);
                    System.arraycopy(decompressBytes, n7, array7[n10], array5[n10], n9);
                    final int[] array8 = array5;
                    final int n11 = n10;
                    array8[n11] += n9;
                    n7 += n9;
                }
            }
            for (int n12 = 0; n12 < n; ++n12) {
                if (!this.releaseGroups) {
                    array3[array2[n12]] = class108.vmethod2700(array7[n12], false, 857379635);
                }
                else {
                    array3[array2[n12]] = array7[n12];
                }
            }
        }
        else if (!this.releaseGroups) {
            array3[array2[0]] = class108.vmethod2700(decompressBytes, false, 1748077415);
        }
        else {
            array3[array2[0]] = decompressBytes;
        }
        return true;
    }
    
    public void eg(final int n, final int[] array) {
        this.le = this.groups[n];
    }
    
    public boolean eg(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.method1889(this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 750946693), -1697667403), 309462809);
    }
    
    public void ew(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 651074567), 890316911);
        if (value < 0) {
            return;
        }
        this.loadRegionFromGroup(value, -1438945382);
    }
    
    public int ej(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1021048531), -281959148);
    }
    
    public static boolean jq(final AbstractArchive abstractArchive, String lowerCase, String lowerCase2) {
        if (abstractArchive == null) {
            abstractArchive.eb(lowerCase, lowerCase);
        }
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int value = abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 2007322860), 568093021);
        return abstractArchive.tryLoadFile(value, abstractArchive.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 1934451311), -1558622360), (byte)(-30));
    }
    
    public static int jq(final AbstractArchive abstractArchive, String lowerCase) {
        if (abstractArchive == null) {
            abstractArchive.dn();
        }
        lowerCase = lowerCase.toLowerCase();
        return abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1372900989), 2056572279);
    }
    
    int bj(final int n) {
        if (null != this.groups[n]) {
            return 100;
        }
        return 0;
    }
    
    public int dd() {
        return this.files.length;
    }
    
    public static void mg(final AbstractArchive abstractArchive, String lowerCase) {
        if (abstractArchive == null) {
            abstractArchive.dd();
        }
        lowerCase = lowerCase.toLowerCase();
        final int value = abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1087184917), 1862161893);
        if (value < 0) {
            return;
        }
        abstractArchive.loadRegionFromGroup(value, 1912049854);
    }
    
    public void dj() {
        for (int i = 0; i < this.groups.length; ++i) {
            this.groups[i] = null;
        }
    }
    
    public static byte[] go(final AbstractArchive abstractArchive, final int n, final int n2) {
        if (abstractArchive == null) {
            return abstractArchive.getFileFlat(n, n);
        }
        try {
            if (1 == abstractArchive.files.length) {
                if (n2 == 1086265912) {
                    throw new IllegalStateException();
                }
                return abstractArchive.getFile(0, n, -606351717);
            }
            else {
                if (1 != abstractArchive.files[n].length) {
                    throw new RuntimeException();
                }
                if (n2 == 1086265912) {
                    throw new IllegalStateException();
                }
                return abstractArchive.getFile(n, 0, -606351717);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.cu(" + ')');
        }
    }
    
    public boolean xd(final int n, final int[] array) {
        return bo(this, n, array, -2109762247);
    }
    
    public int getGroupFileCount(final int n, final byte b) {
        if (this.files == null || n >= this.files.length) {
            return 0;
        }
        final Object[] array = this.files[n];
        return (array == null) ? 0 : array.length;
    }
    
    public int ez(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1012079764), -713626146);
    }
    
    public int dq(final int n) {
        if (this.files != null && n < this.files.length && null != this.files[n]) {
            return this.files[n].length;
        }
        return 0;
    }
    
    boolean eo(final int i, final int[] array) {
        if (this.groups[i] == null) {
            return false;
        }
        final int n = this.fileCounts[i];
        final int[] array2 = this.fileIds[i];
        final Object[] array3 = this.files[i];
        boolean b = true;
        for (int j = 0; j < n; ++j) {
            if (array3[array2[j]] == null) {
                b = false;
                break;
            }
        }
        if (b) {
            return true;
        }
        byte[] array4;
        if (array != null && (0 != array[0] || 0 != array[1] || 0 != array[2] || array[3] != 0)) {
            array4 = HealthBarDefinition.decodeNext(this.groups[i], true, 1443999598);
            final Buffer buffer = new Buffer(array4);
            buffer.xteaDecrypt(array, 5, buffer.array.length, -1350839672);
        }
        else {
            array4 = HealthBarDefinition.decodeNext(this.groups[i], false, 864240609);
        }
        byte[] decompressBytes;
        try {
            decompressBytes = class13.decompressBytes(array4, -1117233973);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "" + (null != array) + "," + i + "," + array4.length + "," + class220.method1228(array4, array4.length, (byte)(-113)) + "," + class220.method1228(array4, array4.length - 2, (byte)(-82)) + "," + this.groupCrcs[i] + "," + this.hash * -159523507);
        }
        if (this.shallowFiles) {
            this.groups[i] = null;
        }
        if (n > 1) {
            int length = decompressBytes.length;
            final int n2 = decompressBytes[--length] & 0xFF;
            final int n3 = length - 4 * (n * n2);
            final Buffer buffer2 = new Buffer(decompressBytes);
            final int[] array5 = new int[n];
            buffer2.offset = -1516355947 * n3;
            for (int k = 0; k < n2; ++k) {
                int n4 = 0;
                for (int l = 0; l < n; ++l) {
                    n4 += buffer2.readInt(-1612232875);
                    final int[] array6 = array5;
                    final int n5 = l;
                    array6[n5] += n4;
                }
            }
            final byte[][] array7 = new byte[n][];
            for (int n6 = 0; n6 < n; ++n6) {
                array7[n6] = new byte[array5[n6]];
                array5[n6] = 0;
            }
            buffer2.offset = n3 * -1516355947;
            int n7 = 0;
            for (int n8 = 0; n8 < n2; ++n8) {
                int n9 = 0;
                for (int n10 = 0; n10 < n; ++n10) {
                    n9 += buffer2.readInt(-1712287418);
                    System.arraycopy(decompressBytes, n7, array7[n10], array5[n10], n9);
                    final int[] array8 = array5;
                    final int n11 = n10;
                    array8[n11] += n9;
                    n7 += n9;
                }
            }
            for (int n12 = 0; n12 < n; ++n12) {
                if (!this.releaseGroups) {
                    array3[array2[n12]] = class108.vmethod2700(array7[n12], false, 1940092469);
                }
                else {
                    array3[array2[n12]] = array7[n12];
                }
            }
        }
        else if (!this.releaseGroups) {
            array3[array2[0]] = class108.vmethod2700(decompressBytes, false, 326919875);
        }
        else {
            array3[array2[0]] = decompressBytes;
        }
        return true;
    }
    
    public byte[] eb(String lowerCase, String lowerCase2) {
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int value = this.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, -18779808), -775866076);
        return this.takeFile(value, this.fileNameHashTables[value].get(VerticalAlignment.hashString(lowerCase2, 704861010), -901362933), (byte)(-26));
    }
    
    public static int[] yk(final AbstractArchive abstractArchive, final int n, final int n2) {
        if (abstractArchive == null) {
            return abstractArchive.getGroupFileIds(n, n);
        }
        try {
            if (n >= 0) {
                if (n2 <= 100789159) {
                    throw new IllegalStateException();
                }
                if (n < abstractArchive.fileIds.length) {
                    return abstractArchive.fileIds[n];
                }
                if (n2 <= 100789159) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nm.ck(" + ')');
        }
    }
    
    static final byte[] ey(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int int1 = buffer.readInt(-871574246);
        if (int1 < 0 || (0 != AbstractArchive.maximumContainerSize * 1366958206 && int1 > AbstractArchive.maximumContainerSize * 401859175)) {
            throw new RuntimeException();
        }
        if (ra == 0) {
            final byte[] array2 = new byte[int1];
            Buffer.io(buffer, array2, 0, int1, -1570744551);
            return array2;
        }
        final int int2 = buffer.readInt(-1688548225);
        if (int2 < 0 || (0 != AbstractArchive.maximumContainerSize * 401859175 && int2 > AbstractArchive.maximumContainerSize * 401859175)) {
            throw new RuntimeException();
        }
        final byte[] array3 = new byte[int2];
        if (ra == 1) {
            BZip2Decompressor.BZip2Decompressor_decompress(array3, int2, array, int1, 9);
        }
        else {
            GZipDecompressor.rg(AbstractArchive.gzipDecompressor, buffer, array3, 1293232912);
        }
        return array3;
    }
    
    public byte[] du(final int n) {
        if (this.files.length == 1) {
            return this.takeFile(0, n, (byte)(-54));
        }
        if (this.files[n].length == 1) {
            return this.takeFile(n, 0, (byte)(-123));
        }
        throw new RuntimeException();
    }
    
    public byte[] loadData(final int n, final int n2) {
        return this.takeFile(n, n2, (byte)(-48));
    }
    
    public int[] getFileIds(final int n) {
        return yk(this, n, 296342556);
    }
    
    public boolean isOverlayOutdated() {
        return this.vj;
    }
}
