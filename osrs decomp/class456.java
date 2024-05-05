// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class456
{
    int field3894;
    int field3895;
    int field3896;
    double field3897;
    
    class456(final int n, final int n2) {
        this.field3896 = 0;
        this.field3894 = 0;
        this.field3897 = 0.0;
        this.field3895 = 0;
        this.field3896 = n * -617236073;
        this.field3894 = 0;
        this.field3895 = ((n2 >= 0 && n2 <= 27) ? n2 : 0) * -895713409;
        this.field3897 = class70.method443(this.field3894 * 1095678947, this.field3896 * 71849511, this.field3895 * 570638463, 547022125);
    }
    
    public static double mn(final class456 class456) {
        return class456.field3897;
    }
    
    static double ak(final int n, final int n2, final int n3) {
        final double a = (n2 > 0) ? Math.max(0.0f, Math.min(1.0f, n / (float)n2)) : 1.0;
        if (a <= 0.0 || a >= 1.0) {
            return (a <= 0.0) ? 0.0 : 1.0;
        }
        switch (n3) {
            case 18: {
                return (a < 0.5) ? (Math.pow(2.0, 20.0 * a + 10.0) / 2.0) : ((2.0 - Math.pow(2.0, 10.0 + a * -20.0)) / 2.0);
            }
            case 8: {
                return 1.0 - Math.pow(1.0 - a, 3.0);
            }
            case 26: {
                return Math.pow(2.0, -10.0 * a) * Math.sin((a * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
            }
            case 14: {
                return 1.0 - Math.pow(1.0 - a, 5.0);
            }
            case 2: {
                return Math.sin(a * 3.141592653589793 / 2.0);
            }
            case 10: {
                return a * (a * a * a);
            }
            case 22: {
                return a * 2.70158 * a * a - 1.70158 * a * a;
            }
            case 27: {
                final double sin = Math.sin((20.0 * a - 11.125) * 1.3962634015954636);
                return (a < 0.5) ? (-(Math.pow(2.0, a * 20.0 - 10.0) * sin) / 2.0) : (Math.pow(2.0, -20.0 * a + 10.0) * sin / 2.0 + 1.0);
            }
            case 1: {
                return 1.0 - Math.cos(3.141592653589793 * a / 2.0);
            }
            case 24: {
                return (a < 0.5) ? (Math.pow(2.0 * a, 2.0) * (7.189819 * a - 2.5949095) / 2.0) : ((Math.pow(a * 2.0 - 2.0, 2.0) * (2.5949095 + (a * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0);
            }
            case 20: {
                return Math.sqrt(1.0 - Math.pow(a - 1.0, 2.0));
            }
            case 19: {
                return 1.0 - Math.sqrt(1.0 - Math.pow(a, 2.0));
            }
            case 12: {
                return (a < 0.5) ? (a * (a * (a * (a * 8.0)))) : (1.0 - Math.pow(a * -2.0 + 2.0, 4.0) / 2.0);
            }
            case 0: {
                return a;
            }
            case 6: {
                return (a < 0.5) ? (a * (a * 2.0)) : (1.0 - Math.pow(2.0 + a * -2.0, 2.0) / 2.0);
            }
            case 17: {
                return 1.0 - Math.pow(2.0, a * -10.0);
            }
            case 7: {
                return a * a * a;
            }
            case 21: {
                return (a < 0.5) ? ((1.0 - Math.sqrt(1.0 - Math.pow(2.0 * a, 2.0))) / 2.0) : ((Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * a, 2.0)) + 1.0) / 2.0);
            }
            case 15: {
                return (a < 0.5) ? (a * (a * (a * 8.0)) * a * a) : (1.0 - Math.pow(a * -2.0 + 2.0, 5.0) / 2.0);
            }
            case 13: {
                return a * (a * (a * a)) * a;
            }
            case 4: {
                return a * a;
            }
            case 11: {
                return 1.0 - Math.pow(1.0 - a, 4.0);
            }
            case 23: {
                return 1.0 + 2.70158 * Math.pow(a - 1.0, 3.0) + 1.70158 * Math.pow(a - 1.0, 2.0);
            }
            case 16: {
                return Math.pow(2.0, a * 10.0 - 10.0);
            }
            case 5: {
                return 1.0 - (1.0 - a) * (1.0 - a);
            }
            case 25: {
                return -Math.pow(2.0, a * 10.0 - 10.0) * Math.sin((10.0 * a - 10.75) * 2.0943951023931953);
            }
            case 3: {
                return -(Math.cos(a * 3.141592653589793) - 1.0) / 2.0;
            }
            case 9: {
                return (a < 0.5) ? (4.0 * a * a * a) : (1.0 - Math.pow(2.0 + -2.0 * a, 3.0) / 2.0);
            }
            default: {
                return a;
            }
        }
    }
    
    static double az(final int n, final int n2, final int n3) {
        final double a = (n2 > 0) ? Math.max(0.0f, Math.min(1.0f, n / (float)n2)) : 1.0;
        if (a <= 0.0 || a >= 1.0) {
            return (a <= 0.0) ? 0.0 : 1.0;
        }
        switch (n3) {
            case 19: {
                return 1.0 - Math.sqrt(1.0 - Math.pow(a, 2.0));
            }
            case 15: {
                return (a < 0.5) ? (a * (a * (a * 8.0)) * a * a) : (1.0 - Math.pow(a * -2.0 + 2.0, 5.0) / 2.0);
            }
            case 14: {
                return 1.0 - Math.pow(1.0 - a, 5.0);
            }
            case 2: {
                return Math.sin(a * 3.141592653589793 / 2.0);
            }
            case 24: {
                return (a < 0.5) ? (Math.pow(2.0 * a, 2.0) * (7.189819 * a - 2.5949095) / 2.0) : ((Math.pow(a * 2.0 - 2.0, 2.0) * (2.5949095 + (a * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0);
            }
            case 10: {
                return a * (a * a * a);
            }
            case 4: {
                return a * a;
            }
            case 22: {
                return a * 2.70158 * a * a - 1.70158 * a * a;
            }
            case 1: {
                return 1.0 - Math.cos(3.141592653589793 * a / 2.0);
            }
            case 20: {
                return Math.sqrt(1.0 - Math.pow(a - 1.0, 2.0));
            }
            case 13: {
                return a * (a * (a * a)) * a;
            }
            case 6: {
                return (a < 0.5) ? (a * (a * 2.0)) : (1.0 - Math.pow(2.0 + a * -2.0, 2.0) / 2.0);
            }
            case 18: {
                return (a < 0.5) ? (Math.pow(2.0, 20.0 * a + 10.0) / 2.0) : ((2.0 - Math.pow(2.0, 10.0 + a * -20.0)) / 2.0);
            }
            case 12: {
                return (a < 0.5) ? (a * (a * (a * (a * 8.0)))) : (1.0 - Math.pow(a * -2.0 + 2.0, 4.0) / 2.0);
            }
            case 5: {
                return 1.0 - (1.0 - a) * (1.0 - a);
            }
            case 11: {
                return 1.0 - Math.pow(1.0 - a, 4.0);
            }
            case 0: {
                return a;
            }
            case 7: {
                return a * a * a;
            }
            case 16: {
                return Math.pow(2.0, a * 10.0 - 10.0);
            }
            case 9: {
                return (a < 0.5) ? (4.0 * a * a * a) : (1.0 - Math.pow(2.0 + -2.0 * a, 3.0) / 2.0);
            }
            case 23: {
                return 1.0 + 2.70158 * Math.pow(a - 1.0, 3.0) + 1.70158 * Math.pow(a - 1.0, 2.0);
            }
            case 27: {
                final double sin = Math.sin((20.0 * a - 11.125) * 1.3962634015954636);
                return (a < 0.5) ? (-(Math.pow(2.0, a * 20.0 - 10.0) * sin) / 2.0) : (Math.pow(2.0, -20.0 * a + 10.0) * sin / 2.0 + 1.0);
            }
            case 21: {
                return (a < 0.5) ? ((1.0 - Math.sqrt(1.0 - Math.pow(2.0 * a, 2.0))) / 2.0) : ((Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * a, 2.0)) + 1.0) / 2.0);
            }
            case 26: {
                return Math.pow(2.0, -10.0 * a) * Math.sin((a * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
            }
            case 25: {
                return -Math.pow(2.0, a * 10.0 - 10.0) * Math.sin((10.0 * a - 10.75) * 2.0943951023931953);
            }
            case 3: {
                return -(Math.cos(a * 3.141592653589793) - 1.0) / 2.0;
            }
            case 17: {
                return 1.0 - Math.pow(2.0, a * -10.0);
            }
            case 8: {
                return 1.0 - Math.pow(1.0 - a, 3.0);
            }
            default: {
                return a;
            }
        }
    }
    
    public static void ax(final class456 class456) {
        if (class456.field3894 * -1177830986 < class456.field3896 * 1362565729) {
            class456.field3894 -= 1759485493;
            class456.field3897 = class70.method443(1157153616 * class456.field3894, -1802535646 * class456.field3896, 570638463 * class456.field3895, -1046178178);
        }
    }
    
    public void ax() {
        if (this.field3894 * 1095678947 < this.field3896 * 71849511) {
            this.field3894 -= 1759485493;
            this.field3897 = class70.method443(1095678947 * this.field3894, 71849511 * this.field3896, 570638463 * this.field3895, -1303011872);
        }
    }
    
    double method2323(final int n) {
        try {
            return this.field3897;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rw.ay(" + ')');
        }
    }
    
    double am() {
        return this.field3897;
    }
    
    public void method2322(final int n) {
        try {
            if (this.field3894 * 1095678947 < this.field3896 * 71849511) {
                if (n == -764404363) {
                    throw new IllegalStateException();
                }
                this.field3894 -= 1759485493;
                this.field3897 = class70.method443(1095678947 * this.field3894, 71849511 * this.field3896, 570638463 * this.field3895, -426403722);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rw.aa(" + ')');
        }
    }
    
    double ar() {
        return this.field3897;
    }
    
    static double aj(final int n, final int n2, final int n3) {
        final double a = (n2 > 0) ? Math.max(0.0f, Math.min(1.0f, n / (float)n2)) : 1.0;
        if (a <= 0.0 || a >= 1.0) {
            return (a <= 0.0) ? 0.0 : 1.0;
        }
        switch (n3) {
            case 22: {
                return a * 2.70158 * a * a - 1.70158 * a * a;
            }
            case 16: {
                return Math.pow(2.0, a * 10.0 - 10.0);
            }
            case 24: {
                return (a < 0.5) ? (Math.pow(2.0 * a, 2.0) * (7.189819 * a - 2.5949095) / 2.0) : ((Math.pow(a * 2.0 - 2.0, 2.0) * (2.5949095 + (a * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0);
            }
            case 15: {
                return (a < 0.5) ? (a * (a * (a * 8.0)) * a * a) : (1.0 - Math.pow(a * -2.0 + 2.0, 5.0) / 2.0);
            }
            case 19: {
                return 1.0 - Math.sqrt(1.0 - Math.pow(a, 2.0));
            }
            case 6: {
                return (a < 0.5) ? (a * (a * 2.0)) : (1.0 - Math.pow(2.0 + a * -2.0, 2.0) / 2.0);
            }
            case 2: {
                return Math.sin(a * 3.141592653589793 / 2.0);
            }
            case 14: {
                return 1.0 - Math.pow(1.0 - a, 5.0);
            }
            case 10: {
                return a * (a * a * a);
            }
            case 4: {
                return a * a;
            }
            case 1: {
                return 1.0 - Math.cos(3.141592653589793 * a / 2.0);
            }
            case 20: {
                return Math.sqrt(1.0 - Math.pow(a - 1.0, 2.0));
            }
            case 18: {
                return (a < 0.5) ? (Math.pow(2.0, 20.0 * a + 10.0) / 2.0) : ((2.0 - Math.pow(2.0, 10.0 + a * -20.0)) / 2.0);
            }
            case 13: {
                return a * (a * (a * a)) * a;
            }
            case 12: {
                return (a < 0.5) ? (a * (a * (a * (a * 8.0)))) : (1.0 - Math.pow(a * -2.0 + 2.0, 4.0) / 2.0);
            }
            case 17: {
                return 1.0 - Math.pow(2.0, a * -10.0);
            }
            case 3: {
                return -(Math.cos(a * 3.141592653589793) - 1.0) / 2.0;
            }
            case 8: {
                return 1.0 - Math.pow(1.0 - a, 3.0);
            }
            case 9: {
                return (a < 0.5) ? (4.0 * a * a * a) : (1.0 - Math.pow(2.0 + -2.0 * a, 3.0) / 2.0);
            }
            case 26: {
                return Math.pow(2.0, -10.0 * a) * Math.sin((a * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
            }
            case 0: {
                return a;
            }
            case 21: {
                return (a < 0.5) ? ((1.0 - Math.sqrt(1.0 - Math.pow(2.0 * a, 2.0))) / 2.0) : ((Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * a, 2.0)) + 1.0) / 2.0);
            }
            case 23: {
                return 1.0 + 2.70158 * Math.pow(a - 1.0, 3.0) + 1.70158 * Math.pow(a - 1.0, 2.0);
            }
            case 11: {
                return 1.0 - Math.pow(1.0 - a, 4.0);
            }
            case 5: {
                return 1.0 - (1.0 - a) * (1.0 - a);
            }
            case 25: {
                return -Math.pow(2.0, a * 10.0 - 10.0) * Math.sin((10.0 * a - 10.75) * 2.0943951023931953);
            }
            case 27: {
                final double sin = Math.sin((20.0 * a - 11.125) * 1.3962634015954636);
                return (a < 0.5) ? (-(Math.pow(2.0, a * 20.0 - 10.0) * sin) / 2.0) : (Math.pow(2.0, -20.0 * a + 10.0) * sin / 2.0 + 1.0);
            }
            case 7: {
                return a * a * a;
            }
            default: {
                return a;
            }
        }
    }
    
    public void ag() {
        if (this.field3894 * 1095678947 < this.field3896 * 71849511) {
            this.field3894 -= 1759485493;
            this.field3897 = class70.method443(1095678947 * this.field3894, 71849511 * this.field3896, 570638463 * this.field3895, 85100605);
        }
    }
    
    public static boolean jy(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.cs();
        }
        return iterableNodeDeque.method1971();
    }
    
    public void ah() {
        if (this.field3894 * 1095678947 < this.field3896 * 71849511) {
            this.field3894 -= 1759485493;
            this.field3897 = class70.method443(1095678947 * this.field3894, 71849511 * this.field3896, 570638463 * this.field3895, -1567759049);
        }
    }
}
