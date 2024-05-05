// 
// Decompiled by Procyon v0.5.36
// 

public class TextureProvider implements TextureLoader, net.runelite.api.TextureProvider
{
    AbstractArchive archive;
    Texture[] textures;
    double brightness;
    int remaining;
    NodeDeque deque;
    int textureSize;
    int capacity;
    
    public TextureProvider(final AbstractArchive abstractArchive, final AbstractArchive archive, final int n, final double brightness, final int n2) {
        this.deque = new NodeDeque();
        this.remaining = 0;
        this.brightness = 1.0;
        this.textureSize = 910538112;
        this.archive = archive;
        this.capacity = -909227037 * n;
        this.remaining = -668183133 * this.capacity;
        this.brightness = brightness;
        this.textureSize = 1080855403 * n2;
        final int[] yk = AbstractArchive.yk(abstractArchive, 0, 296342556);
        if (yk != null) {
            final int length = yk.length;
            this.textures = new Texture[abstractArchive.getGroupFileCount(0, (byte)53)];
            for (int i = 0; i < length; ++i) {
                this.textures[yk[i]] = new Texture(new Buffer(abstractArchive.takeFile(0, yk[i], (byte)(-49))));
            }
        }
        else {
            this.textures = new Texture[0];
        }
        this.yr(abstractArchive, archive, n, brightness, n2);
    }
    
    public int[] load(final int n) {
        return this.getTexturePixels(n, -1596513386);
    }
    
    public void ad(final int n) {
        for (int i = 0; i < this.textures.length; ++i) {
            final Texture texture = this.textures[i];
            if (texture != null && 0 != texture.animationDirection && texture.isLoaded) {
                Texture.rh(texture, n);
                texture.isLoaded = false;
            }
        }
    }
    
    public Texture[] gc() {
        return this.textures;
    }
    
    @Override
    public int ao(final int n) {
        if (null != this.textures[n]) {
            return this.textures[n].averageRGB;
        }
        return 0;
    }
    
    public void ak(final int n) {
        for (int i = 0; i < this.textures.length; ++i) {
            final Texture texture = this.textures[i];
            if (texture != null && 0 != texture.animationDirection && texture.isLoaded) {
                Texture.rh(texture, n);
                texture.isLoaded = false;
            }
        }
    }
    
    @Override
    public boolean av(final int n) {
        return this.textures[n].field1954;
    }
    
    public void as() {
        for (int i = 0; i < this.textures.length; ++i) {
            if (this.textures[i] != null) {
                this.textures[i].reset();
            }
        }
        this.deque = new NodeDeque();
        this.remaining = this.capacity * -668183133;
    }
    
    public void az(final int n) {
        for (int i = 0; i < this.textures.length; ++i) {
            final Texture texture = this.textures[i];
            if (texture != null && 0 != texture.animationDirection && texture.isLoaded) {
                Texture.rh(texture, n);
                texture.isLoaded = false;
            }
        }
    }
    
    @Override
    public int ax(final int n) {
        if (null != this.textures[n]) {
            return this.textures[n].averageRGB;
        }
        return 0;
    }
    
    @Override
    public int[] ay(final int n) {
        final Texture texture = this.textures[n];
        if (texture != null) {
            if (texture.field1951 != null) {
                this.deque.addLast(texture);
                texture.isLoaded = true;
                return texture.field1951;
            }
            if (texture.load(this.brightness, -1962784445 * this.textureSize, this.archive)) {
                if (0 == this.remaining * -1759525447) {
                    ((Texture)NodeDeque.od(this.deque)).reset();
                }
                else {
                    this.remaining += 1869565815;
                }
                this.deque.addLast(texture);
                texture.isLoaded = true;
                return texture.field1951;
            }
        }
        return null;
    }
    
    public void dt(final int n) {
        ScriptFrame.client.getCallbacks().drawAboveOverheads();
    }
    
    public static void fn(final TextureProvider textureProvider) {
        if (textureProvider == null) {
            textureProvider.getTextures();
        }
        for (int i = 0; i < textureProvider.textures.length; ++i) {
            if (textureProvider.textures[i] != null) {
                textureProvider.textures[i].reset();
            }
        }
        textureProvider.deque = new NodeDeque();
        textureProvider.remaining = textureProvider.capacity * -668183133;
    }
    
    @Override
    public int[] getTexturePixels(final int n, final int n2) {
        try {
            final Texture texture = this.textures[n];
            if (texture != null) {
                if (texture.field1951 != null) {
                    this.deque.addLast(texture);
                    texture.isLoaded = true;
                    return texture.field1951;
                }
                if (texture.load(this.brightness, -1962784445 * this.textureSize, this.archive)) {
                    if (n2 <= -1833096007) {
                        throw new IllegalStateException();
                    }
                    if (0 == this.remaining * -1759525447) {
                        if (n2 <= -1833096007) {
                            throw new IllegalStateException();
                        }
                        ((Texture)NodeDeque.od(this.deque)).reset();
                    }
                    else {
                        this.remaining += 1869565815;
                    }
                    this.deque.addLast(texture);
                    texture.isLoaded = true;
                    return texture.field1951;
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.aw(" + ')');
        }
    }
    
    @Override
    public boolean am(final int n) {
        return 64 == this.textureSize * -1569371429;
    }
    
    public void animate(final int n, final int n2) {
        try {
            for (int i = 0; i < this.textures.length; ++i) {
                if (n2 >= 384764811) {
                    throw new IllegalStateException();
                }
                final Texture texture = this.textures[i];
                if (texture != null) {
                    if (n2 >= 384764811) {
                        throw new IllegalStateException();
                    }
                    if (0 != texture.animationDirection) {
                        if (n2 >= 384764811) {
                            this.dt(n);
                            return;
                        }
                        if (texture.isLoaded) {
                            if (n2 >= 384764811) {
                                this.dt(n);
                                return;
                            }
                            Texture.rh(texture, n);
                            texture.isLoaded = false;
                        }
                    }
                }
            }
            this.dt(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.al(" + ')');
        }
    }
    
    public static int animate(final long n) {
        try {
            return (int)(n >>> 14 & 0x3L);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.al(" + ')');
        }
    }
    
    public void setBrightness(final double brightness) {
        try {
            this.brightness = brightness;
            this.clear(551874647);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.an(" + ')');
        }
    }
    
    @Override
    public int getAverageTextureRGB(final int n, final int n2) {
        try {
            if (null == this.textures[n]) {
                return 0;
            }
            if (n2 <= -1934843273) {
                throw new IllegalStateException();
            }
            return this.textures[n].averageRGB;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.ac(" + ')');
        }
    }
    
    public void nx(final int n) {
        this.remaining = n * -1869565815;
    }
    
    @Override
    public boolean vmethod3989(final int n, final byte b) {
        try {
            return this.textures[n].field1954;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.au(" + ')');
        }
    }
    
    @Override
    public int ai(final int n) {
        if (null != this.textures[n]) {
            return this.textures[n].averageRGB;
        }
        return 0;
    }
    
    public static int kr(final TextureProvider textureProvider) {
        if (0 == textureProvider.textures.length) {
            return 100;
        }
        int n = 0;
        int n2 = 0;
        final Texture[] textures = textureProvider.textures;
        for (int i = 0; i < textures.length; ++i) {
            final Texture texture = textures[i];
            if (null != texture) {
                if (null != texture.field1952) {
                    n += texture.field1952.length;
                    final int[] field1952 = texture.field1952;
                    for (int j = 0; j < field1952.length; ++j) {
                        if (textureProvider.archive.di(field1952[j], 953853219)) {
                            ++n2;
                        }
                    }
                }
            }
        }
        if (n == 0) {
            return 0;
        }
        return 100 * n2 / n;
    }
    
    @Override
    public boolean ar(final int n) {
        return 64 == this.textureSize * -1798234843;
    }
    
    public int getLoadedPercentage(final int n) {
        try {
            if (0 == this.textures.length) {
                return 100;
            }
            int n2 = 0;
            int n3 = 0;
            final Texture[] textures = this.textures;
            for (int i = 0; i < textures.length; ++i) {
                if (n != 1658187175) {
                    throw new IllegalStateException();
                }
                final Texture texture = textures[i];
                if (null != texture) {
                    if (n != 1658187175) {
                        throw new IllegalStateException();
                    }
                    if (null != texture.field1952) {
                        n2 += texture.field1952.length;
                        final int[] field1952 = texture.field1952;
                        for (int j = 0; j < field1952.length; ++j) {
                            if (n != 1658187175) {
                                throw new IllegalStateException();
                            }
                            if (this.archive.di(field1952[j], 953853219)) {
                                if (n != 1658187175) {
                                    throw new IllegalStateException();
                                }
                                ++n3;
                            }
                        }
                    }
                }
            }
            if (n2 != 0) {
                return 100 * n3 / n2;
            }
            if (n != 1658187175) {
                throw new IllegalStateException();
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.af(" + ')');
        }
    }
    
    public static void wa(final TextureProvider textureProvider, final double n) {
        if (textureProvider == null) {
            textureProvider.setBrightness(n);
            return;
        }
        textureProvider.brightness = n;
        textureProvider.clear(-718121098);
    }
    
    @Override
    public boolean isLowDetail(final int n, final int n2) {
        try {
            boolean b;
            if (64 == this.textureSize * -1962784445) {
                if (n2 != -407888071) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.ab(" + ')');
        }
    }
    
    static final void isLowDetail(final int n, final int n2, final int n3, final int n4) {
        try {
            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 8; ++j) {
                    if (n4 <= 969723822) {
                        throw new IllegalStateException();
                    }
                    Client.gk.kw[n][n2 + i][n3 + j] = 0;
                }
            }
            if (n2 > 0) {
                for (int k = 1; k < 8; ++k) {
                    if (n4 <= 969723822) {
                        throw new IllegalStateException();
                    }
                    Client.gk.kw[n][n2][n3 + k] = Client.gk.kw[n][n2 - 1][n3 + k];
                }
            }
            if (n3 > 0) {
                for (int l = 1; l < 8; ++l) {
                    if (n4 <= 969723822) {
                        return;
                    }
                    Client.gk.kw[n][n2 + l][n3] = Client.gk.kw[n][n2 + l][n3 - 1];
                }
            }
            if (n2 > 0) {
                if (n4 <= 969723822) {
                    return;
                }
                if (Client.gk.kw[n][n2 - 1][n3] != 0) {
                    if (n4 <= 969723822) {
                        throw new IllegalStateException();
                    }
                    Client.gk.kw[n][n2][n3] = Client.gk.kw[n][n2 - 1][n3];
                    return;
                }
            }
            if (n3 > 0) {
                if (n4 <= 969723822) {
                    throw new IllegalStateException();
                }
                if (Client.gk.kw[n][n2][n3 - 1] != 0) {
                    Client.gk.kw[n][n2][n3] = Client.gk.kw[n][n2][n3 - 1];
                    return;
                }
            }
            if (n2 > 0) {
                if (n4 <= 969723822) {
                    throw new IllegalStateException();
                }
                if (n3 > 0) {
                    if (n4 <= 969723822) {
                        throw new IllegalStateException();
                    }
                    if (Client.gk.kw[n][n2 - 1][n3 - 1] != 0) {
                        if (n4 <= 969723822) {
                            return;
                        }
                        Client.gk.kw[n][n2][n3] = Client.gk.kw[n][n2 - 1][n3 - 1];
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.ab(" + ')');
        }
    }
    
    public void clear(final int n) {
        try {
            for (int i = 0; i < this.textures.length; ++i) {
                if (n <= -1476440325) {
                    throw new IllegalStateException();
                }
                if (this.textures[i] != null) {
                    if (n <= -1476440325) {
                        throw new IllegalStateException();
                    }
                    this.textures[i].reset();
                }
            }
            this.deque = new NodeDeque();
            this.remaining = this.capacity * -668183133;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "im.aq(" + ')');
        }
    }
    
    @Override
    public boolean ag(final int n) {
        return this.textures[n].field1954;
    }
    
    public int getDefaultColor(final int n) {
        return this.getAverageTextureRGB(n, -570572153);
    }
    
    public void oi(final int n) {
        this.capacity = n * -909227037;
    }
    
    @Override
    public boolean ah(final int n) {
        return this.textures[n].field1954;
    }
    
    public void yr(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n, final double n2, final int n3) {
        this.oi(128);
        this.nx(128);
    }
    
    public double getBrightness() {
        return this.brightness;
    }
    
    public void setBrightness(final double brightness) {
        this.setBrightness(brightness);
    }
}
