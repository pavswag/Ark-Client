import java.util.Iterator;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.io.IOException;
import java.util.zip.CRC32;

// 
// Decompiled by Procyon v0.5.36
// 

public class NetCache
{
    static int field3489;
    static Archive[] NetCache_archives;
    public static AbstractSocket NetCache_socket;
    public static NodeHashTable NetCache_pendingPriorityWrites;
    public static int NetCache_pendingPriorityWritesCount;
    public static NodeHashTable NetCache_pendingPriorityResponses;
    public static int NetCache_pendingPriorityResponsesCount;
    public static DualNodeDeque NetCache_pendingWritesQueue;
    public static NodeHashTable NetCache_pendingWrites;
    static boolean field3498;
    public static NodeHashTable NetCache_pendingResponses;
    public static int NetCache_pendingResponsesCount;
    public static int NetCache_loadTime;
    public static Buffer NetCache_responseHeaderBuffer;
    public static Buffer NetCache_responseArchiveBuffer;
    public static int field3504;
    static CRC32 NetCache_crc;
    public static byte field3506;
    public static int NetCache_pendingWritesCount;
    static int field3508;
    static final int cv = 28;
    public static long field3509;
    public static int NetCache_ioExceptions;
    public static int NetCache_crcMismatches;
    
    NetCache() throws Throwable {
        throw new Error();
    }
    
    static {
        NetCache.NetCache_loadTime = 0;
        NetCache.NetCache_pendingPriorityWrites = new NodeHashTable(4096);
        NetCache.NetCache_pendingPriorityWritesCount = 0;
        NetCache.NetCache_pendingPriorityResponses = new NodeHashTable(32);
        NetCache.NetCache_pendingPriorityResponsesCount = 0;
        NetCache.NetCache_pendingWritesQueue = new DualNodeDeque();
        NetCache.NetCache_pendingWrites = new NodeHashTable(4096);
        NetCache.NetCache_pendingWritesCount = 0;
        NetCache.NetCache_pendingResponses = new NodeHashTable(4096);
        NetCache.NetCache_pendingResponsesCount = 0;
        NetCache.NetCache_responseHeaderBuffer = new Buffer(8);
        NetCache.field3504 = 0;
        NetCache.NetCache_crc = new CRC32();
        NetCache.NetCache_archives = new Archive[256];
        NetCache.field3489 = -2072522323;
        NetCache.field3508 = -1684033519;
        NetCache.field3506 = 0;
        NetCache.NetCache_crcMismatches = 0;
        NetCache.NetCache_ioExceptions = 0;
    }
    
    public static void ao(final boolean b) {
        if (null == NetCache.NetCache_socket) {
            return;
        }
        try {
            final Buffer buffer = new Buffer(4);
            buffer.writeShort(b ? 2 : 3, (byte)11);
            Buffer.gi(buffer, 0, 1204057858);
            NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
        }
        catch (IOException ex) {
            try {
                NetCache.NetCache_socket.close(-1524938047);
            }
            catch (Exception ex2) {}
            NetCache.NetCache_ioExceptions -= 161323731;
            NetCache.NetCache_socket = null;
        }
    }
    
    public static boolean at() {
        final long clockNow = class96.clockNow(46679390);
        int n = (int)(clockNow - -2114584129517998633L * NetCache.field3509);
        NetCache.field3509 = -6047020038529116697L * clockNow;
        if (n > 200) {
            n = 200;
        }
        NetCache.NetCache_loadTime += n * -425972525;
        if (NetCache.NetCache_pendingResponsesCount * -1651605431 == 0 && 0 == NetCache.NetCache_pendingPriorityResponsesCount * -1952694793 && 0 == -32010957 * NetCache.NetCache_pendingWritesCount && 0 == NetCache.NetCache_pendingPriorityWritesCount * -1171541559) {
            return true;
        }
        if (NetCache.NetCache_socket == null) {
            return false;
        }
        try {
            if (NetCache.NetCache_loadTime * -942339237 > 30000) {
                throw new IOException();
            }
            while (-1952694793 * NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount * -1171541559 > 0) {
                final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                final Buffer buffer = new Buffer(4);
                buffer.writeShort(1, (byte)63);
                Buffer.gi(buffer, (int)netFileRequest.hr, 890899539);
                NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
                NetCache.NetCache_pendingPriorityResponses.put(netFileRequest, netFileRequest.hr);
                NetCache.NetCache_pendingPriorityWritesCount += 1320339335;
                NetCache.NetCache_pendingPriorityResponsesCount -= 1677618233;
            }
            while (NetCache.NetCache_pendingResponsesCount * -1651605431 < 200 && NetCache.NetCache_pendingWritesCount * -32010957 > 0) {
                final NetFileRequest netFileRequest2 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                final Buffer buffer2 = new Buffer(4);
                buffer2.writeShort(0, (byte)103);
                Buffer.gi(buffer2, (int)netFileRequest2.hr, 659683759);
                NetCache.NetCache_socket.write(buffer2.array, 0, 4, -2115422184);
                GrandExchangeOfferWorldComparator.os(netFileRequest2);
                NetCache.NetCache_pendingResponses.put(netFileRequest2, netFileRequest2.hr);
                NetCache.NetCache_pendingWritesCount += 2069940741;
                NetCache.NetCache_pendingResponsesCount -= 979537415;
            }
            for (int i = 0; i < 100; ++i) {
                final int available = NetCache.NetCache_socket.available(2015124351);
                if (available < 0) {
                    throw new IOException();
                }
                if (available == 0) {
                    break;
                }
                NetCache.NetCache_loadTime = 0;
                int n2 = 0;
                if (Script.NetCache_currentResponse == null) {
                    n2 = 8;
                }
                else if (0 == NetCache.field3504 * -1961769541) {
                    n2 = 1;
                }
                if (n2 > 0) {
                    int n3 = n2 - NetCache.NetCache_responseHeaderBuffer.offset * -1633313603;
                    if (n3 > available) {
                        n3 = available;
                    }
                    NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, -1633313603 * NetCache.NetCache_responseHeaderBuffer.offset, n3, -2106093590);
                    if (0 != NetCache.field3506) {
                        for (int j = 0; j < n3; ++j) {
                            final byte[] array = NetCache.NetCache_responseHeaderBuffer.array;
                            final int n4 = -1633313603 * NetCache.NetCache_responseHeaderBuffer.offset + j;
                            array[n4] ^= NetCache.field3506;
                        }
                    }
                    final Buffer netCache_responseHeaderBuffer = NetCache.NetCache_responseHeaderBuffer;
                    netCache_responseHeaderBuffer.offset += n3 * -1516355947;
                    if (-1633313603 * NetCache.NetCache_responseHeaderBuffer.offset < n2) {
                        break;
                    }
                    if (null == Script.NetCache_currentResponse) {
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        final int ra = Buffer.ra(NetCache.NetCache_responseHeaderBuffer, (byte)7);
                        final int unsignedShort = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(-1780904866);
                        final int ra2 = Buffer.ra(NetCache.NetCache_responseHeaderBuffer, (byte)7);
                        final int int1 = NetCache.NetCache_responseHeaderBuffer.readInt(-1524439095);
                        final long n5 = (ra << 16) + unsignedShort;
                        NetFileRequest netCache_currentResponse = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.at(n5);
                        NetCache.field3498 = true;
                        if (netCache_currentResponse == null) {
                            netCache_currentResponse = (NetFileRequest)NetCache.NetCache_pendingResponses.at(n5);
                            NetCache.field3498 = false;
                        }
                        if (null == netCache_currentResponse) {
                            throw new IOException();
                        }
                        final int n6 = (ra2 == 0) ? 5 : 9;
                        Script.NetCache_currentResponse = netCache_currentResponse;
                        (NetCache.NetCache_responseArchiveBuffer = new Buffer(n6 + int1 + Script.NetCache_currentResponse.padding)).writeShort(ra2, (byte)112);
                        NetCache.NetCache_responseArchiveBuffer.writeInt(int1, -2081835031);
                        NetCache.field3504 = -598099048;
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                    }
                    else if (NetCache.field3504 * -1961769541 == 0) {
                        if (-1 == NetCache.NetCache_responseHeaderBuffer.array[0]) {
                            NetCache.field3504 = -74762381;
                            NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        }
                        else {
                            Script.NetCache_currentResponse = null;
                        }
                    }
                }
                else {
                    final int len = NetCache.NetCache_responseArchiveBuffer.array.length - Script.NetCache_currentResponse.padding;
                    int n7 = 512 - NetCache.field3504 * -1961769541;
                    if (n7 > len - NetCache.NetCache_responseArchiveBuffer.offset * -1633313603) {
                        n7 = len - NetCache.NetCache_responseArchiveBuffer.offset * -1633313603;
                    }
                    if (n7 > available) {
                        n7 = available;
                    }
                    NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset * -1633313603, n7, -2106093590);
                    if (0 != NetCache.field3506) {
                        for (int k = 0; k < n7; ++k) {
                            final byte[] array2 = NetCache.NetCache_responseArchiveBuffer.array;
                            final int n8 = k + -1633313603 * NetCache.NetCache_responseArchiveBuffer.offset;
                            array2[n8] ^= NetCache.field3506;
                        }
                    }
                    final Buffer netCache_responseArchiveBuffer = NetCache.NetCache_responseArchiveBuffer;
                    netCache_responseArchiveBuffer.offset += n7 * -1516355947;
                    NetCache.field3504 += -74762381 * n7;
                    if (len == NetCache.NetCache_responseArchiveBuffer.offset * -1633313603) {
                        if (Script.NetCache_currentResponse.hr == 16711935L) {
                            Login.field764 = NetCache.NetCache_responseArchiveBuffer;
                            for (int l = 0; l < 256; ++l) {
                                final Archive archive = NetCache.NetCache_archives[l];
                                if (archive != null) {
                                    Login.field764.offset = l * 754054312 + 1008154857;
                                    if (-1633313603 * Login.field764.offset >= Login.field764.array.length) {
                                        if (!archive.field3465) {
                                            throw new RuntimeException("");
                                        }
                                        archive.method1872((byte)(-45));
                                    }
                                    else {
                                        archive.loadIndex(Login.field764.readInt(-1582091904), Login.field764.readInt(-1443378061), -691028);
                                    }
                                }
                            }
                        }
                        else {
                            NetCache.NetCache_crc.reset();
                            NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, len);
                            if ((int)NetCache.NetCache_crc.getValue() != Script.NetCache_currentResponse.crc * -75260527) {
                                try {
                                    NetCache.NetCache_socket.close(-643053257);
                                }
                                catch (Exception ex) {}
                                NetCache.NetCache_crcMismatches += 372675253;
                                NetCache.NetCache_socket = null;
                                NetCache.field3506 = (byte)(Math.random() * 255.0 + 1.0);
                                return false;
                            }
                            NetCache.NetCache_crcMismatches = 0;
                            NetCache.NetCache_ioExceptions = 0;
                            Archive.wy(Script.NetCache_currentResponse.archive, (int)(Script.NetCache_currentResponse.hr & 0xFFFFL), NetCache.NetCache_responseArchiveBuffer.array, 0xFF0000L == (Script.NetCache_currentResponse.hr & 0xFF0000L), NetCache.field3498, -12209136);
                        }
                        Script.NetCache_currentResponse.hw();
                        if (NetCache.field3498) {
                            NetCache.NetCache_pendingPriorityResponsesCount += 1677618233;
                        }
                        else {
                            NetCache.NetCache_pendingResponsesCount += 979537415;
                        }
                        NetCache.field3504 = 0;
                        Script.NetCache_currentResponse = null;
                        NetCache.NetCache_responseArchiveBuffer = null;
                    }
                    else {
                        if (-1961769541 * NetCache.field3504 != 512) {
                            break;
                        }
                        NetCache.field3504 = 0;
                    }
                }
            }
            return true;
        }
        catch (IOException ex2) {
            try {
                NetCache.NetCache_socket.close(2083500558);
            }
            catch (Exception ex3) {}
            NetCache.NetCache_ioExceptions -= 161323731;
            NetCache.NetCache_socket = null;
            return false;
        }
    }
    
    static int av(final int n, final int n2) {
        final long n3 = n2 + (n << 16);
        if (Script.NetCache_currentResponse != null && Script.NetCache_currentResponse.hr == n3) {
            return 1819487879 * NetCache.NetCache_responseArchiveBuffer.offset / (NetCache.NetCache_responseArchiveBuffer.array.length - Script.NetCache_currentResponse.padding) + 1;
        }
        return 0;
    }
    
    public static int as(final boolean b, final boolean b2) {
        int n = 0;
        if (b) {
            n += -1171541559 * NetCache.NetCache_pendingPriorityWritesCount + -1952694793 * NetCache.NetCache_pendingPriorityResponsesCount;
        }
        if (b2) {
            n += NetCache.NetCache_pendingWritesCount * -32010957 + -1651605431 * NetCache.NetCache_pendingResponsesCount;
        }
        return n;
    }
    
    public static void ax(final boolean b) {
        if (null == NetCache.NetCache_socket) {
            return;
        }
        try {
            final Buffer buffer = new Buffer(4);
            buffer.writeShort(b ? 2 : 3, (byte)21);
            Buffer.gi(buffer, 0, -705374037);
            NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
        }
        catch (IOException ex) {
            try {
                NetCache.NetCache_socket.close(-138721683);
            }
            catch (Exception ex2) {}
            NetCache.NetCache_ioExceptions -= 1466242362;
            NetCache.NetCache_socket = null;
        }
    }
    
    public static void ay(final boolean b) {
        if (null == NetCache.NetCache_socket) {
            return;
        }
        try {
            final Buffer buffer = new Buffer(4);
            buffer.writeShort(b ? 2 : 3, (byte)55);
            Buffer.gi(buffer, 0, 359833185);
            NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
        }
        catch (IOException ex) {
            try {
                NetCache.NetCache_socket.close(-273762386);
            }
            catch (Exception ex2) {}
            NetCache.NetCache_ioExceptions -= 161323731;
            NetCache.NetCache_socket = null;
        }
    }
    
    public static int am(final boolean b, final boolean b2) {
        int n = 0;
        if (b) {
            n += -1171541559 * NetCache.NetCache_pendingPriorityWritesCount + -1952694793 * NetCache.NetCache_pendingPriorityResponsesCount;
        }
        if (b2) {
            n += NetCache.NetCache_pendingWritesCount * -32010957 + -1651605431 * NetCache.NetCache_pendingResponsesCount;
        }
        return n;
    }
    
    public static boolean al() {
        final long clockNow = class96.clockNow(2088734227);
        int n = (int)(clockNow - -2114584129517998633L * NetCache.field3509);
        NetCache.field3509 = -6047020038529116697L * clockNow;
        if (n > 200) {
            n = 200;
        }
        NetCache.NetCache_loadTime += n * -425972525;
        if (NetCache.NetCache_pendingResponsesCount * -1651605431 == 0 && 0 == NetCache.NetCache_pendingPriorityResponsesCount * -1952694793 && 0 == -32010957 * NetCache.NetCache_pendingWritesCount && 0 == NetCache.NetCache_pendingPriorityWritesCount * -1171541559) {
            return true;
        }
        if (NetCache.NetCache_socket == null) {
            return false;
        }
        try {
            if (NetCache.NetCache_loadTime * -942339237 > 30000) {
                throw new IOException();
            }
            while (-1952694793 * NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount * -1171541559 > 0) {
                final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                final Buffer buffer = new Buffer(4);
                buffer.writeShort(1, (byte)8);
                Buffer.gi(buffer, (int)netFileRequest.hr, -890874726);
                NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
                NetCache.NetCache_pendingPriorityResponses.put(netFileRequest, netFileRequest.hr);
                NetCache.NetCache_pendingPriorityWritesCount += 1320339335;
                NetCache.NetCache_pendingPriorityResponsesCount -= 1677618233;
            }
            while (NetCache.NetCache_pendingResponsesCount * -1651605431 < 200 && NetCache.NetCache_pendingWritesCount * -32010957 > 0) {
                final NetFileRequest netFileRequest2 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                final Buffer buffer2 = new Buffer(4);
                buffer2.writeShort(0, (byte)88);
                Buffer.gi(buffer2, (int)netFileRequest2.hr, -636926537);
                NetCache.NetCache_socket.write(buffer2.array, 0, 4, -2115422184);
                GrandExchangeOfferWorldComparator.os(netFileRequest2);
                NetCache.NetCache_pendingResponses.put(netFileRequest2, netFileRequest2.hr);
                NetCache.NetCache_pendingWritesCount += 2069940741;
                NetCache.NetCache_pendingResponsesCount -= 979537415;
            }
            for (int i = 0; i < 100; ++i) {
                final int available = NetCache.NetCache_socket.available(1689099129);
                if (available < 0) {
                    throw new IOException();
                }
                if (available == 0) {
                    break;
                }
                NetCache.NetCache_loadTime = 0;
                int n2 = 0;
                if (Script.NetCache_currentResponse == null) {
                    n2 = 8;
                }
                else if (0 == NetCache.field3504 * -1961769541) {
                    n2 = 1;
                }
                if (n2 > 0) {
                    int n3 = n2 - NetCache.NetCache_responseHeaderBuffer.offset * -1633313603;
                    if (n3 > available) {
                        n3 = available;
                    }
                    NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, -1633313603 * NetCache.NetCache_responseHeaderBuffer.offset, n3, -2106093590);
                    if (0 != NetCache.field3506) {
                        for (int j = 0; j < n3; ++j) {
                            final byte[] array = NetCache.NetCache_responseHeaderBuffer.array;
                            final int n4 = -1633313603 * NetCache.NetCache_responseHeaderBuffer.offset + j;
                            array[n4] ^= NetCache.field3506;
                        }
                    }
                    final Buffer netCache_responseHeaderBuffer = NetCache.NetCache_responseHeaderBuffer;
                    netCache_responseHeaderBuffer.offset += n3 * -1516355947;
                    if (-1633313603 * NetCache.NetCache_responseHeaderBuffer.offset < n2) {
                        break;
                    }
                    if (null == Script.NetCache_currentResponse) {
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        final int ra = Buffer.ra(NetCache.NetCache_responseHeaderBuffer, (byte)7);
                        final int unsignedShort = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(-1003955405);
                        final int ra2 = Buffer.ra(NetCache.NetCache_responseHeaderBuffer, (byte)7);
                        final int int1 = NetCache.NetCache_responseHeaderBuffer.readInt(-1279455036);
                        final long n5 = (ra << 16) + unsignedShort;
                        NetFileRequest netCache_currentResponse = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.at(n5);
                        NetCache.field3498 = true;
                        if (netCache_currentResponse == null) {
                            netCache_currentResponse = (NetFileRequest)NetCache.NetCache_pendingResponses.at(n5);
                            NetCache.field3498 = false;
                        }
                        if (null == netCache_currentResponse) {
                            throw new IOException();
                        }
                        final int n6 = (ra2 == 0) ? 5 : 9;
                        Script.NetCache_currentResponse = netCache_currentResponse;
                        (NetCache.NetCache_responseArchiveBuffer = new Buffer(n6 + int1 + Script.NetCache_currentResponse.padding)).writeShort(ra2, (byte)13);
                        NetCache.NetCache_responseArchiveBuffer.writeInt(int1, -2081835031);
                        NetCache.field3504 = -598099048;
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                    }
                    else if (NetCache.field3504 * -1961769541 == 0) {
                        if (-1 == NetCache.NetCache_responseHeaderBuffer.array[0]) {
                            NetCache.field3504 = -74762381;
                            NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        }
                        else {
                            Script.NetCache_currentResponse = null;
                        }
                    }
                }
                else {
                    final int len = NetCache.NetCache_responseArchiveBuffer.array.length - Script.NetCache_currentResponse.padding;
                    int n7 = 512 - NetCache.field3504 * -1961769541;
                    if (n7 > len - NetCache.NetCache_responseArchiveBuffer.offset * -1633313603) {
                        n7 = len - NetCache.NetCache_responseArchiveBuffer.offset * -1633313603;
                    }
                    if (n7 > available) {
                        n7 = available;
                    }
                    NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset * -1633313603, n7, -2106093590);
                    if (0 != NetCache.field3506) {
                        for (int k = 0; k < n7; ++k) {
                            final byte[] array2 = NetCache.NetCache_responseArchiveBuffer.array;
                            final int n8 = k + -1633313603 * NetCache.NetCache_responseArchiveBuffer.offset;
                            array2[n8] ^= NetCache.field3506;
                        }
                    }
                    final Buffer netCache_responseArchiveBuffer = NetCache.NetCache_responseArchiveBuffer;
                    netCache_responseArchiveBuffer.offset += n7 * -1516355947;
                    NetCache.field3504 += -74762381 * n7;
                    if (len == NetCache.NetCache_responseArchiveBuffer.offset * -1633313603) {
                        if (Script.NetCache_currentResponse.hr == 16711935L) {
                            Login.field764 = NetCache.NetCache_responseArchiveBuffer;
                            for (int l = 0; l < 256; ++l) {
                                final Archive archive = NetCache.NetCache_archives[l];
                                if (archive != null) {
                                    Login.field764.offset = l * 754054312 + 1008154857;
                                    if (-1633313603 * Login.field764.offset >= Login.field764.array.length) {
                                        if (!archive.field3465) {
                                            throw new RuntimeException("");
                                        }
                                        archive.method1872((byte)(-32));
                                    }
                                    else {
                                        archive.loadIndex(Login.field764.readInt(-1852438806), Login.field764.readInt(-1686174048), -691028);
                                    }
                                }
                            }
                        }
                        else {
                            NetCache.NetCache_crc.reset();
                            NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, len);
                            if ((int)NetCache.NetCache_crc.getValue() != Script.NetCache_currentResponse.crc * -75260527) {
                                try {
                                    NetCache.NetCache_socket.close(-180302260);
                                }
                                catch (Exception ex) {}
                                NetCache.NetCache_crcMismatches += 372675253;
                                NetCache.NetCache_socket = null;
                                NetCache.field3506 = (byte)(Math.random() * 255.0 + 1.0);
                                return false;
                            }
                            NetCache.NetCache_crcMismatches = 0;
                            NetCache.NetCache_ioExceptions = 0;
                            Archive.wy(Script.NetCache_currentResponse.archive, (int)(Script.NetCache_currentResponse.hr & 0xFFFFL), NetCache.NetCache_responseArchiveBuffer.array, 0xFF0000L == (Script.NetCache_currentResponse.hr & 0xFF0000L), NetCache.field3498, 350645982);
                        }
                        Script.NetCache_currentResponse.hw();
                        if (NetCache.field3498) {
                            NetCache.NetCache_pendingPriorityResponsesCount += 1677618233;
                        }
                        else {
                            NetCache.NetCache_pendingResponsesCount += 979537415;
                        }
                        NetCache.field3504 = 0;
                        Script.NetCache_currentResponse = null;
                        NetCache.NetCache_responseArchiveBuffer = null;
                    }
                    else {
                        if (-1961769541 * NetCache.field3504 != 512) {
                            break;
                        }
                        NetCache.field3504 = 0;
                    }
                }
            }
            return true;
        }
        catch (IOException ex2) {
            try {
                NetCache.NetCache_socket.close(1477615842);
            }
            catch (Exception ex3) {}
            NetCache.NetCache_ioExceptions -= 161323731;
            NetCache.NetCache_socket = null;
            return false;
        }
    }
    
    protected static int getGcDuration(final int n) {
        try {
            int n2 = 0;
            Label_0107: {
                if (class291.garbageCollector != null) {
                    if (class291.garbageCollector.isValid()) {
                        break Label_0107;
                    }
                    if (n <= 1708543892) {
                        throw new IllegalStateException();
                    }
                }
                try {
                    final Iterator<GarbageCollectorMXBean> iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                    while (iterator.hasNext()) {
                        if (n <= 1708543892) {
                            throw new IllegalStateException();
                        }
                        final GarbageCollectorMXBean garbageCollector = iterator.next();
                        if (!garbageCollector.isValid()) {
                            continue;
                        }
                        class291.garbageCollector = garbageCollector;
                        GameEngine.garbageCollectorLastCheckTimeMs = 4496549445389278039L;
                        GameEngine.garbageCollectorLastCollectionTime = -3922098655801851377L;
                    }
                }
                catch (Throwable t) {}
            }
            if (null != class291.garbageCollector) {
                if (n <= 1708543892) {
                    throw new IllegalStateException();
                }
                final long clockNow = class96.clockNow(96073437);
                final long collectionTime = class291.garbageCollector.getCollectionTime();
                if (-3199239881614683375L * GameEngine.garbageCollectorLastCollectionTime != -1L) {
                    if (n <= 1708543892) {
                        throw new IllegalStateException();
                    }
                    final long n3 = collectionTime - -3199239881614683375L * GameEngine.garbageCollectorLastCollectionTime;
                    final long n4 = clockNow - 9118577410129870745L * GameEngine.garbageCollectorLastCheckTimeMs;
                    if (n4 != 0L) {
                        if (n <= 1708543892) {
                            throw new IllegalStateException();
                        }
                        n2 = (int)(100L * n3 / n4);
                    }
                }
                GameEngine.garbageCollectorLastCollectionTime = 3922098655801851377L * collectionTime;
                GameEngine.garbageCollectorLastCheckTimeMs = -4496549445389278039L * clockNow;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nl.bq(" + ')');
        }
    }
    
    public static void aa(final boolean b) {
        if (null == NetCache.NetCache_socket) {
            return;
        }
        try {
            final Buffer buffer = new Buffer(4);
            buffer.writeShort(b ? 2 : 3, (byte)65);
            Buffer.gi(buffer, 0, -943352222);
            NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
        }
        catch (IOException ex) {
            try {
                NetCache.NetCache_socket.close(1164081672);
            }
            catch (Exception ex2) {}
            NetCache.NetCache_ioExceptions -= 161323731;
            NetCache.NetCache_socket = null;
        }
    }
    
    static void ai(final Archive archive, final int n, final int n2, final int n3, final byte padding, final boolean b) {
        final long n4 = n2 + (n << 16);
        if (NetCache.NetCache_pendingPriorityWrites.at(n4) != null) {
            return;
        }
        if (null != NetCache.NetCache_pendingPriorityResponses.at(n4)) {
            return;
        }
        final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingWrites.at(n4);
        if (netFileRequest != null) {
            if (b) {
                GrandExchangeOfferWorldComparator.os(netFileRequest);
                NetCache.NetCache_pendingPriorityWrites.put(netFileRequest, n4);
                NetCache.NetCache_pendingWritesCount += 2069940741;
                NetCache.NetCache_pendingPriorityWritesCount -= 1320339335;
            }
            return;
        }
        if (!b && NetCache.NetCache_pendingResponses.at(n4) != null) {
            return;
        }
        final NetFileRequest netFileRequest2 = new NetFileRequest();
        netFileRequest2.archive = archive;
        netFileRequest2.crc = n3 * 1949343561;
        netFileRequest2.padding = padding;
        if (b) {
            NetCache.NetCache_pendingPriorityWrites.put(netFileRequest2, n4);
            NetCache.NetCache_pendingPriorityWritesCount -= 1320339335;
        }
        else {
            NetCache.NetCache_pendingWritesQueue.addFirst(netFileRequest2);
            NetCache.NetCache_pendingWrites.put(netFileRequest2, n4);
            NetCache.NetCache_pendingWritesCount += 2019882076;
        }
    }
    
    public static int ar(final boolean b, final boolean b2) {
        int n = 0;
        if (b) {
            n += -1171541559 * NetCache.NetCache_pendingPriorityWritesCount + -1952694793 * NetCache.NetCache_pendingPriorityResponsesCount;
        }
        if (b2) {
            n += NetCache.NetCache_pendingWritesCount * -32010957 + -1651605431 * NetCache.NetCache_pendingResponsesCount;
        }
        return n;
    }
    
    public static boolean aq() {
        final long clockNow = class96.clockNow(1647883261);
        int n = (int)(clockNow - -2114584129517998633L * NetCache.field3509);
        NetCache.field3509 = -6047020038529116697L * clockNow;
        if (n > 200) {
            n = 200;
        }
        NetCache.NetCache_loadTime += n * -1186998915;
        if (NetCache.NetCache_pendingResponsesCount * -1651605431 == 0 && 0 == NetCache.NetCache_pendingPriorityResponsesCount * 82060807 && 0 == -32010957 * NetCache.NetCache_pendingWritesCount && 0 == NetCache.NetCache_pendingPriorityWritesCount * 474505778) {
            return true;
        }
        if (NetCache.NetCache_socket == null) {
            return false;
        }
        try {
            if (NetCache.NetCache_loadTime * -942339237 > 331164043) {
                throw new IOException();
            }
            while (-1952694793 * NetCache.NetCache_pendingPriorityResponsesCount < -1738003801 && NetCache.NetCache_pendingPriorityWritesCount * -1599103042 > 0) {
                final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                final Buffer buffer = new Buffer(4);
                buffer.writeShort(1, (byte)119);
                Buffer.gi(buffer, (int)netFileRequest.hr, -505576272);
                NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
                NetCache.NetCache_pendingPriorityResponses.put(netFileRequest, netFileRequest.hr);
                NetCache.NetCache_pendingPriorityWritesCount -= 697974660;
                NetCache.NetCache_pendingPriorityResponsesCount -= 1691554512;
            }
            while (NetCache.NetCache_pendingResponsesCount * -1651605431 < -1363234906 && NetCache.NetCache_pendingWritesCount * -1882975813 > 0) {
                final NetFileRequest netFileRequest2 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                final Buffer buffer2 = new Buffer(4);
                buffer2.writeShort(0, (byte)104);
                Buffer.gi(buffer2, (int)netFileRequest2.hr, 1726817401);
                NetCache.NetCache_socket.write(buffer2.array, 0, 4, -2115422184);
                GrandExchangeOfferWorldComparator.os(netFileRequest2);
                NetCache.NetCache_pendingResponses.put(netFileRequest2, netFileRequest2.hr);
                NetCache.NetCache_pendingWritesCount += 2069940741;
                NetCache.NetCache_pendingResponsesCount -= 1839725562;
            }
            for (int i = 0; i < -1016290497; ++i) {
                final int available = NetCache.NetCache_socket.available(1221276115);
                if (available < 0) {
                    throw new IOException();
                }
                if (available == 0) {
                    break;
                }
                NetCache.NetCache_loadTime = 0;
                int n2 = 0;
                if (Script.NetCache_currentResponse == null) {
                    n2 = 8;
                }
                else if (0 == NetCache.field3504 * -1809971006) {
                    n2 = 1;
                }
                if (n2 > 0) {
                    int n3 = n2 - NetCache.NetCache_responseHeaderBuffer.offset * 1285177419;
                    if (n3 > available) {
                        n3 = available;
                    }
                    NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, -1633313603 * NetCache.NetCache_responseHeaderBuffer.offset, n3, -2106093590);
                    if (0 != NetCache.field3506) {
                        for (int j = 0; j < n3; ++j) {
                            final byte[] array = NetCache.NetCache_responseHeaderBuffer.array;
                            final int n4 = -1714231203 * NetCache.NetCache_responseHeaderBuffer.offset + j;
                            array[n4] ^= NetCache.field3506;
                        }
                    }
                    final Buffer netCache_responseHeaderBuffer = NetCache.NetCache_responseHeaderBuffer;
                    netCache_responseHeaderBuffer.offset += n3 * 1827547965;
                    if (-1633313603 * NetCache.NetCache_responseHeaderBuffer.offset < n2) {
                        break;
                    }
                    if (null == Script.NetCache_currentResponse) {
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        final int ra = Buffer.ra(NetCache.NetCache_responseHeaderBuffer, (byte)7);
                        final int unsignedShort = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(-1161614083);
                        final int ra2 = Buffer.ra(NetCache.NetCache_responseHeaderBuffer, (byte)7);
                        final int int1 = NetCache.NetCache_responseHeaderBuffer.readInt(-1213412388);
                        final long n5 = (ra << 16) + unsignedShort;
                        NetFileRequest netCache_currentResponse = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.at(n5);
                        NetCache.field3498 = true;
                        if (netCache_currentResponse == null) {
                            netCache_currentResponse = (NetFileRequest)NetCache.NetCache_pendingResponses.at(n5);
                            NetCache.field3498 = false;
                        }
                        if (null == netCache_currentResponse) {
                            throw new IOException();
                        }
                        final int n6 = (ra2 == 0) ? 5 : 9;
                        Script.NetCache_currentResponse = netCache_currentResponse;
                        (NetCache.NetCache_responseArchiveBuffer = new Buffer(n6 + int1 + Script.NetCache_currentResponse.padding)).writeShort(ra2, (byte)26);
                        NetCache.NetCache_responseArchiveBuffer.writeInt(int1, -2081835031);
                        NetCache.field3504 = -598099048;
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                    }
                    else if (NetCache.field3504 * -1961769541 == 0) {
                        if (-1 == NetCache.NetCache_responseHeaderBuffer.array[0]) {
                            NetCache.field3504 = -814483516;
                            NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        }
                        else {
                            Script.NetCache_currentResponse = null;
                        }
                    }
                }
                else {
                    final int len = NetCache.NetCache_responseArchiveBuffer.array.length - Script.NetCache_currentResponse.padding;
                    int n7 = 512 - NetCache.field3504 * -1961769541;
                    if (n7 > len - NetCache.NetCache_responseArchiveBuffer.offset * -5564816) {
                        n7 = len - NetCache.NetCache_responseArchiveBuffer.offset * -1633313603;
                    }
                    if (n7 > available) {
                        n7 = available;
                    }
                    NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset * -1633313603, n7, -2106093590);
                    if (0 != NetCache.field3506) {
                        for (int k = 0; k < n7; ++k) {
                            final byte[] array2 = NetCache.NetCache_responseArchiveBuffer.array;
                            final int n8 = k + -1633313603 * NetCache.NetCache_responseArchiveBuffer.offset;
                            array2[n8] ^= NetCache.field3506;
                        }
                    }
                    final Buffer netCache_responseArchiveBuffer = NetCache.NetCache_responseArchiveBuffer;
                    netCache_responseArchiveBuffer.offset += n7 * -1516355947;
                    NetCache.field3504 += 714951213 * n7;
                    if (len == NetCache.NetCache_responseArchiveBuffer.offset * -1633313603) {
                        if (Script.NetCache_currentResponse.hr == 16711935L) {
                            Login.field764 = NetCache.NetCache_responseArchiveBuffer;
                            for (int l = 0; l < 1183593763; ++l) {
                                final Archive archive = NetCache.NetCache_archives[l];
                                if (archive != null) {
                                    Login.field764.offset = l * 21258836 + 191583781;
                                    if (-1633313603 * Login.field764.offset >= Login.field764.array.length) {
                                        if (!archive.field3465) {
                                            throw new RuntimeException("");
                                        }
                                        archive.method1872((byte)(-32));
                                    }
                                    else {
                                        archive.loadIndex(Login.field764.readInt(-1245400428), Login.field764.readInt(-1947715362), -691028);
                                    }
                                }
                            }
                        }
                        else {
                            NetCache.NetCache_crc.reset();
                            NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, len);
                            if ((int)NetCache.NetCache_crc.getValue() != Script.NetCache_currentResponse.crc * -75260527) {
                                try {
                                    NetCache.NetCache_socket.close(1413634892);
                                }
                                catch (Exception ex) {}
                                NetCache.NetCache_crcMismatches += 372675253;
                                NetCache.NetCache_socket = null;
                                NetCache.field3506 = (byte)(Math.random() * 255.0 + 1.0);
                                return false;
                            }
                            NetCache.NetCache_crcMismatches = 0;
                            NetCache.NetCache_ioExceptions = 0;
                            Archive.wy(Script.NetCache_currentResponse.archive, (int)(Script.NetCache_currentResponse.hr & 0xFFFFL), NetCache.NetCache_responseArchiveBuffer.array, 0xFF0000L == (Script.NetCache_currentResponse.hr & 0xFF0000L), NetCache.field3498, 1914755224);
                        }
                        Script.NetCache_currentResponse.hw();
                        if (NetCache.field3498) {
                            NetCache.NetCache_pendingPriorityResponsesCount += 558808582;
                        }
                        else {
                            NetCache.NetCache_pendingResponsesCount += 979537415;
                        }
                        NetCache.field3504 = 0;
                        Script.NetCache_currentResponse = null;
                        NetCache.NetCache_responseArchiveBuffer = null;
                    }
                    else {
                        if (-1961769541 * NetCache.field3504 != 753693866) {
                            break;
                        }
                        NetCache.field3504 = 0;
                    }
                }
            }
            return true;
        }
        catch (IOException ex2) {
            try {
                NetCache.NetCache_socket.close(1043065132);
            }
            catch (Exception ex3) {}
            NetCache.NetCache_ioExceptions -= 161323731;
            NetCache.NetCache_socket = null;
            return false;
        }
    }
    
    public static void aj() {
        if (NetCache.NetCache_socket != null) {
            NetCache.NetCache_socket.close(2074802430);
        }
    }
    
    static void ag(final Archive archive, final int n, final int n2, final int n3, final byte padding, final boolean b) {
        final long n4 = n2 + (n << 16);
        if (NetCache.NetCache_pendingPriorityWrites.at(n4) != null) {
            return;
        }
        if (null != NetCache.NetCache_pendingPriorityResponses.at(n4)) {
            return;
        }
        final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingWrites.at(n4);
        if (netFileRequest != null) {
            if (b) {
                GrandExchangeOfferWorldComparator.os(netFileRequest);
                NetCache.NetCache_pendingPriorityWrites.put(netFileRequest, n4);
                NetCache.NetCache_pendingWritesCount += 763199901;
                NetCache.NetCache_pendingPriorityWritesCount += 2021758914;
            }
            return;
        }
        if (!b && NetCache.NetCache_pendingResponses.at(n4) != null) {
            return;
        }
        final NetFileRequest netFileRequest2 = new NetFileRequest();
        netFileRequest2.archive = archive;
        netFileRequest2.crc = n3 * -404182335;
        netFileRequest2.padding = padding;
        if (b) {
            NetCache.NetCache_pendingPriorityWrites.put(netFileRequest2, n4);
            NetCache.NetCache_pendingPriorityWritesCount -= 1874875034;
        }
        else {
            NetCache.NetCache_pendingWritesQueue.addFirst(netFileRequest2);
            NetCache.NetCache_pendingWrites.put(netFileRequest2, n4);
            NetCache.NetCache_pendingWritesCount -= 16779484;
        }
    }
    
    static int ah(final int n, final int n2) {
        final long n3 = n2 + (n << 16);
        if (Script.NetCache_currentResponse == null || Script.NetCache_currentResponse.hr != n3) {
            return 0;
        }
        return 627475114 * NetCache.NetCache_responseArchiveBuffer.offset / (NetCache.NetCache_responseArchiveBuffer.array.length - Script.NetCache_currentResponse.padding) + 1;
    }
}
