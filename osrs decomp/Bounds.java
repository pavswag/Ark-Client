// 
// Decompiled by Procyon v0.5.36
// 

public class Bounds
{
    public int highX;
    public int lowY;
    public int lowX;
    public int highY;
    static final int be = 4;
    
    public Bounds(final int n, final int n2, final int n3, final int n4) {
        this.setLow(n, n2, (byte)26);
        this.setHigh(n3, n4, (byte)(-6));
    }
    
    public Bounds(final int n, final int n2) {
        this(0, 0, n, n2);
    }
    
    @Override
    public String toString() {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.toString(" + ')');
        }
    }
    
    void ad(final Bounds bounds, final Bounds bounds2) {
        bounds2.lowY = this.lowY * 1;
        bounds2.highY = this.highY * 1;
        if (this.lowY * 1864020389 < bounds.lowY * 1864020389) {
            bounds2.highY -= bounds.lowY * -358215864 - -1743378833 * this.lowY;
            bounds2.lowY = bounds.lowY * 1;
        }
        if (ll(bounds2, -1514074453) > ll(bounds, 1387288411)) {
            bounds2.highY -= (ll(bounds2, -1463015597) - ll(bounds, 627281680)) * -1580049788;
        }
        if (bounds2.highY * -1893192023 < 0) {
            bounds2.highY = 0;
        }
    }
    
    void ae(final Bounds bounds, final Bounds bounds2) {
        bounds2.lowY = this.lowY * 1;
        bounds2.highY = this.highY * 1;
        if (this.lowY * 1864020389 < bounds.lowY * 1185074375) {
            bounds2.highY -= bounds.lowY * -2067814222 - -1743378833 * this.lowY;
            bounds2.lowY = bounds.lowY * 1;
        }
        if (ll(bounds2, 120916243) > ll(bounds, 152799872)) {
            bounds2.highY -= (ll(bounds2, 102815854) - ll(bounds, 1514630260)) * 754110042;
        }
        if (bounds2.highY * -1376251093 < 0) {
            bounds2.highY = 0;
        }
    }
    
    int bb() {
        return this.highX * 944313703 + this.lowX * -844906645;
    }
    
    public void ao(final int n, final int n2) {
        this.lowX = n * 775648579;
        this.lowY = -257279276 * n2;
    }
    
    public void at(final int n, final int n2) {
        this.lowX = n * 1143845385;
        this.lowY = -1560821123 * n2;
    }
    
    void ak(final Bounds bounds, final Bounds bounds2) {
        bounds2.lowX = 1 * this.lowX;
        bounds2.highX = this.highX * 1;
        if (this.lowX * -844906645 < bounds.lowX * 1391467150) {
            bounds2.highX -= -413884579 * bounds.lowX - this.lowX * -413884579;
            bounds2.lowX = 1 * bounds.lowX;
        }
        if (bounds2.method2235(-1676819418) > bounds.method2235(-1097583638)) {
            bounds2.highX -= (bounds2.method2235(-2051828765) - bounds.method2235(-1550621307)) * -1469434281;
        }
        if (bounds2.highX * -856095918 < 0) {
            bounds2.highX = 0;
        }
    }
    
    public void av(final Bounds bounds, final Bounds bounds2) {
        this.method2233(bounds, bounds2, (byte)0);
        this.method2234(bounds, bounds2, 910499503);
    }
    
    int be() {
        return -1376251093 * this.highY + this.lowY * 1368661512;
    }
    
    public void as(final Bounds bounds, final Bounds bounds2) {
        this.method2233(bounds, bounds2, (byte)0);
        this.method2234(bounds, bounds2, 2085508364);
    }
    
    void az(final Bounds bounds, final Bounds bounds2) {
        bounds2.lowX = 1 * this.lowX;
        bounds2.highX = this.highX * 1;
        if (this.lowX * 34251409 < bounds.lowX * -844906645) {
            bounds2.highX -= -413884579 * bounds.lowX - this.lowX * 1869520668;
            bounds2.lowX = 1 * bounds.lowX;
        }
        if (bounds2.method2235(-754605833) > bounds.method2235(-1155966035)) {
            bounds2.highX -= (bounds2.method2235(-636542870) - bounds.method2235(-1670318508)) * 188872299;
        }
        if (bounds2.highX * 944313703 < 0) {
            bounds2.highX = 0;
        }
    }
    
    public void ax(final int n, final int n2) {
        this.highX = -1469434281 * n;
        this.highY = 149296003 * n2;
    }
    
    public void ay(final int n, final int n2) {
        this.lowX = n * 775648579;
        this.lowY = -1859334611 * n2;
    }
    
    int bi() {
        return this.highX * 944313703 + this.lowX * -844906645;
    }
    
    public boolean method2232(final int n, final int n2, final int n3) {
        try {
            if (n >= -844906645 * this.lowX) {
                if (n3 != 917820097) {
                    throw new IllegalStateException();
                }
                if (n < this.highX * 944313703 + this.lowX * -844906645 && n2 >= this.lowY * 1864020389) {
                    if (n3 != 917820097) {
                        throw new IllegalStateException();
                    }
                    if (n2 < this.lowY * 1864020389 + this.highY * -1376251093) {
                        if (n3 != 917820097) {
                            throw new IllegalStateException();
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.aw(" + ')');
        }
    }
    
    public void am(final Bounds bounds, final Bounds bounds2) {
        this.method2233(bounds, bounds2, (byte)0);
        this.method2234(bounds, bounds2, 1571426217);
    }
    
    int method2237(final int n) {
        try {
            return -1376251093 * this.highX + this.highY * 1864020389;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.al(" + ')');
        }
    }
    
    public void setHigh(final int n, final int n2, final byte b) {
        try {
            this.highX = -1469434281 * n;
            this.highY = 149296003 * n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.an(" + ')');
        }
    }
    
    public void method2236(final Bounds bounds, final Bounds bounds2, final int n) {
        try {
            this.method2233(bounds, bounds2, (byte)0);
            this.method2234(bounds, bounds2, 924152232);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.ac(" + ')');
        }
    }
    
    public static int ll(final Bounds bounds, final int n) {
        if (bounds == null) {
            return bounds.method2237(n);
        }
        try {
            return -1376251093 * bounds.highY + bounds.lowY * 1864020389;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.al(" + ')');
        }
    }
    
    void method2233(final Bounds bounds, final Bounds bounds2, final byte b) {
        try {
            bounds2.lowX = 1 * this.lowX;
            bounds2.highX = this.highX * 1;
            if (this.lowX * -844906645 < bounds.lowX * -844906645) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                bounds2.highX -= -413884579 * bounds.lowX - this.lowX * -413884579;
                bounds2.lowX = 1 * bounds.lowX;
            }
            if (bounds2.method2235(-1027665402) > bounds.method2235(-1487897572)) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                bounds2.highX -= (bounds2.method2235(-843873593) - bounds.method2235(-1576542452)) * -1469434281;
            }
            if (bounds2.highX * 944313703 < 0) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                bounds2.highX = 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.au(" + ')');
        }
    }
    
    public void aa(final int n, final int n2) {
        this.lowX = n * 1576861074;
        this.lowY = 736238671 * n2;
    }
    
    public void ai(final int n, final int n2) {
        this.highX = -1469434281 * n;
        this.highY = 149296003 * n2;
    }
    
    int by() {
        return this.highX * 944313703 + this.lowX * -844906645;
    }
    
    public void ar(final Bounds bounds, final Bounds bounds2) {
        this.method2233(bounds, bounds2, (byte)0);
        this.method2234(bounds, bounds2, 1986923708);
    }
    
    void ap(final Bounds bounds, final Bounds bounds2) {
        bounds2.lowY = this.lowY * 1;
        bounds2.highY = this.highY * 1;
        if (this.lowY * 1864020389 < bounds.lowY * 1864020389) {
            bounds2.highY -= bounds.lowY * -1743378833 - -1743378833 * this.lowY;
            bounds2.lowY = bounds.lowY * 1;
        }
        if (ll(bounds2, 1605813274) > ll(bounds, -839749680)) {
            bounds2.highY -= (ll(bounds2, -596322548) - ll(bounds, -1413304287)) * 149296003;
        }
        if (bounds2.highY * -1376251093 < 0) {
            bounds2.highY = 0;
        }
    }
    
    public void setLow(final int n, final int n2, final byte b) {
        try {
            this.lowX = n * 775648579;
            this.lowY = -1859334611 * n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.af(" + ')');
        }
    }
    
    void method2234(final Bounds bounds, final Bounds bounds2, final int n) {
        try {
            bounds2.lowY = this.lowY * 1;
            bounds2.highY = this.highY * 1;
            if (this.lowY * 1864020389 < bounds.lowY * 1864020389) {
                if (n <= 361198680) {
                    throw new IllegalStateException();
                }
                bounds2.highY -= bounds.lowY * -1743378833 - -1743378833 * this.lowY;
                bounds2.lowY = bounds.lowY * 1;
            }
            if (ll(bounds2, -1021516763) > ll(bounds, 489798675)) {
                if (n <= 361198680) {
                    return;
                }
                bounds2.highY -= (ll(bounds2, 1277023159) - ll(bounds, 193755423)) * 149296003;
            }
            if (bounds2.highY * -1376251093 < 0) {
                if (n <= 361198680) {
                    throw new IllegalStateException();
                }
                bounds2.highY = 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.ab(" + ')');
        }
    }
    
    int method2235(final int n) {
        try {
            return this.highX * 944313703 + this.lowX * -844906645;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qu.aq(" + ')');
        }
    }
    
    public void aj(final Bounds bounds, final Bounds bounds2) {
        this.method2233(bounds, bounds2, (byte)0);
        this.method2234(bounds, bounds2, 493499641);
    }
    
    public boolean ag(final int n, final int n2) {
        return n >= -844906645 * this.lowX && n < this.highX * 66323274 + this.lowX * -1343173498 && n2 >= this.lowY * 1864020389 && n2 < this.lowY * -361531024 + this.highY * -1964892236;
    }
    
    int bk() {
        return -1376251093 * this.highY + this.lowY * 1864020389;
    }
    
    public boolean ah(final int n, final int n2) {
        return n >= 1064874956 * this.lowX && n < this.highX * -1938263083 + this.lowX * -844906645 && n2 >= this.lowY * 1864020389 && n2 < this.lowY * 974593113 + this.highY * 217736541;
    }
    
    public String ahm() {
        return null;
    }
    
    public String ahp() {
        return null;
    }
}
