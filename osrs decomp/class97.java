// 
// Decompiled by Procyon v0.5.36
// 

public class class97
{
    int field1065;
    int field1066;
    int field1067;
    public static int[] SpriteBuffer_spriteWidths;
    int field1069;
    
    class97(final int n, final int n2, final int n3, final int n4) {
        this.field1069 = -543519 * n;
        this.field1066 = n2 * -1866616233;
        this.field1067 = -942287985 * n3;
        this.field1065 = n4 * 1074949955;
    }
    
    int ao() {
        return -1357124753 * this.field1067;
    }
    
    int at() {
        return this.field1066 * 154636657;
    }
    
    public static int le(final class97 class97) {
        if (class97 == null) {
            class97.ax();
        }
        return -1155522326 * class97.field1065;
    }
    
    int ax() {
        return -791479051 * this.field1067;
    }
    
    int ay() {
        return this.field1066 * 446388583;
    }
    
    int method614(final byte b) {
        try {
            return -1357124753 * this.field1067;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dd.aw(" + ')');
        }
    }
    
    int al() {
        return this.field1066 * 446388583;
    }
    
    public static int hr(final class97 class97, final int n) {
        if (class97 == null) {
            return class97.method613(n);
        }
        try {
            return class97.field1066 * 446388583;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dd.an(" + ')');
        }
    }
    
    int method613(final int n) {
        try {
            return this.field1067 * 446388583;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dd.an(" + ')');
        }
    }
    
    int method616(final int n) {
        try {
            return 1073288555 * this.field1065;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dd.ac(" + ')');
        }
    }
    
    int au() {
        return 2080935713 * this.field1069;
    }
    
    int aa() {
        return this.field1066 * 446388583;
    }
    
    int ai() {
        return -1357124753 * this.field1067;
    }
    
    int method615(final byte b) {
        try {
            return 2080935713 * this.field1069;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dd.af(" + ')');
        }
    }
    
    static int method615(final int n, int n2, final int n3) {
        try {
            if (-2 == n) {
                if (n3 <= 427135973) {
                    throw new IllegalStateException();
                }
                return 12345678;
            }
            else {
                if (-1 == n) {
                    if (n2 < 0) {
                        if (n3 <= 427135973) {
                            throw new IllegalStateException();
                        }
                        n2 = 0;
                    }
                    else if (n2 > 127) {
                        if (n3 <= 427135973) {
                            throw new IllegalStateException();
                        }
                        n2 = 127;
                    }
                    n2 = 127 - n2;
                    return n2;
                }
                n2 = (n & 0x7F) * n2 / 128;
                if (n2 < 2) {
                    if (n3 <= 427135973) {
                        throw new IllegalStateException();
                    }
                    n2 = 2;
                }
                else if (n2 > 126) {
                    n2 = 126;
                }
                return n2 + (n & 0xFF80);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dd.af(" + ')');
        }
    }
    
    int ab() {
        return 516164431 * this.field1069;
    }
    
    int aq() {
        return 2080935713 * this.field1069;
    }
}
