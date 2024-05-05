import java.util.Locale;
import java.net.MalformedURLException;
import java.net.URL;

// 
// Decompiled by Procyon v0.5.36
// 

public class class311
{
    static final int bj = 57;
    UrlRequest field2819;
    static final int aw = 100;
    SpritePixels field2820;
    
    class311(final UrlRequest field2819) {
        this.field2819 = field2819;
    }
    
    class311(final String spec, final UrlRequester urlRequester) {
        try {
            this.field2819 = urlRequester.request(new URL(spec), -433559614);
        }
        catch (MalformedURLException ex) {
            this.field2819 = null;
        }
    }
    
    public static String si(final Language language) {
        if (language == null) {
            language.ao();
        }
        return language.getLanguage((byte)40).toLowerCase(Locale.ENGLISH);
    }
    
    public static SpritePixels mm(final class311 class311) {
        if (null == class311.field2820 && class311.field2819 != null && class311.field2819.isDone((byte)(-78))) {
            if (class311.field2819.getResponse((byte)48) != null) {
                class311.field2820 = Strings.method1853(class311.field2819.getResponse((byte)(-21)), -1385885392);
            }
            class311.field2819 = null;
        }
        return class311.field2820;
    }
    
    SpritePixels an() {
        if (null == this.field2820 && this.field2819 != null && this.field2819.isDone((byte)(-57))) {
            if (this.field2819.getResponse((byte)35) != null) {
                this.field2820 = Strings.method1853(this.field2819.getResponse((byte)80), -677914708);
            }
            this.field2819 = null;
        }
        return this.field2820;
    }
    
    SpritePixels method1690(final byte b) {
        try {
            if (null == this.field2820) {
                if (b == 13) {
                    throw new IllegalStateException();
                }
                if (this.field2819 != null && this.field2819.isDone((byte)(-40))) {
                    if (b == 13) {
                        throw new IllegalStateException();
                    }
                    if (this.field2819.getResponse((byte)(-112)) != null) {
                        if (b == 13) {
                            throw new IllegalStateException();
                        }
                        this.field2820 = Strings.method1853(this.field2819.getResponse((byte)(-35)), 112687480);
                    }
                    this.field2819 = null;
                }
            }
            return this.field2820;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lr.af(" + ')');
        }
    }
}
