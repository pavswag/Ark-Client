import java.math.BigInteger;

// 
// Decompiled by Procyon v0.5.36
// 

public class class70
{
    static final int bx = 19136911;
    static final BigInteger field726;
    static final int bt = 51;
    static final BigInteger field727;
    static LoginType loginType;
    
    class70() throws Throwable {
        throw new Error();
    }
    
    static {
        field726 = new BigInteger("10001", 16);
        field727 = new BigInteger("caa2a7bee781b3652a5a550b5318cb074141ad9dbd06389622fbd58a3947aeb27e79771809fb6e20de92d7cdbe34830805ebad9bb17640a45878eea57edbb1d808a6122150c097b7a4960054ccc5e98fc0a139709f6f1a3dbf0bfc4559d63ba568b3860a7d477756bd21bb37f989b4522af2d3ee6af1781654acbafd740072c1", 16);
    }
    
    static double method443(final int n, final int n2, final int n3, final int n4) {
        try {
            double n5;
            if (n2 > 0) {
                if (n4 >= 759235360) {
                    throw new IllegalStateException();
                }
                n5 = Math.max(0.0f, Math.min(1.0f, n / (float)n2));
            }
            else {
                n5 = 1.0;
            }
            final double a = n5;
            if (a > 0.0) {
                if (n4 >= 759235360) {
                    throw new IllegalStateException();
                }
                if (a >= 1.0) {
                    if (n4 >= 759235360) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    switch (n3) {
                        case 7: {
                            return a * a * a;
                        }
                        case 5: {
                            return 1.0 - (1.0 - a) * (1.0 - a);
                        }
                        case 15: {
                            double n6;
                            if (a < 0.5) {
                                if (n4 >= 759235360) {
                                    throw new IllegalStateException();
                                }
                                n6 = a * (a * (a * 8.0)) * a * a;
                            }
                            else {
                                n6 = 1.0 - Math.pow(a * -2.0 + 2.0, 5.0) / 2.0;
                            }
                            return n6;
                        }
                        case 21: {
                            double n7;
                            if (a < 0.5) {
                                if (n4 >= 759235360) {
                                    throw new IllegalStateException();
                                }
                                n7 = (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * a, 2.0))) / 2.0;
                            }
                            else {
                                n7 = (Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * a, 2.0)) + 1.0) / 2.0;
                            }
                            return n7;
                        }
                        case 10: {
                            return a * (a * a * a);
                        }
                        case 4: {
                            return a * a;
                        }
                        case 2: {
                            return Math.sin(a * 3.141592653589793 / 2.0);
                        }
                        case 1: {
                            return 1.0 - Math.cos(3.141592653589793 * a / 2.0);
                        }
                        case 24: {
                            double n8;
                            if (a < 0.5) {
                                if (n4 >= 759235360) {
                                    throw new IllegalStateException();
                                }
                                n8 = Math.pow(2.0 * a, 2.0) * (7.189819 * a - 2.5949095) / 2.0;
                            }
                            else {
                                n8 = (Math.pow(a * 2.0 - 2.0, 2.0) * (2.5949095 + (a * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0;
                            }
                            return n8;
                        }
                        case 8: {
                            return 1.0 - Math.pow(1.0 - a, 3.0);
                        }
                        case 13: {
                            return a * (a * (a * a)) * a;
                        }
                        case 22: {
                            return a * 2.70158 * a * a - 1.70158 * a * a;
                        }
                        case 12: {
                            double n9;
                            if (a < 0.5) {
                                if (n4 >= 759235360) {
                                    throw new IllegalStateException();
                                }
                                n9 = a * (a * (a * (a * 8.0)));
                            }
                            else {
                                n9 = 1.0 - Math.pow(a * -2.0 + 2.0, 4.0) / 2.0;
                            }
                            return n9;
                        }
                        case 23: {
                            return 1.0 + 2.70158 * Math.pow(a - 1.0, 3.0) + 1.70158 * Math.pow(a - 1.0, 2.0);
                        }
                        case 20: {
                            return Math.sqrt(1.0 - Math.pow(a - 1.0, 2.0));
                        }
                        case 6: {
                            double n10;
                            if (a < 0.5) {
                                if (n4 >= 759235360) {
                                    throw new IllegalStateException();
                                }
                                n10 = a * (a * 2.0);
                            }
                            else {
                                n10 = 1.0 - Math.pow(2.0 + a * -2.0, 2.0) / 2.0;
                            }
                            return n10;
                        }
                        case 18: {
                            double n11;
                            if (a < 0.5) {
                                if (n4 >= 759235360) {
                                    throw new IllegalStateException();
                                }
                                n11 = Math.pow(2.0, 20.0 * a + 10.0) / 2.0;
                            }
                            else {
                                n11 = (2.0 - Math.pow(2.0, 10.0 + a * -20.0)) / 2.0;
                            }
                            return n11;
                        }
                        case 17: {
                            return 1.0 - Math.pow(2.0, a * -10.0);
                        }
                        case 26: {
                            return Math.pow(2.0, -10.0 * a) * Math.sin((a * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
                        }
                        case 27: {
                            final double sin = Math.sin((20.0 * a - 11.125) * 1.3962634015954636);
                            double n12;
                            if (a < 0.5) {
                                if (n4 >= 759235360) {
                                    throw new IllegalStateException();
                                }
                                n12 = -(Math.pow(2.0, a * 20.0 - 10.0) * sin) / 2.0;
                            }
                            else {
                                n12 = Math.pow(2.0, -20.0 * a + 10.0) * sin / 2.0 + 1.0;
                            }
                            return n12;
                        }
                        case 14: {
                            return 1.0 - Math.pow(1.0 - a, 5.0);
                        }
                        case 19: {
                            return 1.0 - Math.sqrt(1.0 - Math.pow(a, 2.0));
                        }
                        case 11: {
                            return 1.0 - Math.pow(1.0 - a, 4.0);
                        }
                        case 16: {
                            return Math.pow(2.0, a * 10.0 - 10.0);
                        }
                        case 25: {
                            return -Math.pow(2.0, a * 10.0 - 10.0) * Math.sin((10.0 * a - 10.75) * 2.0943951023931953);
                        }
                        case 3: {
                            return -(Math.cos(a * 3.141592653589793) - 1.0) / 2.0;
                        }
                        case 0: {
                            return a;
                        }
                        case 9: {
                            double n13;
                            if (a < 0.5) {
                                if (n4 >= 759235360) {
                                    throw new IllegalStateException();
                                }
                                n13 = 4.0 * a * a * a;
                            }
                            else {
                                n13 = 1.0 - Math.pow(2.0 + -2.0 * a, 3.0) / 2.0;
                            }
                            return n13;
                        }
                        default: {
                            return a;
                        }
                    }
                }
            }
            double n14;
            if (a <= 0.0) {
                if (n4 >= 759235360) {
                    throw new IllegalStateException();
                }
                n14 = 0.0;
            }
            else {
                n14 = 1.0;
            }
            return n14;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "co.ao(" + ')');
        }
    }
    
    public static boolean fh(final ClanMate clanMate) {
        if (clanMate.friend == TriBool.TriBool_unknown) {
            clanMate.fillIsFriend(63858880);
        }
        return clanMate.friend == TriBool.TriBool_true;
    }
    
    public static int method442(int n, final int n2) {
        try {
            --n;
            n |= n >>> 1;
            n |= n >>> 2;
            n |= n >>> 4;
            n |= n >>> 8;
            n |= n >>> 16;
            return n + 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "co.ab(" + ')');
        }
    }
}
