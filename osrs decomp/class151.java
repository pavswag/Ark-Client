// 
// Decompiled by Procyon v0.5.36
// 

public class class151 extends class155
{
    final /* synthetic */ class156 this$0;
    static final int al = 6;
    byte field1377;
    int field1378;
    String field1379;
    
    class151(final class156 this$0) {
        this.this$0 = this$0;
        this.field1379 = null;
    }
    
    @Override
    void aw(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset -= 416275599;
            Buffer.ks(buffer, (byte)1);
        }
        this.field1379 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-16));
        this.field1378 = buffer.readUnsignedShort(659814966) * -387154071;
        this.field1377 = Buffer.wu(buffer, 435772489);
        Buffer.ks(buffer, (byte)1);
    }
    
    static final void method872(final int n, final int n2, final int n3) {
        try {
            final ClanChannel clanChannel = (n >= 0) ? Client.currentClanChannels[n] : MouseHandler.guestClanChannel;
            if (clanChannel != null) {
                if (n3 <= -461862935) {
                    throw new IllegalStateException();
                }
                if (n2 >= 0) {
                    if (n3 <= -461862935) {
                        return;
                    }
                    if (n2 < clanChannel.method898(881801940)) {
                        final ClanChannelMember clanChannelMember = clanChannel.members.get(n2);
                        if (clanChannelMember.rank == -1) {
                            final String name = clanChannelMember.username.getName(-710264960);
                            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2551, Client.packetWriter.isaacCipher, (short)(-32287));
                            packetBufferNode.packetBuffer.bf(3 + DynamicObject.stringCp1252NullTerminatedByteSize(name, (byte)15), (byte)70);
                            packetBufferNode.packetBuffer.bf(n, (byte)17);
                            packetBufferNode.packetBuffer.cq(n2, (byte)39);
                            packetBufferNode.packetBuffer.ce(name, -2065026783);
                            Client.packetWriter.addNode(packetBufferNode, 414135591);
                            return;
                        }
                        if (n3 <= -461862935) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fg.nn(" + ')');
        }
    }
    
    static Script vmethod3239(final int n, final int n2, final int n3, final int n4) {
        try {
            final Script postDecode = ObjectComposition.postDecode((n2 << 8) + n, n, (byte)(-114));
            if (null != postDecode) {
                if (n4 == -1243378406) {
                    throw new IllegalStateException();
                }
                return postDecode;
            }
            else {
                final int method1527 = class262.method1527(n3, n, -521149946);
                final Script script = (Script)Script.Script_cached.wr(method1527 << 16);
                Script script2 = null;
                Label_0273: {
                    if (null != script) {
                        if (n4 == -1243378406) {
                            throw new IllegalStateException();
                        }
                        script2 = script;
                    }
                    else {
                        final int fileFlat = AbstractArchive.getFileFlat(class126.archive12, String.valueOf(method1527), 244357161);
                        if (-1 == fileFlat) {
                            script2 = null;
                        }
                        else {
                            final byte[] sh = AbstractArchive.sh(class126.archive12, fileFlat, (byte)(-23));
                            if (null != sh) {
                                if (sh.length <= 1) {
                                    if (n4 == -1243378406) {
                                        throw new IllegalStateException();
                                    }
                                    script2 = null;
                                    break Label_0273;
                                }
                                else {
                                    final Script script3 = class33.newScript(sh, (byte)1);
                                    if (script3 != null) {
                                        if (n4 == -1243378406) {
                                            throw new IllegalStateException();
                                        }
                                        Script.Script_cached.put(script3, method1527 << 16);
                                        script2 = script3;
                                        break Label_0273;
                                    }
                                }
                            }
                            script2 = null;
                        }
                    }
                }
                final Script script4 = script2;
                if (script4 == null) {
                    return null;
                }
                if (n4 == -1243378406) {
                    throw new IllegalStateException();
                }
                return script4;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fg.an(" + ')');
        }
    }
    
    @Override
    void vmethod3239(final ClanChannel clanChannel, final byte b) {
        try {
            final ClanChannelMember clanChannelMember = new ClanChannelMember();
            clanChannelMember.username = new Username(this.field1379);
            clanChannelMember.world = this.field1378 * -1435095207;
            clanChannelMember.rank = this.field1377;
            clanChannel.addMember(clanChannelMember, -1098707641);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fg.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            Buffer.ks(buffer, (byte)1);
        }
        this.field1379 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-12));
        this.field1378 = buffer.readUnsignedShort(739337811) * 215553043;
        this.field1377 = Buffer.wu(buffer, 435772489);
        Buffer.ks(buffer, (byte)1);
    }
    
    @Override
    void au(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            Buffer.ks(buffer, (byte)1);
        }
        this.field1379 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-122));
        this.field1378 = buffer.readUnsignedShort(-422325404) * 215553043;
        this.field1377 = Buffer.wu(buffer, 435772489);
        Buffer.ks(buffer, (byte)1);
    }
    
    public static String vmethod3238(final class166 class166) {
        if (class166 == null) {
            return class166.bn();
        }
        return class166.field1420;
    }
    
    @Override
    void vmethod3238(final Buffer buffer, final int n) {
        try {
            if (Buffer.ra(buffer, (byte)7) != 255) {
                if (n != -1949352075) {
                    throw new IllegalStateException();
                }
                buffer.offset += 1516355947;
                Buffer.ks(buffer, (byte)1);
            }
            this.field1379 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-74));
            this.field1378 = buffer.readUnsignedShort(297326267) * 215553043;
            this.field1377 = Buffer.wu(buffer, 435772489);
            Buffer.ks(buffer, (byte)1);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fg.af(" + ')');
        }
    }
    
    static void method874(final float field1223, final float n, final float n2, final float n3, final class125 class125, final byte b) {
        try {
            final float n4 = n - field1223;
            final float n5 = n2 - n;
            final float n6 = n3 - n2;
            final float n7 = n5 - n4;
            class125.field1226 = n6 - n5 - n7;
            class125.field1237 = n7 + n7 + n7;
            class125.field1224 = n4 + n4 + n4;
            class125.field1223 = field1223;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fg.ab(" + ')');
        }
    }
    
    void method874(final ClanChannel clanChannel) {
        final ClanChannelMember clanChannelMember = new ClanChannelMember();
        clanChannelMember.username = new Username(this.field1379);
        clanChannelMember.world = this.field1378 * -1198371199;
        clanChannelMember.rank = this.field1377;
        clanChannel.addMember(clanChannelMember, -1571505998);
    }
    
    @Override
    void aq(final ClanChannel clanChannel) {
        final ClanChannelMember clanChannelMember = new ClanChannelMember();
        clanChannelMember.username = new Username(this.field1379);
        clanChannelMember.world = this.field1378 * -1435095207;
        clanChannelMember.rank = this.field1377;
        clanChannel.addMember(clanChannelMember, 2031936582);
    }
}
