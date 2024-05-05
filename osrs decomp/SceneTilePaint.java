// 
// Decompiled by Procyon v0.5.36
// 

public final class SceneTilePaint implements net.runelite.api.SceneTilePaint
{
    int neColor;
    int seColor;
    public int ny;
    int swColor;
    public int yw;
    public int fm;
    int nwColor;
    int texture;
    boolean isFlat;
    int rgb;
    
    SceneTilePaint(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean isFlat) {
        this.isFlat = true;
        this.swColor = n * 1110698183;
        this.seColor = 450282055 * n2;
        this.neColor = n3 * -615792113;
        this.nwColor = n4 * 1943953885;
        this.texture = 1567743091 * n5;
        this.rgb = 810771411 * n6;
        this.isFlat = isFlat;
    }
    
    static int method1347(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (n == 2700) {
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2006098851 * class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5).itemId;
                return 1;
            }
            if (n == 2701) {
                if (b2 <= 5) {
                    throw new IllegalStateException();
                }
                final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
                if (vmethod3380.itemId * -2006098851 != -1) {
                    if (b2 <= 5) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.itemQuantity * 1336975799;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            else if (2702 == n) {
                if (b2 <= 5) {
                    throw new IllegalStateException();
                }
                if (null != Client.interfaceParents.at(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539])) {
                    if (b2 <= 5) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            else if (2706 == n) {
                if (b2 <= 5) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.rootInterface * -896157613;
                return 1;
            }
            else {
                if (2707 == n) {
                    final Widget vmethod3381 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
                    final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                    final int n2 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b3;
                    if (vmethod3381.method1807(-885789044)) {
                        if (b2 <= 5) {
                            throw new IllegalStateException();
                        }
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    interpreter_intStack[n2] = (b3 ? 1 : 0);
                    return 1;
                }
                if (2708 == n) {
                    if (b2 <= 5) {
                        throw new IllegalStateException();
                    }
                    return BufferedSource.method2214(class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5), 734574746);
                }
                else {
                    if (n != 2709) {
                        return 2;
                    }
                    if (b2 <= 5) {
                        throw new IllegalStateException();
                    }
                    return class4.method11(class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5), -1582872592);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jc.ak(" + ')');
        }
    }
    
    public static int ms(final Buffer buffer) {
        if (buffer == null) {
            buffer.lf();
        }
        buffer.offset += 1262255402;
        return ((buffer.array[675891237 * buffer.offset - 2] & 0x50E54EEE) << 8) + (buffer.array[buffer.offset * -1633313603 - 1] - 128 & 0x3F64FAE0);
    }
    
    public static String readString(final Buffer buffer, final byte b) {
        try {
            String decodeStringCp1252;
            try {
                int uShortSmart = buffer.readUShortSmart(-75801365);
                if (uShortSmart > 32767) {
                    if (b <= 4) {
                        throw new IllegalStateException();
                    }
                    uShortSmart = 32767;
                }
                final byte[] array = new byte[uShortSmart];
                buffer.offset += class319.huffman.decompress(buffer.array, -1633313603 * buffer.offset, array, 0, uShortSmart, -977933945) * -1516355947;
                decodeStringCp1252 = Buffer.decodeStringCp1252(array, 0, uShortSmart, 178594756);
            }
            catch (Exception ex2) {
                decodeStringCp1252 = "Cabbage";
            }
            return decodeStringCp1252;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jc.aw(" + ')');
        }
    }
    
    public int getBufferOffset() {
        return this.ny;
    }
    
    static final void insertMenuItem(final String s, final String s2, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b, final byte b2) {
        try {
            if (!Client.isMenuOpen) {
                if (Client.menuOptionsCount * 730065501 < 500) {
                    if (b2 <= 5) {
                        throw new IllegalStateException();
                    }
                    Client.menuActions[730065501 * Client.menuOptionsCount] = s;
                    Client.menuTargets[Client.menuOptionsCount * 730065501] = s2;
                    Client.menuOpcodes[730065501 * Client.menuOptionsCount] = n;
                    Client.menuIdentifiers[730065501 * Client.menuOptionsCount] = n2;
                    Client.menuArguments1[Client.menuOptionsCount * 730065501] = n3;
                    Client.menuArguments2[730065501 * Client.menuOptionsCount] = n4;
                    Client.menuItemIds[Client.menuOptionsCount * 730065501] = n5;
                    Client.menuShiftClick[730065501 * Client.menuOptionsCount] = b;
                    Client.menuOptionsCount += 1153055221;
                    Client.un(-1);
                }
                return;
            }
            if (b2 <= 5) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jc.lv(" + ')');
        }
    }
    
    public int getRBG() {
        return this.rgb * -2143818661;
    }
    
    public void setBufferOffset(final int ny) {
        this.ny = ny;
    }
    
    public void setUvBufferOffset(final int yw) {
        this.yw = yw;
    }
    
    public void setBufferLen(final int fm) {
        this.fm = fm;
    }
    
    public int getUvBufferOffset() {
        return this.yw;
    }
    
    public int getBufferLen() {
        return this.fm;
    }
    
    public int getNwColor() {
        return this.nwColor * 890568309;
    }
    
    public int getNeColor() {
        return this.neColor * -1667175185;
    }
    
    public int getSwColor() {
        return this.swColor * 1860851959;
    }
    
    public int getSeColor() {
        return this.seColor * 40257399;
    }
    
    public int getTexture() {
        return this.texture * 412494011;
    }
}
