// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator6 extends AbstractUserComparator
{
    final boolean reversed;
    static final int dz = 8;
    static MouseRecorder mouseRecorder;
    
    public UserComparator6(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compareBuddy((Buddy)o, (Buddy)o2, 2114105554);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eg.compare(" + ')');
        }
    }
    
    public static int bs(final UserComparator6 userComparator6, final Buddy buddy, final Buddy buddy2) {
        if (userComparator6 == null) {
            userComparator6.ac(buddy, buddy);
        }
        if (1669882221 * buddy.world != 0 && 0 != 177258591 * buddy2.world) {
            return userComparator6.reversed ? buddy.be(473993579).compareToTyped(buddy2.be(473993579), (byte)118) : buddy2.be(473993579).compareToTyped(buddy.be(473993579), (byte)62);
        }
        return userComparator6.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    int aw(final Buddy buddy, final Buddy buddy2) {
        if (177258591 * buddy.world != 0 && 0 != 177258591 * buddy2.world) {
            return this.reversed ? buddy.be(473993579).compareToTyped(buddy2.be(473993579), (byte)31) : buddy2.be(473993579).compareToTyped(buddy.be(473993579), (byte)123);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public int al(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, 2108199688);
    }
    
    static boolean method715(final long n) {
        try {
            return TextureProvider.animate(n) == 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eg.an(" + ')');
        }
    }
    
    int ac(final Buddy buddy, final Buddy buddy2) {
        if (177258591 * buddy.world != 0 && 0 != 177258591 * buddy2.world) {
            return this.reversed ? buddy.be(473993579).compareToTyped(buddy2.be(473993579), (byte)79) : buddy2.be(473993579).compareToTyped(buddy.be(473993579), (byte)94);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public int au(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, 2118588498);
    }
    
    static int method714(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (n == 5000) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.publicChatMode * -1963411823;
                return 1;
            }
            else if (5001 == n) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 1281407919;
                Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * 1410976369;
                FloorUnderlayDefinition.privateChatMode = class399.method2128(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -108064052);
                if (FloorUnderlayDefinition.privateChatMode == null) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    FloorUnderlayDefinition.privateChatMode = PrivateChatMode.field4161;
                }
                Client.tradeChatMode = -2053731769 * Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
                final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2502, Client.packetWriter.isaacCipher, (short)(-14741));
                packetBufferNode.packetBuffer.bf(-1963411823 * Client.publicChatMode, (byte)1);
                packetBufferNode.packetBuffer.bf(1843384107 * FloorUnderlayDefinition.privateChatMode.id, (byte)98);
                packetBufferNode.packetBuffer.bf(-839909513 * Client.tradeChatMode, (byte)4);
                Client.packetWriter.addNode(packetBufferNode, 414135591);
                return 1;
            }
            else if (n == 5002) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n2 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n3 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher, (short)(-29719));
                packetBufferNode2.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-33)) + 2, (byte)31);
                packetBufferNode2.packetBuffer.ce(s, -1640306244);
                packetBufferNode2.packetBuffer.bf(n2 - 1, (byte)100);
                packetBufferNode2.packetBuffer.bf(n3, (byte)87);
                Client.packetWriter.addNode(packetBufferNode2, 414135591);
                return 1;
            }
            else if (5003 == n) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                final Message messages_getByChannelAndID = Actor.Messages_getByChannelAndID(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 470709205);
                if (messages_getByChannelAndID != null) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID.type * -1117255211;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID.count * -524761677;
                    final String[] interpreter_stringStack = Interpreter.Interpreter_stringStack;
                    final int n4 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                    String prefix;
                    if (null != messages_getByChannelAndID.prefix) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        prefix = messages_getByChannelAndID.prefix;
                    }
                    else {
                        prefix = "";
                    }
                    interpreter_stringStack[n4] = prefix;
                    final String[] interpreter_stringStack2 = Interpreter.Interpreter_stringStack;
                    final int n5 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                    String text;
                    if (null != messages_getByChannelAndID.text) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        text = messages_getByChannelAndID.text;
                    }
                    else {
                        text = "";
                    }
                    interpreter_stringStack2[n5] = text;
                    final String[] interpreter_stringStack3 = Interpreter.Interpreter_stringStack;
                    final int n6 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                    String sender;
                    if (messages_getByChannelAndID.sender != null) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        sender = messages_getByChannelAndID.sender;
                    }
                    else {
                        sender = "";
                    }
                    interpreter_stringStack3[n6] = sender;
                    final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                    final int n7 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    int n8;
                    if (messages_getByChannelAndID.isFromFriend(769376242)) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        n8 = 1;
                    }
                    else if (messages_getByChannelAndID.isFromIgnored(1426002396)) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        n8 = 2;
                    }
                    else {
                        n8 = 0;
                    }
                    interpreter_intStack[n7] = n8;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            else if (5004 == n) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                final Message messages_getMessage = MouseRecorder.Messages_getMessage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)32);
                if (null != messages_getMessage) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -53488167 * messages_getMessage.cycle;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getMessage.count * -524761677;
                    final String[] interpreter_stringStack4 = Interpreter.Interpreter_stringStack;
                    final int n9 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                    String prefix2;
                    if (null != messages_getMessage.prefix) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        prefix2 = messages_getMessage.prefix;
                    }
                    else {
                        prefix2 = "";
                    }
                    interpreter_stringStack4[n9] = prefix2;
                    final String[] interpreter_stringStack5 = Interpreter.Interpreter_stringStack;
                    final int n10 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                    String text2;
                    if (null != messages_getMessage.text) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        text2 = messages_getMessage.text;
                    }
                    else {
                        text2 = "";
                    }
                    interpreter_stringStack5[n10] = text2;
                    final String[] interpreter_stringStack6 = Interpreter.Interpreter_stringStack;
                    final int n11 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                    String sender2;
                    if (messages_getMessage.sender != null) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        sender2 = messages_getMessage.sender;
                    }
                    else {
                        sender2 = "";
                    }
                    interpreter_stringStack6[n11] = sender2;
                    final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                    final int n12 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    int n13;
                    if (messages_getMessage.isFromFriend(2061616997)) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        n13 = 1;
                    }
                    else if (messages_getMessage.isFromIgnored(1426002396)) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        n13 = 2;
                    }
                    else {
                        n13 = 0;
                    }
                    interpreter_intStack2[n12] = n13;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            else if (5005 == n) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                if (FloorUnderlayDefinition.privateChatMode == null) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FloorUnderlayDefinition.privateChatMode.id * 1843384107;
                }
                return 1;
            }
            else if (n == 5008) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                Client.packetWriter.addNode(class314.method1779(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], ClanSettings.clientLanguage, -1, (byte)53), 414135591);
                return 1;
            }
            else if (n == 5009) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                final String s2 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                final String s3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
                final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.field2522, Client.packetWriter.isaacCipher, (short)(-30173));
                packetBufferNode3.packetBuffer.cq(0, (byte)33);
                final int n14 = -1633313603 * packetBufferNode3.packetBuffer.at;
                packetBufferNode3.packetBuffer.ce(s2, -1681698793);
                WorldMapArea.readWorldMapSection(packetBufferNode3.packetBuffer, s3, -53610141);
                packetBufferNode3.packetBuffer.ca(packetBufferNode3.packetBuffer.at * -1633313603 - n14, -1436590249);
                Client.packetWriter.addNode(packetBufferNode3, 414135591);
                return 1;
            }
            else {
                if (n == 5010) {
                    final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    Client.packetWriter.addNode(class314.method1779(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], s4, ClanSettings.clientLanguage, Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)47), 414135591);
                    return 1;
                }
                if (5015 == n) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    String name = null;
                    Label_2075: {
                        if (MusicPatchNode.localPlayer != null) {
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            if (null != MusicPatchNode.localPlayer.username) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                name = MusicPatchNode.localPlayer.username.getName(-710264960);
                                break Label_2075;
                            }
                        }
                        name = "";
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = name;
                    return 1;
                }
                else {
                    if (5016 == n) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.tradeChatMode * -839909513;
                        return 1;
                    }
                    if (n == 5017) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.Messages_getHistorySize(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)127);
                        return 1;
                    }
                    if (n == 5018) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FaceNormal.Messages_getLastChatID(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 858932471);
                        return 1;
                    }
                    else if (5019 == n) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BuddyRankComparator.method707(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1625583201);
                        return 1;
                    }
                    else if (n == 5020) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        DynamicObject.doCheat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -2085867489);
                        return 1;
                    }
                    else {
                        if (5021 == n) {
                            Client.field586 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toLowerCase().trim();
                            return 1;
                        }
                        if (n == 5022) {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Client.field586;
                            return 1;
                        }
                        if (n == 5023) {
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            System.out.println(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987]);
                            return 1;
                        }
                        else if (n == 5030) {
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStackSize -= 854271946;
                            final Message messages_getByChannelAndID2 = Actor.Messages_getByChannelAndID(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -267275754);
                            if (null != messages_getByChannelAndID2) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1117255211 * messages_getByChannelAndID2.type;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID2.count * -524761677;
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.prefix) ? messages_getByChannelAndID2.prefix : "");
                                final String[] interpreter_stringStack7 = Interpreter.Interpreter_stringStack;
                                final int n15 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                                String text3;
                                if (null != messages_getByChannelAndID2.text) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    text3 = messages_getByChannelAndID2.text;
                                }
                                else {
                                    text3 = "";
                                }
                                interpreter_stringStack7[n15] = text3;
                                final String[] interpreter_stringStack8 = Interpreter.Interpreter_stringStack;
                                final int n16 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                                String sender3;
                                if (null != messages_getByChannelAndID2.sender) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    sender3 = messages_getByChannelAndID2.sender;
                                }
                                else {
                                    sender3 = "";
                                }
                                interpreter_stringStack8[n16] = sender3;
                                final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                                final int n17 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                int n18;
                                if (messages_getByChannelAndID2.isFromFriend(2094423608)) {
                                    n18 = 1;
                                }
                                else if (messages_getByChannelAndID2.isFromIgnored(1426002396)) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    n18 = 2;
                                }
                                else {
                                    n18 = 0;
                                }
                                interpreter_intStack3[n17] = n18;
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            }
                            return 1;
                        }
                        else {
                            if (5031 == n) {
                                final Message messages_getMessage2 = MouseRecorder.Messages_getMessage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)32);
                                if (null != messages_getMessage2) {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getMessage2.cycle * -53488167;
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -524761677 * messages_getMessage2.count;
                                    final String[] interpreter_stringStack9 = Interpreter.Interpreter_stringStack;
                                    final int n19 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                                    String prefix3;
                                    if (null != messages_getMessage2.prefix) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        prefix3 = messages_getMessage2.prefix;
                                    }
                                    else {
                                        prefix3 = "";
                                    }
                                    interpreter_stringStack9[n19] = prefix3;
                                    final String[] interpreter_stringStack10 = Interpreter.Interpreter_stringStack;
                                    final int n20 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                                    String text4;
                                    if (messages_getMessage2.text != null) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        text4 = messages_getMessage2.text;
                                    }
                                    else {
                                        text4 = "";
                                    }
                                    interpreter_stringStack10[n20] = text4;
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getMessage2.sender != null) ? messages_getMessage2.sender : "");
                                    final int[] interpreter_intStack4 = Interpreter.Interpreter_intStack;
                                    final int n21 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                    int n22;
                                    if (messages_getMessage2.isFromFriend(1956085208)) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        n22 = 1;
                                    }
                                    else {
                                        n22 = (messages_getMessage2.isFromIgnored(1426002396) ? 2 : 0);
                                    }
                                    interpreter_intStack4[n21] = n22;
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                }
                                else {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                }
                                return 1;
                            }
                            return 2;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eg.bd(" + ')');
        }
    }
    
    public static String er(final UrlRequest urlRequest) {
        return urlRequest.field1152.toString();
    }
    
    int compareBuddy(final Buddy buddy, final Buddy buddy2, final int n) {
        try {
            if (177258591 * buddy.world != 0) {
                if (n <= 2088051618) {
                    throw new IllegalStateException();
                }
                if (0 != 177258591 * buddy2.world) {
                    if (n <= 2088051618) {
                        throw new IllegalStateException();
                    }
                    int n2;
                    if (this.reversed) {
                        if (n <= 2088051618) {
                            throw new IllegalStateException();
                        }
                        n2 = buddy.be(473993579).compareToTyped(buddy2.be(473993579), (byte)115);
                    }
                    else {
                        n2 = buddy2.be(473993579).compareToTyped(buddy.be(473993579), (byte)37);
                    }
                    return n2;
                }
            }
            return this.ao((User)buddy, (User)buddy2, 641920470);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eg.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, 2133466207);
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, 2105169570);
    }
    
    static final void method716(final Actor actor, final int n, final int n2) {
        try {
            class374.worldToScreen(actor.walkBackSequence * 1144428983, actor.field1005 * -411750205, n, 865469075);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eg.jd(" + ')');
        }
    }
}
