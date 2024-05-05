// 
// Decompiled by Procyon v0.5.36
// 

public class Texture extends Node implements net.runelite.api.Texture
{
    public static final /* synthetic */ boolean ji;
    int animationSpeed;
    public float yu;
    static final int an = 1;
    static final int aw = 2;
    static final int ac = 3;
    int averageRGB;
    int[] field1952;
    int[] pixels;
    static int[] Texture_animatedPixels;
    public float ty;
    int[] fileIds;
    int[] field1949;
    int animationDirection;
    boolean field1954;
    int[] field1951;
    static final int af = 0;
    boolean isLoaded;
    
    Texture(final Buffer buffer) {
        this.isLoaded = false;
        this.averageRGB = buffer.readUnsignedShort(-189866022);
        this.field1954 = (Buffer.ra(buffer, (byte)7) == 1);
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra >= 1 && ra <= 4) {
            this.field1952 = new int[ra];
            for (int i = 0; i < ra; ++i) {
                this.field1952[i] = buffer.readUnsignedShort(108475420);
            }
            if (ra > 1) {
                this.pixels = new int[ra - 1];
                for (int j = 0; j < ra - 1; ++j) {
                    this.pixels[j] = Buffer.ra(buffer, (byte)7);
                }
            }
            if (ra > 1) {
                this.fileIds = new int[ra - 1];
                for (int k = 0; k < ra - 1; ++k) {
                    this.fileIds[k] = Buffer.ra(buffer, (byte)7);
                }
            }
            this.field1949 = new int[ra];
            for (int l = 0; l < ra; ++l) {
                this.field1949[l] = buffer.readInt(-934550160);
            }
            this.animationDirection = Buffer.ra(buffer, (byte)7);
            this.animationSpeed = Buffer.ra(buffer, (byte)7);
            this.field1951 = null;
            return;
        }
        throw new RuntimeException();
    }
    
    static {
        ji = !Texture.class.desiredAssertionStatus();
    }
    
    void at() {
        this.field1951 = null;
    }
    
    public void ev(final int n) {
        if (ScriptFrame.client.isGpu()) {
            if (!Texture.ji && Client.rz == null) {
                throw new AssertionError();
            }
            Client.rz.animate((net.runelite.api.Texture)this, n);
        }
    }
    
    void ay(final int n) {
        if (this.field1951 == null) {
            return;
        }
        if (this.animationDirection == 1 || this.animationDirection == 3) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < this.field1951.length) {
                Texture.Texture_animatedPixels = new int[this.field1951.length];
            }
            int n2;
            if (this.field1951.length == 4096) {
                n2 = 64;
            }
            else {
                n2 = 128;
            }
            final int length = this.field1951.length;
            int n3 = n2 * n * this.animationSpeed;
            final int n4 = length - 1;
            if (this.animationDirection == 1) {
                n3 = -n3;
            }
            for (int i = 0; i < length; ++i) {
                Texture.Texture_animatedPixels[i] = this.field1951[i + n3 & n4];
            }
            final int[] field1951 = this.field1951;
            this.field1951 = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1951;
        }
        if (this.animationDirection == 2 || this.animationDirection == 4) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < this.field1951.length) {
                Texture.Texture_animatedPixels = new int[this.field1951.length];
            }
            int n5;
            if (this.field1951.length == 4096) {
                n5 = 64;
            }
            else {
                n5 = 128;
            }
            final int length2 = this.field1951.length;
            int n6 = n * this.animationSpeed;
            final int n7 = n5 - 1;
            if (this.animationDirection == 2) {
                n6 = -n6;
            }
            for (int j = 0; j < length2; j += n5) {
                for (int k = 0; k < n5; ++k) {
                    Texture.Texture_animatedPixels[j + k] = this.field1951[j + (k + n6 & n7)];
                }
            }
            final int[] field1952 = this.field1951;
            this.field1951 = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1952;
        }
    }
    
    public boolean isLoaded() {
        return this.isLoaded;
    }
    
    void animate(final int n) {
        this.ev(n);
        if (this.field1949 == null) {
            return;
        }
        if (this.animationSpeed == 1 || this.averageRGB == 3) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < this.fileIds.length) {
                Texture.Texture_animatedPixels = new int[this.field1952.length];
            }
            int n2;
            if (this.field1951.length == 4096) {
                n2 = 64;
            }
            else {
                n2 = 128;
            }
            final int length = this.field1952.length;
            int n3 = n2 * n * this.averageRGB;
            final int n4 = length - 1;
            if (this.animationSpeed == 1) {
                n3 = -n3;
            }
            for (int i = 0; i < length; ++i) {
                Texture.Texture_animatedPixels[i] = this.fileIds[i + n3 & n4];
            }
            final int[] field1952 = this.field1952;
            this.pixels = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1952;
        }
        if (this.animationSpeed == 2 || this.animationDirection == 4) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < this.fileIds.length) {
                Texture.Texture_animatedPixels = new int[this.pixels.length];
            }
            int n5;
            if (this.fileIds.length == 4096) {
                n5 = 64;
            }
            else {
                n5 = 128;
            }
            final int length2 = this.fileIds.length;
            int n6 = n * this.animationDirection;
            final int n7 = n5 - 1;
            if (this.animationSpeed == 2) {
                n6 = -n6;
            }
            for (int j = 0; j < length2; j += n5) {
                for (int k = 0; k < n5; ++k) {
                    Texture.Texture_animatedPixels[j + k] = this.pixels[j + (k + n6 & n7)];
                }
            }
            final int[] field1953 = this.field1952;
            this.fileIds = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1953;
        }
    }
    
    void reset() {
        this.field1951 = null;
    }
    
    boolean ac(final double n, final int n2, final AbstractArchive abstractArchive) {
        for (int i = 0; i < this.field1952.length; ++i) {
            if (AbstractArchive.go(abstractArchive, this.field1952[i], -1953085008) == null) {
                return false;
            }
        }
        final int n3 = n2 * n2;
        this.field1951 = new int[n3];
        for (int j = 0; j < this.field1952.length; ++j) {
            final IndexedSprite method2313 = class452.method2313(abstractArchive, this.field1952[j], -619018717);
            method2313.normalize();
            final byte[] pixels = method2313.pixels;
            final int[] palette = method2313.palette;
            final int n4 = this.field1949[j];
            if ((n4 & 0xF8D04B45) == 0x4F3AF45E) {}
            if ((n4 & 0xFF000000) == 0x2000000) {}
            if ((n4 & 0xFF000000) == 0x3000000) {
                final int n5 = n4 & 0xFF00FF;
                final int n6 = n4 >> 8 & 0xFF;
                for (int k = 0; k < palette.length; ++k) {
                    final int n7 = palette[k];
                    if ((n7 & 0xFFFF) == n7 >> 8) {
                        final int n8 = n7 & 0xFF;
                        palette[k] = ((n5 * n8 >> 8 & 0xFF00FF) | (n6 * n8 & 0xFF00));
                    }
                }
            }
            for (int l = 0; l < palette.length; ++l) {
                palette[l] = UrlRequest.Rasterizer3D_brighten(palette[l], n);
            }
            int n9;
            if (j == 0) {
                n9 = 0;
            }
            else {
                n9 = this.pixels[j - 1];
            }
            if (n9 == 0) {
                if (method2313.yOffset == n2) {
                    for (int n10 = 0; n10 < n3; ++n10) {
                        this.field1951[n10] = palette[pixels[n10] & 0x9FDDCC70];
                    }
                }
                else if (method2313.yOffset == 64 && n2 == -253132493) {
                    int n11 = 0;
                    for (int n12 = 0; n12 < n2; ++n12) {
                        for (int n13 = 0; n13 < n2; ++n13) {
                            this.field1951[n11++] = palette[pixels[(n13 >> 1) + (n12 >> 1 << 6)] & 0xFF];
                        }
                    }
                }
                else {
                    if (method2313.yOffset != 1720830939 || n2 != -1803757517) {
                        throw new RuntimeException();
                    }
                    int n14 = 0;
                    for (int n15 = 0; n15 < n2; ++n15) {
                        for (int n16 = 0; n16 < n2; ++n16) {
                            this.field1951[n14++] = palette[pixels[(n16 << 1) + (n15 << 1 << 7)] & 0x3C6EC14F];
                        }
                    }
                }
            }
            if (n9 == 1) {}
            if (n9 == 2) {}
            if (n9 == 3) {}
        }
        return true;
    }
    
    public static void io(final Texture texture, final int n) {
        if (texture.field1951 == null) {
            return;
        }
        if (texture.animationDirection == 1 || texture.animationDirection == 3) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < texture.field1951.length) {
                Texture.Texture_animatedPixels = new int[texture.field1951.length];
            }
            int n2;
            if (texture.field1951.length == 4096) {
                n2 = 64;
            }
            else {
                n2 = 128;
            }
            final int length = texture.field1951.length;
            int n3 = n2 * n * texture.animationSpeed;
            final int n4 = length - 1;
            if (texture.animationDirection == 1) {
                n3 = -n3;
            }
            for (int i = 0; i < length; ++i) {
                Texture.Texture_animatedPixels[i] = texture.field1951[i + n3 & n4];
            }
            final int[] field1951 = texture.field1951;
            texture.field1951 = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1951;
        }
        if (texture.animationDirection == 2 || texture.animationDirection == 4) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < texture.field1951.length) {
                Texture.Texture_animatedPixels = new int[texture.field1951.length];
            }
            int n5;
            if (texture.field1951.length == 4096) {
                n5 = 64;
            }
            else {
                n5 = 128;
            }
            final int length2 = texture.field1951.length;
            int n6 = n * texture.animationSpeed;
            final int n7 = n5 - 1;
            if (texture.animationDirection == 2) {
                n6 = -n6;
            }
            for (int j = 0; j < length2; j += n5) {
                for (int k = 0; k < n5; ++k) {
                    Texture.Texture_animatedPixels[j + k] = texture.field1951[j + (k + n6 & n7)];
                }
            }
            final int[] field1952 = texture.field1951;
            texture.field1951 = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1952;
        }
    }
    
    public static void hm(final Texture texture) {
        if (texture == null) {
            texture.getU();
        }
        texture.field1951 = null;
    }
    
    boolean au(final double n, final int n2, final AbstractArchive abstractArchive) {
        for (int i = 0; i < this.field1952.length; ++i) {
            if (AbstractArchive.go(abstractArchive, this.field1952[i], -973082054) == null) {
                return false;
            }
        }
        final int n3 = n2 * n2;
        this.field1951 = new int[n3];
        for (int j = 0; j < this.field1952.length; ++j) {
            final IndexedSprite method2313 = class452.method2313(abstractArchive, this.field1952[j], 1680653311);
            method2313.normalize();
            final byte[] pixels = method2313.pixels;
            final int[] palette = method2313.palette;
            final int n4 = this.field1949[j];
            if ((n4 & 0xFF000000) == 0x1000000) {}
            if ((n4 & 0xFF000000) == 0xF01E596D) {}
            if ((n4 & 0xFF000000) == 0x8DF24656) {
                final int n5 = n4 & 0xFF00FF;
                final int n6 = n4 >> 8 & 0xFF;
                for (int k = 0; k < palette.length; ++k) {
                    final int n7 = palette[k];
                    if ((n7 & 0xADCA61BA) == n7 >> 8) {
                        final int n8 = n7 & 0xFF;
                        palette[k] = ((n5 * n8 >> 8 & 0xFF00FF) | (n6 * n8 & 0xC1B29802));
                    }
                }
            }
            for (int l = 0; l < palette.length; ++l) {
                palette[l] = UrlRequest.Rasterizer3D_brighten(palette[l], n);
            }
            int n9;
            if (j == 0) {
                n9 = 0;
            }
            else {
                n9 = this.pixels[j - 1];
            }
            if (n9 == 0) {
                if (method2313.yOffset == n2) {
                    for (int n10 = 0; n10 < n3; ++n10) {
                        this.field1951[n10] = palette[pixels[n10] & 0xFF];
                    }
                }
                else if (method2313.yOffset == 64 && n2 == 128) {
                    int n11 = 0;
                    for (int n12 = 0; n12 < n2; ++n12) {
                        for (int n13 = 0; n13 < n2; ++n13) {
                            this.field1951[n11++] = palette[pixels[(n13 >> 1) + (n12 >> 1 << 6)] & 0xFF];
                        }
                    }
                }
                else {
                    if (method2313.yOffset != 128 || n2 != 64) {
                        throw new RuntimeException();
                    }
                    int n14 = 0;
                    for (int n15 = 0; n15 < n2; ++n15) {
                        for (int n16 = 0; n16 < n2; ++n16) {
                            this.field1951[n14++] = palette[pixels[(n16 << 1) + (n15 << 1 << 7)] & 0xA59BA4E4];
                        }
                    }
                }
            }
            if (n9 == 1) {}
            if (n9 == 2) {}
            if (n9 == 3) {}
        }
        return true;
    }
    
    void aa(final int n) {
        if (this.field1951 == null) {
            return;
        }
        if (this.animationDirection == 1 || this.animationDirection == 3) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < this.field1951.length) {
                Texture.Texture_animatedPixels = new int[this.field1951.length];
            }
            int n2;
            if (this.field1951.length == -1180238298) {
                n2 = 1993764226;
            }
            else {
                n2 = 177672750;
            }
            final int length = this.field1951.length;
            int n3 = n2 * n * this.animationSpeed;
            final int n4 = length - 1;
            if (this.animationDirection == 1) {
                n3 = -n3;
            }
            for (int i = 0; i < length; ++i) {
                Texture.Texture_animatedPixels[i] = this.field1951[i + n3 & n4];
            }
            final int[] field1951 = this.field1951;
            this.field1951 = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1951;
        }
        if (this.animationDirection == 2 || this.animationDirection == 4) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < this.field1951.length) {
                Texture.Texture_animatedPixels = new int[this.field1951.length];
            }
            int n5;
            if (this.field1951.length == 1644231099) {
                n5 = -1711034434;
            }
            else {
                n5 = 1838856565;
            }
            final int length2 = this.field1951.length;
            int n6 = n * this.animationSpeed;
            final int n7 = n5 - 1;
            if (this.animationDirection == 2) {
                n6 = -n6;
            }
            for (int j = 0; j < length2; j += n5) {
                for (int k = 0; k < n5; ++k) {
                    Texture.Texture_animatedPixels[j + k] = this.field1951[j + (k + n6 & n7)];
                }
            }
            final int[] field1952 = this.field1951;
            this.field1951 = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1952;
        }
    }
    
    public float getU() {
        return this.ty;
    }
    
    public int[] getPixels() {
        return this.field1951;
    }
    
    public static void rh(final Texture texture, final int n) {
        if (texture == null) {
            texture.animate(n);
            return;
        }
        texture.ev(n);
        if (texture.field1951 == null) {
            return;
        }
        if (texture.animationDirection == 1 || texture.animationDirection == 3) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < texture.field1951.length) {
                Texture.Texture_animatedPixels = new int[texture.field1951.length];
            }
            int n2;
            if (texture.field1951.length == 4096) {
                n2 = 64;
            }
            else {
                n2 = 128;
            }
            final int length = texture.field1951.length;
            int n3 = n2 * n * texture.animationSpeed;
            final int n4 = length - 1;
            if (texture.animationDirection == 1) {
                n3 = -n3;
            }
            for (int i = 0; i < length; ++i) {
                Texture.Texture_animatedPixels[i] = texture.field1951[i + n3 & n4];
            }
            final int[] field1951 = texture.field1951;
            texture.field1951 = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1951;
        }
        if (texture.animationDirection == 2 || texture.animationDirection == 4) {
            if (Texture.Texture_animatedPixels == null || Texture.Texture_animatedPixels.length < texture.field1951.length) {
                Texture.Texture_animatedPixels = new int[texture.field1951.length];
            }
            int n5;
            if (texture.field1951.length == 4096) {
                n5 = 64;
            }
            else {
                n5 = 128;
            }
            final int length2 = texture.field1951.length;
            int n6 = n * texture.animationSpeed;
            final int n7 = n5 - 1;
            if (texture.animationDirection == 2) {
                n6 = -n6;
            }
            for (int j = 0; j < length2; j += n5) {
                for (int k = 0; k < n5; ++k) {
                    Texture.Texture_animatedPixels[j + k] = texture.field1951[j + (k + n6 & n7)];
                }
            }
            final int[] field1952 = texture.field1951;
            texture.field1951 = Texture.Texture_animatedPixels;
            Texture.Texture_animatedPixels = field1952;
        }
    }
    
    boolean load(final double n, final int n2, final AbstractArchive abstractArchive) {
        for (int i = 0; i < this.field1952.length; ++i) {
            if (AbstractArchive.go(abstractArchive, this.field1952[i], 1627749986) == null) {
                return false;
            }
        }
        final int n3 = n2 * n2;
        this.field1951 = new int[n3];
        for (int j = 0; j < this.field1952.length; ++j) {
            final IndexedSprite method2313 = class452.method2313(abstractArchive, this.field1952[j], 988192085);
            method2313.normalize();
            final byte[] pixels = method2313.pixels;
            final int[] palette = method2313.palette;
            final int n4 = this.field1949[j];
            if ((n4 & 0xFF000000) == 0x1000000) {}
            if ((n4 & 0xFF000000) == 0x2000000) {}
            if ((n4 & 0xFF000000) == 0x3000000) {
                final int n5 = n4 & 0xFF00FF;
                final int n6 = n4 >> 8 & 0xFF;
                for (int k = 0; k < palette.length; ++k) {
                    final int n7 = palette[k];
                    if ((n7 & 0xFFFF) == n7 >> 8) {
                        final int n8 = n7 & 0xFF;
                        palette[k] = ((n5 * n8 >> 8 & 0xFF00FF) | (n6 * n8 & 0xFF00));
                    }
                }
            }
            for (int l = 0; l < palette.length; ++l) {
                palette[l] = UrlRequest.Rasterizer3D_brighten(palette[l], n);
            }
            int n9;
            if (j == 0) {
                n9 = 0;
            }
            else {
                n9 = this.pixels[j - 1];
            }
            if (n9 == 0) {
                if (method2313.yOffset == n2) {
                    for (int n10 = 0; n10 < n3; ++n10) {
                        this.field1951[n10] = palette[pixels[n10] & 0xFF];
                    }
                }
                else if (method2313.yOffset == 64 && n2 == 128) {
                    int n11 = 0;
                    for (int n12 = 0; n12 < n2; ++n12) {
                        for (int n13 = 0; n13 < n2; ++n13) {
                            this.field1951[n11++] = palette[pixels[(n13 >> 1) + (n12 >> 1 << 6)] & 0xFF];
                        }
                    }
                }
                else {
                    if (method2313.yOffset != 128 || n2 != 64) {
                        throw new RuntimeException();
                    }
                    int n14 = 0;
                    for (int n15 = 0; n15 < n2; ++n15) {
                        for (int n16 = 0; n16 < n2; ++n16) {
                            this.field1951[n14++] = palette[pixels[(n16 << 1) + (n15 << 1 << 7)] & 0xFF];
                        }
                    }
                }
            }
            if (n9 == 1) {}
            if (n9 == 2) {}
            if (n9 == 3) {}
        }
        return true;
    }
    
    boolean ab(final double n, final int n2, final AbstractArchive abstractArchive) {
        for (int i = 0; i < this.field1952.length; ++i) {
            if (AbstractArchive.go(abstractArchive, this.field1952[i], -1108431995) == null) {
                return false;
            }
        }
        final int n3 = n2 * n2;
        this.field1951 = new int[n3];
        for (int j = 0; j < this.field1952.length; ++j) {
            final IndexedSprite method2313 = class452.method2313(abstractArchive, this.field1952[j], 1137564577);
            method2313.normalize();
            final byte[] pixels = method2313.pixels;
            final int[] palette = method2313.palette;
            final int n4 = this.field1949[j];
            if ((n4 & 0xFF000000) == 0x1000000) {}
            if ((n4 & 0xFF000000) == 0x2000000) {}
            if ((n4 & 0xFF000000) == 0x3000000) {
                final int n5 = n4 & 0xFF00FF;
                final int n6 = n4 >> 8 & 0xFF;
                for (int k = 0; k < palette.length; ++k) {
                    final int n7 = palette[k];
                    if ((n7 & 0xFFFF) == n7 >> 8) {
                        final int n8 = n7 & 0xFF;
                        palette[k] = ((n5 * n8 >> 8 & 0xFF00FF) | (n6 * n8 & 0xFF00));
                    }
                }
            }
            for (int l = 0; l < palette.length; ++l) {
                palette[l] = UrlRequest.Rasterizer3D_brighten(palette[l], n);
            }
            int n9;
            if (j == 0) {
                n9 = 0;
            }
            else {
                n9 = this.pixels[j - 1];
            }
            if (n9 == 0) {
                if (method2313.yOffset == n2) {
                    for (int n10 = 0; n10 < n3; ++n10) {
                        this.field1951[n10] = palette[pixels[n10] & 0xFF];
                    }
                }
                else if (method2313.yOffset == 64 && n2 == 128) {
                    int n11 = 0;
                    for (int n12 = 0; n12 < n2; ++n12) {
                        for (int n13 = 0; n13 < n2; ++n13) {
                            this.field1951[n11++] = palette[pixels[(n13 >> 1) + (n12 >> 1 << 6)] & 0xFF];
                        }
                    }
                }
                else {
                    if (method2313.yOffset != 128 || n2 != 64) {
                        throw new RuntimeException();
                    }
                    int n14 = 0;
                    for (int n15 = 0; n15 < n2; ++n15) {
                        for (int n16 = 0; n16 < n2; ++n16) {
                            this.field1951[n14++] = palette[pixels[(n16 << 1) + (n15 << 1 << 7)] & 0xFF];
                        }
                    }
                }
            }
            if (n9 == 1) {}
            if (n9 == 2) {}
            if (n9 == 3) {}
        }
        return true;
    }
    
    void aq() {
        this.field1951 = null;
    }
    
    public void setU(final float ty) {
        this.ty = ty;
    }
    
    public int getAnimationSpeed() {
        return this.animationSpeed;
    }
    
    public float getV() {
        return this.yu;
    }
    
    public void setV(final float yu) {
        this.yu = yu;
    }
    
    public int getAnimationDirection() {
        return this.animationDirection;
    }
}
