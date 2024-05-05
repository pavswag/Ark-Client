// 
// Decompiled by Procyon v0.5.36
// 

public class class441
{
    static int[] field3833;
    static int[] field3834;
    public static int field3835;
    static final int ao = 60;
    static final int aa = 4;
    public static final int as = 2;
    
    class441() throws Throwable {
        throw new Error();
    }
    
    static {
        class441.field3834 = new int[32768];
        for (int i = 0; i < 32768; ++i) {
            final int[] field3834 = class441.field3834;
            final int n = i;
            final double n2 = (i >> 10 & 0x1F) / 31.0;
            final double n3 = (i >> 5 & 0x1F) / 31.0;
            final double n4 = (i & 0x1F) / 31.0;
            double n5 = n2;
            if (n3 < n5) {
                n5 = n3;
            }
            if (n4 < n5) {
                n5 = n4;
            }
            double n6 = n2;
            if (n3 > n6) {
                n6 = n3;
            }
            if (n4 > n6) {
                n6 = n4;
            }
            double n7 = 0.0;
            double n8 = 0.0;
            double n9 = (n5 + n6) / 2.0;
            if (n5 != n6) {
                if (n9 < 0.5) {
                    n8 = (n6 - n5) / (n5 + n6);
                }
                if (n9 >= 0.5) {
                    n8 = (n6 - n5) / (2.0 - n6 - n5);
                }
                if (n2 == n6) {
                    n7 = (n3 - n4) / (n6 - n5);
                }
                else if (n3 == n6) {
                    n7 = 2.0 + (n4 - n2) / (n6 - n5);
                }
                else if (n6 == n4) {
                    n7 = (n2 - n3) / (n6 - n5) + 4.0;
                }
            }
            final int n10 = (int)(n7 * 256.0 / 6.0) & 0xFF;
            double n11 = n8 * 256.0;
            if (n11 < 0.0) {
                n11 = 0.0;
            }
            else if (n11 > 255.0) {
                n11 = 255.0;
            }
            if (n9 > 0.7) {
                n11 = Math.floor(n11 / 2.0);
            }
            if (n9 > 0.75) {
                n11 = Math.floor(n11 / 2.0);
            }
            if (n9 > 0.85) {
                n11 = Math.floor(n11 / 2.0);
            }
            if (n9 > 0.95) {
                n11 = Math.floor(n11 / 2.0);
            }
            if (n9 > 0.995) {
                n9 = 0.995;
            }
            field3834[n] = (int)(n9 * 128.0) + ((int)(n11 / 32.0 + n10 / 4 * 8) << 7);
        }
        UserComparator9.compareBuddy(-798861149);
    }
    
    public static void qk(final ClanMate clanMate) {
        clanMate.ignored = (World.friendSystem.ignoreList.bt(clanMate.aw, -1491232963) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    static void aw() {
        if (class441.field3833 != null) {
            return;
        }
        class441.field3833 = new int[65536];
        final double b = 0.949999988079071;
        for (int i = 0; i < 65536; ++i) {
            final double n = 0.0078125 + (i >> 10 & 0xD2F1D24D) / 64.0;
            final double n2 = (i >> 7 & 0x7) / 8.0 + 0.0625;
            double a3;
            double a2;
            double a;
            final double n3 = a = (a2 = (a3 = (i & 0x7F) / 128.0));
            if (n2 != 0.0) {
                double n4;
                if (n3 < 0.5) {
                    n4 = n3 * (1.0 + n2);
                }
                else {
                    n4 = n2 + n3 - n2 * n3;
                }
                final double n5 = n3 * 2.0 - n4;
                double n6 = 0.3333333333333333 + n;
                if (n6 > 1.0) {
                    --n6;
                }
                final double n7 = n;
                double n8 = n - 0.3333333333333333;
                if (n8 < 0.0) {
                    ++n8;
                }
                if (6.0 * n6 < 1.0) {
                    a3 = n5 + n6 * (6.0 * (n4 - n5));
                }
                else if (n6 * 2.0 < 1.0) {
                    a3 = n4;
                }
                else if (3.0 * n6 < 2.0) {
                    a3 = n5 + 6.0 * ((n4 - n5) * (0.6666666666666666 - n6));
                }
                else {
                    a3 = n5;
                }
                if (6.0 * n7 < 1.0) {
                    a2 = 6.0 * (n4 - n5) * n7 + n5;
                }
                else if (2.0 * n7 < 1.0) {
                    a2 = n4;
                }
                else if (3.0 * n7 < 2.0) {
                    a2 = (n4 - n5) * (0.6666666666666666 - n7) * 6.0 + n5;
                }
                else {
                    a2 = n5;
                }
                if (n8 * 6.0 < 1.0) {
                    a = n8 * (6.0 * (n4 - n5)) + n5;
                }
                else if (n8 * 2.0 < 1.0) {
                    a = n4;
                }
                else if (3.0 * n8 < 2.0) {
                    a = 6.0 * ((0.6666666666666666 - n8) * (n4 - n5)) + n5;
                }
                else {
                    a = n5;
                }
            }
            class441.field3833[i] = (((int)(256.0 * Math.pow(a3, b)) << 16) + ((int)(Math.pow(a2, b) * 256.0) << 8) + (int)(Math.pow(a, b) * 256.0) & 0xFFFFFF);
        }
    }
    
    static void ac() {
        if (class441.field3833 != null) {
            return;
        }
        class441.field3833 = new int[65536];
        final double b = 0.949999988079071;
        for (int i = 0; i < 65536; ++i) {
            final double n = 0.0078125 + (i >> 10 & 0x3F) / 64.0;
            final double n2 = (i >> 7 & 0x7) / 8.0 + 0.0625;
            double a3;
            double a2;
            double a;
            final double n3 = a = (a2 = (a3 = (i & 0x7F) / 128.0));
            if (n2 != 0.0) {
                double n4;
                if (n3 < 0.5) {
                    n4 = n3 * (1.0 + n2);
                }
                else {
                    n4 = n2 + n3 - n2 * n3;
                }
                final double n5 = n3 * 2.0 - n4;
                double n6 = 0.3333333333333333 + n;
                if (n6 > 1.0) {
                    --n6;
                }
                final double n7 = n;
                double n8 = n - 0.3333333333333333;
                if (n8 < 0.0) {
                    ++n8;
                }
                if (6.0 * n6 < 1.0) {
                    a3 = n5 + n6 * (6.0 * (n4 - n5));
                }
                else if (n6 * 2.0 < 1.0) {
                    a3 = n4;
                }
                else if (3.0 * n6 < 2.0) {
                    a3 = n5 + 6.0 * ((n4 - n5) * (0.6666666666666666 - n6));
                }
                else {
                    a3 = n5;
                }
                if (6.0 * n7 < 1.0) {
                    a2 = 6.0 * (n4 - n5) * n7 + n5;
                }
                else if (2.0 * n7 < 1.0) {
                    a2 = n4;
                }
                else if (3.0 * n7 < 2.0) {
                    a2 = (n4 - n5) * (0.6666666666666666 - n7) * 6.0 + n5;
                }
                else {
                    a2 = n5;
                }
                if (n8 * 6.0 < 1.0) {
                    a = n8 * (6.0 * (n4 - n5)) + n5;
                }
                else if (n8 * 2.0 < 1.0) {
                    a = n4;
                }
                else if (3.0 * n8 < 2.0) {
                    a = 6.0 * ((0.6666666666666666 - n8) * (n4 - n5)) + n5;
                }
                else {
                    a = n5;
                }
            }
            class441.field3833[i] = (((int)(256.0 * Math.pow(a3, b)) << 16) + ((int)(Math.pow(a2, b) * 256.0) << 8) + (int)(Math.pow(a, b) * 256.0) & 0xFFFFFF);
        }
    }
    
    public static int[] zc(final NPCComposition npcComposition) {
        return npcComposition.headIconArchiveIds;
    }
    
    static void au() {
        if (class441.field3833 != null) {
            return;
        }
        class441.field3833 = new int[-592141821];
        final double b = 0.949999988079071;
        for (int i = 0; i < -338233981; ++i) {
            final double n = 0.0078125 + (i >> 10 & 0x53518BBB) / 64.0;
            final double n2 = (i >> 7 & 0x7) / 8.0 + 0.0625;
            double a3;
            double a2;
            double a;
            final double n3 = a = (a2 = (a3 = (i & 0x7F) / 128.0));
            if (n2 != 0.0) {
                double n4;
                if (n3 < 0.5) {
                    n4 = n3 * (1.0 + n2);
                }
                else {
                    n4 = n2 + n3 - n2 * n3;
                }
                final double n5 = n3 * 2.0 - n4;
                double n6 = 0.3333333333333333 + n;
                if (n6 > 1.0) {
                    --n6;
                }
                final double n7 = n;
                double n8 = n - 0.3333333333333333;
                if (n8 < 0.0) {
                    ++n8;
                }
                if (6.0 * n6 < 1.0) {
                    a3 = n5 + n6 * (6.0 * (n4 - n5));
                }
                else if (n6 * 2.0 < 1.0) {
                    a3 = n4;
                }
                else if (3.0 * n6 < 2.0) {
                    a3 = n5 + 6.0 * ((n4 - n5) * (0.6666666666666666 - n6));
                }
                else {
                    a3 = n5;
                }
                if (6.0 * n7 < 1.0) {
                    a2 = 6.0 * (n4 - n5) * n7 + n5;
                }
                else if (2.0 * n7 < 1.0) {
                    a2 = n4;
                }
                else if (3.0 * n7 < 2.0) {
                    a2 = (n4 - n5) * (0.6666666666666666 - n7) * 6.0 + n5;
                }
                else {
                    a2 = n5;
                }
                if (n8 * 6.0 < 1.0) {
                    a = n8 * (6.0 * (n4 - n5)) + n5;
                }
                else if (n8 * 2.0 < 1.0) {
                    a = n4;
                }
                else if (3.0 * n8 < 2.0) {
                    a = 6.0 * ((0.6666666666666666 - n8) * (n4 - n5)) + n5;
                }
                else {
                    a = n5;
                }
            }
            class441.field3833[i] = (((int)(256.0 * Math.pow(a3, b)) << 16) + ((int)(Math.pow(a2, b) * 256.0) << 8) + (int)(Math.pow(a, b) * 256.0) & 0xFFFFFF);
        }
    }
    
    public static int ab(final int n) {
        return 255 - (n & 0xFF);
    }
    
    public static int aq(final int n) {
        return -807600199 - (n & 0x354A22E6);
    }
}
