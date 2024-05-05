// 
// Decompiled by Procyon v0.5.36
// 

public class class121
{
    public static final int as = 4;
    static final int bz = 48;
    public static final float field1180;
    public static final float field1181;
    static final float aw = 1.3333334f;
    static float[] field1182;
    static final float an = 0.6666667f;
    static final int bf = 54;
    static float[] field1183;
    public static final int af = 0;
    static LoginScreenAnimation field1184;
    static String field1185;
    
    class121() throws Throwable {
        throw new Error();
    }
    
    static {
        field1180 = Math.ulp(1.0f);
        field1181 = class121.field1180 * 2.0f;
        class121.field1183 = new float[4];
        class121.field1182 = new float[5];
    }
    
    static void method719(final class125 class125, final float field1221, float n, float n2, final float field1222, final float field1223, float n3, float n4, final float n5) {
        if (class125 == null) {
            return;
        }
        final float n6 = field1222 - field1221;
        if (0.0 == n6) {
            return;
        }
        final float[] array = { (n - field1221) / n6, (n2 - field1221) / n6 };
        class125.field1217 = (array[0] == 0.33333334f && 0.6666667f == array[1]);
        final float n7 = array[0];
        final float n8 = array[1];
        if (array[0] < 0.0) {
            array[0] = 0.0f;
        }
        if (array[1] > 1.0) {
            array[1] = 1.0f;
        }
        if (array[0] > 1.0 || array[1] < -1.0f) {
            array[1] = 1.0f - array[1];
            if (array[0] < 0.0f) {
                array[0] = 0.0f;
            }
            if (array[1] < 0.0f) {
                array[1] = 0.0f;
            }
            if ((array[0] > 1.0f || array[1] > 1.0f) && class121.field1180 + (float)(1.0 + (array[1] * (array[1] - 2.0) + (array[0] - 2.0f + array[1]) * array[0])) > 0.0f) {
                UrlRequester.request(array, -166868527);
            }
            array[1] = 1.0f - array[1];
        }
        if (n7 != array[0]) {
            n = field1221 + n6 * array[0];
            if (n7 != 0.0) {
                n3 = field1223 + array[0] * (n3 - field1223) / n7;
            }
        }
        if (array[1] != n8) {
            n2 = n6 * array[1] + field1221;
            if (n8 != 1.0) {
                n4 = (float)(n5 - (n5 - n4) * (1.0 - array[1]) / (1.0 - n8));
            }
        }
        class125.field1221 = field1221;
        class125.field1229 = field1222;
        class151.method874(0.0f, array[0], array[1], 1.0f, class125, (byte)2);
        final float n9 = n3 - field1223;
        final float n10 = n4 - n3;
        final float n11 = n5 - n4;
        final float n12 = n10 - n9;
        class125.field1230 = n11 - n10 - n12;
        class125.field1225 = n12 + n12 + n12;
        class125.field1228 = n9 + n9 + n9;
        class125.field1227 = field1223;
    }
    
    static int method719(int n, final Script script, final boolean b, final byte b2) {
        try {
            Widget vmethod3380;
            if (n >= 2000) {
                if (b2 != -1) {
                    throw new IllegalStateException();
                }
                n -= 1000;
                vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            }
            else {
                Widget widget;
                if (b) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    widget = SoundSystem.scriptDotWidget;
                }
                else {
                    widget = class1.scriptActiveWidget;
                }
                vmethod3380 = widget;
            }
            String substring = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            int[] statTransmitTriggers = null;
            if (substring.length() > 0) {
                if (b2 != -1) {
                    throw new IllegalStateException();
                }
                if (substring.charAt(substring.length() - 1) == 'Y') {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    if (n2 > 0) {
                        statTransmitTriggers = new int[n2];
                        while (n2-- > 0) {
                            if (b2 != -1) {
                                throw new IllegalStateException();
                            }
                            statTransmitTriggers[n2] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        }
                    }
                    substring = substring.substring(0, substring.length() - 1);
                }
            }
            Object[] field2984 = new Object[substring.length() + 1];
            for (int i = field2984.length - 1; i >= 1; --i) {
                if (substring.charAt(i - 1) == 's') {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    field2984[i] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                }
                else {
                    field2984[i] = new Integer(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                }
            }
            final int value = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (value != -1) {
                if (b2 != -1) {
                    throw new IllegalStateException();
                }
                field2984[0] = new Integer(value);
            }
            else {
                field2984 = null;
            }
            Label_1598: {
                if (1400 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onClick = field2984;
                }
                else if (n == 1401) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onHold = field2984;
                }
                else if (n == 1402) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onRelease = field2984;
                }
                else if (n == 1403) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onMouseOver = field2984;
                }
                else if (1404 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onMouseLeave = field2984;
                }
                else if (1405 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onDrag = field2984;
                }
                else if (n == 1406) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onTargetLeave = field2984;
                }
                else if (n == 1407) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onVarTransmit = field2984;
                    vmethod3380.varTransmitTriggers = statTransmitTriggers;
                }
                else if (n == 1408) {
                    vmethod3380.onTimer = field2984;
                }
                else if (n == 1409) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onOp = field2984;
                }
                else if (n == 1410) {
                    vmethod3380.onDragComplete = field2984;
                }
                else if (n == 1411) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onClickRepeat = field2984;
                }
                else if (1412 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onMouseRepeat = field2984;
                }
                else if (n == 1414) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onInvTransmit = field2984;
                    vmethod3380.invTransmitTriggers = statTransmitTriggers;
                }
                else if (1415 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onStatTransmit = field2984;
                    vmethod3380.statTransmitTriggers = statTransmitTriggers;
                }
                else if (n == 1416) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onTargetEnter = field2984;
                }
                else if (n == 1417) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onScroll = field2984;
                }
                else if (n == 1418) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onChatTransmit = field2984;
                }
                else if (1419 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onKey = field2984;
                }
                else if (n == 1420) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onFriendTransmit = field2984;
                }
                else if (1421 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onClanTransmit = field2984;
                }
                else if (1422 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onMiscTransmit = field2984;
                }
                else if (n == 1423) {
                    vmethod3380.onDialogAbort = field2984;
                }
                else if (1424 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onSubChange = field2984;
                }
                else if (1425 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onStockTransmit = field2984;
                }
                else if (n == 1426) {
                    vmethod3380.field2998 = field2984;
                }
                else if (n == 1427) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.onResize = field2984;
                }
                else if (1428 == n) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.field2946 = field2984;
                }
                else if (n == 1429) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.field2876 = field2984;
                }
                else if (n == 1430) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.field2988 = field2984;
                }
                else if (n == 1431) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.field2892 = field2984;
                }
                else if (n == 1434) {
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.field2961 = field2984;
                }
                else {
                    if (1435 != n) {
                        if (n >= 1436) {
                            if (b2 != -1) {
                                throw new IllegalStateException();
                            }
                            if (n <= 1439) {
                                if (b2 != -1) {
                                    throw new IllegalStateException();
                                }
                                final class312 method1818 = vmethod3380.method1818(-1006415558);
                                if (null != method1818) {
                                    if (b2 != -1) {
                                        throw new IllegalStateException();
                                    }
                                    if (n == 1436) {
                                        if (b2 != -1) {
                                            throw new IllegalStateException();
                                        }
                                        method1818.field2821 = field2984;
                                    }
                                    else if (1437 == n) {
                                        if (b2 != -1) {
                                            throw new IllegalStateException();
                                        }
                                        method1818.field2826 = field2984;
                                    }
                                    else if (n == 1438) {
                                        if (b2 != -1) {
                                            throw new IllegalStateException();
                                        }
                                        method1818.field2825 = field2984;
                                    }
                                    else if (1439 == n) {
                                        if (b2 != -1) {
                                            throw new IllegalStateException();
                                        }
                                        method1818.field2824 = field2984;
                                    }
                                }
                                break Label_1598;
                            }
                        }
                        return 2;
                    }
                    if (b2 != -1) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.field2984 = field2984;
                }
            }
            vmethod3380.field2978 = true;
            return 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "em.ao(" + ')');
        }
    }
    
    static float at(final class125 class125, final float n) {
        if (null == class125) {
            return 0.0f;
        }
        final float n2 = n - class125.field1221;
        return class125.field1226 + n2 * (class125.field1237 + n2 * (class125.field1223 * n2 + class125.field1224));
    }
    
    static void av(final float field1223, final float n, final float n2, final float n3, final class125 class125) {
        final float n4 = n - field1223;
        final float n5 = n2 - n;
        final float n6 = n3 - n2;
        final float n7 = n5 - n4;
        class125.field1226 = n6 - n5 - n7;
        class125.field1237 = n7 + n7 + n7;
        class125.field1224 = n4 + n4 + n4;
        class125.field1223 = field1223;
    }
    
    static void ax(final class125 class125, final float field1221, float n, float n2, final float field1222, final float field1223, float n3, float n4, final float n5) {
        if (class125 == null) {
            return;
        }
        final float n6 = field1222 - field1221;
        if (0.0 == n6) {
            return;
        }
        final float[] array = { (n - field1221) / n6, (n2 - field1221) / n6 };
        class125.field1217 = (array[0] == 0.33333334f && 0.6666667f == array[1]);
        final float n7 = array[0];
        final float n8 = array[1];
        if (array[0] < 0.0) {
            array[0] = 0.0f;
        }
        if (array[1] > 1.0) {
            array[1] = 1.0f;
        }
        if (array[0] > 1.0 || array[1] < -1.0f) {
            array[1] = 1.0f - array[1];
            if (array[0] < 0.0f) {
                array[0] = 0.0f;
            }
            if (array[1] < 0.0f) {
                array[1] = 0.0f;
            }
            if ((array[0] > 1.0f || array[1] > 1.0f) && class121.field1180 + (float)(1.0 + (array[1] * (array[1] - 2.0) + (array[0] - 2.0f + array[1]) * array[0])) > 0.0f) {
                UrlRequester.request(array, -166868527);
            }
            array[1] = 1.0f - array[1];
        }
        if (n7 != array[0]) {
            n = field1221 + n6 * array[0];
            if (n7 != 0.0) {
                n3 = field1223 + array[0] * (n3 - field1223) / n7;
            }
        }
        if (array[1] != n8) {
            n2 = n6 * array[1] + field1221;
            if (n8 != 1.0) {
                n4 = (float)(n5 - (n5 - n4) * (1.0 - array[1]) / (1.0 - n8));
            }
        }
        class125.field1221 = field1221;
        class125.field1229 = field1222;
        class151.method874(0.0f, array[0], array[1], 1.0f, class125, (byte)64);
        final float n9 = n3 - field1223;
        final float n10 = n4 - n3;
        final float n11 = n5 - n4;
        final float n12 = n10 - n9;
        class125.field1230 = n11 - n10 - n12;
        class125.field1225 = n12 + n12 + n12;
        class125.field1228 = n9 + n9 + n9;
        class125.field1227 = field1223;
    }
    
    static float ay(final class125 class125, final float n, final boolean b) {
        final float n2 = 0.0f;
        if (null == class125 || class125.method748((short)(-28794)) == 0) {
            return n2;
        }
        final float n3 = (float)(class125.field1219[0].field1175 * -834721191);
        final float n4 = (float)(class125.field1219[class125.method748((short)(-6992)) - 1].field1175 * -834721191);
        final float n5 = n4 - n3;
        if (n5 == 0.0) {
            return class125.field1219[0].field1178;
        }
        float n6;
        if (n > n4) {
            n6 = (n - n4) / n5;
        }
        else {
            n6 = (n - n3) / n5;
        }
        final double n7 = (int)n6;
        float n8 = Math.abs((float)(n6 - n7)) * n5;
        final double abs = Math.abs(1.0 + n7);
        final double n9 = abs / 2.0;
        final float n10 = (float)(n9 - (int)n9);
        if (b) {
            if (class125.field1220 == class123.field1204) {
                if (n10 != 0.0) {
                    n8 += n3;
                }
                else {
                    n8 = n4 - n8;
                }
            }
            else if (class125.field1220 != class123.field1202 && class123.field1203 != class125.field1220) {
                if (class123.field1200 == class125.field1220) {
                    final float n11 = n3 - n;
                    final float field1174 = class125.field1219[0].field1174;
                    final float field1175 = class125.field1219[0].field1172;
                    float field1176 = class125.field1219[0].field1178;
                    if (0.0 != field1174) {
                        field1176 -= n11 * field1175 / field1174;
                    }
                    return field1176;
                }
            }
            else {
                n8 = n4 - n8;
            }
        }
        else if (class125.field1236 == class123.field1204) {
            if (n10 != 0.0) {
                n8 = n4 - n8;
            }
            else {
                n8 += n3;
            }
        }
        else if (class125.field1236 == class123.field1202 || class125.field1236 == class123.field1203) {
            n8 += n3;
        }
        else if (class125.field1236 == class123.field1200) {
            final float n12 = n - n4;
            final float field1177 = class125.field1219[class125.method748((short)(-14128)) - 1].field1176;
            final float field1178 = class125.field1219[class125.method748((short)(-21512)) - 1].field1173;
            float field1179 = class125.field1219[class125.method748((short)(-17451)) - 1].field1178;
            if (0.0 != field1177) {
                field1179 += field1178 * n12 / field1177;
            }
            return field1179;
        }
        float offerName = GrandExchangeEvent.getOfferName(class125, n8, 600377481);
        if (b && class125.field1220 == class123.field1203) {
            offerName -= (float)((class125.field1219[class125.method748((short)(-15445)) - 1].field1178 - class125.field1219[0].field1178) * abs);
        }
        else if (!b && class125.field1236 == class123.field1203) {
            offerName += (float)((class125.field1219[class125.method748((short)(-11862)) - 1].field1178 - class125.field1219[0].field1178) * abs);
        }
        return offerName;
    }
    
    static void method724(final byte b) {
        try {
            PacketWriter.kg(Client.packetWriter, 1666824676);
            Client.packetWriter.packetBuffer.at = 0;
            Client.packetWriter.field1133 = null;
            Client.packetWriter.serverPacket = null;
            Client.packetWriter.field1138 = null;
            Client.packetWriter.field1139 = null;
            Client.packetWriter.serverPacketLength = 0;
            Client.packetWriter.field1136 = 0;
            Client.rebootTimer = 0;
            Client.menuOptionsCount = 0;
            Client.un(-1);
            Client.isMenuOpen = false;
            Client.minimapState = 0;
            Client.destinationX = 0;
            for (int i = 0; i < 2048; ++i) {
                if (b == 8) {
                    return;
                }
                Client.players[i] = null;
                Client.js5Error(i);
            }
            MusicPatchNode.localPlayer = null;
            for (int j = 0; j < Client.npcs.length; ++j) {
                if (b == 8) {
                    throw new IllegalStateException();
                }
                final NPC npc = Client.npcs[j];
                if (npc != null) {
                    npc.rotation = -1052277865;
                    npc.zr(-1);
                    npc.false0 = false;
                }
            }
            ItemContainer.itemContainers = new NodeHashTable(32);
            class138.updateGameState(30, 791288191);
            for (int k = 0; k < 100; ++k) {
                if (b == 8) {
                    throw new IllegalStateException();
                }
                Client.field573[k] = true;
            }
            class1.method4(-1323217089);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "em.hh(" + ')');
        }
    }
    
    static float al(final class125 class125, final float n) {
        if (null == class125) {
            return 0.0f;
        }
        final float n2 = n - class125.field1221;
        return class125.field1226 + n2 * (class125.field1237 + n2 * (class125.field1223 * n2 + class125.field1224));
    }
    
    static class85[] method721(final int n) {
        try {
            return new class85[] { class85.field871, class85.field878, class85.field874, class85.field877, class85.field872 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "em.au(" + ')');
        }
    }
    
    static class127[] method721(final byte b) {
        try {
            return new class127[] { class127.field1252, class127.field1254, class127.field1253, class127.field1251, class127.field1271, class127.field1266, class127.field1257, class127.field1258, class127.field1259, class127.field1260, class127.field1261, class127.field1255, class127.field1263, class127.field1256, class127.field1262, class127.field1265, class127.field1264 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "em.au(" + ')');
        }
    }
    
    static float aa(final class125 class125, final float n, final boolean b) {
        final float n2 = 0.0f;
        if (null == class125 || class125.method748((short)(-22868)) == 0) {
            return n2;
        }
        final float n3 = (float)(class125.field1219[0].field1175 * -834721191);
        final float n4 = (float)(class125.field1219[class125.method748((short)(-14414)) - 1].field1175 * -834721191);
        final float n5 = n4 - n3;
        if (n5 == 0.0) {
            return class125.field1219[0].field1178;
        }
        float n6;
        if (n > n4) {
            n6 = (n - n4) / n5;
        }
        else {
            n6 = (n - n3) / n5;
        }
        final double n7 = (int)n6;
        float n8 = Math.abs((float)(n6 - n7)) * n5;
        final double abs = Math.abs(1.0 + n7);
        final double n9 = abs / 2.0;
        final float n10 = (float)(n9 - (int)n9);
        if (b) {
            if (class125.field1220 == class123.field1204) {
                if (n10 != 0.0) {
                    n8 += n3;
                }
                else {
                    n8 = n4 - n8;
                }
            }
            else if (class125.field1220 == class123.field1202 || class123.field1203 == class125.field1220) {
                n8 = n4 - n8;
            }
            else if (class123.field1200 == class125.field1220) {
                final float n11 = n3 - n;
                final float field1174 = class125.field1219[0].field1174;
                final float field1175 = class125.field1219[0].field1172;
                float field1176 = class125.field1219[0].field1178;
                if (0.0 != field1174) {
                    field1176 -= n11 * field1175 / field1174;
                }
                return field1176;
            }
        }
        else if (class125.field1236 == class123.field1204) {
            if (n10 != 0.0) {
                n8 = n4 - n8;
            }
            else {
                n8 += n3;
            }
        }
        else if (class125.field1236 != class123.field1202 && class125.field1236 != class123.field1203) {
            if (class125.field1236 == class123.field1200) {
                final float n12 = n - n4;
                final float field1177 = class125.field1219[class125.method748((short)(-6630)) - 1].field1176;
                final float field1178 = class125.field1219[class125.method748((short)(-237)) - 1].field1173;
                float field1179 = class125.field1219[class125.method748((short)260) - 1].field1178;
                if (0.0 != field1177) {
                    field1179 += field1178 * n12 / field1177;
                }
                return field1179;
            }
        }
        else {
            n8 += n3;
        }
        float offerName = GrandExchangeEvent.getOfferName(class125, n8, -1303126697);
        if (b && class125.field1220 == class123.field1203) {
            offerName -= (float)((class125.field1219[class125.method748((short)(-14258)) - 1].field1178 - class125.field1219[0].field1178) * abs);
        }
        else if (!b && class125.field1236 == class123.field1203) {
            offerName += (float)((class125.field1219[class125.method748((short)133) - 1].field1178 - class125.field1219[0].field1178) * abs);
        }
        return offerName;
    }
    
    static void ai(final float[] array) {
        if (class121.field1180 + array[0] < 1.3333334f) {
            final float n = array[0] - 2.0f;
            final float n2 = array[0] - 1.0f;
            final float n3 = (float)Math.sqrt(n * n - n2 * (n2 * 4.0f));
            final float n4 = 0.5f * (-n + n3);
            if (class121.field1180 + array[1] > n4) {
                array[1] = n4 - class121.field1180;
            }
            else {
                final float n5 = 0.5f * (-n - n3);
                if (array[1] < class121.field1180 + n5) {
                    array[1] = n5 + class121.field1180;
                }
            }
        }
        else {
            array[0] = 1.3333334f - class121.field1180;
            array[1] = 0.33333334f - class121.field1180;
        }
    }
    
    static String method720(String string, final Widget widget, final short n) {
        try {
            if (string.indexOf("%") != -1) {
                if (n >= 338) {
                    throw new IllegalStateException();
                }
                for (int i = 1; i <= 5; ++i) {
                    if (n >= 338) {
                        throw new IllegalStateException();
                    }
                    while (true) {
                        final int index = string.indexOf("%" + i);
                        if (-1 == index) {
                            if (n >= 338) {
                                throw new IllegalStateException();
                            }
                            break;
                        }
                        else {
                            final String substring = string.substring(0, index);
                            final int method478 = ArchiveLoader.method478(widget, i - 1, 1696113134);
                            String string2;
                            if (method478 < 999999999) {
                                if (n >= 338) {
                                    throw new IllegalStateException();
                                }
                                string2 = Integer.toString(method478);
                            }
                            else {
                                string2 = "*";
                            }
                            string = substring + string2 + string.substring(index + 2);
                        }
                    }
                }
            }
            return string;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "em.lp(" + ')');
        }
    }
    
    static final void updateItemPile(final int n, final int n2, final int n3) {
        try {
            final NodeDeque nodeDeque = Client.groundItems[GameEngine.Client_plane * -1727408401][n][n2];
            if (nodeDeque == null) {
                if (n3 <= 1897923909) {
                    return;
                }
                class31.scene.removeWallDecoration(-1727408401 * GameEngine.Client_plane, n, n2);
            }
            else {
                long n4 = -99999999L;
                TileItem tileItem = null;
                for (TileItem tileItem2 = (TileItem)nodeDeque.last(); tileItem2 != null; tileItem2 = (TileItem)nodeDeque.previous()) {
                    if (n3 <= 1897923909) {
                        return;
                    }
                    final ItemComposition set = HealthBarUpdate.set(tileItem2.id * 176307405, (byte)103);
                    long n5 = set.price * -1706039181;
                    if (1 == set.isStackable * 1552863327) {
                        final long n6 = n5;
                        long n7;
                        if (-1745152527 * tileItem2.quantity < Integer.MAX_VALUE) {
                            if (n3 <= 1897923909) {
                                throw new IllegalStateException();
                            }
                            n7 = 1 + tileItem2.quantity * -1745152527;
                        }
                        else {
                            n7 = tileItem2.quantity * -1745152527;
                        }
                        n5 = n6 * n7;
                    }
                    if (n5 > n4) {
                        if (n3 <= 1897923909) {
                            throw new IllegalStateException();
                        }
                        n4 = n5;
                        tileItem = tileItem2;
                    }
                }
                if (null != tileItem) {
                    nodeDeque.addLast(tileItem);
                    TileItem tileItem3 = null;
                    Renderable renderable = null;
                    for (TileItem tileItem4 = (TileItem)nodeDeque.last(); null != tileItem4; tileItem4 = (TileItem)nodeDeque.previous()) {
                        if (n3 <= 1897923909) {
                            return;
                        }
                        if (tileItem.id * 176307405 != tileItem4.id * 176307405) {
                            if (n3 <= 1897923909) {
                                return;
                            }
                            if (tileItem3 == null) {
                                if (n3 <= 1897923909) {
                                    throw new IllegalStateException();
                                }
                                tileItem3 = tileItem4;
                            }
                            if (176307405 * tileItem3.id != tileItem4.id * 176307405) {
                                if (n3 <= 1897923909) {
                                    throw new IllegalStateException();
                                }
                                if (renderable == null) {
                                    if (n3 <= 1897923909) {
                                        throw new IllegalStateException();
                                    }
                                    renderable = tileItem4;
                                }
                            }
                        }
                    }
                    class31.scene.newGroundItemPile(-1727408401 * GameEngine.Client_plane, n, n2, class147.getTileHeight(64 + n * 128, 64 + 128 * n2, GameEngine.Client_plane * -1727408401, (byte)(-37)), tileItem, FaceNormal.calculateTag(n, n2, 3, false, 0, 1232964320), tileItem3, renderable);
                    return;
                }
                if (n3 <= 1897923909) {
                    return;
                }
                class31.scene.removeWallDecoration(GameEngine.Client_plane * -1727408401, n, n2);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "em.kd(" + ')');
        }
    }
    
    public static int ry(final ObjectComposition objectComposition, final int n, final int n2) {
        final IterableNodeHashTable params = objectComposition.params;
        int integer;
        if (null == params) {
            integer = n2;
        }
        else {
            final IntegerNode integerNode = (IntegerNode)params.aa(n);
            if (null == integerNode) {
                integer = n2;
            }
            else {
                integer = integerNode.integer;
            }
        }
        return integer;
    }
    
    static float aq(final class125 class125, final float n) {
        if (null == class125) {
            return 0.0f;
        }
        final float n2 = n - class125.field1221;
        return class125.field1226 + n2 * (class125.field1237 + n2 * (class125.field1223 * n2 + class125.field1224));
    }
    
    static void ag(final float[] array) {
        if (class121.field1180 + array[0] < 1.3333334f) {
            final float n = array[0] - 2.0f;
            final float n2 = array[0] - 1.0f;
            final float n3 = (float)Math.sqrt(n * n - n2 * (n2 * 4.0f));
            final float n4 = 0.5f * (-n + n3);
            if (class121.field1180 + array[1] > n4) {
                array[1] = n4 - class121.field1180;
            }
            else {
                final float n5 = 0.5f * (-n - n3);
                if (array[1] < class121.field1180 + n5) {
                    array[1] = n5 + class121.field1180;
                }
            }
        }
        else {
            array[0] = 1.3333334f - class121.field1180;
            array[1] = 0.33333334f - class121.field1180;
        }
    }
    
    static void ah(final float field1223, final float n, final float n2, final float n3, final class125 class125) {
        final float n4 = n - field1223;
        final float n5 = n2 - n;
        final float n6 = n3 - n2;
        final float n7 = n5 - n4;
        class125.field1226 = n6 - n5 - n7;
        class125.field1237 = n7 + n7 + n7;
        class125.field1224 = n4 + n4 + n4;
        class125.field1223 = field1223;
    }
}
