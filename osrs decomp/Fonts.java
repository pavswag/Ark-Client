import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class Fonts
{
    AbstractArchive fontsArchive;
    HashMap map;
    AbstractArchive spritesArchive;
    
    public Fonts(final AbstractArchive spritesArchive, final AbstractArchive fontsArchive) {
        this.spritesArchive = spritesArchive;
        this.fontsArchive = fontsArchive;
        this.map = new HashMap();
    }
    
    public static HashMap ie(final Fonts fonts, final FontName[] array) {
        if (fonts == null) {
            fonts.an(array);
        }
        final HashMap<FontName, Font> hashMap = new HashMap<FontName, Font>();
        for (int i = 0; i < array.length; ++i) {
            final FontName key = array[i];
            if (fonts.map.containsKey(key)) {
                hashMap.put(key, (Font)fonts.map.get(key));
            }
            else {
                final Font write = BufferedNetSocket.write(fonts.spritesArchive, fonts.fontsArchive, key.name, "", 1606925660);
                if (write != null) {
                    fonts.map.put(key, write);
                    hashMap.put(key, write);
                }
            }
        }
        return hashMap;
    }
    
    public HashMap an(final FontName[] array) {
        final HashMap<FontName, Font> hashMap = new HashMap<FontName, Font>();
        for (int i = 0; i < array.length; ++i) {
            final FontName key = array[i];
            if (this.map.containsKey(key)) {
                hashMap.put(key, (Font)this.map.get(key));
            }
            else {
                final Font write = BufferedNetSocket.write(this.spritesArchive, this.fontsArchive, key.name, "", 1606925660);
                if (write != null) {
                    this.map.put(key, write);
                    hashMap.put(key, write);
                }
            }
        }
        return hashMap;
    }
    
    public HashMap createMap(final FontName[] array, final byte b) {
        try {
            final HashMap<FontName, Font> hashMap = new HashMap<FontName, Font>();
            for (int i = 0; i < array.length; ++i) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                final FontName key = array[i];
                if (this.map.containsKey(key)) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    hashMap.put(key, (Font)this.map.get(key));
                }
                else {
                    final Font write = BufferedNetSocket.write(this.spritesArchive, this.fontsArchive, key.name, "", 1606925660);
                    if (write != null) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        this.map.put(key, write);
                        hashMap.put(key, write);
                    }
                }
            }
            return hashMap;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ra.af(" + ')');
        }
    }
}
