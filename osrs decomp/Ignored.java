import java.awt.image.ImageObserver;
import java.awt.Graphics;
import java.net.URI;
import java.awt.Desktop;
import net.runelite.api.Ignore;

// 
// Decompiled by Procyon v0.5.36
// 

public class Ignored extends User implements Ignore
{
    static final int am = 21;
    int id;
    static final int ax = 13;
    
    Ignored() {
    }
    
    @Override
    public int compareTo(final Object o) {
        try {
            return aj(this, (Ignored)o, (byte)(-21));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pi.compareTo(" + ')');
        }
    }
    
    int at(final Ignored ignored) {
        return this.id * 1112765472 - ignored.id * -649363884;
    }
    
    int aw(final Ignored ignored) {
        return this.id * -1260376973 - ignored.id * -1260376973;
    }
    
    @Override
    public int al(final User user) {
        return aj(this, (Ignored)user, (byte)(-48));
    }
    
    @Override
    public int compareTo_user(final User user, final int n) {
        try {
            return aj(this, (Ignored)user, (byte)(-26));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pi.an(" + ')');
        }
    }
    
    @Override
    public int ac(final Object o) {
        return aj(this, (Ignored)o, (byte)(-20));
    }
    
    @Override
    public int au(final Object o) {
        return aj(this, (Ignored)o, (byte)(-100));
    }
    
    int aa(final Ignored ignored) {
        return this.id * -1260376973 - ignored.id * -1260376973;
    }
    
    public static void compareTo_ignored(final String str, final boolean b, final boolean b2, final byte b3) {
        try {
            if (b) {
                if (b3 == 16) {
                    throw new IllegalStateException();
                }
                if (!b2) {
                    if (b3 == 16) {
                        throw new IllegalStateException();
                    }
                    if (Desktop.isDesktopSupported()) {
                        if (b3 == 16) {
                            throw new IllegalStateException();
                        }
                        if (Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(str));
                                return;
                            }
                            catch (Exception ex2) {}
                        }
                    }
                }
                if (class31.field91.startsWith("win")) {
                    if (b3 == 16) {
                        throw new IllegalStateException();
                    }
                    if (!b2) {
                        GrandExchangeOfferOwnWorldComparator.method366(str, 0, -1881594254);
                        return;
                    }
                }
                if (class31.field91.startsWith("mac")) {
                    if (b3 == 16) {
                        throw new IllegalStateException();
                    }
                    RouteStrategy.method1177(str, 1, "openjs", -501939773);
                }
                else {
                    RouteStrategy.method1177(str, 2, "openjs", -1286411552);
                }
            }
            else {
                RouteStrategy.method1177(str, 3, "openjs", -1501532874);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pi.af(" + ')');
        }
    }
    
    int compareTo_ignored(final Ignored ignored, final byte b) {
        try {
            return this.id * -1260376973 - ignored.id * -1260376973;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pi.af(" + ')');
        }
    }
    
    public int ab(final Object o) {
        return aj(this, (Ignored)o, (byte)(-37));
    }
    
    @Override
    public int aq(final User user) {
        return aj(this, (Ignored)user, (byte)(-114));
    }
    
    public static int aj(final Ignored ignored, final Ignored ignored2, final byte b) {
        if (ignored == null) {
            ignored.compareTo_ignored(ignored, b);
        }
        try {
            return ignored.id * -1260376973 - ignored2.id * -1260376973;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pi.af(" + ')');
        }
    }
    
    public static void mp(final RasterProvider rasterProvider, final Graphics graphics, final int n, final int n2) {
        try {
            graphics.drawImage(rasterProvider.image, n, n2, rasterProvider.component);
        }
        catch (Exception ex) {
            rasterProvider.component.repaint();
        }
    }
    
    public static int jl(final class219 class219) {
        return class219.field2001.length;
    }
}
