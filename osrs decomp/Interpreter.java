import java.util.List;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Date;
import java.util.Comparator;
import java.util.Calendar;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.5.36
// 

public class Interpreter
{
    static int Interpreter_intStackSize;
    static final int an = 5000000;
    static ArrayList field690;
    static int[][] Interpreter_arrays;
    static final int af = 500000;
    static int[] Interpreter_arrayLengths;
    static String[] Interpreter_stringStack;
    static int[] Interpreter_intStack;
    static final int aw = 475000;
    static int[] Interpreter_intLocals;
    static int Interpreter_frameDepth;
    static ScriptFrame[] Interpreter_frames;
    static Calendar Interpreter_calendar;
    static final String[] Interpreter_MONTHS;
    static boolean field700;
    static String[] Interpreter_stringLocals;
    static final double field702;
    static int field703;
    static boolean field704;
    
    Interpreter() throws Throwable {
        throw new Error();
    }
    
    static {
        Interpreter.Interpreter_arrayLengths = new int[5];
        Interpreter.Interpreter_arrays = new int[5][5000];
        Interpreter.Interpreter_intStack = new int[1000];
        Interpreter.Interpreter_stringStack = new String[1000];
        Interpreter.Interpreter_frameDepth = 0;
        Interpreter.Interpreter_frames = new ScriptFrame[50];
        Interpreter.Interpreter_calendar = Calendar.getInstance();
        Interpreter_MONTHS = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Interpreter.field700 = false;
        Interpreter.field704 = false;
        Interpreter.field690 = new ArrayList();
        Interpreter.field703 = 0;
        field702 = Math.log(2.0);
    }
    
    static int fp(final int n, final Script script, final boolean b) {
        if (n == 5000) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.publicChatMode * -1963411823;
            return 1;
        }
        if (-619239031 == n) {
            Interpreter.Interpreter_intStackSize += 1493638540;
            Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 351363821] * -178143283;
            FloorUnderlayDefinition.privateChatMode = class399.method2128(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -108064052);
            if (FloorUnderlayDefinition.privateChatMode == null) {
                FloorUnderlayDefinition.privateChatMode = PrivateChatMode.field4161;
            }
            Client.tradeChatMode = -2053731769 * Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2502, Client.packetWriter.isaacCipher, (short)(-11640));
            packetBufferNode.packetBuffer.bf(-1225708241 * Client.publicChatMode, (byte)81);
            packetBufferNode.packetBuffer.bf(-952429318 * FloorUnderlayDefinition.privateChatMode.id, (byte)17);
            packetBufferNode.packetBuffer.bf(-839909513 * Client.tradeChatMode, (byte)67);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
            return 1;
        }
        if (n == 1510932164) {
            final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n2 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            final int n3 = Interpreter.Interpreter_intStack[-1643441646 * Interpreter.Interpreter_intStackSize + 1];
            final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher, (short)(-706));
            packetBufferNode2.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)37) + 2, (byte)29);
            packetBufferNode2.packetBuffer.ce(s, -1744449269);
            packetBufferNode2.packetBuffer.bf(n2 - 1, (byte)26);
            packetBufferNode2.packetBuffer.bf(n3, (byte)41);
            Client.packetWriter.addNode(packetBufferNode2, 414135591);
            return 1;
        }
        if (5003 == n) {
            Interpreter.Interpreter_intStackSize += 1968144552;
            final Message messages_getByChannelAndID = Actor.Messages_getByChannelAndID(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[1 + -513450997 * Interpreter.Interpreter_intStackSize], -1479182509);
            if (messages_getByChannelAndID != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 609698540) * -964267539 - 1] = messages_getByChannelAndID.type * -1117255211;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1900484279) * -661992596 - 1] = messages_getByChannelAndID.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 17493543) * -1500346111 - 1] = ((null != messages_getByChannelAndID.prefix) ? messages_getByChannelAndID.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1683050) * -2017760987 - 1] = ((null != messages_getByChannelAndID.text) ? messages_getByChannelAndID.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 916962078) * -1814153471 - 1] = ((messages_getByChannelAndID.sender != null) ? messages_getByChannelAndID.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getByChannelAndID.isFromFriend(703062142) ? 1 : (messages_getByChannelAndID.isFromIgnored(1426002396) ? 2 : 0));
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -294202537 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 728449466) * -1343231844 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 599421453) * -437499984 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 1876201353 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 229182643 - 1] = 0;
            }
            return 1;
        }
        if (5004 == n) {
            final Message messages_getMessage = MouseRecorder.Messages_getMessage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2038221898) * 953124614], (byte)32);
            if (null != messages_getMessage) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2067355166) * -964267539 - 1] = 222588074 * messages_getMessage.cycle;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 924491077) * -986248875 - 1] = messages_getMessage.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getMessage.prefix) ? messages_getMessage.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 465598746) * 1338264093 - 1] = ((null != messages_getMessage.text) ? messages_getMessage.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1035224984) * -2017760987 - 1] = ((messages_getMessage.sender != null) ? messages_getMessage.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getMessage.isFromFriend(1958193547) ? 1 : (messages_getMessage.isFromIgnored(1426002396) ? 2 : 0));
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 340629665) * 30456372 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -590695221 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 737026599) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 896586365) * -830774724 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1741226396 - 1] = 0;
            }
            return 1;
        }
        if (1908728807 == n) {
            if (FloorUnderlayDefinition.privateChatMode == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1134277463) * -537964802 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FloorUnderlayDefinition.privateChatMode.id * -1347383691;
            }
            return 1;
        }
        if (n == 5008) {
            Client.packetWriter.addNode(class314.method1779(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -377100595], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 884607421) * -543683414], ClanSettings.clientLanguage, -1, (byte)111), 414135591);
            return 1;
        }
        if (n == 5009) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s2 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -1616459345];
            final String s3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2047236814 + 1];
            final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.field2522, Client.packetWriter.isaacCipher, (short)(-30884));
            packetBufferNode3.packetBuffer.cq(0, (byte)8);
            final int n4 = -89545099 * packetBufferNode3.packetBuffer.at;
            packetBufferNode3.packetBuffer.ce(s2, -2004196012);
            WorldMapArea.readWorldMapSection(packetBufferNode3.packetBuffer, s3, -53610141);
            packetBufferNode3.packetBuffer.ca(packetBufferNode3.packetBuffer.at * -589625153 - n4, -1082321746);
            Client.packetWriter.addNode(packetBufferNode3, 414135591);
            return 1;
        }
        if (n == 5010) {
            final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 827964888) * -711373612];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Client.packetWriter.addNode(class314.method1779(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], s4, ClanSettings.clientLanguage, Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)86), 414135591);
            return 1;
        }
        if (-424772181 == n) {
            String name;
            if (MusicPatchNode.localPlayer != null && null != MusicPatchNode.localPlayer.username) {
                name = MusicPatchNode.localPlayer.username.getName(-710264960);
            }
            else {
                name = "";
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = name;
            return 1;
        }
        if (5016 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -275597205 - 1] = Client.tradeChatMode * 1891820212;
            return 1;
        }
        if (n == 5017) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -139686728 - 1] = World.Messages_getHistorySize(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1937075911) * 75360613], (byte)127);
            return 1;
        }
        if (n == -963649246) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FaceNormal.Messages_getLastChatID(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 998629237) * -964267539], 868123613);
            return 1;
        }
        if (5019 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BuddyRankComparator.method707(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1479837992) * -1868309954], 274222476);
            return 1;
        }
        if (n == 2106310431) {
            DynamicObject.doCheat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1427021596) * -2017760987], -2011344104);
            return 1;
        }
        if (5021 == n) {
            Client.field586 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -605596265].toLowerCase().trim();
            return 1;
        }
        if (n == -578984044) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 661951043) * -2017760987 - 1] = Client.field586;
            return 1;
        }
        if (n == 5023) {
            System.out.println(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 905298820) * -2017760987]);
            return 1;
        }
        if (n == 5030) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final Message messages_getByChannelAndID2 = Actor.Messages_getByChannelAndID(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -1316967610);
            if (null != messages_getByChannelAndID2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1185523049) * -964267539 - 1] = -929851989 * messages_getByChannelAndID2.type;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 246493992) * 958860747 - 1] = messages_getByChannelAndID2.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1060869408) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.prefix) ? messages_getByChannelAndID2.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 242466673 - 1] = ((null != messages_getByChannelAndID2.text) ? messages_getByChannelAndID2.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.sender) ? messages_getByChannelAndID2.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 386865429 - 1] = (messages_getByChannelAndID2.isFromFriend(1582247464) ? 1 : (messages_getByChannelAndID2.isFromIgnored(1426002396) ? 2 : 0));
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 808367906) * -782798511 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1968629566) * 1033578270 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1362068828) * 255119965 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1178325550) * -1054816438 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1823115498) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 1004764292 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -648291359 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 723594494) * -1992019106 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 2041115315) * 1730660739 - 1] = 0;
            }
            return 1;
        }
        if (1504445418 == n) {
            final Message messages_getMessage2 = MouseRecorder.Messages_getMessage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 689633915) * -964267539], (byte)32);
            if (null != messages_getMessage2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1474187363) * -964267539 - 1] = messages_getMessage2.cycle * 997035466;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1359854983 - 1] = -1882290598 * messages_getMessage2.count;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1356088186) * 85618297 - 1] = ((null != messages_getMessage2.prefix) ? messages_getMessage2.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1349301138) * -2017760987 - 1] = ((messages_getMessage2.text != null) ? messages_getMessage2.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getMessage2.sender != null) ? messages_getMessage2.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getMessage2.isFromFriend(738408534) ? 1 : (messages_getMessage2.isFromIgnored(1426002396) ? 2 : 0));
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 2117850311) * -2017760987 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -2014340584 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1594290380) * -632014281 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 692380468) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1617788997) * -1865027410 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 596265636) * -964267539 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 67121259) * -2017760987 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1570684666) * 1083621785 - 1] = 0;
            }
            return 1;
        }
        return 2;
    }
    
    static int dp(final Widget widget) {
        if (widget.type * 883712245 != 11) {
            Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            return 1;
        }
        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.method1809(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 176639177);
        return 1;
    }
    
    static int en(final int n, final Script script, final boolean b) {
        if (3400 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n2 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            final int n3 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            EnumComposition vmethod3248 = class148.vmethod3248(n2, (byte)15);
            if (vmethod3248.outputType != 's') {}
            for (int i = 0; i < -1067065 * vmethod3248.defaultInt; ++i) {
                if (n3 == vmethod3248.keys[i]) {
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1687055834) * -2017760987 - 1] = vmethod3248.strVals[i];
                    vmethod3248 = null;
                    break;
                }
            }
            if (vmethod3248 != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 420517728) * -2017760987 - 1] = vmethod3248.defaultStr;
            }
            return 1;
        }
        if (3408 == n) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n5 = Interpreter.Interpreter_intStack[789279939 * Interpreter.Interpreter_intStackSize + 1];
            final int n6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
            final int n7 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3];
            EnumComposition vmethod3249 = class148.vmethod3248(n6, (byte)15);
            if (n4 == vmethod3249.inputType && n5 == vmethod3249.outputType) {
                for (int j = 0; j < -1067065 * vmethod3249.defaultInt; ++j) {
                    if (n7 == vmethod3249.keys[j]) {
                        if (n5 == -1861613721) {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1826462255) * -2017760987 - 1] = vmethod3249.strVals[j];
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1244739357 - 1] = vmethod3249.intVals[j];
                        }
                        vmethod3249 = null;
                        break;
                    }
                }
                if (null != vmethod3249) {
                    if (n5 == 422712237) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1297509874) * -2017760987 - 1] = vmethod3249.defaultStr;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1907382395) * -380398611 - 1] = 783159457 * vmethod3249.outputCount;
                    }
                }
                return 1;
            }
            if ('s' == n5) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 528137692) * -2017760987 - 1] = Strings.at;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -92239054 - 1] = 0;
            }
            return 1;
        }
        else {
            if (n == 3411) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -65747672 - 1] = class148.vmethod3248(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1751777659) * 1870895516], (byte)15).size(-1843408654);
                return 1;
            }
            return 2;
        }
    }
    
    public static void ca(final ScriptEvent scriptEvent) {
        PlayerType.runScript(scriptEvent, 500000, 475000, 1460071117);
    }
    
    static final void cd(final Widget widget, final int n, final byte[] array, final byte[] array2) {
        if (widget.field2954 == null) {
            if (null == array) {
                return;
            }
            widget.field2954 = new byte[11][];
            widget.field2955 = new byte[11][];
            widget.field2936 = new int[11];
            widget.field2977 = new int[11];
        }
        if (null != (widget.field2954[n] = array)) {
            widget.fill = true;
        }
        else {
            widget.fill = false;
            for (int i = 0; i < widget.field2954.length; ++i) {
                if (widget.field2954[i] != null) {
                    widget.fill = true;
                    break;
                }
            }
        }
        widget.field2955[n] = array2;
    }
    
    static int cr(final int n, final Script script, final boolean b) {
        if (100 == n) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
            if (n3 == 0) {
                throw new RuntimeException();
            }
            final Widget vmethod3380 = class165.vmethod3380(n2, (byte)5);
            if (null == vmethod3380.children) {
                vmethod3380.children = new Widget[1 + n4];
            }
            if (vmethod3380.children.length <= n4) {
                final Widget[] children = new Widget[1 + n4];
                for (int i = 0; i < vmethod3380.children.length; ++i) {
                    children[i] = vmethod3380.children[i];
                }
                vmethod3380.children = children;
            }
            if (n4 > 0 && vmethod3380.children[n4 - 1] == null) {
                throw new RuntimeException("" + (n4 - 1));
            }
            final Widget widget = new Widget();
            widget.type = n3 * -1183495331;
            final Widget widget2 = widget;
            final Widget widget3 = widget;
            final int id = 1 * vmethod3380.id;
            widget3.id = id;
            widget2.parentId = id * -1942978835;
            widget.childIndex = n4 * -1274125071;
            widget.modelOrthog = true;
            if (12 == n3) {
                widget.method1814((byte)0);
                widget.method1815((byte)(-63)).method1775(new class100(widget), -1341782381);
                widget.method1815((byte)16).method1739(new class101(widget), -1866870049);
            }
            vmethod3380.children[n4] = widget;
            if (b) {
                SoundSystem.scriptDotWidget = widget;
            }
            else {
                class1.scriptActiveWidget = widget;
            }
            class144.invalidateWidget(vmethod3380, -1897551131);
            return 1;
        }
        else {
            if (n == 101) {
                final Widget widget4 = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
                final Widget vmethod3381 = class165.vmethod3380(1713081171 * widget4.id, (byte)5);
                vmethod3381.children[55577617 * widget4.childIndex] = null;
                class144.invalidateWidget(vmethod3381, -586079780);
                return 1;
            }
            if (102 == n) {
                final Widget vmethod3382 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
                vmethod3382.children = null;
                class144.invalidateWidget(vmethod3382, -751553306);
                return 1;
            }
            if (200 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n6 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                final Widget widgetChild = SoundSystem.getWidgetChild(n5, n6, -385727023);
                if (widgetChild != null && -1 != n6) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                    if (b) {
                        SoundSystem.scriptDotWidget = widgetChild;
                    }
                    else {
                        class1.scriptActiveWidget = widgetChild;
                    }
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            if (201 == n) {
                final Widget vmethod3383 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
                if (null != vmethod3383) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                    if (b) {
                        SoundSystem.scriptDotWidget = vmethod3383;
                    }
                    else {
                        class1.scriptActiveWidget = vmethod3383;
                    }
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            return 2;
        }
    }
    
    static int cb(int n, final Script script, final boolean b) {
        int n2 = -1;
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            vmethod3380 = class165.vmethod3380(n2, (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (1100 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            if (vmethod3380.type * 883712245 == 12) {
                final class314 method1815 = vmethod3380.method1815((byte)64);
                if (method1815 != null && method1815.method1713(n3, n4, (byte)87)) {
                    class144.invalidateWidget(vmethod3380, -1729375895);
                }
            }
            else {
                vmethod3380.scrollX = 66597705 * n3;
                if (-1469632775 * vmethod3380.scrollX > -773060713 * vmethod3380.scrollWidth - vmethod3380.width * -794961409) {
                    vmethod3380.scrollX = vmethod3380.scrollWidth * 18431759 - vmethod3380.width * 460912311;
                }
                if (vmethod3380.scrollX * -1469632775 < 0) {
                    vmethod3380.scrollX = 0;
                }
                vmethod3380.scrollY = n4 * 946188063;
                if (vmethod3380.scrollY * 1223232735 > -1273374131 * vmethod3380.scrollHeight - 1473950221 * vmethod3380.height) {
                    vmethod3380.scrollY = vmethod3380.scrollHeight * 1941770835 - vmethod3380.height * 978547347;
                }
                if (vmethod3380.scrollY * 1223232735 < 0) {
                    vmethod3380.scrollY = 0;
                }
                class144.invalidateWidget(vmethod3380, -544264626);
            }
            return 1;
        }
        if (n == 1101) {
            vmethod3380.color = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -1604768377;
            class144.invalidateWidget(vmethod3380, -1695117650);
            return 1;
        }
        if (1102 == n) {
            vmethod3380.noScrollThrough = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -1084206987);
            return 1;
        }
        if (1103 == n) {
            vmethod3380.transparencyTop = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1833148663;
            class144.invalidateWidget(vmethod3380, -2020322076);
            return 1;
        }
        if (n == 1104) {
            vmethod3380.lineWid = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1040382753;
            class144.invalidateWidget(vmethod3380, -620212546);
            return 1;
        }
        if (1105 == n) {
            vmethod3380.spriteId2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -504605111;
            class144.invalidateWidget(vmethod3380, -1061368852);
            return 1;
        }
        if (1106 == n) {
            vmethod3380.spriteAngle = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 877496813;
            class144.invalidateWidget(vmethod3380, -1032950024);
            return 1;
        }
        if (1107 == n) {
            vmethod3380.field2913 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -1279379325);
            return 1;
        }
        if (1108 == n) {
            vmethod3380.modelType = -1714481443;
            vmethod3380.modelId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 509431749;
            class144.invalidateWidget(vmethod3380, -1212867810);
            return 1;
        }
        if (1109 == n) {
            Interpreter.Interpreter_intStackSize += 1732151458;
            vmethod3380.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * 1759898391;
            vmethod3380.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] * 1163821709;
            vmethod3380.modelAngleX = -142910041 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
            vmethod3380.modelAngleY = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3] * -230241203;
            vmethod3380.modelAngleZ = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 4] * -1051718121;
            vmethod3380.modelZoom = Interpreter.Interpreter_intStack[5 + Interpreter.Interpreter_intStackSize * -964267539] * -467727501;
            class144.invalidateWidget(vmethod3380, -601806050);
            return 1;
        }
        if (n == 1110) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (-1526544909 * vmethod3380.sequenceId != n5) {
                vmethod3380.sequenceId = -1195025605 * n5;
                vmethod3380.modelFrame = 0;
                vmethod3380.modelFrameCycle = 0;
                class144.invalidateWidget(vmethod3380, -1204939307);
            }
            return 1;
        }
        if (n == 1111) {
            vmethod3380.field2891 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -1819026698);
            return 1;
        }
        if (n == 1112) {
            final String field2916 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            if (!field2916.equals(vmethod3380.field2916)) {
                vmethod3380.field2916 = field2916;
                class144.invalidateWidget(vmethod3380, -1283149803);
            }
            return 1;
        }
        if (1113 == n) {
            vmethod3380.fontId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1858899927;
            if (883712245 * vmethod3380.type == 12) {
                final class314 method1816 = vmethod3380.method1815((byte)(-91));
                if (method1816 != null) {
                    class314.oe(method1816, 1850425779);
                }
            }
            class144.invalidateWidget(vmethod3380, -2102536462);
            return 1;
        }
        if (n == 1114) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            if (12 == vmethod3380.type * 883712245) {
                final class314 method1817 = vmethod3380.method1815((byte)22);
                if (method1817 != null) {
                    method1817.method1714(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], 1527044096);
                    method1817.method1715(Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539], 2104510916);
                }
            }
            else {
                vmethod3380.textXAlignment = 1612549297 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                vmethod3380.textYAlignment = -522107433 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                vmethod3380.textLineHeight = 2116078665 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            }
            class144.invalidateWidget(vmethod3380, -1539146780);
            return 1;
        }
        if (n == 1115) {
            vmethod3380.isIf3 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -698713465);
            return 1;
        }
        if (1116 == n) {
            vmethod3380.outline = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 646392503;
            class144.invalidateWidget(vmethod3380, -1553353010);
            return 1;
        }
        if (1117 == n) {
            vmethod3380.spriteShadow = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -140657215;
            class144.invalidateWidget(vmethod3380, -1422824915);
            return 1;
        }
        if (1118 == n) {
            vmethod3380.noClickThrough = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -1680021201);
            return 1;
        }
        if (n == 1119) {
            vmethod3380.textShadowed = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -2026298042);
            return 1;
        }
        if (1120 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            vmethod3380.scrollWidth = -1469650905 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            vmethod3380.scrollHeight = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] * -1357451643;
            class144.invalidateWidget(vmethod3380, -971046628);
            if (n2 != -1 && 0 == vmethod3380.type * 883712245) {
                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)104);
            }
            return 1;
        }
        if (n == 1121) {
            class81.resumePauseWidget(1713081171 * vmethod3380.id, 55577617 * vmethod3380.childIndex, (short)18278);
            class144.invalidateWidget(Client.meslayerContinueWidget = vmethod3380, -1651965994);
            return 1;
        }
        if (1122 == n) {
            vmethod3380.spriteId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1679014525;
            class144.invalidateWidget(vmethod3380, -1800293909);
            return 1;
        }
        if (1123 == n) {
            vmethod3380.color2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 714852617;
            class144.invalidateWidget(vmethod3380, -1198141943);
            return 1;
        }
        if (n == 1124) {
            vmethod3380.transparencyBot = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -1159723969;
            class144.invalidateWidget(vmethod3380, -672019104);
            return 1;
        }
        if (n == 1125) {
            final FillMode fillMode = (FillMode)StructComposition.findEnumerated(GrandExchangeOffer.method1928(-2033591732), Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (short)173);
            if (fillMode != null) {
                vmethod3380.fillMode = fillMode;
                class144.invalidateWidget(vmethod3380, -1637882727);
            }
            return 1;
        }
        if (n == 1126) {
            vmethod3380.isScrollBar = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        if (1127 == n) {
            vmethod3380.spriteFlipV = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        if (n == 1129) {
            vmethod3380.spellActionName = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            class144.invalidateWidget(vmethod3380, -1614730012);
            return 1;
        }
        if (1130 == n) {
            vmethod3380.method1803(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], class14.urlRequester, Projectile.method450(-65411735));
            return 1;
        }
        if (n == 1131) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            vmethod3380.method1824(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], (byte)(-79));
            return 1;
        }
        if (n == 1132) {
            vmethod3380.method1805(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1401158745);
            return 1;
        }
        if (n == 1133) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class309 method1818 = vmethod3380.method1817(-1740765458);
            if (method1818 != null) {
                method1818.field2817 = 202848117 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                class144.invalidateWidget(vmethod3380, -1480802942);
            }
            return 1;
        }
        if (n == 1134) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class309 method1819 = vmethod3380.method1817(-1740765458);
            if (null != method1819) {
                method1819.field2818 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * -1464228981;
                class144.invalidateWidget(vmethod3380, -1175976118);
            }
            return 1;
        }
        if (n == 1135) {
            SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
            if (null != vmethod3380.method1815((byte)(-36))) {
                vmethod3380.buttonText = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
            }
            return 1;
        }
        if (1136 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class309 method1820 = vmethod3380.method1817(-1740765458);
            if (method1820 != null) {
                method1820.field2816 = -1652794843 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                class144.invalidateWidget(vmethod3380, -1397486406);
            }
            return 1;
        }
        if (1137 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1821 = vmethod3380.method1815((byte)(-48));
            if (method1821 != null && method1821.method1711(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], 1893524609)) {
                class144.invalidateWidget(vmethod3380, -1090887870);
            }
            return 1;
        }
        if (1138 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1822 = vmethod3380.method1815((byte)(-60));
            if (method1822 != null && method1822.method1719(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)16)) {
                class144.invalidateWidget(vmethod3380, -751505679);
            }
            return 1;
        }
        if (n == 1139) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1823 = vmethod3380.method1815((byte)(-94));
            if (null != method1823 && method1823.method1712(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], -587899290)) {
                class144.invalidateWidget(vmethod3380, -1619462198);
            }
            return 1;
        }
        if (n == 1140) {
            final boolean b2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            Client.field590.method1138((byte)31);
            final class314 method1824 = vmethod3380.method1815((byte)(-101));
            if (null != method1824 && method1824.method1706(b2, 1180920021)) {
                if (b2) {
                    Client.field590.method1137(vmethod3380, 270413466);
                }
                class144.invalidateWidget(vmethod3380, -578432342);
            }
            return 1;
        }
        if (1141 == n) {
            final boolean b3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (!b3 && Client.field590.method1144((short)32767) == vmethod3380) {
                Client.field590.method1138((byte)5);
                class144.invalidateWidget(vmethod3380, -1840983811);
            }
            final class314 method1825 = vmethod3380.method1815((byte)(-27));
            if (method1825 != null) {
                method1825.method1707(b3, 1145890629);
            }
            return 1;
        }
        if (1142 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final class314 method1826 = vmethod3380.method1815((byte)(-11));
            if (method1826 != null && method1826.method1725(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], (byte)19)) {
                class144.invalidateWidget(vmethod3380, -1409424919);
            }
            return 1;
        }
        if (n == 1143) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1827 = vmethod3380.method1815((byte)(-27));
            if (null != method1827 && method1827.method1725(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)19)) {
                class144.invalidateWidget(vmethod3380, -1722727427);
            }
            return 1;
        }
        if (1144 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1828 = vmethod3380.method1815((byte)112);
            if (method1828 != null) {
                method1828.method1717(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], 467763467);
                class144.invalidateWidget(vmethod3380, -1050835902);
            }
            return 1;
        }
        if (n == 1145) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1829 = vmethod3380.method1815((byte)(-70));
            if (null != method1829) {
                method1829.method1705(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], -1593275576);
            }
            return 1;
        }
        if (n == 1146) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1830 = vmethod3380.method1815((byte)(-46));
            if (method1830 != null) {
                class314.method1733(method1830, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], (byte)35);
            }
            return 1;
        }
        if (n == 1147) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1831 = vmethod3380.method1815((byte)(-99));
            if (null != method1831) {
                method1831.method1718(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], (short)(-29000));
                class144.invalidateWidget(vmethod3380, -961301483);
            }
            return 1;
        }
        if (1148 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final class27 method1832 = vmethod3380.method1795(1994935481);
            if (null != method1832) {
                method1832.method114(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], (byte)0);
            }
            return 1;
        }
        if (1149 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final class27 method1833 = vmethod3380.method1795(1931880644);
            if (method1833 != null) {
                method1833.method115((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 48495477);
            }
            return 1;
        }
        if (1150 == n) {
            vmethod3380.method1802(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], class14.urlRequester, 554088678);
            return 1;
        }
        return 2;
    }
    
    static int da(final int n, final Script script, final boolean b) {
        if (n == 2700) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2006098851 * class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5).itemId;
            return 1;
        }
        if (n == 2701) {
            final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            if (vmethod3380.itemId * -2006098851 != -1) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.itemQuantity * 1336975799;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (2702 == n) {
            if (null != Client.interfaceParents.at(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539])) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (2706 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.rootInterface * -896157613;
            return 1;
        }
        if (2707 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5).method1807(-1997367907) ? 1 : 0);
            return 1;
        }
        if (2708 == n) {
            return BufferedSource.method2214(class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5), -1234111466);
        }
        if (n == 2709) {
            return class4.method11(class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5), -383595727);
        }
        return 2;
    }
    
    static int ch(int n, final Script script, final boolean b) {
        int n2 = 1;
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            n2 = 0;
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (1300 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
            if (n3 >= 0 && n3 <= 9) {
                Widget.fm(vmethod3380, n3, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)2);
                return 1;
            }
            SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
            return 1;
        }
        else {
            if (n == 1301) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                vmethod3380.parent = SoundSystem.getWidgetChild(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], 1266886851);
                return 1;
            }
            if (1302 == n) {
                vmethod3380.spriteFlipH = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (n == 1303) {
                vmethod3380.dragZoneSize = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1773001161;
                return 1;
            }
            if (n == 1304) {
                vmethod3380.dragThreshold = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1466803237;
                return 1;
            }
            if (n == 1305) {
                vmethod3380.field3004 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            if (n == 1306) {
                vmethod3380.text2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            if (1307 == n) {
                vmethod3380.actions = null;
                return 1;
            }
            if (n == 1308) {
                vmethod3380.field2969 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (1309 == n) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (1350 == n) {
                byte[] array = null;
                byte[] array2 = null;
                if (n2 != 0) {
                    Interpreter.Interpreter_intStackSize += 23607566;
                    int i;
                    for (i = 0; i < 10 && Interpreter.Interpreter_intStack[i + -964267539 * Interpreter.Interpreter_intStackSize] >= 0; i += 2) {}
                    if (i > 0) {
                        array = new byte[i / 2];
                        array2 = new byte[i / 2];
                        for (i -= 2; i >= 0; i -= 2) {
                            array[i / 2] = (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + i];
                            array2[i / 2] = (byte)Interpreter.Interpreter_intStack[1 + (-964267539 * Interpreter.Interpreter_intStackSize + i)];
                        }
                    }
                }
                else {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    array = new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] };
                    array2 = new byte[] { (byte)Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] };
                }
                final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
                if (n4 >= 0 && n4 <= 9) {
                    class7.Widget_setKey(vmethod3380, n4, array, array2, -342137358);
                    return 1;
                }
                throw new RuntimeException();
            }
            else {
                if (1351 == n) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    class7.Widget_setKey(vmethod3380, 10, new byte[] { (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] }, new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] }, 395064453);
                    return 1;
                }
                if (1352 == n) {
                    Interpreter.Interpreter_intStackSize -= 1281407919;
                    final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                    final int n6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                    final int n7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                    if (n5 >= 0 && n5 <= 9) {
                        class68.Widget_setKeyRate(vmethod3380, n5, n6, n7, -45923890);
                        return 1;
                    }
                    throw new RuntimeException();
                }
                else {
                    if (n == 1353) {
                        class68.Widget_setKeyRate(vmethod3380, 10, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -923519745);
                        return 1;
                    }
                    if (n == 1354) {
                        Interpreter.Interpreter_intStackSize -= 427135973;
                        final int n8 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                        if (n8 >= 0 && n8 <= 9) {
                            ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, n8, (byte)(-42));
                            return 1;
                        }
                        throw new RuntimeException();
                    }
                    else {
                        if (1355 == n) {
                            ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, 10, (byte)44);
                            return 1;
                        }
                        return 2;
                    }
                }
            }
        }
    }
    
    static int el(final int n, final Script script, final boolean b) {
        if (n == 3300) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.cycle * -1886224337;
            return 1;
        }
        if (n == 3301) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.read(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)0);
            return 1;
        }
        if (n == 3302) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class431.ItemContainer_getCount(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 2098730562);
            return 1;
        }
        if (n == 3303) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.available(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -273925833);
            return 1;
        }
        if (3304 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ApproximateRouteStrategy.getInvDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1717461998).size * -2010981849;
            return 1;
        }
        if (3305 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.currentLevels[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (3306 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.levels[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (3307 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.experience[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (n == 3308) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 827352769 * GameObject.baseY + (-411750205 * MusicPatchNode.localPlayer.ep >> 7) + ((WorldMapData_0.baseX * -1232093375 + (1144428983 * MusicPatchNode.localPlayer.br >> 7) << 14) + (-1727408401 * GameEngine.Client_plane << 28));
            return 1;
        }
        if (n == 3309) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] >> 14 & 0x3FFF);
            return 1;
        }
        if (n == 3310) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] >> 28;
            return 1;
        }
        if (3311 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] & 0x3FFF);
            return 1;
        }
        if (3312 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Client.isMembersWorld ? 1 : 0);
            return 1;
        }
        if (n == 3313) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.read(32768 + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], (byte)0);
            return 1;
        }
        if (n == 3314) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class431.ItemContainer_getCount(32768 + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 2098730562);
            return 1;
        }
        if (3315 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.available(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + 32768, Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 461350599);
            return 1;
        }
        if (3316 == n) {
            if (Client.staffModLevel * 324465533 >= 2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.staffModLevel * 324465533;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3317) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.rebootTimer * -1496573241;
            return 1;
        }
        if (n == 3318) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -453810525 * Client.worldId;
            return 1;
        }
        if (n == 3321) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -365416549 * Client.runEnergy / 100;
            return 1;
        }
        if (3322 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.weight * -1940722149;
            return 1;
        }
        if (3323 == n) {
            if (Client.playerMod) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3324 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -205173751 * Client.worldProperties;
            return 1;
        }
        if (3325 == n) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] << 14) + (Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539] << 28) + Interpreter.Interpreter_intStack[3 + Interpreter.Interpreter_intStackSize * -964267539];
            return 1;
        }
        if (n == 3326) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -751176573 * Client.lastMouseRecordX;
            return 1;
        }
        if (n == 3327) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.lastMouseRecordY * -2076298705;
            return 1;
        }
        if (3331 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.runEnergy * -365416549;
            return 1;
        }
        return 2;
    }
    
    static int cl(final int n, final Script script, final boolean b) {
        if (n < 1000) {
            return LoginScreenAnimation.method547(n, script, b, -2085055964);
        }
        if (n < 1100) {
            return class131.method766(n, script, b, 1883190484);
        }
        if (n < 1200) {
            return class31.method135(n, script, b, (byte)(-66));
        }
        if (n < 1300) {
            return Varcs.clearTransient(n, script, b, 1996229261);
        }
        if (n < 1400) {
            return StructComposition.method1070(n, script, b, -1679766176);
        }
        if (n < 1500) {
            return class121.method719(n, script, b, (byte)(-1));
        }
        if (n < 1600) {
            return class244.method1391(n, script, b, 6390717);
        }
        if (n < 1700) {
            return AbstractUserComparator.method2166(n, script, b, 724886262);
        }
        if (n < 1800) {
            return DefaultsGroup.method2226(n, script, b, 1394098505);
        }
        if (n < 1900) {
            return Rasterizer3D.method1216(n, script, b, 1730139562);
        }
        if (n < 2000) {
            return class13.method48(n, script, b, (short)511);
        }
        if (n < 2100) {
            return class131.method766(n, script, b, 1883190484);
        }
        if (n < 2200) {
            return class31.method135(n, script, b, (byte)(-40));
        }
        if (n < 2300) {
            return Varcs.clearTransient(n, script, b, 1983712113);
        }
        if (n < 2400) {
            return StructComposition.method1070(n, script, b, -1116249742);
        }
        if (n < 2500) {
            return class121.method719(n, script, b, (byte)(-1));
        }
        if (n < 2600) {
            return class31.method134(n, script, b, (byte)15);
        }
        if (n < 2700) {
            return MouseHandler.method194(n, script, b, (byte)(-25));
        }
        if (n < 2800) {
            return SceneTilePaint.method1347(n, script, b, (byte)59);
        }
        if (n < 2900) {
            return class33.method147(n, script, b, -328074717);
        }
        if (n < 3000) {
            return class13.method48(n, script, b, (short)511);
        }
        if (n < 3200) {
            return NetFileRequest.method1877(n, script, b, (byte)24);
        }
        if (n < 3300) {
            return ObjectComposition.method1094(n, script, b, (byte)6);
        }
        if (n < 3400) {
            return class130.method765(n, script, b, (byte)(-98));
        }
        if (n < 3500) {
            return class380.method2045(n, script, b, 585460704);
        }
        if (n < 3600) {
            return HitSplatDefinition.method1081(n, script, b, (byte)1);
        }
        if (n < 3700) {
            return WorldMapAreaData.method1556(n, script, b, 1038224910);
        }
        if (n < 3800) {
            return FloorOverlayDefinition.method1121(n, script, b, 2049450995);
        }
        if (n < 3900) {
            return class478.method2436(n, script, b, (byte)0);
        }
        if (n < 4000) {
            return class18.method69(n, script, b, 1419677898);
        }
        if (n < 4100) {
            return UserComparator3.method700(n, script, b, 155659856);
        }
        if (n < 4200) {
            return ApproximateRouteStrategy.method361(n, script, b, 16776960);
        }
        if (n < 4300) {
            return MusicPatchPcmStream.method1665(n, script, b, (byte)59);
        }
        if (n < 5100) {
            return UserComparator6.method714(n, script, b, (byte)(-94));
        }
        if (n < 5400) {
            return UserComparator4.method683(n, script, b, -1569204881);
        }
        if (n < 5600) {
            return TaskHandler.method949(n, script, b, -898403827);
        }
        if (n < 5700) {
            return Client.method368(n, script, b, 1058652615);
        }
        if (n < 6300) {
            return class327.method1843(n, script, b, (byte)(-74));
        }
        if (n < 6600) {
            return WorldMapArea.method1431(n, script, b, -1831159571);
        }
        if (n < 6700) {
            return MouseRecorder.method496(n, script, b, 406926894);
        }
        if (n < 6800) {
            return class282.method1590(n, script, b, 394649291);
        }
        if (n < 6900) {
            return NetFileRequest.method1878(n, script, b, (short)(-19929));
        }
        if (n < 7000) {
            return UserComparator7.method694(n, script, b, 1299170741);
        }
        if (n < 7100) {
            return SoundSystem.method247(n, script, b, 2001743352);
        }
        if (n < 7200) {
            return class163.method916(n, script, b, 2092737438);
        }
        if (n < 7300) {
            return class16.method60(n, script, b, -2103319484);
        }
        if (n < 7500) {
            return class126.method754(n, script, b, (short)7864);
        }
        if (n < 7600) {
            return class144.method821(n, script, b, (byte)38);
        }
        if (n < 7700) {
            return FriendSystem.method425(n, script, b, 1248814807);
        }
        return 2;
    }
    
    static int ex(final int n, final Script script, final boolean b) {
        return 2;
    }
    
    static Object gc(final class478 class478) {
        if (null == class478) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch (class478.field4029 * 136869050) {
            case 1: {
                return Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1323418550) * -964267539];
            }
            default: {
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
            }
            case 2: {
                return Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 411726397) * -2017760987];
            }
        }
    }
    
    static int fd(final int n, final Script script, final boolean b) {
        if (5306 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = GrandExchangeOfferNameComparator.getWindowedMode(276264679);
            return 1;
        }
        if (5307 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (n2 == 1 || n2 == 2) {
                Decimator.setWindowedMode(n2, (byte)(-53));
            }
            return 1;
        }
        if (5308 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class20.clientPreferences.method577((byte)106);
            return 1;
        }
        if (5309 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (n3 || n3 == 2) {
                ClientPreferences.uk(class20.clientPreferences, n3, -2119660197);
            }
            return 1;
        }
        if (5310 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            return 1;
        }
        return 2;
    }
    
    static int db(final int n, final Script script, final boolean b) {
        final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
        if (n == 1800) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.method1052(KeyHandler.getWidgetFlags(widget, 701691725), 1739922850);
            return 1;
        }
        if (n == 1801) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            --n2;
            if (null != widget.actions && n2 < widget.actions.length && widget.actions[n2] != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.actions[n2];
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (1802 == n) {
            if (null == widget.field3004) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.field3004;
            }
            return 1;
        }
        return 2;
    }
    
    static int dc(int n, final Script script, final boolean b) {
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        String substring = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
        int[] statTransmitTriggers = null;
        if (substring.length() > 0 && substring.charAt(substring.length() - 1) == 'Y') {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (n2 > 0) {
                statTransmitTriggers = new int[n2];
                while (n2-- > 0) {
                    statTransmitTriggers[n2] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                }
            }
            substring = substring.substring(0, substring.length() - 1);
        }
        Object[] field2824 = new Object[substring.length() + 1];
        for (int i = field2824.length - 1; i >= 1; --i) {
            if (substring.charAt(i - 1) == 's') {
                field2824[i] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            }
            else {
                field2824[i] = new Integer(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            }
        }
        final int value = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
        if (value != -1) {
            field2824[0] = new Integer(value);
        }
        else {
            field2824 = null;
        }
        if (1400 == n) {
            vmethod3380.onClick = field2824;
        }
        else if (n == 1401) {
            vmethod3380.onHold = field2824;
        }
        else if (n == 1402) {
            vmethod3380.onRelease = field2824;
        }
        else if (n == 1403) {
            vmethod3380.onMouseOver = field2824;
        }
        else if (1404 == n) {
            vmethod3380.onMouseLeave = field2824;
        }
        else if (1405 == n) {
            vmethod3380.onDrag = field2824;
        }
        else if (n == 1406) {
            vmethod3380.onTargetLeave = field2824;
        }
        else if (n == 1407) {
            vmethod3380.onVarTransmit = field2824;
            vmethod3380.varTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 1408) {
            vmethod3380.onTimer = field2824;
        }
        else if (n == 1409) {
            vmethod3380.onOp = field2824;
        }
        else if (n == 1410) {
            vmethod3380.onDragComplete = field2824;
        }
        else if (n == 1411) {
            vmethod3380.onClickRepeat = field2824;
        }
        else if (1412 == n) {
            vmethod3380.onMouseRepeat = field2824;
        }
        else if (n == 1414) {
            vmethod3380.onInvTransmit = field2824;
            vmethod3380.invTransmitTriggers = statTransmitTriggers;
        }
        else if (1415 == n) {
            vmethod3380.onStatTransmit = field2824;
            vmethod3380.statTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 1416) {
            vmethod3380.onTargetEnter = field2824;
        }
        else if (n == 1417) {
            vmethod3380.onScroll = field2824;
        }
        else if (n == 1418) {
            vmethod3380.onChatTransmit = field2824;
        }
        else if (1419 == n) {
            vmethod3380.onKey = field2824;
        }
        else if (n == 1420) {
            vmethod3380.onFriendTransmit = field2824;
        }
        else if (1421 == n) {
            vmethod3380.onClanTransmit = field2824;
        }
        else if (1422 == n) {
            vmethod3380.onMiscTransmit = field2824;
        }
        else if (n == 1423) {
            vmethod3380.onDialogAbort = field2824;
        }
        else if (1424 == n) {
            vmethod3380.onSubChange = field2824;
        }
        else if (1425 == n) {
            vmethod3380.onStockTransmit = field2824;
        }
        else if (n == 1426) {
            vmethod3380.field2998 = field2824;
        }
        else if (n == 1427) {
            vmethod3380.onResize = field2824;
        }
        else if (1428 == n) {
            vmethod3380.field2946 = field2824;
        }
        else if (n == 1429) {
            vmethod3380.field2876 = field2824;
        }
        else if (n == 1430) {
            vmethod3380.field2988 = field2824;
        }
        else if (n == 1431) {
            vmethod3380.field2892 = field2824;
        }
        else if (n == 1434) {
            vmethod3380.field2961 = field2824;
        }
        else if (1435 == n) {
            vmethod3380.field2984 = field2824;
        }
        else {
            if (n < 1436 || n > 1439) {
                return 2;
            }
            final class312 method1818 = vmethod3380.method1818(394444676);
            if (null != method1818) {
                if (n == 1436) {
                    method1818.field2821 = field2824;
                }
                else if (1437 == n) {
                    method1818.field2826 = field2824;
                }
                else if (n == 1438) {
                    method1818.field2825 = field2824;
                }
                else if (1439 == n) {
                    method1818.field2824 = field2824;
                }
            }
        }
        vmethod3380.field2978 = true;
        return 1;
    }
    
    static int cf(final int n, final Script script, final boolean b) {
        if (n < 1000) {
            return LoginScreenAnimation.method547(n, script, b, -1876531413);
        }
        if (n < 1100) {
            return class131.method766(n, script, b, 1883190484);
        }
        if (n < 1200) {
            return class31.method135(n, script, b, (byte)(-114));
        }
        if (n < 1300) {
            return Varcs.clearTransient(n, script, b, 492844833);
        }
        if (n < 1400) {
            return StructComposition.method1070(n, script, b, -1843574986);
        }
        if (n < 1500) {
            return class121.method719(n, script, b, (byte)(-1));
        }
        if (n < 1600) {
            return class244.method1391(n, script, b, 6390717);
        }
        if (n < 1700) {
            return AbstractUserComparator.method2166(n, script, b, 467482631);
        }
        if (n < 1800) {
            return DefaultsGroup.method2226(n, script, b, 1713528446);
        }
        if (n < 1900) {
            return Rasterizer3D.method1216(n, script, b, -870205764);
        }
        if (n < 2000) {
            return class13.method48(n, script, b, (short)511);
        }
        if (n < 2100) {
            return class131.method766(n, script, b, 1883190484);
        }
        if (n < 2200) {
            return class31.method135(n, script, b, (byte)(-15));
        }
        if (n < 2300) {
            return Varcs.clearTransient(n, script, b, 908651549);
        }
        if (n < 2400) {
            return StructComposition.method1070(n, script, b, -1233281000);
        }
        if (n < 2500) {
            return class121.method719(n, script, b, (byte)(-1));
        }
        if (n < 2600) {
            return class31.method134(n, script, b, (byte)20);
        }
        if (n < 2700) {
            return MouseHandler.method194(n, script, b, (byte)41);
        }
        if (n < 2800) {
            return SceneTilePaint.method1347(n, script, b, (byte)65);
        }
        if (n < 2900) {
            return class33.method147(n, script, b, -328074717);
        }
        if (n < 3000) {
            return class13.method48(n, script, b, (short)511);
        }
        if (n < 3200) {
            return NetFileRequest.method1877(n, script, b, (byte)9);
        }
        if (n < 3300) {
            return ObjectComposition.method1094(n, script, b, (byte)6);
        }
        if (n < 3400) {
            return class130.method765(n, script, b, (byte)(-65));
        }
        if (n < 3500) {
            return class380.method2045(n, script, b, 1455813016);
        }
        if (n < 3600) {
            return HitSplatDefinition.method1081(n, script, b, (byte)1);
        }
        if (n < 3700) {
            return WorldMapAreaData.method1556(n, script, b, 1038224910);
        }
        if (n < 3800) {
            return FloorOverlayDefinition.method1121(n, script, b, 2119922385);
        }
        if (n < 3900) {
            return class478.method2436(n, script, b, (byte)0);
        }
        if (n < 4000) {
            return class18.method69(n, script, b, 1006128385);
        }
        if (n < 4100) {
            return UserComparator3.method700(n, script, b, 1615354526);
        }
        if (n < 4200) {
            return ApproximateRouteStrategy.method361(n, script, b, 16776960);
        }
        if (n < 4300) {
            return MusicPatchPcmStream.method1665(n, script, b, (byte)125);
        }
        if (n < 5100) {
            return UserComparator6.method714(n, script, b, (byte)(-73));
        }
        if (n < 5400) {
            return UserComparator4.method683(n, script, b, -1642838278);
        }
        if (n < 5600) {
            return TaskHandler.method949(n, script, b, -898403827);
        }
        if (n < 5700) {
            return Client.method368(n, script, b, 1179612810);
        }
        if (n < 6300) {
            return class327.method1843(n, script, b, (byte)(-34));
        }
        if (n < 6600) {
            return WorldMapArea.method1431(n, script, b, 571407379);
        }
        if (n < 6700) {
            return MouseRecorder.method496(n, script, b, 462913791);
        }
        if (n < 6800) {
            return class282.method1590(n, script, b, 1049637414);
        }
        if (n < 6900) {
            return NetFileRequest.method1878(n, script, b, (short)(-18400));
        }
        if (n < 7000) {
            return UserComparator7.method694(n, script, b, -1422762007);
        }
        if (n < 7100) {
            return SoundSystem.method247(n, script, b, 2001743352);
        }
        if (n < 7200) {
            return class163.method916(n, script, b, 310179127);
        }
        if (n < 7300) {
            return class16.method60(n, script, b, -2103319484);
        }
        if (n < 7500) {
            return class126.method754(n, script, b, (short)(-25842));
        }
        if (n < 7600) {
            return class144.method821(n, script, b, (byte)3);
        }
        if (n < 7700) {
            return FriendSystem.method425(n, script, b, -1626954641);
        }
        return 2;
    }
    
    static int dn(final int n, final Script script, final boolean b) {
        final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1974706577], (byte)5);
        if (n == -1069881323) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 260363129) * -964267539 - 1] = vmethod3380.x * 262951665;
            return 1;
        }
        if (n == 2501) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1214890984) * 458462564 - 1] = -1195638991 * vmethod3380.y;
            return 1;
        }
        if (1316149374 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -794961409 * vmethod3380.width;
            return 1;
        }
        if (n == -1536546496) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 453449264 - 1] = 1473950221 * vmethod3380.height;
            return 1;
        }
        if (2504 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1671875211) * -964267539 - 1] = (vmethod3380.spriteTiling ? 1 : 0);
            return 1;
        }
        if (1757940419 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 357426597) * -1584084856 - 1] = vmethod3380.parentId * -2064907603;
            return 1;
        }
        return 2;
    }
    
    static int cw(int n, final Script script, final boolean b) {
        boolean b2 = true;
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            b2 = false;
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (1300 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
            if (n2 < 0 || n2 > 9) {
                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                return 1;
            }
            Widget.fm(vmethod3380, n2, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)2);
            return 1;
        }
        else {
            if (n == 1301) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                vmethod3380.parent = SoundSystem.getWidgetChild(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], -2134353739);
                return 1;
            }
            if (1302 == n) {
                vmethod3380.spriteFlipH = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (n == 1303) {
                vmethod3380.dragZoneSize = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1773001161;
                return 1;
            }
            if (n == 1304) {
                vmethod3380.dragThreshold = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1466803237;
                return 1;
            }
            if (n == 1305) {
                vmethod3380.field3004 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            if (n == 1306) {
                vmethod3380.text2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            if (1307 == n) {
                vmethod3380.actions = null;
                return 1;
            }
            if (n == 1308) {
                vmethod3380.field2969 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (1309 == n) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (1350 == n) {
                byte[] array = null;
                byte[] array2 = null;
                if (b2) {
                    Interpreter.Interpreter_intStackSize += 23607566;
                    int i;
                    for (i = 0; i < 10 && Interpreter.Interpreter_intStack[i + -964267539 * Interpreter.Interpreter_intStackSize] >= 0; i += 2) {}
                    if (i > 0) {
                        array = new byte[i / 2];
                        array2 = new byte[i / 2];
                        for (i -= 2; i >= 0; i -= 2) {
                            array[i / 2] = (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + i];
                            array2[i / 2] = (byte)Interpreter.Interpreter_intStack[1 + (-964267539 * Interpreter.Interpreter_intStackSize + i)];
                        }
                    }
                }
                else {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    array = new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] };
                    array2 = new byte[] { (byte)Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] };
                }
                final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
                if (n3 >= 0 && n3 <= 9) {
                    class7.Widget_setKey(vmethod3380, n3, array, array2, 1137055747);
                    return 1;
                }
                throw new RuntimeException();
            }
            else {
                if (1351 == n) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    class7.Widget_setKey(vmethod3380, 10, new byte[] { (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] }, new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] }, -43816559);
                    return 1;
                }
                if (1352 == n) {
                    Interpreter.Interpreter_intStackSize -= 1281407919;
                    final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                    final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                    final int n6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                    if (n4 < 0 || n4 > 9) {
                        throw new RuntimeException();
                    }
                    class68.Widget_setKeyRate(vmethod3380, n4, n5, n6, -259989049);
                    return 1;
                }
                else {
                    if (n == 1353) {
                        class68.Widget_setKeyRate(vmethod3380, 10, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1993704718);
                        return 1;
                    }
                    if (n == 1354) {
                        Interpreter.Interpreter_intStackSize -= 427135973;
                        final int n7 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                        if (n7 >= 0 && n7 <= 9) {
                            ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, n7, (byte)(-63));
                            return 1;
                        }
                        throw new RuntimeException();
                    }
                    else {
                        if (1355 == n) {
                            ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, 10, (byte)(-13));
                            return 1;
                        }
                        return 2;
                    }
                }
            }
        }
    }
    
    static int cv(int n, final Script script, final boolean b) {
        int n2 = -1;
        Widget vmethod3380;
        if (n >= 1128004222) {
            n -= 1000;
            n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1270541563];
            vmethod3380 = class165.vmethod3380(n2, (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (n == 1000) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            vmethod3380.rawX = 1806877347 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            vmethod3380.rawY = 1231090287 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            vmethod3380.xAlignment = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * 1134975614] * 1656805111;
            vmethod3380.yAlignment = Interpreter.Interpreter_intStack[3 + -1121615624 * Interpreter.Interpreter_intStackSize] * -362988363;
            class144.invalidateWidget(vmethod3380, -1956719044);
            ScriptFrame.client.alignWidget(vmethod3380, 904655378);
            if (n2 != -1 && -765903052 * vmethod3380.type == 0) {
                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)82);
            }
            return 1;
        }
        if (1881024515 == n) {
            Interpreter.Interpreter_intStackSize -= 185792453;
            vmethod3380.rawWidth = 2014346242 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 655903637];
            vmethod3380.rawHeight = 1193771871 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            vmethod3380.widthAlignment = 387308049 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -1285052671];
            vmethod3380.heightAlignment = -1127135092 * Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize];
            class144.invalidateWidget(vmethod3380, -553949025);
            ScriptFrame.client.alignWidget(vmethod3380, -184438138);
            if (-1 != n2 && vmethod3380.type * 883712245 == 0) {
                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)99);
            }
            return 1;
        }
        if (1177140532 == n) {
            final boolean spriteTiling = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1045556134) * -964267539] == 1;
            if (spriteTiling != vmethod3380.spriteTiling) {
                vmethod3380.spriteTiling = spriteTiling;
                class144.invalidateWidget(vmethod3380, -1298970009);
            }
            return 1;
        }
        if (n == 1005) {
            vmethod3380.hasListener = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1013321149) * -964267539] == 1);
            return 1;
        }
        if (n == 1006) {
            vmethod3380.prioritizeMenuEntry = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -654805626] == 1);
            return 1;
        }
        return 2;
    }
    
    static int fw(final int n) {
        return (int)((Math.log(n) / Interpreter.field702 - 7.0) * 256.0);
    }
    
    static int ft(final int n, final Script script, final boolean b) {
        if (n == 7108) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 22222991) * 2016251697 - 1] = (ByteArrayPool.method2091(-1716140071) ? 1 : 0);
            return 1;
        }
        return 2;
    }
    
    static final void dw(final Widget widget, final int n) {
        if (null == widget.field2954) {
            throw new RuntimeException();
        }
        if (null == widget.field2952) {
            widget.field2952 = new int[widget.field2954.length];
        }
        widget.field2952[n] = Integer.MAX_VALUE;
    }
    
    static int cj(int n, final Script script, final boolean b) {
        boolean b2 = true;
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            b2 = false;
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (1300 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
            if (n2 < 0 || n2 > 9) {
                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                return 1;
            }
            Widget.fm(vmethod3380, n2, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)2);
            return 1;
        }
        else {
            if (n == 1301) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                vmethod3380.parent = SoundSystem.getWidgetChild(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], 702951566);
                return 1;
            }
            if (1302 == n) {
                vmethod3380.spriteFlipH = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (n == 1303) {
                vmethod3380.dragZoneSize = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1773001161;
                return 1;
            }
            if (n == 1304) {
                vmethod3380.dragThreshold = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1466803237;
                return 1;
            }
            if (n == 1305) {
                vmethod3380.field3004 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            if (n == 1306) {
                vmethod3380.text2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            if (1307 == n) {
                vmethod3380.actions = null;
                return 1;
            }
            if (n == 1308) {
                vmethod3380.field2969 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (1309 == n) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (1350 == n) {
                byte[] array = null;
                byte[] array2 = null;
                if (b2) {
                    Interpreter.Interpreter_intStackSize += 23607566;
                    int i;
                    for (i = 0; i < 10 && Interpreter.Interpreter_intStack[i + -964267539 * Interpreter.Interpreter_intStackSize] >= 0; i += 2) {}
                    if (i > 0) {
                        array = new byte[i / 2];
                        array2 = new byte[i / 2];
                        for (i -= 2; i >= 0; i -= 2) {
                            array[i / 2] = (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + i];
                            array2[i / 2] = (byte)Interpreter.Interpreter_intStack[1 + (-964267539 * Interpreter.Interpreter_intStackSize + i)];
                        }
                    }
                }
                else {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    array = new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] };
                    array2 = new byte[] { (byte)Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] };
                }
                final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
                if (n3 < 0 || n3 > 9) {
                    throw new RuntimeException();
                }
                class7.Widget_setKey(vmethod3380, n3, array, array2, 896215449);
                return 1;
            }
            else {
                if (1351 == n) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    class7.Widget_setKey(vmethod3380, 10, new byte[] { (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] }, new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] }, 1782489798);
                    return 1;
                }
                if (1352 == n) {
                    Interpreter.Interpreter_intStackSize -= 1281407919;
                    final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                    final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                    final int n6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                    if (n4 >= 0 && n4 <= 9) {
                        class68.Widget_setKeyRate(vmethod3380, n4, n5, n6, -2057855912);
                        return 1;
                    }
                    throw new RuntimeException();
                }
                else {
                    if (n == 1353) {
                        class68.Widget_setKeyRate(vmethod3380, 10, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1096364256);
                        return 1;
                    }
                    if (n == 1354) {
                        Interpreter.Interpreter_intStackSize -= 427135973;
                        final int n7 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                        if (n7 >= 0 && n7 <= 9) {
                            ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, n7, (byte)(-80));
                            return 1;
                        }
                        throw new RuntimeException();
                    }
                    else {
                        if (1355 == n) {
                            ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, 10, (byte)3);
                            return 1;
                        }
                        return 2;
                    }
                }
            }
        }
    }
    
    static Object gf(final int n) {
        return Language.method1948((class478)StructComposition.findEnumerated(class478.method2432(-1960756712), n, (short)173), (byte)76);
    }
    
    static final void cp(final Widget widget, final int n, final byte[] array, final byte[] array2) {
        if (widget.field2954 == null) {
            if (null == array) {
                return;
            }
            widget.field2954 = new byte[11][];
            widget.field2955 = new byte[11][];
            widget.field2936 = new int[11];
            widget.field2977 = new int[11];
        }
        if (null != (widget.field2954[n] = array)) {
            widget.fill = true;
        }
        else {
            widget.fill = false;
            for (int i = 0; i < widget.field2954.length; ++i) {
                if (widget.field2954[i] != null) {
                    widget.fill = true;
                    break;
                }
            }
        }
        widget.field2955[n] = array2;
    }
    
    static int ek(final int n, final Script script, final boolean b) {
        if (3800 == n) {
            if (null != ItemComposition.guestClanSettings) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                class133.field1286 = ItemComposition.guestClanSettings;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3801 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (Client.currentClanSettings[n2] != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                class133.field1286 = Client.currentClanSettings[n2];
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3802) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class133.field1286.name;
            return 1;
        }
        if (3803 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class133.field1286.allowGuests ? 1 : 0);
            return 1;
        }
        if (3804 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1369;
            return 1;
        }
        if (n == 3805) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1359;
            return 1;
        }
        if (3806 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1360;
            return 1;
        }
        if (n == 3807) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1351;
            return 1;
        }
        if (n == 3809) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1247430143 * class133.field1286.memberCount;
            return 1;
        }
        if (n == 3810) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class133.field1286.memberNames[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (3811 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.memberRanks[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (n == 3812) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.bannedMemberCount * -325159675;
            return 1;
        }
        if (3813 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class133.field1286.bannedMemberNames[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (n == 3814) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ClanSettings.iq(class133.field1286, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539], (byte)19);
            return 1;
        }
        if (n == 3815) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.currentOwner * 680027429;
            return 1;
        }
        if (3816 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1374 * -1218077019;
            return 1;
        }
        if (n == 3817) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.method851(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)32);
            return 1;
        }
        if (3818 == n) {
            Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = class133.field1286.getSortedMembers((byte)111)[Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]];
            return 1;
        }
        if (n == 3819) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            WorldMapScaleHandler.method1567(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], (byte)69);
            return 1;
        }
        if (3820 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1366[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (3821 == n) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            Clock.method970(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] == 1, 1397285081);
        }
        if (n == 3822) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class133.field1286.field1375[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]] ? 1 : 0);
            return 1;
        }
        if (3850 == n) {
            if (MouseHandler.guestClanChannel != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                class147.field1346 = MouseHandler.guestClanChannel;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3851 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (Client.currentClanChannels[n3] != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                class147.field1346 = Client.currentClanChannels[n3];
                Login.field763 = 1601506193 * n3;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3852) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class147.field1346.name;
            return 1;
        }
        if (n == 3853) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.field1401;
            return 1;
        }
        if (3854 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.field1396;
            return 1;
        }
        if (3855 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.method898(-910829847);
            return 1;
        }
        if (3856 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class147.field1346.members.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).username.getName(-710264960);
            return 1;
        }
        if (3857 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.members.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).rank;
            return 1;
        }
        if (n == 3858) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.members.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).world * -2113202541;
            return 1;
        }
        if (3859 == n) {
            class151.method872(Login.field763 * -575466127, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1644666284);
            return 1;
        }
        if (n == 3860) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ClanChannel.iq(class147.field1346, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 789095001);
            return 1;
        }
        if (n == 3861) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = class147.field1346.getSortedMembers(-1233596303)[Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]];
            return 1;
        }
        if (3890 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Players.varclan != null) ? 1 : 0);
            return 1;
        }
        return 2;
    }
    
    static int eh(final int n, final Script script, final boolean b) {
        return 2;
    }
    
    static int fk(final int n, final Script script, final boolean b) {
        if (n == 6809) {
            final ObjectComposition vmethod3248 = class144.vmethod3248(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (short)31599);
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != vmethod3248) ? vmethod3248.name : "");
            return 1;
        }
        return 2;
    }
    
    static int fv(final int n, final Script script, final boolean b) {
        if (n == -640769897) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Players.loadWorlds(-1934798189) ? 1 : 0);
            return 1;
        }
        if (6501 == n) {
            final World worldListStart = FaceNormal.worldListStart(1804170415);
            if (null != worldListStart) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = worldListStart.id * -2091224171;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 500394442) * -964267539 - 1] = 1810954985 * worldListStart.properties;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2088354607 - 1] = worldListStart.activity;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -215507635 * worldListStart.location;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1984281520) * -616963713 - 1] = worldListStart.population * 1384164562;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 555352367) * 1353920548 - 1] = worldListStart.host;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 640589530) * -164958422 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 258467121) * 1559423926 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 492450982) * -436621418 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1810854419) * -964267539 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1095114427) * 761063680 - 1] = "";
            }
            return 1;
        }
        if (6502 == n) {
            final World nextWorldListWorld = getNextWorldListWorld(1935092207);
            if (null != nextWorldListWorld) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2091224171 * nextWorldListWorld.id;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1038907005) * -964267539 - 1] = 541275815 * nextWorldListWorld.properties;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -1152765284 - 1] = nextWorldListWorld.activity;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 236590187) * -964267539 - 1] = nextWorldListWorld.location * -665846519;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 2128344149 - 1] = -1396846889 * nextWorldListWorld.population;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 2047788481) * -1931913286 - 1] = nextWorldListWorld.host;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -2014062786 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 720437992) * -2017760987 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1348401339) * 1969822213 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -239129070 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1771523829) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (6506 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            World world = null;
            for (int i = 0; i < -1684228183 * World.World_count; ++i) {
                if (n2 == class31.World_worlds[i].id * 1555951013) {
                    world = class31.World_worlds[i];
                    break;
                }
            }
            if (world != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2134677075) * -1007408722 - 1] = world.id * -1900652848;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1716532612 - 1] = world.properties * 1810954985;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 796722885) * 1468631484 - 1] = world.activity;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 456843329) * -964267539 - 1] = world.location * -665846519;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1959019938 - 1] = -1396846889 * world.population;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 259172750 - 1] = world.host;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 309674143) * 2020705026 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -545955518 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 647355402) * -964267539 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 811154478 - 1] = "";
            }
            return 1;
        }
        if (6507 == n) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            class127.sortWorldList(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], 1 == Interpreter.Interpreter_intStack[-2010336559 * Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539], 1 == Interpreter.Interpreter_intStack[3 + Interpreter.Interpreter_intStackSize * 666039661], (byte)(-60));
            return 1;
        }
        if (n == 6511) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 2093233440];
            if (n3 >= 0 && n3 < -734287707 * World.World_count) {
                final World world2 = class31.World_worlds[n3];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -341132899 - 1] = world2.id * 2095284946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1824706855) * 1959690284 - 1] = world2.properties * 544566990;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1671587844) * 166165257 - 1] = world2.activity;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1712923652 * world2.location;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 2089130385) * -1785287607 - 1] = world2.population * -1396846889;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1943782456) * 1069406149 - 1] = world2.host;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1124164944 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 87610367 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1015051729) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1552338589) * 1218467984 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 1140463132 - 1] = "";
            }
            return 1;
        }
        if (-466594157 == n) {
            Client.followerOpsLowPriority = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        if (n == 6513) {
            Interpreter.Interpreter_intStackSize += 727261151;
            final int n4 = Interpreter.Interpreter_intStack[360317303 * Interpreter.Interpreter_intStackSize];
            final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            final ParamComposition paramDefinition = class33.getParamDefinition(n5, -460955441);
            if (paramDefinition.isString(-580256386)) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 203416600) * -1980207179 - 1] = NPCComposition.vy(AbstractArchive.getNpcDefinition(n4, (byte)(-32)), n5, paramDefinition.defaultStr, 441729178);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 752689674) * -243785585 - 1] = AbstractArchive.getNpcDefinition(n4, (byte)(-47)).getIntParam(n5, -2008326779 * paramDefinition.defaultInt, 1692546242);
            }
            return 1;
        }
        if (804347856 == n) {
            Interpreter.Interpreter_intStackSize += 1157878799;
            final int n6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            final int n7 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            final ParamComposition paramDefinition2 = class33.getParamDefinition(n7, 384714546);
            if (paramDefinition2.isString(-85507824)) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1863692303) * -1032093546 - 1] = class144.vmethod3248(n6, (short)17537).getStringParam(n7, paramDefinition2.defaultStr, 1324762508);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 538571932) * -964267539 - 1] = class144.vmethod3248(n6, (short)18933).getIntParam(n7, paramDefinition2.defaultInt * 916764721, -1372901094);
            }
            return 1;
        }
        if (6515 == n) {
            Interpreter.Interpreter_intStackSize += 1403521412;
            final int n8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 167012188];
            final int n9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -361542455 + 1];
            final ParamComposition paramDefinition3 = class33.getParamDefinition(n9, -1932703051);
            if (paramDefinition3.isString(-438441247)) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 314719805 - 1] = HealthBarUpdate.set(n8, (byte)126).getStringParam(n9, paramDefinition3.defaultStr, (byte)0);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1773255878) * -1270824607 - 1] = HealthBarUpdate.set(n8, (byte)8).getIntParam(n9, -171401431 * paramDefinition3.defaultInt, (byte)89);
            }
            return 1;
        }
        if (-1279442075 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n10 = Interpreter.Interpreter_intStack[-1263221004 * Interpreter.Interpreter_intStackSize];
            final int n11 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            final ParamComposition paramDefinition4 = class33.getParamDefinition(n11, -421985609);
            if (paramDefinition4.isString(-1022164408)) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -201571970 - 1] = class195.StructDefinition_getStructDefinition(n10, -891914589).getStringParam(n11, paramDefinition4.defaultStr, 1889287963);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1587471125 - 1] = class195.StructDefinition_getStructDefinition(n10, -583143755).getIntParam(n11, -53960388 * paramDefinition4.defaultInt, (byte)(-16));
            }
            return 1;
        }
        if (6518 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Client.onMobile ? 1 : 0);
            return 1;
        }
        if (-1564910410 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 981498539) * 1934588460 - 1] = Client.clientType * -749752677;
            return 1;
        }
        if (-689352677 == n) {
            return 1;
        }
        if (n == -331937757) {
            return 1;
        }
        if (n == -116961594) {
            SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
            Interpreter.Interpreter_intStackSize -= 427135973;
            return 1;
        }
        if (n == 6523) {
            SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
            Interpreter.Interpreter_intStackSize -= 1746723969;
            return 1;
        }
        if (n == 6524) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 931738279) * 292583533 - 1] = -1;
            return 1;
        }
        if (6525 == n) {
            return Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
        }
        if (6526 == n) {
            return Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1281790404 - 1] = 1;
        }
        if (n == 6527) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 242456370 * Client.field363;
            return 1;
        }
        return 2;
    }
    
    static int fh(final int n, final Script script, final boolean b) {
        if (4200 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)123).name;
            return 1;
        }
        if (4201 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n2 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            final int n3 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            final ItemComposition set = HealthBarUpdate.set(n2, (byte)49);
            if (n3 >= 1 && n3 <= 5 && set.groundActions[n3 - 1] != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = set.groundActions[n3 - 1];
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 4202) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            final ItemComposition set2 = HealthBarUpdate.set(n4, (byte)91);
            if (n5 >= 1 && n5 <= 5 && null != set2.inventoryActions[n5 - 1]) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = set2.inventoryActions[n5 - 1];
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (4203 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)50).price * -1706039181;
            return 1;
        }
        if (n == 4204) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)76).isStackable * 1552863327 == 1) ? 1 : 0);
            return 1;
        }
        if (n == 4205) {
            final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            final ItemComposition set3 = HealthBarUpdate.set(n6, (byte)10);
            if (-1375068187 * set3.noteTemplate == -1 && 1399852547 * set3.note >= 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = set3.note * 1399852547;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n6;
            }
            return 1;
        }
        if (n == 4206) {
            final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            final ItemComposition set4 = HealthBarUpdate.set(n7, (byte)109);
            if (-1375068187 * set4.noteTemplate >= 0 && set4.note * 1399852547 >= 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = set4.note * 1399852547;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n7;
            }
            return 1;
        }
        if (n == 4207) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)20).isMembersOnly ? 1 : 0);
            return 1;
        }
        if (4208 == n) {
            final int n8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            final ItemComposition set5 = HealthBarUpdate.set(n8, (byte)11);
            if (-1 == 119859889 * set5.placeholderTemplate && set5.placeholder * -172219939 >= 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = set5.placeholder * -172219939;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n8;
            }
            return 1;
        }
        if (n == 4209) {
            final int n9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            final ItemComposition set6 = HealthBarUpdate.set(n9, (byte)10);
            if (set6.placeholderTemplate * 119859889 >= 0 && set6.placeholder * -172219939 >= 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -172219939 * set6.placeholder;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n9;
            }
            return 1;
        }
        if (4210 == n) {
            class68.findItemDefinitions(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1 == Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (short)255);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1764192979 * class264.foundItemIdCount;
            return 1;
        }
        if (4211 == n) {
            if (class399.foundItemIds != null && -859067495 * FontName.foundItemIndex < class264.foundItemIdCount * 1764192979) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class399.foundItemIds[(FontName.foundItemIndex += 1333557417) * -859067495 - 1] & 0xFFFF);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            return 1;
        }
        if (4212 == n) {
            FontName.foundItemIndex = 0;
            return 1;
        }
        if (n == 4213) {
            final int shiftClickIndex = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)121).getShiftClickIndex((byte)(-33));
            if (shiftClickIndex == -1) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = shiftClickIndex;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = shiftClickIndex + 1;
            }
            return 1;
        }
        if (4214 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)86).maleModel * -1935812527;
            return 1;
        }
        if (4215 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)60).maleModel1 * -1719338253;
            return 1;
        }
        if (4216 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)100).maleModel2 * 723093341;
            return 1;
        }
        if (4217 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1162544887 * HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)30).field1774;
            return 1;
        }
        return 2;
    }
    
    static int ev(final int n, final Script script, final boolean b) {
        if (n == 3600) {
            if (World.friendSystem.field672 * -543465736 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 705282655 - 1] = -2;
            }
            else if (World.friendSystem.field672 * -1736413869 == 1) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 2047184286 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1866059127 - 1] = World.friendSystem.friendsList.bm(792584390);
            }
            return 1;
        }
        if (1494820075 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1205763015) * 1155586216];
            if (World.friendSystem.method420(1974407435) && n2 >= 0 && n2 < World.friendSystem.friendsList.bm(-1774719835)) {
                final Friend friend = (Friend)UserList.pn(World.friendSystem.friendsList, n2, 1064175227);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1084424489) * -2017760987 - 1] = friend.bx(279129393);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2002538805 - 1] = User.tg(friend, -43557433);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 84358286) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -1832428598 - 1] = "";
            }
            return 1;
        }
        if (n == 3602) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1728256456) * -365997229];
            if (World.friendSystem.method420(-131473580) && n3 >= 0 && n3 < World.friendSystem.friendsList.bm(-75696240)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1894999469 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n3, -619804500)).world * -1882972177;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1123596624 - 1] = 0;
            }
            return 1;
        }
        if (638362410 == n) {
            final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1988237417) * -964267539];
            if (World.friendSystem.method420(1387807208) && n4 >= 0 && n4 < World.friendSystem.friendsList.bm(-1415835257)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n4, -320706812)).rank * 1537413426;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1535379735) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3604 == n) {
            LoginScreenAnimation.method554(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 220927381) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)48);
            return 1;
        }
        if (3605 == n) {
            World.friendSystem.addFriend(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)(-114));
            return 1;
        }
        if (3606 == n) {
            FriendSystem.ti(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1037750879) * 1646968992], -684375214);
            return 1;
        }
        if (n == 3607) {
            FriendSystem.zz(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1284746037) * -2017760987], 42988923);
            return 1;
        }
        if (n == -358140296) {
            World.friendSystem.removeIgnore(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -259638117], true, (byte)45);
            return 1;
        }
        if (n == 1426700637) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2113972527) * -975926712 - 1] = (World.friendSystem.isFriended(new Username(ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 153284928) * 775700731], 1227239523), class70.loginType), false, (byte)(-25)) ? 1 : 0);
            return 1;
        }
        if (n == 3611) {
            if (UserComparator5.friendsChat != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 1690357016 - 1] = UserComparator5.friendsChat.name;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 349258304 - 1] = "";
            }
            return 1;
        }
        if (n == -853000925) {
            if (UserComparator5.friendsChat != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1564959469) * 2099429293 - 1] = UserComparator5.friendsChat.bm(-1559448014);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -571138026 - 1] = 0;
            }
            return 1;
        }
        if (n == 3613) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 553284279) * 2051262103];
            if (null != UserComparator5.friendsChat && n5 < UserComparator5.friendsChat.bm(977652917)) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserList.pn(UserComparator5.friendsChat, n5, 1524951191).getUsername(473993579).getName(-710264960);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == -18716730) {
            final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 308513828) * 1159035282];
            if (UserComparator5.friendsChat != null && n6 < UserComparator5.friendsChat.bm(1118499975)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1810908464) * 207767737 - 1] = Buddy.hn((Buddy)UserList.pn(UserComparator5.friendsChat, n6, 814413288), -1195929935);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3615 == n) {
            final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1845949310) * -721889313];
            if (null != UserComparator5.friendsChat && n7 < UserComparator5.friendsChat.bm(-1130904914)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 789865512) * 2145065597 - 1] = ((Buddy)UserList.pn(UserComparator5.friendsChat, n7, 1590102774)).rank * 969692992;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3616 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2041847926) * -964267539 - 1] = ((UserComparator5.friendsChat != null) ? UserComparator5.friendsChat.minKick : 0);
            return 1;
        }
        if (-828426039 == n) {
            class478.clanKickUser(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 2030470131) * -2017760987], (byte)122);
            return 1;
        }
        if (3618 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 577798507) * -964267539 - 1] = ((UserComparator5.friendsChat != null) ? (1788650387 * UserComparator5.friendsChat.rank) : 0);
            return 1;
        }
        if (551830672 == n) {
            class379.Clan_joinChat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 594460936) * -2069837122], -164226677);
            return 1;
        }
        if (721256407 == n) {
            WorldMapData_0.Clan_leaveChat(1773178818);
            return 1;
        }
        if (2115066796 == n) {
            if (!World.friendSystem.method420(-1745214203)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1881506905) * 1313225493 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 860667373) * -964267539 - 1] = World.friendSystem.ignoreList.bm(1866213416);
            }
            return 1;
        }
        if (-1365820254 == n) {
            final int n8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 2047281485];
            if (World.friendSystem.method420(1027382308) && n8 >= 0 && n8 < World.friendSystem.ignoreList.bm(597402548)) {
                final Ignored ignored = (Ignored)UserList.pn(World.friendSystem.ignoreList, n8, 1489718524);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1356339649) * 211828642 - 1] = ignored.bx(-1928078694);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 559699635) * 1818579359 - 1] = User.tg(ignored, -43557433);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1751370263) * -801573773 - 1] = "";
            }
            return 1;
        }
        if (3623 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1566386639) * -964267539 - 1] = (World.friendSystem.isIgnored(new Username(ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -44265568], 1227239523), class70.loginType), -778625608) ? 1 : 0);
            return 1;
        }
        if (n == 3624) {
            final int n9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 490243724) * -390038669];
            if (null != UserComparator5.friendsChat && n9 < UserComparator5.friendsChat.bm(-1904628276) && UserList.pn(UserComparator5.friendsChat, n9, 1174490965).getUsername(473993579).equals(MusicPatchNode.localPlayer.username)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1384837698 - 1] = 0;
            }
            return 1;
        }
        if (-983370531 == n) {
            if (null != UserComparator5.friendsChat && UserComparator5.friendsChat.owner != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 874842311) * 258868506 - 1] = UserComparator5.friendsChat.owner;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1422401317) * -927504999 - 1] = "";
            }
            return 1;
        }
        if (-537954649 == n) {
            final int n10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 56916088) * -964267539];
            if (null != UserComparator5.friendsChat && n10 < UserComparator5.friendsChat.bm(-1005481452) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n10, 481293266)).isFriend(577876664)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 149847291 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (-1676040773 == n) {
            final int n11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 2055359128) * -964267539];
            if (UserComparator5.friendsChat != null && n11 < UserComparator5.friendsChat.bm(1401586662) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n11, 985902631)).isIgnored(-1745257459)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1835112711) * 2140902781 - 1] = 0;
            }
            return 1;
        }
        if (n == 1806345360) {
            World.friendSystem.friendsList.ce(357528038);
            return 1;
        }
        if (n == -1465575433) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator1(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1339246794] == 1), (byte)118);
            return 1;
        }
        if (n == -1950290520) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator2(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1695573780) * -1290329371] == 1), (byte)97);
            return 1;
        }
        if (974891704 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator3(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)89);
            return 1;
        }
        if (n == 3632) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator4(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 400720104) * -964267539] == 1), (byte)22);
            return 1;
        }
        if (n == -182022147) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator5(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 849312397] == 1), (byte)124);
            return 1;
        }
        if (1312686234 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator6(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1529801443) * 2135073443] == 1), (byte)47);
            return 1;
        }
        if (n == -228719042) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator7(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 556681680) * 718865514] == 1), (byte)57);
            return 1;
        }
        if (n == -248549537) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator8(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 536460842) * -964267539] == 1), (byte)113);
            return 1;
        }
        if (n == 3637) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator9(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -273384785] == 1), (byte)44);
            return 1;
        }
        if (3638 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator10(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1987824519) * 1680670823] == 1), (byte)116);
            return 1;
        }
        if (n == 3639) {
            UserList.ge(World.friendSystem.friendsList, (byte)12);
            return 1;
        }
        if (1264259892 == n) {
            World.friendSystem.ignoreList.ce(357528038);
            return 1;
        }
        if (n == -1484510336) {
            World.friendSystem.ignoreList.ci((Comparator)new UserComparator1(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 261380455] == 1), (byte)57);
            return 1;
        }
        if (n == 3642) {
            World.friendSystem.ignoreList.ci((Comparator)new UserComparator2(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1695294693) * -1491070841] == 1), (byte)14);
            return 1;
        }
        if (3643 == n) {
            UserList.ge(World.friendSystem.ignoreList, (byte)26);
            return 1;
        }
        if (3644 == n) {
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ce(357528038);
            }
            return 1;
        }
        if (3645 == n) {
            final boolean b2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1522622245) * 269267962] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator1(b2), (byte)60);
            }
            return 1;
        }
        if (3646 == n) {
            final boolean b3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1506623802] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator2(b3), (byte)65);
            }
            return 1;
        }
        if (3647 == n) {
            final boolean b4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1143686185) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator3(b4), (byte)87);
            }
            return 1;
        }
        if (3648 == n) {
            final boolean b5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1433247922) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator4(b5), (byte)15);
            }
            return 1;
        }
        if (n == 3649) {
            final boolean b6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1673391175) * 418512139] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator5(b6), (byte)108);
            }
            return 1;
        }
        if (-814320821 == n) {
            final boolean b7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator6(b7), (byte)25);
            }
            return 1;
        }
        if (n == 372945456) {
            final boolean b8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator7(b8), (byte)57);
            }
            return 1;
        }
        if (n == -427631339) {
            final boolean b9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1109349963) * 871656414] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator8(b9), (byte)107);
            }
            return 1;
        }
        if (1704182422 == n) {
            final boolean b10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 904615486] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator9(b10), (byte)74);
            }
            return 1;
        }
        if (898547470 == n) {
            final boolean b11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -2136464118] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator10(b11), (byte)99);
            }
            return 1;
        }
        if (n == 3655) {
            if (UserComparator5.friendsChat != null) {
                UserList.ge(UserComparator5.friendsChat, (byte)7);
            }
            return 1;
        }
        if (n == 3656) {
            World.friendSystem.friendsList.ci((Comparator)new BuddyRankComparator(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 977825689] == 1), (byte)69);
            return 1;
        }
        if (3657 == n) {
            final boolean b12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new BuddyRankComparator(b12), (byte)31);
            }
            return 1;
        }
        return 2;
    }
    
    static int es(final int n, final Script script, final boolean b) {
        if (n == 3300) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.cycle * -1886224337;
            return 1;
        }
        if (n == 3301) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.read(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)0);
            return 1;
        }
        if (n == 3302) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class431.ItemContainer_getCount(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 2098730562);
            return 1;
        }
        if (n == 3303) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.available(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], 12564396);
            return 1;
        }
        if (3304 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ApproximateRouteStrategy.getInvDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1717461998).size * -2010981849;
            return 1;
        }
        if (3305 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.currentLevels[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (3306 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.levels[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (3307 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.experience[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (n == 3308) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 827352769 * GameObject.baseY + (-411750205 * MusicPatchNode.localPlayer.ep >> 7) + ((WorldMapData_0.baseX * -1232093375 + (1144428983 * MusicPatchNode.localPlayer.br >> 7) << 14) + (-1727408401 * GameEngine.Client_plane << 28));
            return 1;
        }
        if (n == 3309) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] >> 14 & 0x3FFF);
            return 1;
        }
        if (n == 3310) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] >> 28;
            return 1;
        }
        if (3311 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] & 0x3FFF);
            return 1;
        }
        if (3312 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Client.isMembersWorld ? 1 : 0);
            return 1;
        }
        if (n == 3313) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.read(32768 + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], (byte)0);
            return 1;
        }
        if (n == 3314) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class431.ItemContainer_getCount(32768 + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 2098730562);
            return 1;
        }
        if (3315 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.available(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + 32768, Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], -1739621745);
            return 1;
        }
        if (3316 == n) {
            if (Client.staffModLevel * 324465533 >= 2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.staffModLevel * 324465533;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3317) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.rebootTimer * -1496573241;
            return 1;
        }
        if (n == 3318) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -453810525 * Client.worldId;
            return 1;
        }
        if (n == 3321) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -365416549 * Client.runEnergy / 100;
            return 1;
        }
        if (3322 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.weight * -1940722149;
            return 1;
        }
        if (3323 == n) {
            if (Client.playerMod) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3324 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -205173751 * Client.worldProperties;
            return 1;
        }
        if (3325 == n) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] << 14) + (Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539] << 28) + Interpreter.Interpreter_intStack[3 + Interpreter.Interpreter_intStackSize * -964267539];
            return 1;
        }
        if (n == 3326) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -751176573 * Client.lastMouseRecordX;
            return 1;
        }
        if (n == 3327) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.lastMouseRecordY * -2076298705;
            return 1;
        }
        if (3331 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.runEnergy * -365416549;
            return 1;
        }
        return 2;
    }
    
    static int eq(final int n, final Script script, final boolean b) {
        final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
        if (2800 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.method1052(KeyHandler.getWidgetFlags(vmethod3380, 914528212), 1300973061);
            return 1;
        }
        if (n == 2801) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            --n2;
            if (vmethod3380.actions == null || n2 >= vmethod3380.actions.length || null == vmethod3380.actions[n2]) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.actions[n2];
            }
            return 1;
        }
        if (2802 == n) {
            if (null == vmethod3380.field3004) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.field3004;
            }
            return 1;
        }
        return 2;
    }
    
    static int ee(final int n, final Script script, final boolean b) {
        if (n == 1276346334) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539] + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            return 1;
        }
        if (n == 959589221) {
            Interpreter.Interpreter_intStackSize += 797232933;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (-1248093912 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * Interpreter.Interpreter_intStack[1 + -600552496 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (n == 4003) {
            Interpreter.Interpreter_intStackSize += 2022406963;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] / Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 111003373 + 1];
            return 1;
        }
        if (n == 4004) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1006108627) * -964267539 - 1] = (int)(Math.random() * Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1216901081]);
            return 1;
        }
        if (4005 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1807590933 - 1] = (int)(Math.random() * (1 + Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1659354797) * 799407469]));
            return 1;
        }
        if (4006 == n) {
            Interpreter.Interpreter_intStackSize -= 2135679865;
            final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1906215894];
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 277262312 - 1] = n2 + (Interpreter.Interpreter_intStack[4 + Interpreter.Interpreter_intStackSize * -964267539] - n4) * (n3 - n2) / (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 3] - n4);
            return 1;
        }
        if (-1034463159 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n5 = Interpreter.Interpreter_intStack[1189890691 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n5 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] / 100 + n5;
            return 1;
        }
        if (-1195166780 == n) {
            Interpreter.Interpreter_intStackSize -= 806470055;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 944420610) * -964267539 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] | 1 << Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (n == 4009) {
            Interpreter.Interpreter_intStackSize += 496974323;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 971432579) * 1646155692 - 1] = (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] & -1 - (1 << Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -91282654 + 1]));
            return 1;
        }
        if (n == 4010) {
            Interpreter.Interpreter_intStackSize += 293021090;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 605334551) * -964267539 - 1] = ((0x0 != (Interpreter.Interpreter_intStack[1011526648 * Interpreter.Interpreter_intStackSize] & 1 << Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539])) ? 1 : 0);
            return 1;
        }
        if (1715354165 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 826217710) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] % Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (-2116351500 == n) {
            Interpreter.Interpreter_intStackSize -= 1164742674;
            final int n6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            if (n6 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.pow(n6, n7);
            }
            return 1;
        }
        if (n == 309422729) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n9 = Interpreter.Interpreter_intStack[1680918881 * Interpreter.Interpreter_intStackSize + 1];
            if (n8 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            switch (n9) {
                case 3: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 247800316) * 927790972 - 1] = (int)Math.cbrt(n8);
                    break;
                }
                case 4: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 472301117) * 914914731 - 1] = (int)Math.sqrt(Math.sqrt(n8));
                    break;
                }
                default: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1243725262 - 1] = (int)Math.pow(n8, 1.0 / n9);
                    break;
                }
                case 1: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 367612367) * -1963528498 - 1] = n8;
                    break;
                }
                case 2: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 479094146 - 1] = (int)Math.sqrt(n8);
                    break;
                }
                case 0: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 902894679 - 1] = 820843400;
                    break;
                }
            }
            return 1;
        }
        else {
            if (n == 4014) {
                Interpreter.Interpreter_intStackSize += 928748627;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 2016095736) * -964267539 - 1] = (Interpreter.Interpreter_intStack[-1414264772 * Interpreter.Interpreter_intStackSize] & Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                return 1;
            }
            if (n == 4015) {
                Interpreter.Interpreter_intStackSize -= 1171032687;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] | Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
                return 1;
            }
            if (4016 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n10 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n11 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 316293807) * 894354114 - 1] = ((n10 < n11) ? n10 : n11);
                return 1;
            }
            if (339157714 == n) {
                Interpreter.Interpreter_intStackSize -= 94533943;
                final int n12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1417441253 + 1];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((n12 > n13) ? n12 : n13);
                return 1;
            }
            if (4018 == n) {
                Interpreter.Interpreter_intStackSize -= 254353288;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 257076656) * 451462209 - 1] = (int)(Interpreter.Interpreter_intStack[2 + -237516546 * Interpreter.Interpreter_intStackSize] * (long)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] / Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]);
                return 1;
            }
            if (n == 4025) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 906249669) * -964267539 - 1] = class18.method63(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 254804647) * -964267539], 1703473510);
                return 1;
            }
            if (n == 2125752128) {
                Interpreter.Interpreter_intStackSize += 475645794;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1648077471) * -1817739735 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 784741292] ^ 1 << Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * 1334487346]);
                return 1;
            }
            if (n == 4027) {
                Interpreter.Interpreter_intStackSize -= 1805156400;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1510051211 - 1] = class134.method780(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[2 + 1707242619 * Interpreter.Interpreter_intStackSize], (byte)0);
                return 1;
            }
            if (4028 == n) {
                Interpreter.Interpreter_intStackSize += 1242317844;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 607070673) * -964267539 - 1] = Canvas.method91(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -1236638076], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2], 1780604080);
                return 1;
            }
            if (n == 4029) {
                Interpreter.Interpreter_intStackSize -= 159224817;
                final int n14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 839013877];
                final int n15 = Interpreter.Interpreter_intStack[-1854068862 * Interpreter.Interpreter_intStackSize + 1];
                final int n16 = 2103488530 - Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -1006915963];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1432996334) * -918834627 - 1] = n14 << n16 >>> n15 + n16;
                return 1;
            }
            if (4030 == n) {
                Interpreter.Interpreter_intStackSize += 288954119;
                final int n17 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                int n18 = Interpreter.Interpreter_intStack[-1862421745 * Interpreter.Interpreter_intStackSize + 1];
                final int n19 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                final int n20 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3];
                final int method91 = Canvas.method91(n17, n19, n20, 1591223215);
                final int vmethod3248 = class140.vmethod3248(n20 - n19 + 1, (byte)110);
                if (n18 > vmethod3248) {
                    n18 = vmethod3248;
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1471441803) * -964267539 - 1] = (method91 | n18 << n19);
                return 1;
            }
            if (-2062948217 == n) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1184142964 - 1] = AttackOption.method621(Interpreter.Interpreter_intStack[-987856170 * Interpreter.Interpreter_intStackSize - 1], -495038471);
                return 1;
            }
            if (n == -520832803) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = TriBool.method2198(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1], (byte)0);
                return 1;
            }
            if (n == 539068886) {
                Interpreter.Interpreter_intStackSize += 1125575831;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = UserComparator8.method688(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 1422566495], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -9488825 + 1], 1061141788);
                return 1;
            }
            if (n == -657349321) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1726046544 - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -354133240 - 1]);
                return 1;
            }
            if (-1404513872 == n) {
                final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1636188554) * -62713952];
                int release = -1;
                if (WorldMapSectionType.isNumber(s, -946333638)) {
                    release = PacketBufferNode.release(s, (byte)(-28));
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1966077667) * -964267539 - 1] = release;
                return 1;
            }
            return 2;
        }
    }
    
    static int dt(final int n, final Script script, final boolean b) {
        final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
        if (1600 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1469632775 * widget.scrollX;
            return 1;
        }
        if (1601 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1223232735 * widget.scrollY;
            return 1;
        }
        if (1602 == n) {
            if (12 == widget.type * 883712245) {
                final class314 method1815 = widget.method1815((byte)(-23));
                if (null != method1815) {
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class379.mk(method1815.method1740(-1691484498), -1389348498);
                    return 1;
                }
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.field2916;
            return 1;
        }
        if (n == 1603) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.scrollWidth * -773060713;
            return 1;
        }
        if (1604 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1273374131 * widget.scrollHeight;
            return 1;
        }
        if (1605 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 942674363 * widget.modelZoom;
            return 1;
        }
        if (n == 1606) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.modelAngleX * 797932055;
            return 1;
        }
        if (1607 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.modelAngleZ * -1023931993;
            return 1;
        }
        if (1608 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -480949115 * widget.modelAngleY;
            return 1;
        }
        if (1609 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.transparencyTop * 1634279623;
            return 1;
        }
        if (1610 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.transparencyBot * 122284991;
            return 1;
        }
        if (n == 1611) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1409091639 * widget.color;
            return 1;
        }
        if (1612 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.color2 * 1449039161;
            return 1;
        }
        if (1613 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.fillMode.rsOrdinal(867323075);
            return 1;
        }
        if (n == 1614) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (widget.spriteFlipV ? 1 : 0);
            return 1;
        }
        if (1617 == n) {
            final class309 method1816 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1816) ? (-90398499 * method1816.field2817) : 0);
        }
        if (n == 1618) {
            final class309 method1817 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1817) ? (216034339 * method1817.field2818) : 0);
            return 1;
        }
        if (n == 1619) {
            final class314 method1818 = widget.method1815((byte)4);
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((method1818 != null) ? class379.mk(method1818.method1741((byte)32), -1389348498) : "");
            return 1;
        }
        if (n == 1620) {
            final class309 method1819 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1819 != null) ? (1912484269 * method1819.field2816) : 0);
            return 1;
        }
        if (n == 1621) {
            final class314 method1820 = widget.method1815((byte)21);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1820 != null) ? method1820.method1716(-1542449427) : 0);
            return 1;
        }
        if (1622 == n) {
            final class314 method1821 = widget.method1815((byte)96);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1821) ? method1821.method1751(-2103426413) : 0);
            return 1;
        }
        if (1623 == n) {
            final class314 method1822 = widget.method1815((byte)78);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1822 != null) ? method1822.method1746(1424429838) : 0);
            return 1;
        }
        if (n == 1624) {
            final class314 method1823 = widget.method1815((byte)(-116));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1823 && class314.method1728(method1823, 1889498041)) ? 1 : 0);
            return 1;
        }
        if (1625 == n) {
            final class314 method1824 = widget.method1815((byte)81);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1824 != null && method1824.ed(1994580892)) ? 1 : 0);
            return 1;
        }
        if (1626 == n) {
            final class314 method1825 = widget.method1815((byte)5);
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((method1825 != null) ? class314.method1751(method1825, -994303659).method2083(-2109711943) : "");
            return 1;
        }
        if (n == 1627) {
            final class314 method1826 = widget.method1815((byte)(-93));
            final int n2 = (method1826 != null) ? method1826.method1753(1297150514) : 0;
            final int n3 = (method1826 != null) ? method1826.method1769(-981508502) : 0;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.min(n2, n3);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.max(n2, n3);
            return 1;
        }
        if (1628 == n) {
            final class314 method1827 = widget.method1815((byte)(-49));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1827 != null) ? method1827.method1769(1190295063) : 0);
            return 1;
        }
        if (1629 == n) {
            final class314 method1828 = widget.method1815((byte)(-45));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1828) ? method1828.method1781(-1969989757) : 0);
            return 1;
        }
        if (n == 1630) {
            final class314 method1829 = widget.method1815((byte)22);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1829 != null) ? method1829.method1752((byte)(-124)) : 0);
            return 1;
        }
        if (1631 == n) {
            final class314 method1830 = widget.method1815((byte)0);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1830) ? class314.ww(method1830, 1970237356) : 0);
            return 1;
        }
        if (1632 == n) {
            final class314 method1831 = widget.method1815((byte)(-12));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1831) ? class314.ve(method1831, (byte)72) : 0);
            return 1;
        }
        if (n == 1633) {
            final class27 method1832 = widget.method1795(1960242596);
            Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = ((null != method1832) ? class27.be(method1832, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], -63070395) : 0);
            return 1;
        }
        if (1634 == n) {
            final class27 method1833 = widget.method1795(2071384981);
            Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = ((method1833 != null) ? class27.bh(method1833, (char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], (byte)32) : 0);
            return 1;
        }
        return 2;
    }
    
    static int fc(final int n, final Script script, final boolean b) {
        if (6600 == n) {
            class88.getWorldMap(-1187801179).method2381(GameEngine.Client_plane * -1727408401, (MusicPatchNode.localPlayer.br * 1144428983 >> 7) + WorldMapData_0.baseX * -1232093375, GameObject.baseY * 827352769 + (-411750205 * MusicPatchNode.localPlayer.ep >> 7), true, (byte)15);
            return 1;
        }
        if (n == 6601) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            String externalName = "";
            final WorldMapArea mapArea = class88.getWorldMap(-1298901278).getMapArea(n2, -2135353040);
            if (null != mapArea) {
                externalName = mapArea.getExternalName((short)19248);
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = externalName;
            return 1;
        }
        if (n == 6602) {
            WorldMap.zj(class88.getWorldMap(-595616393), Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1303343079);
            return 1;
        }
        if (n == 6603) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(-1653005037).getZoomLevel((byte)0);
            return 1;
        }
        if (n == 6604) {
            class88.getWorldMap(-1446541113).setZoomPercentage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -326136881);
            return 1;
        }
        if (6605 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (WorldMap.wt(class88.getWorldMap(1651236902), 142682982) ? 1 : 0);
            return 1;
        }
        if (6606 == n) {
            final Coord coord = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            class88.getWorldMap(-672181937).setWorldMapPositionTarget(-96298701 * coord.x, -2105445199 * coord.y, (byte)(-85));
            return 1;
        }
        if (6607 == n) {
            final Coord coord2 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            class88.getWorldMap(-2028440305).fs(-96298701 * coord2.x, -2105445199 * coord2.y, 136164185);
            return 1;
        }
        if (n == 6608) {
            final Coord coord3 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            WorldMap.vp(class88.getWorldMap(996846897), -113644749 * coord3.plane, coord3.x * -96298701, coord3.y * -2105445199, (byte)16);
            return 1;
        }
        if (6609 == n) {
            final Coord coord4 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            class88.getWorldMap(-1200629202).jumpToSourceCoordInstant(coord4.plane * -113644749, coord4.x * -96298701, coord4.y * -2105445199, -1709543014);
            return 1;
        }
        if (n == 6610) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(-1556319677).getDisplayX(-989713910);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(657725731).getDisplayY((byte)0);
            return 1;
        }
        if (n == 6611) {
            final WorldMapArea mapArea2 = class88.getWorldMap(885570653).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -528447775);
            if (mapArea2 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea2.getOrigin((byte)41).packed(-964267539);
            }
            return 1;
        }
        if (n == 6612) {
            final WorldMapArea mapArea3 = class88.getWorldMap(78194070).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1303241344);
            if (mapArea3 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (mapArea3.getRegionHighX(-970148786) - mapArea3.getRegionLowX(16748608) + 1) * 64;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (mapArea3.getRegionHighY(-1442278480) - mapArea3.getRegionLowY(-27152208) + 1) * 64;
            }
            return 1;
        }
        if (6613 == n) {
            final WorldMapArea mapArea4 = class88.getWorldMap(1187063985).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -2040183249);
            if (mapArea4 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionLowX(16748608) * 64;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionLowY(453018675) * 64;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionHighX(-97529426) * 64 + 64 - 1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionHighY(-868759331) * 64 + 64 - 1;
            }
            return 1;
        }
        if (n == 6614) {
            final WorldMapArea mapArea5 = class88.getWorldMap(97145105).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1165576852);
            if (mapArea5 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = WorldMapArea.uz(mapArea5, 447952954);
            }
            return 1;
        }
        if (6615 == n) {
            final Coord da = WorldMap.da(class88.getWorldMap(-157846000), 1721001715);
            if (null == da) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = da.x * -96298701;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2105445199 * da.y;
            }
            return 1;
        }
        if (n == 6616) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(-2020529209).currentMapAreaId(1139803199);
            return 1;
        }
        if (6617 == n) {
            final Coord coord5 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            final WorldMapArea currentMapArea = class88.getWorldMap(1549261383).getCurrentMapArea((byte)65);
            if (null == currentMapArea) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                return 1;
            }
            final int[] position = currentMapArea.position(coord5.plane * -113644749, -96298701 * coord5.x, -2105445199 * coord5.y, (byte)6);
            if (null == position) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = position[0];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = position[1];
            }
            return 1;
        }
        else if (6618 == n) {
            final Coord coord6 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            final WorldMapArea currentMapArea2 = class88.getWorldMap(-1730698645).getCurrentMapArea((byte)21);
            if (currentMapArea2 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                return 1;
            }
            final Coord coord7 = currentMapArea2.coord(coord6.x * -96298701, coord6.y * -2105445199, 1716650727);
            if (null == coord7) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = coord7.packed(-964267539);
            }
            return 1;
        }
        else {
            if (n == 6619) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                class220.method1229(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]), false, (byte)42);
                return 1;
            }
            if (n == 6620) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                class220.method1229(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], new Coord(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]), true, (byte)17);
                return 1;
            }
            if (6621 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final Coord coord8 = new Coord(Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                final WorldMapArea mapArea6 = class88.getWorldMap(-611230623).getMapArea(n3, -910927390);
                if (mapArea6 == null) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    return 1;
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (mapArea6.containsCoord(coord8.plane * -113644749, coord8.x * -96298701, -2105445199 * coord8.y, -730506609) ? 1 : 0);
                return 1;
            }
            else {
                if (n == 6622) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(1529620732).getDisplayWith((byte)109);
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(1913095172).getDisplayHeight(1017962902);
                    return 1;
                }
                if (n == 6623) {
                    final Coord coord9 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                    final WorldMapArea mapAreaAtCoord = class88.getWorldMap(948683414).mapAreaAtCoord(-113644749 * coord9.plane, coord9.x * -96298701, -2105445199 * coord9.y, (byte)2);
                    if (mapAreaAtCoord == null) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = WorldMapArea.wo(mapAreaAtCoord, -964267539);
                    }
                    return 1;
                }
                if (6624 == n) {
                    class88.getWorldMap(860728758).setCyclesPerFlash(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)69);
                    return 1;
                }
                if (n == 6625) {
                    class88.getWorldMap(-2057128384).resetMaxFlashCount((byte)(-20));
                    return 1;
                }
                if (n == 6626) {
                    class88.getWorldMap(-803122121).setMaxFlashCount(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)92);
                    return 1;
                }
                if (n == 6627) {
                    class88.getWorldMap(1232191682).ge(-310140651);
                    return 1;
                }
                if (n == 6628) {
                    class88.getWorldMap(-564289849).setPerpetualFlash(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, -1058876361);
                    return 1;
                }
                if (6629 == n) {
                    class88.getWorldMap(-465398932).flashElement(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 185156955);
                    return 1;
                }
                if (n == 6630) {
                    class88.getWorldMap(-1481145218).flashCategory(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 582654057);
                    return 1;
                }
                if (n == 6631) {
                    class88.getWorldMap(-1347194895).method2329(530218621);
                    return 1;
                }
                if (n == 6632) {
                    WorldMap.le(class88.getWorldMap(-149498728), Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, 953001147);
                    return 1;
                }
                if (n == 6633) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    class88.getWorldMap(298758444).disableElement(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], 1 == Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 982781542);
                    return 1;
                }
                if (6634 == n) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    WorldMap.ld(class88.getWorldMap(1666544583), Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] == 1, -1719692138);
                    return 1;
                }
                if (n == 6635) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class88.getWorldMap(-610266889).getElementsDisabled((short)480) ? 1 : 0);
                    return 1;
                }
                if (6636 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class88.getWorldMap(-143450495).isElementDisabled(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 642415102) ? 1 : 0);
                    return 1;
                }
                if (n == 6637) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class88.getWorldMap(1778809594).isCategoryDisabled(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-9)) ? 1 : 0);
                    return 1;
                }
                if (n == 6638) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    final Coord tb = WorldMap.tb(class88.getWorldMap(685834322), Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], new Coord(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]), 1691520214);
                    if (null == tb) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = tb.packed(-964267539);
                    }
                    return 1;
                }
                if (n == 6639) {
                    final AbstractWorldMapIcon iconStart = class88.getWorldMap(-1667351433).iconStart(-1200551413);
                    if (iconStart == null) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconStart.getElement(-789138031);
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconStart.coord2.packed(-964267539);
                    }
                    return 1;
                }
                if (n == 6640) {
                    final AbstractWorldMapIcon iconNext = class88.getWorldMap(1902997545).iconNext((byte)(-59));
                    if (iconNext == null) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconNext.getElement(-1693220730);
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconNext.coord2.packed(-964267539);
                    }
                    return 1;
                }
                if (6693 == n) {
                    final WorldMapElement method1935 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1884489316);
                    if (null == method1935.name) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    }
                    else {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = method1935.name;
                    }
                    return 1;
                }
                if (n == 6694) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 952315347 * class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 2140602908).textSize;
                    return 1;
                }
                if (6695 == n) {
                    final WorldMapElement method1936 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 2116479315);
                    if (null == method1936) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = method1936.category * -461862935;
                    }
                    return 1;
                }
                if (6696 == n) {
                    final WorldMapElement method1937 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1985731598);
                    if (null == method1937) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1458003089 * method1937.sprite1;
                    }
                    return 1;
                }
                if (n == 6697) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.mapElement * 1618357717;
                    return 1;
                }
                if (n == 6698) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.coord1.packed(-964267539);
                    return 1;
                }
                if (n == 6699) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.coord2.packed(-964267539);
                    return 1;
                }
                return 2;
            }
        }
    }
    
    static int dl(int n, final Script script, final boolean b) {
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        String substring = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1081333943) * -2017760987];
        int[] statTransmitTriggers = null;
        if (substring.length() > 0 && substring.charAt(substring.length() - 1) == -1940996565) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 785849646) * -964267539];
            if (n2 > 0) {
                statTransmitTriggers = new int[n2];
                while (n2-- > 0) {
                    statTransmitTriggers[n2] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                }
            }
            substring = substring.substring(0, substring.length() - 1);
        }
        Object[] field2824 = new Object[substring.length() + 1];
        for (int i = field2824.length - 1; i >= 1; --i) {
            if (substring.charAt(i - 1) == -1428314281) {
                field2824[i] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1922813879) * 1538418779];
            }
            else {
                field2824[i] = new Integer(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1520398629]);
            }
        }
        final int value = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
        if (value != -1) {
            field2824[0] = new Integer(value);
        }
        else {
            field2824 = null;
        }
        if (-1704079705 == n) {
            vmethod3380.onClick = field2824;
        }
        else if (n == 1401) {
            vmethod3380.onHold = field2824;
        }
        else if (n == 1402) {
            vmethod3380.onRelease = field2824;
        }
        else if (n == 1403) {
            vmethod3380.onMouseOver = field2824;
        }
        else if (1361244896 == n) {
            vmethod3380.onMouseLeave = field2824;
        }
        else if (15762335 == n) {
            vmethod3380.onDrag = field2824;
        }
        else if (n == 937915811) {
            vmethod3380.onTargetLeave = field2824;
        }
        else if (n == 1407) {
            vmethod3380.onVarTransmit = field2824;
            vmethod3380.varTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 1408) {
            vmethod3380.onTimer = field2824;
        }
        else if (n == 1409) {
            vmethod3380.onOp = field2824;
        }
        else if (n == 1410) {
            vmethod3380.onDragComplete = field2824;
        }
        else if (n == 1399306256) {
            vmethod3380.onClickRepeat = field2824;
        }
        else if (1412 == n) {
            vmethod3380.onMouseRepeat = field2824;
        }
        else if (n == 1414) {
            vmethod3380.onInvTransmit = field2824;
            vmethod3380.invTransmitTriggers = statTransmitTriggers;
        }
        else if (1415 == n) {
            vmethod3380.onStatTransmit = field2824;
            vmethod3380.statTransmitTriggers = statTransmitTriggers;
        }
        else if (n == -261568388) {
            vmethod3380.onTargetEnter = field2824;
        }
        else if (n == 1417) {
            vmethod3380.onScroll = field2824;
        }
        else if (n == 1418) {
            vmethod3380.onChatTransmit = field2824;
        }
        else if (1419 == n) {
            vmethod3380.onKey = field2824;
        }
        else if (n == 1731889695) {
            vmethod3380.onFriendTransmit = field2824;
        }
        else if (-883502937 == n) {
            vmethod3380.onClanTransmit = field2824;
        }
        else if (-846688614 == n) {
            vmethod3380.onMiscTransmit = field2824;
        }
        else if (n == 1423) {
            vmethod3380.onDialogAbort = field2824;
        }
        else if (1547841627 == n) {
            vmethod3380.onSubChange = field2824;
        }
        else if (879018245 == n) {
            vmethod3380.onStockTransmit = field2824;
        }
        else if (n == 1776854389) {
            vmethod3380.field2998 = field2824;
        }
        else if (n == 1427) {
            vmethod3380.onResize = field2824;
        }
        else if (-542957854 == n) {
            vmethod3380.field2946 = field2824;
        }
        else if (n == -1339018832) {
            vmethod3380.field2876 = field2824;
        }
        else if (n == 1430) {
            vmethod3380.field2988 = field2824;
        }
        else if (n == 1431) {
            vmethod3380.field2892 = field2824;
        }
        else if (n == 2142999648) {
            vmethod3380.field2961 = field2824;
        }
        else if (1435 == n) {
            vmethod3380.field2984 = field2824;
        }
        else {
            if (n < 1436 || n > -47935108) {
                return 2;
            }
            final class312 method1818 = vmethod3380.method1818(-1543196028);
            if (null != method1818) {
                if (n == 1436) {
                    method1818.field2821 = field2824;
                }
                else if (-1276445093 == n) {
                    method1818.field2826 = field2824;
                }
                else if (n == -663228579) {
                    method1818.field2825 = field2824;
                }
                else if (-132492230 == n) {
                    method1818.field2824 = field2824;
                }
            }
        }
        vmethod3380.field2978 = true;
        return 1;
    }
    
    static void ck(final ScriptEvent scriptEvent, final int n, final int n2) {
        final Object[] args = scriptEvent.args;
        Script script;
        if (class292.method1604(scriptEvent.type * -1285258240, -964267539)) {
            ByteArrayPool.worldMapEvent = (WorldMapEvent)args[0];
            final WorldMapElement method1935 = class354.method1935(1618357717 * ByteArrayPool.worldMapEvent.mapElement, 1893113962);
            script = class151.vmethod3239(scriptEvent.type * 2100736047, method1935.objectId * -625311721, -461862935 * method1935.category, -1601013049);
        }
        else {
            script = AbstractByteArrayCopier.getScript((int)args[0], 482207398);
        }
        if (null == script) {
            return;
        }
        Interpreter.Interpreter_intStackSize = 0;
        SecureRandomCallable.Interpreter_stringStackSize = 0;
        int n3 = -1;
        int[] array = script.opcodes;
        int[] array2 = script.intOperands;
        int i = -1;
        Interpreter.Interpreter_frameDepth = 0;
        Interpreter.field700 = false;
        int n4 = 0;
        int n5 = 0;
        try {
            Interpreter.Interpreter_intLocals = new int[1111113774 * script.localIntCount];
            int n6 = 0;
            Interpreter.Interpreter_stringLocals = new String[-1897224143 * script.localStringCount];
            int n7 = 0;
            for (int j = 1; j < args.length; ++j) {
                if (args[j] instanceof Integer) {
                    int intValue = (int)args[j];
                    if (832480370 == intValue) {
                        intValue = -1266615561 * scriptEvent.mouseX;
                    }
                    if (-2147483646 == intValue) {
                        intValue = scriptEvent.mouseY * 650213389;
                    }
                    if (-2147483645 == intValue) {
                        intValue = ((scriptEvent.dragTarget != null) ? (1713081171 * scriptEvent.dragTarget.id) : -1);
                    }
                    if (1162013055 == intValue) {
                        intValue = 684782445 * scriptEvent.opIndex;
                    }
                    if (intValue == 2121757955) {
                        intValue = ((null != scriptEvent.dragTarget) ? (446244179 * scriptEvent.dragTarget.childIndex) : -1);
                    }
                    if (intValue == 48495477) {
                        intValue = ((scriptEvent.widget != null) ? (scriptEvent.widget.id * 1129459217) : -1);
                    }
                    if (intValue == 959717351) {
                        intValue = ((null != scriptEvent.widget) ? (875359633 * scriptEvent.widget.childIndex) : -1);
                    }
                    if (-1107011231 == intValue) {
                        intValue = -2125751633 * scriptEvent.keyTyped;
                    }
                    if (1112290953 == intValue) {
                        intValue = scriptEvent.keyPressed * -330614964;
                    }
                    Interpreter.Interpreter_intLocals[n6++] = intValue;
                }
                else if (args[j] instanceof String) {
                    String targetName = (String)args[j];
                    if (targetName.equals("event_opbase")) {
                        targetName = scriptEvent.targetName;
                    }
                    Interpreter.Interpreter_stringLocals[n7++] = targetName;
                }
            }
            Interpreter.field703 = 844882222 * scriptEvent.field859;
            while (++n5 <= n) {
                i = array[++n3];
                if (i < 114060373) {
                    if (i == 0) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 502128385) * -2126942319 - 1] = array2[n3];
                    }
                    else if (i == 1) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -2048018524 - 1] = Varps.Varps_main[array2[n3]];
                    }
                    else if (2 == i) {
                        final int n8 = array2[n3];
                        Varps.Varps_main[n8] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        class7.changeGameOptions(n8, 18126402);
                    }
                    else if (3 == i) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 285015605) * -1902111314 - 1] = script.stringOperands[n3];
                    }
                    else if (6 == i) {
                        n3 += array2[n3];
                    }
                    else if (7 == i) {
                        Interpreter.Interpreter_intStackSize -= 1116799088;
                        if (Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[-430726238 * Interpreter.Interpreter_intStackSize]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (i == 8) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        if (Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * 643773431] != Interpreter.Interpreter_intStack[521193395 * Interpreter.Interpreter_intStackSize]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (i == 9) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        if (Interpreter.Interpreter_intStack[717433149 * Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (i == 10) {
                        Interpreter.Interpreter_intStackSize += 1964987705;
                        if (Interpreter.Interpreter_intStack[-137625010 * Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[1741011064 * Interpreter.Interpreter_intStackSize + 1]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (i == 21) {
                        if (-1968816839 * Interpreter.Interpreter_frameDepth == 0) {
                            while (Interpreter.field690.size() > 0) {
                                final class97 class97 = Interpreter.field690.remove(0);
                                Message.widgetDefaultMenuAction(class97.method615((byte)(-121)), class97.hr(class97, -1700922273), class97.method614((byte)7), class97.method616(1709112431), "", 1238902143);
                            }
                            if (Interpreter.field700) {
                                Interpreter.field700 = false;
                                class148.method844(-899585015);
                            }
                            if (n4 == 0 && n2 > 0 && n5 >= n2) {
                                class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n5 + " of max " + n, null, (byte)8);
                            }
                            return;
                        }
                        final ScriptFrame scriptFrame = Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth += 470159424) * 1863720635];
                        script = scriptFrame.script;
                        array = script.opcodes;
                        array2 = script.intOperands;
                        n3 = scriptFrame.pc * -1044115137;
                        Interpreter.Interpreter_intLocals = scriptFrame.intLocals;
                        Interpreter.Interpreter_stringLocals = scriptFrame.stringLocals;
                    }
                    else if (i == 25) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 433418332) * 1923682429 - 1] = class252.expandBounds(array2[n3], 1311323027);
                    }
                    else if (27 == i) {
                        class283.method1593(array2[n3], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 463516208);
                    }
                    else if (i == -1567326597) {
                        Interpreter.Interpreter_intStackSize += 1153835813;
                        if (Interpreter.Interpreter_intStack[-1943794083 * Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * 931777060]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (-172689537 == i) {
                        Interpreter.Interpreter_intStackSize += 1223410556;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -511204072] < Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * 1929737810]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (-1479611662 == i) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1098968914) * 346260588 - 1] = Interpreter.Interpreter_intLocals[array2[n3]];
                    }
                    else if (i == 1271520368) {
                        Interpreter.Interpreter_intLocals[array2[n3]] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1772197890) * -1455418710];
                    }
                    else if (i == 1888960498) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -1263935832 - 1] = Interpreter.Interpreter_stringLocals[array2[n3]];
                    }
                    else if (36 == i) {
                        Interpreter.Interpreter_stringLocals[array2[n3]] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                    }
                    else if (i == 1019030443) {
                        final int n9 = array2[n3];
                        SecureRandomCallable.Interpreter_stringStackSize -= n9 * -1086551379;
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -13427182 - 1] = WorldMapSprite.getTileColor(Interpreter.Interpreter_stringStack, SecureRandomCallable.Interpreter_stringStackSize * -2017760987, n9, (byte)20);
                    }
                    else if (860441039 == i) {
                        Interpreter.Interpreter_intStackSize -= 427135973;
                    }
                    else if (39 == i) {
                        SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                    }
                    else if (40 == i) {
                        final Script script2 = AbstractByteArrayCopier.getScript(array2[n3], 907069053);
                        final int[] interpreter_intLocals = new int[1953368784 * script2.localIntCount];
                        final String[] interpreter_stringLocals = new String[script2.localStringCount * -1897224143];
                        for (int k = 0; k < -1203198865 * script2.intArgumentCount; ++k) {
                            interpreter_intLocals[k] = Interpreter.Interpreter_intStack[k + (-964267539 * Interpreter.Interpreter_intStackSize - script2.intArgumentCount * 1778142316)];
                        }
                        for (int l = 0; l < 1091828713 * script2.stringArgumentCount; ++l) {
                            interpreter_stringLocals[l] = Interpreter.Interpreter_stringStack[l + (-2017760987 * SecureRandomCallable.Interpreter_stringStackSize - script2.stringArgumentCount * 1178893217)];
                        }
                        Interpreter.Interpreter_intStackSize -= script2.intArgumentCount * 76503133;
                        SecureRandomCallable.Interpreter_stringStackSize -= script2.stringArgumentCount * 1770012384;
                        final ScriptFrame scriptFrame2 = new ScriptFrame();
                        scriptFrame2.script = script;
                        scriptFrame2.pc = n3 * -1570390418;
                        scriptFrame2.intLocals = Interpreter.Interpreter_intLocals;
                        scriptFrame2.stringLocals = Interpreter.Interpreter_stringLocals;
                        Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth += 937402633) * -1968816839 - 1] = scriptFrame2;
                        script = script2;
                        array = script.opcodes;
                        array2 = script.intOperands;
                        n3 = -1;
                        Interpreter.Interpreter_intLocals = interpreter_intLocals;
                        Interpreter.Interpreter_stringLocals = interpreter_stringLocals;
                    }
                    else if (i == 42) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1151683212 - 1] = Varcs.dy(class373.varcs, array2[n3], -616970300);
                    }
                    else if (43 == i) {
                        Varcs.cr(class373.varcs, array2[n3], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1620023096], 2124528261);
                    }
                    else if (44 == i) {
                        final int n10 = array2[n3] >> 16;
                        final int n11 = array2[n3] & 0xFFFF;
                        final int n12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 2060909257) * -657596440];
                        if (n12 < 0 || n12 > 516375065) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_arrayLengths[n10] = n12;
                        int n13 = -1;
                        if (105 == n11) {
                            n13 = 0;
                        }
                        for (int n14 = 0; n14 < n12; ++n14) {
                            Interpreter.Interpreter_arrays[n10][n14] = n13;
                        }
                    }
                    else if (i == -32919876) {
                        final int n15 = array2[n3];
                        final int n16 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        if (n16 < 0 || n16 >= Interpreter.Interpreter_arrayLengths[n15]) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 152053308) * 514518285 - 1] = Interpreter.Interpreter_arrays[n15][n16];
                    }
                    else if (-82605440 == i) {
                        final int n17 = array2[n3];
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        final int n18 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                        if (n18 < 0 || n18 >= Interpreter.Interpreter_arrayLengths[n17]) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_arrays[n17][n18] = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                    }
                    else if (i == 47) {
                        String s = class373.varcs.getStringOld(array2[n3], (byte)(-34));
                        if (s == null) {
                            s = Strings.at;
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 482199093) * -1473869433 - 1] = s;
                    }
                    else if (i == -462688338) {
                        class373.varcs.setStringOld(array2[n3], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 857093074) * -2017760987], -142824502);
                    }
                    else if (49 == i) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 831808452) * -2017760987 - 1] = class373.varcs.getString(array2[n3], -997289343);
                    }
                    else if (i == 50) {
                        class373.varcs.setString(array2[n3], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -875468987);
                    }
                    else if (418343996 == i) {
                        final IntegerNode integerNode = (IntegerNode)script.switches[array2[n3]].aa(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -711818419]);
                        if (null == integerNode) {
                            continue;
                        }
                        n3 += integerNode.integer;
                    }
                    else if (617486569 == i) {
                        final Integer titleGroupValue = class133.field1286.getTitleGroupValue(array2[n3], (byte)14);
                        if (null == titleGroupValue) {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 621170883 - 1] = -1;
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1997156405 - 1] = titleGroupValue;
                        }
                    }
                    else {
                        if (i != -478485987) {
                            throw new IllegalStateException();
                        }
                        final Integer value = Players.varclan.method2273(array2[n3], (short)15732);
                        if (value == null) {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 390038054) * -2075276752 - 1] = -1;
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1216687513) * 941460750 - 1] = value;
                        }
                    }
                }
                else {
                    switch (class33.method152(i, script, 1 == script.intOperands[n3], (byte)(-71))) {
                        case 1: {
                            continue;
                        }
                        case 2: {
                            throw new IllegalStateException();
                        }
                        case 0: {
                            while (Interpreter.field690.size() > 0) {
                                final class97 class98 = Interpreter.field690.remove(0);
                                Message.widgetDefaultMenuAction(class98.method615((byte)(-17)), class97.hr(class98, -912124286), class98.method614((byte)7), class98.method616(1662487624), "", 1238902143);
                            }
                            if (Interpreter.field700) {
                                Interpreter.field700 = false;
                                class148.method844(-1563603561);
                            }
                            if (n4 == 0 && n2 > 0 && n5 >= n2) {
                                class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n5 + " of max " + n, null, (byte)8);
                            }
                            return;
                        }
                        default: {
                            continue;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        catch (Exception ex) {
            n4 = 1;
            final StringBuilder sb = new StringBuilder(30);
            sb.append("").append(script.hr).append(" ");
            for (int n19 = -1968816839 * Interpreter.Interpreter_frameDepth - 1; n19 >= 0; --n19) {
                sb.append("").append(Interpreter.Interpreter_frames[n19].script.hr).append(" ");
            }
            sb.append("").append(i);
            class387.RunException_sendStackTrace(sb.toString(), ex, (byte)8);
            while (Interpreter.field690.size() > 0) {
                final class97 class99 = Interpreter.field690.remove(0);
                Message.widgetDefaultMenuAction(class99.method615((byte)(-98)), class97.hr(class99, -1656790507), class99.method614((byte)7), class99.method616(2125992491), "", 1238902143);
            }
            if (Interpreter.field700) {
                Interpreter.field700 = false;
                class148.method844(702110484);
            }
            if (n4 == 0 && n2 > 0 && n5 >= n2) {
                class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n5 + " of max " + n, null, (byte)8);
            }
        }
        finally {
            while (Interpreter.field690.size() > 0) {
                final class97 class100 = Interpreter.field690.remove(0);
                Message.widgetDefaultMenuAction(class100.method615((byte)(-15)), class97.hr(class100, -1793950818), class100.method614((byte)7), class100.method616(1932431762), "", 1238902143);
            }
            if (Interpreter.field700) {
                Interpreter.field700 = false;
                class148.method844(1024693692);
            }
            if (n4 == 0 && n2 > 0 && n5 >= n2) {
                class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n5 + " of max " + n, null, (byte)8);
            }
        }
    }
    
    static int di(int n, final Script script, final boolean b) {
        Widget vmethod3380;
        if (n >= 2043929044) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 506123051) * -907055606], (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        String substring = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -1061143781];
        int[] statTransmitTriggers = null;
        if (substring.length() > 0 && substring.charAt(substring.length() - 1) == -622699048) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (n2 > 0) {
                statTransmitTriggers = new int[n2];
                while (n2-- > 0) {
                    statTransmitTriggers[n2] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 938702117) * 113702368];
                }
            }
            substring = substring.substring(0, substring.length() - 1);
        }
        Object[] field2824 = new Object[substring.length() + 1];
        for (int i = field2824.length - 1; i >= 1; --i) {
            if (substring.charAt(i - 1) == 's') {
                field2824[i] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 754888340) * -2017760987];
            }
            else {
                field2824[i] = new Integer(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            }
        }
        final int value = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
        if (value != -1) {
            field2824[0] = new Integer(value);
        }
        else {
            field2824 = null;
        }
        if (-779005246 == n) {
            vmethod3380.onClick = field2824;
        }
        else if (n == 1364717866) {
            vmethod3380.onHold = field2824;
        }
        else if (n == 1402) {
            vmethod3380.onRelease = field2824;
        }
        else if (n == 1403) {
            vmethod3380.onMouseOver = field2824;
        }
        else if (1404 == n) {
            vmethod3380.onMouseLeave = field2824;
        }
        else if (1405 == n) {
            vmethod3380.onDrag = field2824;
        }
        else if (n == 1406) {
            vmethod3380.onTargetLeave = field2824;
        }
        else if (n == 457299770) {
            vmethod3380.onVarTransmit = field2824;
            vmethod3380.varTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 1535008075) {
            vmethod3380.onTimer = field2824;
        }
        else if (n == -1782566088) {
            vmethod3380.onOp = field2824;
        }
        else if (n == -2076166109) {
            vmethod3380.onDragComplete = field2824;
        }
        else if (n == 1411) {
            vmethod3380.onClickRepeat = field2824;
        }
        else if (1412 == n) {
            vmethod3380.onMouseRepeat = field2824;
        }
        else if (n == -263818773) {
            vmethod3380.onInvTransmit = field2824;
            vmethod3380.invTransmitTriggers = statTransmitTriggers;
        }
        else if (1415 == n) {
            vmethod3380.onStatTransmit = field2824;
            vmethod3380.statTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 2018191815) {
            vmethod3380.onTargetEnter = field2824;
        }
        else if (n == 1417) {
            vmethod3380.onScroll = field2824;
        }
        else if (n == -742357561) {
            vmethod3380.onChatTransmit = field2824;
        }
        else if (1995772967 == n) {
            vmethod3380.onKey = field2824;
        }
        else if (n == 1420) {
            vmethod3380.onFriendTransmit = field2824;
        }
        else if (125279803 == n) {
            vmethod3380.onClanTransmit = field2824;
        }
        else if (1422 == n) {
            vmethod3380.onMiscTransmit = field2824;
        }
        else if (n == 1423) {
            vmethod3380.onDialogAbort = field2824;
        }
        else if (1424 == n) {
            vmethod3380.onSubChange = field2824;
        }
        else if (1131802135 == n) {
            vmethod3380.onStockTransmit = field2824;
        }
        else if (n == 1136578290) {
            vmethod3380.field2998 = field2824;
        }
        else if (n == -1374558607) {
            vmethod3380.onResize = field2824;
        }
        else if (1428 == n) {
            vmethod3380.field2946 = field2824;
        }
        else if (n == -1507390214) {
            vmethod3380.field2876 = field2824;
        }
        else if (n == 1430) {
            vmethod3380.field2988 = field2824;
        }
        else if (n == -1964052395) {
            vmethod3380.field2892 = field2824;
        }
        else if (n == -936680022) {
            vmethod3380.field2961 = field2824;
        }
        else if (1550821343 == n) {
            vmethod3380.field2984 = field2824;
        }
        else {
            if (n < 1436 || n > 1439) {
                return 2;
            }
            final class312 method1818 = vmethod3380.method1818(-840865832);
            if (null != method1818) {
                if (n == 1436) {
                    method1818.field2821 = field2824;
                }
                else if (335564925 == n) {
                    method1818.field2826 = field2824;
                }
                else if (n == 1044008806) {
                    method1818.field2825 = field2824;
                }
                else if (-1614794286 == n) {
                    method1818.field2824 = field2824;
                }
            }
        }
        vmethod3380.field2978 = true;
        return 1;
    }
    
    static int fs(final int n, final Script script, final boolean b) {
        if (4100 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 830919429) * -1421596126 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2125541130] + Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1135407327) * -964267539];
            return 1;
        }
        if (1166644486 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -613580883] + Interpreter.Interpreter_stringStack[1 + -970824300 * SecureRandomCallable.Interpreter_stringStackSize];
            return 1;
        }
        if (n == -1868919907) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -522670320 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -922966057] + KitDefinition.getModelData(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -154915630], true, (byte)16);
            return 1;
        }
        if (n == -457461196) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1969736133) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2036970087].toLowerCase();
            return 1;
        }
        if (4104 == n) {
            Interpreter.Interpreter_calendar.setTime(new Date((Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1598117889] + 11745L) * 86400000L));
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1618222209) * -1535258923 - 1] = Interpreter.Interpreter_calendar.get(5) + "-" + Interpreter.Interpreter_MONTHS[Interpreter.Interpreter_calendar.get(2)] + "-" + Interpreter.Interpreter_calendar.get(1);
            return 1;
        }
        if (4105 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s = Interpreter.Interpreter_stringStack[-1939397365 * SecureRandomCallable.Interpreter_stringStackSize];
            final String s2 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            if (null != MusicPatchNode.localPlayer.appearance && 0 != 1693987821 * MusicPatchNode.localPlayer.appearance.npcTransformId) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1355861080) * 1356055032 - 1] = s2;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 74541603) * -1833313374 - 1] = s;
            }
            return 1;
        }
        if (-1399347146 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1423876815) * -2017760987 - 1] = Integer.toString(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (n == 4107) {
            SecureRandomCallable.Interpreter_stringStackSize += 804538906;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1228269810) * -964267539 - 1] = BuddyRankComparator.method712(class16.compareStrings(Interpreter.Interpreter_stringStack[787830568 * SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * 1778954431 + 1], ClanSettings.clientLanguage, 2049389231), -1723997839);
            return 1;
        }
        if (n == 4108) {
            final String s3 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1750993209) * -1493685671];
            Interpreter.Interpreter_intStackSize += 850193755;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 493485857) * -964267539 - 1] = class292.fo(new Font(class128.archive13.bh(Interpreter.Interpreter_intStack[1 + 544915998 * Interpreter.Interpreter_intStackSize], 0, (byte)(-126))), s3, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 1307565474]);
            return 1;
        }
        if (n == 1168845784) {
            final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -1018763228];
            Interpreter.Interpreter_intStackSize += 1940882851;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = AbstractFont.fa(new Font(class128.archive13.bh(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -797259982], 0, (byte)(-20))), s4, Interpreter.Interpreter_intStack[578827502 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (n == 2108050357) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -777196935];
            final String s6 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 275567880) * 1095532337] == 1) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1648756653) * 359842777 - 1] = s5;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -1736245610 - 1] = s6;
            }
            return 1;
        }
        if (-343305705 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 3362175) * -1695485944 - 1] = AbstractFont.escapeBrackets(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987]);
            return 1;
        }
        if (-1968794431 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 706102027) * -2017760987] + (char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            return 1;
        }
        if (n == -1608726763) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (VarcInt.isCharPrintable((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -963831804], (byte)56) ? 1 : 0);
            return 1;
        }
        if (n == 490428497) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 467026549) * -964267539 - 1] = (MenuAction.isAlphaNumeric((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -691958076) ? 1 : 0);
            return 1;
        }
        if (423680437 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1372032377 - 1] = (class134.isCharAlphabetic((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1541261175], (byte)3) ? 1 : 0);
            return 1;
        }
        if (n == 4116) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1734207594) * -1362213377 - 1] = (class149.isDigit((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 385449150], -1113904623) ? 1 : 0);
            return 1;
        }
        if (n == 4117) {
            final String s7 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 403092035) * -2017760987];
            if (null != s7) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 138099254) * 26651484 - 1] = s7.length();
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (980125770 == n) {
            final String s8 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * 37569431];
            Interpreter.Interpreter_intStackSize += 424698798;
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 845870249) * -2017760987 - 1] = s8.substring(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -463915296], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (4119 == n) {
            final String s9 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            final StringBuilder sb = new StringBuilder(s9.length());
            int n2 = 0;
            for (int i = 0; i < s9.length(); ++i) {
                final char char1 = s9.charAt(i);
                if (1527479818 == char1) {
                    n2 = 1;
                }
                else if (char1 == 806173141) {
                    n2 = 0;
                }
                else if (n2 == 0) {
                    sb.append(char1);
                }
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = sb.toString();
            return 1;
        }
        if (4120 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1610820741) * -61946577].indexOf(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (-1966486588 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2051764639;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 309669425) * -964267539 - 1] = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize].indexOf(Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -1209951296], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (4122 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1372353953) * 475390961 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toUpperCase();
            return 1;
        }
        if (n != 4123) {
            return 2;
        }
        SecureRandomCallable.Interpreter_stringStackSize += 427683745;
        final String s10 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
        final String s11 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -221958867 + 1];
        final String s12 = Interpreter.Interpreter_stringStack[2 + SecureRandomCallable.Interpreter_stringStackSize * -1467305182];
        if (null == MusicPatchNode.localPlayer.appearance) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1613895658) * -2017760987 - 1] = s12;
            return 1;
        }
        switch (1630080970 * MusicPatchNode.localPlayer.appearance.field2840) {
            case 1: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 1218672798 - 1] = s11;
                break;
            }
            case 0: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 2104190223) * -1143362269 - 1] = s10;
                break;
            }
            default: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1622641641) * -230542159 - 1] = s12;
                break;
            }
        }
        return 1;
    }
    
    static int ct(int n, final Script script, final boolean b) {
        int n2 = 1;
        Widget vmethod3380;
        if (n >= -953759565) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 356397114) * -1385035337], (byte)5);
            n2 = 0;
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (1300 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
            if (n3 >= 0 && n3 <= 9) {
                Widget.fm(vmethod3380, n3, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * 1426272662], (byte)2);
                return 1;
            }
            SecureRandomCallable.Interpreter_stringStackSize -= 1332923214;
            return 1;
        }
        else {
            if (n == -979068206) {
                Interpreter.Interpreter_intStackSize -= 1207262446;
                vmethod3380.parent = SoundSystem.getWidgetChild(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -971748838], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], 1684381108);
                return 1;
            }
            if (646487159 == n) {
                vmethod3380.spriteFlipH = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 487036316) * 749218445] == 1);
                return 1;
            }
            if (n == 1303) {
                vmethod3380.dragZoneSize = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 731988429) * -964267539] * 1773001161;
                return 1;
            }
            if (n == 1304) {
                vmethod3380.dragThreshold = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 756698455) * 2105375029] * 1466803237;
                return 1;
            }
            if (n == 743127192) {
                vmethod3380.field3004 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            if (n == -1392621021) {
                vmethod3380.text2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            if (1307 == n) {
                vmethod3380.actions = null;
                return 1;
            }
            if (n == 1308) {
                vmethod3380.field2969 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (335620928 == n) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (1350 == n) {
                byte[] array = null;
                byte[] array2 = null;
                if (n2 != 0) {
                    Interpreter.Interpreter_intStackSize -= 1530629697;
                    int i;
                    for (i = 0; i < 10 && Interpreter.Interpreter_intStack[i + -964267539 * Interpreter.Interpreter_intStackSize] >= 0; i += 2) {}
                    if (i > 0) {
                        array = new byte[i / 2];
                        array2 = new byte[i / 2];
                        for (i -= 2; i >= 0; i -= 2) {
                            array[i / 2] = (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1815433325 + i];
                            array2[i / 2] = (byte)Interpreter.Interpreter_intStack[1 + (-964267539 * Interpreter.Interpreter_intStackSize + i)];
                        }
                    }
                }
                else {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    array = new byte[] { (byte)Interpreter.Interpreter_intStack[-994272065 * Interpreter.Interpreter_intStackSize] };
                    array2 = new byte[] { (byte)Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] };
                }
                final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1025206819) * -1999138954] - 1;
                if (n4 >= 0 && n4 <= 9) {
                    class7.Widget_setKey(vmethod3380, n4, array, array2, 1394385105);
                    return 1;
                }
                throw new RuntimeException();
            }
            else {
                if (1351 == n) {
                    Interpreter.Interpreter_intStackSize -= 1611377171;
                    class7.Widget_setKey(vmethod3380, 10, new byte[] { (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 402211453] }, new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] }, 683819386);
                    return 1;
                }
                if (-313797863 == n) {
                    Interpreter.Interpreter_intStackSize -= 866365077;
                    final int n5 = Interpreter.Interpreter_intStack[-1757789536 * Interpreter.Interpreter_intStackSize] - 1;
                    final int n6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                    final int n7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                    if (n5 >= 0 && n5 <= 9) {
                        class68.Widget_setKeyRate(vmethod3380, n5, n6, n7, -1397609525);
                        return 1;
                    }
                    throw new RuntimeException();
                }
                else {
                    if (n == 507519898) {
                        class68.Widget_setKeyRate(vmethod3380, 10, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1350370088], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 973252173) * -2046432955], -1574705492);
                        return 1;
                    }
                    if (n == 1354) {
                        Interpreter.Interpreter_intStackSize += 685196872;
                        final int n8 = Interpreter.Interpreter_intStack[-773063999 * Interpreter.Interpreter_intStackSize] - 1;
                        if (n8 < 0 || n8 > 9) {
                            throw new RuntimeException();
                        }
                        ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, n8, (byte)(-117));
                        return 1;
                    }
                    else {
                        if (1355 == n) {
                            ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, 10, (byte)33);
                            return 1;
                        }
                        return 2;
                    }
                }
            }
        }
    }
    
    static int dv(final int n, final Script script, final boolean b) {
        final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
        if (1600 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1469632775 * widget.scrollX;
            return 1;
        }
        if (1601 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1223232735 * widget.scrollY;
            return 1;
        }
        if (1602 == n) {
            if (12 == widget.type * 883712245) {
                final class314 method1815 = widget.method1815((byte)15);
                if (null != method1815) {
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class379.mk(method1815.method1740(-1922392659), -1389348498);
                    return 1;
                }
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.field2916;
            return 1;
        }
        if (n == 1603) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.scrollWidth * -773060713;
            return 1;
        }
        if (1604 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1273374131 * widget.scrollHeight;
            return 1;
        }
        if (1605 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 942674363 * widget.modelZoom;
            return 1;
        }
        if (n == 1606) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.modelAngleX * 797932055;
            return 1;
        }
        if (1607 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.modelAngleZ * -1023931993;
            return 1;
        }
        if (1608 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -480949115 * widget.modelAngleY;
            return 1;
        }
        if (1609 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.transparencyTop * 1634279623;
            return 1;
        }
        if (1610 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.transparencyBot * 122284991;
            return 1;
        }
        if (n == 1611) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1409091639 * widget.color;
            return 1;
        }
        if (1612 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.color2 * 1449039161;
            return 1;
        }
        if (1613 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.fillMode.rsOrdinal(1456917638);
            return 1;
        }
        if (n == 1614) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (widget.spriteFlipV ? 1 : 0);
            return 1;
        }
        if (1617 == n) {
            final class309 method1816 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1816) ? (-90398499 * method1816.field2817) : 0);
        }
        if (n == 1618) {
            final class309 method1817 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1817) ? (216034339 * method1817.field2818) : 0);
            return 1;
        }
        if (n == 1619) {
            final class314 method1818 = widget.method1815((byte)82);
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((method1818 != null) ? class379.mk(method1818.method1741((byte)81), -1389348498) : "");
            return 1;
        }
        if (n == 1620) {
            final class309 method1819 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1819 != null) ? (1912484269 * method1819.field2816) : 0);
            return 1;
        }
        if (n == 1621) {
            final class314 method1820 = widget.method1815((byte)(-99));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1820 != null) ? method1820.method1716(-1840264938) : 0);
            return 1;
        }
        if (1622 == n) {
            final class314 method1821 = widget.method1815((byte)59);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1821) ? method1821.method1751(-2010025430) : 0);
            return 1;
        }
        if (1623 == n) {
            final class314 method1822 = widget.method1815((byte)19);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1822 != null) ? method1822.method1746(1424429838) : 0);
            return 1;
        }
        if (n == 1624) {
            final class314 method1823 = widget.method1815((byte)(-37));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1823 && class314.method1728(method1823, 1934050955)) ? 1 : 0);
            return 1;
        }
        if (1625 == n) {
            final class314 method1824 = widget.method1815((byte)99);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1824 != null && method1824.ed(1994580892)) ? 1 : 0);
            return 1;
        }
        if (1626 == n) {
            final class314 method1825 = widget.method1815((byte)36);
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((method1825 != null) ? class314.method1751(method1825, -2033178459).method2083(-2080434024) : "");
            return 1;
        }
        if (n == 1627) {
            final class314 method1826 = widget.method1815((byte)77);
            final int n2 = (method1826 != null) ? method1826.method1753(84481720) : 0;
            final int n3 = (method1826 != null) ? method1826.method1769(830992125) : 0;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.min(n2, n3);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.max(n2, n3);
            return 1;
        }
        if (1628 == n) {
            final class314 method1827 = widget.method1815((byte)(-3));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1827 != null) ? method1827.method1769(-1575416052) : 0);
            return 1;
        }
        if (1629 == n) {
            final class314 method1828 = widget.method1815((byte)(-34));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1828) ? method1828.method1781(-120102528) : 0);
            return 1;
        }
        if (n == 1630) {
            final class314 method1829 = widget.method1815((byte)53);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1829 != null) ? method1829.method1752((byte)(-4)) : 0);
            return 1;
        }
        if (1631 == n) {
            final class314 method1830 = widget.method1815((byte)(-23));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1830) ? class314.ww(method1830, 1963317761) : 0);
            return 1;
        }
        if (1632 == n) {
            final class314 method1831 = widget.method1815((byte)(-27));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1831) ? class314.ve(method1831, (byte)(-78)) : 0);
            return 1;
        }
        if (n == 1633) {
            final class27 method1832 = widget.method1795(2051256186);
            Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = ((null != method1832) ? class27.be(method1832, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], 2173184) : 0);
            return 1;
        }
        if (1634 == n) {
            final class27 method1833 = widget.method1795(2051138702);
            Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = ((method1833 != null) ? class27.bh(method1833, (char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], (byte)32) : 0);
            return 1;
        }
        return 2;
    }
    
    static int fn(final int n, final Script script, final boolean b) {
        if (n == -2028487173) {
            Client.logoutTimer = 336201504;
            return 1;
        }
        return 2;
    }
    
    static int ds(final int n, final Script script, final boolean b) {
        if (n == 2700) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2006098851 * class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5).itemId;
            return 1;
        }
        if (n == 2701) {
            final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            if (vmethod3380.itemId * -2006098851 != -1) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.itemQuantity * 1336975799;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (2702 == n) {
            if (null != Client.interfaceParents.at(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539])) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (2706 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.rootInterface * -896157613;
            return 1;
        }
        if (2707 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5).method1807(-1061285199) ? 1 : 0);
            return 1;
        }
        if (2708 == n) {
            return BufferedSource.method2214(class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5), -29971972);
        }
        if (n == 2709) {
            return class4.method11(class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5), -311440142);
        }
        return 2;
    }
    
    static int dh(final Widget widget) {
        if (widget.type * 883712245 != 11) {
            Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            return 1;
        }
        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.method1809(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -410163692);
        return 1;
    }
    
    static int ei(final int n, final Script script, final boolean b) {
        if (n == 4000) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539] + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            return 1;
        }
        if (n == 4001) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (4002 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (n == 4003) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] / Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            return 1;
        }
        if (n == 4004) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(Math.random() * Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (4005 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(Math.random() * (1 + Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]));
            return 1;
        }
        if (4006 == n) {
            Interpreter.Interpreter_intStackSize -= 2135679865;
            final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n2 + (Interpreter.Interpreter_intStack[4 + Interpreter.Interpreter_intStackSize * -964267539] - n4) * (n3 - n2) / (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 3] - n4);
            return 1;
        }
        if (4007 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n5 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] / 100 + n5;
            return 1;
        }
        if (4008 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] | 1 << Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (n == 4009) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] & -1 - (1 << Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]));
            return 1;
        }
        if (n == 4010) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((0x0 != (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] & 1 << Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539])) ? 1 : 0);
            return 1;
        }
        if (4011 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] % Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (4012 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            if (n6 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.pow(n6, n7);
            }
            return 1;
        }
        if (n == 4013) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n9 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            if (n8 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            switch (n9) {
                case 4: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.sqrt(Math.sqrt(n8));
                    break;
                }
                case 3: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.cbrt(n8);
                    break;
                }
                case 1: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n8;
                    break;
                }
                case 2: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.sqrt(n8);
                    break;
                }
                default: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.pow(n8, 1.0 / n9);
                    break;
                }
                case 0: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Integer.MAX_VALUE;
                    break;
                }
            }
            return 1;
        }
        else {
            if (n == 4014) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] & Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                return 1;
            }
            if (n == 4015) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] | Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
                return 1;
            }
            if (4016 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n10 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n11 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((n10 < n11) ? n10 : n11);
                return 1;
            }
            if (4017 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((n12 > n13) ? n12 : n13);
                return 1;
            }
            if (4018 == n) {
                Interpreter.Interpreter_intStackSize -= 1281407919;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize] * (long)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] / Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]);
                return 1;
            }
            if (n == 4025) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class18.method63(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 110327850);
                return 1;
            }
            if (n == 4026) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] ^ 1 << Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]);
                return 1;
            }
            if (n == 4027) {
                Interpreter.Interpreter_intStackSize -= 1281407919;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class134.method780(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)0);
                return 1;
            }
            if (4028 == n) {
                Interpreter.Interpreter_intStackSize -= 1281407919;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Canvas.method91(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2], 2018360759);
                return 1;
            }
            if (n == 4029) {
                Interpreter.Interpreter_intStackSize -= 1281407919;
                final int n14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n15 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                final int n16 = 31 - Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n14 << n16 >>> n15 + n16;
                return 1;
            }
            if (4030 == n) {
                Interpreter.Interpreter_intStackSize -= 1708543892;
                final int n17 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                int n18 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                final int n19 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                final int n20 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3];
                final int method91 = Canvas.method91(n17, n19, n20, 1872750281);
                final int vmethod3248 = class140.vmethod3248(n20 - n19 + 1, (byte)121);
                if (n18 > vmethod3248) {
                    n18 = vmethod3248;
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (method91 | n18 << n19);
                return 1;
            }
            if (4032 == n) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = AttackOption.method621(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1], 1144011533);
                return 1;
            }
            if (n == 4033) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = TriBool.method2198(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1], (byte)0);
                return 1;
            }
            if (n == 4034) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = UserComparator8.method688(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -2074948326);
                return 1;
            }
            if (n == 4035) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1]);
                return 1;
            }
            if (4036 == n) {
                final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                int release = -1;
                if (WorldMapSectionType.isNumber(s, -749597084)) {
                    release = PacketBufferNode.release(s, (byte)93);
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = release;
                return 1;
            }
            return 2;
        }
    }
    
    static int em(final int n, final Script script, final boolean b) {
        if (n == 3600) {
            if (World.friendSystem.field672 * -1736413869 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2;
            }
            else if (World.friendSystem.field672 * -1736413869 == 1) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.friendsList.bm(-846175463);
            }
            return 1;
        }
        if (3601 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(1102578674) && n2 >= 0 && n2 < World.friendSystem.friendsList.bm(-1763894429)) {
                final Friend friend = (Friend)UserList.pn(World.friendSystem.friendsList, n2, 902878102);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = friend.bx(-1314760427);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = User.tg(friend, -43557433);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 3602) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(-829425267) && n3 >= 0 && n3 < World.friendSystem.friendsList.bm(756929218)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n3, 1193175947)).world * 177258591;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3603 == n) {
            final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(1948765191) && n4 >= 0 && n4 < World.friendSystem.friendsList.bm(224317290)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n4, 2062205003)).rank * 1922414955;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3604 == n) {
            LoginScreenAnimation.method554(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-58));
            return 1;
        }
        if (3605 == n) {
            World.friendSystem.addFriend(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)(-74));
            return 1;
        }
        if (3606 == n) {
            FriendSystem.ti(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -548135358);
            return 1;
        }
        if (n == 3607) {
            FriendSystem.zz(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 42988923);
            return 1;
        }
        if (n == 3608) {
            World.friendSystem.removeIgnore(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], true, (byte)(-85));
            return 1;
        }
        if (n == 3609) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (World.friendSystem.isFriended(new Username(ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1227239523), class70.loginType), false, (byte)(-91)) ? 1 : 0);
            return 1;
        }
        if (n == 3611) {
            if (UserComparator5.friendsChat != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserComparator5.friendsChat.name;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 3612) {
            if (UserComparator5.friendsChat != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = UserComparator5.friendsChat.bm(-2119927150);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3613) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n5 < UserComparator5.friendsChat.bm(-1754997558)) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserList.pn(UserComparator5.friendsChat, n5, -585096792).getUsername(473993579).getName(-710264960);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 3614) {
            final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (UserComparator5.friendsChat != null && n6 < UserComparator5.friendsChat.bm(-594623121)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Buddy.hn((Buddy)UserList.pn(UserComparator5.friendsChat, n6, -795586837), -336547171);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3615 == n) {
            final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n7 < UserComparator5.friendsChat.bm(133907563)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(UserComparator5.friendsChat, n7, 1840677538)).rank * 1922414955;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3616 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((UserComparator5.friendsChat != null) ? UserComparator5.friendsChat.minKick : 0);
            return 1;
        }
        if (3617 == n) {
            class478.clanKickUser(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)109);
            return 1;
        }
        if (3618 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((UserComparator5.friendsChat != null) ? (1788650387 * UserComparator5.friendsChat.rank) : 0);
            return 1;
        }
        if (3619 == n) {
            class379.Clan_joinChat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1083143437);
            return 1;
        }
        if (3620 == n) {
            WorldMapData_0.Clan_leaveChat(1396555015);
            return 1;
        }
        if (3621 == n) {
            if (!World.friendSystem.method420(727999076)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.ignoreList.bm(493130260);
            }
            return 1;
        }
        if (3622 == n) {
            final int n8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(895446316) && n8 >= 0 && n8 < World.friendSystem.ignoreList.bm(1819189732)) {
                final Ignored ignored = (Ignored)UserList.pn(World.friendSystem.ignoreList, n8, -262341505);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ignored.bx(878782032);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = User.tg(ignored, -43557433);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (3623 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (World.friendSystem.isIgnored(new Username(ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1227239523), class70.loginType), -613476033) ? 1 : 0);
            return 1;
        }
        if (n == 3624) {
            final int n9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n9 < UserComparator5.friendsChat.bm(1050015979) && UserList.pn(UserComparator5.friendsChat, n9, 1174302769).getUsername(473993579).equals(MusicPatchNode.localPlayer.username)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3625 == n) {
            if (null != UserComparator5.friendsChat && UserComparator5.friendsChat.owner != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserComparator5.friendsChat.owner;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (3626 == n) {
            final int n10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n10 < UserComparator5.friendsChat.bm(1865164385) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n10, -46756066)).isFriend(815639000)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3627 == n) {
            final int n11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (UserComparator5.friendsChat != null && n11 < UserComparator5.friendsChat.bm(-1863310577) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n11, 943520511)).isIgnored(568398719)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3628) {
            World.friendSystem.friendsList.ce(357528038);
            return 1;
        }
        if (n == 3629) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator1(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)41);
            return 1;
        }
        if (n == 3630) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator2(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)125);
            return 1;
        }
        if (3631 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator3(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)118);
            return 1;
        }
        if (n == 3632) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator4(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)17);
            return 1;
        }
        if (n == 3633) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator5(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)111);
            return 1;
        }
        if (3634 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator6(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)98);
            return 1;
        }
        if (n == 3635) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator7(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)82);
            return 1;
        }
        if (n == 3636) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator8(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)117);
            return 1;
        }
        if (n == 3637) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator9(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)111);
            return 1;
        }
        if (3638 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator10(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)94);
            return 1;
        }
        if (n == 3639) {
            UserList.ge(World.friendSystem.friendsList, (byte)(-31));
            return 1;
        }
        if (3640 == n) {
            World.friendSystem.ignoreList.ce(357528038);
            return 1;
        }
        if (n == 3641) {
            World.friendSystem.ignoreList.ci((Comparator)new UserComparator1(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)58);
            return 1;
        }
        if (n == 3642) {
            World.friendSystem.ignoreList.ci((Comparator)new UserComparator2(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)82);
            return 1;
        }
        if (3643 == n) {
            UserList.ge(World.friendSystem.ignoreList, (byte)109);
            return 1;
        }
        if (3644 == n) {
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ce(357528038);
            }
            return 1;
        }
        if (3645 == n) {
            final boolean b2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator1(b2), (byte)51);
            }
            return 1;
        }
        if (3646 == n) {
            final boolean b3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator2(b3), (byte)79);
            }
            return 1;
        }
        if (3647 == n) {
            final boolean b4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator3(b4), (byte)107);
            }
            return 1;
        }
        if (3648 == n) {
            final boolean b5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator4(b5), (byte)62);
            }
            return 1;
        }
        if (n == 3649) {
            final boolean b6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator5(b6), (byte)109);
            }
            return 1;
        }
        if (3650 == n) {
            final boolean b7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator6(b7), (byte)16);
            }
            return 1;
        }
        if (n == 3651) {
            final boolean b8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator7(b8), (byte)10);
            }
            return 1;
        }
        if (n == 3652) {
            final boolean b9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator8(b9), (byte)42);
            }
            return 1;
        }
        if (3653 == n) {
            final boolean b10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator9(b10), (byte)126);
            }
            return 1;
        }
        if (3654 == n) {
            final boolean b11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator10(b11), (byte)49);
            }
            return 1;
        }
        if (n == 3655) {
            if (UserComparator5.friendsChat != null) {
                UserList.ge(UserComparator5.friendsChat, (byte)21);
            }
            return 1;
        }
        if (n == 3656) {
            World.friendSystem.friendsList.ci((Comparator)new BuddyRankComparator(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)77);
            return 1;
        }
        if (3657 == n) {
            final boolean b12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new BuddyRankComparator(b12), (byte)64);
            }
            return 1;
        }
        return 2;
    }
    
    static World getNextWorldListWorld(final int n) {
        try {
            if (285408389 * World.World_listCount >= World.World_count * -734287707) {
                return null;
            }
            if (n <= 1075224319) {
                throw new IllegalStateException();
            }
            return class31.World_worlds[(World.World_listCount -= 1658479539) * 285408389 - 1];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cy.al(" + ')');
        }
    }
    
    static int df(final int n, final Script script, final boolean b) {
        final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
        if (n == 1800) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.method1052(KeyHandler.getWidgetFlags(widget, 1622429757), 1342428248);
            return 1;
        }
        if (n == 1801) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            --n2;
            if (null == widget.actions || n2 >= widget.actions.length || widget.actions[n2] == null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.actions[n2];
            }
            return 1;
        }
        if (1802 == n) {
            if (null == widget.field3004) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.field3004;
            }
            return 1;
        }
        return 2;
    }
    
    static int et(final int n, final Script script, final boolean b) {
        final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
        if (2800 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.method1052(KeyHandler.getWidgetFlags(vmethod3380, 1459870551), 1187527522);
            return 1;
        }
        if (n == 2801) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            --n2;
            if (vmethod3380.actions == null || n2 >= vmethod3380.actions.length || null == vmethod3380.actions[n2]) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.actions[n2];
            }
            return 1;
        }
        if (2802 == n) {
            if (null == vmethod3380.field3004) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.field3004;
            }
            return 1;
        }
        return 2;
    }
    
    public static void cu(final ScriptEvent scriptEvent) {
        PlayerType.runScript(scriptEvent, 1834899232, 1561999548, 1403412352);
    }
    
    static final void dm(final Widget widget, final int n, final int n2, final int n3) {
        if (widget.field2936 == null) {
            throw new RuntimeException();
        }
        widget.field2936[n] = n2;
        widget.field2977[n] = n3;
    }
    
    static int cx(int n, final Script script, final boolean b) {
        int n2 = -1;
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -239732159];
            vmethod3380 = class165.vmethod3380(n2, (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (n == 1000) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            vmethod3380.rawX = 1806877347 * Interpreter.Interpreter_intStack[2013648074 * Interpreter.Interpreter_intStackSize];
            vmethod3380.rawY = 1231090287 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            vmethod3380.xAlignment = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539] * 1656805111;
            vmethod3380.yAlignment = Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize] * -362988363;
            class144.invalidateWidget(vmethod3380, -1368924572);
            ScriptFrame.client.alignWidget(vmethod3380, 407470172);
            if (n2 != -1 && 883712245 * vmethod3380.type == 0) {
                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)96);
            }
            return 1;
        }
        if (1001 == n) {
            Interpreter.Interpreter_intStackSize -= 155395659;
            vmethod3380.rawWidth = 792135773 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 813908536];
            vmethod3380.rawHeight = -1215212486 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * 1753601592];
            vmethod3380.widthAlignment = 1119169178 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -888049923];
            vmethod3380.heightAlignment = -480958745 * Interpreter.Interpreter_intStack[3 + -1124458765 * Interpreter.Interpreter_intStackSize];
            class144.invalidateWidget(vmethod3380, -1459317372);
            ScriptFrame.client.alignWidget(vmethod3380, 1746682809);
            if (-1 != n2 && vmethod3380.type * -807729519 == 0) {
                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)23);
            }
            return 1;
        }
        if (-1878308777 == n) {
            final boolean spriteTiling = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 822418592) * -964267539] == 1;
            if (spriteTiling != vmethod3380.spriteTiling) {
                vmethod3380.spriteTiling = spriteTiling;
                class144.invalidateWidget(vmethod3380, -2082220609);
            }
            return 1;
        }
        if (n == 1005) {
            vmethod3380.hasListener = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1437965031) * 1403605931] == 1);
            return 1;
        }
        if (n == 985552811) {
            vmethod3380.prioritizeMenuEntry = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        return 2;
    }
    
    static int ec(final int n, final Script script, final boolean b) {
        if (n == -1534165895) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 565146409) * -964267539 - 1] = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * 1572589953] + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            return 1;
        }
        if (n == -1954442418) {
            Interpreter.Interpreter_intStackSize += 949026738;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1440013203) * -1286596139 - 1] = Interpreter.Interpreter_intStack[-5998479 * Interpreter.Interpreter_intStackSize] - Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (4002 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1509484274) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (n == 4003) {
            Interpreter.Interpreter_intStackSize += 430865798;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 857121766) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 1323233389] / Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            return 1;
        }
        if (n == -1494460526) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1305079448) * -964267539 - 1] = (int)(Math.random() * Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1334295330) * -964267539]);
            return 1;
        }
        if (4005 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 125663347) * -2109499004 - 1] = (int)(Math.random() * (1 + Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1206980073) * 610397966]));
            return 1;
        }
        if (-1720534854 == n) {
            Interpreter.Interpreter_intStackSize -= 2078226884;
            final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -725303913 + 2];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n2 + (Interpreter.Interpreter_intStack[4 + Interpreter.Interpreter_intStackSize * -964267539] - n4) * (n3 - n2) / (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 3] - n4);
            return 1;
        }
        if (-688101665 == n) {
            Interpreter.Interpreter_intStackSize += 1175466663;
            final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n5 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] / 100 + n5;
            return 1;
        }
        if (4008 == n) {
            Interpreter.Interpreter_intStackSize -= 920324329;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 75962830 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] | 1 << Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (n == 4009) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[1855982482 * Interpreter.Interpreter_intStackSize] & -1 - (1 << Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]));
            return 1;
        }
        if (n == 4010) {
            Interpreter.Interpreter_intStackSize -= 178947707;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1684727913) * -913915025 - 1] = ((0x0 != (Interpreter.Interpreter_intStack[-857109408 * Interpreter.Interpreter_intStackSize] & 1 << Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539])) ? 1 : 0);
            return 1;
        }
        if (4011 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 624034263) * 1203073073 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] % Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            return 1;
        }
        if (1395323685 == n) {
            Interpreter.Interpreter_intStackSize -= 564909375;
            final int n6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 794055348];
            final int n7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            if (n6 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1473223003 - 1] = (int)Math.pow(n6, n7);
            }
            return 1;
        }
        if (n == 4013) {
            Interpreter.Interpreter_intStackSize += 763322980;
            final int n8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n9 = Interpreter.Interpreter_intStack[472087945 * Interpreter.Interpreter_intStackSize + 1];
            if (n8 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1453470752) * -1966280130 - 1] = 0;
                return 1;
            }
            switch (n9) {
                case 0: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -90781955 - 1] = Integer.MAX_VALUE;
                    break;
                }
                case 1: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1331866491) * -964267539 - 1] = n8;
                    break;
                }
                default: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 338610487) * -964267539 - 1] = (int)Math.pow(n8, 1.0 / n9);
                    break;
                }
                case 3: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.cbrt(n8);
                    break;
                }
                case 2: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -225506507 - 1] = (int)Math.sqrt(n8);
                    break;
                }
                case 4: {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1192374136) * -964267539 - 1] = (int)Math.sqrt(Math.sqrt(n8));
                    break;
                }
            }
            return 1;
        }
        else {
            if (n == 4014) {
                Interpreter.Interpreter_intStackSize += 1225224473;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 554300819 - 1] = (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] & Interpreter.Interpreter_intStack[1 + -1537818737 * Interpreter.Interpreter_intStackSize]);
                return 1;
            }
            if (n == 919283303) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2095025699) * 315415465 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] | Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
                return 1;
            }
            if (4016 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n10 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n11 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((n10 < n11) ? n10 : n11);
                return 1;
            }
            if (4017 == n) {
                Interpreter.Interpreter_intStackSize -= 1506086695;
                final int n12 = Interpreter.Interpreter_intStack[1836707930 * Interpreter.Interpreter_intStackSize];
                final int n13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1075066817 + 1];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 275943351) * -964267539 - 1] = ((n12 > n13) ? n12 : n13);
                return 1;
            }
            if (4018 == n) {
                Interpreter.Interpreter_intStackSize += 153659507;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1631809040 - 1] = (int)(Interpreter.Interpreter_intStack[2 + 223686882 * Interpreter.Interpreter_intStackSize] * (long)Interpreter.Interpreter_intStack[-1562093545 * Interpreter.Interpreter_intStackSize] / Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]);
                return 1;
            }
            if (n == 4025) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class18.method63(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -322708818);
                return 1;
            }
            if (n == 1177642541) {
                Interpreter.Interpreter_intStackSize -= 1955323802;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 381962678) * 1947736312 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] ^ 1 << Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -333490409]);
                return 1;
            }
            if (n == 141485692) {
                Interpreter.Interpreter_intStackSize -= 1021839466;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 477862968) * -707158653 - 1] = class134.method780(Interpreter.Interpreter_intStack[900772605 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[2 + 1961652438 * Interpreter.Interpreter_intStackSize], (byte)0);
                return 1;
            }
            if (4028 == n) {
                Interpreter.Interpreter_intStackSize -= 1518913770;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1519421710) * -964267539 - 1] = Canvas.method91(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * 248936722], Interpreter.Interpreter_intStack[156157905 * Interpreter.Interpreter_intStackSize + 2], 1801682170);
                return 1;
            }
            if (n == 4029) {
                Interpreter.Interpreter_intStackSize -= 1281407919;
                final int n14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1369543271];
                final int n15 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                final int n16 = 31 - Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2101959525) * -964267539 - 1] = n14 << n16 >>> n15 + n16;
                return 1;
            }
            if (4030 == n) {
                Interpreter.Interpreter_intStackSize -= 1708543892;
                final int n17 = Interpreter.Interpreter_intStack[-435162146 * Interpreter.Interpreter_intStackSize];
                int n18 = Interpreter.Interpreter_intStack[786757592 * Interpreter.Interpreter_intStackSize + 1];
                final int n19 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -316139237];
                final int n20 = Interpreter.Interpreter_intStack[-1998577449 * Interpreter.Interpreter_intStackSize + 3];
                final int method91 = Canvas.method91(n17, n19, n20, 1593152984);
                final int vmethod3248 = class140.vmethod3248(n20 - n19 + 1, (byte)124);
                if (n18 > vmethod3248) {
                    n18 = vmethod3248;
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1110520735) * 1496658921 - 1] = (method91 | n18 << n19);
                return 1;
            }
            if (1667128020 == n) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 1784656242 - 1] = AttackOption.method621(Interpreter.Interpreter_intStack[766499395 * Interpreter.Interpreter_intStackSize - 1], 889452107);
                return 1;
            }
            if (n == 4033) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = TriBool.method2198(Interpreter.Interpreter_intStack[-812353924 * Interpreter.Interpreter_intStackSize - 1], (byte)0);
                return 1;
            }
            if (n == -746325177) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 89767914) * -964267539 - 1] = UserComparator8.method688(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 535070580 + 1], 138130103);
                return 1;
            }
            if (n == -1947399195) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 143608520 - 1]);
                return 1;
            }
            if (4036 == n) {
                final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                int release = -1;
                if (WorldMapSectionType.isNumber(s, -761729567)) {
                    release = PacketBufferNode.release(s, (byte)99);
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = release;
                return 1;
            }
            return 2;
        }
    }
    
    static int dk(final int n, final Script script, final boolean b) {
        final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
        if (1600 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1469632775 * widget.scrollX;
            return 1;
        }
        if (1601 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1223232735 * widget.scrollY;
            return 1;
        }
        if (1602 == n) {
            if (12 == widget.type * 883712245) {
                final class314 method1815 = widget.method1815((byte)0);
                if (null != method1815) {
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class379.mk(method1815.method1740(-2048540272), -1389348498);
                    return 1;
                }
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.field2916;
            return 1;
        }
        if (n == 1603) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.scrollWidth * -773060713;
            return 1;
        }
        if (1604 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1273374131 * widget.scrollHeight;
            return 1;
        }
        if (1605 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 942674363 * widget.modelZoom;
            return 1;
        }
        if (n == 1606) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.modelAngleX * 797932055;
            return 1;
        }
        if (1607 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.modelAngleZ * -1023931993;
            return 1;
        }
        if (1608 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -480949115 * widget.modelAngleY;
            return 1;
        }
        if (1609 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.transparencyTop * 1634279623;
            return 1;
        }
        if (1610 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.transparencyBot * 122284991;
            return 1;
        }
        if (n == 1611) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1409091639 * widget.color;
            return 1;
        }
        if (1612 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.color2 * 1449039161;
            return 1;
        }
        if (1613 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.fillMode.rsOrdinal(851913873);
            return 1;
        }
        if (n == 1614) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (widget.spriteFlipV ? 1 : 0);
            return 1;
        }
        if (1617 == n) {
            final class309 method1816 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1816) ? (-90398499 * method1816.field2817) : 0);
        }
        if (n == 1618) {
            final class309 method1817 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1817) ? (216034339 * method1817.field2818) : 0);
            return 1;
        }
        if (n == 1619) {
            final class314 method1818 = widget.method1815((byte)(-33));
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((method1818 != null) ? class379.mk(method1818.method1741((byte)(-19)), -1389348498) : "");
            return 1;
        }
        if (n == 1620) {
            final class309 method1819 = widget.method1817(-1740765458);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1819 != null) ? (1912484269 * method1819.field2816) : 0);
            return 1;
        }
        if (n == 1621) {
            final class314 method1820 = widget.method1815((byte)(-32));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1820 != null) ? method1820.method1716(-1588148987) : 0);
            return 1;
        }
        if (1622 == n) {
            final class314 method1821 = widget.method1815((byte)43);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1821) ? method1821.method1751(-2132488436) : 0);
            return 1;
        }
        if (1623 == n) {
            final class314 method1822 = widget.method1815((byte)40);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1822 != null) ? method1822.method1746(1424429838) : 0);
            return 1;
        }
        if (n == 1624) {
            final class314 method1823 = widget.method1815((byte)8);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1823 && class314.method1728(method1823, 1779681711)) ? 1 : 0);
            return 1;
        }
        if (1625 == n) {
            final class314 method1824 = widget.method1815((byte)58);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1824 != null && method1824.ed(1994580892)) ? 1 : 0);
            return 1;
        }
        if (1626 == n) {
            final class314 method1825 = widget.method1815((byte)(-74));
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((method1825 != null) ? class314.method1751(method1825, -1395393392).method2083(-1592441571) : "");
            return 1;
        }
        if (n == 1627) {
            final class314 method1826 = widget.method1815((byte)37);
            final int n2 = (method1826 != null) ? method1826.method1753(1193103975) : 0;
            final int n3 = (method1826 != null) ? method1826.method1769(1744909078) : 0;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.min(n2, n3);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.max(n2, n3);
            return 1;
        }
        if (1628 == n) {
            final class314 method1827 = widget.method1815((byte)(-16));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1827 != null) ? method1827.method1769(1704015305) : 0);
            return 1;
        }
        if (1629 == n) {
            final class314 method1828 = widget.method1815((byte)(-101));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1828) ? method1828.method1781(-1917186175) : 0);
            return 1;
        }
        if (n == 1630) {
            final class314 method1829 = widget.method1815((byte)5);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1829 != null) ? method1829.method1752((byte)(-63)) : 0);
            return 1;
        }
        if (1631 == n) {
            final class314 method1830 = widget.method1815((byte)36);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1830) ? class314.ww(method1830, 1379397084) : 0);
            return 1;
        }
        if (1632 == n) {
            final class314 method1831 = widget.method1815((byte)62);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1831) ? class314.ve(method1831, (byte)39) : 0);
            return 1;
        }
        if (n == 1633) {
            final class27 method1832 = widget.method1795(2072397645);
            Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = ((null != method1832) ? class27.be(method1832, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], -350340641) : 0);
            return 1;
        }
        if (1634 == n) {
            final class27 method1833 = widget.method1795(1827488932);
            Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = ((method1833 != null) ? class27.bh(method1833, (char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], (byte)32) : 0);
            return 1;
        }
        return 2;
    }
    
    static int do(int n, final Script script, final boolean b) {
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1974574986) * -964267539], (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        String substring = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -1769990760];
        int[] statTransmitTriggers = null;
        if (substring.length() > 0 && substring.charAt(substring.length() - 1) == -1189394800) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1886536114) * 287334181];
            if (n2 > 0) {
                statTransmitTriggers = new int[n2];
                while (n2-- > 0) {
                    statTransmitTriggers[n2] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 149446544) * -964267539];
                }
            }
            substring = substring.substring(0, substring.length() - 1);
        }
        Object[] field2824 = new Object[substring.length() + 1];
        for (int i = field2824.length - 1; i >= 1; --i) {
            if (substring.charAt(i - 1) == 1427882045) {
                field2824[i] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            }
            else {
                field2824[i] = new Integer(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1251921839) * 1670525848]);
            }
        }
        final int value = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 984757816) * -964267539];
        if (value != -1) {
            field2824[0] = new Integer(value);
        }
        else {
            field2824 = null;
        }
        if (481555345 == n) {
            vmethod3380.onClick = field2824;
        }
        else if (n == -630121069) {
            vmethod3380.onHold = field2824;
        }
        else if (n == 1402) {
            vmethod3380.onRelease = field2824;
        }
        else if (n == 1403) {
            vmethod3380.onMouseOver = field2824;
        }
        else if (-1420151510 == n) {
            vmethod3380.onMouseLeave = field2824;
        }
        else if (1405 == n) {
            vmethod3380.onDrag = field2824;
        }
        else if (n == -1324040516) {
            vmethod3380.onTargetLeave = field2824;
        }
        else if (n == 1407) {
            vmethod3380.onVarTransmit = field2824;
            vmethod3380.varTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 1408) {
            vmethod3380.onTimer = field2824;
        }
        else if (n == 1409) {
            vmethod3380.onOp = field2824;
        }
        else if (n == 1410) {
            vmethod3380.onDragComplete = field2824;
        }
        else if (n == 1411) {
            vmethod3380.onClickRepeat = field2824;
        }
        else if (1412 == n) {
            vmethod3380.onMouseRepeat = field2824;
        }
        else if (n == 1414) {
            vmethod3380.onInvTransmit = field2824;
            vmethod3380.invTransmitTriggers = statTransmitTriggers;
        }
        else if (1415 == n) {
            vmethod3380.onStatTransmit = field2824;
            vmethod3380.statTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 1416) {
            vmethod3380.onTargetEnter = field2824;
        }
        else if (n == 1715317569) {
            vmethod3380.onScroll = field2824;
        }
        else if (n == -1026526566) {
            vmethod3380.onChatTransmit = field2824;
        }
        else if (-743183969 == n) {
            vmethod3380.onKey = field2824;
        }
        else if (n == 1420) {
            vmethod3380.onFriendTransmit = field2824;
        }
        else if (1477171945 == n) {
            vmethod3380.onClanTransmit = field2824;
        }
        else if (-1611920940 == n) {
            vmethod3380.onMiscTransmit = field2824;
        }
        else if (n == 1423) {
            vmethod3380.onDialogAbort = field2824;
        }
        else if (-813795275 == n) {
            vmethod3380.onSubChange = field2824;
        }
        else if (1425 == n) {
            vmethod3380.onStockTransmit = field2824;
        }
        else if (n == 1426) {
            vmethod3380.field2998 = field2824;
        }
        else if (n == 540118607) {
            vmethod3380.onResize = field2824;
        }
        else if (1428 == n) {
            vmethod3380.field2946 = field2824;
        }
        else if (n == 1226786464) {
            vmethod3380.field2876 = field2824;
        }
        else if (n == 343150010) {
            vmethod3380.field2988 = field2824;
        }
        else if (n == 1431) {
            vmethod3380.field2892 = field2824;
        }
        else if (n == 1434) {
            vmethod3380.field2961 = field2824;
        }
        else if (1170148872 == n) {
            vmethod3380.field2984 = field2824;
        }
        else {
            if (n < 1436 || n > 1439) {
                return 2;
            }
            final class312 method1818 = vmethod3380.method1818(-103571847);
            if (null != method1818) {
                if (n == 1436) {
                    method1818.field2821 = field2824;
                }
                else if (1314611852 == n) {
                    method1818.field2826 = field2824;
                }
                else if (n == 126956458) {
                    method1818.field2825 = field2824;
                }
                else if (1439 == n) {
                    method1818.field2824 = field2824;
                }
            }
        }
        vmethod3380.field2978 = true;
        return 1;
    }
    
    static void gd(final int n) {
        if (n == -1) {
            return;
        }
        if (!SoundSystem.loadInterface(n, 1376777516)) {
            return;
        }
        final Widget[] array = VerticalAlignment.Widget_interfaceComponents[n];
        for (int i = 0; i < array.length; ++i) {
            final Widget dragTarget = array[i];
            if (null != dragTarget.onLoad) {
                final ScriptEvent scriptEvent = new ScriptEvent();
                scriptEvent.dragTarget = dragTarget;
                scriptEvent.args = dragTarget.onLoad;
                PlayerType.runScript(scriptEvent, 5000000, 0, 1485394338);
            }
        }
    }
    
    static int dz(final int n, final Script script, final boolean b) {
        final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
        if (1700 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.itemId * -2006098851;
            return 1;
        }
        if (1701 == n) {
            if (-1 != -2006098851 * widget.itemId) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.itemQuantity * 1336975799;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (1702 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 55577617 * widget.childIndex;
            return 1;
        }
        if (1707 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (widget.method1807(1522997111) ? 1 : 0);
            return 1;
        }
        if (n == 1708) {
            return BufferedSource.method2214(widget, 410057163);
        }
        if (n == 1709) {
            return class4.method11(widget, 514891514);
        }
        return 2;
    }
    
    static int fr(final int n, final Script script, final boolean b) {
        if (-1960114427 == n) {
            Interpreter.Interpreter_intStackSize += 1195724120;
            Client.field625 = (short)VertexNormal.method1346(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], 318062360);
            if (Client.field625 <= 0) {
                Client.field625 = (short)1314347815;
            }
            Client.field626 = (short)VertexNormal.method1346(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -2093654131 + 1], -482849754);
            if (Client.field626 <= 0) {
                Client.field626 = (short)(-125869321);
            }
            return 1;
        }
        if (n == 1970553724) {
            Interpreter.Interpreter_intStackSize += 818390025;
            Client.zoomHeight = (short)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            if (Client.zoomHeight <= 0) {
                Client.zoomHeight = (short)(-705550485);
            }
            Client.zoomWidth = (short)Interpreter.Interpreter_intStack[110161958 * Interpreter.Interpreter_intStackSize + 1];
            if (Client.zoomWidth <= 0) {
                Client.zoomWidth = 320;
            }
            return 1;
        }
        if (6202 == n) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            Client.field440 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            if (Client.field440 <= 0) {
                Client.field440 = 1;
            }
            Client.field630 = (short)Interpreter.Interpreter_intStack[1 + -1762526516 * Interpreter.Interpreter_intStackSize];
            if (Client.field630 <= 0) {
                Client.field630 = 32767;
            }
            else if (Client.field630 < Client.field440) {
                Client.field630 = Client.field440;
            }
            Client.field488 = (short)Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            if (Client.field488 <= 0) {
                Client.field488 = 1;
            }
            Client.field562 = (short)Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize];
            if (Client.field562 <= 0) {
                Client.field562 = 32767;
            }
            else if (Client.field562 < Client.field488) {
                Client.field562 = Client.field488;
            }
            return 1;
        }
        if (6203 == n) {
            if (Client.viewportWidget != null) {
                class36.setViewportShape(0, 0, 1769337449 * Client.viewportWidget.width, 1664397120 * Client.viewportWidget.height, false, -455339461);
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -156467163 * Client.viewportWidth;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1232607955) * -1680141566 - 1] = Client.viewportHeight * 2042096749;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            return 1;
        }
        if (n == 6204) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 781496630) * -964267539 - 1] = Client.zoomHeight;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 679615391) * 1087089987 - 1] = Client.zoomWidth;
            return 1;
        }
        if (n == 581451869) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1563384085 - 1] = SoundSystem.method246(Client.field625, -1529493989);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1256100066) * -1996527588 - 1] = SoundSystem.method246(Client.field626, 969313101);
            return 1;
        }
        if (1065894747 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1763894747) * -352015609 - 1] = 0;
            return 1;
        }
        if (6221 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            return 1;
        }
        if (n == 6222) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 542381899) * -964267539 - 1] = GameEngine.canvasWidth * 2087795979;
            return 1;
        }
        if (6223 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1174304593) * 217607930 - 1] = 1658005443 * class262.canvasHeight;
            return 1;
        }
        return 2;
    }
    
    static int de(final Widget widget) {
        if (883712245 * widget.type != 11) {
            SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            return 1;
        }
        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1445568958) * -964267539 - 1] = widget.method1804(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1873201544) * -2017760987], 109123943);
        return 1;
    }
    
    static int ge(final int n, final Script script, final boolean b) {
        if (2035914105 == n) {
            GrandExchangeOfferOwnWorldComparator.method365(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1337730627) * 675379841] == 1, -2009858192);
            return 1;
        }
        return 2;
    }
    
    static int fl(final int n, final Script script, final boolean b) {
        if (n == 5000) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.publicChatMode * -1963411823;
            return 1;
        }
        if (5001 == n) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * 1410976369;
            FloorUnderlayDefinition.privateChatMode = class399.method2128(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -108064052);
            if (FloorUnderlayDefinition.privateChatMode == null) {
                FloorUnderlayDefinition.privateChatMode = PrivateChatMode.field4161;
            }
            Client.tradeChatMode = -2053731769 * Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2502, Client.packetWriter.isaacCipher, (short)(-23506));
            packetBufferNode.packetBuffer.bf(-1963411823 * Client.publicChatMode, (byte)37);
            packetBufferNode.packetBuffer.bf(1843384107 * FloorUnderlayDefinition.privateChatMode.id, (byte)44);
            packetBufferNode.packetBuffer.bf(-839909513 * Client.tradeChatMode, (byte)126);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
            return 1;
        }
        if (n == 5002) {
            final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n2 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            final int n3 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher, (short)(-12571));
            packetBufferNode2.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-112)) + 2, (byte)64);
            packetBufferNode2.packetBuffer.ce(s, -1957181612);
            packetBufferNode2.packetBuffer.bf(n2 - 1, (byte)105);
            packetBufferNode2.packetBuffer.bf(n3, (byte)32);
            Client.packetWriter.addNode(packetBufferNode2, 414135591);
            return 1;
        }
        if (5003 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final Message messages_getByChannelAndID = Actor.Messages_getByChannelAndID(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 747431341);
            if (messages_getByChannelAndID != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID.type * -1117255211;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID.prefix) ? messages_getByChannelAndID.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID.text) ? messages_getByChannelAndID.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getByChannelAndID.sender != null) ? messages_getByChannelAndID.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getByChannelAndID.isFromFriend(2123356818) ? 1 : (messages_getByChannelAndID.isFromIgnored(1426002396) ? 2 : 0));
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
        if (5004 == n) {
            final Message messages_getMessage = MouseRecorder.Messages_getMessage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)32);
            if (null != messages_getMessage) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -53488167 * messages_getMessage.cycle;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getMessage.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getMessage.prefix) ? messages_getMessage.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getMessage.text) ? messages_getMessage.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getMessage.sender != null) ? messages_getMessage.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getMessage.isFromFriend(1139673389) ? 1 : (messages_getMessage.isFromIgnored(1426002396) ? 2 : 0));
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
        if (5005 == n) {
            if (FloorUnderlayDefinition.privateChatMode == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FloorUnderlayDefinition.privateChatMode.id * 1843384107;
            }
            return 1;
        }
        if (n == 5008) {
            Client.packetWriter.addNode(class314.method1779(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], ClanSettings.clientLanguage, -1, (byte)95), 414135591);
            return 1;
        }
        if (n == 5009) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s2 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            final String s3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
            final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.field2522, Client.packetWriter.isaacCipher, (short)(-8183));
            packetBufferNode3.packetBuffer.cq(0, (byte)46);
            final int n4 = -1633313603 * packetBufferNode3.packetBuffer.at;
            packetBufferNode3.packetBuffer.ce(s2, -1807872333);
            WorldMapArea.readWorldMapSection(packetBufferNode3.packetBuffer, s3, -53610141);
            packetBufferNode3.packetBuffer.ca(packetBufferNode3.packetBuffer.at * -1633313603 - n4, -1425169508);
            Client.packetWriter.addNode(packetBufferNode3, 414135591);
            return 1;
        }
        if (n == 5010) {
            final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Client.packetWriter.addNode(class314.method1779(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], s4, ClanSettings.clientLanguage, Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)89), 414135591);
            return 1;
        }
        if (5015 == n) {
            String name;
            if (MusicPatchNode.localPlayer != null && null != MusicPatchNode.localPlayer.username) {
                name = MusicPatchNode.localPlayer.username.getName(-710264960);
            }
            else {
                name = "";
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = name;
            return 1;
        }
        if (5016 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.tradeChatMode * -839909513;
            return 1;
        }
        if (n == 5017) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.Messages_getHistorySize(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)127);
            return 1;
        }
        if (n == 5018) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FaceNormal.Messages_getLastChatID(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 844292356);
            return 1;
        }
        if (5019 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BuddyRankComparator.method707(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -793414733);
            return 1;
        }
        if (n == 5020) {
            DynamicObject.doCheat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -1626072709);
            return 1;
        }
        if (5021 == n) {
            Client.field586 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toLowerCase().trim();
            return 1;
        }
        if (n == 5022) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Client.field586;
            return 1;
        }
        if (n == 5023) {
            System.out.println(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987]);
            return 1;
        }
        if (n == 5030) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final Message messages_getByChannelAndID2 = Actor.Messages_getByChannelAndID(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -44647023);
            if (null != messages_getByChannelAndID2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1117255211 * messages_getByChannelAndID2.type;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID2.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.prefix) ? messages_getByChannelAndID2.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.text) ? messages_getByChannelAndID2.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.sender) ? messages_getByChannelAndID2.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getByChannelAndID2.isFromFriend(787190731) ? 1 : (messages_getByChannelAndID2.isFromIgnored(1426002396) ? 2 : 0));
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
        if (5031 == n) {
            final Message messages_getMessage2 = MouseRecorder.Messages_getMessage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)32);
            if (null != messages_getMessage2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getMessage2.cycle * -53488167;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -524761677 * messages_getMessage2.count;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getMessage2.prefix) ? messages_getMessage2.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getMessage2.text != null) ? messages_getMessage2.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getMessage2.sender != null) ? messages_getMessage2.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getMessage2.isFromFriend(1466166766) ? 1 : (messages_getMessage2.isFromIgnored(1426002396) ? 2 : 0));
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
    
    static int fo(final int n, final Script script, final boolean b) {
        if (n == 5000) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.publicChatMode * -1963411823;
            return 1;
        }
        if (5001 == n) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * 1410976369;
            FloorUnderlayDefinition.privateChatMode = class399.method2128(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -108064052);
            if (FloorUnderlayDefinition.privateChatMode == null) {
                FloorUnderlayDefinition.privateChatMode = PrivateChatMode.field4161;
            }
            Client.tradeChatMode = -2053731769 * Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2502, Client.packetWriter.isaacCipher, (short)(-22738));
            packetBufferNode.packetBuffer.bf(-1963411823 * Client.publicChatMode, (byte)45);
            packetBufferNode.packetBuffer.bf(1843384107 * FloorUnderlayDefinition.privateChatMode.id, (byte)56);
            packetBufferNode.packetBuffer.bf(-839909513 * Client.tradeChatMode, (byte)100);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
            return 1;
        }
        if (n == 5002) {
            final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n2 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            final int n3 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher, (short)(-17394));
            packetBufferNode2.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)17) + 2, (byte)78);
            packetBufferNode2.packetBuffer.ce(s, -1481429875);
            packetBufferNode2.packetBuffer.bf(n2 - 1, (byte)52);
            packetBufferNode2.packetBuffer.bf(n3, (byte)61);
            Client.packetWriter.addNode(packetBufferNode2, 414135591);
            return 1;
        }
        if (5003 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final Message messages_getByChannelAndID = Actor.Messages_getByChannelAndID(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 1766322542);
            if (messages_getByChannelAndID != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID.type * -1117255211;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID.prefix) ? messages_getByChannelAndID.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID.text) ? messages_getByChannelAndID.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getByChannelAndID.sender != null) ? messages_getByChannelAndID.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getByChannelAndID.isFromFriend(935047130) ? 1 : (messages_getByChannelAndID.isFromIgnored(1426002396) ? 2 : 0));
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
        if (5004 == n) {
            final Message messages_getMessage = MouseRecorder.Messages_getMessage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)32);
            if (null != messages_getMessage) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -53488167 * messages_getMessage.cycle;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getMessage.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getMessage.prefix) ? messages_getMessage.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getMessage.text) ? messages_getMessage.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getMessage.sender != null) ? messages_getMessage.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getMessage.isFromFriend(582454671) ? 1 : (messages_getMessage.isFromIgnored(1426002396) ? 2 : 0));
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
        if (5005 == n) {
            if (FloorUnderlayDefinition.privateChatMode == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FloorUnderlayDefinition.privateChatMode.id * 1843384107;
            }
            return 1;
        }
        if (n == 5008) {
            Client.packetWriter.addNode(class314.method1779(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], ClanSettings.clientLanguage, -1, (byte)84), 414135591);
            return 1;
        }
        if (n == 5009) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s2 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            final String s3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
            final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.field2522, Client.packetWriter.isaacCipher, (short)(-21312));
            packetBufferNode3.packetBuffer.cq(0, (byte)20);
            final int n4 = -1633313603 * packetBufferNode3.packetBuffer.at;
            packetBufferNode3.packetBuffer.ce(s2, -2101726535);
            WorldMapArea.readWorldMapSection(packetBufferNode3.packetBuffer, s3, -53610141);
            packetBufferNode3.packetBuffer.ca(packetBufferNode3.packetBuffer.at * -1633313603 - n4, -1093016023);
            Client.packetWriter.addNode(packetBufferNode3, 414135591);
            return 1;
        }
        if (n == 5010) {
            final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Client.packetWriter.addNode(class314.method1779(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], s4, ClanSettings.clientLanguage, Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)47), 414135591);
            return 1;
        }
        if (5015 == n) {
            String name;
            if (MusicPatchNode.localPlayer != null && null != MusicPatchNode.localPlayer.username) {
                name = MusicPatchNode.localPlayer.username.getName(-710264960);
            }
            else {
                name = "";
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = name;
            return 1;
        }
        if (5016 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.tradeChatMode * -839909513;
            return 1;
        }
        if (n == 5017) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.Messages_getHistorySize(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)127);
            return 1;
        }
        if (n == 5018) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FaceNormal.Messages_getLastChatID(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1359164486);
            return 1;
        }
        if (5019 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BuddyRankComparator.method707(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -531284016);
            return 1;
        }
        if (n == 5020) {
            DynamicObject.doCheat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -1776171562);
            return 1;
        }
        if (5021 == n) {
            Client.field586 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toLowerCase().trim();
            return 1;
        }
        if (n == 5022) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Client.field586;
            return 1;
        }
        if (n == 5023) {
            System.out.println(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987]);
            return 1;
        }
        if (n == 5030) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final Message messages_getByChannelAndID2 = Actor.Messages_getByChannelAndID(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -993169362);
            if (null != messages_getByChannelAndID2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1117255211 * messages_getByChannelAndID2.type;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getByChannelAndID2.count * -524761677;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.prefix) ? messages_getByChannelAndID2.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.text) ? messages_getByChannelAndID2.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getByChannelAndID2.sender) ? messages_getByChannelAndID2.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getByChannelAndID2.isFromFriend(1415906775) ? 1 : (messages_getByChannelAndID2.isFromIgnored(1426002396) ? 2 : 0));
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
        if (5031 == n) {
            final Message messages_getMessage2 = MouseRecorder.Messages_getMessage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)32);
            if (null != messages_getMessage2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = messages_getMessage2.cycle * -53488167;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -524761677 * messages_getMessage2.count;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != messages_getMessage2.prefix) ? messages_getMessage2.prefix : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getMessage2.text != null) ? messages_getMessage2.text : "");
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((messages_getMessage2.sender != null) ? messages_getMessage2.sender : "");
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (messages_getMessage2.isFromFriend(1603978251) ? 1 : (messages_getMessage2.isFromIgnored(1426002396) ? 2 : 0));
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
    
    static int gt(final int n, final Script script, final boolean b) {
        if (n != -153191680 && n != 7508) {
            if (7501 == n) {
                if (null != class1.field4 && class1.field4.hasNext()) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 481842977) * -964267539 - 1] = class1.field4.next();
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 60579707 - 1] = -1;
                }
                return 1;
            }
            if (n == 7502) {
                Interpreter.Interpreter_intStackSize -= 1811417053;
                final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 1127580227];
                final int n3 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                final int n4 = Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
                final int method1992 = class373.method1992(n3, (byte)120);
                final int write = BufferedSink.write(n3, (byte)15);
                final int method1993 = class146.method833(n3, 1897074657);
                final DbRowType method1994 = class125.method750(n2, 1316134969);
                final DbTableType dbTableType = GameBuild.getDbTableType(method1992, (byte)103);
                final int[] array = dbTableType.types[write];
                int n5 = 0;
                int length = array.length;
                if (method1993 >= 0) {
                    if (method1993 >= length) {
                        throw new RuntimeException("Tuple index out-of-bounds. Requested: " + method1993 + ", Max: " + length);
                    }
                    n5 = method1993;
                    length = 1 + method1993;
                }
                Object[] columnType = method1994.getColumnType(write, (byte)(-36));
                if (columnType == null && dbTableType.defaultValues != null) {
                    columnType = dbTableType.defaultValues[write];
                }
                if (null == columnType) {
                    for (int i = n5; i < length; ++i) {
                        final int n6 = array[i];
                        if (class478.field4026 == class103.method639(n6, -246471951)) {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1486279633) * -2017760987 - 1] = "";
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1892947022 - 1] = GrandExchangeOfferUnitPriceComparator.compare_bridged(n6, -1010840875);
                        }
                    }
                    return 1;
                }
                final int n7 = columnType.length / array.length;
                if (n4 >= 0 && n4 < n7) {
                    for (int j = n5; j < length; ++j) {
                        final int n8 = j + n4 * array.length;
                        if (class478.field4026 == class103.method639(array[j], 1198103290)) {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 2005232297) * -2017760987 - 1] = (String)columnType[n8];
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)columnType[n8];
                        }
                    }
                    return 1;
                }
                throw new RuntimeException();
            }
            else {
                if (n == 7503) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    final int n9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                    final int n10 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                    int n11 = 0;
                    final int method1995 = class373.method1992(n10, (byte)106);
                    final int write2 = BufferedSink.write(n10, (byte)65);
                    final DbRowType method1996 = class125.method750(n9, -797894460);
                    final DbTableType dbTableType2 = GameBuild.getDbTableType(method1995, (byte)11);
                    final int[] array2 = dbTableType2.types[write2];
                    Object[] columnType2 = method1996.getColumnType(write2, (byte)(-6));
                    if (columnType2 == null && dbTableType2.defaultValues != null) {
                        columnType2 = dbTableType2.defaultValues[write2];
                    }
                    if (null != columnType2) {
                        n11 = columnType2.length / array2.length;
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1638322063 - 1] = n11;
                    return 1;
                }
                if (7504 != n && 1432031146 != n) {
                    if (1650345217 == n) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1070516652) * 1333286986 - 1] = 468764621 * class125.method750(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 514124536).tableId;
                        return 1;
                    }
                    if (n == 7506) {
                        final int n12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        int intValue = -1;
                        if (class9.field21 != null && n12 >= 0 && n12 < class9.field21.size()) {
                            intValue = class9.field21.get(n12);
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = intValue;
                        return 1;
                    }
                    if (7507 != n && 7509 != n) {
                        return 2;
                    }
                    final Object method1997 = ScriptEvent.method489(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1627318257) * -964267539], -2053497747);
                    final int n13 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 220094556) * -964267539];
                    final class482 method1998 = class206.method1147(n13, 1127097285);
                    if (method1998 == null) {
                        throw new RuntimeException();
                    }
                    if (class373.method1992(n13, (byte)103) != Client.field613 * -1334952277) {
                        throw new RuntimeException();
                    }
                    if (null == class9.field21 && class9.field21.isEmpty()) {
                        throw new RuntimeException();
                    }
                    final List method1999 = method1998.method2448(method1997, class146.method833(n13, 845716800), 812215804);
                    class9.field21 = new LinkedList(class9.field21);
                    if (method1999 != null) {
                        class9.field21.retainAll(method1999);
                    }
                    else {
                        class9.field21.clear();
                    }
                    class1.field4 = class9.field21.iterator();
                    if (n == 7507) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1742518768) * -508073112 - 1] = class9.field21.size();
                    }
                    return 1;
                }
                else {
                    Interpreter.Interpreter_intStackSize += 1033397314;
                    final int n14 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                    final class482 method2000 = class10.method40(n14, -89636537);
                    if (null == method2000) {
                        throw new RuntimeException();
                    }
                    class9.field21 = method2000.method2448(0, 0, 501138709);
                    int size = 0;
                    if (null != class9.field21) {
                        Client.field613 = 9538050 * n14;
                        class1.field4 = class9.field21.iterator();
                        size = class9.field21.size();
                    }
                    if (n == 7504) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 821855547) * -581987337 - 1] = size;
                    }
                    return 1;
                }
            }
        }
        else {
            final Object method2001 = ScriptEvent.method489(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 35003691) * -964267539], 1277361585);
            final int n15 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 539061169) * 1637227118];
            final class482 method2002 = class206.method1147(n15, 1127097285);
            if (null == method2002) {
                throw new RuntimeException();
            }
            class9.field21 = method2002.method2448(method2001, class146.method833(n15, 677911062), -1638328643);
            if (null != class9.field21) {
                Client.field613 = class373.method1992(n15, (byte)112) * 978308099;
                class1.field4 = class9.field21.iterator();
                if (7500 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 584942344 - 1] = class9.field21.size();
                }
            }
            else {
                Client.field613 = -1281746595;
                class1.field4 = null;
                if (n == -333049178) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
            }
            return 1;
        }
    }
    
    static int fa(final int n, final Script script, final boolean b) {
        if (n == 5630) {
            Client.logoutTimer = 719725026;
            return 1;
        }
        return 2;
    }
    
    static int ed(final int n, final Script script, final boolean b) {
        if (n == 3600) {
            if (World.friendSystem.field672 * -2037389757 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 161984736) * -2141442950 - 1] = 1073678015;
            }
            else if (World.friendSystem.field672 * -634040773 == 1) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1871032624) * 1034246251 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.friendsList.bm(1494879580);
            }
            return 1;
        }
        if (3601 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(983775007) && n2 >= 0 && n2 < World.friendSystem.friendsList.bm(-822913494)) {
                final Friend friend = (Friend)UserList.pn(World.friendSystem.friendsList, n2, 1029128706);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1075301019) * -387745842 - 1] = friend.bx(1575918076);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 672862435) * -956824066 - 1] = User.tg(friend, -43557433);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 40601878) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 3602) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -939631436];
            if (World.friendSystem.method420(43782570) && n3 >= 0 && n3 < World.friendSystem.friendsList.bm(-618691948)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1256145582) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n3, 259840147)).world * 177258591;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 880079420 - 1] = 0;
            }
            return 1;
        }
        if (3603 == n) {
            final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(1902885372) && n4 >= 0 && n4 < World.friendSystem.friendsList.bm(-783562648)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1674855235) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n4, 1260084004)).rank * 627403087;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 2113361351 - 1] = 0;
            }
            return 1;
        }
        if (3604 == n) {
            LoginScreenAnimation.method554(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1898259634) * 1821122707], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -965684134], (byte)(-33));
            return 1;
        }
        if (3605 == n) {
            World.friendSystem.addFriend(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)(-104));
            return 1;
        }
        if (3606 == n) {
            FriendSystem.ti(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 164825866) * 30874865], -1589464331);
            return 1;
        }
        if (n == 3607) {
            FriendSystem.zz(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -545487395], 42988923);
            return 1;
        }
        if (n == -1407339672) {
            World.friendSystem.removeIgnore(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 964669803) * -2017760987], true, (byte)(-6));
            return 1;
        }
        if (n == -1091577890) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 116182098) * -1800992322 - 1] = (World.friendSystem.isFriended(new Username(ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1630524978) * -2017760987], 1227239523), class70.loginType), false, (byte)19) ? 1 : 0);
            return 1;
        }
        if (n == 1377042611) {
            if (UserComparator5.friendsChat != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserComparator5.friendsChat.name;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 610704443) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 3612) {
            if (UserComparator5.friendsChat != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 352521676) * 540597010 - 1] = UserComparator5.friendsChat.bm(112654658);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == -427646968) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1537560153) * -964267539];
            if (null != UserComparator5.friendsChat && n5 < UserComparator5.friendsChat.bm(-573191423)) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 764419840) * 1940520629 - 1] = UserList.pn(UserComparator5.friendsChat, n5, 769181666).getUsername(473993579).getName(-710264960);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 350376817 - 1] = "";
            }
            return 1;
        }
        if (n == 3614) {
            final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 828686638) * -14923475];
            if (UserComparator5.friendsChat != null && n6 < UserComparator5.friendsChat.bm(-784565098)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1178411351 - 1] = Buddy.hn((Buddy)UserList.pn(UserComparator5.friendsChat, n6, 1168880522), -1663570541);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -634315770 - 1] = 0;
            }
            return 1;
        }
        if (3615 == n) {
            final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 773109919) * 1992322711];
            if (null != UserComparator5.friendsChat && n7 < UserComparator5.friendsChat.bm(775823014)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 274268902 - 1] = ((Buddy)UserList.pn(UserComparator5.friendsChat, n7, -732772834)).rank * -1663063742;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1386523996 - 1] = 0;
            }
            return 1;
        }
        if (-806043576 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((UserComparator5.friendsChat != null) ? UserComparator5.friendsChat.minKick : 0);
            return 1;
        }
        if (-1948609322 == n) {
            class478.clanKickUser(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * 1945989912], (byte)34);
            return 1;
        }
        if (3618 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1107720618 - 1] = ((UserComparator5.friendsChat != null) ? (-1364480833 * UserComparator5.friendsChat.rank) : 0);
            return 1;
        }
        if (3619 == n) {
            class379.Clan_joinChat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1325366909) * -2017760987], -249839766);
            return 1;
        }
        if (-59820868 == n) {
            WorldMapData_0.Clan_leaveChat(1691893373);
            return 1;
        }
        if (-853314652 == n) {
            if (!World.friendSystem.method420(-573796120)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1475119960 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.ignoreList.bm(1728930582);
            }
            return 1;
        }
        if (3622 == n) {
            final int n8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 28563393];
            if (World.friendSystem.method420(132984092) && n8 >= 0 && n8 < World.friendSystem.ignoreList.bm(-1357844449)) {
                final Ignored ignored = (Ignored)UserList.pn(World.friendSystem.ignoreList, n8, 297992146);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -930346493 - 1] = ignored.bx(-1413455833);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 772505160) * -2017760987 - 1] = User.tg(ignored, -43557433);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * 358262108 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (1970930464 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 880465221) * -964267539 - 1] = (World.friendSystem.isIgnored(new Username(ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1661001077) * -106034158], 1227239523), class70.loginType), -1546684739) ? 1 : 0);
            return 1;
        }
        if (n == 3624) {
            final int n9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1720822156) * -964267539];
            if (null != UserComparator5.friendsChat && n9 < UserComparator5.friendsChat.bm(1873474468) && UserList.pn(UserComparator5.friendsChat, n9, 778563620).getUsername(473993579).equals(MusicPatchNode.localPlayer.username)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1605925121) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -146569723 - 1] = 0;
            }
            return 1;
        }
        if (497888674 == n) {
            if (null != UserComparator5.friendsChat && UserComparator5.friendsChat.owner != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 911522606) * -2017760987 - 1] = UserComparator5.friendsChat.owner;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1947808480) * -965064130 - 1] = "";
            }
            return 1;
        }
        if (121836995 == n) {
            final int n10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n10 < UserComparator5.friendsChat.bm(299552977) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n10, 647778275)).isFriend(369466696)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 9524527) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3627 == n) {
            final int n11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 239515832) * -2117539890];
            if (UserComparator5.friendsChat != null && n11 < UserComparator5.friendsChat.bm(1474875538) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n11, 907776295)).isIgnored(818241268)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1298433390 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1396924035 - 1] = 0;
            }
            return 1;
        }
        if (n == 1420813188) {
            World.friendSystem.friendsList.ce(357528038);
            return 1;
        }
        if (n == 3629) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator1(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)67);
            return 1;
        }
        if (n == 218134425) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator2(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 906081760) * 875117112] == 1), (byte)112);
            return 1;
        }
        if (3631 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator3(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1622687923) * 1615301785] == 1), (byte)3);
            return 1;
        }
        if (n == 3632) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator4(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 511909497) * 1537410179] == 1), (byte)17);
            return 1;
        }
        if (n == -589341710) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator5(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)59);
            return 1;
        }
        if (-1401218752 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator6(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)80);
            return 1;
        }
        if (n == 3635) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator7(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1148574831) * -964267539] == 1), (byte)97);
            return 1;
        }
        if (n == 3636) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator8(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1514853027] == 1), (byte)72);
            return 1;
        }
        if (n == 3637) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator9(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 484160905) * -386113402] == 1), (byte)108);
            return 1;
        }
        if (2131154532 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator10(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)12);
            return 1;
        }
        if (n == -1830610673) {
            UserList.ge(World.friendSystem.friendsList, (byte)22);
            return 1;
        }
        if (817813357 == n) {
            World.friendSystem.ignoreList.ce(357528038);
            return 1;
        }
        if (n == -566565001) {
            World.friendSystem.ignoreList.ci((Comparator)new UserComparator1(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -830860883] == 1), (byte)118);
            return 1;
        }
        if (n == -1014392796) {
            World.friendSystem.ignoreList.ci((Comparator)new UserComparator2(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1393564751] == 1), (byte)59);
            return 1;
        }
        if (3643 == n) {
            UserList.ge(World.friendSystem.ignoreList, (byte)42);
            return 1;
        }
        if (3644 == n) {
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ce(357528038);
            }
            return 1;
        }
        if (3645 == n) {
            final boolean b2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 239984700) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator1(b2), (byte)118);
            }
            return 1;
        }
        if (3646 == n) {
            final boolean b3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 694225539) * -1991471804] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator2(b3), (byte)32);
            }
            return 1;
        }
        if (3647 == n) {
            final boolean b4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator3(b4), (byte)23);
            }
            return 1;
        }
        if (3648 == n) {
            final boolean b5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 253562137) * -11113521] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator4(b5), (byte)126);
            }
            return 1;
        }
        if (n == 3649) {
            final boolean b6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2112312492) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator5(b6), (byte)14);
            }
            return 1;
        }
        if (3650 == n) {
            final boolean b7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -738964005] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator6(b7), (byte)100);
            }
            return 1;
        }
        if (n == 3651) {
            final boolean b8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator7(b8), (byte)109);
            }
            return 1;
        }
        if (n == -880785862) {
            final boolean b9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 861459027) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator8(b9), (byte)126);
            }
            return 1;
        }
        if (3653 == n) {
            final boolean b10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1314358532) * -585446178] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator9(b10), (byte)100);
            }
            return 1;
        }
        if (684084475 == n) {
            final boolean b11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1640697844) * -1537180072] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator10(b11), (byte)20);
            }
            return 1;
        }
        if (n == -1877676502) {
            if (UserComparator5.friendsChat != null) {
                UserList.ge(UserComparator5.friendsChat, (byte)57);
            }
            return 1;
        }
        if (n == -430479889) {
            World.friendSystem.friendsList.ci((Comparator)new BuddyRankComparator(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1491115066) * -964267539] == 1), (byte)79);
            return 1;
        }
        if (3657 == n) {
            final boolean b12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1001510032] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new BuddyRankComparator(b12), (byte)25);
            }
            return 1;
        }
        return 2;
    }
    
    static int ea(final int n, final Script script, final boolean b) {
        if (n == 3200) {
            Interpreter.Interpreter_intStackSize += 287424093;
            class133.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -298431396], Interpreter.Interpreter_intStack[1 + -455329426 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1005681576 + 2], (byte)(-52));
            return 1;
        }
        if (n == 1561493972) {
            class1.playSong(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 805781978) * 1969845424], 1835431848);
            return 1;
        }
        if (n == 3202) {
            Interpreter.Interpreter_intStackSize += 440061788;
            CollisionMap.playJingle(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 2089866934], Interpreter.Interpreter_intStack[1433828259 * Interpreter.Interpreter_intStackSize + 1], 1287836101);
            return 1;
        }
        if (n == 3212 || 3213 == n || n == 3209 || n == 3181 || 53507832 == n || n == 3205 || 1164103094 == n) {
            class86 class86 = class86.field886;
            class85 class87 = class85.field872;
            int a = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 572178484) * -964267539];
            if (-225063599 == n) {
                final int i = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 195541511) * -964267539];
                class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i, (short)173);
                if (class86 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", i));
                }
            }
            if (n == 1683298868) {
                final int j = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class87 = (class85)StructComposition.findEnumerated(class121.method721(1906889871), j, (short)173);
                if (class87 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", j));
                }
            }
            if (n == 3209) {
                final int k = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), k, (short)173);
                if (null == class86) {
                    class87 = (class85)StructComposition.findEnumerated(class121.method721(2064003943), k, (short)173);
                    if (null == class87) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", k));
                    }
                }
            }
            else if (n == 586674395) {
                class86 = class86.field884;
            }
            else if (n == 3203) {
                class87 = class85.field877;
            }
            else if (3205 == n) {
                class87 = class85.field871;
            }
            else if (-469296618 == n) {
                class87 = class85.field874;
            }
            if (class85.field872 == class87) {
                switch (-2060299987 * class86.field887) {
                    case 3: {
                        class20.clientPreferences.method580(a, 2121058605);
                        break;
                    }
                    case 2: {
                        class20.clientPreferences.getTitleMusicDisabled(a, -527699713);
                        break;
                    }
                    case 4: {
                        if (a < 0) {
                            a = 0;
                        }
                        class20.clientPreferences.method587(a, (byte)(-75));
                        break;
                    }
                    case 5: {
                        ApproximateRouteStrategy.method359(a, 316467676);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", class86.toString()));
                    }
                    case 1: {
                        class20.clientPreferences.setIsUsernameHidden(a, 294875359);
                        break;
                    }
                }
            }
            else {
                switch (class87.field873 * 358560065) {
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", class87.toString()));
                    }
                    case 3: {
                        class130.method764(Math.round(127 * Math.min(Math.max(a, 0), 872867567) / 100.0f), -316825031);
                        break;
                    }
                    case 1: {
                        ClientPreferences.pb(class20.clientPreferences, a == 1, -1505559794);
                        break;
                    }
                    case 2: {
                        class86.method502(Math.round(59387489 * Math.min(Math.max(a, 0), 1087024681) / 100.0f), (byte)(-30));
                        break;
                    }
                    case 4: {
                        class135.method783(Math.round(-1698246821 * Math.min(Math.max(a, 0), 100) / 100.0f), (byte)0);
                        break;
                    }
                }
            }
            return 1;
        }
        if (n == 1576902733 || n == 3215 || 1947126412 == n || 3182 == n || n == 3204 || n == -1426696277 || -1025017993 == n) {
            class86 class88 = class86.field886;
            class85 class89 = class85.field872;
            if (627619500 == n) {
                final int l = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1996520699) * -964267539];
                class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), l, (short)173);
                if (class88 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", l));
                }
            }
            if (n == -1580689161) {
                final int m = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 104604756];
                class89 = (class85)StructComposition.findEnumerated(class121.method721(1876607026), m, (short)173);
                if (null == class89) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", m));
                }
            }
            if (1573550894 == n) {
                final int i2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1515224980) * 840549833];
                class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i2, (short)173);
                if (class88 == null) {
                    class89 = (class85)StructComposition.findEnumerated(class121.method721(2061029736), i2, (short)173);
                    if (class89 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", i2));
                    }
                }
            }
            else if (3182 == n) {
                class88 = class86.field884;
            }
            else if (n == 1746509590) {
                class89 = class85.field877;
            }
            else if (n == 3206) {
                class89 = class85.field871;
            }
            else if (n == 49724804) {
                class89 = class85.field874;
            }
            int n2 = 0;
            if (class89 == class85.field872) {
                switch (class88.field887 * -2060299987) {
                    case 3: {
                        n2 = (class20.clientPreferences.method562((short)8099) ? 1 : 0);
                        break;
                    }
                    case 5: {
                        n2 = class103.method636(-2091123816);
                        break;
                    }
                    case 2: {
                        n2 = (ClientPreferences.ss(class20.clientPreferences, -1197954221) ? 1 : 0);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", class88.toString()));
                    }
                    case 4: {
                        n2 = class20.clientPreferences.getCurrentMusicVolume(1671764667);
                        break;
                    }
                    case 1: {
                        n2 = (ClientPreferences.ty(class20.clientPreferences, -2117508400) ? 1 : 0);
                        break;
                    }
                }
            }
            else {
                switch (class89.field873 * 946310836) {
                    case 2: {
                        n2 = Math.round(ClientPreferences.xp(class20.clientPreferences, 1602230335) * 2083317335 / 255.0f);
                        break;
                    }
                    case 4: {
                        n2 = Math.round(261642770 * class20.clientPreferences.method573(-2017285046) / 127.0f);
                        break;
                    }
                    case 3: {
                        n2 = Math.round(ClientPreferences.setUsernameToRemember(class20.clientPreferences, 1356140340) * 608257414 / 127.0f);
                        break;
                    }
                    case 1: {
                        n2 = (class20.clientPreferences.getRoofsHidden(-2023044315) ? 1 : 0);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", class89.toString()));
                    }
                }
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1249192583) * -964267539 - 1] = n2;
            return 1;
        }
        if (344622715 == n) {
            return 1;
        }
        if (3216 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 912219063];
            int n4 = 0;
            final class86 class90 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), n3, (short)173);
            if (class90 != null) {
                n4 = ((class86.field886 != class90) ? 1 : 0);
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n4;
            return 1;
        }
        if (-511853533 == n) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1067994868) * -1004560273];
            int n6 = 0;
            final class85 class91 = (class85)StructComposition.findEnumerated(class121.method721(2042099991), n5, (short)173);
            if (class91 != null) {
                n6 = ((class91 != class85.field872) ? 1 : 0);
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -611464413 - 1] = n6;
            return 1;
        }
        if (1198254567 != n && n != -303223245) {
            return 2;
        }
        class86 field886 = class86.field886;
        class85 field887 = class85.field872;
        if (-2037428157 == n) {
            final int i3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1723969859) * -1955326894];
            field886 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i3, (short)173);
            if (null == field886) {
                throw new RuntimeException(String.format("Unrecognized device option %d", i3));
            }
        }
        if (n == 1522788777) {
            final int i4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -649224746];
            field887 = (class85)StructComposition.findEnumerated(class121.method721(1993079556), i4, (short)173);
            if (null == field887) {
                throw new RuntimeException(String.format("Unrecognized game option %d", i4));
            }
        }
        int n7 = 0;
        int n8 = 0;
        if (class85.field872 == field887) {
            switch (222081014 * field886.field887) {
                case 5: {
                    n7 = 0;
                    n8 = 622554425;
                    break;
                }
                default: {
                    throw new RuntimeException(String.format("Unkown device option: %s.", field886.toString()));
                }
                case 4: {
                    n7 = 0;
                    n8 = 404693642;
                    break;
                }
                case 1:
                case 2:
                case 3: {
                    n7 = 0;
                    n8 = 1;
                    break;
                }
            }
        }
        else {
            switch (358560065 * field887.field873) {
                case 2:
                case 3:
                case 4: {
                    n7 = 0;
                    n8 = 100;
                    break;
                }
                case 1: {
                    n7 = 0;
                    n8 = 1;
                    break;
                }
                default: {
                    throw new RuntimeException(String.format("Unkown game option: %s.", field887.toString()));
                }
            }
        }
        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1154877982 - 1] = n7;
        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n8;
        return 1;
    }
    
    static int fm(final int n, final Script script, final boolean b) {
        return 2;
    }
    
    static int fe(final int n, final Script script, final boolean b) {
        if (4100 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            return 1;
        }
        if (4101 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987] + Interpreter.Interpreter_stringStack[1 + -2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
            return 1;
        }
        if (n == 4102) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + KitDefinition.getModelData(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], true, (byte)16);
            return 1;
        }
        if (n == 4103) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toLowerCase();
            return 1;
        }
        if (4104 == n) {
            Interpreter.Interpreter_calendar.setTime(new Date((Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] + 11745L) * 86400000L));
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_calendar.get(5) + "-" + Interpreter.Interpreter_MONTHS[Interpreter.Interpreter_calendar.get(2)] + "-" + Interpreter.Interpreter_calendar.get(1);
            return 1;
        }
        if (4105 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
            final String s2 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            if (null != MusicPatchNode.localPlayer.appearance && 0 != 1693987821 * MusicPatchNode.localPlayer.appearance.npcTransformId) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s2;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s;
            }
            return 1;
        }
        if (4106 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Integer.toString(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (n == 4107) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BuddyRankComparator.method712(class16.compareStrings(Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1], ClanSettings.clientLanguage, 1929775046), -1723997839);
            return 1;
        }
        if (n == 4108) {
            final String s3 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class292.fo(new Font(class128.archive13.bh(Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 0, (byte)(-47))), s3, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539]);
            return 1;
        }
        if (n == 4109) {
            final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = AbstractFont.fa(new Font(class128.archive13.bh(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], 0, (byte)(-64))), s4, Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (n == 4110) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            final String s6 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s5;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s6;
            }
            return 1;
        }
        if (4111 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = AbstractFont.escapeBrackets(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987]);
            return 1;
        }
        if (4112 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + (char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            return 1;
        }
        if (n == 4113) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (VarcInt.isCharPrintable((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)67) ? 1 : 0);
            return 1;
        }
        if (n == 4114) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (MenuAction.isAlphaNumeric((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1819390761) ? 1 : 0);
            return 1;
        }
        if (4115 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class134.isCharAlphabetic((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)3) ? 1 : 0);
            return 1;
        }
        if (n == 4116) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class149.isDigit((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -841554253) ? 1 : 0);
            return 1;
        }
        if (n == 4117) {
            final String s7 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            if (null != s7) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = s7.length();
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (4118 == n) {
            final String s8 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s8.substring(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (4119 == n) {
            final String s9 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            final StringBuilder sb = new StringBuilder(s9.length());
            int n2 = 0;
            for (int i = 0; i < s9.length(); ++i) {
                final char char1 = s9.charAt(i);
                if ('<' == char1) {
                    n2 = 1;
                }
                else if (char1 == '>') {
                    n2 = 0;
                }
                else if (n2 == 0) {
                    sb.append(char1);
                }
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = sb.toString();
            return 1;
        }
        if (4120 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].indexOf(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (4121 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize].indexOf(Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (4122 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toUpperCase();
            return 1;
        }
        if (n != 4123) {
            return 2;
        }
        SecureRandomCallable.Interpreter_stringStackSize -= 1035313159;
        final String s10 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
        final String s11 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
        final String s12 = Interpreter.Interpreter_stringStack[2 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
        if (null == MusicPatchNode.localPlayer.appearance) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s12;
            return 1;
        }
        switch (-1004049459 * MusicPatchNode.localPlayer.appearance.field2840) {
            default: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s12;
                break;
            }
            case 0: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s10;
                break;
            }
            case 1: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s11;
                break;
            }
        }
        return 1;
    }
    
    static int fi(final int n, final Script script, final boolean b) {
        if (4100 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            return 1;
        }
        if (4101 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987] + Interpreter.Interpreter_stringStack[1 + -2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
            return 1;
        }
        if (n == 4102) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + KitDefinition.getModelData(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], true, (byte)16);
            return 1;
        }
        if (n == 4103) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toLowerCase();
            return 1;
        }
        if (4104 == n) {
            Interpreter.Interpreter_calendar.setTime(new Date((Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] + 11745L) * 86400000L));
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_calendar.get(5) + "-" + Interpreter.Interpreter_MONTHS[Interpreter.Interpreter_calendar.get(2)] + "-" + Interpreter.Interpreter_calendar.get(1);
            return 1;
        }
        if (4105 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
            final String s2 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            if (null != MusicPatchNode.localPlayer.appearance && 0 != 1693987821 * MusicPatchNode.localPlayer.appearance.npcTransformId) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s2;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s;
            }
            return 1;
        }
        if (4106 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Integer.toString(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (n == 4107) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BuddyRankComparator.method712(class16.compareStrings(Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1], ClanSettings.clientLanguage, 2037807975), -1723997839);
            return 1;
        }
        if (n == 4108) {
            final String s3 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class292.fo(new Font(class128.archive13.bh(Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 0, (byte)(-89))), s3, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539]);
            return 1;
        }
        if (n == 4109) {
            final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = AbstractFont.fa(new Font(class128.archive13.bh(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], 0, (byte)(-22))), s4, Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (n == 4110) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            final String s6 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s5;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s6;
            }
            return 1;
        }
        if (4111 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = AbstractFont.escapeBrackets(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987]);
            return 1;
        }
        if (4112 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + (char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            return 1;
        }
        if (n == 4113) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (VarcInt.isCharPrintable((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)59) ? 1 : 0);
            return 1;
        }
        if (n == 4114) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (MenuAction.isAlphaNumeric((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1848768805) ? 1 : 0);
            return 1;
        }
        if (4115 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class134.isCharAlphabetic((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)3) ? 1 : 0);
            return 1;
        }
        if (n == 4116) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class149.isDigit((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -578976588) ? 1 : 0);
            return 1;
        }
        if (n == 4117) {
            final String s7 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            if (null != s7) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = s7.length();
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (4118 == n) {
            final String s8 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s8.substring(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
            return 1;
        }
        if (4119 == n) {
            final String s9 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            final StringBuilder sb = new StringBuilder(s9.length());
            int n2 = 0;
            for (int i = 0; i < s9.length(); ++i) {
                final char char1 = s9.charAt(i);
                if ('<' == char1) {
                    n2 = 1;
                }
                else if (char1 == '>') {
                    n2 = 0;
                }
                else if (n2 == 0) {
                    sb.append(char1);
                }
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = sb.toString();
            return 1;
        }
        if (4120 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].indexOf(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (4121 == n) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize].indexOf(Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            return 1;
        }
        if (4122 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toUpperCase();
            return 1;
        }
        if (n != 4123) {
            return 2;
        }
        SecureRandomCallable.Interpreter_stringStackSize -= 1035313159;
        final String s10 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
        final String s11 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
        final String s12 = Interpreter.Interpreter_stringStack[2 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
        if (null == MusicPatchNode.localPlayer.appearance) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s12;
            return 1;
        }
        switch (-1004049459 * MusicPatchNode.localPlayer.appearance.field2840) {
            case 1: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s11;
                break;
            }
            case 0: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s10;
                break;
            }
            default: {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s12;
                break;
            }
        }
        return 1;
    }
    
    static int dx(final int n, final Script script, final boolean b) {
        if (1927 == n || n == 365675954) {
            if (-1673532319 * Interpreter.field703 >= 10) {
                throw new RuntimeException();
            }
            Widget vmethod3380;
            if (n >= -1162597771) {
                vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 665506671], (byte)5);
            }
            else {
                vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
            }
            if (vmethod3380.onResize == null) {
                return 0;
            }
            final ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.dragTarget = vmethod3380;
            scriptEvent.args = vmethod3380.onResize;
            scriptEvent.field859 = -807077198 + Interpreter.field703 * -1918981633;
            Client.scriptEvents.addFirst(scriptEvent);
            return 1;
        }
        else if (1928 == n) {
            final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 383599966) * -964267539];
            if (n2 >= 1 && n2 <= 10) {
                Interpreter.field690.add(new class97(n2, 1713081171 * widget.id, widget.childIndex * -384841784, widget.itemId * -2006098851));
                return 1;
            }
            throw new RuntimeException();
        }
        else {
            if (n != 1049498126) {
                return 2;
            }
            Interpreter.Interpreter_intStackSize -= 1281407919;
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 1741056056];
            final int n4 = Interpreter.Interpreter_intStack[-1881384951 * Interpreter.Interpreter_intStackSize + 1];
            final int n5 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -1423234998];
            if (n5 >= 1 && n5 <= 10) {
                Interpreter.field690.add(new class97(n5, n3, n4, class165.vmethod3380(n3, (byte)5).itemId * -2006098851));
                return 1;
            }
            throw new RuntimeException();
        }
    }
    
    static int dy(final int n, final Script script, final boolean b) {
        if (n == 2700) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1089138053) * -964267539 - 1] = -2006098851 * class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5).itemId;
            return 1;
        }
        if (n == 432163929) {
            final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1592350184) * 144977877], (byte)5);
            if (vmethod3380.itemId * -243676097 != -1) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 797575190) * 1629371106 - 1] = vmethod3380.itemQuantity * 1336975799;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 969967392) * -1234964943 - 1] = 0;
            }
            return 1;
        }
        if (245794908 == n) {
            if (null != Client.interfaceParents.at(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1462973954) * 1744599827])) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 523586301 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1262349477) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (2706 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -704541512 - 1] = Client.rootInterface * -1030749926;
            return 1;
        }
        if (2707 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 237905676 - 1] = (class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1800643075], (byte)5).method1807(1098558996) ? 1 : 0);
            return 1;
        }
        if (2708 == n) {
            return BufferedSource.method2214(class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1849182359], (byte)5), -481747654);
        }
        if (n == 2709) {
            return class4.method11(class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5), 1402462178);
        }
        return 2;
    }
    
    static int gg(final int n, final Script script, final boolean b) {
        if (7463 == n) {
            GrandExchangeOfferOwnWorldComparator.method365(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, -2009858192);
            return 1;
        }
        return 2;
    }
    
    static int fx(final int n, final Script script, final boolean b) {
        if (5306 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 245125849) * -1482192690 - 1] = GrandExchangeOfferNameComparator.getWindowedMode(1355864086);
            return 1;
        }
        if (5307 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (n2 == 1 || n2 == 2) {
                Decimator.setWindowedMode(n2, (byte)(-97));
            }
            return 1;
        }
        if (-1658546609 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class20.clientPreferences.method577((byte)106);
            return 1;
        }
        if (-611972648 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1947527648) * -550691636];
            if (n3 || n3 == 2) {
                ClientPreferences.uk(class20.clientPreferences, n3, 48605718);
            }
            return 1;
        }
        if (1049857322 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            return 1;
        }
        return 2;
    }
    
    static int fy(final int n, final Script script, final boolean b) {
        if (n == 5630) {
            Client.logoutTimer = 719725026;
            return 1;
        }
        return 2;
    }
    
    static int cm(final int n, final Script script, final boolean b) {
        if (n < -1141085479) {
            return LoginScreenAnimation.method547(n, script, b, -1798853209);
        }
        if (n < 1100) {
            return class131.method766(n, script, b, 1883190484);
        }
        if (n < 1200) {
            return class31.method135(n, script, b, (byte)(-106));
        }
        if (n < -1235526667) {
            return Varcs.clearTransient(n, script, b, 849004020);
        }
        if (n < 1400) {
            return StructComposition.method1070(n, script, b, -1418334453);
        }
        if (n < 1500) {
            return class121.method719(n, script, b, (byte)(-1));
        }
        if (n < 1600) {
            return class244.method1391(n, script, b, 6390717);
        }
        if (n < -264744504) {
            return AbstractUserComparator.method2166(n, script, b, -1203619480);
        }
        if (n < 877352089) {
            return DefaultsGroup.method2226(n, script, b, 1984408825);
        }
        if (n < 1097088179) {
            return Rasterizer3D.method1216(n, script, b, 1824710750);
        }
        if (n < 2000) {
            return class13.method48(n, script, b, (short)511);
        }
        if (n < 2100) {
            return class131.method766(n, script, b, 1883190484);
        }
        if (n < 2200) {
            return class31.method135(n, script, b, (byte)50);
        }
        if (n < 2300) {
            return Varcs.clearTransient(n, script, b, 1623748353);
        }
        if (n < 2400) {
            return StructComposition.method1070(n, script, b, -1390959069);
        }
        if (n < -1213471241) {
            return class121.method719(n, script, b, (byte)(-1));
        }
        if (n < -1250743161) {
            return class31.method134(n, script, b, (byte)105);
        }
        if (n < 2700) {
            return MouseHandler.method194(n, script, b, (byte)42);
        }
        if (n < 2800) {
            return SceneTilePaint.method1347(n, script, b, (byte)61);
        }
        if (n < 2900) {
            return class33.method147(n, script, b, -328074717);
        }
        if (n < 869994233) {
            return class13.method48(n, script, b, (short)511);
        }
        if (n < 3200) {
            return NetFileRequest.method1877(n, script, b, (byte)15);
        }
        if (n < 3300) {
            return ObjectComposition.method1094(n, script, b, (byte)6);
        }
        if (n < 3400) {
            return class130.method765(n, script, b, (byte)50);
        }
        if (n < 3500) {
            return class380.method2045(n, script, b, 1314384333);
        }
        if (n < -1977496166) {
            return HitSplatDefinition.method1081(n, script, b, (byte)1);
        }
        if (n < 3700) {
            return WorldMapAreaData.method1556(n, script, b, 1038224910);
        }
        if (n < -192578320) {
            return FloorOverlayDefinition.method1121(n, script, b, 2119595157);
        }
        if (n < 3900) {
            return class478.method2436(n, script, b, (byte)0);
        }
        if (n < 1897838602) {
            return class18.method69(n, script, b, 2006962449);
        }
        if (n < 4100) {
            return UserComparator3.method700(n, script, b, 578945019);
        }
        if (n < 4200) {
            return ApproximateRouteStrategy.method361(n, script, b, 16776960);
        }
        if (n < 4300) {
            return MusicPatchPcmStream.method1665(n, script, b, (byte)124);
        }
        if (n < 5100) {
            return UserComparator6.method714(n, script, b, (byte)(-58));
        }
        if (n < 1377563334) {
            return UserComparator4.method683(n, script, b, -2012857213);
        }
        if (n < 1745805059) {
            return TaskHandler.method949(n, script, b, -898403827);
        }
        if (n < -941603329) {
            return Client.method368(n, script, b, -128011180);
        }
        if (n < 904042817) {
            return class327.method1843(n, script, b, (byte)(-13));
        }
        if (n < -270291522) {
            return WorldMapArea.method1431(n, script, b, -1673483536);
        }
        if (n < 6700) {
            return MouseRecorder.method496(n, script, b, 182766822);
        }
        if (n < 6800) {
            return class282.method1590(n, script, b, -1071765846);
        }
        if (n < -1467898973) {
            return NetFileRequest.method1878(n, script, b, (short)(-560));
        }
        if (n < 1684816574) {
            return UserComparator7.method694(n, script, b, -680900253);
        }
        if (n < -1406174640) {
            return SoundSystem.method247(n, script, b, 2001743352);
        }
        if (n < 837814906) {
            return class163.method916(n, script, b, 485635278);
        }
        if (n < 7300) {
            return class16.method60(n, script, b, -2103319484);
        }
        if (n < -517023629) {
            return class126.method754(n, script, b, (short)(-9081));
        }
        if (n < -391182877) {
            return class144.method821(n, script, b, (byte)91);
        }
        if (n < 1510131283) {
            return FriendSystem.method425(n, script, b, -284388223);
        }
        return 2;
    }
    
    static int cg(final int n, final Script script, final boolean b) {
        if (747362585 == n) {
            Interpreter.Interpreter_intStackSize += 2065631421;
            final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -40305181];
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            final int n4 = Interpreter.Interpreter_intStack[-1922212754 * Interpreter.Interpreter_intStackSize + 2];
            if (n3 == 0) {
                throw new RuntimeException();
            }
            final Widget vmethod3380 = class165.vmethod3380(n2, (byte)5);
            if (null == vmethod3380.children) {
                vmethod3380.children = new Widget[1 + n4];
            }
            if (vmethod3380.children.length <= n4) {
                final Widget[] children = new Widget[1 + n4];
                for (int i = 0; i < vmethod3380.children.length; ++i) {
                    children[i] = vmethod3380.children[i];
                }
                vmethod3380.children = children;
            }
            if (n4 > 0 && vmethod3380.children[n4 - 1] == null) {
                throw new RuntimeException("" + (n4 - 1));
            }
            final Widget widget = new Widget();
            widget.type = n3 * -1183495331;
            final Widget widget2 = widget;
            final Widget widget3 = widget;
            final int id = 1 * vmethod3380.id;
            widget3.id = id;
            widget2.parentId = id * -1942978835;
            widget.childIndex = n4 * -1274125071;
            widget.modelOrthog = true;
            if (12 == n3) {
                widget.method1814((byte)0);
                widget.method1815((byte)(-29)).method1775(new class100(widget), -2004641536);
                widget.method1815((byte)(-11)).method1739(new class101(widget), -1866870049);
            }
            vmethod3380.children[n4] = widget;
            if (b) {
                SoundSystem.scriptDotWidget = widget;
            }
            else {
                class1.scriptActiveWidget = widget;
            }
            class144.invalidateWidget(vmethod3380, -1158925668);
            return 1;
        }
        else {
            if (n == -235304443) {
                final Widget widget4 = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
                final Widget vmethod3381 = class165.vmethod3380(-178295242 * widget4.id, (byte)5);
                vmethod3381.children[-1344986038 * widget4.childIndex] = null;
                class144.invalidateWidget(vmethod3381, -657810649);
                return 1;
            }
            if (102 == n) {
                final Widget vmethod3382 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 12815404) * 1792754238], (byte)5);
                vmethod3382.children = null;
                class144.invalidateWidget(vmethod3382, -585219212);
                return 1;
            }
            if (-1067957148 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1796613229];
                final int n6 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                final Widget widgetChild = SoundSystem.getWidgetChild(n5, n6, -1667464398);
                if (widgetChild != null && -1 != n6) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1883647642) * -1115467363 - 1] = 1;
                    if (b) {
                        SoundSystem.scriptDotWidget = widgetChild;
                    }
                    else {
                        class1.scriptActiveWidget = widgetChild;
                    }
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1550059029) * -964267539 - 1] = 0;
                }
                return 1;
            }
            if (-1230046353 == n) {
                final Widget vmethod3383 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 747511248) * -1083705532], (byte)5);
                if (null != vmethod3383) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1541375 - 1] = 1;
                    if (b) {
                        SoundSystem.scriptDotWidget = vmethod3383;
                    }
                    else {
                        class1.scriptActiveWidget = vmethod3383;
                    }
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1362342401 - 1] = 0;
                }
                return 1;
            }
            return 2;
        }
    }
    
    static int co(int n, final Script script, final boolean b) {
        int n2 = -1;
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            vmethod3380 = class165.vmethod3380(n2, (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (1100 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            if (vmethod3380.type * 883712245 == 12) {
                final class314 method1815 = vmethod3380.method1815((byte)78);
                if (method1815 != null && method1815.method1713(n3, n4, (byte)61)) {
                    class144.invalidateWidget(vmethod3380, -1858242850);
                }
            }
            else {
                vmethod3380.scrollX = 66597705 * n3;
                if (-1469632775 * vmethod3380.scrollX > -773060713 * vmethod3380.scrollWidth - vmethod3380.width * -794961409) {
                    vmethod3380.scrollX = vmethod3380.scrollWidth * 18431759 - vmethod3380.width * 460912311;
                }
                if (vmethod3380.scrollX * -1469632775 < 0) {
                    vmethod3380.scrollX = 0;
                }
                vmethod3380.scrollY = n4 * 946188063;
                if (vmethod3380.scrollY * 1223232735 > -1273374131 * vmethod3380.scrollHeight - 1473950221 * vmethod3380.height) {
                    vmethod3380.scrollY = vmethod3380.scrollHeight * 1941770835 - vmethod3380.height * 978547347;
                }
                if (vmethod3380.scrollY * 1223232735 < 0) {
                    vmethod3380.scrollY = 0;
                }
                class144.invalidateWidget(vmethod3380, -2080382467);
            }
            return 1;
        }
        if (n == 1101) {
            vmethod3380.color = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -1604768377;
            class144.invalidateWidget(vmethod3380, -1989609086);
            return 1;
        }
        if (1102 == n) {
            vmethod3380.noScrollThrough = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -1489551644);
            return 1;
        }
        if (1103 == n) {
            vmethod3380.transparencyTop = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1833148663;
            class144.invalidateWidget(vmethod3380, -1143149560);
            return 1;
        }
        if (n == 1104) {
            vmethod3380.lineWid = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1040382753;
            class144.invalidateWidget(vmethod3380, -1142441456);
            return 1;
        }
        if (1105 == n) {
            vmethod3380.spriteId2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -504605111;
            class144.invalidateWidget(vmethod3380, -1256644957);
            return 1;
        }
        if (1106 == n) {
            vmethod3380.spriteAngle = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 877496813;
            class144.invalidateWidget(vmethod3380, -586272147);
            return 1;
        }
        if (1107 == n) {
            vmethod3380.field2913 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -1219143788);
            return 1;
        }
        if (1108 == n) {
            vmethod3380.modelType = -1714481443;
            vmethod3380.modelId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 509431749;
            class144.invalidateWidget(vmethod3380, -1167922265);
            return 1;
        }
        if (1109 == n) {
            Interpreter.Interpreter_intStackSize += 1732151458;
            vmethod3380.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * 1759898391;
            vmethod3380.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] * 1163821709;
            vmethod3380.modelAngleX = -142910041 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
            vmethod3380.modelAngleY = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3] * -230241203;
            vmethod3380.modelAngleZ = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 4] * -1051718121;
            vmethod3380.modelZoom = Interpreter.Interpreter_intStack[5 + Interpreter.Interpreter_intStackSize * -964267539] * -467727501;
            class144.invalidateWidget(vmethod3380, -989702457);
            return 1;
        }
        if (n == 1110) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (-1526544909 * vmethod3380.sequenceId != n5) {
                vmethod3380.sequenceId = -1195025605 * n5;
                vmethod3380.modelFrame = 0;
                vmethod3380.modelFrameCycle = 0;
                class144.invalidateWidget(vmethod3380, -524561104);
            }
            return 1;
        }
        if (n == 1111) {
            vmethod3380.field2891 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -1339391048);
            return 1;
        }
        if (n == 1112) {
            final String field2916 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            if (!field2916.equals(vmethod3380.field2916)) {
                vmethod3380.field2916 = field2916;
                class144.invalidateWidget(vmethod3380, -1894344411);
            }
            return 1;
        }
        if (1113 == n) {
            vmethod3380.fontId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1858899927;
            if (883712245 * vmethod3380.type == 12) {
                final class314 method1816 = vmethod3380.method1815((byte)68);
                if (method1816 != null) {
                    class314.oe(method1816, -743599871);
                }
            }
            class144.invalidateWidget(vmethod3380, -1996441604);
            return 1;
        }
        if (n == 1114) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            if (12 == vmethod3380.type * 883712245) {
                final class314 method1817 = vmethod3380.method1815((byte)23);
                if (method1817 != null) {
                    method1817.method1714(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], 83127292);
                    method1817.method1715(Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539], 2102186529);
                }
            }
            else {
                vmethod3380.textXAlignment = 1612549297 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                vmethod3380.textYAlignment = -522107433 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                vmethod3380.textLineHeight = 2116078665 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            }
            class144.invalidateWidget(vmethod3380, -1213247391);
            return 1;
        }
        if (n == 1115) {
            vmethod3380.isIf3 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -610006014);
            return 1;
        }
        if (1116 == n) {
            vmethod3380.outline = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 646392503;
            class144.invalidateWidget(vmethod3380, -1742431778);
            return 1;
        }
        if (1117 == n) {
            vmethod3380.spriteShadow = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -140657215;
            class144.invalidateWidget(vmethod3380, -1527357421);
            return 1;
        }
        if (1118 == n) {
            vmethod3380.noClickThrough = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -1799881604);
            return 1;
        }
        if (n == 1119) {
            vmethod3380.textShadowed = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            class144.invalidateWidget(vmethod3380, -895324046);
            return 1;
        }
        if (1120 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            vmethod3380.scrollWidth = -1469650905 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            vmethod3380.scrollHeight = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] * -1357451643;
            class144.invalidateWidget(vmethod3380, -2093411125);
            if (n2 != -1 && 0 == vmethod3380.type * 883712245) {
                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)6);
            }
            return 1;
        }
        if (n == 1121) {
            class81.resumePauseWidget(1713081171 * vmethod3380.id, 55577617 * vmethod3380.childIndex, (short)5301);
            class144.invalidateWidget(Client.meslayerContinueWidget = vmethod3380, -880899424);
            return 1;
        }
        if (1122 == n) {
            vmethod3380.spriteId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1679014525;
            class144.invalidateWidget(vmethod3380, -859797729);
            return 1;
        }
        if (1123 == n) {
            vmethod3380.color2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 714852617;
            class144.invalidateWidget(vmethod3380, -1334260614);
            return 1;
        }
        if (n == 1124) {
            vmethod3380.transparencyBot = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -1159723969;
            class144.invalidateWidget(vmethod3380, -1915964644);
            return 1;
        }
        if (n == 1125) {
            final FillMode fillMode = (FillMode)StructComposition.findEnumerated(GrandExchangeOffer.method1928(-100447524), Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (short)173);
            if (fillMode != null) {
                vmethod3380.fillMode = fillMode;
                class144.invalidateWidget(vmethod3380, -981320044);
            }
            return 1;
        }
        if (n == 1126) {
            vmethod3380.isScrollBar = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        if (1127 == n) {
            vmethod3380.spriteFlipV = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        if (n == 1129) {
            vmethod3380.spellActionName = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            class144.invalidateWidget(vmethod3380, -907296769);
            return 1;
        }
        if (1130 == n) {
            vmethod3380.method1803(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], class14.urlRequester, Projectile.method450(449005443));
            return 1;
        }
        if (n == 1131) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            vmethod3380.method1824(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], (byte)86);
            return 1;
        }
        if (n == 1132) {
            vmethod3380.method1805(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1118133030);
            return 1;
        }
        if (n == 1133) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class309 method1818 = vmethod3380.method1817(-1740765458);
            if (method1818 != null) {
                method1818.field2817 = 202848117 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                class144.invalidateWidget(vmethod3380, -998905695);
            }
            return 1;
        }
        if (n == 1134) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class309 method1819 = vmethod3380.method1817(-1740765458);
            if (null != method1819) {
                method1819.field2818 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * -1464228981;
                class144.invalidateWidget(vmethod3380, -567392630);
            }
            return 1;
        }
        if (n == 1135) {
            SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
            if (null != vmethod3380.method1815((byte)(-90))) {
                vmethod3380.buttonText = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
            }
            return 1;
        }
        if (1136 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class309 method1820 = vmethod3380.method1817(-1740765458);
            if (method1820 != null) {
                method1820.field2816 = -1652794843 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                class144.invalidateWidget(vmethod3380, -1827007092);
            }
            return 1;
        }
        if (1137 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1821 = vmethod3380.method1815((byte)(-5));
            if (method1821 != null && method1821.method1711(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], 2072185236)) {
                class144.invalidateWidget(vmethod3380, -692141608);
            }
            return 1;
        }
        if (1138 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1822 = vmethod3380.method1815((byte)15);
            if (method1822 != null && method1822.method1719(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)16)) {
                class144.invalidateWidget(vmethod3380, -1194368328);
            }
            return 1;
        }
        if (n == 1139) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1823 = vmethod3380.method1815((byte)(-3));
            if (null != method1823 && method1823.method1712(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], -1030779135)) {
                class144.invalidateWidget(vmethod3380, -1548694913);
            }
            return 1;
        }
        if (n == 1140) {
            final boolean b2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            Client.field590.method1138((byte)(-35));
            final class314 method1824 = vmethod3380.method1815((byte)61);
            if (null != method1824 && method1824.method1706(b2, 1920640904)) {
                if (b2) {
                    Client.field590.method1137(vmethod3380, -310727032);
                }
                class144.invalidateWidget(vmethod3380, -1837431702);
            }
            return 1;
        }
        if (1141 == n) {
            final boolean b3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (!b3 && Client.field590.method1144((short)32767) == vmethod3380) {
                Client.field590.method1138((byte)(-61));
                class144.invalidateWidget(vmethod3380, -2134749259);
            }
            final class314 method1825 = vmethod3380.method1815((byte)(-14));
            if (method1825 != null) {
                method1825.method1707(b3, -879379465);
            }
            return 1;
        }
        if (1142 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final class314 method1826 = vmethod3380.method1815((byte)67);
            if (method1826 != null && method1826.method1725(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], (byte)19)) {
                class144.invalidateWidget(vmethod3380, -1688357952);
            }
            return 1;
        }
        if (n == 1143) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1827 = vmethod3380.method1815((byte)57);
            if (null != method1827 && method1827.method1725(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)19)) {
                class144.invalidateWidget(vmethod3380, -970012946);
            }
            return 1;
        }
        if (1144 == n) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1828 = vmethod3380.method1815((byte)29);
            if (method1828 != null) {
                method1828.method1717(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], 1775878387);
                class144.invalidateWidget(vmethod3380, -1892620021);
            }
            return 1;
        }
        if (n == 1145) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1829 = vmethod3380.method1815((byte)(-53));
            if (null != method1829) {
                method1829.method1705(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], -1559941485);
            }
            return 1;
        }
        if (n == 1146) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1830 = vmethod3380.method1815((byte)(-22));
            if (method1830 != null) {
                class314.method1733(method1830, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], (byte)71);
            }
            return 1;
        }
        if (n == 1147) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            final class314 method1831 = vmethod3380.method1815((byte)38);
            if (null != method1831) {
                method1831.method1718(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], (short)581);
                class144.invalidateWidget(vmethod3380, -1792608671);
            }
            return 1;
        }
        if (1148 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final class27 method1832 = vmethod3380.method1795(2141161470);
            if (null != method1832) {
                method1832.method114(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], (byte)0);
            }
            return 1;
        }
        if (1149 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final class27 method1833 = vmethod3380.method1795(2141684956);
            if (method1833 != null) {
                method1833.method115((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 48495477);
            }
            return 1;
        }
        if (1150 == n) {
            vmethod3380.method1802(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], class14.urlRequester, 554088678);
            return 1;
        }
        return 2;
    }
    
    static int fg(final int n, final Script script, final boolean b) {
        if (n == 6809) {
            final ObjectComposition vmethod3248 = class144.vmethod3248(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 143606619) * -1156085147], (short)23122);
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 2113369918) * 1869992354 - 1] = ((null != vmethod3248) ? vmethod3248.name : "");
            return 1;
        }
        return 2;
    }
    
    static int cy(int n, final Script script, final boolean b) {
        int n2 = -1;
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            vmethod3380 = class165.vmethod3380(n2, (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        if (n == 1000) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            vmethod3380.rawX = 1806877347 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            vmethod3380.rawY = 1231090287 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            vmethod3380.xAlignment = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539] * 1656805111;
            vmethod3380.yAlignment = Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize] * -362988363;
            class144.invalidateWidget(vmethod3380, -1670367926);
            ScriptFrame.client.alignWidget(vmethod3380, -929864295);
            if (n2 != -1 && 883712245 * vmethod3380.type == 0) {
                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)71);
            }
            return 1;
        }
        if (1001 == n) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            vmethod3380.rawWidth = -1495372107 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            vmethod3380.rawHeight = 1193771871 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            vmethod3380.widthAlignment = 387308049 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            vmethod3380.heightAlignment = -480958745 * Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize];
            class144.invalidateWidget(vmethod3380, -2046509542);
            ScriptFrame.client.alignWidget(vmethod3380, -2116390707);
            if (-1 != n2 && vmethod3380.type * 883712245 == 0) {
                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)50);
            }
            return 1;
        }
        if (1003 == n) {
            final boolean spriteTiling = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (spriteTiling != vmethod3380.spriteTiling) {
                vmethod3380.spriteTiling = spriteTiling;
                class144.invalidateWidget(vmethod3380, -1145793289);
            }
            return 1;
        }
        if (n == 1005) {
            vmethod3380.hasListener = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        if (n == 1006) {
            vmethod3380.prioritizeMenuEntry = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        return 2;
    }
    
    static int er(final int n, final Script script, final boolean b) {
        if (n == 1475647979) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 539834391 - 1] = (Client.keyHandlerInstance.getKeyPressed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1436223488) * -1048667216], -1188036063) ? 1 : 0);
            return 1;
        }
        if (n == -309310378) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Client.keyHandlerInstance.method1153(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1585347389) * -964267539], (byte)15) ? 1 : 0);
            return 1;
        }
        if (3502 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 526007755) * -1347859762 - 1] = (class207.ux(Client.keyHandlerInstance, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1556637445) ? 1 : 0);
            return 1;
        }
        return 2;
    }
    
    static int gy(final int n, final Script script, final boolean b) {
        return 2;
    }
    
    static void gw(final int n) {
        if (n == -1) {
            return;
        }
        if (!SoundSystem.loadInterface(n, 1376777516)) {
            return;
        }
        final Widget[] array = VerticalAlignment.Widget_interfaceComponents[n];
        for (int i = 0; i < array.length; ++i) {
            final Widget dragTarget = array[i];
            if (null != dragTarget.onLoad) {
                final ScriptEvent scriptEvent = new ScriptEvent();
                scriptEvent.dragTarget = dragTarget;
                scriptEvent.args = dragTarget.onLoad;
                PlayerType.runScript(scriptEvent, 5000000, 0, 2045482354);
            }
        }
    }
    
    static int gh(final int n, final Script script, final boolean b) {
        return 2;
    }
    
    static int eu(final int n, final Script script, final boolean b) {
        if (n == 3200) {
            Interpreter.Interpreter_intStackSize += 1772991714;
            class133.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -173028790 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1726563098 + 2], (byte)(-53));
            return 1;
        }
        if (n == -1657162956) {
            class1.playSong(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -2099977746], 630331423);
            return 1;
        }
        if (n == 3202) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            CollisionMap.playJingle(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * 1448525392], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 1287836101);
            return 1;
        }
        if (n == 3212 || 3213 == n || (n == 1823376036 || n == 3181) || -1426927896 == n || n == 1434051602 || 3207 == n) {
            class86 class86 = class86.field886;
            class85 class87 = class85.field872;
            int a = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -866673196];
            if (3212 == n) {
                final int i = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i, (short)173);
                if (class86 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", i));
                }
            }
            if (n == 3213) {
                final int j = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1341625843) * -964267539];
                class87 = (class85)StructComposition.findEnumerated(class121.method721(1947148969), j, (short)173);
                if (class87 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", j));
                }
            }
            if (n == 2087102964) {
                final int k = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1264103501) * -964267539];
                class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), k, (short)173);
                if (null == class86) {
                    class87 = (class85)StructComposition.findEnumerated(class121.method721(1865940047), k, (short)173);
                    if (null == class87) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", k));
                    }
                }
            }
            else if (n == -1492097959) {
                class86 = class86.field884;
            }
            else if (n == -470319215) {
                class87 = class85.field877;
            }
            else if (3205 == n) {
                class87 = class85.field871;
            }
            else if (3207 == n) {
                class87 = class85.field874;
            }
            if (class85.field872 == class87) {
                switch (1317234313 * class86.field887) {
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", class86.toString()));
                    }
                    case 1: {
                        class20.clientPreferences.setIsUsernameHidden(a, 914257254);
                        break;
                    }
                    case 5: {
                        ApproximateRouteStrategy.method359(a, -1571081262);
                        break;
                    }
                    case 3: {
                        class20.clientPreferences.method580(a, 2100418372);
                        break;
                    }
                    case 2: {
                        class20.clientPreferences.getTitleMusicDisabled(a, -527699713);
                        break;
                    }
                    case 4: {
                        if (a < 0) {
                            a = 0;
                        }
                        class20.clientPreferences.method587(a, (byte)70);
                        break;
                    }
                }
            }
            else {
                switch (class87.field873 * -1733622143) {
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", class87.toString()));
                    }
                    case 3: {
                        class130.method764(Math.round(1128461022 * Math.min(Math.max(a, 0), -13605993) / 100.0f), 1314577283);
                        break;
                    }
                    case 1: {
                        ClientPreferences.pb(class20.clientPreferences, a == 1, -1505559794);
                        break;
                    }
                    case 4: {
                        class135.method783(Math.round(127 * Math.min(Math.max(a, 0), -1686916978) / 100.0f), (byte)0);
                        break;
                    }
                    case 2: {
                        class86.method502(Math.round(255 * Math.min(Math.max(a, 0), 100) / 100.0f), (byte)(-42));
                        break;
                    }
                }
            }
            return 1;
        }
        if (n == 3214 || n == -1676445572 || -1970551894 == n || 3182 == n || n == 1446067970 || n == 3206 || 3208 == n) {
            class86 class88 = class86.field886;
            class85 class89 = class85.field872;
            if (1937675577 == n) {
                final int l = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1362797097];
                class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), l, (short)173);
                if (class88 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", l));
                }
            }
            if (n == 549304907) {
                final int m = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1254481547];
                class89 = (class85)StructComposition.findEnumerated(class121.method721(1784785807), m, (short)173);
                if (null == class89) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", m));
                }
            }
            if (3210 == n) {
                final int i2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2009845124) * 367734265];
                class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i2, (short)173);
                if (class88 == null) {
                    class89 = (class85)StructComposition.findEnumerated(class121.method721(1886636602), i2, (short)173);
                    if (class89 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", i2));
                    }
                }
            }
            else if (417105519 == n) {
                class88 = class86.field884;
            }
            else if (n == 3204) {
                class89 = class85.field877;
            }
            else if (n == 5614379) {
                class89 = class85.field871;
            }
            else if (n == 3208) {
                class89 = class85.field874;
            }
            int n2 = 0;
            if (class89 == class85.field872) {
                switch (class88.field887 * -2060299987) {
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", class88.toString()));
                    }
                    case 2: {
                        n2 = (ClientPreferences.ss(class20.clientPreferences, -1197954221) ? 1 : 0);
                        break;
                    }
                    case 1: {
                        n2 = (ClientPreferences.ty(class20.clientPreferences, -2095449959) ? 1 : 0);
                        break;
                    }
                    case 3: {
                        n2 = (class20.clientPreferences.method562((short)(-9403)) ? 1 : 0);
                        break;
                    }
                    case 4: {
                        n2 = class20.clientPreferences.getCurrentMusicVolume(1671764667);
                        break;
                    }
                    case 5: {
                        n2 = class103.method636(-1563737870);
                        break;
                    }
                }
            }
            else {
                switch (class89.field873 * 1374477122) {
                    case 1: {
                        n2 = (class20.clientPreferences.getRoofsHidden(-2040479959) ? 1 : 0);
                        break;
                    }
                    case 4: {
                        n2 = Math.round(-34850648 * class20.clientPreferences.method573(-2042447826) / 127.0f);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", class89.toString()));
                    }
                    case 2: {
                        n2 = Math.round(ClientPreferences.xp(class20.clientPreferences, -1584742494) * 100 / 255.0f);
                        break;
                    }
                    case 3: {
                        n2 = Math.round(ClientPreferences.setUsernameToRemember(class20.clientPreferences, 1738314965) * 100 / 127.0f);
                        break;
                    }
                }
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1796635010) * -789606732 - 1] = n2;
            return 1;
        }
        if (1648907770 == n) {
            return 1;
        }
        if (3216 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 854870624) * -964267539];
            int n4 = 0;
            final class86 class90 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), n3, (short)173);
            if (class90 != null) {
                n4 = ((class86.field886 != class90) ? 1 : 0);
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -1781862752 - 1] = n4;
            return 1;
        }
        if (-1789176328 == n) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1417291851) * 2065959954];
            int n6 = 0;
            final class85 class91 = (class85)StructComposition.findEnumerated(class121.method721(2049561547), n5, (short)173);
            if (class91 != null) {
                n6 = ((class91 != class85.field872) ? 1 : 0);
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n6;
            return 1;
        }
        if (3217 != n && n != 3219) {
            return 2;
        }
        class86 field886 = class86.field886;
        class85 field887 = class85.field872;
        if (1689101270 == n) {
            final int i3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 246013711) * -964267539];
            field886 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i3, (short)173);
            if (null == field886) {
                throw new RuntimeException(String.format("Unrecognized device option %d", i3));
            }
        }
        if (n == -634859143) {
            final int i4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1647141595) * -964267539];
            field887 = (class85)StructComposition.findEnumerated(class121.method721(1801019734), i4, (short)173);
            if (null == field887) {
                throw new RuntimeException(String.format("Unrecognized game option %d", i4));
            }
        }
        int n7 = 0;
        int n8 = 0;
        if (class85.field872 == field887) {
            switch (-2060299987 * field886.field887) {
                case 1:
                case 2:
                case 3: {
                    n7 = 0;
                    n8 = 1;
                    break;
                }
                default: {
                    throw new RuntimeException(String.format("Unkown device option: %s.", field886.toString()));
                }
                case 4: {
                    n7 = 0;
                    n8 = -1150954269;
                    break;
                }
                case 5: {
                    n7 = 0;
                    n8 = 100;
                    break;
                }
            }
        }
        else {
            switch (-209569117 * field887.field873) {
                case 2:
                case 3:
                case 4: {
                    n7 = 0;
                    n8 = 142931444;
                    break;
                }
                case 1: {
                    n7 = 0;
                    n8 = 1;
                    break;
                }
                default: {
                    throw new RuntimeException(String.format("Unkown game option: %s.", field887.toString()));
                }
            }
        }
        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 59636644) * -964267539 - 1] = n7;
        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n8;
        return 1;
    }
    
    public static void method427(final AbstractArchive objectDefinition_archive, final AbstractArchive objectDefinition_modelsArchive, final boolean objectDefinition_isLowDetail, final byte b) {
        try {
            ObjectComposition.ObjectDefinition_archive = objectDefinition_archive;
            class157.ObjectDefinition_modelsArchive = objectDefinition_modelsArchive;
            ObjectComposition.ObjectDefinition_isLowDetail = objectDefinition_isLowDetail;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cy.af(" + ')');
        }
    }
    
    static int gu(final int n, final Script script, final boolean b) {
        return 2;
    }
    
    static int cz(int n, final Script script, final boolean b) {
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        class144.invalidateWidget(vmethod3380, -1121762125);
        if (1200 == n || 1205 == n || 1212 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n3 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            vmethod3380.itemId = -1852876811 * n2;
            vmethod3380.itemQuantity = n3 * -568259577;
            final ItemComposition set = HealthBarUpdate.set(n2, (byte)99);
            vmethod3380.modelAngleX = 874786355 * set.xan2d;
            vmethod3380.modelAngleY = -2065246853 * set.yan2d;
            vmethod3380.modelAngleZ = set.zan2d * 745454881;
            vmethod3380.modelOffsetX = -183088313 * set.offsetX2d;
            vmethod3380.modelOffsetY = -347855449 * set.offsetY2d;
            vmethod3380.modelZoom = 1614948179 * set.zoom2d;
            if (n == 1205) {
                vmethod3380.itemQuantityMode = 0;
            }
            else if (n == 1212 | 1552863327 * set.isStackable == 1) {
                vmethod3380.itemQuantityMode = -761533221;
            }
            else {
                vmethod3380.itemQuantityMode = -1523066442;
            }
            if (vmethod3380.modelRotation * -289037969 > 0) {
                vmethod3380.modelZoom = -467727501 * (100808544 * vmethod3380.modelZoom / (vmethod3380.modelRotation * -289037969));
            }
            else if (-1960603747 * vmethod3380.rawWidth > 0) {
                vmethod3380.modelZoom = 100808544 * vmethod3380.modelZoom / (-1960603747 * vmethod3380.rawWidth) * -467727501;
            }
            return 1;
        }
        if (1201 == n) {
            vmethod3380.modelType = 866004410;
            vmethod3380.modelId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 509431749;
            return 1;
        }
        if (n == 1202) {
            vmethod3380.modelType = -848477033;
            vmethod3380.modelId = MusicPatchNode.localPlayer.appearance.getChatHeadId((short)(-14771)) * 509431749;
            return 1;
        }
        if (1207 == n) {
            SecureRandomCallable.method476(vmethod3380, MusicPatchNode.localPlayer.appearance, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, (short)7113);
            return 1;
        }
        if (1208 == n) {
            final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (vmethod3380.field2894 == null) {
                throw new RuntimeException("");
            }
            class282.method1591(vmethod3380, n4, -1723815129);
            return 1;
        }
        else if (n == 1209) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            final int n6 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            if (null == vmethod3380.field2894) {
                throw new RuntimeException("");
            }
            ChatChannel.method470(vmethod3380, n5, n6, -1074361306);
            return 1;
        }
        else {
            if (n != 1210) {
                return 2;
            }
            final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (vmethod3380.field2894 == null) {
                throw new RuntimeException("");
            }
            class162.method911(vmethod3380, 1693987821 * MusicPatchNode.localPlayer.appearance.npcTransformId, n7, (byte)(-43));
            return 1;
        }
    }
    
    static int dr(int n, final Script script, final boolean b) {
        Widget vmethod3380;
        if (n >= 2000) {
            n -= 1000;
            vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
        }
        else {
            vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
        }
        String substring = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
        int[] statTransmitTriggers = null;
        if (substring.length() > 0 && substring.charAt(substring.length() - 1) == 'Y') {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (n2 > 0) {
                statTransmitTriggers = new int[n2];
                while (n2-- > 0) {
                    statTransmitTriggers[n2] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                }
            }
            substring = substring.substring(0, substring.length() - 1);
        }
        Object[] field2824 = new Object[substring.length() + 1];
        for (int i = field2824.length - 1; i >= 1; --i) {
            if (substring.charAt(i - 1) == 's') {
                field2824[i] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            }
            else {
                field2824[i] = new Integer(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            }
        }
        final int value = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
        if (value != -1) {
            field2824[0] = new Integer(value);
        }
        else {
            field2824 = null;
        }
        if (1400 == n) {
            vmethod3380.onClick = field2824;
        }
        else if (n == 1401) {
            vmethod3380.onHold = field2824;
        }
        else if (n == 1402) {
            vmethod3380.onRelease = field2824;
        }
        else if (n == 1403) {
            vmethod3380.onMouseOver = field2824;
        }
        else if (1404 == n) {
            vmethod3380.onMouseLeave = field2824;
        }
        else if (1405 == n) {
            vmethod3380.onDrag = field2824;
        }
        else if (n == 1406) {
            vmethod3380.onTargetLeave = field2824;
        }
        else if (n == 1407) {
            vmethod3380.onVarTransmit = field2824;
            vmethod3380.varTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 1408) {
            vmethod3380.onTimer = field2824;
        }
        else if (n == 1409) {
            vmethod3380.onOp = field2824;
        }
        else if (n == 1410) {
            vmethod3380.onDragComplete = field2824;
        }
        else if (n == 1411) {
            vmethod3380.onClickRepeat = field2824;
        }
        else if (1412 == n) {
            vmethod3380.onMouseRepeat = field2824;
        }
        else if (n == 1414) {
            vmethod3380.onInvTransmit = field2824;
            vmethod3380.invTransmitTriggers = statTransmitTriggers;
        }
        else if (1415 == n) {
            vmethod3380.onStatTransmit = field2824;
            vmethod3380.statTransmitTriggers = statTransmitTriggers;
        }
        else if (n == 1416) {
            vmethod3380.onTargetEnter = field2824;
        }
        else if (n == 1417) {
            vmethod3380.onScroll = field2824;
        }
        else if (n == 1418) {
            vmethod3380.onChatTransmit = field2824;
        }
        else if (1419 == n) {
            vmethod3380.onKey = field2824;
        }
        else if (n == 1420) {
            vmethod3380.onFriendTransmit = field2824;
        }
        else if (1421 == n) {
            vmethod3380.onClanTransmit = field2824;
        }
        else if (1422 == n) {
            vmethod3380.onMiscTransmit = field2824;
        }
        else if (n == 1423) {
            vmethod3380.onDialogAbort = field2824;
        }
        else if (1424 == n) {
            vmethod3380.onSubChange = field2824;
        }
        else if (1425 == n) {
            vmethod3380.onStockTransmit = field2824;
        }
        else if (n == 1426) {
            vmethod3380.field2998 = field2824;
        }
        else if (n == 1427) {
            vmethod3380.onResize = field2824;
        }
        else if (1428 == n) {
            vmethod3380.field2946 = field2824;
        }
        else if (n == 1429) {
            vmethod3380.field2876 = field2824;
        }
        else if (n == 1430) {
            vmethod3380.field2988 = field2824;
        }
        else if (n == 1431) {
            vmethod3380.field2892 = field2824;
        }
        else if (n == 1434) {
            vmethod3380.field2961 = field2824;
        }
        else if (1435 == n) {
            vmethod3380.field2984 = field2824;
        }
        else {
            if (n < 1436 || n > 1439) {
                return 2;
            }
            final class312 method1818 = vmethod3380.method1818(-988547478);
            if (null != method1818) {
                if (n == 1436) {
                    method1818.field2821 = field2824;
                }
                else if (1437 == n) {
                    method1818.field2826 = field2824;
                }
                else if (n == 1438) {
                    method1818.field2825 = field2824;
                }
                else if (1439 == n) {
                    method1818.field2824 = field2824;
                }
            }
        }
        vmethod3380.field2978 = true;
        return 1;
    }
    
    static int ga(final int n, final Script script, final boolean b) {
        if (n != 1117974355 && n != 369925146) {
            if (7501 == n) {
                if (null != class1.field4 && class1.field4.hasNext()) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -311961988 - 1] = class1.field4.next();
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1523846960 - 1] = -1;
                }
                return 1;
            }
            if (n == 7502) {
                Interpreter.Interpreter_intStackSize -= 1281407919;
                final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n3 = Interpreter.Interpreter_intStack[1 + 556984805 * Interpreter.Interpreter_intStackSize];
                final int n4 = Interpreter.Interpreter_intStack[2 + -87289429 * Interpreter.Interpreter_intStackSize];
                final int method1992 = class373.method1992(n3, (byte)122);
                final int write = BufferedSink.write(n3, (byte)126);
                final int method1993 = class146.method833(n3, 2091840757);
                final DbRowType method1994 = class125.method750(n2, 914005882);
                final DbTableType dbTableType = GameBuild.getDbTableType(method1992, (byte)118);
                final int[] array = dbTableType.types[write];
                int n5 = 0;
                int length = array.length;
                if (method1993 >= 0) {
                    if (method1993 >= length) {
                        throw new RuntimeException("Tuple index out-of-bounds. Requested: " + method1993 + ", Max: " + length);
                    }
                    n5 = method1993;
                    length = 1 + method1993;
                }
                Object[] columnType = method1994.getColumnType(write, (byte)(-56));
                if (columnType == null && dbTableType.defaultValues != null) {
                    columnType = dbTableType.defaultValues[write];
                }
                if (null == columnType) {
                    for (int i = n5; i < length; ++i) {
                        final int n6 = array[i];
                        if (class478.field4026 == class103.method639(n6, -98718335)) {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2079078312) * -2111997971 - 1] = GrandExchangeOfferUnitPriceComparator.compare_bridged(n6, 1427303831);
                        }
                    }
                    return 1;
                }
                final int n7 = columnType.length / array.length;
                if (n4 < 0 || n4 >= n7) {
                    throw new RuntimeException();
                }
                for (int j = n5; j < length; ++j) {
                    final int n8 = j + n4 * array.length;
                    if (class478.field4026 == class103.method639(array[j], -101230377)) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = (String)columnType[n8];
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)columnType[n8];
                    }
                }
                return 1;
            }
            else {
                if (n == 951492596) {
                    Interpreter.Interpreter_intStackSize -= 1912709684;
                    final int n9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1125788216];
                    final int n10 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                    int n11 = 0;
                    final int method1995 = class373.method1992(n10, (byte)93);
                    final int write2 = BufferedSink.write(n10, (byte)37);
                    final DbRowType method1996 = class125.method750(n9, 1877668825);
                    final DbTableType dbTableType2 = GameBuild.getDbTableType(method1995, (byte)81);
                    final int[] array2 = dbTableType2.types[write2];
                    Object[] columnType2 = method1996.getColumnType(write2, (byte)(-118));
                    if (columnType2 == null && dbTableType2.defaultValues != null) {
                        columnType2 = dbTableType2.defaultValues[write2];
                    }
                    if (null != columnType2) {
                        n11 = columnType2.length / array2.length;
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 347897718) * -964267539 - 1] = n11;
                    return 1;
                }
                if (-2088463179 == n || -257515223 == n) {
                    Interpreter.Interpreter_intStackSize -= 427135973;
                    final int n12 = Interpreter.Interpreter_intStack[-1711372950 * Interpreter.Interpreter_intStackSize];
                    final class482 method1997 = class10.method40(n12, 26857088);
                    if (null == method1997) {
                        throw new RuntimeException();
                    }
                    class9.field21 = method1997.method2448(0, 0, -99591800);
                    int size = 0;
                    if (null != class9.field21) {
                        Client.field613 = -507612710 * n12;
                        class1.field4 = class9.field21.iterator();
                        size = class9.field21.size();
                    }
                    if (n == -230224070) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 781555839) * -964267539 - 1] = size;
                    }
                    return 1;
                }
                else {
                    if (7505 == n) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 793932278) * -964267539 - 1] = 468764621 * class125.method750(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1005612463).tableId;
                        return 1;
                    }
                    if (n == 389422112) {
                        final int n13 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        int intValue = -1;
                        if (class9.field21 != null && n13 >= 0 && n13 < class9.field21.size()) {
                            intValue = class9.field21.get(n13);
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 762028439) * 1942756581 - 1] = intValue;
                        return 1;
                    }
                    if (7507 != n && 2027931596 != n) {
                        return 2;
                    }
                    final Object method1998 = ScriptEvent.method489(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1475444848], 1470526038);
                    final int n14 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1800737949) * -964267539];
                    final class482 method1999 = class206.method1147(n14, 1127097285);
                    if (method1999 == null) {
                        throw new RuntimeException();
                    }
                    if (class373.method1992(n14, (byte)81) != Client.field613 * -1334952277) {
                        throw new RuntimeException();
                    }
                    if (null == class9.field21 && class9.field21.isEmpty()) {
                        throw new RuntimeException();
                    }
                    final List method2000 = method1999.method2448(method1998, class146.method833(n14, 888308616), -1895376351);
                    class9.field21 = new LinkedList(class9.field21);
                    if (method2000 != null) {
                        class9.field21.retainAll(method2000);
                    }
                    else {
                        class9.field21.clear();
                    }
                    class1.field4 = class9.field21.iterator();
                    if (n == -465069174) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -475673270 - 1] = class9.field21.size();
                    }
                    return 1;
                }
            }
        }
        else {
            final Object method2001 = ScriptEvent.method489(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 2106100065) * -964267539], -239762481);
            final int n15 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1471622010) * -964267539];
            final class482 method2002 = class206.method1147(n15, 1127097285);
            if (null == method2002) {
                throw new RuntimeException();
            }
            class9.field21 = method2002.method2448(method2001, class146.method833(n15, 921536578), -1974334325);
            if (null != class9.field21) {
                Client.field613 = class373.method1992(n15, (byte)112) * -787722344;
                class1.field4 = class9.field21.iterator();
                if (7500 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -122731419 - 1] = class9.field21.size();
                }
            }
            else {
                Client.field613 = -978308099;
                class1.field4 = null;
                if (n == 7500) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 166055782) * -964267539 - 1] = 0;
                }
            }
            return 1;
        }
    }
    
    static int ep(final int n, final Script script, final boolean b) {
        final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
        if (2800 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.method1052(KeyHandler.getWidgetFlags(vmethod3380, 1290845519), 1281102121);
            return 1;
        }
        if (n == 2801) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            --n2;
            if (vmethod3380.actions != null && n2 < vmethod3380.actions.length && null != vmethod3380.actions[n2]) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.actions[n2];
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (2802 == n) {
            if (null == vmethod3380.field3004) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.field3004;
            }
            return 1;
        }
        return 2;
    }
    
    static int dg(final Widget widget) {
        if (883712245 * widget.type != 11) {
            SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            return 1;
        }
        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.method1804(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1767790482);
        return 1;
    }
    
    static int fu(final int n, final Script script, final boolean b) {
        if (n == 7108) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (ByteArrayPool.method2091(1533891563) ? 1 : 0);
            return 1;
        }
        return 2;
    }
    
    static int eg(final int n, final Script script, final boolean b) {
        if (n == -697653170) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1385783800) * -964267539 - 1] = (Client.keyHandlerInstance.getKeyPressed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1665376022) * 1717340763], -930242398) ? 1 : 0);
            return 1;
        }
        if (n == 1304489890) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Client.keyHandlerInstance.method1153(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)67) ? 1 : 0);
            return 1;
        }
        if (773627686 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 608334749) * -730722442 - 1] = (class207.ux(Client.keyHandlerInstance, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1984622471) * -1261846281], 1556637445) ? 1 : 0);
            return 1;
        }
        return 2;
    }
    
    static int ew(final int n, final Script script, final boolean b) {
        if (n == 3600) {
            if (World.friendSystem.field672 * -1736413869 == 0) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2;
            }
            else if (World.friendSystem.field672 * -1736413869 == 1) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.friendsList.bm(-23392429);
            }
            return 1;
        }
        if (3601 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(201744303) && n2 >= 0 && n2 < World.friendSystem.friendsList.bm(-867584754)) {
                final Friend friend = (Friend)UserList.pn(World.friendSystem.friendsList, n2, 1522438772);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = friend.bx(1386634335);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = User.tg(friend, -43557433);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 3602) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(-323266022) && n3 >= 0 && n3 < World.friendSystem.friendsList.bm(1277290336)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n3, 1314203614)).world * 177258591;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3603 == n) {
            final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(11149961) && n4 >= 0 && n4 < World.friendSystem.friendsList.bm(-1344456655)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n4, -622278240)).rank * 1922414955;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3604 == n) {
            LoginScreenAnimation.method554(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-62));
            return 1;
        }
        if (3605 == n) {
            World.friendSystem.addFriend(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)(-45));
            return 1;
        }
        if (3606 == n) {
            FriendSystem.ti(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -1128873963);
            return 1;
        }
        if (n == 3607) {
            FriendSystem.zz(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 42988923);
            return 1;
        }
        if (n == 3608) {
            World.friendSystem.removeIgnore(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], true, (byte)64);
            return 1;
        }
        if (n == 3609) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (World.friendSystem.isFriended(new Username(ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1227239523), class70.loginType), false, (byte)(-51)) ? 1 : 0);
            return 1;
        }
        if (n == 3611) {
            if (UserComparator5.friendsChat != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserComparator5.friendsChat.name;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 3612) {
            if (UserComparator5.friendsChat != null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = UserComparator5.friendsChat.bm(1563945307);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3613) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n5 < UserComparator5.friendsChat.bm(-1465217087)) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserList.pn(UserComparator5.friendsChat, n5, -29804144).getUsername(473993579).getName(-710264960);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (n == 3614) {
            final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (UserComparator5.friendsChat != null && n6 < UserComparator5.friendsChat.bm(-2000022275)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Buddy.hn((Buddy)UserList.pn(UserComparator5.friendsChat, n6, -487461579), -1207732857);
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3615 == n) {
            final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n7 < UserComparator5.friendsChat.bm(1513430510)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(UserComparator5.friendsChat, n7, 651449121)).rank * 1922414955;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3616 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((UserComparator5.friendsChat != null) ? UserComparator5.friendsChat.minKick : 0);
            return 1;
        }
        if (3617 == n) {
            class478.clanKickUser(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)32);
            return 1;
        }
        if (3618 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((UserComparator5.friendsChat != null) ? (1788650387 * UserComparator5.friendsChat.rank) : 0);
            return 1;
        }
        if (3619 == n) {
            class379.Clan_joinChat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 676373891);
            return 1;
        }
        if (3620 == n) {
            WorldMapData_0.Clan_leaveChat(1670792496);
            return 1;
        }
        if (3621 == n) {
            if (!World.friendSystem.method420(1745668131)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.ignoreList.bm(1824459671);
            }
            return 1;
        }
        if (3622 == n) {
            final int n8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.method420(-1914580877) && n8 >= 0 && n8 < World.friendSystem.ignoreList.bm(1728767317)) {
                final Ignored ignored = (Ignored)UserList.pn(World.friendSystem.ignoreList, n8, -290239516);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ignored.bx(499461480);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = User.tg(ignored, -43557433);
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (3623 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (World.friendSystem.isIgnored(new Username(ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1227239523), class70.loginType), 941922298) ? 1 : 0);
            return 1;
        }
        if (n == 3624) {
            final int n9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n9 < UserComparator5.friendsChat.bm(-1519128935) && UserList.pn(UserComparator5.friendsChat, n9, 733614612).getUsername(473993579).equals(MusicPatchNode.localPlayer.username)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3625 == n) {
            if (null != UserComparator5.friendsChat && UserComparator5.friendsChat.owner != null) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserComparator5.friendsChat.owner;
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (3626 == n) {
            final int n10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (null != UserComparator5.friendsChat && n10 < UserComparator5.friendsChat.bm(366477625) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n10, 47573784)).isFriend(1709299576)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3627 == n) {
            final int n11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (UserComparator5.friendsChat != null && n11 < UserComparator5.friendsChat.bm(950239313) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n11, 723360331)).isIgnored(-2115342166)) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3628) {
            World.friendSystem.friendsList.ce(357528038);
            return 1;
        }
        if (n == 3629) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator1(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)96);
            return 1;
        }
        if (n == 3630) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator2(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)14);
            return 1;
        }
        if (3631 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator3(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)56);
            return 1;
        }
        if (n == 3632) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator4(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)113);
            return 1;
        }
        if (n == 3633) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator5(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)31);
            return 1;
        }
        if (3634 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator6(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)99);
            return 1;
        }
        if (n == 3635) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator7(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)21);
            return 1;
        }
        if (n == 3636) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator8(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)18);
            return 1;
        }
        if (n == 3637) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator9(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)59);
            return 1;
        }
        if (3638 == n) {
            World.friendSystem.friendsList.ci((Comparator)new UserComparator10(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)123);
            return 1;
        }
        if (n == 3639) {
            UserList.ge(World.friendSystem.friendsList, (byte)48);
            return 1;
        }
        if (3640 == n) {
            World.friendSystem.ignoreList.ce(357528038);
            return 1;
        }
        if (n == 3641) {
            World.friendSystem.ignoreList.ci((Comparator)new UserComparator1(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)25);
            return 1;
        }
        if (n == 3642) {
            World.friendSystem.ignoreList.ci((Comparator)new UserComparator2(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)86);
            return 1;
        }
        if (3643 == n) {
            UserList.ge(World.friendSystem.ignoreList, (byte)(-13));
            return 1;
        }
        if (3644 == n) {
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ce(357528038);
            }
            return 1;
        }
        if (3645 == n) {
            final boolean b2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator1(b2), (byte)126);
            }
            return 1;
        }
        if (3646 == n) {
            final boolean b3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator2(b3), (byte)71);
            }
            return 1;
        }
        if (3647 == n) {
            final boolean b4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator3(b4), (byte)121);
            }
            return 1;
        }
        if (3648 == n) {
            final boolean b5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator4(b5), (byte)19);
            }
            return 1;
        }
        if (n == 3649) {
            final boolean b6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator5(b6), (byte)70);
            }
            return 1;
        }
        if (3650 == n) {
            final boolean b7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator6(b7), (byte)91);
            }
            return 1;
        }
        if (n == 3651) {
            final boolean b8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator7(b8), (byte)28);
            }
            return 1;
        }
        if (n == 3652) {
            final boolean b9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator8(b9), (byte)76);
            }
            return 1;
        }
        if (3653 == n) {
            final boolean b10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator9(b10), (byte)89);
            }
            return 1;
        }
        if (3654 == n) {
            final boolean b11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (UserComparator5.friendsChat != null) {
                UserComparator5.friendsChat.ci((Comparator)new UserComparator10(b11), (byte)24);
            }
            return 1;
        }
        if (n == 3655) {
            if (UserComparator5.friendsChat != null) {
                UserList.ge(UserComparator5.friendsChat, (byte)97);
            }
            return 1;
        }
        if (n == 3656) {
            World.friendSystem.friendsList.ci((Comparator)new BuddyRankComparator(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)39);
            return 1;
        }
        if (3657 == n) {
            final boolean b12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != UserComparator5.friendsChat) {
                UserComparator5.friendsChat.ci((Comparator)new BuddyRankComparator(b12), (byte)93);
            }
            return 1;
        }
        return 2;
    }
    
    static int ej(final int n, final Script script, final boolean b) {
        if (n == 1645054654) {
            Interpreter.Interpreter_intStackSize += 1377284964;
            class133.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -58797977], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -1717044797 + 2], (byte)(-91));
            return 1;
        }
        if (n == -1843185231) {
            class1.playSong(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1604008092], -78117502);
            return 1;
        }
        if (n == 689564642) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            CollisionMap.playJingle(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 1287836101);
            return 1;
        }
        if (n == 3212 || -154814872 == n || n == 3209 || n == 3181 || 2058497580 == n || n == -491102802 || 3207 == n) {
            class86 class86 = class86.field886;
            class85 class87 = class85.field872;
            int a = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -156250657];
            if (3212 == n) {
                final int i = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -2050400622];
                class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i, (short)173);
                if (class86 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", i));
                }
            }
            if (n == 3213) {
                final int j = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1859396519];
                class87 = (class85)StructComposition.findEnumerated(class121.method721(1847370592), j, (short)173);
                if (class87 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", j));
                }
            }
            if (n == 3209) {
                final int k = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -776919776];
                class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), k, (short)173);
                if (null == class86) {
                    class87 = (class85)StructComposition.findEnumerated(class121.method721(1914007803), k, (short)173);
                    if (null == class87) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", k));
                    }
                }
            }
            else if (n == -319956192) {
                class86 = class86.field884;
            }
            else if (n == 3203) {
                class87 = class85.field877;
            }
            else if (3205 == n) {
                class87 = class85.field871;
            }
            else if (3207 == n) {
                class87 = class85.field874;
            }
            if (class85.field872 == class87) {
                switch (-1031904943 * class86.field887) {
                    case 5: {
                        ApproximateRouteStrategy.method359(a, -344862876);
                        break;
                    }
                    case 4: {
                        if (a < 0) {
                            a = 0;
                        }
                        class20.clientPreferences.method587(a, (byte)(-14));
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", class86.toString()));
                    }
                    case 3: {
                        class20.clientPreferences.method580(a, 2134535793);
                        break;
                    }
                    case 2: {
                        class20.clientPreferences.getTitleMusicDisabled(a, -527699713);
                        break;
                    }
                    case 1: {
                        class20.clientPreferences.setIsUsernameHidden(a, -1123778671);
                        break;
                    }
                }
            }
            else {
                switch (class87.field873 * 358560065) {
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", class87.toString()));
                    }
                    case 3: {
                        class130.method764(Math.round(880933778 * Math.min(Math.max(a, 0), -2138052399) / 100.0f), 488664558);
                        break;
                    }
                    case 4: {
                        class135.method783(Math.round(1384559663 * Math.min(Math.max(a, 0), 1847178202) / 100.0f), (byte)0);
                        break;
                    }
                    case 1: {
                        ClientPreferences.pb(class20.clientPreferences, a == 1, -1505559794);
                        break;
                    }
                    case 2: {
                        class86.method502(Math.round(-1694527849 * Math.min(Math.max(a, 0), 100) / 100.0f), (byte)(-29));
                        break;
                    }
                }
            }
            return 1;
        }
        if (n == 439916202 || n == 3215 || 3210 == n || 3182 == n || n == 3204 || n == -512426387 || -569312563 == n) {
            class86 class88 = class86.field886;
            class85 class89 = class85.field872;
            if (3214 == n) {
                final int l = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 483279129) * 389038547];
                class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), l, (short)173);
                if (class88 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", l));
                }
            }
            if (n == -2056873555) {
                final int m = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class89 = (class85)StructComposition.findEnumerated(class121.method721(1722040618), m, (short)173);
                if (null == class89) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", m));
                }
            }
            if (532918650 == n) {
                final int i2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1028695538) * -964267539];
                class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i2, (short)173);
                if (class88 == null) {
                    class89 = (class85)StructComposition.findEnumerated(class121.method721(1978781088), i2, (short)173);
                    if (class89 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", i2));
                    }
                }
            }
            else if (3182 == n) {
                class88 = class86.field884;
            }
            else if (n == 842182839) {
                class89 = class85.field877;
            }
            else if (n == 1432547823) {
                class89 = class85.field871;
            }
            else if (n == 3208) {
                class89 = class85.field874;
            }
            int n2 = 0;
            if (class89 == class85.field872) {
                switch (class88.field887 * -576255770) {
                    case 4: {
                        n2 = class20.clientPreferences.getCurrentMusicVolume(1671764667);
                        break;
                    }
                    case 2: {
                        n2 = (ClientPreferences.ss(class20.clientPreferences, -1197954221) ? 1 : 0);
                        break;
                    }
                    case 5: {
                        n2 = class103.method636(-1270742399);
                        break;
                    }
                    case 3: {
                        n2 = (class20.clientPreferences.method562((short)(-12487)) ? 1 : 0);
                        break;
                    }
                    case 1: {
                        n2 = (ClientPreferences.ty(class20.clientPreferences, -2113756917) ? 1 : 0);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", class88.toString()));
                    }
                }
            }
            else {
                switch (class89.field873 * 358560065) {
                    case 1: {
                        n2 = (class20.clientPreferences.getRoofsHidden(-2090576313) ? 1 : 0);
                        break;
                    }
                    case 4: {
                        n2 = Math.round(100 * class20.clientPreferences.method573(-1928937798) / 127.0f);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", class89.toString()));
                    }
                    case 3: {
                        n2 = Math.round(ClientPreferences.setUsernameToRemember(class20.clientPreferences, 1876856370) * 100 / 127.0f);
                        break;
                    }
                    case 2: {
                        n2 = Math.round(ClientPreferences.xp(class20.clientPreferences, 1097414711) * 100 / 255.0f);
                        break;
                    }
                }
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1215318803 - 1] = n2;
            return 1;
        }
        if (3211 == n) {
            return 1;
        }
        if (542552193 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            int n4 = 0;
            final class86 class90 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), n3, (short)173);
            if (class90 != null) {
                n4 = ((class86.field886 != class90) ? 1 : 0);
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 501908560 - 1] = n4;
            return 1;
        }
        if (3218 == n) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -1105695870];
            int n6 = 0;
            final class85 class91 = (class85)StructComposition.findEnumerated(class121.method721(1722261846), n5, (short)173);
            if (class91 != null) {
                n6 = ((class91 != class85.field872) ? 1 : 0);
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n6;
            return 1;
        }
        if (3217 == n || n == -1785423846) {
            class86 field886 = class86.field886;
            class85 field887 = class85.field872;
            if (3217 == n) {
                final int i3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 40983295) * -964267539];
                field886 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i3, (short)173);
                if (null == field886) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", i3));
                }
            }
            if (n == -634556326) {
                final int i4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1103260725) * -964267539];
                field887 = (class85)StructComposition.findEnumerated(class121.method721(1771237837), i4, (short)173);
                if (null == field887) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", i4));
                }
            }
            int n7 = 0;
            int n8 = 0;
            if (class85.field872 == field887) {
                switch (-2060299987 * field886.field887) {
                    case 1:
                    case 2:
                    case 3: {
                        n7 = 0;
                        n8 = 1;
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", field886.toString()));
                    }
                    case 4: {
                        n7 = 0;
                        n8 = Integer.MAX_VALUE;
                        break;
                    }
                    case 5: {
                        n7 = 0;
                        n8 = 100;
                        break;
                    }
                }
            }
            else {
                switch (-1807369877 * field887.field873) {
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", field887.toString()));
                    }
                    case 2:
                    case 3:
                    case 4: {
                        n7 = 0;
                        n8 = 100;
                        break;
                    }
                    case 1: {
                        n7 = 0;
                        n8 = 1;
                        break;
                    }
                }
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 1944809166) * -964267539 - 1] = n7;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1038409824) * -964267539 - 1] = n8;
            return 1;
        }
        return 2;
    }
    
    static int dd(final int n, final Script script, final boolean b) {
        if (1927 != n && n != 2927) {
            if (1928 == n) {
                final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
                final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                if (n2 < 1 || n2 > 10) {
                    throw new RuntimeException();
                }
                Interpreter.field690.add(new class97(n2, 1713081171 * widget.id, widget.childIndex * 55577617, widget.itemId * -2006098851));
                return 1;
            }
            else {
                if (n != 2928) {
                    return 2;
                }
                Interpreter.Interpreter_intStackSize -= 1281407919;
                final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                final int n5 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                if (n5 >= 1 && n5 <= 10) {
                    Interpreter.field690.add(new class97(n5, n3, n4, class165.vmethod3380(n3, (byte)5).itemId * -2006098851));
                    return 1;
                }
                throw new RuntimeException();
            }
        }
        else {
            if (1484376709 * Interpreter.field703 >= 10) {
                throw new RuntimeException();
            }
            Widget vmethod3380;
            if (n >= 2000) {
                vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            }
            else {
                vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
            }
            if (vmethod3380.onResize == null) {
                return 0;
            }
            final ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.dragTarget = vmethod3380;
            scriptEvent.args = vmethod3380.onResize;
            scriptEvent.field859 = -1685365847 + Interpreter.field703 * 815462605;
            Client.scriptEvents.addFirst(scriptEvent);
            return 1;
        }
    }
    
    static int dj(final int n, final Script script, final boolean b) {
        if (1927 != n && n != 2927) {
            if (1928 == n) {
                final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
                final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                if (n2 < 1 || n2 > 10) {
                    throw new RuntimeException();
                }
                Interpreter.field690.add(new class97(n2, 1713081171 * widget.id, widget.childIndex * 55577617, widget.itemId * -2006098851));
                return 1;
            }
            else {
                if (n != 2928) {
                    return 2;
                }
                Interpreter.Interpreter_intStackSize -= 1281407919;
                final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                final int n5 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                if (n5 >= 1 && n5 <= 10) {
                    Interpreter.field690.add(new class97(n5, n3, n4, class165.vmethod3380(n3, (byte)5).itemId * -2006098851));
                    return 1;
                }
                throw new RuntimeException();
            }
        }
        else {
            if (1484376709 * Interpreter.field703 >= 10) {
                throw new RuntimeException();
            }
            Widget vmethod3380;
            if (n >= 2000) {
                vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            }
            else {
                vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
            }
            if (vmethod3380.onResize == null) {
                return 0;
            }
            final ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.dragTarget = vmethod3380;
            scriptEvent.args = vmethod3380.onResize;
            scriptEvent.field859 = -1685365847 + Interpreter.field703 * 815462605;
            Client.scriptEvents.addFirst(scriptEvent);
            return 1;
        }
    }
    
    static int ff(final int n, final Script script, final boolean b) {
        if (n == 6754) {
            final NPCComposition npcDefinition = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-11));
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != npcDefinition) ? npcDefinition.name : "");
            return 1;
        }
        if (6764 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final NPCComposition npcDefinition2 = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)(-67));
            final int n2 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = npcDefinition2.method1030(n2, (byte)16);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = npcDefinition2.method1032(n2, 838287909);
            return 1;
        }
        if (n == 6765) {
            final NPCComposition npcDefinition3 = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-41));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((npcDefinition3 != null) ? (2062903815 * npcDefinition3.combatLevel) : 0);
            return 1;
        }
        return 2;
    }
    
    static int go(final int n, final Script script, final boolean b) {
        return 2;
    }
    
    static int gr(final int n, final Script script, final boolean b) {
        if (n == 1295591007) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * 1379105988 - 1] = (ByteArrayPool.method2091(606875193) ? 1 : 0);
            return 1;
        }
        return 2;
    }
    
    static int fq(final int n, final Script script, final boolean b) {
        if (6600 == n) {
            class88.getWorldMap(1888957534).method2381(GameEngine.Client_plane * -1727408401, (MusicPatchNode.localPlayer.br * 1144428983 >> 7) + WorldMapData_0.baseX * -1232093375, GameObject.baseY * 827352769 + (-411750205 * MusicPatchNode.localPlayer.ep >> 7), true, (byte)15);
            return 1;
        }
        if (n == 6601) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            String externalName = "";
            final WorldMapArea mapArea = class88.getWorldMap(-746755343).getMapArea(n2, -386708452);
            if (null != mapArea) {
                externalName = mapArea.getExternalName((short)23311);
            }
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = externalName;
            return 1;
        }
        if (n == 6602) {
            WorldMap.zj(class88.getWorldMap(-1360930666), Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -120754143);
            return 1;
        }
        if (n == 6603) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(-1708261075).getZoomLevel((byte)0);
            return 1;
        }
        if (n == 6604) {
            class88.getWorldMap(-1710189798).setZoomPercentage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -326136881);
            return 1;
        }
        if (6605 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (WorldMap.wt(class88.getWorldMap(1376624351), 142682982) ? 1 : 0);
            return 1;
        }
        if (6606 == n) {
            final Coord coord = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            class88.getWorldMap(-2105420130).setWorldMapPositionTarget(-96298701 * coord.x, -2105445199 * coord.y, (byte)(-18));
            return 1;
        }
        if (6607 == n) {
            final Coord coord2 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            class88.getWorldMap(1604471679).fs(-96298701 * coord2.x, -2105445199 * coord2.y, -1278102739);
            return 1;
        }
        if (n == 6608) {
            final Coord coord3 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            WorldMap.vp(class88.getWorldMap(-1871225805), -113644749 * coord3.plane, coord3.x * -96298701, coord3.y * -2105445199, (byte)11);
            return 1;
        }
        if (6609 == n) {
            final Coord coord4 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            class88.getWorldMap(1531546792).jumpToSourceCoordInstant(coord4.plane * -113644749, coord4.x * -96298701, coord4.y * -2105445199, -224051406);
            return 1;
        }
        if (n == 6610) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(-329053165).getDisplayX(-1732754082);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(668730219).getDisplayY((byte)0);
            return 1;
        }
        if (n == 6611) {
            final WorldMapArea mapArea2 = class88.getWorldMap(-1440242822).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -808442005);
            if (mapArea2 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea2.getOrigin((byte)95).packed(-964267539);
            }
            return 1;
        }
        if (n == 6612) {
            final WorldMapArea mapArea3 = class88.getWorldMap(1688964768).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1081143132);
            if (mapArea3 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (mapArea3.getRegionHighX(-557755976) - mapArea3.getRegionLowX(16748608) + 1) * 64;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (mapArea3.getRegionHighY(-392328939) - mapArea3.getRegionLowY(197477883) + 1) * 64;
            }
            return 1;
        }
        if (6613 == n) {
            final WorldMapArea mapArea4 = class88.getWorldMap(-1783896210).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1773207419);
            if (mapArea4 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionLowX(16748608) * 64;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionLowY(-729215552) * 64;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionHighX(-1700444591) * 64 + 64 - 1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionHighY(-973809219) * 64 + 64 - 1;
            }
            return 1;
        }
        if (n == 6614) {
            final WorldMapArea mapArea5 = class88.getWorldMap(1675575857).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1673245637);
            if (mapArea5 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = WorldMapArea.uz(mapArea5, 447952954);
            }
            return 1;
        }
        if (6615 == n) {
            final Coord da = WorldMap.da(class88.getWorldMap(-734251885), 1721001715);
            if (null == da) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = da.x * -96298701;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2105445199 * da.y;
            }
            return 1;
        }
        if (n == 6616) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(1494582127).currentMapAreaId(244054422);
            return 1;
        }
        if (6617 == n) {
            final Coord coord5 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            final WorldMapArea currentMapArea = class88.getWorldMap(941833209).getCurrentMapArea((byte)9);
            if (null == currentMapArea) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                return 1;
            }
            final int[] position = currentMapArea.position(coord5.plane * -113644749, -96298701 * coord5.x, -2105445199 * coord5.y, (byte)6);
            if (null == position) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = position[0];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = position[1];
            }
            return 1;
        }
        else if (6618 == n) {
            final Coord coord6 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            final WorldMapArea currentMapArea2 = class88.getWorldMap(-1469474210).getCurrentMapArea((byte)47);
            if (currentMapArea2 == null) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                return 1;
            }
            final Coord coord7 = currentMapArea2.coord(coord6.x * -96298701, coord6.y * -2105445199, 2071642503);
            if (null == coord7) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = coord7.packed(-964267539);
            }
            return 1;
        }
        else {
            if (n == 6619) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                class220.method1229(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]), false, (byte)59);
                return 1;
            }
            if (n == 6620) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                class220.method1229(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], new Coord(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]), true, (byte)80);
                return 1;
            }
            if (6621 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final Coord coord8 = new Coord(Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                final WorldMapArea mapArea6 = class88.getWorldMap(-1616921361).getMapArea(n3, -430821211);
                if (mapArea6 == null) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    return 1;
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (mapArea6.containsCoord(coord8.plane * -113644749, coord8.x * -96298701, -2105445199 * coord8.y, -1371577551) ? 1 : 0);
                return 1;
            }
            else {
                if (n == 6622) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(1618937866).getDisplayWith((byte)121);
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(317328335).getDisplayHeight(-882633284);
                    return 1;
                }
                if (n == 6623) {
                    final Coord coord9 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                    final WorldMapArea mapAreaAtCoord = class88.getWorldMap(-1878396463).mapAreaAtCoord(-113644749 * coord9.plane, coord9.x * -96298701, -2105445199 * coord9.y, (byte)2);
                    if (mapAreaAtCoord == null) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = WorldMapArea.wo(mapAreaAtCoord, -964267539);
                    }
                    return 1;
                }
                if (6624 == n) {
                    class88.getWorldMap(-1420216879).setCyclesPerFlash(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)25);
                    return 1;
                }
                if (n == 6625) {
                    class88.getWorldMap(896594360).resetMaxFlashCount((byte)(-71));
                    return 1;
                }
                if (n == 6626) {
                    class88.getWorldMap(-1931177509).setMaxFlashCount(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-13));
                    return 1;
                }
                if (n == 6627) {
                    class88.getWorldMap(848927673).ge(-415352766);
                    return 1;
                }
                if (n == 6628) {
                    class88.getWorldMap(540773965).setPerpetualFlash(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, -2009902789);
                    return 1;
                }
                if (6629 == n) {
                    class88.getWorldMap(2092304400).flashElement(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 185156955);
                    return 1;
                }
                if (n == 6630) {
                    class88.getWorldMap(-746943530).flashCategory(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 453156070);
                    return 1;
                }
                if (n == 6631) {
                    class88.getWorldMap(-2063682925).method2329(530218621);
                    return 1;
                }
                if (n == 6632) {
                    WorldMap.le(class88.getWorldMap(1327535427), Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, 1432795177);
                    return 1;
                }
                if (n == 6633) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    class88.getWorldMap(-1196884231).disableElement(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], 1 == Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], -745506695);
                    return 1;
                }
                if (6634 == n) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    WorldMap.ld(class88.getWorldMap(1901511756), Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] == 1, -962145040);
                    return 1;
                }
                if (n == 6635) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class88.getWorldMap(1763684911).getElementsDisabled((short)480) ? 1 : 0);
                    return 1;
                }
                if (6636 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class88.getWorldMap(2144805735).isElementDisabled(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1814377162) ? 1 : 0);
                    return 1;
                }
                if (n == 6637) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class88.getWorldMap(914862249).isCategoryDisabled(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-91)) ? 1 : 0);
                    return 1;
                }
                if (n == 6638) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    final Coord tb = WorldMap.tb(class88.getWorldMap(-1513235305), Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], new Coord(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]), -726164951);
                    if (null == tb) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = tb.packed(-964267539);
                    }
                    return 1;
                }
                if (n == 6639) {
                    final AbstractWorldMapIcon iconStart = class88.getWorldMap(1257263531).iconStart(-1356707150);
                    if (iconStart == null) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconStart.getElement(-1396480439);
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconStart.coord2.packed(-964267539);
                    }
                    return 1;
                }
                if (n == 6640) {
                    final AbstractWorldMapIcon iconNext = class88.getWorldMap(-1678998213).iconNext((byte)(-104));
                    if (iconNext == null) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconNext.getElement(-1690669478);
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconNext.coord2.packed(-964267539);
                    }
                    return 1;
                }
                if (6693 == n) {
                    final WorldMapElement method1935 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1870513295);
                    if (null == method1935.name) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    }
                    else {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = method1935.name;
                    }
                    return 1;
                }
                if (n == 6694) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 952315347 * class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 2095851737).textSize;
                    return 1;
                }
                if (6695 == n) {
                    final WorldMapElement method1936 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1968972952);
                    if (null == method1936) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = method1936.category * -461862935;
                    }
                    return 1;
                }
                if (6696 == n) {
                    final WorldMapElement method1937 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1881401946);
                    if (null == method1937) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1458003089 * method1937.sprite1;
                    }
                    return 1;
                }
                if (n == 6697) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.mapElement * 1618357717;
                    return 1;
                }
                if (n == 6698) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.coord1.packed(-964267539);
                    return 1;
                }
                if (n == 6699) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.coord2.packed(-964267539);
                    return 1;
                }
                return 2;
            }
        }
    }
    
    static int fz(final int n, final Script script, final boolean b) {
        if (n == 5630) {
            Client.logoutTimer = 719725026;
            return 1;
        }
        return 2;
    }
    
    static int gs(final int n, final Script script, final boolean b) {
        return 2;
    }
    
    static void cq(final ScriptEvent scriptEvent, final int n, final int n2) {
        final Object[] args = scriptEvent.args;
        Script script;
        if (class292.method1604(scriptEvent.type * 937869311, -964267539)) {
            ByteArrayPool.worldMapEvent = (WorldMapEvent)args[0];
            final WorldMapElement method1935 = class354.method1935(1618357717 * ByteArrayPool.worldMapEvent.mapElement, 2140636000);
            script = class151.vmethod3239(scriptEvent.type * 937869311, method1935.objectId * 219774827, -461862935 * method1935.category, 1514719916);
        }
        else {
            script = AbstractByteArrayCopier.getScript((int)args[0], 2061824335);
        }
        if (null == script) {
            return;
        }
        Interpreter.Interpreter_intStackSize = 0;
        SecureRandomCallable.Interpreter_stringStackSize = 0;
        int n3 = -1;
        int[] array = script.opcodes;
        int[] array2 = script.intOperands;
        int i = -1;
        Interpreter.Interpreter_frameDepth = 0;
        Interpreter.field700 = false;
        int n4 = 0;
        int n5 = 0;
        try {
            Interpreter.Interpreter_intLocals = new int[2144970855 * script.localIntCount];
            int n6 = 0;
            Interpreter.Interpreter_stringLocals = new String[-1897224143 * script.localStringCount];
            int n7 = 0;
            for (int j = 1; j < args.length; ++j) {
                if (args[j] instanceof Integer) {
                    int intValue = (int)args[j];
                    if (-2147483647 == intValue) {
                        intValue = -1266615561 * scriptEvent.mouseX;
                    }
                    if (-2147483646 == intValue) {
                        intValue = scriptEvent.mouseY * 650213389;
                    }
                    if (-2147483645 == intValue) {
                        intValue = ((scriptEvent.dragTarget != null) ? (1713081171 * scriptEvent.dragTarget.id) : -1);
                    }
                    if (-2147483644 == intValue) {
                        intValue = 684782445 * scriptEvent.opIndex;
                    }
                    if (intValue == -2147483643) {
                        intValue = ((null != scriptEvent.dragTarget) ? (55577617 * scriptEvent.dragTarget.childIndex) : -1);
                    }
                    if (intValue == -2147483642) {
                        intValue = ((scriptEvent.widget != null) ? (scriptEvent.widget.id * 1713081171) : -1);
                    }
                    if (intValue == -2147483641) {
                        intValue = ((null != scriptEvent.widget) ? (55577617 * scriptEvent.widget.childIndex) : -1);
                    }
                    if (-2147483640 == intValue) {
                        intValue = -2125751633 * scriptEvent.keyTyped;
                    }
                    if (-2147483639 == intValue) {
                        intValue = scriptEvent.keyPressed * -19398649;
                    }
                    Interpreter.Interpreter_intLocals[n6++] = intValue;
                }
                else if (args[j] instanceof String) {
                    String targetName = (String)args[j];
                    if (targetName.equals("event_opbase")) {
                        targetName = scriptEvent.targetName;
                    }
                    Interpreter.Interpreter_stringLocals[n7++] = targetName;
                }
            }
            Interpreter.field703 = -1037192187 * scriptEvent.field859;
            while (++n5 <= n) {
                i = array[++n3];
                if (i < 100) {
                    if (i == 0) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = array2[n3];
                    }
                    else if (i == 1) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Varps.Varps_main[array2[n3]];
                    }
                    else if (2 == i) {
                        final int n8 = array2[n3];
                        Varps.Varps_main[n8] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        class7.changeGameOptions(n8, 737227154);
                    }
                    else if (3 == i) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = script.stringOperands[n3];
                    }
                    else if (6 == i) {
                        n3 += array2[n3];
                    }
                    else if (7 == i) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        if (Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (i == 8) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        if (Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539] != Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (i == 9) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (i == 10) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (i == 21) {
                        if (-1968816839 * Interpreter.Interpreter_frameDepth == 0) {
                            while (Interpreter.field690.size() > 0) {
                                final class97 class97 = Interpreter.field690.remove(0);
                                Message.widgetDefaultMenuAction(class97.method615((byte)(-82)), class97.hr(class97, -697707563), class97.method614((byte)7), class97.method616(1673728282), "", 1238902143);
                            }
                            if (Interpreter.field700) {
                                Interpreter.field700 = false;
                                class148.method844(-1641917465);
                            }
                            if (n4 == 0 && n2 > 0 && n5 >= n2) {
                                class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n5 + " of max " + n, null, (byte)8);
                            }
                            return;
                        }
                        final ScriptFrame scriptFrame = Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth -= 937402633) * -1968816839];
                        script = scriptFrame.script;
                        array = script.opcodes;
                        array2 = script.intOperands;
                        n3 = scriptFrame.pc * -1780087085;
                        Interpreter.Interpreter_intLocals = scriptFrame.intLocals;
                        Interpreter.Interpreter_stringLocals = scriptFrame.stringLocals;
                    }
                    else if (i == 25) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class252.expandBounds(array2[n3], 1367871451);
                    }
                    else if (27 == i) {
                        class283.method1593(array2[n3], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 904453034);
                    }
                    else if (i == 31) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (32 == i) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] < Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]) {
                            continue;
                        }
                        n3 += array2[n3];
                    }
                    else if (33 == i) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intLocals[array2[n3]];
                    }
                    else if (i == 34) {
                        Interpreter.Interpreter_intLocals[array2[n3]] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    }
                    else if (i == 35) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringLocals[array2[n3]];
                    }
                    else if (36 == i) {
                        Interpreter.Interpreter_stringLocals[array2[n3]] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                    }
                    else if (i == 37) {
                        final int n9 = array2[n3];
                        SecureRandomCallable.Interpreter_stringStackSize -= n9 * -1086551379;
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = WorldMapSprite.getTileColor(Interpreter.Interpreter_stringStack, SecureRandomCallable.Interpreter_stringStackSize * -2017760987, n9, (byte)20);
                    }
                    else if (38 == i) {
                        Interpreter.Interpreter_intStackSize -= 427135973;
                    }
                    else if (39 == i) {
                        SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                    }
                    else if (40 == i) {
                        final Script script2 = AbstractByteArrayCopier.getScript(array2[n3], 682208052);
                        final int[] interpreter_intLocals = new int[2144970855 * script2.localIntCount];
                        final String[] interpreter_stringLocals = new String[script2.localStringCount * -1897224143];
                        for (int k = 0; k < -1203198865 * script2.intArgumentCount; ++k) {
                            interpreter_intLocals[k] = Interpreter.Interpreter_intStack[k + (-964267539 * Interpreter.Interpreter_intStackSize - script2.intArgumentCount * -1203198865)];
                        }
                        for (int l = 0; l < 1178893217 * script2.stringArgumentCount; ++l) {
                            interpreter_stringLocals[l] = Interpreter.Interpreter_stringStack[l + (-2017760987 * SecureRandomCallable.Interpreter_stringStackSize - script2.stringArgumentCount * 1178893217)];
                        }
                        Interpreter.Interpreter_intStackSize -= script2.intArgumentCount * -1927162805;
                        SecureRandomCallable.Interpreter_stringStackSize -= script2.stringArgumentCount * 2141738445;
                        final ScriptFrame scriptFrame2 = new ScriptFrame();
                        scriptFrame2.script = script;
                        scriptFrame2.pc = n3 * -1031782053;
                        scriptFrame2.intLocals = Interpreter.Interpreter_intLocals;
                        scriptFrame2.stringLocals = Interpreter.Interpreter_stringLocals;
                        Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth += 937402633) * -1968816839 - 1] = scriptFrame2;
                        script = script2;
                        array = script.opcodes;
                        array2 = script.intOperands;
                        n3 = -1;
                        Interpreter.Interpreter_intLocals = interpreter_intLocals;
                        Interpreter.Interpreter_stringLocals = interpreter_stringLocals;
                    }
                    else if (i == 42) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Varcs.dy(class373.varcs, array2[n3], 469367517);
                    }
                    else if (43 == i) {
                        Varcs.cr(class373.varcs, array2[n3], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1301390166);
                    }
                    else if (44 == i) {
                        final int n10 = array2[n3] >> 16;
                        final int n11 = array2[n3] & 0xFFFF;
                        final int n12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        if (n12 < 0 || n12 > 5000) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_arrayLengths[n10] = n12;
                        int n13 = -1;
                        if (105 == n11) {
                            n13 = 0;
                        }
                        for (int n14 = 0; n14 < n12; ++n14) {
                            Interpreter.Interpreter_arrays[n10][n14] = n13;
                        }
                    }
                    else if (i == 45) {
                        final int n15 = array2[n3];
                        final int n16 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        if (n16 < 0 || n16 >= Interpreter.Interpreter_arrayLengths[n15]) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_arrays[n15][n16];
                    }
                    else if (46 == i) {
                        final int n17 = array2[n3];
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        final int n18 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                        if (n18 < 0 || n18 >= Interpreter.Interpreter_arrayLengths[n17]) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_arrays[n17][n18] = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                    }
                    else if (i == 47) {
                        String s = class373.varcs.getStringOld(array2[n3], (byte)85);
                        if (s == null) {
                            s = Strings.at;
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s;
                    }
                    else if (i == 48) {
                        class373.varcs.setStringOld(array2[n3], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -1164462471);
                    }
                    else if (49 == i) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class373.varcs.getString(array2[n3], 190454274);
                    }
                    else if (i == 50) {
                        class373.varcs.setString(array2[n3], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -875468987);
                    }
                    else if (60 == i) {
                        final IntegerNode integerNode = (IntegerNode)script.switches[array2[n3]].aa(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                        if (null == integerNode) {
                            continue;
                        }
                        n3 += integerNode.integer;
                    }
                    else if (74 == i) {
                        final Integer titleGroupValue = class133.field1286.getTitleGroupValue(array2[n3], (byte)18);
                        if (null == titleGroupValue) {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = titleGroupValue;
                        }
                    }
                    else {
                        if (i != 76) {
                            throw new IllegalStateException();
                        }
                        final Integer value = Players.varclan.method2273(array2[n3], (short)21347);
                        if (value == null) {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = value;
                        }
                    }
                }
                else {
                    switch (class33.method152(i, script, 1 == script.intOperands[n3], (byte)(-9))) {
                        case 1: {
                            continue;
                        }
                        case 2: {
                            throw new IllegalStateException();
                        }
                        case 0: {
                            while (Interpreter.field690.size() > 0) {
                                final class97 class98 = Interpreter.field690.remove(0);
                                Message.widgetDefaultMenuAction(class98.method615((byte)(-28)), class97.hr(class98, -1690103284), class98.method614((byte)7), class98.method616(1966362907), "", 1238902143);
                            }
                            if (Interpreter.field700) {
                                Interpreter.field700 = false;
                                class148.method844(-533200085);
                            }
                            if (n4 == 0 && n2 > 0 && n5 >= n2) {
                                class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n5 + " of max " + n, null, (byte)8);
                            }
                            return;
                        }
                        default: {
                            continue;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        catch (Exception ex) {
            n4 = 1;
            final StringBuilder sb = new StringBuilder(30);
            sb.append("").append(script.hr).append(" ");
            for (int n19 = -1968816839 * Interpreter.Interpreter_frameDepth - 1; n19 >= 0; --n19) {
                sb.append("").append(Interpreter.Interpreter_frames[n19].script.hr).append(" ");
            }
            sb.append("").append(i);
            class387.RunException_sendStackTrace(sb.toString(), ex, (byte)8);
            while (Interpreter.field690.size() > 0) {
                final class97 class99 = Interpreter.field690.remove(0);
                Message.widgetDefaultMenuAction(class99.method615((byte)(-55)), class97.hr(class99, -1054085742), class99.method614((byte)7), class99.method616(1968374679), "", 1238902143);
            }
            if (Interpreter.field700) {
                Interpreter.field700 = false;
                class148.method844(1319948668);
            }
            if (n4 == 0 && n2 > 0 && n5 >= n2) {
                class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n5 + " of max " + n, null, (byte)8);
            }
        }
        finally {
            while (Interpreter.field690.size() > 0) {
                final class97 class100 = Interpreter.field690.remove(0);
                Message.widgetDefaultMenuAction(class100.method615((byte)(-18)), class97.hr(class100, -975966317), class100.method614((byte)7), class100.method616(2139186639), "", 1238902143);
            }
            if (Interpreter.field700) {
                Interpreter.field700 = false;
                class148.method844(-653952323);
            }
            if (n4 == 0 && n2 > 0 && n5 >= n2) {
                class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n5 + " of max " + n, null, (byte)8);
            }
        }
    }
    
    static int fb(final int n, final Script script, final boolean b) {
        if (-51993890 == n) {
            Interpreter.Interpreter_intStackSize -= 231438903;
            final int n2 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            if (!Client.isCameraLocked) {
                Client.camAngleX = -637026513 * n2;
                Client.camAngleY = n3 * -539155979;
            }
            return 1;
        }
        if (n == 1450859146) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 264745682) * -964267539 - 1] = Client.camAngleX * -954734641;
            return 1;
        }
        if (n == -829497993) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.camAngleY * 704283033;
            return 1;
        }
        if (5530 == n) {
            int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 538385586) * -964267539];
            if (n4 < 0) {
                n4 = 0;
            }
            Client.camFollowHeight = n4 * 2048249787;
            return 1;
        }
        if (n == -1692513504) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -54986231 - 1] = Client.camFollowHeight * -772469535;
            return 1;
        }
        return 2;
    }
    
    static int ez(final int n, final Script script, final boolean b) {
        if (n == 3200) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            class133.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2], (byte)(-32));
            return 1;
        }
        if (n == 3201) {
            class1.playSong(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -420628235);
            return 1;
        }
        if (n == 3202) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            CollisionMap.playJingle(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 1287836101);
            return 1;
        }
        if (n == 3212 || 3213 == n || n == 3209 || n == 3181 || 3203 == n || n == 3205 || 3207 == n) {
            class86 class86 = class86.field886;
            class85 class87 = class85.field872;
            int a = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (3212 == n) {
                final int i = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i, (short)173);
                if (class86 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", i));
                }
            }
            if (n == 3213) {
                final int j = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class87 = (class85)StructComposition.findEnumerated(class121.method721(1920019245), j, (short)173);
                if (class87 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", j));
                }
            }
            if (n == 3209) {
                final int k = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), k, (short)173);
                if (null == class86) {
                    class87 = (class85)StructComposition.findEnumerated(class121.method721(2079527468), k, (short)173);
                    if (null == class87) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", k));
                    }
                }
            }
            else if (n == 3181) {
                class86 = class86.field884;
            }
            else if (n == 3203) {
                class87 = class85.field877;
            }
            else if (3205 == n) {
                class87 = class85.field871;
            }
            else if (3207 == n) {
                class87 = class85.field874;
            }
            if (class85.field872 == class87) {
                switch (-2060299987 * class86.field887) {
                    case 2: {
                        class20.clientPreferences.getTitleMusicDisabled(a, -527699713);
                        break;
                    }
                    case 4: {
                        if (a < 0) {
                            a = 0;
                        }
                        class20.clientPreferences.method587(a, (byte)36);
                        break;
                    }
                    case 1: {
                        class20.clientPreferences.setIsUsernameHidden(a, -409385511);
                        break;
                    }
                    case 5: {
                        ApproximateRouteStrategy.method359(a, 1308163500);
                        break;
                    }
                    case 3: {
                        class20.clientPreferences.method580(a, 1957540203);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", class86.toString()));
                    }
                }
            }
            else {
                switch (class87.field873 * 358560065) {
                    case 1: {
                        ClientPreferences.pb(class20.clientPreferences, a == 1, -1505559794);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", class87.toString()));
                    }
                    case 3: {
                        class130.method764(Math.round(127 * Math.min(Math.max(a, 0), 100) / 100.0f), 764535717);
                        break;
                    }
                    case 4: {
                        class135.method783(Math.round(127 * Math.min(Math.max(a, 0), 100) / 100.0f), (byte)0);
                        break;
                    }
                    case 2: {
                        class86.method502(Math.round(255 * Math.min(Math.max(a, 0), 100) / 100.0f), (byte)(-107));
                        break;
                    }
                }
            }
            return 1;
        }
        if (n == 3214 || n == 3215 || 3210 == n || 3182 == n || n == 3204 || n == 3206 || 3208 == n) {
            class86 class88 = class86.field886;
            class85 class89 = class85.field872;
            if (3214 == n) {
                final int l = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), l, (short)173);
                if (class88 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", l));
                }
            }
            if (n == 3215) {
                final int m = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class89 = (class85)StructComposition.findEnumerated(class121.method721(1749271627), m, (short)173);
                if (null == class89) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", m));
                }
            }
            if (3210 == n) {
                final int i2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i2, (short)173);
                if (class88 == null) {
                    class89 = (class85)StructComposition.findEnumerated(class121.method721(1953325913), i2, (short)173);
                    if (class89 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", i2));
                    }
                }
            }
            else if (3182 == n) {
                class88 = class86.field884;
            }
            else if (n == 3204) {
                class89 = class85.field877;
            }
            else if (n == 3206) {
                class89 = class85.field871;
            }
            else if (n == 3208) {
                class89 = class85.field874;
            }
            int n2 = 0;
            if (class89 == class85.field872) {
                switch (class88.field887 * -2060299987) {
                    case 3: {
                        n2 = (class20.clientPreferences.method562((short)6442) ? 1 : 0);
                        break;
                    }
                    case 5: {
                        n2 = class103.method636(-1656535671);
                        break;
                    }
                    case 1: {
                        n2 = (ClientPreferences.ty(class20.clientPreferences, -2136714594) ? 1 : 0);
                        break;
                    }
                    case 2: {
                        n2 = (ClientPreferences.ss(class20.clientPreferences, -1197954221) ? 1 : 0);
                        break;
                    }
                    case 4: {
                        n2 = class20.clientPreferences.getCurrentMusicVolume(1671764667);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", class88.toString()));
                    }
                }
            }
            else {
                switch (class89.field873 * 358560065) {
                    case 3: {
                        n2 = Math.round(ClientPreferences.setUsernameToRemember(class20.clientPreferences, 2014138352) * 100 / 127.0f);
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", class89.toString()));
                    }
                    case 4: {
                        n2 = Math.round(100 * class20.clientPreferences.method573(-1930943971) / 127.0f);
                        break;
                    }
                    case 1: {
                        n2 = (class20.clientPreferences.getRoofsHidden(-2093367392) ? 1 : 0);
                        break;
                    }
                    case 2: {
                        n2 = Math.round(ClientPreferences.xp(class20.clientPreferences, 721347970) * 100 / 255.0f);
                        break;
                    }
                }
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n2;
            return 1;
        }
        if (3211 == n) {
            return 1;
        }
        if (3216 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            int n4 = 0;
            final class86 class90 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), n3, (short)173);
            if (class90 != null) {
                n4 = ((class86.field886 != class90) ? 1 : 0);
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n4;
            return 1;
        }
        if (3218 == n) {
            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            int n6 = 0;
            final class85 class91 = (class85)StructComposition.findEnumerated(class121.method721(2051034858), n5, (short)173);
            if (class91 != null) {
                n6 = ((class91 != class85.field872) ? 1 : 0);
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n6;
            return 1;
        }
        if (3217 == n || n == 3219) {
            class86 field886 = class86.field886;
            class85 field887 = class85.field872;
            if (3217 == n) {
                final int i3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                field886 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i3, (short)173);
                if (null == field886) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", i3));
                }
            }
            if (n == 3219) {
                final int i4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                field887 = (class85)StructComposition.findEnumerated(class121.method721(2077581933), i4, (short)173);
                if (null == field887) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", i4));
                }
            }
            int n7 = 0;
            int n8 = 0;
            if (class85.field872 == field887) {
                switch (-2060299987 * field886.field887) {
                    case 1:
                    case 2:
                    case 3: {
                        n7 = 0;
                        n8 = 1;
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown device option: %s.", field886.toString()));
                    }
                    case 5: {
                        n7 = 0;
                        n8 = 100;
                        break;
                    }
                    case 4: {
                        n7 = 0;
                        n8 = Integer.MAX_VALUE;
                        break;
                    }
                }
            }
            else {
                switch (358560065 * field887.field873) {
                    case 2:
                    case 3:
                    case 4: {
                        n7 = 0;
                        n8 = 100;
                        break;
                    }
                    case 1: {
                        n7 = 0;
                        n8 = 1;
                        break;
                    }
                    default: {
                        throw new RuntimeException(String.format("Unkown game option: %s.", field887.toString()));
                    }
                }
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n7;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n8;
            return 1;
        }
        return 2;
    }
    
    static int dq(final int n, final Script script, final boolean b) {
        if (1927 == n || n == -1340932266) {
            if (1575577502 * Interpreter.field703 >= 10) {
                throw new RuntimeException();
            }
            Widget vmethod3380;
            if (n >= 2000) {
                vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 998728318], (byte)5);
            }
            else {
                vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
            }
            if (vmethod3380.onResize == null) {
                return 0;
            }
            final ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.dragTarget = vmethod3380;
            scriptEvent.args = vmethod3380.onResize;
            scriptEvent.field859 = -1685365847 + Interpreter.field703 * 815462605;
            Client.scriptEvents.addFirst(scriptEvent);
            return 1;
        }
        else if (1928 == n) {
            final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1144634607) * -964267539];
            if (n2 >= 1 && n2 <= 10) {
                Interpreter.field690.add(new class97(n2, 1713081171 * widget.id, widget.childIndex * -1540002377, widget.itemId * -2006098851));
                return 1;
            }
            throw new RuntimeException();
        }
        else {
            if (n != 1234483732) {
                return 2;
            }
            Interpreter.Interpreter_intStackSize -= 1281407919;
            final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            final int n5 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            if (n5 >= 1 && n5 <= 10) {
                Interpreter.field690.add(new class97(n5, n3, n4, class165.vmethod3380(n3, (byte)5).itemId * -2006098851));
                return 1;
            }
            throw new RuntimeException();
        }
    }
    
    static int eo(final int n, final Script script, final boolean b) {
        final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
        if (2800 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.method1052(KeyHandler.getWidgetFlags(vmethod3380, 607340460), 1868217759);
            return 1;
        }
        if (n == 2801) {
            int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            --n2;
            if (vmethod3380.actions != null && n2 < vmethod3380.actions.length && null != vmethod3380.actions[n2]) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.actions[n2];
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            return 1;
        }
        if (2802 == n) {
            if (null == vmethod3380.field3004) {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
            }
            else {
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.field3004;
            }
            return 1;
        }
        return 2;
    }
    
    static int fj(final int n, final Script script, final boolean b) {
        if (n == 1326416266) {
            final NPCComposition npcDefinition = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * 1618849909], (byte)(-47));
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != npcDefinition) ? npcDefinition.name : "");
            return 1;
        }
        if (-970555212 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final NPCComposition npcDefinition2 = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)(-97));
            final int n2 = Interpreter.Interpreter_intStack[1 + -702056149 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 75603081) * -1174417625 - 1] = npcDefinition2.method1030(n2, (byte)30);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 754248262) * -676308897 - 1] = npcDefinition2.method1032(n2, -1911784781);
            return 1;
        }
        if (n == -4405468) {
            final NPCComposition npcDefinition3 = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 1099549494) * 1729608988], (byte)(-40));
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 989307637) * 2023722467 - 1] = ((npcDefinition3 != null) ? (127467109 * npcDefinition3.combatLevel) : 0);
            return 1;
        }
        return 2;
    }
    
    static int eb(final int n, final Script script, final boolean b) {
        if (n == 3300) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.cycle * -1886224337;
            return 1;
        }
        if (n == 3301) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.read(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)0);
            return 1;
        }
        if (n == 3302) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class431.ItemContainer_getCount(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 2098730562);
            return 1;
        }
        if (n == 3303) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.available(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -1761130713);
            return 1;
        }
        if (3304 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ApproximateRouteStrategy.getInvDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1717461998).size * -2010981849;
            return 1;
        }
        if (3305 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.currentLevels[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (3306 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.levels[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (3307 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.experience[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
            return 1;
        }
        if (n == 3308) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 827352769 * GameObject.baseY + (-411750205 * MusicPatchNode.localPlayer.ep >> 7) + ((WorldMapData_0.baseX * -1232093375 + (1144428983 * MusicPatchNode.localPlayer.br >> 7) << 14) + (-1727408401 * GameEngine.Client_plane << 28));
            return 1;
        }
        if (n == 3309) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] >> 14 & 0x3FFF);
            return 1;
        }
        if (n == 3310) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] >> 28;
            return 1;
        }
        if (3311 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] & 0x3FFF);
            return 1;
        }
        if (3312 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Client.isMembersWorld ? 1 : 0);
            return 1;
        }
        if (n == 3313) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.read(32768 + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], (byte)0);
            return 1;
        }
        if (n == 3314) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class431.ItemContainer_getCount(32768 + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 2098730562);
            return 1;
        }
        if (3315 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.available(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + 32768, Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], -587826369);
            return 1;
        }
        if (3316 == n) {
            if (Client.staffModLevel * 324465533 >= 2) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.staffModLevel * 324465533;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (n == 3317) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.rebootTimer * -1496573241;
            return 1;
        }
        if (n == 3318) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -453810525 * Client.worldId;
            return 1;
        }
        if (n == 3321) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -365416549 * Client.runEnergy / 100;
            return 1;
        }
        if (3322 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.weight * -1940722149;
            return 1;
        }
        if (3323 == n) {
            if (Client.playerMod) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            }
            else {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }
            return 1;
        }
        if (3324 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -205173751 * Client.worldProperties;
            return 1;
        }
        if (3325 == n) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] << 14) + (Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539] << 28) + Interpreter.Interpreter_intStack[3 + Interpreter.Interpreter_intStackSize * -964267539];
            return 1;
        }
        if (n == 3326) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -751176573 * Client.lastMouseRecordX;
            return 1;
        }
        if (n == 3327) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.lastMouseRecordY * -2076298705;
            return 1;
        }
        if (3331 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.runEnergy * -365416549;
            return 1;
        }
        return 2;
    }
    
    static int ef(final int n, final Script script, final boolean b) {
        if (3100 == n) {
            UserComparator5.addGameMessage(0, "", Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -397121414);
            return 1;
        }
        if (n == 3101) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            FloorDecoration.performPlayerAnimation(MusicPatchNode.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], 132068670);
            return 1;
        }
        if (n == 3103) {
            if (!Interpreter.field704) {
                Interpreter.field700 = true;
            }
            return 1;
        }
        if (n == 3104) {
            final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            int release = 0;
            if (WorldMapSectionType.isNumber(s, -121947035)) {
                release = PacketBufferNode.release(s, (byte)90);
            }
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher, (short)(-5756));
            packetBufferNode.packetBuffer.ba(release, -2081835031);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
            return 1;
        }
        if (n == 3105) {
            final String s2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.field2529, Client.packetWriter.isaacCipher, (short)(-21435));
            packetBufferNode2.packetBuffer.bf(s2.length() + 1, (byte)14);
            packetBufferNode2.packetBuffer.ce(s2, -1890789267);
            Client.packetWriter.addNode(packetBufferNode2, 414135591);
            return 1;
        }
        if (n == 3106) {
            final String s3 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
            final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.field2518, Client.packetWriter.isaacCipher, (short)737);
            packetBufferNode3.packetBuffer.bf(s3.length() + 1, (byte)102);
            packetBufferNode3.packetBuffer.ce(s3, -1572298011);
            Client.packetWriter.addNode(packetBufferNode3, 414135591);
            return 1;
        }
        if (3107 == n) {
            UserComparator7.method692(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1445405352);
            return 1;
        }
        if (n == 3108) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            class370.clickWidget(class165.vmethod3380(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2], (byte)5), Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], -1819669351);
            return 1;
        }
        if (n == 3109) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            class370.clickWidget(b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], -1819440027);
            return 1;
        }
        if (n == 3110) {
            class473.mouseCam = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
            return 1;
        }
        if (n == 3111) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class20.clientPreferences.getRoofsHidden(-1965965044) ? 1 : 0);
            return 1;
        }
        if (n == 3112) {
            ClientPreferences.pb(class20.clientPreferences, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, -1505559794);
            return 1;
        }
        if (n == 3113) {
            Ignored.compareTo_ignored(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, false, (byte)48);
            return 1;
        }
        if (3115 == n) {
            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            final PacketBufferNode packetBufferNode4 = class330.getPacketBufferNode(ClientPacket.field2525, Client.packetWriter.isaacCipher, (short)(-23310));
            packetBufferNode4.packetBuffer.cq(n2, (byte)(-55));
            Client.packetWriter.addNode(packetBufferNode4, 414135591);
            return 1;
        }
        if (3116 == n) {
            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            final String s4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            final String s5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
            if (s4.length() > 500) {
                return 1;
            }
            if (s5.length() > 500) {
                return 1;
            }
            final PacketBufferNode packetBufferNode5 = class330.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher, (short)(-18033));
            packetBufferNode5.packetBuffer.cq(1 + DynamicObject.stringCp1252NullTerminatedByteSize(s4, (byte)(-49)) + DynamicObject.stringCp1252NullTerminatedByteSize(s5, (byte)(-75)), (byte)(-92));
            packetBufferNode5.packetBuffer.ce(s4, -2044498393);
            packetBufferNode5.packetBuffer.du(n3, 100300342);
            packetBufferNode5.packetBuffer.ce(s5, -1593927309);
            Client.packetWriter.addNode(packetBufferNode5, 414135591);
            return 1;
        }
        else {
            if (3117 == n) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (n == 3118) {
                Client.showMouseOverText = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (n == 3119) {
                Client.field482 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (3120 == n) {
                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                    Client.drawPlayerNames = (-1387790283 * Client.drawPlayerNames | 0x1) * -1433710051;
                }
                else {
                    Client.drawPlayerNames = (Client.drawPlayerNames * -1387790283 & 0xFFFFFFFE) * -1433710051;
                }
                return 1;
            }
            if (n == 3121) {
                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                    Client.drawPlayerNames = -1433710051 * (Client.drawPlayerNames * -1387790283 | 0x2);
                }
                else {
                    Client.drawPlayerNames = (Client.drawPlayerNames * -1387790283 & 0xFFFFFFFD) * -1433710051;
                }
                return 1;
            }
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
                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                    Client.drawPlayerNames = -1433710051 * (-1387790283 * Client.drawPlayerNames | 0x8);
                }
                else {
                    Client.drawPlayerNames = (Client.drawPlayerNames * -1387790283 & 0xFFFFFFF7) * -1433710051;
                }
                return 1;
            }
            if (n == 3124) {
                Client.drawPlayerNames = 0;
                return 1;
            }
            if (n == 3125) {
                Client.showMouseCross = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (3126 == n) {
                Client.showLoadingMessages = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            if (n == 3127) {
                class120.setTapToDrop(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, (byte)(-45));
                return 1;
            }
            if (3128 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class13.getTapToDrop(-363478174) ? 1 : 0);
                return 1;
            }
            if (3129 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * -658916663;
                Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] * 583547559;
                return 1;
            }
            if (n == 3130) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                return 1;
            }
            if (3131 == n) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (n == 3132) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = GameEngine.canvasWidth * -1687260435;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class262.canvasHeight * 1658005443;
                return 1;
            }
            if (n == 3133) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (3134 == n) {
                return 1;
            }
            if (3135 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                return 1;
            }
            if (n == 3136) {
                Client.field463 = -1068626777;
                Client.field526 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -757532791;
                return 1;
            }
            if (n == 3137) {
                Client.field463 = 719237914;
                Client.field526 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -757532791;
                return 1;
            }
            if (3138 == n) {
                Client.field463 = 0;
                return 1;
            }
            if (3139 == n) {
                Client.field463 = -1787864691;
                return 1;
            }
            if (3140 == n) {
                Client.field463 = -1068626777;
                Client.field526 = -757532791 * (b ? (SoundSystem.scriptDotWidget.id * 1713081171) : (class1.scriptActiveWidget.id * 1713081171));
                return 1;
            }
            if (3141 == n) {
                class20.clientPreferences.setIsUsernameHidden(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, 1888914033);
                return 1;
            }
            if (3142 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (ClientPreferences.ty(class20.clientPreferences, -2089720505) ? 1 : 0);
                return 1;
            }
            if (n == 3143) {
                if (!(Client.Login_isUsernameRemembered = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1))) {
                    class20.clientPreferences.setUsernameToRemember("", -472730554);
                }
                return 1;
            }
            if (n == 3144) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Client.Login_isUsernameRemembered ? 1 : 0);
                return 1;
            }
            if (3145 == n) {
                return 1;
            }
            if (3146 == n) {
                class20.clientPreferences.getTitleMusicDisabled(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] != 1, -527699713);
                return 1;
            }
            if (n == 3147) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (ClientPreferences.ss(class20.clientPreferences, -1197954221) ? 0 : 1);
                return 1;
            }
            if (n == 3148) {
                return 1;
            }
            if (3149 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (3150 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3151) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (3152 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3153) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1158424865 * Login.Login_loadingPercent;
                return 1;
            }
            if (n == 3154) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = MouseHandler.method191(541513295);
                return 1;
            }
            if (3155 == n) {
                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                return 1;
            }
            if (n == 3156) {
                return 1;
            }
            if (3157 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                return 1;
            }
            if (n == 3158) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3159) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (3160 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3161) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3162) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3163) {
                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3164) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                return 1;
            }
            if (n == 3165) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3166) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3167) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (3168 == n) {
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
            if (n == 3169) {
                return 1;
            }
            if (n == 3170) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (3171 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (3172 == n) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (n == 3173) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (n == 3174) {
                Interpreter.Interpreter_intStackSize -= 427135973;
                return 1;
            }
            if (n == 3175) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            if (3176 == n) {
                return 1;
            }
            if (n == 3177) {
                return 1;
            }
            if (3178 == n) {
                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                return 1;
            }
            if (3179 == n) {
                return 1;
            }
            if (3180 == n) {
                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                return 1;
            }
            if (n == 3181) {
                ApproximateRouteStrategy.method359(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -729436441);
                return 1;
            }
            if (3182 == n) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class103.method636(930707276);
                return 1;
            }
            if (3189 == n) {
                DevicePcmPlayerProvider.method90(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 329326313);
                return 1;
            }
            return 2;
        }
    }
    
    static int gj(final int n, final Script script, final boolean b) {
        if (7463 == n) {
            GrandExchangeOfferOwnWorldComparator.method365(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1, -2009858192);
            return 1;
        }
        return 2;
    }
    
    public static int wz(final class314 class314) {
        return -947277461 * class314.field2844;
    }
    
    static int ey(final int n, final Script script, final boolean b) {
        if (3903 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].type((byte)(-16));
            return 1;
        }
        if (n == 3904) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].id * -300881317;
            return 1;
        }
        if (n == 3905) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].unitPrice * -1994102707;
            return 1;
        }
        if (n == 3906) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 857042809 * Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].totalQuantity;
            return 1;
        }
        if (n == 3907) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].currentQuantity * -52036157;
            return 1;
        }
        if (n == 3908) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1510761213 * Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].currentPrice;
            return 1;
        }
        if (3910 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].status(-1984917723) == 0) ? 1 : 0);
            return 1;
        }
        if (3911 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((2 == Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].status(-1827182330)) ? 1 : 0);
            return 1;
        }
        if (n == 3912) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((5 == Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].status(-1377968249)) ? 1 : 0);
            return 1;
        }
        if (n == 3913) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((1 == Client.grandExchangeOffers[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]].status(-1168181082)) ? 1 : 0);
            return 1;
        }
        if (3914 == n) {
            final boolean b2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (class375.grandExchangeEvents != null) {
                class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, b2, 694808074);
            }
            return 1;
        }
        if (n == 3915) {
            final boolean b3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != class375.grandExchangeEvents) {
                class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, b3, 694808074);
            }
            return 1;
        }
        if (3916 == n) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            final boolean b4 = 1 == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final boolean filterWorlds = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] == 1;
            if (class375.grandExchangeEvents != null) {
                Client.GrandExchangeEvents_worldComparator.filterWorlds = filterWorlds;
                class375.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, b4, 694808074);
            }
            return 1;
        }
        if (n == 3917) {
            final boolean b5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (null != class375.grandExchangeEvents) {
                class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, b5, 694808074);
            }
            return 1;
        }
        if (n == 3918) {
            final boolean b6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            if (class375.grandExchangeEvents != null) {
                class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, b6, 694808074);
            }
            return 1;
        }
        if (3919 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null == class375.grandExchangeEvents) ? 0 : class375.grandExchangeEvents.events.size());
            return 1;
        }
        if (3920 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).world * -39392873;
            return 1;
        }
        if (3921 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = GrandExchangeEvent.yc(class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]), -1622845301);
            return 1;
        }
        if (3922 == n) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).getPreviousOfferName(-1611285608);
            return 1;
        }
        if (n == 3923) {
            final long n2 = class96.clockNow(624179854) - class323.field3037 * -8156142729726467959L - -2107275097961185091L * class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).age;
            final int i = (int)(n2 / 3600000L);
            final int n3 = (int)((n2 - i * 3600000) / 60000L);
            final int n4 = (int)((n2 - i * 3600000 - 60000 * n3) / 1000L);
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = i + ":" + n3 / 10 + n3 % 10 + ":" + n4 / 10 + n4 % 10;
            return 1;
        }
        if (n == 3924) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).grandExchangeOffer.totalQuantity * 857042809;
            return 1;
        }
        if (n == 3925) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1994102707 * class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).grandExchangeOffer.unitPrice;
            return 1;
        }
        if (3926 == n) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class375.grandExchangeEvents.events.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).grandExchangeOffer.id * -300881317;
            return 1;
        }
        return 2;
    }
    
    static int du(final Widget widget) {
        if (widget.type * 589333162 != 11) {
            Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            return 1;
        }
        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget.method1809(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -970727166);
        return 1;
    }
}
