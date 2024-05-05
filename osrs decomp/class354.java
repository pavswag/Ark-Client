import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class class354
{
    static final int ab = 256;
    Bounds bounds;
    int[] field3534;
    final HashMap spriteMap;
    int field3536;
    int[] field3537;
    static SoundSystem soundSystem;
    
    public class354() {
        this.spriteMap = new HashMap();
        this.bounds = new Bounds(0, 0);
        this.field3534 = new int[2048];
        this.field3537 = new int[2048];
        this.field3536 = 0;
        class86.field879 = new int[2000];
        int i = 0;
        for (int n = 240, n2 = 12; i < 16; ++i, n -= n2) {
            class86.field879[i] = UserComparator7.compareBuddy(n / 360.0f, 0.9998999834060669, i * 0.425f / 16.0f + 0.075f);
        }
        int n3 = 48;
        final int n4 = n3 / 6;
        while (i < class86.field879.length) {
            final int n5 = i * 2;
            final int compareBuddy = UserComparator7.compareBuddy(n3 / 360.0f, 0.9998999834060669, 0.5);
            while (i < n5 && i < class86.field879.length) {
                class86.field879[i] = compareBuddy;
                ++i;
            }
            n3 -= n4;
        }
    }
    
    SpritePixels ao(final int n) {
        if (!this.spriteMap.containsKey(n)) {
            this.method1934(n, (byte)(-16));
        }
        return this.spriteMap.get(n);
    }
    
    void at(final int i) {
        final int n = 1 + 2 * i;
        final double n2 = i / 3.0f;
        final double[] array = new double[2 * i + 1];
        for (int j = -i, n3 = 0; j <= i; ++j, ++n3) {
            array[n3] = KeyHandler.getIdleCycles(j, 0.0, n2);
        }
        final double[] array2 = array;
        final double n4 = array2[i] * array2[i];
        final int[] array3 = new int[n * n];
        int n5 = 0;
        for (int k = 0; k < n; ++k) {
            for (int l = 0; l < n; ++l) {
                final int[] array4 = array3;
                final int n6 = l + k * n;
                final int n7 = (int)(array2[k] * array2[l] / n4 * 256.0);
                array4[n6] = n7;
                final int n8 = n7;
                if (n5 == 0 && n8 > 0) {
                    n5 = 1;
                }
            }
        }
        this.spriteMap.put(i, new SpritePixels(array3, n, n));
    }
    
    void as(final SpritePixels spritePixels, final SpritePixels spritePixels2, final Bounds bounds) {
        if (0 != bounds.highX * 944313703 && bounds.highY * -1376251093 != 0) {
            int n = 0;
            int n2 = 0;
            if (0 == 187523718 * bounds.lowX) {
                n = spritePixels.subWidth - -1421582077 * bounds.highX;
            }
            if (0 == -191287717 * bounds.lowY) {
                n2 = spritePixels.subHeight - bounds.highY * -953831622;
            }
            int n3 = spritePixels.subWidth * n2 + n;
            int n4 = bounds.lowY * 1864020389 * spritePixels2.subWidth + bounds.lowX * -844906645;
            for (int i = 0; i < -1376251093 * bounds.highY; ++i) {
                for (int j = 0; j < bounds.highX * 944313703; ++j) {
                    final int[] pixels = spritePixels2.pixels;
                    final int n5 = n4++;
                    pixels[n5] += spritePixels.pixels[n3++];
                }
                n3 += spritePixels.subWidth - 324403335 * bounds.highX;
                n4 += spritePixels2.subWidth - 944313703 * bounds.highX;
            }
        }
    }
    
    public final void ax(final int n, final int n2) {
        if (this.field3536 * -488732209 >= this.field3534.length) {
            return;
        }
        this.field3534[-674420889 * this.field3536] = n;
        this.field3537[this.field3536 * 428141091] = n2;
        this.field3536 -= 1912798808;
    }
    
    SpritePixels ay(final int n) {
        if (!this.spriteMap.containsKey(n)) {
            this.method1934(n, (byte)(-16));
        }
        return this.spriteMap.get(n);
    }
    
    public static void ds(final class354 class354, final int n, final int n2, final SpritePixels spritePixels, final float n3) {
        if (class354 == null) {
            class354.ax(n, n);
        }
        final int n4 = (int)(18.0f * n3);
        final SpritePixels method1935 = class354.method1935(n4, -2050405019);
        final int n5 = 1 + 2 * n4;
        final Bounds bounds = new Bounds(0, 0, spritePixels.subWidth, spritePixels.subHeight);
        final Bounds bounds2 = new Bounds(0, 0);
        class354.bounds.setHigh(n5, n5, (byte)(-2));
        System.nanoTime();
        for (int i = 0; i < -674420889 * class354.field3536; ++i) {
            class354.bounds.setLow((int)((class354.field3534[i] - n) * n3) - n4, (int)(spritePixels.subHeight - n3 * (class354.field3537[i] - n2)) - n4, (byte)66);
            class354.bounds.method2236(bounds, bounds2, -1323788808);
            class354.method1937(method1935, spritePixels, bounds2, (byte)88);
        }
        System.nanoTime();
        System.nanoTime();
        for (int j = 0; j < spritePixels.pixels.length; ++j) {
            if (0 == spritePixels.pixels[j]) {
                spritePixels.pixels[j] = -16777216;
            }
            else {
                int length = (spritePixels.pixels[j] + 64 - 1) / 256;
                if (length <= 0) {
                    spritePixels.pixels[j] = -16777216;
                }
                else {
                    if (length > class86.field879.length) {
                        length = class86.field879.length;
                    }
                    spritePixels.pixels[j] = (0xFF000000 | class86.field879[length - 1]);
                }
            }
        }
        System.nanoTime();
    }
    
    public final void method1936(final int n, final int n2, final short n3) {
        try {
            if (this.field3536 * -674420889 < this.field3534.length) {
                this.field3534[-674420889 * this.field3536] = n;
                this.field3537[this.field3536 * -674420889] = n2;
                this.field3536 += 1304822871;
                return;
            }
            if (n3 >= 152) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nf.aw(" + ')');
        }
    }
    
    void am(final SpritePixels spritePixels, final SpritePixels spritePixels2, final Bounds bounds) {
        if (0 != bounds.highX * 944313703 && bounds.highY * -1376251093 != 0) {
            int n = 0;
            int n2 = 0;
            if (0 == -844906645 * bounds.lowX) {
                n = spritePixels.subWidth - 944313703 * bounds.highX;
            }
            if (0 == 1864020389 * bounds.lowY) {
                n2 = spritePixels.subHeight - bounds.highY * -1376251093;
            }
            int n3 = spritePixels.subWidth * n2 + n;
            int n4 = bounds.lowY * 1864020389 * spritePixels2.subWidth + bounds.lowX * -844906645;
            for (int i = 0; i < -1376251093 * bounds.highY; ++i) {
                for (int j = 0; j < bounds.highX * 944313703; ++j) {
                    final int[] pixels = spritePixels2.pixels;
                    final int n5 = n4++;
                    pixels[n5] += spritePixels.pixels[n3++];
                }
                n3 += spritePixels.subWidth - 944313703 * bounds.highX;
                n4 += spritePixels2.subWidth - 944313703 * bounds.highX;
            }
        }
    }
    
    void al(final int i) {
        final int n = 1 + 2 * i;
        final double n2 = i / 3.0f;
        final double[] array = new double[2 * i + 1];
        for (int j = -i, n3 = 0; j <= i; ++j, ++n3) {
            array[n3] = KeyHandler.getIdleCycles(j, 0.0, n2);
        }
        final double[] array2 = array;
        final double n4 = array2[i] * array2[i];
        final int[] array3 = new int[n * n];
        int n5 = 0;
        for (int k = 0; k < n; ++k) {
            for (int l = 0; l < n; ++l) {
                final int[] array4 = array3;
                final int n6 = l + k * n;
                final int n7 = (int)(array2[k] * array2[l] / n4 * 256.0);
                array4[n6] = n7;
                final int n8 = n7;
                if (n5 == 0 && n8 > 0) {
                    n5 = 1;
                }
            }
        }
        this.spriteMap.put(i, new SpritePixels(array3, n, n));
    }
    
    public static WorldMapElement method1935(final int n, final int n2) {
        try {
            if (n >= 0 && n < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[n] != null) {
                return WorldMapElement.WorldMapElement_cached[n];
            }
            return new WorldMapElement(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nf.an(" + ')');
        }
    }
    
    SpritePixels method1935(final int n, final int n2) {
        try {
            if (!this.spriteMap.containsKey(n)) {
                if (n2 == 1896581481) {
                    throw new IllegalStateException();
                }
                this.method1934(n, (byte)(-95));
            }
            return this.spriteMap.get(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nf.an(" + ')');
        }
    }
    
    public final void method1939(final int n) {
        try {
            this.field3536 = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nf.ac(" + ')');
        }
    }
    
    public static void ot(final class354 class354, final int i) {
        if (class354 == null) {
            class354.ax(i, i);
            return;
        }
        final int n = 1 + 2 * i;
        final double n2 = i / 3.0f;
        final double[] array = new double[2 * i + 1];
        for (int j = -i, n3 = 0; j <= i; ++j, ++n3) {
            array[n3] = KeyHandler.getIdleCycles(j, 0.0, n2);
        }
        final double[] array2 = array;
        final double n4 = array2[i] * array2[i];
        final int[] array3 = new int[n * n];
        int n5 = 0;
        for (int k = 0; k < n; ++k) {
            for (int l = 0; l < n; ++l) {
                final int[] array4 = array3;
                final int n6 = l + k * n;
                final int n7 = (int)(array2[k] * array2[l] / n4 * 256.0);
                array4[n6] = n7;
                final int n8 = n7;
                if (n5 == 0 && n8 > 0) {
                    n5 = 1;
                }
            }
        }
        class354.spriteMap.put(i, new SpritePixels(array3, n, n));
    }
    
    public final void method1938(final int n, final int n2, final SpritePixels spritePixels, final float n3, final int n4) {
        try {
            final int n5 = (int)(18.0f * n3);
            final SpritePixels method1935 = this.method1935(n5, 1414918358);
            final int n6 = 1 + 2 * n5;
            final Bounds bounds = new Bounds(0, 0, spritePixels.subWidth, spritePixels.subHeight);
            final Bounds bounds2 = new Bounds(0, 0);
            this.bounds.setHigh(n6, n6, (byte)23);
            System.nanoTime();
            for (int i = 0; i < -674420889 * this.field3536; ++i) {
                this.bounds.setLow((int)((this.field3534[i] - n) * n3) - n5, (int)(spritePixels.subHeight - n3 * (this.field3537[i] - n2)) - n5, (byte)15);
                this.bounds.method2236(bounds, bounds2, -1323788808);
                this.method1937(method1935, spritePixels, bounds2, (byte)75);
            }
            System.nanoTime();
            System.nanoTime();
            for (int j = 0; j < spritePixels.pixels.length; ++j) {
                if (n4 >= 749939492) {
                    return;
                }
                if (0 == spritePixels.pixels[j]) {
                    if (n4 >= 749939492) {
                        throw new IllegalStateException();
                    }
                    spritePixels.pixels[j] = -16777216;
                }
                else {
                    int length = (spritePixels.pixels[j] + 64 - 1) / 256;
                    if (length <= 0) {
                        if (n4 >= 749939492) {
                            throw new IllegalStateException();
                        }
                        spritePixels.pixels[j] = -16777216;
                    }
                    else {
                        if (length > class86.field879.length) {
                            if (n4 >= 749939492) {
                                return;
                            }
                            length = class86.field879.length;
                        }
                        spritePixels.pixels[j] = (0xFF000000 | class86.field879[length - 1]);
                    }
                }
            }
            System.nanoTime();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nf.au(" + ')');
        }
    }
    
    SpritePixels aa(final int n) {
        if (!this.spriteMap.containsKey(n)) {
            this.method1934(n, (byte)(-42));
        }
        return this.spriteMap.get(n);
    }
    
    public final void ai(final int n, final int n2, final SpritePixels spritePixels, final float n3) {
        final int n4 = (int)(18.0f * n3);
        final SpritePixels method1935 = this.method1935(n4, 1010040485);
        final int n5 = 1 + 2 * n4;
        final Bounds bounds = new Bounds(0, 0, spritePixels.subWidth, spritePixels.subHeight);
        final Bounds bounds2 = new Bounds(0, 0);
        this.bounds.setHigh(n5, n5, (byte)(-14));
        System.nanoTime();
        for (int i = 0; i < -674420889 * this.field3536; ++i) {
            this.bounds.setLow((int)((this.field3534[i] - n) * n3) - n4, (int)(spritePixels.subHeight - n3 * (this.field3537[i] - n2)) - n4, (byte)13);
            this.bounds.method2236(bounds, bounds2, -1323788808);
            this.method1937(method1935, spritePixels, bounds2, (byte)62);
        }
        System.nanoTime();
        System.nanoTime();
        for (int j = 0; j < spritePixels.pixels.length; ++j) {
            if (0 == spritePixels.pixels[j]) {
                spritePixels.pixels[j] = -16777216;
            }
            else {
                int length = (spritePixels.pixels[j] + 1064462380 - 1) / 256;
                if (length <= 0) {
                    spritePixels.pixels[j] = -1562274073;
                }
                else {
                    if (length > class86.field879.length) {
                        length = class86.field879.length;
                    }
                    spritePixels.pixels[j] = (0xFF000000 | class86.field879[length - 1]);
                }
            }
        }
        System.nanoTime();
    }
    
    public static boolean fy(final Widget widget, final UrlRequester urlRequester) {
        if (widget == null) {
            widget.fi(urlRequester);
        }
        if (widget.type * 883712245 == 11 && widget.field2868 != null) {
            class166.qr(widget.field2868, urlRequester, (byte)15);
            if (widget.field2868.method926((byte)34) != widget.field2948 * 1888225603) {
                widget.field2948 = widget.field2868.method926((byte)105) * 996199275;
                if (widget.field2948 * 1888225603 >= 100) {
                    return true;
                }
                if (2 == widget.field2948 * 1888225603) {
                    widget.method1813(1652307373);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    void ar(final SpritePixels spritePixels, final SpritePixels spritePixels2, final Bounds bounds) {
        if (0 != bounds.highX * 1806322502 && bounds.highY * -1376251093 != 0) {
            int n = 0;
            int n2 = 0;
            if (0 == -1873479640 * bounds.lowX) {
                n = spritePixels.subWidth - -1622415041 * bounds.highX;
            }
            if (0 == 1864020389 * bounds.lowY) {
                n2 = spritePixels.subHeight - bounds.highY * 483765316;
            }
            int n3 = spritePixels.subWidth * n2 + n;
            int n4 = bounds.lowY * 1864020389 * spritePixels2.subWidth + bounds.lowX * -844906645;
            for (int i = 0; i < 72423830 * bounds.highY; ++i) {
                for (int j = 0; j < bounds.highX * 944313703; ++j) {
                    final int[] pixels = spritePixels2.pixels;
                    final int n5 = n4++;
                    pixels[n5] += spritePixels.pixels[n3++];
                }
                n3 += spritePixels.subWidth - 944313703 * bounds.highX;
                n4 += spritePixels2.subWidth - 944313703 * bounds.highX;
            }
        }
    }
    
    void method1934(final int i, final byte b) {
        try {
            final int n = 1 + 2 * i;
            final double n2 = i / 3.0f;
            final double[] array = new double[2 * i + 1];
            for (int j = -i, n3 = 0; j <= i; ++j, ++n3) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                array[n3] = KeyHandler.getIdleCycles(j, 0.0, n2);
            }
            final double[] array2 = array;
            final double n4 = array2[i] * array2[i];
            final int[] array3 = new int[n * n];
            int n5 = 0;
            for (int k = 0; k < n; ++k) {
                for (int l = 0; l < n; ++l) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    final int[] array4 = array3;
                    final int n6 = l + k * n;
                    final int n7 = (int)(array2[k] * array2[l] / n4 * 256.0);
                    array4[n6] = n7;
                    final int n8 = n7;
                    if (n5 == 0) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        if (n8 > 0) {
                            n5 = 1;
                        }
                    }
                }
            }
            this.spriteMap.put(i, new SpritePixels(array3, n, n));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nf.af(" + ')');
        }
    }
    
    public static void wb(final class354 class354, final int i) {
        if (class354 == null) {
            class354.at(i);
            return;
        }
        final int n = 1 + 2 * i;
        final double n2 = i / 3.0f;
        final double[] array = new double[2 * i + 1];
        for (int j = -i, n3 = 0; j <= i; ++j, ++n3) {
            array[n3] = KeyHandler.getIdleCycles(j, 0.0, n2);
        }
        final double[] array2 = array;
        final double n4 = array2[i] * array2[i];
        final int[] array3 = new int[n * n];
        int n5 = 0;
        for (int k = 0; k < n; ++k) {
            for (int l = 0; l < n; ++l) {
                final int[] array4 = array3;
                final int n6 = l + k * n;
                final int n7 = (int)(array2[k] * array2[l] / n4 * 256.0);
                array4[n6] = n7;
                final int n8 = n7;
                if (n5 == 0 && n8 > 0) {
                    n5 = 1;
                }
            }
        }
        class354.spriteMap.put(i, new SpritePixels(array3, n, n));
    }
    
    void method1937(final SpritePixels spritePixels, final SpritePixels spritePixels2, final Bounds bounds, final byte b) {
        try {
            if (0 != bounds.highX * 944313703) {
                if (b <= 10) {
                    return;
                }
                if (bounds.highY * -1376251093 != 0) {
                    int n = 0;
                    int n2 = 0;
                    if (0 == -844906645 * bounds.lowX) {
                        n = spritePixels.subWidth - 944313703 * bounds.highX;
                    }
                    if (0 == 1864020389 * bounds.lowY) {
                        if (b <= 10) {
                            throw new IllegalStateException();
                        }
                        n2 = spritePixels.subHeight - bounds.highY * -1376251093;
                    }
                    int n3 = spritePixels.subWidth * n2 + n;
                    int n4 = bounds.lowY * 1864020389 * spritePixels2.subWidth + bounds.lowX * -844906645;
                    for (int i = 0; i < -1376251093 * bounds.highY; ++i) {
                        if (b <= 10) {
                            throw new IllegalStateException();
                        }
                        for (int j = 0; j < bounds.highX * 944313703; ++j) {
                            if (b <= 10) {
                                throw new IllegalStateException();
                            }
                            final int[] pixels = spritePixels2.pixels;
                            final int n5 = n4++;
                            pixels[n5] += spritePixels.pixels[n3++];
                        }
                        n3 += spritePixels.subWidth - 944313703 * bounds.highX;
                        n4 += spritePixels2.subWidth - 944313703 * bounds.highX;
                    }
                    return;
                }
                if (b <= 10) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nf.ab(" + ')');
        }
    }
    
    public final void ag(final int n, final int n2, final SpritePixels spritePixels, final float n3) {
        final int n4 = (int)(18.0f * n3);
        final SpritePixels method1935 = this.method1935(n4, 421472806);
        final int n5 = 1 + 2 * n4;
        final Bounds bounds = new Bounds(0, 0, spritePixels.subWidth, spritePixels.subHeight);
        final Bounds bounds2 = new Bounds(0, 0);
        this.bounds.setHigh(n5, n5, (byte)12);
        System.nanoTime();
        for (int i = 0; i < -674420889 * this.field3536; ++i) {
            this.bounds.setLow((int)((this.field3534[i] - n) * n3) - n4, (int)(spritePixels.subHeight - n3 * (this.field3537[i] - n2)) - n4, (byte)(-47));
            this.bounds.method2236(bounds, bounds2, -1323788808);
            this.method1937(method1935, spritePixels, bounds2, (byte)67);
        }
        System.nanoTime();
        System.nanoTime();
        for (int j = 0; j < spritePixels.pixels.length; ++j) {
            if (0 == spritePixels.pixels[j]) {
                spritePixels.pixels[j] = -16777216;
            }
            else {
                int length = (spritePixels.pixels[j] + 64 - 1) / 256;
                if (length <= 0) {
                    spritePixels.pixels[j] = -16777216;
                }
                else {
                    if (length > class86.field879.length) {
                        length = class86.field879.length;
                    }
                    spritePixels.pixels[j] = (0xFF000000 | class86.field879[length - 1]);
                }
            }
        }
        System.nanoTime();
    }
    
    public final void ah(final int n, final int n2, final SpritePixels spritePixels, final float n3) {
        final int n4 = (int)(18.0f * n3);
        final SpritePixels method1935 = this.method1935(n4, 1479772202);
        final int n5 = 1 + 2 * n4;
        final Bounds bounds = new Bounds(0, 0, spritePixels.subWidth, spritePixels.subHeight);
        final Bounds bounds2 = new Bounds(0, 0);
        this.bounds.setHigh(n5, n5, (byte)(-24));
        System.nanoTime();
        for (int i = 0; i < -674420889 * this.field3536; ++i) {
            this.bounds.setLow((int)((this.field3534[i] - n) * n3) - n4, (int)(spritePixels.subHeight - n3 * (this.field3537[i] - n2)) - n4, (byte)(-14));
            this.bounds.method2236(bounds, bounds2, -1323788808);
            this.method1937(method1935, spritePixels, bounds2, (byte)62);
        }
        System.nanoTime();
        System.nanoTime();
        for (int j = 0; j < spritePixels.pixels.length; ++j) {
            if (0 == spritePixels.pixels[j]) {
                spritePixels.pixels[j] = -16777216;
            }
            else {
                int length = (spritePixels.pixels[j] + 64 - 1) / 256;
                if (length <= 0) {
                    spritePixels.pixels[j] = -16777216;
                }
                else {
                    if (length > class86.field879.length) {
                        length = class86.field879.length;
                    }
                    spritePixels.pixels[j] = (0xFF000000 | class86.field879[length - 1]);
                }
            }
        }
        System.nanoTime();
    }
    
    public static SpritePixels su(final WorldMapElement worldMapElement, final boolean b) {
        return WorldMapElement.fd(worldMapElement, b ? (worldMapElement.sprite2 * 2035390535) : (1458003089 * worldMapElement.sprite1), 685104861);
    }
}
