import net.runelite.api.EnumComposition;
import net.runelite.api.clan.ClanTitle;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanMember;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ClanSettings implements net.runelite.api.clan.ClanSettings
{
    static final int hy = 16;
    public byte field1351;
    boolean useNames;
    public int bannedMemberCount;
    int field1356;
    public String name;
    int field1354;
    public boolean allowGuests;
    long[] memberHashes;
    public byte field1359;
    public byte field1360;
    IterableNodeHashTable parameters;
    public int memberCount;
    boolean useHashes;
    public byte[] memberRanks;
    int[] sortedMembers;
    static final int af = 6;
    public int[] field1366;
    int[] field1367;
    public int currentOwner;
    public byte field1369;
    long field1370;
    long[] bannedMemberHashes;
    public String[] memberNames;
    public String[] bannedMemberNames;
    public int field1374;
    public boolean[] field1375;
    static Language clientLanguage;
    
    public String getName() {
        return this.name;
    }
    
    public ClanSettings(final Buffer buffer) {
        this.field1356 = 0;
        this.name = null;
        this.field1354 = 0;
        this.currentOwner = -1473982125;
        this.field1374 = 671016659;
        kv(this, buffer, (byte)(-101));
    }
    
    void cs(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra >= 1 && ra <= 6) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if ((ra2 & 0x1) != 0x0) {
                this.useHashes = true;
            }
            if (0x0 != (ra2 & 0x2)) {
                this.useNames = true;
            }
            if (!this.useHashes) {
                this.memberHashes = null;
                this.bannedMemberHashes = null;
            }
            if (!this.useNames) {
                this.memberNames = null;
                this.bannedMemberNames = null;
            }
            this.field1356 = buffer.readInt(-2127263138) * 2008489311;
            this.field1354 = buffer.readInt(-1274619978) * -1779678671;
            if (ra <= 3 && -468068655 * this.field1354 != 0) {
                this.field1354 += 426811296;
            }
            this.memberCount = buffer.readUnsignedShort(-2051107711) * -1836992001;
            this.bannedMemberCount = Buffer.ra(buffer, (byte)7) * 252514253;
            this.name = buffer.readStringCp1252NullTerminated((byte)0);
            if (ra >= 4) {
                buffer.readInt(-2107075621);
            }
            this.allowGuests = (Buffer.ra(buffer, (byte)7) == 1);
            this.field1369 = Buffer.wu(buffer, 435772489);
            this.field1359 = Buffer.wu(buffer, 435772489);
            this.field1360 = Buffer.wu(buffer, 435772489);
            this.field1351 = Buffer.wu(buffer, 435772489);
            if (1247430143 * this.memberCount > 0) {
                if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < 1247430143 * this.memberCount)) {
                    this.memberHashes = new long[1247430143 * this.memberCount];
                }
                if (this.useNames && (null == this.memberNames || this.memberNames.length < this.memberCount * 1247430143)) {
                    this.memberNames = new String[1247430143 * this.memberCount];
                }
                if (this.memberRanks == null || this.memberRanks.length < 1247430143 * this.memberCount) {
                    this.memberRanks = new byte[1247430143 * this.memberCount];
                }
                if (this.field1367 == null || this.field1367.length < this.memberCount * 1247430143) {
                    this.field1367 = new int[this.memberCount * 1247430143];
                }
                if (null == this.field1366 || this.field1366.length < this.memberCount * 1247430143) {
                    this.field1366 = new int[this.memberCount * 1247430143];
                }
                if (null == this.field1375 || this.field1375.length < this.memberCount * 1247430143) {
                    this.field1375 = new boolean[1247430143 * this.memberCount];
                }
                for (int i = 0; i < this.memberCount * 1247430143; ++i) {
                    if (this.useHashes) {
                        this.memberHashes[i] = Buffer.ks(buffer, (byte)1);
                    }
                    if (this.useNames) {
                        this.memberNames[i] = buffer.readStringCp1252NullTerminatedOrNull((byte)(-2));
                    }
                    this.memberRanks[i] = Buffer.wu(buffer, 435772489);
                    if (ra >= 2) {
                        this.field1367[i] = buffer.readInt(-1340078476);
                    }
                    if (ra >= 5) {
                        this.field1366[i] = buffer.readUnsignedShort(-1736267284);
                    }
                    else {
                        this.field1366[i] = 0;
                    }
                    if (ra >= 6) {
                        this.field1375[i] = (Buffer.ra(buffer, (byte)7) == 1);
                    }
                    else {
                        this.field1375[i] = false;
                    }
                }
                og(this, -377558824);
            }
            if (this.bannedMemberCount * -325159675 > 0) {
                if (this.useHashes && (null == this.bannedMemberHashes || this.bannedMemberHashes.length < -325159675 * this.bannedMemberCount)) {
                    this.bannedMemberHashes = new long[-325159675 * this.bannedMemberCount];
                }
                if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount * -325159675)) {
                    this.bannedMemberNames = new String[this.bannedMemberCount * -325159675];
                }
                for (int j = 0; j < this.bannedMemberCount * -325159675; ++j) {
                    if (this.useHashes) {
                        this.bannedMemberHashes[j] = Buffer.ks(buffer, (byte)1);
                    }
                    if (this.useNames) {
                        this.bannedMemberNames[j] = buffer.readStringCp1252NullTerminatedOrNull((byte)(-120));
                    }
                }
            }
            if (ra >= 3) {
                int unsignedShort = buffer.readUnsignedShort(821741345);
                if (unsignedShort > 0) {
                    this.parameters = new IterableNodeHashTable((unsignedShort < 16) ? class70.method442(unsignedShort, 849710483) : 16);
                    while (unsignedShort-- > 0) {
                        final int int1 = buffer.readInt(-1000553977);
                        final int n = int1 & 0x3FFFFFFF;
                        final int n2 = int1 >>> 30;
                        if (n2 == 0) {
                            this.parameters.put(new IntegerNode(buffer.readInt(-1605831139)), n);
                        }
                        else if (n2 == 1) {
                            this.parameters.put(new LongNode(Buffer.ks(buffer, (byte)1)), n);
                        }
                        else {
                            if (2 != n2) {
                                continue;
                            }
                            this.parameters.put(new ObjectNode(buffer.readStringCp1252NullTerminated((byte)0)), n);
                        }
                    }
                }
            }
            return;
        }
        throw new RuntimeException("" + ra);
    }
    
    boolean ba(final int n, final int integer) {
        if (this.parameters != null) {
            final Node aa = this.parameters.aa(n);
            if (aa != null) {
                if (aa instanceof IntegerNode) {
                    final IntegerNode integerNode = (IntegerNode)aa;
                    if (integer == integerNode.integer) {
                        return false;
                    }
                    integerNode.integer = integer;
                    return true;
                }
                else {
                    aa.hw();
                }
            }
        }
        else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new IntegerNode(integer), n);
        return true;
    }
    
    public int ae(final int n, final int n2, final int n3) {
        final Integer ap = this.ap(n);
        final int n4 = (ap == null) ? -1 : ap;
        final int n5 = 31 - n3;
        return n4 << n5 >>> n2 + n5;
    }
    
    boolean ce(final int n, String substring) {
        if (substring == null) {
            substring = "";
        }
        else if (substring.length() > 80) {
            substring = substring.substring(0, 80);
        }
        if (null != this.parameters) {
            final Node aa = this.parameters.aa(n);
            if (null != aa) {
                if (aa instanceof ObjectNode) {
                    final ObjectNode objectNode = (ObjectNode)aa;
                    if (objectNode.obj instanceof String) {
                        if (substring.equals(objectNode.obj)) {
                            return false;
                        }
                        objectNode.hw();
                        this.parameters.put(new ObjectNode(substring), objectNode.hr);
                        return true;
                    }
                }
                aa.hw();
            }
        }
        else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new ObjectNode(substring), n);
        return true;
    }
    
    public int[] bb() {
        if (null == this.sortedMembers) {
            final String[] array = new String[1247430143 * this.memberCount];
            this.sortedMembers = new int[this.memberCount * 1247430143];
            for (int i = 0; i < 1247430143 * this.memberCount; ++i) {
                array[i] = this.memberNames[i];
                if (null != array[i]) {
                    array[i] = array[i].toLowerCase();
                }
                this.sortedMembers[i] = i;
            }
            class138.method801(array, this.sortedMembers, 0, array.length - 1, (byte)1);
        }
        return this.sortedMembers;
    }
    
    public static boolean da(final ClanSettings clanSettings, final int n, String substring, final int n2) {
        if (clanSettings == null) {
            return clanSettings.method863(n, substring, n);
        }
        try {
            if (substring == null) {
                if (n2 == 942118982) {
                    throw new IllegalStateException();
                }
                substring = "";
            }
            else if (substring.length() > 80) {
                if (n2 == 942118982) {
                    throw new IllegalStateException();
                }
                substring = substring.substring(0, 80);
            }
            if (null != clanSettings.parameters) {
                if (n2 == 942118982) {
                    throw new IllegalStateException();
                }
                final Node aa = clanSettings.parameters.aa(n);
                if (null != aa) {
                    if (n2 == 942118982) {
                        throw new IllegalStateException();
                    }
                    if (aa instanceof ObjectNode) {
                        if (n2 == 942118982) {
                            throw new IllegalStateException();
                        }
                        final ObjectNode objectNode = (ObjectNode)aa;
                        if (objectNode.obj instanceof String) {
                            if (n2 == 942118982) {
                                throw new IllegalStateException();
                            }
                            if (!substring.equals(objectNode.obj)) {
                                objectNode.hw();
                                clanSettings.parameters.put(new ObjectNode(substring), objectNode.hr);
                                return true;
                            }
                            if (n2 == 942118982) {
                                throw new IllegalStateException();
                            }
                            return false;
                        }
                    }
                    aa.hw();
                }
            }
            else {
                clanSettings.parameters = new IterableNodeHashTable(4);
            }
            clanSettings.parameters.put(new ObjectNode(substring), n);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.am(" + ')');
        }
    }
    
    boolean bw(final int n, String substring) {
        if (substring == null) {
            substring = "";
        }
        else if (substring.length() > 80) {
            substring = substring.substring(0, 80);
        }
        if (null != this.parameters) {
            final Node aa = this.parameters.aa(n);
            if (null != aa) {
                if (aa instanceof ObjectNode) {
                    final ObjectNode objectNode = (ObjectNode)aa;
                    if (objectNode.obj instanceof String) {
                        if (substring.equals(objectNode.obj)) {
                            return false;
                        }
                        objectNode.hw();
                        this.parameters.put(new ObjectNode(substring), objectNode.hr);
                        return true;
                    }
                }
                aa.hw();
            }
        }
        else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new ObjectNode(substring), n);
        return true;
    }
    
    int method866(final int n, final byte b, final int n2) {
        try {
            if (126 != b) {
                if (n2 != -456839417) {
                    throw new IllegalStateException();
                }
                if (b == 127) {
                    if (n2 != -456839417) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    Label_0123: {
                        if (680027429 * this.currentOwner == n) {
                            if (n2 != -456839417) {
                                throw new IllegalStateException();
                            }
                            if (this.field1374 * -1218077019 != -1) {
                                if (n2 != -456839417) {
                                    throw new IllegalStateException();
                                }
                                if (this.memberRanks[this.field1374 * -1218077019] >= 125) {
                                    break Label_0123;
                                }
                                if (n2 != -456839417) {
                                    throw new IllegalStateException();
                                }
                            }
                            return -1;
                        }
                    }
                    if (this.memberRanks[n] == b) {
                        return -1;
                    }
                    this.memberRanks[n] = b;
                    og(this, -605335751);
                    return n;
                }
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ao(" + ')');
        }
    }
    
    void updateOwner(final int n) {
        try {
            if (1247430143 * this.field1374 == 0) {
                this.field1374 = -1473982125;
                this.bannedMemberCount = 671016659;
                return;
            }
            this.currentOwner = -1473982125;
            this.currentOwner = 671016659;
            int n2 = 0;
            byte b = this.memberRanks[0];
            for (int i = 1; i < this.memberCount * 1247430143; ++i) {
                if (n >= 551654911) {
                    return;
                }
                if (this.memberRanks[i] > b) {
                    if (n >= 551654911) {
                        throw new IllegalStateException();
                    }
                    if (b == 125) {
                        if (n >= 551654911) {
                            return;
                        }
                        this.memberCount = n2 * -671016659;
                    }
                    n2 = i;
                    b = this.memberRanks[i];
                }
                else if (this.currentOwner * -1218077019 == -1) {
                    if (n >= 551654911) {
                        throw new IllegalStateException();
                    }
                    if (this.memberRanks[i] == 125) {
                        if (n >= 551654911) {
                            throw new IllegalStateException();
                        }
                        this.memberCount = -671016659 * i;
                    }
                }
            }
            this.currentOwner = 1473982125 * n2;
            if (this.field1374 * 680027429 != -1) {
                if (n >= 551654911) {
                    throw new IllegalStateException();
                }
                this.memberRanks[680027429 * this.field1374] = 126;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.at(" + ')');
        }
    }
    
    public List getMembers() {
        final int rz = this.rz();
        final ArrayList list = new ArrayList<rl0>(rz);
        for (int i = 0; i < rz; ++i) {
            list.add(new rl0(this, i));
        }
        return list;
    }
    
    void ak(final int n) {
        if (this.useHashes) {
            if (this.bannedMemberHashes != null) {
                System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[n], 0, -325159675 * this.bannedMemberCount);
            }
            else {
                this.bannedMemberHashes = new long[n];
            }
        }
        if (this.useNames) {
            if (this.bannedMemberNames != null) {
                System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[n], 0, -818851115 * this.bannedMemberCount);
            }
            else {
                this.bannedMemberNames = new String[n];
            }
        }
    }
    
    boolean method862(final int n, int n2, final int n3, final int n4, final int n5) {
        try {
            final int n6 = (1 << n3) - 1;
            int n7;
            if (n4 == 31) {
                if (n5 == -964267539) {
                    throw new IllegalStateException();
                }
                n7 = -1;
            }
            else {
                n7 = (1 << 1 + n4) - 1;
            }
            final int n8 = n7 ^ n6;
            n2 <<= n3;
            n2 &= n8;
            if (null != this.parameters) {
                if (n5 == -964267539) {
                    throw new IllegalStateException();
                }
                final Node value = this.parameters.get((long)n);
                if (value != null) {
                    if (n5 == -964267539) {
                        throw new IllegalStateException();
                    }
                    if (value instanceof IntegerNode) {
                        if (n5 == -964267539) {
                            throw new IllegalStateException();
                        }
                        final IntegerNode integerNode = (IntegerNode)value;
                        if ((integerNode.integer & n8) != n2) {
                            final IntegerNode integerNode2 = integerNode;
                            integerNode2.integer &= ~n8;
                            final IntegerNode integerNode3 = integerNode;
                            integerNode3.integer |= n2;
                            return true;
                        }
                        if (n5 == -964267539) {
                            throw new IllegalStateException();
                        }
                        return false;
                    }
                    else {
                        value.remove();
                    }
                }
            }
            else {
                this.parameters = new IterableNodeHashTable(4);
            }
            this.parameters.put(new IntegerNode(n2), n);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.av(" + ')');
        }
    }
    
    void method864(final Buffer buffer, final byte b) {
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra >= 1) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                if (ra <= 6) {
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    if ((ra2 & 0x1) != 0x0) {
                        this.useNames = true;
                    }
                    if (0x0 != (ra2 & 0x2)) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        this.useHashes = true;
                    }
                    if (!this.useNames) {
                        this.memberHashes = null;
                        this.memberHashes = null;
                    }
                    if (!this.useNames) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        this.memberNames = null;
                        this.bannedMemberNames = null;
                    }
                    this.field1354 = buffer.method2513(-1556304769) * 2008489311;
                    this.field1356 = buffer.readVarInt(-1800847684) * -1779678671;
                    if (ra <= 3) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        if (-468068655 * this.field1354 != 0) {
                            this.field1354 += 426811296;
                        }
                    }
                    this.bannedMemberCount = buffer.jn(-1887543270) * -1836992001;
                    this.currentOwner = Buffer.ra(buffer, (byte)7) * 252514253;
                    this.name = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
                    if (ra >= 4) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        buffer.method2491(-2035497486);
                    }
                    boolean allowGuests;
                    if (Buffer.ra(buffer, (byte)7) == 1) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        allowGuests = true;
                    }
                    else {
                        allowGuests = false;
                    }
                    this.allowGuests = allowGuests;
                    this.field1359 = Buffer.wu(buffer, 435772489);
                    this.field1360 = Buffer.wu(buffer, 435772489);
                    this.field1360 = Buffer.wu(buffer, 435772489);
                    this.field1359 = Buffer.wu(buffer, 435772489);
                    Label_1078: {
                        if (1247430143 * this.bannedMemberCount > 0) {
                            Label_0524: {
                                if (this.useNames) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (this.bannedMemberHashes != null) {
                                        if (b >= 0) {
                                            return;
                                        }
                                        if (this.bannedMemberHashes.length >= 1247430143 * this.bannedMemberCount) {
                                            break Label_0524;
                                        }
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    this.bannedMemberHashes = new long[1247430143 * this.memberCount];
                                }
                            }
                            Label_0823: {
                                if (this.useHashes) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (null != this.memberNames) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        if (this.memberNames.length >= this.bannedMemberCount * 1247430143) {
                                            break Label_0823;
                                        }
                                    }
                                    this.memberNames = new String[1247430143 * this.field1374];
                                }
                            }
                            while (true) {
                                Label_1472: {
                                    if (this.memberRanks == null) {
                                        break Label_1472;
                                    }
                                    if (b >= 0) {
                                        return;
                                    }
                                    if (this.memberRanks.length < 1247430143 * this.memberCount) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        break Label_1472;
                                    }
                                    Label_0702: {
                                        if (this.sortedMembers != null) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            if (this.field1367.length >= this.bannedMemberCount * 1247430143) {
                                                break Label_0702;
                                            }
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        this.sortedMembers = new int[this.bannedMemberCount * 1247430143];
                                    }
                                    Label_0754: {
                                        if (null != this.field1366) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            if (this.field1366.length >= this.bannedMemberCount * 1247430143) {
                                                break Label_0754;
                                            }
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        this.field1366 = new int[this.currentOwner * 1247430143];
                                    }
                                    Label_1038: {
                                        if (null != this.field1375) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            if (this.field1375.length >= this.bannedMemberCount * 1247430143) {
                                                break Label_1038;
                                            }
                                            if (b >= 0) {
                                                return;
                                            }
                                        }
                                        this.field1375 = new boolean[1247430143 * this.bannedMemberCount];
                                    }
                                    for (int i = 0; i < this.bannedMemberCount * 1247430143; ++i) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        if (this.useNames) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            this.memberHashes[i] = Buffer.ks(buffer, (byte)1);
                                        }
                                        if (this.useNames) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            this.bannedMemberNames[i] = buffer.readStringCp1252NullTerminated((byte)9);
                                        }
                                        this.memberRanks[i] = Buffer.wu(buffer, 435772489);
                                        if (ra >= 2) {
                                            this.field1367[i] = buffer.method2491(-1161324087);
                                        }
                                        if (ra >= 5) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            this.field1366[i] = buffer.readShortSmart(-934010390);
                                        }
                                        else {
                                            this.field1366[i] = 0;
                                        }
                                        if (ra >= 6) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            this.field1375[i] = (Buffer.ra(buffer, (byte)7) == 1);
                                        }
                                        else {
                                            this.field1375[i] = false;
                                        }
                                    }
                                    og(this, -1881573906);
                                    break Label_1078;
                                }
                                this.memberRanks = new byte[1247430143 * this.currentOwner];
                                continue;
                            }
                        }
                    }
                    if (this.field1374 * -325159675 > 0) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        Label_1154: {
                            if (this.useNames) {
                                if (null != this.memberHashes) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (this.memberHashes.length >= -325159675 * this.currentOwner) {
                                        break Label_1154;
                                    }
                                }
                                this.bannedMemberHashes = new long[-325159675 * this.field1374];
                            }
                        }
                        Label_1214: {
                            if (this.useHashes) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                if (this.bannedMemberNames != null) {
                                    if (this.bannedMemberNames.length >= this.memberCount * -325159675) {
                                        break Label_1214;
                                    }
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                }
                                this.memberNames = new String[this.field1374 * -325159675];
                            }
                        }
                        for (int j = 0; j < this.memberCount * -325159675; ++j) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            if (this.useHashes) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                this.bannedMemberHashes[j] = Buffer.ks(buffer, (byte)1);
                            }
                            if (this.useNames) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                this.memberNames[j] = buffer.readStringCp1252NullTerminated((byte)(-72));
                            }
                        }
                    }
                    if (ra >= 3) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        int uShortSmart = buffer.readUShortSmart(-68819352);
                        if (uShortSmart > 0) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            int method442;
                            if (uShortSmart < 16) {
                                if (b >= 0) {
                                    return;
                                }
                                method442 = class70.method442(uShortSmart, 1341051994);
                            }
                            else {
                                method442 = 16;
                            }
                            this.parameters = new IterableNodeHashTable(method442);
                            while (uShortSmart-- > 0) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                final int varInt = buffer.readVarInt(-1761556438);
                                final int n = varInt & 0x3FFFFFFF;
                                final int n2 = varInt >>> 30;
                                if (n2 == 0) {
                                    this.parameters.put(new IntegerNode(buffer.readShortSmart(-2124313259)), n);
                                }
                                else if (n2 == 1) {
                                    this.parameters.put(new LongNode(Buffer.ks(buffer, (byte)1)), n);
                                }
                                else {
                                    if (2 != n2) {
                                        continue;
                                    }
                                    if (b >= 0) {
                                        return;
                                    }
                                    this.parameters.ao(new ObjectNode(buffer.readStringCp1252NullTerminated((byte)0)), n);
                                }
                            }
                        }
                    }
                    return;
                }
                if (b >= 0) {
                    throw new IllegalStateException();
                }
            }
            throw new RuntimeException("" + ra);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.as(" + ')');
        }
    }
    
    public static void ts(final ClanSettings clanSettings, final long n, String s, final int n2) {
        if (clanSettings == null) {
            clanSettings.method857(n, s, n2);
            return;
        }
        try {
            if (null != s) {
                if (n2 != -1787643966) {
                    throw new IllegalStateException();
                }
                if (s.length() == 0) {
                    if (n2 != -1787643966) {
                        throw new IllegalStateException();
                    }
                    s = null;
                }
            }
            if (n > 0L != clanSettings.useHashes) {
                throw new RuntimeException("");
            }
            if (null != s == clanSettings.useNames) {
            Label_0237:
                while (true) {
                    Label_0146: {
                        if (n <= 0L) {
                            break Label_0146;
                        }
                        if (n2 != -1787643966) {
                            throw new IllegalStateException();
                        }
                        if (null != clanSettings.bannedMemberHashes && clanSettings.bannedMemberCount * -325159675 < clanSettings.bannedMemberHashes.length) {
                            break Label_0146;
                        }
                        jo(clanSettings, -325159675 * clanSettings.bannedMemberCount + 5, (byte)(-100));
                        break Label_0237;
                    }
                    if (s != null) {
                        if (n2 != -1787643966) {
                            throw new IllegalStateException();
                        }
                        if (clanSettings.bannedMemberNames == null) {
                            continue;
                        }
                        if (clanSettings.bannedMemberCount * -325159675 >= clanSettings.bannedMemberNames.length) {
                            if (n2 != -1787643966) {
                                throw new IllegalStateException();
                            }
                            continue;
                        }
                    }
                    break;
                }
                if (clanSettings.bannedMemberHashes != null) {
                    if (n2 != -1787643966) {
                        return;
                    }
                    clanSettings.bannedMemberHashes[clanSettings.bannedMemberCount * -325159675] = n;
                }
                if (clanSettings.bannedMemberNames != null) {
                    if (n2 != -1787643966) {
                        throw new IllegalStateException();
                    }
                    clanSettings.bannedMemberNames[-325159675 * clanSettings.bannedMemberCount] = s;
                }
                clanSettings.bannedMemberCount += 252514253;
                return;
            }
            if (n2 != -1787643966) {
                throw new IllegalStateException();
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.aa(" + ')');
        }
    }
    
    public static int lc(final ClanSettings clanSettings, final int n, final byte b) {
        if (clanSettings == null) {
            clanSettings.ap(n);
        }
        if (126 == b || b == 127) {
            return -1;
        }
        if (680027429 * clanSettings.currentOwner == n && (clanSettings.field1374 * 623280815 == -1 || clanSettings.memberRanks[clanSettings.field1374 * 1719670841] < 125)) {
            return -1;
        }
        if (clanSettings.memberRanks[n] == b) {
            return -1;
        }
        clanSettings.memberRanks[n] = b;
        og(clanSettings, 167031367);
        return n;
    }
    
    void az(final int n) {
        if (this.useHashes) {
            if (this.bannedMemberHashes != null) {
                System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[n], 0, -325159675 * this.bannedMemberCount);
            }
            else {
                this.bannedMemberHashes = new long[n];
            }
        }
        if (this.useNames) {
            if (this.bannedMemberNames != null) {
                System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[n], 0, -325159675 * this.bannedMemberCount);
            }
            else {
                this.bannedMemberNames = new String[n];
            }
        }
    }
    
    boolean method850(final int n, final byte b) {
        try {
            if (this.currentOwner * 680027429 != n) {
                if (b != -1) {
                    throw new IllegalStateException();
                }
                if (this.memberRanks[n] != 126) {
                    this.memberRanks[680027429 * this.currentOwner] = 125;
                    this.field1374 = this.currentOwner * 251618433;
                    this.memberRanks[n] = 126;
                    this.currentOwner = 1473982125 * n;
                    return true;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ax(" + ')');
        }
    }
    
    void method858(final int n, final int n2) {
        try {
            if (this.useHashes) {
                if (n2 <= -1006108627) {
                    return;
                }
                if (null != this.memberHashes) {
                    if (n2 <= -1006108627) {
                        return;
                    }
                    System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[n], 0, 1247430143 * this.memberCount);
                }
                else {
                    this.memberHashes = new long[n];
                }
            }
            if (this.useNames) {
                if (n2 <= -1006108627) {
                    throw new IllegalStateException();
                }
                if (null != this.memberNames) {
                    System.arraycopy(this.memberNames, 0, this.memberNames = new String[n], 0, 1247430143 * this.memberCount);
                }
                else {
                    this.memberNames = new String[n];
                }
            }
            if (null != this.memberRanks) {
                System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[n], 0, this.memberCount * 1247430143);
            }
            else {
                this.memberRanks = new byte[n];
            }
            if (null != this.field1367) {
                if (n2 <= -1006108627) {
                    throw new IllegalStateException();
                }
                System.arraycopy(this.field1367, 0, this.field1367 = new int[n], 0, 1247430143 * this.memberCount);
            }
            else {
                this.field1367 = new int[n];
            }
            if (this.field1366 != null) {
                if (n2 <= -1006108627) {
                    return;
                }
                System.arraycopy(this.field1366, 0, this.field1366 = new int[n], 0, this.memberCount * 1247430143);
            }
            else {
                this.field1366 = new int[n];
            }
            if (null != this.field1375) {
                if (n2 <= -1006108627) {
                    throw new IllegalStateException();
                }
                System.arraycopy(this.field1375, 0, this.field1375 = new boolean[n], 0, this.memberCount * 1247430143);
            }
            else {
                this.field1375 = new boolean[n];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.af(" + ')');
        }
    }
    
    public static int rl(final ClanSettings clanSettings, final int n, int n2, final int n3, final int n4) {
        if (clanSettings == null) {
            return clanSettings.wk(n, n, n);
        }
        final int n5 = ((n4 == 31) ? -1 : ((1 << n4 + 1) - 1)) ^ (1 << n3) - 1;
        n2 <<= n3;
        n2 &= n5;
        final int n6 = clanSettings.field1367[n];
        if (n2 == (n6 & n5)) {
            return -1;
        }
        clanSettings.field1367[n] = ((n6 & ~n5) | n2);
        return n;
    }
    
    void bi(final long n, String s, final int n2) {
        if (s != null && s.length() == 0) {
            s = null;
        }
        if (n > 0L != this.useHashes) {
            throw new RuntimeException("");
        }
        if (this.useNames != (s != null)) {
            throw new RuntimeException("");
        }
        if ((n > 0L && (null == this.memberHashes || 1247430143 * this.memberCount >= this.memberHashes.length)) || (null != s && (this.memberNames == null || this.memberCount * 1247430143 >= this.memberNames.length))) {
            this.method858(5 + -145560844 * this.memberCount, 1159199860);
        }
        if (null != this.memberHashes) {
            this.memberHashes[this.memberCount * 1247430143] = n;
        }
        if (null != this.memberNames) {
            this.memberNames[-330308521 * this.memberCount] = s;
        }
        if (-1 == 680027429 * this.currentOwner) {
            this.currentOwner = this.memberCount * 28974931;
            this.memberRanks[-1679248936 * this.memberCount] = 126;
        }
        else {
            this.memberRanks[-1985220856 * this.memberCount] = 0;
        }
        this.field1367[this.memberCount * 1247430143] = 0;
        this.field1366[this.memberCount * 1247430143] = n2;
        this.field1375[1163859430 * this.memberCount] = false;
        this.memberCount -= 1781536034;
        this.sortedMembers = null;
    }
    
    boolean bv(final int n, final int integer) {
        if (this.parameters != null) {
            final Node aa = this.parameters.aa(n);
            if (aa != null) {
                if (aa instanceof IntegerNode) {
                    final IntegerNode integerNode = (IntegerNode)aa;
                    if (integer == integerNode.integer) {
                        return false;
                    }
                    integerNode.integer = integer;
                    return true;
                }
                else {
                    aa.hw();
                }
            }
        }
        else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new IntegerNode(integer), n);
        return true;
    }
    
    public static boolean wr(final ClanSettings clanSettings, final int n, int n2, final int n3, final int n4, final int n5) {
        if (clanSettings == null) {
            clanSettings.method862(n, n, n, n, n);
        }
        try {
            final int n6 = (1 << n3) - 1;
            int n7;
            if (n4 == 31) {
                if (n5 == -964267539) {
                    throw new IllegalStateException();
                }
                n7 = -1;
            }
            else {
                n7 = (1 << 1 + n4) - 1;
            }
            final int n8 = n7 ^ n6;
            n2 <<= n3;
            n2 &= n8;
            if (null != clanSettings.parameters) {
                if (n5 == -964267539) {
                    throw new IllegalStateException();
                }
                final Node aa = clanSettings.parameters.aa(n);
                if (aa != null) {
                    if (n5 == -964267539) {
                        throw new IllegalStateException();
                    }
                    if (aa instanceof IntegerNode) {
                        if (n5 == -964267539) {
                            throw new IllegalStateException();
                        }
                        final IntegerNode integerNode = (IntegerNode)aa;
                        if ((integerNode.integer & n8) != n2) {
                            final IntegerNode integerNode2 = integerNode;
                            integerNode2.integer &= ~n8;
                            final IntegerNode integerNode3 = integerNode;
                            integerNode3.integer |= n2;
                            return true;
                        }
                        if (n5 == -964267539) {
                            throw new IllegalStateException();
                        }
                        return false;
                    }
                    else {
                        aa.hw();
                    }
                }
            }
            else {
                clanSettings.parameters = new IterableNodeHashTable(4);
            }
            clanSettings.parameters.put(new IntegerNode(n2), n);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.av(" + ')');
        }
    }
    
    boolean bp(final int n, int n2, final int n3, final int n4) {
        final int n5 = ((n4 == 31) ? -1 : ((1 << 1 + n4) - 1)) ^ (1 << n3) - 1;
        n2 <<= n3;
        n2 &= n5;
        if (null != this.parameters) {
            final Node aa = this.parameters.aa(n);
            if (aa != null) {
                if (aa instanceof IntegerNode) {
                    final IntegerNode integerNode = (IntegerNode)aa;
                    if ((integerNode.integer & n5) == n2) {
                        return false;
                    }
                    final IntegerNode integerNode2 = integerNode;
                    integerNode2.integer &= ~n5;
                    final IntegerNode integerNode3 = integerNode;
                    integerNode3.integer |= n2;
                    return true;
                }
                else {
                    aa.hw();
                }
            }
        }
        else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new IntegerNode(n2), n);
        return true;
    }
    
    void cc(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra < 1 || ra > 6) {
            throw new RuntimeException("" + ra);
        }
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if ((ra2 & 0x1) != 0x0) {
            this.useHashes = true;
        }
        if (0x0 != (ra2 & 0x2)) {
            this.useNames = true;
        }
        if (!this.useHashes) {
            this.memberHashes = null;
            this.bannedMemberHashes = null;
        }
        if (!this.useNames) {
            this.memberNames = null;
            this.bannedMemberNames = null;
        }
        this.field1356 = buffer.readInt(-2048388024) * 1788049528;
        this.field1354 = buffer.readInt(-996253599) * -1779678671;
        if (ra <= 3 && -468068655 * this.field1354 != 0) {
            this.field1354 += 426811296;
        }
        this.memberCount = buffer.readUnsignedShort(-604979223) * -1836992001;
        this.bannedMemberCount = Buffer.ra(buffer, (byte)7) * 252514253;
        this.name = buffer.readStringCp1252NullTerminated((byte)0);
        if (ra >= 4) {
            buffer.readInt(-1142145566);
        }
        this.allowGuests = (Buffer.ra(buffer, (byte)7) == 1);
        this.field1369 = Buffer.wu(buffer, 435772489);
        this.field1359 = Buffer.wu(buffer, 435772489);
        this.field1360 = Buffer.wu(buffer, 435772489);
        this.field1351 = Buffer.wu(buffer, 435772489);
        if (545714165 * this.memberCount > 0) {
            if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < -716719293 * this.memberCount)) {
                this.memberHashes = new long[-1423940936 * this.memberCount];
            }
            if (this.useNames && (null == this.memberNames || this.memberNames.length < this.memberCount * 1518438574)) {
                this.memberNames = new String[2019770442 * this.memberCount];
            }
            if (this.memberRanks == null || this.memberRanks.length < 263999675 * this.memberCount) {
                this.memberRanks = new byte[1247430143 * this.memberCount];
            }
            if (this.field1367 == null || this.field1367.length < this.memberCount * 1247430143) {
                this.field1367 = new int[this.memberCount * 1247430143];
            }
            if (null == this.field1366 || this.field1366.length < this.memberCount * 1247430143) {
                this.field1366 = new int[this.memberCount * 1247430143];
            }
            if (null == this.field1375 || this.field1375.length < this.memberCount * 1247430143) {
                this.field1375 = new boolean[1247430143 * this.memberCount];
            }
            for (int i = 0; i < this.memberCount * -132914951; ++i) {
                if (this.useHashes) {
                    this.memberHashes[i] = Buffer.ks(buffer, (byte)1);
                }
                if (this.useNames) {
                    this.memberNames[i] = buffer.readStringCp1252NullTerminatedOrNull((byte)(-90));
                }
                this.memberRanks[i] = Buffer.wu(buffer, 435772489);
                if (ra >= 2) {
                    this.field1367[i] = buffer.readInt(-1980100778);
                }
                if (ra >= 5) {
                    this.field1366[i] = buffer.readUnsignedShort(-1737108440);
                }
                else {
                    this.field1366[i] = 0;
                }
                if (ra >= 6) {
                    this.field1375[i] = (Buffer.ra(buffer, (byte)7) == 1);
                }
                else {
                    this.field1375[i] = false;
                }
            }
            og(this, -729100913);
        }
        if (this.bannedMemberCount * -508080464 > 0) {
            if (this.useHashes && (null == this.bannedMemberHashes || this.bannedMemberHashes.length < 835727572 * this.bannedMemberCount)) {
                this.bannedMemberHashes = new long[-1291180691 * this.bannedMemberCount];
            }
            if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount * -1360165301)) {
                this.bannedMemberNames = new String[this.bannedMemberCount * 1942074239];
            }
            for (int j = 0; j < this.bannedMemberCount * 1214333954; ++j) {
                if (this.useHashes) {
                    this.bannedMemberHashes[j] = Buffer.ks(buffer, (byte)1);
                }
                if (this.useNames) {
                    this.bannedMemberNames[j] = buffer.readStringCp1252NullTerminatedOrNull((byte)(-104));
                }
            }
        }
        if (ra >= 3) {
            int unsignedShort = buffer.readUnsignedShort(-2141902099);
            if (unsignedShort > 0) {
                this.parameters = new IterableNodeHashTable((unsignedShort < 16) ? class70.method442(unsignedShort, 1009611624) : 16);
                while (unsignedShort-- > 0) {
                    final int int1 = buffer.readInt(-1166265930);
                    final int n = int1 & 0xDD66562;
                    final int n2 = int1 >>> 30;
                    if (n2 == 0) {
                        this.parameters.put(new IntegerNode(buffer.readInt(-1629573371)), n);
                    }
                    else if (n2 == 1) {
                        this.parameters.put(new LongNode(Buffer.ks(buffer, (byte)1)), n);
                    }
                    else {
                        if (2 != n2) {
                            continue;
                        }
                        this.parameters.put(new ObjectNode(buffer.readStringCp1252NullTerminated((byte)0)), n);
                    }
                }
            }
        }
    }
    
    public static Integer ml(final ClanSettings clanSettings, final int n) {
        if (null == clanSettings.parameters) {
            return null;
        }
        final Node aa = clanSettings.parameters.aa(n);
        if (aa != null && aa instanceof IntegerNode) {
            return new Integer(((IntegerNode)aa).integer);
        }
        return null;
    }
    
    int bt(final int n, final byte b) {
        if (126 == b || b == 127) {
            return -1;
        }
        if (680027429 * this.currentOwner == n && (this.field1374 * -1218077019 == -1 || this.memberRanks[this.field1374 * -1218077019] < 125)) {
            return -1;
        }
        if (this.memberRanks[n] == b) {
            return -1;
        }
        this.memberRanks[n] = b;
        og(this, 396434672);
        return n;
    }
    
    boolean bc(final int n, int n2, final int n3, final int n4) {
        final int n5 = ((n4 == 31) ? -1 : ((1 << 1 + n4) - 1)) ^ (1 << n3) - 1;
        n2 <<= n3;
        n2 &= n5;
        if (null != this.parameters) {
            final Node aa = this.parameters.aa(n);
            if (aa != null) {
                if (aa instanceof IntegerNode) {
                    final IntegerNode integerNode = (IntegerNode)aa;
                    if ((integerNode.integer & n5) == n2) {
                        return false;
                    }
                    final IntegerNode integerNode2 = integerNode;
                    integerNode2.integer &= ~n5;
                    final IntegerNode integerNode3 = integerNode;
                    integerNode3.integer |= n2;
                    return true;
                }
                else {
                    aa.hw();
                }
            }
        }
        else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new IntegerNode(n2), n);
        return true;
    }
    
    void ci(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra < 1 || ra > 6) {
            throw new RuntimeException("" + ra);
        }
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if ((ra2 & 0x1) != 0x0) {
            this.useHashes = true;
        }
        if (0x0 != (ra2 & 0x2)) {
            this.useNames = true;
        }
        if (!this.useHashes) {
            this.memberHashes = null;
            this.bannedMemberHashes = null;
        }
        if (!this.useNames) {
            this.memberNames = null;
            this.bannedMemberNames = null;
        }
        this.field1356 = buffer.readInt(-955878656) * 2008489311;
        this.field1354 = buffer.readInt(-1317770376) * 1112523832;
        if (ra <= 3 && -468068655 * this.field1354 != 0) {
            this.field1354 += 426811296;
        }
        this.memberCount = buffer.readUnsignedShort(-1854308305) * -1836992001;
        this.bannedMemberCount = Buffer.ra(buffer, (byte)7) * 252514253;
        this.name = buffer.readStringCp1252NullTerminated((byte)0);
        if (ra >= 4) {
            buffer.readInt(-1706941785);
        }
        this.allowGuests = (Buffer.ra(buffer, (byte)7) == 1);
        this.field1369 = Buffer.wu(buffer, 435772489);
        this.field1359 = Buffer.wu(buffer, 435772489);
        this.field1360 = Buffer.wu(buffer, 435772489);
        this.field1351 = Buffer.wu(buffer, 435772489);
        if (465272584 * this.memberCount > 0) {
            if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < 1247430143 * this.memberCount)) {
                this.memberHashes = new long[1024973209 * this.memberCount];
            }
            if (this.useNames && (null == this.memberNames || this.memberNames.length < this.memberCount * 830224546)) {
                this.memberNames = new String[172788411 * this.memberCount];
            }
            if (this.memberRanks == null || this.memberRanks.length < 1102649898 * this.memberCount) {
                this.memberRanks = new byte[-983099127 * this.memberCount];
            }
            if (this.field1367 == null || this.field1367.length < this.memberCount * 265718414) {
                this.field1367 = new int[this.memberCount * 1705491880];
            }
            if (null == this.field1366 || this.field1366.length < this.memberCount * -1700733149) {
                this.field1366 = new int[this.memberCount * -1983366732];
            }
            if (null == this.field1375 || this.field1375.length < this.memberCount * 1247430143) {
                this.field1375 = new boolean[-21781104 * this.memberCount];
            }
            for (int i = 0; i < this.memberCount * 1247430143; ++i) {
                if (this.useHashes) {
                    this.memberHashes[i] = Buffer.ks(buffer, (byte)1);
                }
                if (this.useNames) {
                    this.memberNames[i] = buffer.readStringCp1252NullTerminatedOrNull((byte)(-83));
                }
                this.memberRanks[i] = Buffer.wu(buffer, 435772489);
                if (ra >= 2) {
                    this.field1367[i] = buffer.readInt(-1112741654);
                }
                if (ra >= 5) {
                    this.field1366[i] = buffer.readUnsignedShort(318281898);
                }
                else {
                    this.field1366[i] = 0;
                }
                if (ra >= 6) {
                    this.field1375[i] = (Buffer.ra(buffer, (byte)7) == 1);
                }
                else {
                    this.field1375[i] = false;
                }
            }
            og(this, -719815457);
        }
        if (this.bannedMemberCount * -1871311559 > 0) {
            if (this.useHashes && (null == this.bannedMemberHashes || this.bannedMemberHashes.length < -325159675 * this.bannedMemberCount)) {
                this.bannedMemberHashes = new long[-219234381 * this.bannedMemberCount];
            }
            if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount * -325159675)) {
                this.bannedMemberNames = new String[this.bannedMemberCount * -325159675];
            }
            for (int j = 0; j < this.bannedMemberCount * -325159675; ++j) {
                if (this.useHashes) {
                    this.bannedMemberHashes[j] = Buffer.ks(buffer, (byte)1);
                }
                if (this.useNames) {
                    this.bannedMemberNames[j] = buffer.readStringCp1252NullTerminatedOrNull((byte)(-73));
                }
            }
        }
        if (ra >= 3) {
            int unsignedShort = buffer.readUnsignedShort(-31983983);
            if (unsignedShort > 0) {
                this.parameters = new IterableNodeHashTable((unsignedShort < 16) ? class70.method442(unsignedShort, -134668559) : 16);
                while (unsignedShort-- > 0) {
                    final int int1 = buffer.readInt(-973940819);
                    final int n = int1 & 0x3FFFFFFF;
                    final int n2 = int1 >>> 30;
                    if (n2 == 0) {
                        this.parameters.put(new IntegerNode(buffer.readInt(-1249187210)), n);
                    }
                    else if (n2 == 1) {
                        this.parameters.put(new LongNode(Buffer.ks(buffer, (byte)1)), n);
                    }
                    else {
                        if (2 != n2) {
                            continue;
                        }
                        this.parameters.put(new ObjectNode(buffer.readStringCp1252NullTerminated((byte)0)), n);
                    }
                }
            }
        }
    }
    
    public int method851(final String s, final byte b) {
        return this.ol(s);
    }
    
    boolean method863(final int n, String substring, final int n2) {
        try {
            if (substring == null) {
                if (n2 == 942118982) {
                    throw new IllegalStateException();
                }
                substring = "";
            }
            else if (substring.length() > 80) {
                if (n2 == 942118982) {
                    throw new IllegalStateException();
                }
                substring = substring.substring(0, 80);
            }
            if (null != this.parameters) {
                if (n2 == 942118982) {
                    throw new IllegalStateException();
                }
                final Node aa = this.parameters.aa(n);
                if (null != aa) {
                    if (n2 == 942118982) {
                        throw new IllegalStateException();
                    }
                    if (aa instanceof ObjectNode) {
                        if (n2 == 942118982) {
                            throw new IllegalStateException();
                        }
                        final ObjectNode objectNode = (ObjectNode)aa;
                        if (objectNode.obj instanceof String) {
                            if (n2 == 942118982) {
                                throw new IllegalStateException();
                            }
                            if (!substring.equals(objectNode.obj)) {
                                objectNode.gy();
                                this.parameters.put(new ObjectNode(substring), objectNode.hr);
                                return true;
                            }
                            if (n2 == 942118982) {
                                throw new IllegalStateException();
                            }
                            return false;
                        }
                    }
                    aa.gy();
                }
            }
            else {
                this.parameters = new IterableNodeHashTable(4);
            }
            this.parameters.put(new ObjectNode(substring), n);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.am(" + ')');
        }
    }
    
    void method855(final int n, final byte b) {
        try {
            if (n >= 0) {
                if (b >= 5) {
                    return;
                }
                if (n < 1247430143 * this.memberCount) {
                    this.currentOwner += 1836992001;
                    this.sortedMembers = null;
                    if (0 == 1247430143 * this.bannedMemberCount) {
                        if (b >= 5) {
                            throw new IllegalStateException();
                        }
                        this.memberHashes = null;
                        this.bannedMemberNames = null;
                        this.memberRanks = null;
                        this.field1367 = null;
                        this.field1366 = null;
                        this.field1375 = null;
                        this.currentOwner = -1473982125;
                        this.field1374 = 671016659;
                    }
                    else {
                        System.arraycopy(this.memberRanks, 1 + n, this.memberRanks, n, 1247430143 * this.field1374 - n);
                        System.arraycopy(this.sortedMembers, n + 1, this.sortedMembers, n, 1247430143 * this.currentOwner - n);
                        System.arraycopy(this.field1366, 1 + n, this.field1366, n, 1247430143 * this.field1374 - n);
                        System.arraycopy(this.field1375, 1 + n, this.field1375, n, this.currentOwner * 1247430143 - n);
                        if (this.bannedMemberHashes != null) {
                            if (b >= 5) {
                                throw new IllegalStateException();
                            }
                            System.arraycopy(this.bannedMemberHashes, n + 1, this.memberHashes, n, 1247430143 * this.currentOwner - n);
                        }
                        if (null != this.memberNames) {
                            if (b >= 5) {
                                throw new IllegalStateException();
                            }
                            System.arraycopy(this.memberNames, 1 + n, this.memberNames, n, this.bannedMemberCount * 1247430143 - n);
                        }
                        og(this, -163359433);
                    }
                    return;
                }
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.al(" + ')');
        }
    }
    
    public static void jp(final ClanSettings clanSettings, final int n, final byte b) {
        if (clanSettings == null) {
            clanSettings.method855(n, b);
            return;
        }
        try {
            if (n >= 0) {
                if (b >= 5) {
                    return;
                }
                if (n < 1247430143 * clanSettings.memberCount) {
                    clanSettings.memberCount += 1836992001;
                    clanSettings.sortedMembers = null;
                    if (0 == 1247430143 * clanSettings.memberCount) {
                        if (b >= 5) {
                            throw new IllegalStateException();
                        }
                        clanSettings.memberHashes = null;
                        clanSettings.memberNames = null;
                        clanSettings.memberRanks = null;
                        clanSettings.field1367 = null;
                        clanSettings.field1366 = null;
                        clanSettings.field1375 = null;
                        clanSettings.currentOwner = -1473982125;
                        clanSettings.field1374 = 671016659;
                    }
                    else {
                        System.arraycopy(clanSettings.memberRanks, 1 + n, clanSettings.memberRanks, n, 1247430143 * clanSettings.memberCount - n);
                        System.arraycopy(clanSettings.field1367, n + 1, clanSettings.field1367, n, 1247430143 * clanSettings.memberCount - n);
                        System.arraycopy(clanSettings.field1366, 1 + n, clanSettings.field1366, n, 1247430143 * clanSettings.memberCount - n);
                        System.arraycopy(clanSettings.field1375, 1 + n, clanSettings.field1375, n, clanSettings.memberCount * 1247430143 - n);
                        if (clanSettings.memberHashes != null) {
                            if (b >= 5) {
                                throw new IllegalStateException();
                            }
                            System.arraycopy(clanSettings.memberHashes, n + 1, clanSettings.memberHashes, n, 1247430143 * clanSettings.memberCount - n);
                        }
                        if (null != clanSettings.memberNames) {
                            if (b >= 5) {
                                throw new IllegalStateException();
                            }
                            System.arraycopy(clanSettings.memberNames, 1 + n, clanSettings.memberNames, n, clanSettings.memberCount * 1247430143 - n);
                        }
                        og(clanSettings, -163359433);
                    }
                    return;
                }
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.al(" + ')');
        }
    }
    
    public static int zo(final ClanSettings clanSettings, final int n, final byte b) {
        if (clanSettings == null) {
            clanSettings.bk(n);
        }
        if (126 == b || b == 1208871457) {
            return -1;
        }
        if (680027429 * clanSettings.currentOwner == n && (clanSettings.field1374 * -1218077019 == -1 || clanSettings.memberRanks[clanSettings.field1374 * -1218077019] < 1687258848)) {
            return -1;
        }
        if (clanSettings.memberRanks[n] == b) {
            return -1;
        }
        clanSettings.memberRanks[n] = b;
        og(clanSettings, -1108110189);
        return n;
    }
    
    void method853(final int n, final byte b) {
        try {
            if (this.useHashes) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (this.memberHashes != null) {
                    System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[n], 0, -325159675 * this.bannedMemberCount);
                }
                else {
                    this.memberHashes = new long[n];
                }
            }
            if (this.useHashes) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (this.memberNames != null) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[n], 0, -325159675 * this.bannedMemberCount);
                }
                else {
                    this.bannedMemberNames = new String[n];
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.an(" + ')');
        }
    }
    
    public int method852(final int n, final int n2, final int n3, final byte b) {
        try {
            int n4;
            if (31 == n3) {
                if (b <= 8) {
                    throw new IllegalStateException();
                }
                n4 = -1;
            }
            else {
                n4 = (1 << n3 + 1) - 1;
            }
            return (this.field1367[n] & n4) >>> n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ac(" + ')');
        }
    }
    
    int bq(final int n, int n2, final int n3, final int n4) {
        final int n5 = ((n4 == 31) ? -1 : ((1 << n4 + 1) - 1)) ^ (1 << n3) - 1;
        n2 <<= n3;
        n2 &= n5;
        final int n6 = this.field1367[n];
        if (n2 == (n6 & n5)) {
            return -1;
        }
        this.field1367[n] = ((n6 & ~n5) | n2);
        return n;
    }
    
    public String[] ge() {
        return this.memberNames;
    }
    
    public Integer getTitleGroupValue(final int n, final byte b) {
        try {
            if (null != this.parameters) {
                final Node aa = this.parameters.aa(n);
                if (aa != null) {
                    if (b >= 96) {
                        throw new IllegalStateException();
                    }
                    if (aa instanceof IntegerNode) {
                        return new Integer(((IntegerNode)aa).integer);
                    }
                }
                return null;
            }
            if (b >= 96) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.au(" + ')');
        }
    }
    
    void method857(final long n, String s, final int n2) {
        try {
            if (null != s) {
                if (n2 != -1787643966) {
                    throw new IllegalStateException();
                }
                if (s.length() == 0) {
                    if (n2 != -1787643966) {
                        throw new IllegalStateException();
                    }
                    s = null;
                }
            }
            if (n > 0L != this.useHashes) {
                throw new RuntimeException("");
            }
            if (null != s == this.useNames) {
            Label_0224:
                while (true) {
                    Label_0133: {
                        if (n <= 0L) {
                            break Label_0133;
                        }
                        if (n2 != -1787643966) {
                            throw new IllegalStateException();
                        }
                        if (null != this.bannedMemberHashes && this.memberCount * -325159675 < this.memberHashes.length) {
                            break Label_0133;
                        }
                        jo(this, -325159675 * this.memberCount + 5, (byte)(-100));
                        break Label_0224;
                    }
                    if (s != null) {
                        if (n2 != -1787643966) {
                            throw new IllegalStateException();
                        }
                        if (this.memberNames == null) {
                            continue;
                        }
                        if (this.bannedMemberCount * -325159675 >= this.memberNames.length) {
                            if (n2 != -1787643966) {
                                throw new IllegalStateException();
                            }
                            continue;
                        }
                    }
                    break;
                }
                if (this.bannedMemberHashes != null) {
                    if (n2 != -1787643966) {
                        return;
                    }
                    this.bannedMemberHashes[this.field1374 * -325159675] = n;
                }
                if (this.bannedMemberNames != null) {
                    if (n2 != -1787643966) {
                        throw new IllegalStateException();
                    }
                    this.memberNames[-325159675 * this.currentOwner] = s;
                }
                this.field1374 = this.bannedMemberCount + 252514253;
                return;
            }
            if (n2 != -1787643966) {
                throw new IllegalStateException();
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.aa(" + ')');
        }
    }
    
    int method860(final int n, final boolean b, final short n2) {
        try {
            if (b != this.field1375[n]) {
                this.field1375[n] = b;
                return n;
            }
            if (n2 >= 205) {
                throw new IllegalStateException();
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ai(" + ')');
        }
    }
    
    boolean bh(final int n, final long longValue) {
        if (null != this.parameters) {
            final Node aa = this.parameters.aa(n);
            if (null != aa) {
                if (aa instanceof LongNode) {
                    final LongNode longNode = (LongNode)aa;
                    if (longValue == longNode.longValue) {
                        return false;
                    }
                    longNode.longValue = longValue;
                    return true;
                }
                else {
                    aa.hw();
                }
            }
        }
        else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new LongNode(longValue), n);
        return true;
    }
    
    void bx(final int n) {
        if (n >= 0 && n < 732068671 * this.memberCount) {
            this.memberCount += 1836992001;
            this.sortedMembers = null;
            if (0 == -2105198272 * this.memberCount) {
                this.memberHashes = null;
                this.memberNames = null;
                this.memberRanks = null;
                this.field1367 = null;
                this.field1366 = null;
                this.field1375 = null;
                this.currentOwner = 2140298164;
                this.field1374 = 1281545577;
            }
            else {
                System.arraycopy(this.memberRanks, 1 + n, this.memberRanks, n, 1247430143 * this.memberCount - n);
                System.arraycopy(this.field1367, n + 1, this.field1367, n, 1247430143 * this.memberCount - n);
                System.arraycopy(this.field1366, 1 + n, this.field1366, n, -2050628105 * this.memberCount - n);
                System.arraycopy(this.field1375, 1 + n, this.field1375, n, this.memberCount * 1565577319 - n);
                if (this.memberHashes != null) {
                    System.arraycopy(this.memberHashes, n + 1, this.memberHashes, n, 1721772876 * this.memberCount - n);
                }
                if (null != this.memberNames) {
                    System.arraycopy(this.memberNames, 1 + n, this.memberNames, n, this.memberCount * -109131821 - n);
                }
                og(this, -2012342210);
            }
            return;
        }
        throw new RuntimeException("");
    }
    
    boolean method859(final int n, final long longValue) {
        try {
            if (null != this.parameters) {
                final Node aa = this.parameters.aa(n);
                if (null != aa) {
                    if (aa instanceof LongNode) {
                        final LongNode longNode = (LongNode)aa;
                        if (longValue == longNode.longValue) {
                            return false;
                        }
                        longNode.longValue = longValue;
                        return true;
                    }
                    else {
                        aa.hw();
                    }
                }
            }
            else {
                this.parameters = new IterableNodeHashTable(4);
            }
            this.parameters.put(new LongNode(longValue), n);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ar(" + ')');
        }
    }
    
    public Integer ap(final int n) {
        return this.getTitleGroupValue(n, (byte)(-112));
    }
    
    void bd(final int n) {
        this.bannedMemberCount -= 252514253;
        if (-325159675 * this.bannedMemberCount == 0) {
            this.bannedMemberHashes = null;
            this.bannedMemberNames = null;
        }
        else {
            if (this.bannedMemberHashes != null) {
                System.arraycopy(this.bannedMemberHashes, n + 1, this.bannedMemberHashes, n, this.bannedMemberCount * -325159675 - n);
            }
            if (null != this.bannedMemberNames) {
                System.arraycopy(this.bannedMemberNames, 1 + n, this.bannedMemberNames, n, this.bannedMemberCount * -325159675 - n);
            }
        }
    }
    
    boolean bg(final int n) {
        if (this.currentOwner * 680027429 != n && this.memberRanks[n] != 126) {
            this.memberRanks[680027429 * this.currentOwner] = 125;
            this.field1374 = this.currentOwner * 251618433;
            this.memberRanks[n] = 126;
            this.currentOwner = 1473982125 * n;
            return true;
        }
        return false;
    }
    
    public byte[] ra() {
        return this.memberRanks;
    }
    
    public static void gh(final ClanSettings clanSettings, final int n) {
        if (clanSettings.useHashes) {
            if (clanSettings.bannedMemberHashes != null) {
                System.arraycopy(clanSettings.bannedMemberHashes, 0, clanSettings.bannedMemberHashes = new long[n], 0, -325159675 * clanSettings.bannedMemberCount);
            }
            else {
                clanSettings.bannedMemberHashes = new long[n];
            }
        }
        if (clanSettings.useNames) {
            if (clanSettings.bannedMemberNames != null) {
                System.arraycopy(clanSettings.bannedMemberNames, 0, clanSettings.bannedMemberNames = new String[n], 0, -325159675 * clanSettings.bannedMemberCount);
            }
            else {
                clanSettings.bannedMemberNames = new String[n];
            }
        }
    }
    
    void method867(final int n, final int n2) {
        try {
            this.bannedMemberCount -= 252514253;
            if (-325159675 * this.bannedMemberCount == 0) {
                if (n2 == 1839794562) {
                    throw new IllegalStateException();
                }
                this.bannedMemberHashes = null;
                this.bannedMemberNames = null;
            }
            else {
                if (this.bannedMemberHashes != null) {
                    if (n2 == 1839794562) {
                        return;
                    }
                    System.arraycopy(this.bannedMemberHashes, n + 1, this.bannedMemberHashes, n, this.bannedMemberCount * -325159675 - n);
                }
                if (null != this.bannedMemberNames) {
                    if (n2 == 1839794562) {
                        return;
                    }
                    System.arraycopy(this.bannedMemberNames, 1 + n, this.bannedMemberNames, n, this.bannedMemberCount * -325159675 - n);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ay(" + ')');
        }
    }
    
    public static File method867(final String str, final String s, final int i, final int n) {
        try {
            String string;
            if (i == 0) {
                if (n == 616293686) {
                    throw new IllegalStateException();
                }
                string = "";
            }
            else {
                string = "" + i;
            }
            final String s2 = string;
            JagexCache.JagexCache_locationFile = new File(HorizontalAlignment.userHomeDirectory, "jagex_cl_" + str + "_" + s + s2 + ".dat");
            String pathname = null;
            String pathname2 = null;
            boolean b = false;
            if (JagexCache.JagexCache_locationFile.exists()) {
                if (n == 616293686) {
                    throw new IllegalStateException();
                }
                Label_0500: {
                    try {
                        final AccessFile accessFile = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
                        final Buffer buffer = new Buffer((int)accessFile.length(2074258523));
                        while (buffer.offset * -1633313603 < buffer.array.length) {
                            if (n == 616293686) {
                                throw new IllegalStateException();
                            }
                            final int read = accessFile.read(buffer.array, -1633313603 * buffer.offset, buffer.array.length - buffer.offset * -1633313603, 336555180);
                            if (-1 == read) {
                                if (n == 616293686) {
                                    throw new IllegalStateException();
                                }
                                throw new IOException();
                            }
                            else {
                                final Buffer buffer2 = buffer;
                                buffer2.offset += -1516355947 * read;
                            }
                        }
                        buffer.offset = 0;
                        final int ra = Buffer.ra(buffer, (byte)7);
                        if (ra >= 1) {
                            if (n == 616293686) {
                                throw new IllegalStateException();
                            }
                            if (ra <= 3) {
                                int ra2 = 0;
                                if (ra > 1) {
                                    if (n == 616293686) {
                                        throw new IllegalStateException();
                                    }
                                    ra2 = Buffer.ra(buffer, (byte)7);
                                }
                                if (ra <= 2) {
                                    pathname = buffer.readStringCp1252NullCircumfixed((short)(-16960));
                                    if (ra2 == 1) {
                                        pathname2 = buffer.readStringCp1252NullCircumfixed((short)(-19988));
                                    }
                                }
                                else {
                                    pathname = Buffer.writeStringCp1252NullTerminated(buffer, 1368086059);
                                    if (ra2 != 0) {
                                        if (n == 616293686) {
                                            throw new IllegalStateException();
                                        }
                                        pathname2 = Buffer.writeStringCp1252NullTerminated(buffer, 1819805751);
                                    }
                                }
                                accessFile.close((byte)(-14));
                                break Label_0500;
                            }
                            if (n == 616293686) {
                                throw new IllegalStateException();
                            }
                        }
                        throw new IOException("" + ra);
                    }
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                if (pathname != null && !new File(pathname).exists()) {
                    if (n == 616293686) {
                        throw new IllegalStateException();
                    }
                    pathname = null;
                }
                if (pathname != null) {
                    final File file = new File(pathname, "test.dat");
                    boolean b2;
                    try {
                        final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        final int read2 = randomAccessFile.read();
                        randomAccessFile.seek(0L);
                        randomAccessFile.write(read2);
                        randomAccessFile.seek(0L);
                        randomAccessFile.close();
                        file.delete();
                        b2 = true;
                    }
                    catch (Exception ex5) {
                        b2 = false;
                    }
                    if (!b2) {
                        pathname = null;
                    }
                }
            }
            Label_0921: {
                if (pathname == null) {
                    if (n == 616293686) {
                        throw new IllegalStateException();
                    }
                    if (i == 0) {
                        if (n == 616293686) {
                            throw new IllegalStateException();
                        }
                        for (int j = 0; j < class96.cacheSubPaths.length; ++j) {
                            if (n == 616293686) {
                                throw new IllegalStateException();
                            }
                            for (int k = 0; k < class130.cacheParentPaths.length; ++k) {
                                if (n == 616293686) {
                                    throw new IllegalStateException();
                                }
                                final File parent = new File(class130.cacheParentPaths[k] + class96.cacheSubPaths[j] + File.separatorChar + str + File.separatorChar);
                                if (parent.exists()) {
                                    if (n == 616293686) {
                                        throw new IllegalStateException();
                                    }
                                    final File file2 = new File(parent, "test.dat");
                                    boolean b3;
                                    try {
                                        final RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                                        final int read3 = randomAccessFile2.read();
                                        randomAccessFile2.seek(0L);
                                        randomAccessFile2.write(read3);
                                        randomAccessFile2.seek(0L);
                                        randomAccessFile2.close();
                                        file2.delete();
                                        b3 = true;
                                    }
                                    catch (Exception ex6) {
                                        b3 = false;
                                    }
                                    if (b3) {
                                        if (n == 616293686) {
                                            throw new IllegalStateException();
                                        }
                                        pathname = parent.toString();
                                        b = true;
                                        break Label_0921;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (pathname == null) {
                if (n == 616293686) {
                    throw new IllegalStateException();
                }
                pathname = HorizontalAlignment.userHomeDirectory + File.separatorChar + "jagexcache" + s2 + File.separatorChar + str + File.separatorChar + s + File.separatorChar;
                b = true;
            }
            if (pathname2 != null) {
                if (n == 616293686) {
                    throw new IllegalStateException();
                }
                final File file3 = new File(pathname2);
                final File parent2 = new File(pathname);
                try {
                    final File[] listFiles = file3.listFiles();
                    int l = 0;
                    while (l < listFiles.length) {
                        if (n == 616293686) {
                            throw new IllegalStateException();
                        }
                        final File file4 = listFiles[l];
                        if (!file4.renameTo(new File(parent2, file4.getName()))) {
                            if (n == 616293686) {
                                throw new IllegalStateException();
                            }
                            throw new IOException();
                        }
                        else {
                            ++l;
                        }
                    }
                }
                catch (Exception ex2) {
                    ex2.printStackTrace();
                }
                b = true;
            }
            if (b) {
                final File file5 = new File(pathname);
                final File file6 = null;
                try {
                    final AccessFile accessFile2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
                    final Buffer buffer3 = new Buffer(500);
                    buffer3.writeShort(3, (byte)36);
                    final Buffer buffer4 = buffer3;
                    int n2;
                    if (null != file6) {
                        if (n == 616293686) {
                            throw new IllegalStateException();
                        }
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    buffer4.writeShort(n2, (byte)72);
                    Buffer.ru(buffer3, file5.getPath(), (byte)(-81));
                    if (file6 != null) {
                        Buffer.ru(buffer3, file6.getPath(), (byte)(-71));
                    }
                    accessFile2.write(buffer3.array, 0, -1633313603 * buffer3.offset, 185047612);
                    accessFile2.close((byte)(-62));
                }
                catch (IOException ex3) {
                    ex3.printStackTrace();
                }
            }
            return new File(pathname);
        }
        catch (RuntimeException ex4) {
            throw HealthBar.get(ex4, "fj.af(" + ')');
        }
    }
    
    static boolean method867(final int n, final int n2, final byte b) {
        try {
            if (n == 4) {
                if (b <= 3) {
                    throw new IllegalStateException();
                }
                if (n2 >= 8) {
                    if (b <= 3) {
                        throw new IllegalStateException();
                    }
                    return false;
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.af(" + ')');
        }
    }
    
    public int[] getSortedMembers(final byte b) {
        try {
            if (null == this.sortedMembers) {
                final String[] array = new String[1247430143 * this.memberCount];
                this.sortedMembers = new int[this.memberCount * 1247430143];
                for (int i = 0; i < 1247430143 * this.memberCount; ++i) {
                    if (b <= 4) {
                        throw new IllegalStateException();
                    }
                    array[i] = this.memberNames[i];
                    if (null != array[i]) {
                        if (b <= 4) {
                            throw new IllegalStateException();
                        }
                        array[i] = array[i].toLowerCase();
                    }
                    this.sortedMembers[i] = i;
                }
                class138.method801(array, this.sortedMembers, 0, array.length - 1, (byte)1);
            }
            return this.sortedMembers;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ab(" + ')');
        }
    }
    
    void method849(final long n, String s, final int n2, final int n3) {
        try {
            if (s != null) {
                if (n3 != -706420067) {
                    return;
                }
                if (s.length() == 0) {
                    if (n3 != -706420067) {
                        throw new IllegalStateException();
                    }
                    s = null;
                }
            }
            boolean b;
            if (n > 0L) {
                if (n3 != -706420067) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            if (b != this.useHashes) {
                if (n3 != -706420067) {
                    return;
                }
                throw new RuntimeException("");
            }
            else {
                final boolean useNames = this.useNames;
                boolean b2;
                if (s != null) {
                    if (n3 != -706420067) {
                        throw new IllegalStateException();
                    }
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (useNames != b2) {
                    throw new RuntimeException("");
                }
                while (true) {
                    Label_0284: {
                        Label_0237: {
                            if (n <= 0L) {
                                break Label_0237;
                            }
                            if (n3 != -706420067) {
                                throw new IllegalStateException();
                            }
                            if (null == this.memberHashes) {
                                break Label_0284;
                            }
                            if (n3 != -706420067) {
                                return;
                            }
                            if (1247430143 * this.memberCount >= this.memberHashes.length) {
                                break Label_0284;
                            }
                            if (n3 != -706420067) {
                                return;
                            }
                            break Label_0237;
                            if (null != this.memberHashes) {
                                if (n3 != -706420067) {
                                    throw new IllegalStateException();
                                }
                                this.memberHashes[this.memberCount * 1247430143] = n;
                            }
                            if (null != this.memberNames) {
                                if (n3 != -706420067) {
                                    throw new IllegalStateException();
                                }
                                this.memberNames[1247430143 * this.memberCount] = s;
                            }
                            if (-1 == 680027429 * this.currentOwner) {
                                if (n3 != -706420067) {
                                    throw new IllegalStateException();
                                }
                                this.currentOwner = this.memberCount * 28974931;
                                this.memberRanks[1247430143 * this.memberCount] = 126;
                            }
                            else {
                                this.memberRanks[1247430143 * this.memberCount] = 0;
                            }
                            this.field1367[this.memberCount * 1247430143] = 0;
                            this.field1366[this.memberCount * 1247430143] = n2;
                            this.field1375[1247430143 * this.memberCount] = false;
                            this.memberCount -= 1836992001;
                            this.sortedMembers = null;
                            return;
                        }
                        if (null == s) {
                            continue;
                        }
                        if (n3 != -706420067) {
                            throw new IllegalStateException();
                        }
                        if (this.memberNames != null) {
                            if (n3 != -706420067) {
                                return;
                            }
                            if (this.memberCount * 1247430143 < this.memberNames.length) {
                                continue;
                            }
                            if (n3 != -706420067) {
                                return;
                            }
                        }
                    }
                    this.method858(5 + 1247430143 * this.memberCount, 1318866700);
                    continue;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.aq(" + ')');
        }
    }
    
    void aj(final int n) {
        if (this.useHashes) {
            if (null != this.memberHashes) {
                System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[n], 0, 1247430143 * this.memberCount);
            }
            else {
                this.memberHashes = new long[n];
            }
        }
        if (this.useNames) {
            if (null != this.memberNames) {
                System.arraycopy(this.memberNames, 0, this.memberNames = new String[n], 0, 1247430143 * this.memberCount);
            }
            else {
                this.memberNames = new String[n];
            }
        }
        if (null != this.memberRanks) {
            System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[n], 0, this.memberCount * 1247430143);
        }
        else {
            this.memberRanks = new byte[n];
        }
        if (null != this.field1367) {
            System.arraycopy(this.field1367, 0, this.field1367 = new int[n], 0, 1247430143 * this.memberCount);
        }
        else {
            this.field1367 = new int[n];
        }
        if (this.field1366 != null) {
            System.arraycopy(this.field1366, 0, this.field1366 = new int[n], 0, this.memberCount * 1247430143);
        }
        else {
            this.field1366 = new int[n];
        }
        if (null != this.field1375) {
            System.arraycopy(this.field1375, 0, this.field1375 = new boolean[n], 0, this.memberCount * 1247430143);
        }
        else {
            this.field1375 = new boolean[n];
        }
    }
    
    int method865(final int n, int n2, final int n3, final int n4, final int n5) {
        try {
            final int n6 = (1 << n3) - 1;
            int n7;
            if (n4 == 31) {
                if (n5 == 2043769768) {
                    throw new IllegalStateException();
                }
                n7 = -1;
            }
            else {
                n7 = (1 << n4 + 1) - 1;
            }
            final int n8 = n7 ^ n6;
            n2 <<= n3;
            n2 &= n8;
            final int n9 = this.field1367[n];
            if (n2 == (n9 & n8)) {
                return -1;
            }
            this.field1367[n] = ((n9 & ~n8) | n2);
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ag(" + ')');
        }
    }
    
    boolean bl(final int n, int n2, final int n3, final int n4) {
        final int n5 = ((n4 == 31) ? -1 : ((1 << 1 + n4) - 1)) ^ (1 << n3) - 1;
        n2 <<= n3;
        n2 &= n5;
        if (null != this.parameters) {
            final Node aa = this.parameters.aa(n);
            if (aa != null) {
                if (aa instanceof IntegerNode) {
                    final IntegerNode integerNode = (IntegerNode)aa;
                    if ((integerNode.integer & n5) == n2) {
                        return false;
                    }
                    final IntegerNode integerNode2 = integerNode;
                    integerNode2.integer &= ~n5;
                    final IntegerNode integerNode3 = integerNode;
                    integerNode3.integer |= n2;
                    return true;
                }
                else {
                    aa.hw();
                }
            }
        }
        else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new IntegerNode(n2), n);
        return true;
    }
    
    public static void jo(final ClanSettings clanSettings, final int n, final byte b) {
        if (clanSettings == null) {
            clanSettings.method853(n, b);
            return;
        }
        try {
            if (clanSettings.useHashes) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (clanSettings.bannedMemberHashes != null) {
                    System.arraycopy(clanSettings.bannedMemberHashes, 0, clanSettings.bannedMemberHashes = new long[n], 0, -325159675 * clanSettings.bannedMemberCount);
                }
                else {
                    clanSettings.bannedMemberHashes = new long[n];
                }
            }
            if (clanSettings.useNames) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (clanSettings.bannedMemberNames != null) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    System.arraycopy(clanSettings.bannedMemberNames, 0, clanSettings.bannedMemberNames = new String[n], 0, -325159675 * clanSettings.bannedMemberCount);
                }
                else {
                    clanSettings.bannedMemberNames = new String[n];
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.an(" + ')');
        }
    }
    
    void bz(final long n, String s) {
        if (null != s && s.length() == 0) {
            s = null;
        }
        if (n > 0L != this.useHashes) {
            throw new RuntimeException("");
        }
        if (null != s != this.useNames) {
            throw new RuntimeException("");
        }
        while (true) {
            Label_0032: {
                if (n > 0L && (null == this.bannedMemberHashes || this.bannedMemberCount * -325159675 >= this.bannedMemberHashes.length)) {
                    break Label_0032;
                }
                if (s != null) {
                    if (this.bannedMemberNames == null) {
                        break Label_0032;
                    }
                    if (this.bannedMemberCount * -1378027084 >= this.bannedMemberNames.length) {
                        break Label_0032;
                    }
                }
                if (this.bannedMemberHashes != null) {
                    this.bannedMemberHashes[this.bannedMemberCount * 671283150] = n;
                }
                if (this.bannedMemberNames != null) {
                    this.bannedMemberNames[-1917328715 * this.bannedMemberCount] = s;
                }
                this.bannedMemberCount -= 1813664012;
                return;
            }
            jo(this, -325159675 * this.bannedMemberCount + 5, (byte)(-20));
            continue;
        }
    }
    
    public static int iq(final ClanSettings clanSettings, final int n, final int n2, final int n3, final byte b) {
        if (clanSettings == null) {
            return clanSettings.method852(n, n, n, b);
        }
        try {
            int n4;
            if (31 == n3) {
                if (b <= 8) {
                    throw new IllegalStateException();
                }
                n4 = -1;
            }
            else {
                n4 = (1 << n3 + 1) - 1;
            }
            return (clanSettings.field1367[n] & n4) >>> n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ac(" + ')');
        }
    }
    
    public int ol(String lowerCase) {
        if (lowerCase == null || lowerCase.isEmpty()) {
            return -1;
        }
        lowerCase = lowerCase.toLowerCase();
        final String[] ge = this.ge();
        final int[] zj = this.zj();
        int i = 0;
        int n = zj.length - 1;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final int n3 = zj[n2];
            final int compareTo = ge[n3].toLowerCase().compareTo(lowerCase);
            if (compareTo < 0) {
                i = n2 + 1;
            }
            else {
                if (compareTo <= 0) {
                    return n3;
                }
                n = n2 - 1;
            }
        }
        return -1;
    }
    
    public static void kl(final ClanSettings clanSettings, final long n, String s, final int n2) {
        if (clanSettings == null) {
            clanSettings.jg(n2);
        }
        if (s != null && s.length() == 0) {
            s = null;
        }
        if (n > 0L != clanSettings.useHashes) {
            throw new RuntimeException("");
        }
        if (clanSettings.useNames != (s != null)) {
            throw new RuntimeException("");
        }
        while (true) {
            Label_0327: {
                if (n > 0L && (null == clanSettings.memberHashes || 1247430143 * clanSettings.memberCount >= clanSettings.memberHashes.length)) {
                    break Label_0327;
                }
                if (null != s) {
                    if (clanSettings.memberNames == null) {
                        break Label_0327;
                    }
                    if (clanSettings.memberCount * 1247430143 >= clanSettings.memberNames.length) {
                        break Label_0327;
                    }
                }
                if (null != clanSettings.memberHashes) {
                    clanSettings.memberHashes[clanSettings.memberCount * 1247430143] = n;
                }
                if (null != clanSettings.memberNames) {
                    clanSettings.memberNames[1247430143 * clanSettings.memberCount] = s;
                }
                if (-1 == 680027429 * clanSettings.currentOwner) {
                    clanSettings.currentOwner = clanSettings.memberCount * 28974931;
                    clanSettings.memberRanks[1247430143 * clanSettings.memberCount] = 126;
                }
                else {
                    clanSettings.memberRanks[1247430143 * clanSettings.memberCount] = 0;
                }
                clanSettings.field1367[clanSettings.memberCount * 1247430143] = 0;
                clanSettings.field1366[clanSettings.memberCount * 1247430143] = n2;
                clanSettings.field1375[1247430143 * clanSettings.memberCount] = false;
                clanSettings.memberCount -= 1836992001;
                clanSettings.sortedMembers = null;
                return;
            }
            clanSettings.method858(5 + 1247430143 * clanSettings.memberCount, -99224992);
            continue;
        }
    }
    
    public static void og(final ClanSettings clanSettings, final int n) {
        if (clanSettings == null) {
            clanSettings.updateOwner(n);
            return;
        }
        try {
            if (1247430143 * clanSettings.memberCount == 0) {
                clanSettings.currentOwner = -1473982125;
                clanSettings.field1374 = 671016659;
                return;
            }
            clanSettings.currentOwner = -1473982125;
            clanSettings.field1374 = 671016659;
            int n2 = 0;
            byte b = clanSettings.memberRanks[0];
            for (int i = 1; i < clanSettings.memberCount * 1247430143; ++i) {
                if (n >= 551654911) {
                    return;
                }
                if (clanSettings.memberRanks[i] > b) {
                    if (n >= 551654911) {
                        throw new IllegalStateException();
                    }
                    if (b == 125) {
                        if (n >= 551654911) {
                            return;
                        }
                        clanSettings.field1374 = n2 * -671016659;
                    }
                    n2 = i;
                    b = clanSettings.memberRanks[i];
                }
                else if (clanSettings.field1374 * -1218077019 == -1) {
                    if (n >= 551654911) {
                        throw new IllegalStateException();
                    }
                    if (clanSettings.memberRanks[i] == 125) {
                        if (n >= 551654911) {
                            throw new IllegalStateException();
                        }
                        clanSettings.field1374 = -671016659 * i;
                    }
                }
            }
            clanSettings.currentOwner = 1473982125 * n2;
            if (clanSettings.currentOwner * 680027429 != -1) {
                if (n >= 551654911) {
                    throw new IllegalStateException();
                }
                clanSettings.memberRanks[680027429 * clanSettings.currentOwner] = 126;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.at(" + ')');
        }
    }
    
    public int rz() {
        return this.memberCount * 1247430143;
    }
    
    public static void yj(final ClanSettings clanSettings) {
        if (1247430143 * clanSettings.memberCount == 0) {
            clanSettings.currentOwner = -1473982125;
            clanSettings.field1374 = 671016659;
            return;
        }
        clanSettings.currentOwner = -1473982125;
        clanSettings.field1374 = 671016659;
        int n = 0;
        byte b = clanSettings.memberRanks[0];
        for (int i = 1; i < clanSettings.memberCount * 1247430143; ++i) {
            if (clanSettings.memberRanks[i] > b) {
                if (b == 125) {
                    clanSettings.field1374 = n * -671016659;
                }
                n = i;
                b = clanSettings.memberRanks[i];
            }
            else if (clanSettings.field1374 * -1218077019 == -1 && clanSettings.memberRanks[i] == 125) {
                clanSettings.field1374 = -671016659 * i;
            }
        }
        clanSettings.currentOwner = 1473982125 * n;
        if (clanSettings.currentOwner * 680027429 != -1) {
            clanSettings.memberRanks[680027429 * clanSettings.currentOwner] = 126;
        }
    }
    
    public int[] zj() {
        return this.getSortedMembers((byte)33);
    }
    
    void bm(final int n) {
        this.bannedMemberCount -= 1118505787;
        if (1390543951 * this.bannedMemberCount == 0) {
            this.bannedMemberHashes = null;
            this.bannedMemberNames = null;
        }
        else {
            if (this.bannedMemberHashes != null) {
                System.arraycopy(this.bannedMemberHashes, n + 1, this.bannedMemberHashes, n, this.bannedMemberCount * -325159675 - n);
            }
            if (null != this.bannedMemberNames) {
                System.arraycopy(this.bannedMemberNames, 1 + n, this.bannedMemberNames, n, this.bannedMemberCount * -325159675 - n);
            }
        }
    }
    
    void bk(final int n) {
        if (n >= 0 && n < 1247430143 * this.memberCount) {
            this.memberCount += 1836992001;
            this.sortedMembers = null;
            if (0 == 1247430143 * this.memberCount) {
                this.memberHashes = null;
                this.memberNames = null;
                this.memberRanks = null;
                this.field1367 = null;
                this.field1366 = null;
                this.field1375 = null;
                this.currentOwner = -1473982125;
                this.field1374 = 671016659;
            }
            else {
                System.arraycopy(this.memberRanks, 1 + n, this.memberRanks, n, 1247430143 * this.memberCount - n);
                System.arraycopy(this.field1367, n + 1, this.field1367, n, 1247430143 * this.memberCount - n);
                System.arraycopy(this.field1366, 1 + n, this.field1366, n, 1247430143 * this.memberCount - n);
                System.arraycopy(this.field1375, 1 + n, this.field1375, n, this.memberCount * 1247430143 - n);
                if (this.memberHashes != null) {
                    System.arraycopy(this.memberHashes, n + 1, this.memberHashes, n, 1247430143 * this.memberCount - n);
                }
                if (null != this.memberNames) {
                    System.arraycopy(this.memberNames, 1 + n, this.memberNames, n, this.memberCount * 1247430143 - n);
                }
                og(this, -1430542149);
            }
            return;
        }
        throw new RuntimeException("");
    }
    
    public Integer jg(final int n) {
        if (null == this.parameters) {
            return null;
        }
        final Node aa = this.parameters.aa(n);
        if (aa != null && aa instanceof IntegerNode) {
            return new Integer(((IntegerNode)aa).integer);
        }
        return null;
    }
    
    boolean method861(final int n, final int integer, final int n2) {
        try {
            if (this.parameters != null) {
                if (n2 == 308798124) {
                    throw new IllegalStateException();
                }
                final Node aa = this.parameters.aa(n);
                if (aa != null) {
                    if (aa instanceof IntegerNode) {
                        final IntegerNode integerNode = (IntegerNode)aa;
                        if (integer != integerNode.integer) {
                            integerNode.integer = integer;
                            return true;
                        }
                        if (n2 == 308798124) {
                            throw new IllegalStateException();
                        }
                        return false;
                    }
                    else {
                        aa.hw();
                    }
                }
            }
            else {
                this.parameters = new IterableNodeHashTable(4);
            }
            this.parameters.put(new IntegerNode(integer), n);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ah(" + ')');
        }
    }
    
    public ClanMember findMember(final String s) {
        final int ol = this.ol(s.replace(' ', ' '));
        if (ol == -1) {
            return null;
        }
        return (ClanMember)new rl0(this, ol);
    }
    
    public ClanTitle titleForRank(final ClanRank obj) {
        assert ScriptFrame.client.isClientThread() : "must be called on client thread";
        int n = 0;
        switch (rl5.ji[obj.ordinal()]) {
            case 1: {
                n = -5;
                break;
            }
            case 2: {
                n = -4;
                break;
            }
            case 3: {
                n = -3;
                break;
            }
            case 4: {
                n = -2;
                break;
            }
            case 5: {
                n = -1;
                break;
            }
            case 6: {
                n = this.ae(1, 0, 9);
                break;
            }
            case 7: {
                n = this.ae(1, 10, 19);
                break;
            }
            case 8: {
                n = this.ae(1, 20, 29);
                break;
            }
            case 9: {
                n = this.ae(2, 0, 9);
                break;
            }
            case 10: {
                n = this.ae(2, 10, 19);
                break;
            }
            case 11: {
                n = this.ae(2, 20, 29);
                break;
            }
            case 12: {
                n = this.ae(3, 0, 9);
                break;
            }
            case 13: {
                n = this.ae(3, 10, 19);
                break;
            }
            case 14: {
                n = this.ae(3, 20, 29);
                break;
            }
            case 15: {
                n = this.ae(4, 0, 9);
                break;
            }
            case 16: {
                n = this.ae(4, 10, 19);
                break;
            }
            case 17: {
                n = this.ae(4, 20, 29);
                break;
            }
            case 18: {
                n = this.ae(5, 0, 9);
                break;
            }
            case 19: {
                n = this.ae(5, 10, 19);
                break;
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + obj);
            }
        }
        if (n == 1023) {
            return null;
        }
        final String stringValue = ((EnumComposition)ScriptFrame.client.ke(3797)).getStringValue(n);
        if (!stringValue.isEmpty()) {
            return new ClanTitle(n, stringValue);
        }
        return null;
    }
    
    public static int qg(final ClanSettings clanSettings, final int n, int n2, final int n3, final int n4, final int n5) {
        if (clanSettings == null) {
            return clanSettings.method865(n, n, n, n, n);
        }
        try {
            final int n6 = (1 << n3) - 1;
            int n7;
            if (n4 == 31) {
                if (n5 == 2043769768) {
                    throw new IllegalStateException();
                }
                n7 = -1;
            }
            else {
                n7 = (1 << n4 + 1) - 1;
            }
            final int n8 = n7 ^ n6;
            n2 <<= n3;
            n2 &= n8;
            final int n9 = clanSettings.field1367[n];
            if (n2 == (n9 & n8)) {
                return -1;
            }
            clanSettings.field1367[n] = ((n9 & ~n8) | n2);
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.ag(" + ')');
        }
    }
    
    public int wk(final int n, final int n2, final int n3) {
        return (this.field1367[n] & ((31 == n3) ? -1 : ((1 << n3 + 1) - 1))) >>> n2;
    }
    
    public static void kv(final ClanSettings clanSettings, final Buffer buffer, final byte b) {
        if (clanSettings == null) {
            clanSettings.method864(buffer, b);
        }
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra >= 1) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                if (ra <= 6) {
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    if ((ra2 & 0x1) != 0x0) {
                        clanSettings.useHashes = true;
                    }
                    if (0x0 != (ra2 & 0x2)) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        clanSettings.useNames = true;
                    }
                    if (!clanSettings.useHashes) {
                        clanSettings.memberHashes = null;
                        clanSettings.bannedMemberHashes = null;
                    }
                    if (!clanSettings.useNames) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        clanSettings.memberNames = null;
                        clanSettings.bannedMemberNames = null;
                    }
                    clanSettings.field1356 = buffer.readInt(-1556304769) * 2008489311;
                    clanSettings.field1354 = buffer.readInt(-1800847684) * -1779678671;
                    if (ra <= 3) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        if (-468068655 * clanSettings.field1354 != 0) {
                            clanSettings.field1354 += 426811296;
                        }
                    }
                    clanSettings.memberCount = buffer.readUnsignedShort(-1887543270) * -1836992001;
                    clanSettings.bannedMemberCount = Buffer.ra(buffer, (byte)7) * 252514253;
                    clanSettings.name = buffer.readStringCp1252NullTerminated((byte)0);
                    if (ra >= 4) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        buffer.readInt(-2035497486);
                    }
                    boolean allowGuests;
                    if (Buffer.ra(buffer, (byte)7) == 1) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        allowGuests = true;
                    }
                    else {
                        allowGuests = false;
                    }
                    clanSettings.allowGuests = allowGuests;
                    clanSettings.field1369 = Buffer.wu(buffer, 435772489);
                    clanSettings.field1359 = Buffer.wu(buffer, 435772489);
                    clanSettings.field1360 = Buffer.wu(buffer, 435772489);
                    clanSettings.field1351 = Buffer.wu(buffer, 435772489);
                    Label_1088: {
                        if (1247430143 * clanSettings.memberCount > 0) {
                            Label_0534: {
                                if (clanSettings.useHashes) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (clanSettings.memberHashes != null) {
                                        if (b >= 0) {
                                            return;
                                        }
                                        if (clanSettings.memberHashes.length >= 1247430143 * clanSettings.memberCount) {
                                            break Label_0534;
                                        }
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    clanSettings.memberHashes = new long[1247430143 * clanSettings.memberCount];
                                }
                            }
                            Label_0833: {
                                if (clanSettings.useNames) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (null != clanSettings.memberNames) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        if (clanSettings.memberNames.length >= clanSettings.memberCount * 1247430143) {
                                            break Label_0833;
                                        }
                                    }
                                    clanSettings.memberNames = new String[1247430143 * clanSettings.memberCount];
                                }
                            }
                            while (true) {
                                Label_1482: {
                                    if (clanSettings.memberRanks == null) {
                                        break Label_1482;
                                    }
                                    if (b >= 0) {
                                        return;
                                    }
                                    if (clanSettings.memberRanks.length < 1247430143 * clanSettings.memberCount) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        break Label_1482;
                                    }
                                    Label_0712: {
                                        if (clanSettings.field1367 != null) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            if (clanSettings.field1367.length >= clanSettings.memberCount * 1247430143) {
                                                break Label_0712;
                                            }
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        clanSettings.field1367 = new int[clanSettings.memberCount * 1247430143];
                                    }
                                    Label_0764: {
                                        if (null != clanSettings.field1366) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            if (clanSettings.field1366.length >= clanSettings.memberCount * 1247430143) {
                                                break Label_0764;
                                            }
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        clanSettings.field1366 = new int[clanSettings.memberCount * 1247430143];
                                    }
                                    Label_1048: {
                                        if (null != clanSettings.field1375) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            if (clanSettings.field1375.length >= clanSettings.memberCount * 1247430143) {
                                                break Label_1048;
                                            }
                                            if (b >= 0) {
                                                return;
                                            }
                                        }
                                        clanSettings.field1375 = new boolean[1247430143 * clanSettings.memberCount];
                                    }
                                    for (int i = 0; i < clanSettings.memberCount * 1247430143; ++i) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        if (clanSettings.useHashes) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            clanSettings.memberHashes[i] = Buffer.ks(buffer, (byte)1);
                                        }
                                        if (clanSettings.useNames) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            clanSettings.memberNames[i] = buffer.readStringCp1252NullTerminatedOrNull((byte)9);
                                        }
                                        clanSettings.memberRanks[i] = Buffer.wu(buffer, 435772489);
                                        if (ra >= 2) {
                                            clanSettings.field1367[i] = buffer.readInt(-1161324087);
                                        }
                                        if (ra >= 5) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            clanSettings.field1366[i] = buffer.readUnsignedShort(-934010390);
                                        }
                                        else {
                                            clanSettings.field1366[i] = 0;
                                        }
                                        if (ra >= 6) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            clanSettings.field1375[i] = (Buffer.ra(buffer, (byte)7) == 1);
                                        }
                                        else {
                                            clanSettings.field1375[i] = false;
                                        }
                                    }
                                    og(clanSettings, -1881573906);
                                    break Label_1088;
                                }
                                clanSettings.memberRanks = new byte[1247430143 * clanSettings.memberCount];
                                continue;
                            }
                        }
                    }
                    if (clanSettings.bannedMemberCount * -325159675 > 0) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        Label_1164: {
                            if (clanSettings.useHashes) {
                                if (null != clanSettings.bannedMemberHashes) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (clanSettings.bannedMemberHashes.length >= -325159675 * clanSettings.bannedMemberCount) {
                                        break Label_1164;
                                    }
                                }
                                clanSettings.bannedMemberHashes = new long[-325159675 * clanSettings.bannedMemberCount];
                            }
                        }
                        Label_1224: {
                            if (clanSettings.useNames) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                if (clanSettings.bannedMemberNames != null) {
                                    if (clanSettings.bannedMemberNames.length >= clanSettings.bannedMemberCount * -325159675) {
                                        break Label_1224;
                                    }
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                }
                                clanSettings.bannedMemberNames = new String[clanSettings.bannedMemberCount * -325159675];
                            }
                        }
                        for (int j = 0; j < clanSettings.bannedMemberCount * -325159675; ++j) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            if (clanSettings.useHashes) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                clanSettings.bannedMemberHashes[j] = Buffer.ks(buffer, (byte)1);
                            }
                            if (clanSettings.useNames) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                clanSettings.bannedMemberNames[j] = buffer.readStringCp1252NullTerminatedOrNull((byte)(-72));
                            }
                        }
                    }
                    if (ra >= 3) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        int unsignedShort = buffer.readUnsignedShort(-68819352);
                        if (unsignedShort > 0) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            int method442;
                            if (unsignedShort < 16) {
                                if (b >= 0) {
                                    return;
                                }
                                method442 = class70.method442(unsignedShort, 1341051994);
                            }
                            else {
                                method442 = 16;
                            }
                            clanSettings.parameters = new IterableNodeHashTable(method442);
                            while (unsignedShort-- > 0) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                final int int1 = buffer.readInt(-1761556438);
                                final int n = int1 & 0x3FFFFFFF;
                                final int n2 = int1 >>> 30;
                                if (n2 == 0) {
                                    clanSettings.parameters.put(new IntegerNode(buffer.readInt(-2124313259)), n);
                                }
                                else if (n2 == 1) {
                                    clanSettings.parameters.put(new LongNode(Buffer.ks(buffer, (byte)1)), n);
                                }
                                else {
                                    if (2 != n2) {
                                        continue;
                                    }
                                    if (b >= 0) {
                                        return;
                                    }
                                    clanSettings.parameters.put(new ObjectNode(buffer.readStringCp1252NullTerminated((byte)0)), n);
                                }
                            }
                        }
                    }
                    return;
                }
                if (b >= 0) {
                    throw new IllegalStateException();
                }
            }
            throw new RuntimeException("" + ra);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fj.as(" + ')');
        }
    }
    
    boolean bu(final int n) {
        if (this.currentOwner * 680027429 != n && this.memberRanks[n] != 126) {
            this.memberRanks[680027429 * this.currentOwner] = 125;
            this.field1374 = this.currentOwner * 251618433;
            this.memberRanks[n] = 126;
            this.currentOwner = 1473982125 * n;
            return true;
        }
        return false;
    }
}
