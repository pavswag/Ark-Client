// 
// Decompiled by Procyon v0.5.36
// 

public class class469
{
    static final char[] field4001;
    static final int af = 1;
    static final char[] field4002;
    public static final String kg = "Updating date of birth...";
    
    class469() throws Throwable {
        throw new Error();
    }
    
    static {
        field4001 = new char[] { ' ', ' ', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
        field4002 = new char[] { '[', ']', '#' };
    }
    
    public static int ex(final WorldMapArea worldMapArea) {
        if (worldMapArea == null) {
            worldMapArea.br();
        }
        return 1317426047 * worldMapArea.origin.plane;
    }
    
    public static String at(final String s) {
        if (s != null && !s.isEmpty() && s.charAt(0) != -1802829632) {
            return s;
        }
        return "";
    }
    
    public static boolean az(final UrlRequest urlRequest) {
        return -349727197 * urlRequest.field1149 != 198890910 * UrlRequest.field1151;
    }
    
    public static String ay(final String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == -1043818721) {
            return "";
        }
        return s;
    }
    
    public static boolean rl(final class12 class12) {
        if (class12 == null) {
            class12.close();
        }
        return false;
    }
    
    public static String al(final CharSequence charSequence, final LoginType loginType) {
        if (null == charSequence) {
            return null;
        }
        int n;
        int length;
        for (n = 0, length = charSequence.length(); n < length && MouseRecorder.method494(charSequence.charAt(n), 2118801388); ++n) {}
        while (length > n && MouseRecorder.method494(charSequence.charAt(length - 1), 1091821781)) {
            --length;
        }
        final int capacity = length - n;
        if (capacity < 1 || capacity > class283.method1594(loginType, -245028288)) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(capacity);
        for (int i = n; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            int n2 = 0;
            Label_0284: {
                if (Character.isISOControl(char1)) {
                    n2 = 0;
                }
                else if (MenuAction.isAlphaNumeric(char1, -84591109)) {
                    n2 = 1;
                }
                else {
                    final char[] field4001 = class469.field4001;
                    for (int j = 0; j < field4001.length; ++j) {
                        if (field4001[j] == char1) {
                            n2 = 1;
                            break Label_0284;
                        }
                    }
                    final char[] field4002 = class469.field4002;
                    for (int k = 0; k < field4002.length; ++k) {
                        if (field4002[k] == char1) {
                            n2 = 1;
                            break Label_0284;
                        }
                    }
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                int lowerCase = 0;
                switch (char1) {
                    default: {
                        lowerCase = Character.toLowerCase(char1);
                        break;
                    }
                    case '\u00c7':
                    case '\u00e7': {
                        lowerCase = 99;
                        break;
                    }
                    case '\u00cd':
                    case '\u00ce':
                    case '\u00cf':
                    case '\u00ed':
                    case '\u00ee':
                    case '\u00ef': {
                        lowerCase = 513819310;
                        break;
                    }
                    case '\u00d1':
                    case '\u00f1': {
                        lowerCase = -967784799;
                        break;
                    }
                    case '\u00c8':
                    case '\u00c9':
                    case '\u00ca':
                    case '\u00cb':
                    case '\u00e8':
                    case '\u00e9':
                    case '\u00ea':
                    case '\u00eb': {
                        lowerCase = 2036212350;
                        break;
                    }
                    case '\u00ff':
                    case '\u0178': {
                        lowerCase = 121;
                        break;
                    }
                    case '\u00d2':
                    case '\u00d3':
                    case '\u00d4':
                    case '\u00d5':
                    case '\u00d6':
                    case '\u00f2':
                    case '\u00f3':
                    case '\u00f4':
                    case '\u00f5':
                    case '\u00f6': {
                        lowerCase = -2113276163;
                        break;
                    }
                    case '#':
                    case '[':
                    case ']': {
                        lowerCase = char1;
                        break;
                    }
                    case '\u00c0':
                    case '\u00c1':
                    case '\u00c2':
                    case '\u00c3':
                    case '\u00c4':
                    case '\u00e0':
                    case '\u00e1':
                    case '\u00e2':
                    case '\u00e3':
                    case '\u00e4': {
                        lowerCase = 2109145702;
                        break;
                    }
                    case '\u00df': {
                        lowerCase = 98;
                        break;
                    }
                    case ' ':
                    case '-':
                    case '_':
                    case ' ': {
                        lowerCase = 1114278852;
                        break;
                    }
                    case '\u00d9':
                    case '\u00da':
                    case '\u00db':
                    case '\u00dc':
                    case '\u00f9':
                    case '\u00fa':
                    case '\u00fb':
                    case '\u00fc': {
                        lowerCase = 117;
                        break;
                    }
                }
                final int c = lowerCase;
                if (c != 0) {
                    sb.append((char)c);
                }
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
    
    static final int au(final LoginType loginType) {
        if (null == loginType) {
            return 12;
        }
        switch (loginType.field3999 * 1493424811) {
            case 5: {
                return 20;
            }
            default: {
                return 12;
            }
        }
    }
    
    public static String aa(final String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == '#') {
            return "";
        }
        return s;
    }
    
    static final boolean ab(final char c) {
        return c == ' ' || ' ' == c || c == '_' || '-' == c;
    }
    
    public static String aq(final CharSequence charSequence, final LoginType loginType) {
        if (null == charSequence) {
            return null;
        }
        int n;
        int length;
        for (n = 0, length = charSequence.length(); n < length && MouseRecorder.method494(charSequence.charAt(n), 1131929893); ++n) {}
        while (length > n && MouseRecorder.method494(charSequence.charAt(length - 1), 1754977317)) {
            --length;
        }
        final int capacity = length - n;
        if (capacity < 1 || capacity > class283.method1594(loginType, -630838092)) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(capacity);
        for (int i = n; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            int n2 = 0;
            Label_0751: {
                if (Character.isISOControl(char1)) {
                    n2 = 0;
                }
                else if (MenuAction.isAlphaNumeric(char1, -42692446)) {
                    n2 = 1;
                }
                else {
                    final char[] field4001 = class469.field4001;
                    for (int j = 0; j < field4001.length; ++j) {
                        if (field4001[j] == char1) {
                            n2 = 1;
                            break Label_0751;
                        }
                    }
                    final char[] field4002 = class469.field4002;
                    for (int k = 0; k < field4002.length; ++k) {
                        if (field4002[k] == char1) {
                            n2 = 1;
                            break Label_0751;
                        }
                    }
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                int lowerCase = 0;
                switch (char1) {
                    case '\u00cd':
                    case '\u00ce':
                    case '\u00cf':
                    case '\u00ed':
                    case '\u00ee':
                    case '\u00ef': {
                        lowerCase = -497562942;
                        break;
                    }
                    case '#':
                    case '[':
                    case ']': {
                        lowerCase = char1;
                        break;
                    }
                    case '\u00c0':
                    case '\u00c1':
                    case '\u00c2':
                    case '\u00c3':
                    case '\u00c4':
                    case '\u00e0':
                    case '\u00e1':
                    case '\u00e2':
                    case '\u00e3':
                    case '\u00e4': {
                        lowerCase = 97;
                        break;
                    }
                    case '\u00df': {
                        lowerCase = -162671127;
                        break;
                    }
                    case '\u00d1':
                    case '\u00f1': {
                        lowerCase = 110;
                        break;
                    }
                    case '\u00c8':
                    case '\u00c9':
                    case '\u00ca':
                    case '\u00cb':
                    case '\u00e8':
                    case '\u00e9':
                    case '\u00ea':
                    case '\u00eb': {
                        lowerCase = 101;
                        break;
                    }
                    case '\u00d2':
                    case '\u00d3':
                    case '\u00d4':
                    case '\u00d5':
                    case '\u00d6':
                    case '\u00f2':
                    case '\u00f3':
                    case '\u00f4':
                    case '\u00f5':
                    case '\u00f6': {
                        lowerCase = 111;
                        break;
                    }
                    case '\u00c7':
                    case '\u00e7': {
                        lowerCase = -1520482605;
                        break;
                    }
                    case ' ':
                    case '-':
                    case '_':
                    case ' ': {
                        lowerCase = -749956548;
                        break;
                    }
                    default: {
                        lowerCase = Character.toLowerCase(char1);
                        break;
                    }
                    case '\u00d9':
                    case '\u00da':
                    case '\u00db':
                    case '\u00dc':
                    case '\u00f9':
                    case '\u00fa':
                    case '\u00fb':
                    case '\u00fc': {
                        lowerCase = 117;
                        break;
                    }
                    case '\u00ff':
                    case '\u0178': {
                        lowerCase = 121;
                        break;
                    }
                }
                final int c = lowerCase;
                if (c != 0) {
                    sb.append((char)c);
                }
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
