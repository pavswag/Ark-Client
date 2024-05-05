import net.runelite.api.ChatMessageType;
import net.runelite.api.MessageNode;

// 
// Decompiled by Procyon v0.5.36
// 

public class Message extends DualNode implements MessageNode
{
    int type;
    int count;
    String prefix;
    String text;
    Username senderUsername;
    TriBool isFromIgnored0;
    TriBool isFromFriend0;
    int cycle;
    String sender;
    public int hh;
    public String rc;
    static final int nw = 8;
    
    public String getName() {
        return this.prefix;
    }
    
    Message(final int n, final String s, final String s2, final String s3) {
        this.hh = (int)(System.currentTimeMillis() / 1000L);
        this.isFromIgnored0 = TriBool.TriBool_unknown;
        this.isFromFriend0 = TriBool.TriBool_unknown;
        this.set(n, s, s2, s3, 1617874492);
    }
    
    public String getValue() {
        final String qa = this.qa();
        if (qa != null && qa.startsWith("|")) {
            final ChatMessageType of = ChatMessageType.of(this.se());
            if (of == ChatMessageType.CLAN_CHAT || of == ChatMessageType.CLAN_MESSAGE) {
                return qa.substring(1);
            }
        }
        return qa;
    }
    
    final boolean ad() {
        if (TriBool.TriBool_unknown == this.isFromFriend0) {
            this.fillIsFromIgnored(-1963540850);
        }
        return TriBool.TriBool_true == this.isFromFriend0;
    }
    
    final boolean ae() {
        if (TriBool.TriBool_unknown == this.isFromFriend0) {
            this.fillIsFromIgnored(-1745262174);
        }
        return TriBool.TriBool_true == this.isFromFriend0;
    }
    
    void bb() {
        this.isFromFriend0 = (World.friendSystem.ignoreList.bt(this.senderUsername, -955632033) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public int se() {
        return this.cycle * -53488167;
    }
    
    public void setName(String substring) {
        this.im(substring);
        if (substring != null) {
            final int lastIndex = substring.lastIndexOf(62);
            if (lastIndex != -1) {
                substring = substring.substring(lastIndex + 1);
            }
            this.nu(ScriptFrame.client.ad(substring, ScriptFrame.client.cq()));
        }
        else {
            this.nu(null);
        }
    }
    
    public int getId() {
        return this.type * -1117255211;
    }
    
    public void setValue(final String str) {
        final String qa = this.qa();
        final ChatMessageType of = ChatMessageType.of(this.se());
        if ((of == ChatMessageType.CLAN_CHAT || of == ChatMessageType.CLAN_MESSAGE) && qa != null && qa.startsWith("|")) {
            this.ep("|" + str);
        }
        else {
            this.ep(str);
        }
    }
    
    void ao() {
        this.isFromIgnored0 = TriBool.TriBool_unknown;
    }
    
    public ChatMessageType getType() {
        final ChatMessageType of = ChatMessageType.of(this.se());
        if (of == ChatMessageType.CLAN_CHAT) {
            final String qa = this.qa();
            if (qa != null && qa.startsWith("|")) {
                return ChatMessageType.CLAN_GIM_CHAT;
            }
        }
        else if (of == ChatMessageType.CLAN_MESSAGE) {
            final String qa2 = this.qa();
            if (qa2 != null && qa2.startsWith("|")) {
                return ChatMessageType.CLAN_GIM_MESSAGE;
            }
        }
        return of;
    }
    
    final boolean ak() {
        if (TriBool.TriBool_unknown == this.isFromFriend0) {
            this.fillIsFromIgnored(-1782418702);
        }
        return TriBool.TriBool_true == this.isFromFriend0;
    }
    
    void av() {
        this.isFromIgnored0 = (World.friendSystem.friendsList.bt(this.senderUsername, 318402349) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public void wt(final int n, final String s, final String s2, final String s3) {
        this.rc = null;
        this.hh = (int)(System.currentTimeMillis() / 1000L);
        if (s != null) {
            final int lastIndex = s.lastIndexOf(62);
            if (lastIndex != -1) {
                this.nu(ScriptFrame.client.ad(s.substring(lastIndex + 1), ScriptFrame.client.cq()));
            }
        }
    }
    
    final void be() {
        if (null != this.prefix) {
            this.senderUsername = new Username(ModeWhere.method1953(this.prefix, 1227239523), class70.loginType);
        }
        else {
            this.senderUsername = null;
        }
    }
    
    void as() {
        this.isFromFriend0 = TriBool.TriBool_unknown;
    }
    
    static void widgetDefaultMenuAction(final int n, final int n2, final int n3, final int n4, final String targetName, final int n5) {
        try {
            final Widget widgetChild = SoundSystem.getWidgetChild(n2, n3, 473462360);
            if (null == widgetChild) {
                if (n5 != 1238902143) {
                    throw new IllegalStateException();
                }
            }
            else {
                if (widgetChild.onOp != null) {
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    scriptEvent.dragTarget = widgetChild;
                    scriptEvent.opIndex = n * -247460251;
                    scriptEvent.targetName = targetName;
                    scriptEvent.args = widgetChild.onOp;
                    HealthBarUpdate.set(scriptEvent, (byte)(-79));
                }
                boolean method353 = true;
                if (1021339961 * widgetChild.contentType > 0) {
                    if (n5 != 1238902143) {
                        throw new IllegalStateException();
                    }
                    method353 = method353(widgetChild, (byte)(-10));
                }
                if (!method353) {
                    if (n5 != 1238902143) {
                        return;
                    }
                }
                else {
                    boolean b;
                    if ((KeyHandler.getWidgetFlags(widgetChild, 1939611201) >> n - 1 + 1 & 0x1) != 0x0) {
                        if (n5 != 1238902143) {
                            return;
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    if (!b) {
                        return;
                    }
                    if (n == 1) {
                        if (n5 != 1238902143) {
                            throw new IllegalStateException();
                        }
                        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher, (short)(-9786));
                        packetBufferNode.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode.packetBuffer.cq(n3, (byte)(-6));
                        packetBufferNode.packetBuffer.cq(n4, (byte)64);
                        Client.packetWriter.addNode(packetBufferNode, 414135591);
                    }
                    if (2 == n) {
                        if (n5 != 1238902143) {
                            throw new IllegalStateException();
                        }
                        final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher, (short)(-17344));
                        packetBufferNode2.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode2.packetBuffer.cq(n3, (byte)40);
                        packetBufferNode2.packetBuffer.cq(n4, (byte)55);
                        Client.packetWriter.addNode(packetBufferNode2, 414135591);
                    }
                    if (3 == n) {
                        final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.field2540, Client.packetWriter.isaacCipher, (short)(-13059));
                        packetBufferNode3.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode3.packetBuffer.cq(n3, (byte)(-21));
                        packetBufferNode3.packetBuffer.cq(n4, (byte)64);
                        Client.packetWriter.addNode(packetBufferNode3, 414135591);
                    }
                    if (4 == n) {
                        if (n5 != 1238902143) {
                            throw new IllegalStateException();
                        }
                        final PacketBufferNode packetBufferNode4 = class330.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher, (short)(-22598));
                        packetBufferNode4.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode4.packetBuffer.cq(n3, (byte)(-24));
                        packetBufferNode4.packetBuffer.cq(n4, (byte)(-28));
                        Client.packetWriter.addNode(packetBufferNode4, 414135591);
                    }
                    if (5 == n) {
                        final PacketBufferNode packetBufferNode5 = class330.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher, (short)(-27350));
                        packetBufferNode5.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode5.packetBuffer.cq(n3, (byte)(-4));
                        packetBufferNode5.packetBuffer.cq(n4, (byte)54);
                        Client.packetWriter.addNode(packetBufferNode5, 414135591);
                    }
                    if (6 == n) {
                        final PacketBufferNode packetBufferNode6 = class330.getPacketBufferNode(ClientPacket.field2535, Client.packetWriter.isaacCipher, (short)(-32104));
                        packetBufferNode6.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode6.packetBuffer.cq(n3, (byte)(-56));
                        packetBufferNode6.packetBuffer.cq(n4, (byte)0);
                        Client.packetWriter.addNode(packetBufferNode6, 414135591);
                    }
                    if (7 == n) {
                        if (n5 != 1238902143) {
                            throw new IllegalStateException();
                        }
                        final PacketBufferNode packetBufferNode7 = class330.getPacketBufferNode(ClientPacket.field2558, Client.packetWriter.isaacCipher, (short)(-8306));
                        packetBufferNode7.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode7.packetBuffer.cq(n3, (byte)(-67));
                        packetBufferNode7.packetBuffer.cq(n4, (byte)(-28));
                        Client.packetWriter.addNode(packetBufferNode7, 414135591);
                    }
                    if (8 == n) {
                        final PacketBufferNode packetBufferNode8 = class330.getPacketBufferNode(ClientPacket.field2527, Client.packetWriter.isaacCipher, (short)(-2785));
                        packetBufferNode8.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode8.packetBuffer.cq(n3, (byte)(-71));
                        packetBufferNode8.packetBuffer.cq(n4, (byte)0);
                        Client.packetWriter.addNode(packetBufferNode8, 414135591);
                    }
                    if (n == 9) {
                        final PacketBufferNode packetBufferNode9 = class330.getPacketBufferNode(ClientPacket.WALK, Client.packetWriter.isaacCipher, (short)(-26949));
                        packetBufferNode9.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode9.packetBuffer.cq(n3, (byte)17);
                        packetBufferNode9.packetBuffer.cq(n4, (byte)90);
                        Client.packetWriter.addNode(packetBufferNode9, 414135591);
                    }
                    if (10 == n) {
                        if (n5 != 1238902143) {
                            return;
                        }
                        final PacketBufferNode packetBufferNode10 = class330.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher, (short)(-5521));
                        packetBufferNode10.packetBuffer.ba(n2, -2081835031);
                        packetBufferNode10.packetBuffer.cq(n3, (byte)77);
                        packetBufferNode10.packetBuffer.cq(n4, (byte)(-5));
                        Client.packetWriter.addNode(packetBufferNode10, 414135591);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.ks(" + ')');
        }
    }
    
    static final boolean method353(final Widget widget, final byte b) {
        try {
            final int n = widget.contentType * 1021339961;
            if (n == 205) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                Client.logoutTimer = 719725026;
                return true;
            }
            else {
                if (n >= 300) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    if (n <= 313) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        final int n2 = (n - 300) / 2;
                        final int n3 = n & 0x1;
                        final PlayerComposition playerAppearance = Client.playerAppearance;
                        final int n4 = n2;
                        boolean b2;
                        if (n3 == 1) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        playerAppearance.changeAppearance(n4, b2, -1645926709);
                    }
                }
                if (n >= 314) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    if (n <= 323) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        final int n5 = (n - 314) / 2;
                        final int n6 = n & 0x1;
                        final PlayerComposition playerAppearance2 = Client.playerAppearance;
                        final int n7 = n5;
                        boolean b3;
                        if (n6 == 1) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        PlayerComposition.ok(playerAppearance2, n7, b3, -1999663188);
                    }
                }
                if (324 == n) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    Client.playerAppearance.method1694(0, 1411028779);
                }
                if (325 == n) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    Client.playerAppearance.method1694(1, 391905970);
                }
                if (n != 326) {
                    return false;
                }
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2468, Client.packetWriter.isaacCipher, (short)(-28939));
                PlayerComposition.yo(Client.playerAppearance, packetBufferNode.packetBuffer, (byte)64);
                Client.packetWriter.addNode(packetBufferNode, 414135591);
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.mk(" + ')');
        }
    }
    
    final boolean az() {
        if (TriBool.TriBool_unknown == this.isFromFriend0) {
            this.fillIsFromIgnored(-1956697369);
        }
        return TriBool.TriBool_true == this.isFromFriend0;
    }
    
    void ax() {
        this.isFromIgnored0 = TriBool.TriBool_unknown;
    }
    
    final void bi() {
        if (null != this.prefix) {
            this.senderUsername = new Username(ModeWhere.method1953(this.prefix, 1227239523), class70.loginType);
        }
        else {
            this.senderUsername = null;
        }
    }
    
    public int getTimestamp() {
        return this.hh;
    }
    
    public void nu(final Username senderUsername) {
        this.senderUsername = senderUsername;
    }
    
    static void isFromFriend(final Archive archive, final int n, final int n2, final int n3, final byte padding, final boolean b, final byte b2) {
        synchronized (Client.fz) {
            final int n4 = 12;
            try {
                final long n5 = n2 + (n << 16);
                if (NetCache.NetCache_pendingPriorityWrites.at(n5) != null) {
                    if (n4 <= 2) {
                        throw new IllegalStateException();
                    }
                }
                else if (null != NetCache.NetCache_pendingPriorityResponses.at(n5)) {
                    if (n4 <= 2) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingWrites.at(n5);
                    if (netFileRequest != null) {
                        if (n4 <= 2) {
                            throw new IllegalStateException();
                        }
                        if (b) {
                            if (n4 <= 2) {
                                throw new IllegalStateException();
                            }
                            GrandExchangeOfferWorldComparator.os(netFileRequest);
                            NetCache.NetCache_pendingPriorityWrites.put(netFileRequest, n5);
                            NetCache.NetCache_pendingWritesCount += 2069940741;
                            NetCache.NetCache_pendingPriorityWritesCount -= 1320339335;
                        }
                    }
                    else if (!b && NetCache.NetCache_pendingResponses.at(n5) != null) {
                        if (n4 <= 2) {}
                    }
                    else {
                        final NetFileRequest netFileRequest2 = new NetFileRequest();
                        netFileRequest2.archive = archive;
                        netFileRequest2.crc = n3 * 851624817;
                        netFileRequest2.padding = padding;
                        if (b) {
                            if (n4 > 2) {
                                NetCache.NetCache_pendingPriorityWrites.put(netFileRequest2, n5);
                                NetCache.NetCache_pendingPriorityWritesCount -= 1320339335;
                            }
                        }
                        else {
                            NetCache.NetCache_pendingWritesQueue.addFirst(netFileRequest2);
                            NetCache.NetCache_pendingWrites.put(netFileRequest2, n5);
                            NetCache.NetCache_pendingWritesCount -= 2069940741;
                        }
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "cq.aw(" + ')');
            }
        }
    }
    
    public static void isFromFriend(final AbstractArchive musicTrackArchive, final int n, final int n2, final int n3, final boolean musicTrackBoolean, final int n4) {
        try {
            class297.musicPlayerStatus = -626822165;
            class297.musicTrackArchive = musicTrackArchive;
            class379.musicTrackGroupId = n * -1643562499;
            VarpDefinition.musicTrackFileId = 1823837761 * n2;
            class100.musicTrackVolume = 111967803 * n3;
            class120.musicTrackBoolean = musicTrackBoolean;
            class162.pcmSampleLength = 1504627152;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.aw(" + ')');
        }
    }
    
    static float isFromFriend(final class125 class125, final float n, final boolean b, final int n2) {
        try {
            final float n3 = 0.0f;
            if (null != class125) {
                if (n2 <= 118889) {
                    throw new IllegalStateException();
                }
                if (class125.method748((short)(-1564)) != 0) {
                    final float n4 = (float)(class125.field1219[0].field1175 * -834721191);
                    final float n5 = (float)(class125.field1219[class125.method748((short)(-2439)) - 1].field1175 * -834721191);
                    final float n6 = n5 - n4;
                    if (n6 != 0.0) {
                        float n7;
                        if (n > n5) {
                            if (n2 <= 118889) {
                                throw new IllegalStateException();
                            }
                            n7 = (n - n5) / n6;
                        }
                        else {
                            n7 = (n - n4) / n6;
                        }
                        final double n8 = (int)n7;
                        float n9 = Math.abs((float)(n7 - n8)) * n6;
                        final double abs = Math.abs(1.0 + n8);
                        final double n10 = abs / 2.0;
                        final float n11 = (float)(n10 - (int)n10);
                        Label_0742: {
                            if (b) {
                                if (n2 <= 118889) {
                                    throw new IllegalStateException();
                                }
                                if (class125.field1220 == class123.field1204) {
                                    if (n2 <= 118889) {
                                        throw new IllegalStateException();
                                    }
                                    if (n11 != 0.0) {
                                        if (n2 <= 118889) {
                                            throw new IllegalStateException();
                                        }
                                        n9 += n4;
                                    }
                                    else {
                                        n9 = n5 - n9;
                                    }
                                }
                                else {
                                    if (class125.field1220 != class123.field1202) {
                                        if (class123.field1203 == class125.field1220) {
                                            if (n2 <= 118889) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        else {
                                            if (class123.field1200 != class125.field1220) {
                                                break Label_0742;
                                            }
                                            if (n2 <= 118889) {
                                                throw new IllegalStateException();
                                            }
                                            final float n12 = n4 - n;
                                            final float field1174 = class125.field1219[0].field1174;
                                            final float field1175 = class125.field1219[0].field1172;
                                            float field1176 = class125.field1219[0].field1178;
                                            if (0.0 != field1174) {
                                                if (n2 <= 118889) {
                                                    throw new IllegalStateException();
                                                }
                                                field1176 -= n12 * field1175 / field1174;
                                            }
                                            return field1176;
                                        }
                                    }
                                    n9 = n5 - n9;
                                }
                            }
                            else if (class125.field1236 == class123.field1204) {
                                if (n2 <= 118889) {
                                    throw new IllegalStateException();
                                }
                                if (n11 != 0.0) {
                                    n9 = n5 - n9;
                                }
                                else {
                                    n9 += n4;
                                }
                            }
                            else {
                                if (class125.field1236 != class123.field1202) {
                                    if (n2 <= 118889) {
                                        throw new IllegalStateException();
                                    }
                                    if (class125.field1236 != class123.field1203) {
                                        if (class125.field1236 != class123.field1200) {
                                            break Label_0742;
                                        }
                                        if (n2 <= 118889) {
                                            throw new IllegalStateException();
                                        }
                                        final float n13 = n - n5;
                                        final float field1177 = class125.field1219[class125.method748((short)(-16214)) - 1].field1176;
                                        final float field1178 = class125.field1219[class125.method748((short)(-16200)) - 1].field1173;
                                        float field1179 = class125.field1219[class125.method748((short)(-3997)) - 1].field1178;
                                        if (0.0 != field1177) {
                                            if (n2 <= 118889) {
                                                throw new IllegalStateException();
                                            }
                                            field1179 += field1178 * n13 / field1177;
                                        }
                                        return field1179;
                                    }
                                }
                                n9 += n4;
                            }
                        }
                        float offerName = GrandExchangeEvent.getOfferName(class125, n9, -50216791);
                        if (b) {
                            if (n2 <= 118889) {
                                throw new IllegalStateException();
                            }
                            if (class125.field1220 == class123.field1203) {
                                if (n2 <= 118889) {
                                    throw new IllegalStateException();
                                }
                                offerName -= (float)((class125.field1219[class125.method748((short)702) - 1].field1178 - class125.field1219[0].field1178) * abs);
                                return offerName;
                            }
                        }
                        if (!b) {
                            if (n2 <= 118889) {
                                throw new IllegalStateException();
                            }
                            if (class125.field1236 == class123.field1203) {
                                if (n2 <= 118889) {
                                    throw new IllegalStateException();
                                }
                                offerName += (float)((class125.field1219[class125.method748((short)(-2379)) - 1].field1178 - class125.field1219[0].field1178) * abs);
                            }
                        }
                        return offerName;
                    }
                    if (n2 <= 118889) {
                        throw new IllegalStateException();
                    }
                    return class125.field1219[0].field1178;
                }
            }
            return n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.aw(" + ')');
        }
    }
    
    final boolean isFromFriend(final int n) {
        try {
            if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
                if (n <= 427135973) {
                    throw new IllegalStateException();
                }
                this.clearIsFromFriend((byte)8);
            }
            boolean b;
            if (this.isFromIgnored0 == TriBool.TriBool_true) {
                if (n <= 427135973) {
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
            throw HealthBar.get(ex, "cq.aw(" + ')');
        }
    }
    
    void am() {
        this.isFromFriend0 = TriBool.TriBool_unknown;
    }
    
    final void fillSenderUsername(final int n) {
        try {
            if (null != this.prefix) {
                this.senderUsername = new Username(ModeWhere.method1953(this.prefix, 1227239523), class70.loginType);
            }
            else {
                this.senderUsername = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.al(" + ')');
        }
    }
    
    void clearIsFromFriend(final byte b) {
        try {
            TriBool isFromIgnored0;
            if (World.friendSystem.friendsList.bt(this.senderUsername, -1769937324)) {
                if (b != 8) {
                    return;
                }
                isFromIgnored0 = TriBool.TriBool_true;
            }
            else {
                isFromIgnored0 = TriBool.TriBool_false;
            }
            this.isFromIgnored0 = isFromIgnored0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.ac(" + ')');
        }
    }
    
    void fillIsFromFriend(final byte b) {
        try {
            this.isFromIgnored0 = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.an(" + ')');
        }
    }
    
    public static void ur(final Message message, final int n) {
        if (message == null) {
            message.clearIsFromIgnored(n);
        }
        try {
            message.isFromFriend0 = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.au(" + ')');
        }
    }
    
    void clearIsFromIgnored(final int n) {
        try {
            this.isFromFriend0 = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.au(" + ')');
        }
    }
    
    public void setTimestamp(final int hh) {
        this.hh = hh;
    }
    
    static final void method350(final String str, final byte b) {
        try {
            VerticalAlignment.method1036(Strings.hu + str + Strings.hx, -740325105);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.aa(" + ')');
        }
    }
    
    void method350(final int n, final String prefix, final String text, final String sender) {
        this.type = class129.method762(-1728364522) * 1106690507;
        this.count = -795781739 * Client.cycle;
        this.cycle = n * -280274327;
        this.prefix = prefix;
        this.fillSenderUsername(1638964271);
        this.text = text;
        this.sender = sender;
        this.fillIsFromFriend((byte)(-37));
        ur(this, 1073337800);
    }
    
    void ai() {
        this.isFromIgnored0 = TriBool.TriBool_false;
    }
    
    void by() {
        this.isFromFriend0 = (World.friendSystem.ignoreList.bt(this.senderUsername, -28199340) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    void ar() {
        this.isFromFriend0 = TriBool.TriBool_unknown;
    }
    
    void ap() {
        this.isFromFriend0 = (World.friendSystem.ignoreList.bt(this.senderUsername, -1464498524) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public void im(final String prefix) {
        this.prefix = prefix;
    }
    
    void set(final int n, final String prefix, final String text, final String sender, final int n2) {
        try {
            this.type = class129.method762(-1728364522) * -1945835651;
            this.count = -795781739 * Client.cycle;
            this.cycle = n * -280274327;
            this.prefix = prefix;
            this.fillSenderUsername(-90703200);
            this.text = text;
            this.sender = sender;
            this.fillIsFromFriend((byte)(-124));
            ur(this, 399155941);
            this.wt(n, prefix, text, sender);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.af(" + ')');
        }
    }
    
    final boolean isFromIgnored(final int n) {
        try {
            if (TriBool.TriBool_unknown == this.isFromFriend0) {
                this.fillIsFromIgnored(-1665665360);
            }
            boolean b;
            if (TriBool.TriBool_true == this.isFromFriend0) {
                if (n != 1426002396) {
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
            throw HealthBar.get(ex, "cq.ab(" + ')');
        }
    }
    
    void fillIsFromIgnored(final int n) {
        try {
            TriBool isFromFriend0;
            if (World.friendSystem.ignoreList.bt(this.senderUsername, -750363399)) {
                if (n >= -1582056524) {
                    throw new IllegalStateException();
                }
                isFromFriend0 = TriBool.TriBool_true;
            }
            else {
                isFromFriend0 = TriBool.TriBool_false;
            }
            this.isFromFriend0 = isFromFriend0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cq.aq(" + ')');
        }
    }
    
    final boolean ag() {
        if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
            this.clearIsFromFriend((byte)8);
        }
        return this.isFromIgnored0 == TriBool.TriBool_true;
    }
    
    public void ep(final String sender) {
        this.sender = sender;
    }
    
    public String getSender() {
        return this.text;
    }
    
    public static void ew(final class379 class379, final AbstractFont field3612) {
        if (field3612 != class379.field3612) {
            class379.field3612 = field3612;
            if (null != class379.field3612) {
                if (class379.field3617 * -1059679999 == 0) {
                    class379.field3617 = class379.field3612.ascent * -392773850;
                }
                if (!class379.method2004(-1827482271)) {
                    class379.method2025(-224307219);
                }
            }
        }
    }
    
    public void setSender(final String text) {
        this.text = text;
    }
    
    public String getRuneLiteFormatMessage() {
        return this.rc;
    }
    
    public void setRuneLiteFormatMessage(final String rc) {
        this.rc = rc;
    }
    
    final void bk() {
        if (null != this.prefix) {
            this.senderUsername = new Username(ModeWhere.method1953(this.prefix, 1227239523), class70.loginType);
        }
        else {
            this.senderUsername = null;
        }
    }
    
    final boolean ah() {
        if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
            this.clearIsFromFriend((byte)8);
        }
        return this.isFromIgnored0 == TriBool.TriBool_true;
    }
    
    public static void yk(final Message message) {
        if (message == null) {
            message.ai();
        }
        message.isFromIgnored0 = TriBool.TriBool_unknown;
    }
    
    public String qa() {
        return this.sender;
    }
}
