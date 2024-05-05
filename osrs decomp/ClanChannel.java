import java.io.IOException;
import java.net.URLConnection;
import net.runelite.api.events.ClanMemberLeft;
import net.runelite.api.events.ClanMemberJoined;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ClanChannel extends Node implements net.runelite.api.clan.ClanChannel
{
    static final float ao = 75.56675f;
    public byte field1396;
    public List members;
    int[] sortedMembers;
    long field1399;
    public String name;
    static final int do = 8;
    public byte field1401;
    boolean field1402;
    static int[] ByteArrayPool_alternativeSizes;
    boolean field1404;
    
    public String getName() {
        return this.name;
    }
    
    public ClanChannel(final Buffer buffer) {
        this.field1404 = true;
        this.name = null;
        oi(this, buffer, -1838416622);
    }
    
    static {
        new BitSet(65536);
    }
    
    void ad(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (0x0 != (ra & 0x1)) {
            this.field1402 = true;
        }
        if ((ra & 0x2) != 0x0) {
            this.field1404 = true;
        }
        int ra2 = 2;
        if (0x0 != (ra & 0x4)) {
            ra2 = Buffer.ra(buffer, (byte)7);
        }
        this.hr = Buffer.ks(buffer, (byte)1);
        this.field1399 = Buffer.ks(buffer, (byte)1) * -5510785032985703105L;
        this.name = buffer.readStringCp1252NullTerminated((byte)0);
        Buffer.kn(buffer, 1404535452);
        this.field1401 = Buffer.wu(buffer, 435772489);
        this.field1396 = Buffer.wu(buffer, 435772489);
        final int unsignedShort = buffer.readUnsignedShort(823011272);
        if (unsignedShort > 0) {
            this.members = new ArrayList(unsignedShort);
            for (int i = 0; i < unsignedShort; ++i) {
                final ClanChannelMember clanChannelMember = new ClanChannelMember();
                if (this.field1402) {
                    Buffer.ks(buffer, (byte)1);
                }
                if (this.field1404) {
                    clanChannelMember.username = new Username(buffer.readStringCp1252NullTerminated((byte)0));
                }
                clanChannelMember.rank = Buffer.wu(buffer, 435772489);
                clanChannelMember.world = buffer.readUnsignedShort(-932343472) * 1064950933;
                if (ra2 >= 3) {
                    Buffer.kn(buffer, 1404535452);
                }
                this.members.add(i, clanChannelMember);
            }
        }
    }
    
    void ae(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (0x0 != (ra & 0x1)) {
            this.field1402 = true;
        }
        if ((ra & 0x2) != 0x0) {
            this.field1404 = true;
        }
        int ra2 = 2;
        if (0x0 != (ra & 0x4)) {
            ra2 = Buffer.ra(buffer, (byte)7);
        }
        this.hr = Buffer.ks(buffer, (byte)1);
        this.field1399 = Buffer.ks(buffer, (byte)1) * -5510785032985703105L;
        this.name = buffer.readStringCp1252NullTerminated((byte)0);
        Buffer.kn(buffer, 1404535452);
        this.field1401 = Buffer.wu(buffer, 435772489);
        this.field1396 = Buffer.wu(buffer, 435772489);
        final int unsignedShort = buffer.readUnsignedShort(579166915);
        if (unsignedShort > 0) {
            this.members = new ArrayList(unsignedShort);
            for (int i = 0; i < unsignedShort; ++i) {
                final ClanChannelMember clanChannelMember = new ClanChannelMember();
                if (this.field1402) {
                    Buffer.ks(buffer, (byte)1);
                }
                if (this.field1404) {
                    clanChannelMember.username = new Username(buffer.readStringCp1252NullTerminated((byte)0));
                }
                clanChannelMember.rank = Buffer.wu(buffer, 435772489);
                clanChannelMember.world = buffer.readUnsignedShort(-1547249498) * 820606875;
                if (ra2 >= 3) {
                    Buffer.kn(buffer, 1404535452);
                }
                this.members.add(i, clanChannelMember);
            }
        }
    }
    
    public void ta(final ClanChannelMember clanChannelMember) {
        ScriptFrame.client.getCallbacks().post((Object)new ClanMemberJoined((net.runelite.api.clan.ClanChannel)this, (net.runelite.api.clan.ClanChannelMember)clanChannelMember));
    }
    
    void ao(final int n) {
        this.members.remove(n);
        this.sortedMembers = null;
    }
    
    public int[] at() {
        if (this.sortedMembers == null) {
            final String[] array = new String[this.members.size()];
            this.sortedMembers = new int[this.members.size()];
            for (int i = 0; i < this.members.size(); ++i) {
                array[i] = ((ClanChannelMember)this.members.get(i)).username.method2643(-1374926913);
                this.sortedMembers[i] = i;
            }
            class138.method801(array, this.sortedMembers, 0, array.length - 1, (byte)1);
        }
        return this.sortedMembers;
    }
    
    public List getMembers() {
        return this.members;
    }
    
    void ak(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (0x0 != (ra & 0x1)) {
            this.field1402 = true;
        }
        if ((ra & 0x2) != 0x0) {
            this.field1404 = true;
        }
        int ra2 = 2;
        if (0x0 != (ra & 0x4)) {
            ra2 = Buffer.ra(buffer, (byte)7);
        }
        this.hr = Buffer.ks(buffer, (byte)1);
        this.field1399 = Buffer.ks(buffer, (byte)1) * -5510785032985703105L;
        this.name = buffer.readStringCp1252NullTerminated((byte)0);
        Buffer.kn(buffer, 1404535452);
        this.field1401 = Buffer.wu(buffer, 435772489);
        this.field1396 = Buffer.wu(buffer, 435772489);
        final int unsignedShort = buffer.readUnsignedShort(811224520);
        if (unsignedShort > 0) {
            this.members = new ArrayList(unsignedShort);
            for (int i = 0; i < unsignedShort; ++i) {
                final ClanChannelMember clanChannelMember = new ClanChannelMember();
                if (this.field1402) {
                    Buffer.ks(buffer, (byte)1);
                }
                if (this.field1404) {
                    clanChannelMember.username = new Username(buffer.readStringCp1252NullTerminated((byte)0));
                }
                clanChannelMember.rank = Buffer.wu(buffer, 435772489);
                clanChannelMember.world = buffer.readUnsignedShort(-611861481) * 820606875;
                if (ra2 >= 3) {
                    Buffer.kn(buffer, 1404535452);
                }
                this.members.add(i, clanChannelMember);
            }
        }
    }
    
    public int av() {
        return this.members.size();
    }
    
    public int as(final String anotherString) {
        if (!this.field1404) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int i = 0; i < this.members.size(); ++i) {
            if (((ClanChannelMember)this.members.get(i)).username.getName(-710264960).equalsIgnoreCase(anotherString)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int[] qk(final ClanChannel clanChannel) {
        if (clanChannel.sortedMembers == null) {
            final String[] array = new String[clanChannel.members.size()];
            clanChannel.sortedMembers = new int[clanChannel.members.size()];
            for (int i = 0; i < clanChannel.members.size(); ++i) {
                array[i] = ((ClanChannelMember)clanChannel.members.get(i)).username.method2643(-1927218707);
                clanChannel.sortedMembers[i] = i;
            }
            class138.method801(array, clanChannel.sortedMembers, 0, array.length - 1, (byte)1);
        }
        return clanChannel.sortedMembers;
    }
    
    public static int nt(final ClanChannel clanChannel, final String anotherString) {
        if (!clanChannel.field1404) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int i = 0; i < clanChannel.members.size(); ++i) {
            if (((ClanChannelMember)clanChannel.members.get(i)).username.getName(-710264960).equalsIgnoreCase(anotherString)) {
                return i;
            }
        }
        return -1;
    }
    
    void az(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (0x0 != (ra & 0x1)) {
            this.field1402 = true;
        }
        if ((ra & 0x2) != 0x0) {
            this.field1404 = true;
        }
        int ra2 = 2;
        if (0x0 != (ra & 0x4)) {
            ra2 = Buffer.ra(buffer, (byte)7);
        }
        this.hr = Buffer.ks(buffer, (byte)1);
        this.field1399 = Buffer.ks(buffer, (byte)1) * -5510785032985703105L;
        this.name = buffer.readStringCp1252NullTerminated((byte)0);
        Buffer.kn(buffer, 1404535452);
        this.field1401 = Buffer.wu(buffer, 435772489);
        this.field1396 = Buffer.wu(buffer, 435772489);
        final int unsignedShort = buffer.readUnsignedShort(-961907598);
        if (unsignedShort > 0) {
            this.members = new ArrayList(unsignedShort);
            for (int i = 0; i < unsignedShort; ++i) {
                final ClanChannelMember clanChannelMember = new ClanChannelMember();
                if (this.field1402) {
                    Buffer.ks(buffer, (byte)1);
                }
                if (this.field1404) {
                    clanChannelMember.username = new Username(buffer.readStringCp1252NullTerminated((byte)0));
                }
                clanChannelMember.rank = Buffer.wu(buffer, 435772489);
                clanChannelMember.world = buffer.readUnsignedShort(-391320621) * 820606875;
                if (ra2 >= 3) {
                    Buffer.kn(buffer, 1404535452);
                }
                this.members.add(i, clanChannelMember);
            }
        }
    }
    
    void ax(final int n) {
        this.members.remove(n);
        this.sortedMembers = null;
    }
    
    void ay(final ClanChannelMember clanChannelMember) {
        this.members.add(clanChannelMember);
        this.sortedMembers = null;
    }
    
    public static int pl(final ClanChannel clanChannel, final String anotherString) {
        if (!clanChannel.field1404) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int i = 0; i < clanChannel.members.size(); ++i) {
            if (((ClanChannelMember)clanChannel.members.get(i)).username.getName(-710264960).equalsIgnoreCase(anotherString)) {
                return i;
            }
        }
        return -1;
    }
    
    void removeMember(final int n, final byte b) {
        this.kd(n);
        try {
            this.members.remove(n);
            this.sortedMembers = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.aw(" + ')');
        }
    }
    
    static final int addMember(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            return n3 * n2 - n * n4 >> 16;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.an(" + ')');
        }
    }
    
    void addMember(final ClanChannelMember clanChannelMember, final int n) {
        try {
            this.members.add(clanChannelMember);
            this.sortedMembers = null;
            this.ta(clanChannelMember);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.an(" + ')');
        }
    }
    
    public int method898(final int n) {
        try {
            return this.members.size();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.ac(" + ')');
        }
    }
    
    public int[] pi() {
        return this.getSortedMembers(67863678);
    }
    
    public int method897(final String anotherString, final int n) {
        try {
            if (this.field1402) {
                int i = 0;
                while (i < this.members.size()) {
                    if (n == -1018251304) {
                        throw new IllegalStateException();
                    }
                    if (((ClanChannelMember)this.members.get(i)).username.getName(-710264960).equalsIgnoreCase(anotherString)) {
                        if (n == -1018251304) {
                            throw new IllegalStateException();
                        }
                        return i;
                    }
                    else {
                        ++i;
                    }
                }
                return -1;
            }
            if (n == -1018251304) {
                throw new IllegalStateException();
            }
            throw new RuntimeException("Displaynames not available");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.au(" + ')');
        }
    }
    
    void ai(final int n) {
        this.members.remove(n);
        this.sortedMembers = null;
    }
    
    public void kd(final int n) {
        ScriptFrame.client.getCallbacks().post((Object)new ClanMemberLeft((net.runelite.api.clan.ClanChannel)this, (net.runelite.api.clan.ClanChannelMember)this.getMembers().get(n)));
    }
    
    public static URLConnection rq(final class108 class108, final UrlRequest urlRequest) throws IOException {
        if (class108 == null) {
            class108.bo(urlRequest);
        }
        final URLConnection openConnection = urlRequest.field1152.openConnection();
        class108.aw(openConnection, 68666793);
        return openConnection;
    }
    
    public int[] getSortedMembers(final int n) {
        try {
            if (this.sortedMembers == null) {
                final String[] array = new String[this.members.size()];
                this.sortedMembers = new int[this.members.size()];
                for (int i = 0; i < this.members.size(); ++i) {
                    array[i] = ((ClanChannelMember)this.members.get(i)).username.method2643(-1558017121);
                    this.sortedMembers[i] = i;
                }
                class138.method801(array, this.sortedMembers, 0, array.length - 1, (byte)1);
            }
            return this.sortedMembers;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.af(" + ')');
        }
    }
    
    void method900(final Buffer buffer, final int n) {
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (0x0 != (ra & 0x1)) {
                if (n != -1838416622) {
                    throw new IllegalStateException();
                }
                this.field1402 = true;
            }
            if ((ra & 0x2) != 0x0) {
                if (n != -1838416622) {
                    throw new IllegalStateException();
                }
                this.field1404 = true;
            }
            int ra2 = 2;
            if (0x0 != (ra & 0x4)) {
                if (n != -1838416622) {
                    return;
                }
                ra2 = Buffer.ra(buffer, (byte)7);
            }
            this.hr = Buffer.ks(buffer, (byte)1);
            this.field1399 = Buffer.ks(buffer, (byte)1) * -5510785032985703105L;
            this.name = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
            Buffer.kn(buffer, 1404535452);
            this.field1401 = Buffer.wu(buffer, 435772489);
            this.field1396 = Buffer.wu(buffer, 435772489);
            final int method2518 = buffer.method2518(-1652527705);
            if (method2518 > 0) {
                if (n != -1838416622) {
                    throw new IllegalStateException();
                }
                this.members = new ArrayList(method2518);
                for (int i = 0; i < method2518; ++i) {
                    if (n != -1838416622) {
                        return;
                    }
                    final ClanChannelMember clanChannelMember = new ClanChannelMember();
                    if (this.field1402) {
                        if (n != -1838416622) {
                            throw new IllegalStateException();
                        }
                        Buffer.ks(buffer, (byte)1);
                    }
                    if (this.field1402) {
                        if (n != -1838416622) {
                            throw new IllegalStateException();
                        }
                        clanChannelMember.username = new Username(buffer.readStringCp1252NullTerminated((byte)0));
                    }
                    clanChannelMember.rank = Buffer.wu(buffer, 435772489);
                    clanChannelMember.world = buffer.method2518(50854233) * 820606875;
                    if (ra2 >= 3) {
                        Buffer.kn(buffer, 1404535452);
                    }
                    this.members.add(i, clanChannelMember);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.ab(" + ')');
        }
    }
    
    public int aj(final String anotherString) {
        if (!this.field1404) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int i = 0; i < this.members.size(); ++i) {
            if (((ClanChannelMember)this.members.get(i)).username.getName(-710264960).equalsIgnoreCase(anotherString)) {
                return i;
            }
        }
        return -1;
    }
    
    public int ag() {
        return this.members.size();
    }
    
    public static int iq(final ClanChannel clanChannel, final String anotherString, final int n) {
        if (clanChannel == null) {
            clanChannel.method897(anotherString, n);
        }
        try {
            if (clanChannel.field1404) {
                int i = 0;
                while (i < clanChannel.members.size()) {
                    if (n == -1018251304) {
                        throw new IllegalStateException();
                    }
                    if (((ClanChannelMember)clanChannel.members.get(i)).username.getName(-710264960).equalsIgnoreCase(anotherString)) {
                        if (n == -1018251304) {
                            throw new IllegalStateException();
                        }
                        return i;
                    }
                    else {
                        ++i;
                    }
                }
                return -1;
            }
            if (n == -1018251304) {
                throw new IllegalStateException();
            }
            throw new RuntimeException("Displaynames not available");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.au(" + ')');
        }
    }
    
    public static void oi(final ClanChannel clanChannel, final Buffer buffer, final int n) {
        if (clanChannel == null) {
            clanChannel.method900(buffer, n);
        }
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (0x0 != (ra & 0x1)) {
                if (n != -1838416622) {
                    throw new IllegalStateException();
                }
                clanChannel.field1402 = true;
            }
            if ((ra & 0x2) != 0x0) {
                if (n != -1838416622) {
                    throw new IllegalStateException();
                }
                clanChannel.field1404 = true;
            }
            int ra2 = 2;
            if (0x0 != (ra & 0x4)) {
                if (n != -1838416622) {
                    return;
                }
                ra2 = Buffer.ra(buffer, (byte)7);
            }
            clanChannel.hr = Buffer.ks(buffer, (byte)1);
            clanChannel.field1399 = Buffer.ks(buffer, (byte)1) * -5510785032985703105L;
            clanChannel.name = buffer.readStringCp1252NullTerminated((byte)0);
            Buffer.kn(buffer, 1404535452);
            clanChannel.field1401 = Buffer.wu(buffer, 435772489);
            clanChannel.field1396 = Buffer.wu(buffer, 435772489);
            final int unsignedShort = buffer.readUnsignedShort(-1652527705);
            if (unsignedShort > 0) {
                if (n != -1838416622) {
                    throw new IllegalStateException();
                }
                clanChannel.members = new ArrayList(unsignedShort);
                for (int i = 0; i < unsignedShort; ++i) {
                    if (n != -1838416622) {
                        return;
                    }
                    final ClanChannelMember clanChannelMember = new ClanChannelMember();
                    if (clanChannel.field1402) {
                        if (n != -1838416622) {
                            throw new IllegalStateException();
                        }
                        Buffer.ks(buffer, (byte)1);
                    }
                    if (clanChannel.field1404) {
                        if (n != -1838416622) {
                            throw new IllegalStateException();
                        }
                        clanChannelMember.username = new Username(buffer.readStringCp1252NullTerminated((byte)0));
                    }
                    clanChannelMember.rank = Buffer.wu(buffer, 435772489);
                    clanChannelMember.world = buffer.readUnsignedShort(50854233) * 820606875;
                    if (ra2 >= 3) {
                        Buffer.kn(buffer, 1404535452);
                    }
                    clanChannel.members.add(i, clanChannelMember);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gj.ab(" + ')');
        }
    }
    
    public net.runelite.api.clan.ClanChannelMember findMember(String nv) {
        nv = ScriptFrame.client.ad(nv, ScriptFrame.client.cq()).nv();
        if (nv == null) {
            return null;
        }
        final List members = this.getMembers();
        final int[] pi = this.pi();
        int i = 0;
        int n = pi.length - 1;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final ClanChannelMember clanChannelMember = members.get(pi[n2]);
            final int compareTo = clanChannelMember.wj().nv().compareTo(nv);
            if (compareTo < 0) {
                i = n2 + 1;
            }
            else {
                if (compareTo <= 0) {
                    return (net.runelite.api.clan.ClanChannelMember)clanChannelMember;
                }
                n = n2 - 1;
            }
        }
        return null;
    }
}
