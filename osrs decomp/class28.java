// 
// Decompiled by Procyon v0.5.36
// 

public class class28
{
    public static final int af = 13;
    static final int pm = 3;
    static final int ab = 5;
    public static final int bj = 48;
    static final int aa = 9;
    static int[] KeyHandler_keyCodes;
    public static final int an = 1;
    static final int bv = 57;
    static Archive archive19;
    static final int at = 8;
    static final int cb = 106;
    public static final int do = 103;
    static PcmPlayer pcmPlayer0;
    public static final int az = 54;
    static int timeOfPreviousKeyPress;
    public static final int ay = 24;
    
    class28() throws Throwable {
        throw new Error();
    }
    
    static {
        class28.KeyHandler_keyCodes = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    }
    
    static void aw() {
        if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            class28.KeyHandler_keyCodes[186] = 57;
            class28.KeyHandler_keyCodes[187] = 27;
            class28.KeyHandler_keyCodes[188] = 71;
            class28.KeyHandler_keyCodes[189] = 26;
            class28.KeyHandler_keyCodes[190] = 72;
            class28.KeyHandler_keyCodes[191] = 73;
            class28.KeyHandler_keyCodes[192] = 58;
            class28.KeyHandler_keyCodes[219] = 42;
            class28.KeyHandler_keyCodes[220] = 74;
            class28.KeyHandler_keyCodes[221] = 43;
            class28.KeyHandler_keyCodes[222] = 59;
            class28.KeyHandler_keyCodes[223] = 28;
        }
        else {
            class28.KeyHandler_keyCodes[44] = 71;
            class28.KeyHandler_keyCodes[45] = 26;
            class28.KeyHandler_keyCodes[46] = 72;
            class28.KeyHandler_keyCodes[47] = 73;
            class28.KeyHandler_keyCodes[59] = 57;
            class28.KeyHandler_keyCodes[61] = 27;
            class28.KeyHandler_keyCodes[91] = 42;
            class28.KeyHandler_keyCodes[92] = 74;
            class28.KeyHandler_keyCodes[93] = 43;
            class28.KeyHandler_keyCodes[192] = 28;
            class28.KeyHandler_keyCodes[222] = 58;
            class28.KeyHandler_keyCodes[520] = 59;
        }
    }
    
    static void ac() {
        if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            class28.KeyHandler_keyCodes[186] = 57;
            class28.KeyHandler_keyCodes[187] = 27;
            class28.KeyHandler_keyCodes[188] = 71;
            class28.KeyHandler_keyCodes[189] = 26;
            class28.KeyHandler_keyCodes[190] = 72;
            class28.KeyHandler_keyCodes[191] = 73;
            class28.KeyHandler_keyCodes[192] = 58;
            class28.KeyHandler_keyCodes[219] = 42;
            class28.KeyHandler_keyCodes[220] = 74;
            class28.KeyHandler_keyCodes[221] = 43;
            class28.KeyHandler_keyCodes[222] = 59;
            class28.KeyHandler_keyCodes[223] = 28;
        }
        else {
            class28.KeyHandler_keyCodes[44] = 71;
            class28.KeyHandler_keyCodes[45] = 26;
            class28.KeyHandler_keyCodes[46] = 72;
            class28.KeyHandler_keyCodes[47] = 73;
            class28.KeyHandler_keyCodes[59] = 57;
            class28.KeyHandler_keyCodes[61] = 27;
            class28.KeyHandler_keyCodes[91] = 42;
            class28.KeyHandler_keyCodes[92] = 74;
            class28.KeyHandler_keyCodes[93] = 43;
            class28.KeyHandler_keyCodes[192] = 28;
            class28.KeyHandler_keyCodes[222] = 58;
            class28.KeyHandler_keyCodes[520] = 59;
        }
    }
    
    static void au() {
        if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            class28.KeyHandler_keyCodes[186] = 57;
            class28.KeyHandler_keyCodes[187] = 27;
            class28.KeyHandler_keyCodes[188] = 71;
            class28.KeyHandler_keyCodes[189] = 26;
            class28.KeyHandler_keyCodes[190] = 72;
            class28.KeyHandler_keyCodes[191] = 73;
            class28.KeyHandler_keyCodes[192] = 58;
            class28.KeyHandler_keyCodes[219] = 42;
            class28.KeyHandler_keyCodes[220] = 74;
            class28.KeyHandler_keyCodes[221] = 43;
            class28.KeyHandler_keyCodes[222] = 59;
            class28.KeyHandler_keyCodes[223] = 28;
        }
        else {
            class28.KeyHandler_keyCodes[44] = 71;
            class28.KeyHandler_keyCodes[45] = 26;
            class28.KeyHandler_keyCodes[46] = 72;
            class28.KeyHandler_keyCodes[47] = 73;
            class28.KeyHandler_keyCodes[59] = 57;
            class28.KeyHandler_keyCodes[61] = 27;
            class28.KeyHandler_keyCodes[91] = 42;
            class28.KeyHandler_keyCodes[92] = 74;
            class28.KeyHandler_keyCodes[93] = 43;
            class28.KeyHandler_keyCodes[192] = 28;
            class28.KeyHandler_keyCodes[222] = 58;
            class28.KeyHandler_keyCodes[520] = 59;
        }
    }
    
    static int ab(final int n) {
        return class28.KeyHandler_keyCodes[n];
    }
    
    static int aq(final int n) {
        return class28.KeyHandler_keyCodes[n];
    }
}
