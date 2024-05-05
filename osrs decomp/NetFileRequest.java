import net.runelite.api.events.AnimationChanged;

// 
// Decompiled by Procyon v0.5.36
// 

public class NetFileRequest extends DualNode
{
    int crc;
    static Archive archive10;
    byte padding;
    static final int as = 22;
    Archive archive;
    
    NetFileRequest() {
    }
    
    static int method1877(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (3100 == n) {
                if (b2 == 49) {
                    throw new IllegalStateException();
                }
                UserComparator5.addGameMessage(0, "", Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -397121414);
                return 1;
            }
            else if (n == 3101) {
                if (b2 == 49) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                FloorDecoration.performPlayerAnimation(MusicPatchNode.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -811104985);
                return 1;
            }
            else {
                if (n == 3103) {
                    if (!Interpreter.field704) {
                        Interpreter.field700 = true;
                    }
                    return 1;
                }
                if (n == 3104) {
                    if (b2 == 49) {
                        throw new IllegalStateException();
                    }
                    final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                    int release = 0;
                    if (WorldMapSectionType.isNumber(s, -1513831152)) {
                        if (b2 == 49) {
                            throw new IllegalStateException();
                        }
                        release = PacketBufferNode.release(s, (byte)(-3));
                    }
                    final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher, (short)(-24462));
                    packetBufferNode.packetBuffer.ba(release, -2081835031);
                    Client.packetWriter.addNode(packetBufferNode, 414135591);
                    return 1;
                }
                else {
                    if (n == 3105) {
                        final String s2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                        final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.field2529, Client.packetWriter.isaacCipher, (short)(-23013));
                        packetBufferNode2.packetBuffer.bf(s2.length() + 1, (byte)2);
                        packetBufferNode2.packetBuffer.ce(s2, -1527410722);
                        Client.packetWriter.addNode(packetBufferNode2, 414135591);
                        return 1;
                    }
                    if (n == 3106) {
                        if (b2 == 49) {
                            throw new IllegalStateException();
                        }
                        final String s3 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                        final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.field2518, Client.packetWriter.isaacCipher, (short)(-6803));
                        packetBufferNode3.packetBuffer.bf(s3.length() + 1, (byte)66);
                        packetBufferNode3.packetBuffer.ce(s3, -2134290402);
                        Client.packetWriter.addNode(packetBufferNode3, 414135591);
                        return 1;
                    }
                    else if (3107 == n) {
                        if (b2 == 49) {
                            throw new IllegalStateException();
                        }
                        UserComparator7.method692(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 129719618);
                        return 1;
                    }
                    else if (n == 3108) {
                        if (b2 == 49) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize -= 1281407919;
                        class370.clickWidget(class165.vmethod3380(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2], (byte)5), Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], -2086145821);
                        return 1;
                    }
                    else if (n == 3109) {
                        if (b2 == 49) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                        final int n3 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                        Widget widget;
                        if (b) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            widget = SoundSystem.scriptDotWidget;
                        }
                        else {
                            widget = class1.scriptActiveWidget;
                        }
                        class370.clickWidget(widget, n2, n3, -1978552364);
                        return 1;
                    }
                    else if (n == 3110) {
                        if (b2 == 49) {
                            throw new IllegalStateException();
                        }
                        class473.mouseCam = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                        return 1;
                    }
                    else if (n == 3111) {
                        if (b2 == 49) {
                            throw new IllegalStateException();
                        }
                        final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                        final int n4 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        boolean b3;
                        if (class20.clientPreferences.getRoofsHidden(-2108669771)) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        interpreter_intStack[n4] = (b3 ? 1 : 0);
                        return 1;
                    }
                    else if (n == 3112) {
                        if (b2 == 49) {
                            throw new IllegalStateException();
                        }
                        ClientPreferences.pb(class20.clientPreferences, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, -1505559794);
                        return 1;
                    }
                    else {
                        if (n == 3113) {
                            final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                            boolean b4;
                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                b4 = true;
                            }
                            else {
                                b4 = false;
                            }
                            Ignored.compareTo_ignored(s4, b4, false, (byte)(-37));
                            return 1;
                        }
                        if (3115 == n) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            final PacketBufferNode packetBufferNode4 = class330.getPacketBufferNode(ClientPacket.field2525, Client.packetWriter.isaacCipher, (short)(-932));
                            packetBufferNode4.packetBuffer.cq(n5, (byte)63);
                            Client.packetWriter.addNode(packetBufferNode4, 414135591);
                            return 1;
                        }
                        else if (3116 == n) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                            final String s5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                            final String s6 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
                            if (s5.length() > 500) {
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                return 1;
                            }
                            else {
                                if (s6.length() <= 500) {
                                    final PacketBufferNode packetBufferNode5 = class330.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher, (short)(-8262));
                                    packetBufferNode5.packetBuffer.cq(1 + DynamicObject.stringCp1252NullTerminatedByteSize(s5, (byte)(-2)) + DynamicObject.stringCp1252NullTerminatedByteSize(s6, (byte)108), (byte)84);
                                    packetBufferNode5.packetBuffer.ce(s5, -1537209956);
                                    packetBufferNode5.packetBuffer.du(n6, -1942268939);
                                    packetBufferNode5.packetBuffer.ce(s6, -2099267515);
                                    Client.packetWriter.addNode(packetBufferNode5, 414135591);
                                    return 1;
                                }
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                return 1;
                            }
                        }
                        else if (3117 == n) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStackSize -= 427135973;
                            return 1;
                        }
                        else if (n == 3118) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            boolean showMouseOverText;
                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                showMouseOverText = true;
                            }
                            else {
                                showMouseOverText = false;
                            }
                            Client.showMouseOverText = showMouseOverText;
                            return 1;
                        }
                        else if (n == 3119) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            boolean field482;
                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                field482 = true;
                            }
                            else {
                                field482 = false;
                            }
                            Client.field482 = field482;
                            return 1;
                        }
                        else if (3120 == n) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                Client.drawPlayerNames = (-1387790283 * Client.drawPlayerNames | 0x1) * -1433710051;
                            }
                            else {
                                Client.drawPlayerNames = (Client.drawPlayerNames * -1387790283 & 0xFFFFFFFE) * -1433710051;
                            }
                            return 1;
                        }
                        else if (n == 3121) {
                            if (b2 == 49) {
                                throw new IllegalStateException();
                            }
                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                Client.drawPlayerNames = -1433710051 * (Client.drawPlayerNames * -1387790283 | 0x2);
                            }
                            else {
                                Client.drawPlayerNames = (Client.drawPlayerNames * -1387790283 & 0xFFFFFFFD) * -1433710051;
                            }
                            return 1;
                        }
                        else {
                            if (3122 == n) {
                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                    Client.drawPlayerNames = -1433710051 * (Client.drawPlayerNames * -1387790283 | 0x4);
                                }
                                else {
                                    Client.drawPlayerNames = (-1387790283 * Client.drawPlayerNames & 0xFFFFFFFB) * -1433710051;
                                }
                                return 1;
                            }
                            if (n == 3123) {
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                    if (b2 == 49) {
                                        throw new IllegalStateException();
                                    }
                                    Client.drawPlayerNames = -1433710051 * (-1387790283 * Client.drawPlayerNames | 0x8);
                                }
                                else {
                                    Client.drawPlayerNames = (Client.drawPlayerNames * -1387790283 & 0xFFFFFFF7) * -1433710051;
                                }
                                return 1;
                            }
                            else if (n == 3124) {
                                if (b2 == 49) {
                                    throw new IllegalStateException();
                                }
                                Client.drawPlayerNames = 0;
                                return 1;
                            }
                            else {
                                if (n == 3125) {
                                    boolean showMouseCross;
                                    if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                        if (b2 == 49) {
                                            throw new IllegalStateException();
                                        }
                                        showMouseCross = true;
                                    }
                                    else {
                                        showMouseCross = false;
                                    }
                                    Client.showMouseCross = showMouseCross;
                                    return 1;
                                }
                                if (3126 == n) {
                                    if (b2 == 49) {
                                        throw new IllegalStateException();
                                    }
                                    boolean showLoadingMessages;
                                    if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                        if (b2 == 49) {
                                            throw new IllegalStateException();
                                        }
                                        showLoadingMessages = true;
                                    }
                                    else {
                                        showLoadingMessages = false;
                                    }
                                    Client.showLoadingMessages = showLoadingMessages;
                                    return 1;
                                }
                                else {
                                    if (n == 3127) {
                                        boolean b5;
                                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                            if (b2 == 49) {
                                                throw new IllegalStateException();
                                            }
                                            b5 = true;
                                        }
                                        else {
                                            b5 = false;
                                        }
                                        class120.setTapToDrop(b5, (byte)(-44));
                                        return 1;
                                    }
                                    if (3128 == n) {
                                        if (b2 == 49) {
                                            throw new IllegalStateException();
                                        }
                                        final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                                        final int n7 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                        boolean b6;
                                        if (class13.getTapToDrop(1764409785)) {
                                            if (b2 == 49) {
                                                throw new IllegalStateException();
                                            }
                                            b6 = true;
                                        }
                                        else {
                                            b6 = false;
                                        }
                                        interpreter_intStack2[n7] = (b6 ? 1 : 0);
                                        return 1;
                                    }
                                    else if (3129 == n) {
                                        if (b2 == 49) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 854271946;
                                        Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * -658916663;
                                        Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] * 583547559;
                                        return 1;
                                    }
                                    else if (n == 3130) {
                                        if (b2 == 49) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 854271946;
                                        return 1;
                                    }
                                    else if (3131 == n) {
                                        if (b2 == 49) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 427135973;
                                        return 1;
                                    }
                                    else {
                                        if (n == 3132) {
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = GameEngine.canvasWidth * -1687260435;
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class262.canvasHeight * 1658005443;
                                            return 1;
                                        }
                                        if (n == 3133) {
                                            if (b2 == 49) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                            return 1;
                                        }
                                        else if (3134 == n) {
                                            if (b2 == 49) {
                                                throw new IllegalStateException();
                                            }
                                            return 1;
                                        }
                                        else if (3135 == n) {
                                            if (b2 == 49) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStackSize -= 854271946;
                                            return 1;
                                        }
                                        else if (n == 3136) {
                                            if (b2 == 49) {
                                                throw new IllegalStateException();
                                            }
                                            Client.field463 = -1068626777;
                                            Client.field526 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -757532791;
                                            return 1;
                                        }
                                        else if (n == 3137) {
                                            if (b2 == 49) {
                                                throw new IllegalStateException();
                                            }
                                            Client.field463 = 719237914;
                                            Client.field526 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -757532791;
                                            return 1;
                                        }
                                        else {
                                            if (3138 == n) {
                                                Client.field463 = 0;
                                                return 1;
                                            }
                                            if (3139 == n) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                Client.field463 = -1787864691;
                                                return 1;
                                            }
                                            else if (3140 == n) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                Client.field463 = -1068626777;
                                                final int n8 = -757532791;
                                                int n9;
                                                if (b) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n9 = SoundSystem.scriptDotWidget.id * 1713081171;
                                                }
                                                else {
                                                    n9 = class1.scriptActiveWidget.id * 1713081171;
                                                }
                                                Client.field526 = n8 * n9;
                                                return 1;
                                            }
                                            else if (3141 == n) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                boolean b7;
                                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b7 = true;
                                                }
                                                else {
                                                    b7 = false;
                                                }
                                                class20.clientPreferences.setIsUsernameHidden(b7, -576467957);
                                                return 1;
                                            }
                                            else if (3142 == n) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                                                final int n10 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                                boolean b8;
                                                if (ClientPreferences.ty(class20.clientPreferences, -2134535580)) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b8 = true;
                                                }
                                                else {
                                                    b8 = false;
                                                }
                                                interpreter_intStack3[n10] = (b8 ? 1 : 0);
                                                return 1;
                                            }
                                            else if (n == 3143) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                boolean login_isUsernameRemembered;
                                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    login_isUsernameRemembered = true;
                                                }
                                                else {
                                                    login_isUsernameRemembered = false;
                                                }
                                                if (!(Client.Login_isUsernameRemembered = login_isUsernameRemembered)) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    class20.clientPreferences.setUsernameToRemember("", -472730554);
                                                }
                                                return 1;
                                            }
                                            else if (n == 3144) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                final int[] interpreter_intStack4 = Interpreter.Interpreter_intStack;
                                                final int n11 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                                boolean b9;
                                                if (Client.Login_isUsernameRemembered) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b9 = true;
                                                }
                                                else {
                                                    b9 = false;
                                                }
                                                interpreter_intStack4[n11] = (b9 ? 1 : 0);
                                                return 1;
                                            }
                                            else if (3145 == n) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                return 1;
                                            }
                                            else if (3146 == n) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                boolean b10;
                                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b10 = true;
                                                }
                                                else {
                                                    b10 = false;
                                                }
                                                class20.clientPreferences.getTitleMusicDisabled(!b10, -527699713);
                                                return 1;
                                            }
                                            else if (n == 3147) {
                                                if (b2 == 49) {
                                                    throw new IllegalStateException();
                                                }
                                                final int[] interpreter_intStack5 = Interpreter.Interpreter_intStack;
                                                final int n12 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                                boolean b11;
                                                if (ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b11 = false;
                                                }
                                                else {
                                                    b11 = true;
                                                }
                                                interpreter_intStack5[n12] = (b11 ? 1 : 0);
                                                return 1;
                                            }
                                            else {
                                                if (n == 3148) {
                                                    return 1;
                                                }
                                                if (3149 == n) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                    return 1;
                                                }
                                                else if (3150 == n) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                    return 1;
                                                }
                                                else if (n == 3151) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                    return 1;
                                                }
                                                else if (3152 == n) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                    return 1;
                                                }
                                                else if (n == 3153) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1158424865 * Login.Login_loadingPercent;
                                                    return 1;
                                                }
                                                else if (n == 3154) {
                                                    if (b2 == 49) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = MouseHandler.method191(-372100645);
                                                    return 1;
                                                }
                                                else {
                                                    if (3155 == n) {
                                                        SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                                                        return 1;
                                                    }
                                                    if (n == 3156) {
                                                        if (b2 == 49) {
                                                            throw new IllegalStateException();
                                                        }
                                                        return 1;
                                                    }
                                                    else if (3157 == n) {
                                                        if (b2 == 49) {
                                                            throw new IllegalStateException();
                                                        }
                                                        Interpreter.Interpreter_intStackSize -= 854271946;
                                                        return 1;
                                                    }
                                                    else {
                                                        if (n == 3158) {
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        if (n == 3159) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (3160 == n) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (n == 3161) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (n == 3162) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (n == 3163) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (n == 3164) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            return 1;
                                                        }
                                                        else if (n == 3165) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (n == 3166) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 854271946;
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (n == 3167) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 854271946;
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (3168 == n) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 854271946;
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                                            return 1;
                                                        }
                                                        else if (n == 3169) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            return 1;
                                                        }
                                                        else if (n == 3170) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (3171 == n) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (3172 == n) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                                            return 1;
                                                        }
                                                        else if (n == 3173) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (n == 3174) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                                            return 1;
                                                        }
                                                        else if (n == 3175) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                                            return 1;
                                                        }
                                                        else if (3176 == n) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            return 1;
                                                        }
                                                        else if (n == 3177) {
                                                            if (b2 == 49) {
                                                                throw new IllegalStateException();
                                                            }
                                                            return 1;
                                                        }
                                                        else {
                                                            if (3178 == n) {
                                                                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                                                                return 1;
                                                            }
                                                            if (3179 == n) {
                                                                if (b2 == 49) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                return 1;
                                                            }
                                                            else if (3180 == n) {
                                                                if (b2 == 49) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                                                                return 1;
                                                            }
                                                            else if (n == 3181) {
                                                                if (b2 == 49) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                ApproximateRouteStrategy.method359(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -458475537);
                                                                return 1;
                                                            }
                                                            else if (3182 == n) {
                                                                if (b2 == 49) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class103.method636(809507201);
                                                                return 1;
                                                            }
                                                            else {
                                                                if (3189 == n) {
                                                                    DevicePcmPlayerProvider.method90(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 329326313);
                                                                    return 1;
                                                                }
                                                                return 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "no.ad(" + ')');
        }
    }
    
    static int method1878(final int n, final Script script, final boolean b, final short n2) {
        try {
            if (n == 6809) {
                final ObjectComposition vmethod3248 = class144.vmethod3248(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (short)5744);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != vmethod3248) ? vmethod3248.name : "");
                return 1;
            }
            return 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "no.ba(" + ')');
        }
    }
    
    static final void method1876(final Actor actor, final byte b) {
        try {
            actor.isWalking = false;
            if (-1 != actor.npcCycle * -1302441815) {
                if (b == 23) {
                    throw new IllegalStateException();
                }
                final SequenceDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(-1302441815 * actor.npcCycle, (byte)49);
                if (spotAnimationDefinition_get != null) {
                    if (b == 23) {
                        throw new IllegalStateException();
                    }
                    if (!spotAnimationDefinition_get.isCachedModelIdSet(-1122299263) && null != spotAnimationDefinition_get.frameIds) {
                        if (b == 23) {
                            throw new IllegalStateException();
                        }
                        actor.field975 -= 105665867;
                        if (424813829 * actor.crawlBackSequence < spotAnimationDefinition_get.frameIds.length) {
                            if (b == 23) {
                                return;
                            }
                            if (actor.field975 * -767724643 > spotAnimationDefinition_get.frameLengths[actor.crawlBackSequence * 424813829]) {
                                actor.field975 = -105665867;
                                actor.crawlBackSequence += 1348853709;
                                ZoneOperation.method1599(spotAnimationDefinition_get, actor.crawlBackSequence * 424813829, 1144428983 * actor.walkBackSequence, actor.field1005 * -411750205, -1566363123);
                            }
                        }
                        if (actor.crawlBackSequence * 424813829 >= spotAnimationDefinition_get.frameIds.length) {
                            if (b == 23) {
                                throw new IllegalStateException();
                            }
                            Label_0596: {
                                if (1363943497 * spotAnimationDefinition_get.frameCount > 0) {
                                    if (b == 23) {
                                        return;
                                    }
                                    actor.crawlBackSequence -= spotAnimationDefinition_get.frameCount * -152931979;
                                    if (spotAnimationDefinition_get.field1823) {
                                        if (b == 23) {
                                            throw new IllegalStateException();
                                        }
                                        actor.combatLevelChange += 1404488991;
                                    }
                                    if (424813829 * actor.crawlBackSequence >= 0 && 424813829 * actor.crawlBackSequence < spotAnimationDefinition_get.frameIds.length) {
                                        if (b == 23) {
                                            throw new IllegalStateException();
                                        }
                                        if (!spotAnimationDefinition_get.field1823) {
                                            break Label_0596;
                                        }
                                        if (b == 23) {
                                            return;
                                        }
                                        if (-463442209 * actor.combatLevelChange < spotAnimationDefinition_get.iterations * 1786137655) {
                                            break Label_0596;
                                        }
                                    }
                                    actor.field975 = 0;
                                    actor.crawlBackSequence = 0;
                                    actor.combatLevelChange = 0;
                                }
                                else {
                                    actor.field975 = 0;
                                    actor.crawlBackSequence = 0;
                                }
                            }
                            ZoneOperation.method1599(spotAnimationDefinition_get, 424813829 * actor.crawlBackSequence, actor.walkBackSequence * 1144428983, actor.field1005 * -411750205, -1566363123);
                        }
                    }
                    else if (spotAnimationDefinition_get.isCachedModelIdSet(640964214)) {
                        if (b == 23) {
                            return;
                        }
                        actor.crawlBackSequence += 1348853709;
                        final int method1128 = spotAnimationDefinition_get.method1128(36751487);
                        if (424813829 * actor.crawlBackSequence < method1128) {
                            KeyHandler.method108(spotAnimationDefinition_get, actor.crawlBackSequence * 424813829, actor.walkBackSequence * 1144428983, -411750205 * actor.field1005, 1996468807);
                        }
                        else {
                            Label_0886: {
                                if (spotAnimationDefinition_get.frameCount * 1363943497 > 0) {
                                    if (b == 23) {
                                        throw new IllegalStateException();
                                    }
                                    actor.crawlBackSequence -= -152931979 * spotAnimationDefinition_get.frameCount;
                                    if (spotAnimationDefinition_get.field1823) {
                                        actor.combatLevelChange += 1404488991;
                                    }
                                    if (424813829 * actor.crawlBackSequence >= 0) {
                                        if (b == 23) {
                                            throw new IllegalStateException();
                                        }
                                        if (424813829 * actor.crawlBackSequence < method1128) {
                                            if (b == 23) {
                                                return;
                                            }
                                            if (!spotAnimationDefinition_get.field1823) {
                                                break Label_0886;
                                            }
                                            if (b == 23) {
                                                return;
                                            }
                                            if (-463442209 * actor.combatLevelChange < 1786137655 * spotAnimationDefinition_get.iterations) {
                                                break Label_0886;
                                            }
                                            if (b == 23) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    }
                                    actor.crawlBackSequence = 0;
                                    actor.field975 = 0;
                                    actor.combatLevelChange = 0;
                                }
                                else {
                                    actor.field975 = 0;
                                    actor.crawlBackSequence = 0;
                                }
                            }
                            KeyHandler.method108(spotAnimationDefinition_get, 424813829 * actor.crawlBackSequence, actor.walkBackSequence * 1144428983, -411750205 * actor.field1005, -271064198);
                        }
                    }
                    else {
                        actor.npcCycle = -327373721;
                    }
                }
                else {
                    actor.npcCycle = -327373721;
                }
            }
            final IterableNodeHashTableIterator iterableNodeHashTableIterator = new IterableNodeHashTableIterator(Actor.qq(actor, (byte)10));
            for (Graphic graphic = (Graphic)iterableNodeHashTableIterator.method2390(); graphic != null; graphic = (Graphic)iterableNodeHashTableIterator.next()) {
                if (b == 23) {
                    throw new IllegalStateException();
                }
                if (-1171575623 * graphic.field4170 != -1) {
                    if (b == 23) {
                        throw new IllegalStateException();
                    }
                    if (-1886224337 * Client.cycle >= -1415749665 * graphic.field4171) {
                        final int n = ItemContainer.SpotAnimationDefinition_get(graphic.field4170 * -1171575623, 1840375113).sequence * 374130911;
                        if (n == -1) {
                            if (b == 23) {
                                throw new IllegalStateException();
                            }
                            graphic.hw();
                            actor.runRightSequence += 1822461181;
                        }
                        else {
                            graphic.field4169 = Math.max(971664459 * graphic.field4169, 0) * -793313949;
                            final SequenceDefinition spotAnimationDefinition_get2 = ItemContainer.SpotAnimationDefinition_get(n, (byte)3);
                            if (null != spotAnimationDefinition_get2.frameIds) {
                                if (b == 23) {
                                    throw new IllegalStateException();
                                }
                                if (!spotAnimationDefinition_get2.isCachedModelIdSet(1480573582)) {
                                    if (b == 23) {
                                        return;
                                    }
                                    final Graphic graphic2 = graphic;
                                    graphic2.field4168 += 1417617079;
                                    if (971664459 * graphic.field4169 < spotAnimationDefinition_get2.frameIds.length) {
                                        if (b == 23) {
                                            return;
                                        }
                                        if (graphic.field4168 * 77733639 > spotAnimationDefinition_get2.frameLengths[graphic.field4169 * 971664459]) {
                                            if (b == 23) {
                                                return;
                                            }
                                            graphic.field4168 = 1417617079;
                                            final Graphic graphic3 = graphic;
                                            graphic3.field4169 -= 793313949;
                                            ZoneOperation.method1599(spotAnimationDefinition_get2, graphic.field4169 * 971664459, 1144428983 * actor.walkBackSequence, actor.field1005 * -411750205, -1566363123);
                                        }
                                    }
                                    if (971664459 * graphic.field4169 >= spotAnimationDefinition_get2.frameIds.length) {
                                        graphic.hw();
                                        actor.runRightSequence += 1822461181;
                                    }
                                    continue;
                                }
                            }
                            if (spotAnimationDefinition_get2.isCachedModelIdSet(1674770839)) {
                                final Graphic graphic4 = graphic;
                                graphic4.field4169 -= 793313949;
                                if (graphic.field4169 * 971664459 < spotAnimationDefinition_get2.method1128(-416496185)) {
                                    if (b == 23) {
                                        throw new IllegalStateException();
                                    }
                                    KeyHandler.method108(spotAnimationDefinition_get2, graphic.field4169 * 971664459, actor.walkBackSequence * 1144428983, actor.field1005 * -411750205, 2090130523);
                                }
                                else {
                                    graphic.hw();
                                    actor.runRightSequence += 1822461181;
                                }
                            }
                            else {
                                graphic.hw();
                                actor.runRightSequence += 1822461181;
                            }
                        }
                    }
                }
            }
            if (actor.overheadTextCyclesRemaining * -1372355773 != -1) {
                if (b == 23) {
                    throw new IllegalStateException();
                }
                if (1253892101 * actor.playerCycle <= 1 && ItemContainer.SpotAnimationDefinition_get(actor.overheadTextCyclesRemaining * -1372355773, (byte)124).precedenceAnimating * 1069382699 == 1 && -1181739279 * actor.field1003 > 0) {
                    if (b == 23) {
                        throw new IllegalStateException();
                    }
                    if (-435598119 * actor.exactMoveArrive1Cycle <= Client.cycle * -1886224337) {
                        if (b == 23) {
                            throw new IllegalStateException();
                        }
                        if (-1274841313 * actor.movementFrame < Client.cycle * -1886224337) {
                            if (b == 23) {
                                throw new IllegalStateException();
                            }
                            actor.playerCycle = -401806131;
                            return;
                        }
                    }
                }
            }
            Label_2795: {
                if (-1372355773 * actor.overheadTextCyclesRemaining != -1) {
                    if (b == 23) {
                        throw new IllegalStateException();
                    }
                    if (1253892101 * actor.playerCycle == 0) {
                        if (b == 23) {
                            throw new IllegalStateException();
                        }
                        final SequenceDefinition spotAnimationDefinition_get3 = ItemContainer.SpotAnimationDefinition_get(-1372355773 * actor.overheadTextCyclesRemaining, (byte)41);
                        if (null != spotAnimationDefinition_get3) {
                            if (b == 23) {
                                throw new IllegalStateException();
                            }
                            if (!spotAnimationDefinition_get3.isCachedModelIdSet(1492554252)) {
                                if (b == 23) {
                                    return;
                                }
                                if (spotAnimationDefinition_get3.frameIds != null) {
                                    if (b == 23) {
                                        throw new IllegalStateException();
                                    }
                                    actor.pathLength += 672779449;
                                    if (actor.currentSequenceFrameIndex * -41215169 < spotAnimationDefinition_get3.frameIds.length) {
                                        if (b == 23) {
                                            throw new IllegalStateException();
                                        }
                                        if (actor.pathLength * 1356757385 > spotAnimationDefinition_get3.frameLengths[-41215169 * actor.currentSequenceFrameIndex]) {
                                            if (b == 23) {
                                                throw new IllegalStateException();
                                            }
                                            actor.pathLength = 672779449;
                                            actor.currentSequenceFrameIndex -= 63286081;
                                            ZoneOperation.method1599(spotAnimationDefinition_get3, -41215169 * actor.currentSequenceFrameIndex, 1144428983 * actor.walkBackSequence, -411750205 * actor.field1005, -1566363123);
                                        }
                                    }
                                    Label_1744: {
                                        if (actor.currentSequenceFrameIndex * -41215169 >= spotAnimationDefinition_get3.frameIds.length) {
                                            if (b == 23) {
                                                throw new IllegalStateException();
                                            }
                                            actor.currentSequenceFrameIndex -= spotAnimationDefinition_get3.frameCount * -823260553;
                                            actor.y -= 823959909;
                                            if (-92383341 * actor.y >= 1786137655 * spotAnimationDefinition_get3.iterations) {
                                                if (b == 23) {
                                                    throw new IllegalStateException();
                                                }
                                                actor.overheadTextCyclesRemaining = 1690721941;
                                                Label_2015: {
                                                    if (actor instanceof NPC) {
                                                        switch (((NPC)actor).getId()) {
                                                            case 8615:
                                                            case 8616:
                                                            case 8617:
                                                            case 8618:
                                                            case 8619:
                                                            case 8620:
                                                            case 8621:
                                                            case 8622: {
                                                                break Label_2015;
                                                            }
                                                        }
                                                    }
                                                    final AnimationChanged animationChanged = new AnimationChanged();
                                                    animationChanged.setActor((net.runelite.api.Actor)actor);
                                                    ScriptFrame.client.getCallbacks().post((Object)animationChanged);
                                                }
                                            }
                                            else {
                                                if (actor.currentSequenceFrameIndex * -41215169 >= 0) {
                                                    if (b == 23) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (-41215169 * actor.currentSequenceFrameIndex < spotAnimationDefinition_get3.frameIds.length) {
                                                        ZoneOperation.method1599(spotAnimationDefinition_get3, actor.currentSequenceFrameIndex * -41215169, 1144428983 * actor.walkBackSequence, -411750205 * actor.field1005, -1566363123);
                                                        break Label_1744;
                                                    }
                                                }
                                                actor.overheadTextCyclesRemaining = 1690721941;
                                                Label_2171: {
                                                    if (actor instanceof NPC) {
                                                        switch (((NPC)actor).getId()) {
                                                            case 8615:
                                                            case 8616:
                                                            case 8617:
                                                            case 8618:
                                                            case 8619:
                                                            case 8620:
                                                            case 8621:
                                                            case 8622: {
                                                                break Label_2171;
                                                            }
                                                        }
                                                    }
                                                    final AnimationChanged animationChanged2 = new AnimationChanged();
                                                    animationChanged2.setActor((net.runelite.api.Actor)actor);
                                                    ScriptFrame.client.getCallbacks().post((Object)animationChanged2);
                                                }
                                            }
                                        }
                                    }
                                    actor.isWalking = spotAnimationDefinition_get3.stretches;
                                    break Label_2795;
                                }
                            }
                            if (spotAnimationDefinition_get3.isCachedModelIdSet(-1173632514)) {
                                if (b == 23) {
                                    throw new IllegalStateException();
                                }
                                actor.currentSequenceFrameIndex -= 63286081;
                                final int method1129 = spotAnimationDefinition_get3.method1128(-2138096785);
                                Label_2657: {
                                    if (actor.currentSequenceFrameIndex * -41215169 < method1129) {
                                        if (b == 23) {
                                            throw new IllegalStateException();
                                        }
                                        KeyHandler.method108(spotAnimationDefinition_get3, -41215169 * actor.currentSequenceFrameIndex, 1144428983 * actor.walkBackSequence, -411750205 * actor.field1005, -579860723);
                                    }
                                    else {
                                        actor.currentSequenceFrameIndex -= spotAnimationDefinition_get3.frameCount * -823260553;
                                        actor.y -= 823959909;
                                        if (actor.y * -92383341 >= 1786137655 * spotAnimationDefinition_get3.iterations) {
                                            if (b == 23) {
                                                return;
                                            }
                                            actor.overheadTextCyclesRemaining = 1690721941;
                                            Label_2555: {
                                                if (actor instanceof NPC) {
                                                    switch (((NPC)actor).getId()) {
                                                        case 8615:
                                                        case 8616:
                                                        case 8617:
                                                        case 8618:
                                                        case 8619:
                                                        case 8620:
                                                        case 8621:
                                                        case 8622: {
                                                            break Label_2555;
                                                        }
                                                    }
                                                }
                                                final AnimationChanged animationChanged3 = new AnimationChanged();
                                                animationChanged3.setActor((net.runelite.api.Actor)actor);
                                                ScriptFrame.client.getCallbacks().post((Object)animationChanged3);
                                            }
                                        }
                                        else {
                                            if (-41215169 * actor.currentSequenceFrameIndex >= 0) {
                                                if (b == 23) {
                                                    throw new IllegalStateException();
                                                }
                                                if (actor.currentSequenceFrameIndex * -41215169 < method1129) {
                                                    KeyHandler.method108(spotAnimationDefinition_get3, -41215169 * actor.currentSequenceFrameIndex, actor.walkBackSequence * 1144428983, -411750205 * actor.field1005, 1626812763);
                                                    break Label_2657;
                                                }
                                                if (b == 23) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            actor.overheadTextCyclesRemaining = 1690721941;
                                            Label_1067: {
                                                if (actor instanceof NPC) {
                                                    switch (((NPC)actor).getId()) {
                                                        case 8615:
                                                        case 8616:
                                                        case 8617:
                                                        case 8618:
                                                        case 8619:
                                                        case 8620:
                                                        case 8621:
                                                        case 8622: {
                                                            break Label_1067;
                                                        }
                                                    }
                                                }
                                                final AnimationChanged animationChanged4 = new AnimationChanged();
                                                animationChanged4.setActor((net.runelite.api.Actor)actor);
                                                ScriptFrame.client.getCallbacks().post((Object)animationChanged4);
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                actor.overheadTextCyclesRemaining = 1690721941;
                                Label_2775: {
                                    if (actor instanceof NPC) {
                                        switch (((NPC)actor).getId()) {
                                            case 8615:
                                            case 8616:
                                            case 8617:
                                            case 8618:
                                            case 8619:
                                            case 8620:
                                            case 8621:
                                            case 8622: {
                                                break Label_2775;
                                            }
                                        }
                                    }
                                    final AnimationChanged animationChanged5 = new AnimationChanged();
                                    animationChanged5.setActor((net.runelite.api.Actor)actor);
                                    ScriptFrame.client.getCallbacks().post((Object)animationChanged5);
                                }
                            }
                        }
                        else {
                            actor.overheadTextCyclesRemaining = 1690721941;
                            Label_2387: {
                                if (actor instanceof NPC) {
                                    switch (((NPC)actor).getId()) {
                                        case 8615:
                                        case 8616:
                                        case 8617:
                                        case 8618:
                                        case 8619:
                                        case 8620:
                                        case 8621:
                                        case 8622: {
                                            break Label_2387;
                                        }
                                    }
                                }
                                final AnimationChanged animationChanged6 = new AnimationChanged();
                                animationChanged6.setActor((net.runelite.api.Actor)actor);
                                ScriptFrame.client.getCallbacks().post((Object)animationChanged6);
                            }
                        }
                    }
                }
            }
            if (actor.playerCycle * 1253892101 > 0) {
                if (b == 23) {
                    throw new IllegalStateException();
                }
                actor.playerCycle += 401806131;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "no.ik(" + ')');
        }
    }
    
    public static String kw(final Username username) {
        if (username == null) {
            username.hashCode();
        }
        return username.getName(-710264960);
    }
}
