import java.util.zip.CRC32;

// 
// Decompiled by Procyon v0.5.36
// 

public class Archive extends AbstractArchive
{
    static int[] regionLandArchiveIds;
    static final int aw = 0;
    static final int ac = 1;
    int indexVersion;
    ArchiveDisk masterDisk;
    int index;
    volatile int field3459;
    boolean field3460;
    volatile boolean[] validGroups;
    int field3462;
    int indexCrc;
    static final int af = 200;
    ArchiveDisk archiveDisk;
    boolean field3465;
    static CRC32 Archive_crc;
    static int field3467;
    static final int an = 12;
    
    public Archive(final ArchiveDisk masterDisk, final ArchiveDisk archiveDisk, final int n, final boolean b, final boolean b2, final boolean field3460, final boolean field3461) {
        super(b, b2);
        this.field3459 = 0;
        this.field3460 = false;
        this.field3462 = -631230867;
        this.field3465 = false;
        this.masterDisk = masterDisk;
        this.archiveDisk = archiveDisk;
        this.index = 957229219 * n;
        this.field3460 = field3460;
        this.field3465 = field3461;
        final int n2 = this.index * -1596339445;
        if (this.field3465) {
            if (n2 <= 1097614811 * NetCache.field3489) {
                throw new RuntimeException("");
            }
            if (n2 < 1745465359 * NetCache.field3508) {
                NetCache.field3508 = n2 * 60767983;
            }
        }
        else {
            if (n2 >= 1745465359 * NetCache.field3508) {
                throw new RuntimeException("");
            }
            if (n2 > 1097614811 * NetCache.field3489) {
                NetCache.field3489 = 2072522323 * n2;
            }
        }
        if (null != Login.field764) {
            Login.field764.offset = 754054312 * n2 + 1008154857;
            if (-1633313603 * Login.field764.offset >= Login.field764.array.length) {
                if (!this.field3465) {
                    throw new RuntimeException("");
                }
                this.method1872((byte)(-5));
            }
            else {
                this.loadIndex(Login.field764.readInt(-1663260953), Login.field764.readInt(-1793590077), -691028);
            }
        }
        else {
            Message.isFromFriend(null, 255, 255, 0, (byte)0, true, (byte)110);
            NetCache.NetCache_archives[n2] = this;
        }
        this.zw(masterDisk, archiveDisk, n, b, b2, field3460);
    }
    
    static {
        Archive.Archive_crc = new CRC32();
    }
    
    public boolean bs(final int n) {
        return this.validGroups[n];
    }
    
    public int en() {
        return this.index * -1596339445;
    }
    
    @Override
    void ad(final int n) {
        if (null != this.masterDisk && null != this.validGroups && this.validGroups[n]) {
            final ArchiveDisk masterDisk = this.masterDisk;
            byte[] data = null;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                for (ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); null != archiveDiskAction; archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
                    if (archiveDiskAction.hr == n && archiveDiskAction.archiveDisk == masterDisk && 0 == -1329235479 * archiveDiskAction.type) {
                        data = archiveDiskAction.data;
                        break;
                    }
                }
            }
            if (null != data) {
                bd(this, masterDisk, n, data, true, (byte)32);
            }
            else {
                bd(this, masterDisk, n, ArchiveDisk.ef(masterDisk, n, -215273157), true, (byte)47);
            }
        }
        else {
            Message.isFromFriend(this, -1596339445 * this.index, n, this.ak[n], (byte)2, true, (byte)63);
        }
    }
    
    void ae() {
        this.field3459 = -922247218;
        this.am = new int[0];
        this.ak = new int[0];
        this.az = new int[0];
        this.ad = new int[0];
        this.ae = new int[0][];
        this.bb = new Object[0];
        this.bi = new Object[0][];
    }
    
    void bb(final int n, final int n2) {
        this.indexCrc = n * 215951563;
        this.indexVersion = 1459300717 * n2;
        if (this.archiveDisk != null) {
            final int n3 = this.index * -1596339445;
            final ArchiveDisk archiveDisk = this.archiveDisk;
            byte[] data = null;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                for (ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); archiveDiskAction != null; archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
                    if (archiveDiskAction.hr == n3 && archiveDiskAction.archiveDisk == archiveDisk && 0 == -1329235479 * archiveDiskAction.type) {
                        data = archiveDiskAction.data;
                        break;
                    }
                }
            }
            if (null != data) {
                bd(this, archiveDisk, n3, data, true, (byte)91);
            }
            else {
                bd(this, archiveDisk, n3, ArchiveDisk.ef(archiveDisk, n3, -429949985), true, (byte)64);
            }
        }
        else {
            Message.isFromFriend(this, 255, -1596339445 * this.index, this.indexCrc * -1710883613, (byte)0, true, (byte)85);
        }
    }
    
    public boolean method1870(final int n, final int n2) {
        try {
            return AbstractArchive.yk(this, n, 1675784388) != null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.ao(" + ')');
        }
    }
    
    void loadAllLocal(final int n) {
        try {
            this.validGroups = new boolean[this.bb.length];
            for (int i = 0; i < this.validGroups.length; ++i) {
                this.validGroups[i] = false;
            }
            if (null != this.masterDisk) {
                this.field3462 = -631230867;
                for (int j = 0; j < this.validGroups.length; ++j) {
                    if (n <= -1888543176) {
                        throw new IllegalStateException();
                    }
                    if (this.ad[j] > 0) {
                        if (n <= -1888543176) {
                            throw new IllegalStateException();
                        }
                        Clips.method1359(j, this.masterDisk, this, -35309556);
                        this.field3462 = 631230867 * j;
                    }
                }
                if (this.field3462 * -2028669797 == -1) {
                    if (n <= -1888543176) {
                        throw new IllegalStateException();
                    }
                    this.field3459 = -461123609;
                }
                return;
            }
            if (n <= -1888543176) {
                throw new IllegalStateException();
            }
            this.field3459 = -461123609;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.at(" + ')');
        }
    }
    
    @Override
    void ak(final int n) {
        if (null != this.masterDisk && null != this.validGroups && this.validGroups[n]) {
            final ArchiveDisk masterDisk = this.masterDisk;
            byte[] data = null;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                for (ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); null != archiveDiskAction; archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
                    if (archiveDiskAction.hr == n && archiveDiskAction.archiveDisk == masterDisk && 0 == -1329235479 * archiveDiskAction.type) {
                        data = archiveDiskAction.data;
                        break;
                    }
                }
            }
            if (null != data) {
                bd(this, masterDisk, n, data, true, (byte)104);
            }
            else {
                bd(this, masterDisk, n, ArchiveDisk.ef(masterDisk, n, -664877427), true, (byte)117);
            }
        }
        else {
            Message.isFromFriend(this, -1596339445 * this.index, n, this.ak[n], (byte)2, true, (byte)52);
        }
    }
    
    public boolean av() {
        return 1 == 2103956439 * this.field3459;
    }
    
    public void is(final String s) {
        this.loadRegionFromName(s, -1282619653);
    }
    
    @Override
    void as(final int n) {
        final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingWrites.at(n + (-1537576947 * this.index << 16));
        if (null != netFileRequest) {
            NetCache.NetCache_pendingWritesQueue.addLast(netFileRequest);
        }
    }
    
    @Override
    void az(final int n) {
        if (null != this.masterDisk && null != this.validGroups && this.validGroups[n]) {
            final ArchiveDisk masterDisk = this.masterDisk;
            byte[] data = null;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                for (ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); null != archiveDiskAction; archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
                    if (archiveDiskAction.hr == n && archiveDiskAction.archiveDisk == masterDisk && 0 == -1329235479 * archiveDiskAction.type) {
                        data = archiveDiskAction.data;
                        break;
                    }
                }
            }
            if (null != data) {
                bd(this, masterDisk, n, data, true, (byte)14);
            }
            else {
                bd(this, masterDisk, n, ArchiveDisk.ef(masterDisk, n, -1408464133), true, (byte)127);
            }
        }
        else {
            Message.isFromFriend(this, -1596339445 * this.index, n, this.ak[n], (byte)2, true, (byte)86);
        }
    }
    
    public static byte[] st(final byte[] array) {
        return class13.decompressBytes(array, -1117233973);
    }
    
    public int loadPercent(final byte b) {
        try {
            int n = 0;
            int n2 = 0;
            for (int i = 0; i < this.bb.length; ++i) {
                if (this.ad[i] > 0) {
                    if (b != 4) {
                        throw new IllegalStateException();
                    }
                    n += 100;
                    n2 += this.groupLoadPercent(i, -1973967810);
                }
            }
            if (n != 0) {
                return 100 * n2 / n;
            }
            if (b != 4) {
                throw new IllegalStateException();
            }
            return 100;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.ax(" + ')');
        }
    }
    
    public boolean method1871(final int n, final int n2) {
        try {
            return this.validGroups[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.ay(" + ')');
        }
    }
    
    void bi(final int n, final int n2) {
        this.indexCrc = n * 215951563;
        this.indexVersion = 1459300717 * n2;
        if (this.archiveDisk != null) {
            final int n3 = this.index * -1596339445;
            final ArchiveDisk archiveDisk = this.archiveDisk;
            byte[] data = null;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                for (ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); archiveDiskAction != null; archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
                    if (archiveDiskAction.hr == n3 && archiveDiskAction.archiveDisk == archiveDisk && 0 == -1329235479 * archiveDiskAction.type) {
                        data = archiveDiskAction.data;
                        break;
                    }
                }
            }
            if (null != data) {
                bd(this, archiveDisk, n3, data, true, (byte)23);
            }
            else {
                bd(this, archiveDisk, n3, ArchiveDisk.ef(archiveDisk, n3, -510740248), true, (byte)9);
            }
        }
        else {
            Message.isFromFriend(this, 255, -1596339445 * this.index, this.indexCrc * -1710883613, (byte)0, true, (byte)106);
        }
    }
    
    public int bv() {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < this.bb.length; ++i) {
            if (this.ad[i] > 0) {
                n += 100;
                n2 += this.groupLoadPercent(i, -2122885114);
            }
        }
        if (n == 0) {
            return 100;
        }
        return 751577835 * n2 / n;
    }
    
    public void bo(final ArchiveDisk archiveDisk, final int i, final byte[] array, final boolean b) {
        if (this.archiveDisk == archiveDisk) {
            if (this.field3459 * 2103956439 == 1) {
                throw new RuntimeException();
            }
            if (null == array) {
                Message.isFromFriend(this, 255, -1596339445 * this.index, -1000165165 * this.indexCrc, (byte)0, true, (byte)110);
                return;
            }
            Archive.Archive_crc.reset();
            Archive.Archive_crc.update(array, 0, array.length);
            if ((int)Archive.Archive_crc.getValue() != -1710883613 * this.indexCrc) {
                Message.isFromFriend(this, -798882322, this.index * -743886959, -1710883613 * this.indexCrc, (byte)0, true, (byte)117);
                return;
            }
            final Buffer buffer = new Buffer(class13.decompressBytes(array, -1117233973));
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra != 5 && 6 != ra) {
                throw new RuntimeException(ra + "," + -1596339445 * this.index + "," + i);
            }
            int int1 = 0;
            if (ra >= 6) {
                int1 = buffer.readInt(-1916431998);
            }
            if (int1 != 17451109 * this.indexVersion) {
                Message.isFromFriend(this, 416348147, this.index * -1596339445, 2102559226 * this.indexCrc, (byte)0, true, (byte)39);
                return;
            }
            AbstractArchive.pw(this, array, (byte)104);
            this.loadAllLocal(-1090381317);
        }
        else {
            if (!b && 1614195329 * this.field3462 == i) {
                this.field3459 = -461123609;
            }
            if (array == null || array.length <= 2) {
                this.validGroups[i] = false;
                if (this.field3460 || b) {
                    Message.isFromFriend(this, 627323572 * this.index, i, this.ak[i], (byte)2, b, (byte)58);
                }
                return;
            }
            Archive.Archive_crc.reset();
            Archive.Archive_crc.update(array, 0, array.length - 2);
            final int n = (int)Archive.Archive_crc.getValue();
            final int n2 = ((array[array.length - 2] & 0xFF) << 8) + (array[array.length - 1] & 0xFF);
            if (this.ak[i] != n || n2 != this.az[i]) {
                this.validGroups[i] = false;
                if (this.field3460 || b) {
                    Message.isFromFriend(this, 670410173 * this.index, i, this.ak[i], (byte)2, b, (byte)83);
                }
                return;
            }
            this.validGroups[i] = true;
            if (b) {
                this.bb[i] = class108.vmethod2700(array, false, 500389543);
            }
        }
    }
    
    public int bp() {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < this.bb.length; ++i) {
            if (this.ad[i] > 0) {
                n += 100;
                n2 += this.groupLoadPercent(i, -1669369931);
            }
        }
        if (n == 0) {
            return 100;
        }
        return 100 * n2 / n;
    }
    
    @Override
    int bt(final int n) {
        if (this.bb[n] != null) {
            return 100;
        }
        if (this.validGroups[n]) {
            return 100;
        }
        return class20.method83(-1596339445 * this.index, n, -964267539);
    }
    
    public boolean br(final int n) {
        return AbstractArchive.yk(this, n, 1371704707) != null;
    }
    
    @Override
    void loadRegionFromGroup(final int n, final int n2) {
        synchronized (Client.fz) {
            try {
                final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingWrites.at(n + (-1596339445 * this.index << 16));
                if (null != netFileRequest) {
                    NetCache.NetCache_pendingWritesQueue.addLast(netFileRequest);
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "nd.aw(" + ')');
            }
        }
    }
    
    static int loadRegionFromGroup(char lowerCase, final Language language, final int n) {
        try {
            int n2 = lowerCase << 4;
            Label_0046: {
                if (!Character.isUpperCase(lowerCase)) {
                    if (n == 141784696) {
                        throw new IllegalStateException();
                    }
                    if (!Character.isTitleCase(lowerCase)) {
                        break Label_0046;
                    }
                    if (n == 141784696) {
                        throw new IllegalStateException();
                    }
                }
                lowerCase = Character.toLowerCase(lowerCase);
                n2 = (lowerCase << 4) + 1;
            }
            if (lowerCase == '\u00f1') {
                if (n == 141784696) {
                    throw new IllegalStateException();
                }
                if (language == Language.Language_ES) {
                    n2 = 1762;
                }
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.aw(" + ')');
        }
    }
    
    public void load(final ArchiveDisk archiveDisk, final int i, final byte[] array, final boolean b, final byte b2) {
        if (archiveDisk == this.archiveDisk) {
            if (this.field3459 * 2103956439 == 1) {
                throw new RuntimeException();
            }
            if (array == null) {
                gr(this, 255, this.field3462 * -1596339445, this.indexVersion * -1710883613, (byte)0, true);
            }
            else {
                final int n;
                synchronized (Archive.Archive_crc) {
                    Archive.Archive_crc.reset();
                    Archive.Archive_crc.update(array, 0, array.length);
                    n = (int)Archive.Archive_crc.getValue();
                }
                if (n != this.indexVersion * -1710883613) {
                    gr(this, 255, this.indexCrc * -1596339445, this.index * -1710883613, (byte)0, true);
                }
                else {
                    final Buffer yp = Buffer.yp(st(array));
                    final int ie = yp.ie();
                    if (ie != 5 && ie != 6) {
                        throw new RuntimeException(ie + "," + this.index * -1596339445 + "," + i);
                    }
                    int kh = 0;
                    if (ie >= 6) {
                        kh = yp.kh();
                    }
                    if (kh != this.indexCrc * 17451109) {
                        gr(this, 255, this.indexCrc * -1596339445, this.index * -1710883613, (byte)0, true);
                    }
                    else {
                        this.ty(array);
                        this.dg();
                    }
                }
            }
        }
        else {
            if (!b && i == this.indexCrc * -2028669797) {
                this.field3459 = 1 * -461123609;
            }
            if (array != null && array.length > 2) {
                final int n2;
                synchronized (Archive.Archive_crc) {
                    Archive.Archive_crc.reset();
                    Archive.Archive_crc.update(array, 0, array.length - 2);
                    n2 = (int)Archive.Archive_crc.getValue();
                }
                final int n3 = ((array[array.length - 2] & 0xFF) << 8) + (array[array.length - 1] & 0xFF);
                if (n2 == super.groupCrcs[i] && n3 == super.groupNameHashes[i]) {
                    this.validGroups[i] = true;
                    if (b) {
                        super.groups[i] = fg(array, false);
                    }
                }
                else {
                    this.validGroups[i] = false;
                    if (this.field3465 || b) {
                        gr(this, this.indexVersion * -1596339445, i, super.groupNameHashes[i], (byte)2, b);
                    }
                }
            }
            else {
                this.validGroups[i] = false;
                if (this.field3465 || b) {
                    gr(this, this.indexCrc * -1596339445, i, super.groupNameHashes[i], (byte)2, b);
                }
            }
        }
    }
    
    public int percentage(final byte b) {
        try {
            if (this.field3459 * 2103956439 != 1) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                if (this.field3465) {
                    if (b != 0) {
                        throw new IllegalStateException();
                    }
                    if (2103956439 * this.field3459 == 2) {
                        if (b != 0) {
                            throw new IllegalStateException();
                        }
                        return 100;
                    }
                }
                if (this.bb != null) {
                    return 99;
                }
                int method83 = class20.method83(255, this.index * -1596339445, -964267539);
                if (method83 >= 100) {
                    if (b != 0) {
                        throw new IllegalStateException();
                    }
                    method83 = 99;
                }
                return method83;
            }
            return 100;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.an(" + ')');
        }
    }
    
    @Override
    void loadGroup(final int n, final int n2) {
        try {
            if (null != this.masterDisk) {
                if (n2 >= -1570396352) {
                    throw new IllegalStateException();
                }
                if (null != this.validGroups && this.validGroups[n]) {
                    if (n2 >= -1570396352) {
                        return;
                    }
                    final ArchiveDisk masterDisk = this.masterDisk;
                    byte[] data = null;
                    synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                        for (ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); null != archiveDiskAction; archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
                            if (n2 >= -1570396352) {
                                throw new IllegalStateException();
                            }
                            if (archiveDiskAction.hr == n && archiveDiskAction.archiveDisk == masterDisk) {
                                if (n2 >= -1570396352) {
                                    throw new IllegalStateException();
                                }
                                if (0 == -1329235479 * archiveDiskAction.type) {
                                    if (n2 >= -1570396352) {
                                        return;
                                    }
                                    data = archiveDiskAction.data;
                                    break;
                                }
                            }
                        }
                    }
                    if (null != data) {
                        if (n2 >= -1570396352) {
                            throw new IllegalStateException();
                        }
                        bd(this, masterDisk, n, data, true, (byte)48);
                    }
                    else {
                        bd(this, masterDisk, n, ArchiveDisk.ef(masterDisk, n, -1372927585), true, (byte)2);
                    }
                    return;
                }
            }
            Message.isFromFriend(this, -1596339445 * this.index, n, this.ak[n], (byte)2, true, (byte)72);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.ac(" + ')');
        }
    }
    
    public boolean bq(final int n) {
        return this.validGroups[n];
    }
    
    public static int mo(final Archive archive) {
        if (archive.field3459 * 2103956439 == 1 || (archive.field3465 && 2103956439 * archive.field3459 == 2)) {
            return -317295525;
        }
        if (archive.bb != null) {
            return 86875028;
        }
        int method83 = class20.method83(1947709224, archive.index * -2060509396, -964267539);
        if (method83 >= -1269756528) {
            method83 = 170729263;
        }
        return method83;
    }
    
    void method1872(final byte b) {
        try {
            this.field3459 = -922247218;
            this.am = new int[0];
            this.ak = new int[0];
            this.az = new int[0];
            this.ad = new int[0];
            this.ae = new int[0][];
            this.bb = new Object[0];
            this.bi = new Object[0][];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.au(" + ')');
        }
    }
    
    @Override
    int groupLoadPercent(final int n, final int n2) {
        try {
            if (this.bb[n] != null) {
                if (n2 >= -1633313603) {
                    throw new IllegalStateException();
                }
                return 100;
            }
            else {
                if (!this.validGroups[n]) {
                    return class20.method83(-1596339445 * this.index, n, -964267539);
                }
                if (n2 >= -1633313603) {
                    throw new IllegalStateException();
                }
                return 100;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.aa(" + ')');
        }
    }
    
    public void ty(final byte[] array) {
        AbstractArchive.pw(this, array, (byte)104);
    }
    
    public boolean ai() {
        return 1 == -107391883 * this.field3459;
    }
    
    public static void wy(final Archive archive, final int n, final byte[] array, final boolean b, final boolean b2, final int n2) {
        if (archive == null) {
            archive.write(n, array, b, b, n);
            return;
        }
        try {
            if (b) {
                if (archive.field3459 * 2103956439 == 1) {
                    if (n2 <= -417788481) {
                        return;
                    }
                    throw new RuntimeException();
                }
                else {
                    if (archive.archiveDisk != null) {
                        if (n2 <= -417788481) {
                            return;
                        }
                        MenuAction.method439(archive.index * -1596339445, array, archive.archiveDisk, (byte)88);
                    }
                    AbstractArchive.pw(archive, array, (byte)104);
                    archive.loadAllLocal(191683705);
                }
            }
            else {
                array[array.length - 2] = (byte)(archive.az[n] >> 8);
                array[array.length - 1] = (byte)archive.az[n];
                if (archive.masterDisk != null) {
                    if (n2 <= -417788481) {
                        throw new IllegalStateException();
                    }
                    MenuAction.method439(n, array, archive.masterDisk, (byte)73);
                    archive.validGroups[n] = true;
                }
                if (b2) {
                    if (n2 <= -417788481) {
                        throw new IllegalStateException();
                    }
                    archive.bb[n] = class108.vmethod2700(array, false, 1713471491);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.aq(" + ')');
        }
    }
    
    void bx(final int n, final byte[] array, final boolean b, final boolean b2) {
        if (b) {
            if (this.field3459 * 2103956439 == 1) {
                throw new RuntimeException();
            }
            if (this.archiveDisk != null) {
                MenuAction.method439(this.index * -1596339445, array, this.archiveDisk, (byte)73);
            }
            AbstractArchive.pw(this, array, (byte)104);
            this.loadAllLocal(-1668557044);
        }
        else {
            array[array.length - 2] = (byte)(this.az[n] >> 8);
            array[array.length - 1] = (byte)this.az[n];
            if (this.masterDisk != null) {
                MenuAction.method439(n, array, this.masterDisk, (byte)93);
                this.validGroups[n] = true;
            }
            if (b2) {
                this.bb[n] = class108.vmethod2700(array, false, 495650751);
            }
        }
    }
    
    public int ar() {
        if (this.field3459 * 2103956439 == 1 || (this.field3465 && 2103956439 * this.field3459 == 2)) {
            return 100;
        }
        if (this.bb != null) {
            return 99;
        }
        int method83 = class20.method83(255, this.index * -1596339445, -964267539);
        if (method83 >= 100) {
            method83 = 99;
        }
        return method83;
    }
    
    void ap() {
        this.validGroups = new boolean[this.bb.length];
        for (int i = 0; i < this.validGroups.length; ++i) {
            this.validGroups[i] = false;
        }
        if (null == this.masterDisk) {
            this.field3459 = -461123609;
            return;
        }
        this.field3462 = -631230867;
        for (int j = 0; j < this.validGroups.length; ++j) {
            if (this.ad[j] > 0) {
                Clips.method1359(j, this.masterDisk, this, -35309556);
                this.field3462 = 631230867 * j;
            }
        }
        if (this.field3462 * -2028669797 == -1) {
            this.field3459 = -461123609;
        }
    }
    
    public static void bd(final Archive archive, final ArchiveDisk archiveDisk, final int i, final byte[] array, final boolean b, final byte b2) {
        if (archive == null) {
            archive.load(archiveDisk, i, array, b, b2);
        }
        if (archiveDisk == archive.archiveDisk) {
            if (archive.field3459 * 2103956439 == 1) {
                throw new RuntimeException();
            }
            if (array == null) {
                gr(archive, 255, archive.index * -1596339445, archive.indexCrc * -1710883613, (byte)0, true);
            }
            else {
                final int n;
                synchronized (Archive.Archive_crc) {
                    Archive.Archive_crc.reset();
                    Archive.Archive_crc.update(array, 0, array.length);
                    n = (int)Archive.Archive_crc.getValue();
                }
                if (n != archive.indexCrc * -1710883613) {
                    gr(archive, 255, archive.index * -1596339445, archive.indexCrc * -1710883613, (byte)0, true);
                }
                else {
                    final Buffer yp = Buffer.yp(st(array));
                    final int oo = yp.oo();
                    if (oo != 5 && oo != 6) {
                        throw new RuntimeException(oo + "," + archive.index * -1596339445 + "," + i);
                    }
                    int ev = 0;
                    if (oo >= 6) {
                        ev = yp.ev();
                    }
                    if (ev != archive.indexVersion * 17451109) {
                        gr(archive, 255, archive.index * -1596339445, archive.indexCrc * -1710883613, (byte)0, true);
                    }
                    else {
                        archive.ty(array);
                        archive.dg();
                    }
                }
            }
        }
        else {
            if (!b && i == archive.field3462 * -2028669797) {
                archive.field3459 = 1 * -461123609;
            }
            if (array != null && array.length > 2) {
                final int n2;
                synchronized (Archive.Archive_crc) {
                    Archive.Archive_crc.reset();
                    Archive.Archive_crc.update(array, 0, array.length - 2);
                    n2 = (int)Archive.Archive_crc.getValue();
                }
                final int n3 = ((array[array.length - 2] & 0xFF) << 8) + (array[array.length - 1] & 0xFF);
                if (n2 == archive.groupCrcs[i] && n3 == archive.groupVersions[i]) {
                    archive.validGroups[i] = true;
                    if (b) {
                        archive.groups[i] = fg(array, false);
                    }
                }
                else {
                    archive.validGroups[i] = false;
                    if (archive.field3460 || b) {
                        gr(archive, archive.index * -1596339445, i, archive.groupCrcs[i], (byte)2, b);
                    }
                }
            }
            else {
                archive.validGroups[i] = false;
                if (archive.field3460 || b) {
                    gr(archive, archive.index * -1596339445, i, archive.groupCrcs[i], (byte)2, b);
                }
            }
        }
    }
    
    void bd() {
        this.field3459 = -229735256;
        this.am = new int[0];
        this.ak = new int[0];
        this.az = new int[0];
        this.ad = new int[0];
        this.ae = new int[0][];
        this.bb = new Object[0];
        this.bi = new Object[0][];
    }
    
    public boolean bg(final int n) {
        return this.validGroups[n];
    }
    
    public static Object fg(final byte[] array, final boolean b) {
        return class108.vmethod2700(array, b, 2127722280);
    }
    
    public boolean method1862(final byte b) {
        try {
            boolean b2;
            if (1 == 2103956439 * this.field3459) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.af(" + ')');
        }
    }
    
    @Override
    int bn(final int n) {
        if (this.bb[n] != null) {
            return 100;
        }
        if (this.validGroups[n]) {
            return 100;
        }
        return class20.method83(-1596339445 * this.index, n, -964267539);
    }
    
    void loadIndex(final int n, final int n2, final int n3) {
        try {
            this.indexCrc = n * 215951563;
            this.indexVersion = 1459300717 * n2;
            if (this.archiveDisk != null) {
                if (n3 != -691028) {
                    throw new IllegalStateException();
                }
                final int n4 = this.index * -1596339445;
                final ArchiveDisk archiveDisk = this.archiveDisk;
                byte[] data = null;
                synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                    for (ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); archiveDiskAction != null; archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
                        if (n3 != -691028) {
                            throw new IllegalStateException();
                        }
                        if (archiveDiskAction.hr == n4) {
                            if (n3 != -691028) {
                                throw new IllegalStateException();
                            }
                            if (archiveDiskAction.archiveDisk == archiveDisk) {
                                if (n3 != -691028) {
                                    throw new IllegalStateException();
                                }
                                if (0 == -1329235479 * archiveDiskAction.type) {
                                    if (n3 != -691028) {
                                        throw new IllegalStateException();
                                    }
                                    data = archiveDiskAction.data;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (null != data) {
                    if (n3 != -691028) {
                        throw new IllegalStateException();
                    }
                    bd(this, archiveDisk, n4, data, true, (byte)86);
                }
                else {
                    bd(this, archiveDisk, n4, ArchiveDisk.ef(archiveDisk, n4, -1272810465), true, (byte)83);
                }
            }
            else {
                Message.isFromFriend(this, 255, -1596339445 * this.index, this.indexCrc * -1710883613, (byte)0, true, (byte)74);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.ab(" + ')');
        }
    }
    
    void write(final int n, final byte[] array, final boolean b, final boolean b2, final int n2) {
        try {
            if (b) {
                if (this.field3459 * 2103956439 == 1) {
                    if (n2 <= -417788481) {
                        return;
                    }
                    throw new RuntimeException();
                }
                else {
                    if (this.archiveDisk != null) {
                        if (n2 <= -417788481) {
                            return;
                        }
                        MenuAction.method439(this.indexCrc * -1596339445, array, this.archiveDisk, (byte)88);
                    }
                    AbstractArchive.pw(this, array, (byte)104);
                    this.loadAllLocal(191683705);
                }
            }
            else {
                array[array.length - 2] = (byte)(super.groupIds[n] >> 8);
                array[array.length - 1] = (byte)super.groupNameHashes[n];
                if (this.archiveDisk != null) {
                    if (n2 <= -417788481) {
                        throw new IllegalStateException();
                    }
                    MenuAction.method439(n, array, this.masterDisk, (byte)73);
                    this.validGroups[n] = true;
                }
                if (b2) {
                    if (n2 <= -417788481) {
                        throw new IllegalStateException();
                    }
                    this.bb[n] = class108.vmethod2700(array, false, 1713471491);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nd.aq(" + ')');
        }
    }
    
    @Override
    void aj(final int n) {
        final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingWrites.at(n + (-1596339445 * this.index << 16));
        if (null != netFileRequest) {
            NetCache.NetCache_pendingWritesQueue.addLast(netFileRequest);
        }
    }
    
    public int bl() {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < this.bb.length; ++i) {
            if (this.ad[i] > 0) {
                n += 100;
                n2 += this.groupLoadPercent(i, -2090642617);
            }
        }
        if (n == 0) {
            return 100;
        }
        return 100 * n2 / n;
    }
    
    public static void jo(final Archive archive) {
        if (archive == null) {
            archive.bv();
        }
        archive.field3459 = -922247218;
        archive.am = new int[0];
        archive.ak = new int[0];
        archive.az = new int[0];
        archive.ad = new int[0];
        archive.ae = new int[0][];
        archive.bb = new Object[0];
        archive.bi = new Object[0][];
    }
    
    public void dg() {
        this.loadAllLocal(302914766);
    }
    
    public static boolean oo(final Archive archive) {
        return 1 == 2103956439 * archive.field3459;
    }
    
    public void bz(final ArchiveDisk archiveDisk, final int i, final byte[] array, final boolean b) {
        if (this.archiveDisk == archiveDisk) {
            if (this.field3459 * 2103956439 == 1) {
                throw new RuntimeException();
            }
            if (null == array) {
                Message.isFromFriend(this, 255, -1596339445 * this.index, -1710883613 * this.indexCrc, (byte)0, true, (byte)5);
                return;
            }
            Archive.Archive_crc.reset();
            Archive.Archive_crc.update(array, 0, array.length);
            if ((int)Archive.Archive_crc.getValue() != -1710883613 * this.indexCrc) {
                Message.isFromFriend(this, 255, this.index * -1596339445, -1710883613 * this.indexCrc, (byte)0, true, (byte)44);
                return;
            }
            final Buffer buffer = new Buffer(class13.decompressBytes(array, -1117233973));
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra != 5 && 6 != ra) {
                throw new RuntimeException(ra + "," + -1596339445 * this.index + "," + i);
            }
            int int1 = 0;
            if (ra >= 6) {
                int1 = buffer.readInt(-1702203869);
            }
            if (int1 != 17451109 * this.indexVersion) {
                Message.isFromFriend(this, 255, this.index * -1596339445, -1710883613 * this.indexCrc, (byte)0, true, (byte)90);
                return;
            }
            AbstractArchive.pw(this, array, (byte)104);
            this.loadAllLocal(1517957226);
        }
        else {
            if (!b && -2028669797 * this.field3462 == i) {
                this.field3459 = -461123609;
            }
            if (array == null || array.length <= 2) {
                this.validGroups[i] = false;
                if (this.field3460 || b) {
                    Message.isFromFriend(this, -1596339445 * this.index, i, this.ak[i], (byte)2, b, (byte)111);
                }
                return;
            }
            Archive.Archive_crc.reset();
            Archive.Archive_crc.update(array, 0, array.length - 2);
            final int n = (int)Archive.Archive_crc.getValue();
            final int n2 = ((array[array.length - 2] & 0xFF) << 8) + (array[array.length - 1] & 0xFF);
            if (this.ak[i] != n || n2 != this.az[i]) {
                this.validGroups[i] = false;
                if (this.field3460 || b) {
                    Message.isFromFriend(this, -1596339445 * this.index, i, this.ak[i], (byte)2, b, (byte)64);
                }
                return;
            }
            this.validGroups[i] = true;
            if (b) {
                this.bb[i] = class108.vmethod2700(array, false, 2026475881);
            }
        }
    }
    
    public static int ww(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        return BZip2Decompressor.BZip2Decompressor_decompress(array, n, array2, n2, n3);
    }
    
    @Override
    int bj(final int n) {
        if (this.bb[n] != null) {
            return 100;
        }
        if (this.validGroups[n]) {
            return 100;
        }
        return class20.method83(-1596339445 * this.index, n, -964267539);
    }
    
    public static void gr(final Archive archive, final int n, final int n2, final int n3, final byte b, final boolean b2) {
        Message.isFromFriend(archive, n, n2, n3, b, b2, (byte)12);
    }
    
    void bm() {
        this.validGroups = new boolean[this.bb.length];
        for (int i = 0; i < this.validGroups.length; ++i) {
            this.validGroups[i] = false;
        }
        if (null == this.masterDisk) {
            this.field3459 = -461123609;
            return;
        }
        this.field3462 = -631230867;
        for (int j = 0; j < this.validGroups.length; ++j) {
            if (this.ad[j] > 0) {
                Clips.method1359(j, this.masterDisk, this, -35309556);
                this.field3462 = 631230867 * j;
            }
        }
        if (this.field3462 * -2028669797 == -1) {
            this.field3459 = -461123609;
        }
    }
    
    void bk(final int n, final byte[] array, final boolean b, final boolean b2) {
        if (b) {
            if (this.field3459 * 2103956439 == 1) {
                throw new RuntimeException();
            }
            if (this.archiveDisk != null) {
                MenuAction.method439(this.index * -1596339445, array, this.archiveDisk, (byte)6);
            }
            AbstractArchive.pw(this, array, (byte)104);
            this.loadAllLocal(1851569992);
        }
        else {
            array[array.length - 2] = (byte)(this.az[n] >> 8);
            array[array.length - 1] = (byte)this.az[n];
            if (this.masterDisk != null) {
                MenuAction.method439(n, array, this.masterDisk, (byte)42);
                this.validGroups[n] = true;
            }
            if (b2) {
                this.bb[n] = class108.vmethod2700(array, false, 727777261);
            }
        }
    }
    
    public boolean ah() {
        return 1 == -2065606570 * this.field3459;
    }
    
    public static void tu(final Archive archive, final int n, final int n2) {
        if (archive == null) {
            archive.as(n);
            return;
        }
        archive.indexCrc = n * 215951563;
        archive.indexVersion = 1459300717 * n2;
        if (archive.archiveDisk != null) {
            final int n3 = archive.index * -1596339445;
            final ArchiveDisk archiveDisk = archive.archiveDisk;
            byte[] data = null;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                for (ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); archiveDiskAction != null; archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
                    if (archiveDiskAction.hr == n3 && archiveDiskAction.archiveDisk == archiveDisk && 0 == -1329235479 * archiveDiskAction.type) {
                        data = archiveDiskAction.data;
                        break;
                    }
                }
            }
            if (null != data) {
                bd(archive, archiveDisk, n3, data, true, (byte)76);
            }
            else {
                bd(archive, archiveDisk, n3, ArchiveDisk.ef(archiveDisk, n3, 867150001), true, (byte)118);
            }
        }
        else {
            Message.isFromFriend(archive, 255, -1596339445 * archive.index, archive.indexCrc * -1710883613, (byte)0, true, (byte)45);
        }
    }
    
    public void zw(final ArchiveDisk archiveDisk, final ArchiveDisk archiveDisk2, final int n, final boolean b, final boolean b2, final boolean b3) {
        if (n >= 0 && n < 21) {
            Client.az[n] = this;
        }
    }
    
    public boolean bu(final int n) {
        return this.validGroups[n];
    }
}
