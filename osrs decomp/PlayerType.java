import net.runelite.api.widgets.JavaScriptCallback;

// 
// Decompiled by Procyon v0.5.36
// 

public class PlayerType implements class356
{
    static final int by = 3;
    static final PlayerType PlayerType_playerModerator;
    static final PlayerType PlayerType_jagexModerator;
    public final boolean isUser;
    static final PlayerType field3428;
    static final PlayerType PlayerType_hardcoreIronman;
    static final PlayerType field3430;
    static final PlayerType field3431;
    static final PlayerType field3432;
    static final PlayerType field3433;
    static final PlayerType field3434;
    static final PlayerType PlayerType_ironman;
    static final PlayerType field3436;
    static final PlayerType field3437;
    static final PlayerType PlayerType_normal;
    static final PlayerType field3439;
    static final PlayerType field3440;
    static final PlayerType PlayerType_ultimateIronman;
    public final int modIcon;
    public final boolean isPrivileged;
    static final PlayerType field3444;
    final int id;
    static IndexedSprite worldSelectLeftSprite;
    
    PlayerType(final int n, final int n2, final boolean b, final boolean isPrivileged, final boolean isUser) {
        this.id = n * -1325228517;
        this.modIcon = 1532409379 * n2;
        this.isPrivileged = isPrivileged;
        this.isUser = isUser;
    }
    
    static {
        PlayerType_normal = new PlayerType(0, -1, true, false, true);
        PlayerType_playerModerator = new PlayerType(1, 0, true, true, true);
        PlayerType_jagexModerator = new PlayerType(2, 1, true, true, false);
        PlayerType_ironman = new PlayerType(3, 2, false, false, true);
        PlayerType_ultimateIronman = new PlayerType(4, 3, false, false, true);
        PlayerType_hardcoreIronman = new PlayerType(5, 10, false, false, true);
        field3430 = new PlayerType(6, 22, false, false, true);
        field3431 = new PlayerType(7, 41, false, false, true);
        field3432 = new PlayerType(8, 42, false, false, true);
        field3433 = new PlayerType(9, 43, false, false, true);
        field3434 = new PlayerType(10, 44, false, false, true);
        field3444 = new PlayerType(11, 45, false, false, true);
        field3436 = new PlayerType(12, 46, false, false, true);
        field3439 = new PlayerType(13, 47, false, false, true);
        field3437 = new PlayerType(14, 48, false, false, true);
        field3428 = new PlayerType(15, 49, false, false, true);
        field3440 = new PlayerType(16, 52, false, false, true);
    }
    
    @Override
    public int aw() {
        return this.id * -897643501;
    }
    
    public static PlayerType[] al() {
        return new PlayerType[] { PlayerType.PlayerType_ironman, PlayerType.PlayerType_normal, PlayerType.field3434, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field3440, PlayerType.field3430, PlayerType.field3433, PlayerType.field3439, PlayerType.field3444, PlayerType.field3432, PlayerType.field3437, PlayerType.PlayerType_playerModerator, PlayerType.field3436, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3431, PlayerType.field3428 };
    }
    
    static void runScript(final ScriptEvent hl, final int n, final int n2, final int n3) {
        final Object[] arguments = hl.getArguments();
        if (arguments != null && arguments.length > 0 && arguments[0] instanceof JavaScriptCallback) {
            try {
                ((JavaScriptCallback)arguments[0]).run((net.runelite.api.ScriptEvent)hl);
            }
            catch (Exception ex) {
                Client.nw.error("Error in JavaScriptCallback", (Throwable)ex);
            }
            return;
        }
        try {
            Client.hl = hl;
            final int n4 = 637714632;
            try {
                final Object[] args = hl.args;
                Script script;
                if (class292.method1604(hl.type * 937869311, -964267539)) {
                    if (n4 <= 580935873) {
                        throw new IllegalStateException();
                    }
                    ByteArrayPool.worldMapEvent = (WorldMapEvent)args[0];
                    final WorldMapElement method1935 = class354.method1935(1618357717 * ByteArrayPool.worldMapEvent.mapElement, 1917630402);
                    final Script vmethod3239 = class151.vmethod3239(hl.type * 937869311, method1935.objectId * 219774827, -461862935 * method1935.category, -2068677653);
                    Client.gr(vmethod3239);
                    script = vmethod3239;
                }
                else {
                    final Script script2 = AbstractByteArrayCopier.getScript(Client.xh = (int)args[0], 1488073193);
                    Client.gr(script2);
                    script = script2;
                }
                if (null == script) {
                    if (n4 <= 580935873) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    Interpreter.Interpreter_intStackSize = 0;
                    SecureRandomCallable.Interpreter_stringStackSize = 0;
                    int n5 = Client.xh = -1;
                    int[] array = script.opcodes;
                    int[] array2 = script.intOperands;
                    int i = -1;
                    Interpreter.Interpreter_frameDepth = 0;
                    Interpreter.field700 = false;
                    int n6 = 0;
                    int n7 = 0;
                    try {
                        Interpreter.Interpreter_intLocals = new int[2144970855 * script.localIntCount];
                        int n8 = 0;
                        Interpreter.Interpreter_stringLocals = new String[-1897224143 * script.localStringCount];
                        int n9 = 0;
                        for (int j = 1; j < args.length; ++j) {
                            if (args[j] instanceof Integer) {
                                if (n4 <= 580935873) {
                                    throw new IllegalStateException();
                                }
                                int intValue = (int)args[j];
                                if (-2147483647 == intValue) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    intValue = -1266615561 * hl.mouseX;
                                }
                                if (-2147483646 == intValue) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    intValue = hl.mouseY * 650213389;
                                }
                                if (-2147483645 == intValue) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    int n10;
                                    if (hl.dragTarget != null) {
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        n10 = 1713081171 * hl.dragTarget.id;
                                    }
                                    else {
                                        n10 = -1;
                                    }
                                    intValue = n10;
                                }
                                if (-2147483644 == intValue) {
                                    intValue = 684782445 * hl.opIndex;
                                }
                                if (intValue == -2147483643) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    int n11;
                                    if (null != hl.dragTarget) {
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        n11 = 55577617 * hl.dragTarget.childIndex;
                                    }
                                    else {
                                        n11 = -1;
                                    }
                                    intValue = n11;
                                }
                                if (intValue == -2147483642) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    int n12;
                                    if (hl.widget != null) {
                                        if (n4 <= 580935873) {
                                            return;
                                        }
                                        n12 = hl.widget.id * 1713081171;
                                    }
                                    else {
                                        n12 = -1;
                                    }
                                    intValue = n12;
                                }
                                if (intValue == -2147483641) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    int n13;
                                    if (null != hl.widget) {
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        n13 = 55577617 * hl.widget.childIndex;
                                    }
                                    else {
                                        n13 = -1;
                                    }
                                    intValue = n13;
                                }
                                if (-2147483640 == intValue) {
                                    if (n4 <= 580935873) {
                                        return;
                                    }
                                    intValue = -2125751633 * hl.keyTyped;
                                }
                                if (-2147483639 == intValue) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    intValue = hl.keyPressed * -19398649;
                                }
                                Interpreter.Interpreter_intLocals[n8++] = intValue;
                            }
                            else if (args[j] instanceof String) {
                                if (n4 <= 580935873) {
                                    throw new IllegalStateException();
                                }
                                String targetName = (String)args[j];
                                if (targetName.equals("event_opbase")) {
                                    targetName = hl.targetName;
                                }
                                Interpreter.Interpreter_stringLocals[n9++] = targetName;
                            }
                        }
                        Interpreter.field703 = -1037192187 * hl.field859;
                        while (++n7 <= n) {
                            do {
                                final int[] array3 = array;
                                Client.xh = ++n5;
                                i = array3[n5];
                            } while (Client.qw(i));
                            if (i < 100) {
                                if (n4 <= 580935873) {
                                    return;
                                }
                                if (i == 0) {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = array2[n5];
                                }
                                else if (i != 0) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Varps.Varps_main[array2[n5]];
                                }
                                else if (2 == i) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    final int n14 = array2[n5];
                                    Varps.Varps_main[n14] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    Client.ye(n14);
                                    class7.changeGameOptions(n14, -485980300);
                                }
                                else if (3 == i) {
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = script.stringOperands[n5];
                                }
                                else if (6 == i) {
                                    n5 = (Client.xh = n5 + array2[n5]);
                                }
                                else if (7 == i) {
                                    if (n4 <= 580935873) {
                                        return;
                                    }
                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                    if (Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]) {
                                        continue;
                                    }
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    n5 = (Client.xh = n5 + array2[n5]);
                                }
                                else if (i == 8) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                    if (Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539] != Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]) {
                                        continue;
                                    }
                                    n5 = (Client.xh = n5 + array2[n5]);
                                }
                                else if (i == 9) {
                                    if (n4 <= 580935873) {
                                        return;
                                    }
                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                    if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]) {
                                        continue;
                                    }
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    n5 = (Client.xh = n5 + array2[n5]);
                                }
                                else if (i == 10) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                    if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]) {
                                        continue;
                                    }
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    n5 = (Client.xh = n5 + array2[n5]);
                                }
                                else if (i == 21) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    if (-1968816839 * Interpreter.Interpreter_frameDepth == 0) {
                                        if (n4 <= 580935873) {
                                            return;
                                        }
                                        while (Interpreter.field690.size() > 0) {
                                            final class97 class97 = Interpreter.field690.remove(0);
                                            Message.widgetDefaultMenuAction(class97.method615((byte)(-79)), class97.hr(class97, -950723758), class97.method614((byte)7), class97.method616(2101382901), "", 1238902143);
                                        }
                                        if (Interpreter.field700) {
                                            if (n4 <= 580935873) {
                                                return;
                                            }
                                            Interpreter.field700 = false;
                                            class148.method844(-429609844);
                                        }
                                        if (n6 == 0) {
                                            if (n4 <= 580935873) {
                                                throw new IllegalStateException();
                                            }
                                            if (n2 > 0) {
                                                if (n4 <= 580935873) {
                                                    throw new IllegalStateException();
                                                }
                                                if (n7 >= n2) {
                                                    if (n4 > 580935873) {
                                                        class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n7 + " of max " + n, null, (byte)8);
                                                    }
                                                }
                                            }
                                        }
                                        return;
                                    }
                                    else {
                                        final ScriptFrame scriptFrame = Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth -= 937402633) * -1968816839];
                                        final Script script3 = scriptFrame.script;
                                        Client.gr(script3);
                                        script = script3;
                                        array = script.opcodes;
                                        array2 = script.intOperands;
                                        n5 = (Client.xh = scriptFrame.pc * -1780087085);
                                        Interpreter.Interpreter_intLocals = scriptFrame.intLocals;
                                        Interpreter.Interpreter_stringLocals = scriptFrame.stringLocals;
                                    }
                                }
                                else if (i == 25) {
                                    if (n4 <= 580935873) {
                                        return;
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class252.expandBounds(array2[n5], 1949946238);
                                }
                                else if (27 == i) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    class283.method1593(array2[n5], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1369065577);
                                }
                                else if (i == 31) {
                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                    if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]) {
                                        continue;
                                    }
                                    if (n4 <= 580935873) {
                                        return;
                                    }
                                    n5 = (Client.xh = n5 + array2[n5]);
                                }
                                else if (32 == i) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                    if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] < Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]) {
                                        continue;
                                    }
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    n5 = (Client.xh = n5 + array2[n5]);
                                }
                                else if (33 == i) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intLocals[array2[n5]];
                                }
                                else if (i == 34) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intLocals[array2[n5]] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                }
                                else if (i == 35) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringLocals[array2[n5]];
                                }
                                else if (36 == i) {
                                    if (n4 <= 580935873) {
                                        return;
                                    }
                                    Interpreter.Interpreter_stringLocals[array2[n5]] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                                }
                                else if (i == 37) {
                                    final int n15 = array2[n5];
                                    SecureRandomCallable.Interpreter_stringStackSize -= n15 * -1086551379;
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = WorldMapSprite.getTileColor(Interpreter.Interpreter_stringStack, SecureRandomCallable.Interpreter_stringStackSize * -2017760987, n15, (byte)20);
                                }
                                else if (38 == i) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStackSize -= 427135973;
                                }
                                else if (39 == i) {
                                    SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                                }
                                else if (40 == i) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    final Script script4 = AbstractByteArrayCopier.getScript(array2[n5], 632113937);
                                    final int[] interpreter_intLocals = new int[2144970855 * script4.localIntCount];
                                    final String[] interpreter_stringLocals = new String[script4.localStringCount * -1897224143];
                                    for (int k = 0; k < -1203198865 * script4.intArgumentCount; ++k) {
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        interpreter_intLocals[k] = Interpreter.Interpreter_intStack[k + (-964267539 * Interpreter.Interpreter_intStackSize - script4.intArgumentCount * -1203198865)];
                                    }
                                    for (int l = 0; l < 1178893217 * script4.stringArgumentCount; ++l) {
                                        if (n4 <= 580935873) {
                                            return;
                                        }
                                        interpreter_stringLocals[l] = Interpreter.Interpreter_stringStack[l + (-2017760987 * SecureRandomCallable.Interpreter_stringStackSize - script4.stringArgumentCount * 1178893217)];
                                    }
                                    Interpreter.Interpreter_intStackSize -= script4.intArgumentCount * -1927162805;
                                    SecureRandomCallable.Interpreter_stringStackSize -= script4.stringArgumentCount * 2141738445;
                                    final ScriptFrame scriptFrame2 = new ScriptFrame();
                                    scriptFrame2.script = script;
                                    scriptFrame2.pc = n5 * -1031782053;
                                    scriptFrame2.intLocals = Interpreter.Interpreter_intLocals;
                                    scriptFrame2.stringLocals = Interpreter.Interpreter_stringLocals;
                                    Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth += 937402633) * -1968816839 - 1] = scriptFrame2;
                                    final Script script5 = script4;
                                    Client.gr(script5);
                                    script = script5;
                                    array = script.opcodes;
                                    array2 = script.intOperands;
                                    n5 = (Client.xh = -1);
                                    Interpreter.Interpreter_intLocals = interpreter_intLocals;
                                    Interpreter.Interpreter_stringLocals = interpreter_stringLocals;
                                }
                                else if (i == 42) {
                                    if (n4 <= 580935873) {
                                        return;
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Varcs.dy(class373.varcs, array2[n5], 721184906);
                                }
                                else if (43 == i) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    Varcs.cr(class373.varcs, array2[n5], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1427050414);
                                }
                                else if (44 == i) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    final int n16 = array2[n5] >> 16;
                                    final int n17 = array2[n5] & 0xFFFF;
                                    final int n18 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    if (n18 >= 0) {
                                        if (n18 <= 5000) {
                                            Interpreter.Interpreter_arrayLengths[n16] = n18;
                                            int n19 = -1;
                                            if (105 == n17) {
                                                if (n4 <= 580935873) {
                                                    return;
                                                }
                                                n19 = 0;
                                            }
                                            for (int n20 = 0; n20 < n18; ++n20) {
                                                if (n4 <= 580935873) {
                                                    return;
                                                }
                                                Interpreter.Interpreter_arrays[n16][n20] = n19;
                                            }
                                            continue;
                                        }
                                        if (n4 <= 580935873) {
                                            return;
                                        }
                                    }
                                    throw new RuntimeException();
                                }
                                else {
                                    if (i == 45) {
                                        final int n21 = array2[n5];
                                        final int n22 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                        if (n22 >= 0) {
                                            if (n4 <= 580935873) {
                                                return;
                                            }
                                            if (n22 < Interpreter.Interpreter_arrayLengths[n21]) {
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_arrays[n21][n22];
                                                continue;
                                            }
                                            if (n4 <= 580935873) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        throw new RuntimeException();
                                    }
                                    if (46 == i) {
                                        if (n4 <= 580935873) {
                                            return;
                                        }
                                        final int n23 = array2[n5];
                                        Interpreter.Interpreter_intStackSize -= 854271946;
                                        final int n24 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                                        if (n24 >= 0) {
                                            if (n4 <= 580935873) {
                                                throw new IllegalStateException();
                                            }
                                            if (n24 < Interpreter.Interpreter_arrayLengths[n23]) {
                                                Interpreter.Interpreter_arrays[n23][n24] = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                                                continue;
                                            }
                                            if (n4 <= 580935873) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        throw new RuntimeException();
                                    }
                                    else if (i == 47) {
                                        String s = class373.varcs.getStringOld(array2[n5], (byte)8);
                                        if (s == null) {
                                            if (n4 <= 580935873) {
                                                return;
                                            }
                                            s = Strings.at;
                                        }
                                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s;
                                    }
                                    else if (i == 48) {
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        class373.varcs.setStringOld(array2[n5], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -1623165865);
                                    }
                                    else if (49 == i) {
                                        if (n4 <= 580935873) {
                                            return;
                                        }
                                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class373.varcs.getString(array2[n5], -1231946680);
                                    }
                                    else if (i == 50) {
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        class373.varcs.setString(array2[n5], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -875468987);
                                    }
                                    else if (60 == i) {
                                        final IntegerNode integerNode = (IntegerNode)script.switches[array2[n5]].aa(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                                        if (null == integerNode) {
                                            continue;
                                        }
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        n5 = (Client.xh = n5 + integerNode.integer);
                                    }
                                    else if (74 == i) {
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        final Integer titleGroupValue = class133.field1286.getTitleGroupValue(array2[n5], (byte)(-112));
                                        if (null == titleGroupValue) {
                                            if (n4 <= 580935873) {
                                                return;
                                            }
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
                                        if (n4 <= 580935873) {
                                            throw new IllegalStateException();
                                        }
                                        final Integer value = Players.varclan.method2273(array2[n5], (short)1758);
                                        if (value == null) {
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                        }
                                        else {
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = value;
                                        }
                                    }
                                }
                            }
                            else {
                                boolean b;
                                if (1 == script.intOperands[n5]) {
                                    if (n4 <= 580935873) {
                                        return;
                                    }
                                    b = true;
                                }
                                else {
                                    b = false;
                                }
                                switch (class33.method152(i, script, b, (byte)(-101))) {
                                    case 1: {
                                        continue;
                                    }
                                    case 2: {
                                        throw new IllegalStateException();
                                    }
                                    case 0: {
                                        while (Interpreter.field690.size() > 0) {
                                            if (n4 <= 580935873) {
                                                throw new IllegalStateException();
                                            }
                                            final class97 class98 = Interpreter.field690.remove(0);
                                            Message.widgetDefaultMenuAction(class98.method615((byte)(-73)), class97.hr(class98, -1967011667), class98.method614((byte)7), class98.method616(1809767943), "", 1238902143);
                                        }
                                        if (Interpreter.field700) {
                                            Interpreter.field700 = false;
                                            class148.method844(1718632338);
                                        }
                                        if (n6 == 0) {
                                            if (n4 <= 580935873) {
                                                throw new IllegalStateException();
                                            }
                                            if (n2 > 0) {
                                                if (n4 <= 580935873) {
                                                    throw new IllegalStateException();
                                                }
                                                if (n7 >= n2) {
                                                    class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n7 + " of max " + n, null, (byte)8);
                                                }
                                            }
                                        }
                                        return;
                                    }
                                    default: {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (n4 > 580935873) {
                            throw new RuntimeException();
                        }
                    }
                    catch (Exception ex2) {
                        n6 = 1;
                        final StringBuilder sb = new StringBuilder(30);
                        sb.append("").append(script.hr).append(" ");
                        for (int n25 = -1968816839 * Interpreter.Interpreter_frameDepth - 1; n25 >= 0; --n25) {
                            sb.append("").append(Interpreter.Interpreter_frames[n25].script.hr).append(" ");
                        }
                        sb.append("").append(i);
                        class387.RunException_sendStackTrace(sb.toString(), ex2, (byte)8);
                        while (Interpreter.field690.size() > 0) {
                            if (n4 <= 580935873) {
                                throw new IllegalStateException();
                            }
                            final class97 class99 = Interpreter.field690.remove(0);
                            Message.widgetDefaultMenuAction(class99.method615((byte)(-4)), class97.hr(class99, -1384589700), class99.method614((byte)7), class99.method616(1869203767), "", 1238902143);
                        }
                        if (Interpreter.field700) {
                            Interpreter.field700 = false;
                            class148.method844(-1616046983);
                        }
                        if (n6 == 0) {
                            if (n4 <= 580935873) {
                                throw new IllegalStateException();
                            }
                            if (n2 > 0) {
                                if (n4 <= 580935873) {
                                    throw new IllegalStateException();
                                }
                                if (n7 >= n2) {
                                    if (n4 > 580935873) {
                                        class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n7 + " of max " + n, null, (byte)8);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        while (Interpreter.field690.size() > 0) {
                            if (n4 <= 580935873) {
                                return;
                            }
                            final class97 class100 = Interpreter.field690.remove(0);
                            Message.widgetDefaultMenuAction(class100.method615((byte)(-112)), class97.hr(class100, -1880152779), class100.method614((byte)7), class100.method616(2047344051), "", 1238902143);
                        }
                        if (Interpreter.field700) {
                            if (n4 <= 580935873) {
                                throw new IllegalStateException();
                            }
                            Interpreter.field700 = false;
                            class148.method844(3681980);
                        }
                        if (n6 == 0) {
                            if (n4 <= 580935873) {
                                throw new IllegalStateException();
                            }
                            if (n2 > 0) {
                                if (n4 <= 580935873) {
                                    throw new IllegalStateException();
                                }
                                if (n7 >= n2) {
                                    if (n4 <= 580935873) {
                                        throw new IllegalStateException();
                                    }
                                    class387.RunException_sendStackTrace("Warning: Script " + script.field794 + " finished at op count " + n7 + " of max " + n, null, (byte)8);
                                }
                            }
                        }
                    }
                }
            }
            catch (RuntimeException ex3) {
                throw HealthBar.get(ex3, "nz.an(" + ')');
            }
        }
        finally {
            Client.od = null;
        }
    }
    
    public int runScript() {
        return this.id * -897643501;
    }
    
    @Override
    public int ac() {
        return this.id * -897643501;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.id * -897643501;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nz.af(" + ')');
        }
    }
    
    public static PlayerType[] ab() {
        return new PlayerType[] { PlayerType.PlayerType_ironman, PlayerType.PlayerType_normal, PlayerType.field3434, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field3440, PlayerType.field3430, PlayerType.field3433, PlayerType.field3439, PlayerType.field3444, PlayerType.field3432, PlayerType.field3437, PlayerType.PlayerType_playerModerator, PlayerType.field3436, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3431, PlayerType.field3428 };
    }
    
    public static PlayerType[] aq() {
        return new PlayerType[] { PlayerType.PlayerType_ironman, PlayerType.PlayerType_normal, PlayerType.field3434, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field3440, PlayerType.field3430, PlayerType.field3433, PlayerType.field3439, PlayerType.field3444, PlayerType.field3432, PlayerType.field3437, PlayerType.PlayerType_playerModerator, PlayerType.field3436, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3431, PlayerType.field3428 };
    }
}
