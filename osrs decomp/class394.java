import java.awt.event.FocusListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.Component;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import java.util.HashMap;
import java.text.DecimalFormat;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class class394
{
    final Map field3683;
    static final String an = "Accept";
    static final String aw = "Authorization";
    public static int[] SpriteBuffer_spritePalette;
    final Map field3685;
    final DecimalFormat field3686;
    public static final String af = "Content-Type";
    
    public class394() {
        this.field3683 = new HashMap();
        this.field3685 = new HashMap();
        (this.field3686 = new DecimalFormat()).setMaximumFractionDigits(2);
    }
    
    public void bs(final class435 class435) {
        this.method2112(class435, 1.0f, -78813818);
    }
    
    public void ae(final String s, final String s2) {
        if (null != s && !s.isEmpty()) {
            this.field3683.put(s, (s2 != null) ? s2 : "");
        }
    }
    
    public void bb(final String s) {
        if (null != s && !s.isEmpty()) {
            this.field3683.remove(s);
        }
    }
    
    void method2113(final int n) {
        try {
            this.field3683.remove("Accept");
            if (!this.field3685.isEmpty()) {
                if (n <= 539068886) {
                    return;
                }
                this.field3683.put("Accept", ri(this, 269746303));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.ao(" + ')');
        }
    }
    
    public void method2110(final int n) {
        try {
            this.field3683.remove("Content-Type");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.at(" + ')');
        }
    }
    
    public void ak(final String s, final String s2) {
        if (null != s && !s.isEmpty()) {
            this.field3683.put(s, (s2 != null) ? s2 : "");
        }
    }
    
    public void av(final HttpsURLConnection httpsURLConnection) {
        for (final Map.Entry<String, V> entry : this.field3683.entrySet()) {
            httpsURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
        }
    }
    
    void be(final class393 class393, final String s) {
        this.method2106("Authorization", String.format("%s %s", class393.method2102((byte)110), s), -1489361673);
    }
    
    public void az(final String s, final String s2) {
        if (null != s && !s.isEmpty()) {
            this.field3683.put(s, (s2 != null) ? s2 : "");
        }
    }
    
    public static void method2116(final class394 class394) {
        if (class394 == null) {
            class394.bv();
            return;
        }
        class394.field3683.remove("Accept");
        if (!class394.field3685.isEmpty()) {
            class394.field3683.put("Accept", ri(class394, -447293098));
        }
    }
    
    String method2116(final int n) {
        try {
            final ArrayList<Object> list = new ArrayList<Object>(this.field3685.entrySet());
            Collections.sort(list, new class395(this));
            final StringBuilder sb = new StringBuilder();
            final Iterator<T> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (n == -964267539) {
                    throw new IllegalStateException();
                }
                final Map.Entry<class435, V> entry = (Map.Entry<class435, V>)iterator.next();
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(class435.mo(entry.getKey(), 797480377));
                final float floatValue = (float)entry.getValue();
                if (floatValue >= 1.0f) {
                    continue;
                }
                if (n == -964267539) {
                    throw new IllegalStateException();
                }
                sb.append(";q=").append(this.field3686.format(floatValue));
            }
            return sb.toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.ax(" + ')');
        }
    }
    
    void method2112(final class435 class435, final float b, final int n) {
        try {
            this.field3685.put(class435, Math.max(0.0f, Math.min(1.0f, b)));
            this.method2113(720033407);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.ay(" + ')');
        }
    }
    
    public static void ps(final class394 class394, final String s) {
        if (class394 == null) {
            class394.bz(s);
        }
        class394.method2107(class393.field3681, s, (byte)84);
    }
    
    void bi(final class393 class393, final String s) {
        this.method2106("Authorization", String.format("%s %s", class393.method2102((byte)19), s), -2050894255);
    }
    
    void bv() {
        this.field3683.remove("Accept");
        if (!this.field3685.isEmpty()) {
            this.field3683.put("Accept", ri(this, 1051847542));
        }
    }
    
    public void bo(final String s) {
        this.method2107(class393.field3681, s, (byte)84);
    }
    
    public void br(final class435 class435) {
        this.method2112(class435, 1.0f, -12160586);
    }
    
    public static void ne(final class394 class394, final String s, final short n) {
        if (class394 == null) {
            class394.method2115(s, n);
            return;
        }
        try {
            if (null != s) {
                if (n >= 128) {
                    throw new IllegalStateException();
                }
                if (!s.isEmpty()) {
                    class394.field3683.remove(s);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.ac(" + ')');
        }
    }
    
    public void method2106(final String s, final String s2, final int n) {
        try {
            if (null != s) {
                if (n >= 1788650387) {
                    throw new IllegalStateException();
                }
                if (!s.isEmpty()) {
                    if (n >= 1788650387) {
                        throw new IllegalStateException();
                    }
                    final Map field3683 = this.field3683;
                    String s3;
                    if (s2 != null) {
                        if (n >= 1788650387) {
                            return;
                        }
                        s3 = s2;
                    }
                    else {
                        s3 = "";
                    }
                    field3683.put(s, s3);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.aw(" + ')');
        }
    }
    
    public void method2109(final class435 class435, final int n) {
        try {
            this.field3683.put("Content-Type", class435.mo(class435, 797480377));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.al(" + ')');
        }
    }
    
    public Map method2105(final int n) {
        try {
            return this.field3683;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.an(" + ')');
        }
    }
    
    public void method2115(final String s, final short n) {
        try {
            if (null != s) {
                if (n >= 128) {
                    throw new IllegalStateException();
                }
                if (!s.isEmpty()) {
                    this.field3683.remove(s);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.ac(" + ')');
        }
    }
    
    public static void ur(final class394 class394, final HttpsURLConnection httpsURLConnection, final int n) {
        if (class394 == null) {
            class394.method2104(httpsURLConnection, n);
        }
        try {
            final Iterator<Map.Entry<String, V>> iterator = class394.field3683.entrySet().iterator();
            while (iterator.hasNext()) {
                if (n <= 1692969259) {
                    throw new IllegalStateException();
                }
                final Map.Entry<String, V> entry = iterator.next();
                httpsURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.af(" + ')');
        }
    }
    
    public static void vn(final class394 class394, final class435 class395) {
        class394.field3683.put("Content-Type", class435.mo(class395, 797480377));
    }
    
    public static String ri(final class394 class394, final int n) {
        if (class394 == null) {
            return class394.method2116(n);
        }
        try {
            final ArrayList<Object> list = new ArrayList<Object>(class394.field3685.entrySet());
            Collections.sort(list, new class395(class394));
            final StringBuilder sb = new StringBuilder();
            final Iterator<T> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (n == -964267539) {
                    throw new IllegalStateException();
                }
                final Map.Entry<class435, V> entry = (Map.Entry<class435, V>)iterator.next();
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(class435.mo(entry.getKey(), 797480377));
                final float floatValue = (float)entry.getValue();
                if (floatValue >= 1.0f) {
                    continue;
                }
                if (n == -964267539) {
                    throw new IllegalStateException();
                }
                sb.append(";q=").append(class394.field3686.format(floatValue));
            }
            return sb.toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.ax(" + ')');
        }
    }
    
    void method2107(final class393 class393, final String s, final byte b) {
        try {
            this.method2106("Authorization", String.format("%s %s", class393.method2102((byte)43), s), -1992067293);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.au(" + ')');
        }
    }
    
    public void method2111(final class435 class435, final byte b) {
        try {
            this.method2112(class435, 1.0f, -868305920);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.aa(" + ')');
        }
    }
    
    public void ai(final HttpsURLConnection httpsURLConnection) {
        for (final Map.Entry<String, V> entry : this.field3683.entrySet()) {
            httpsURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
        }
    }
    
    public Map ar() {
        return this.field3683;
    }
    
    public void ap(final String s) {
        if (null != s && !s.isEmpty()) {
            this.field3683.remove(s);
        }
    }
    
    public void method2104(final HttpsURLConnection httpsURLConnection, final int n) {
        try {
            final Iterator<Map.Entry<String, V>> iterator = this.field3683.entrySet().iterator();
            while (iterator.hasNext()) {
                if (n <= 1692969259) {
                    throw new IllegalStateException();
                }
                final Map.Entry<String, V> entry = iterator.next();
                httpsURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.af(" + ')');
        }
    }
    
    static void method2104(final Component component, final int n) {
        try {
            component.addMouseListener(MouseHandler.MouseHandler_instance);
            component.addMouseMotionListener(MouseHandler.MouseHandler_instance);
            component.addFocusListener(MouseHandler.MouseHandler_instance);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.af(" + ')');
        }
    }
    
    public void bn(final class435 class435) {
        this.method2112(class435, 1.0f, 195096976);
    }
    
    public void method2114(final String s, final byte b) {
        try {
            this.method2107(class393.field3681, s, (byte)84);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.ab(" + ')');
        }
    }
    
    public void method2108(final String s, final int n) {
        try {
            this.method2107(class393.field3680, s, (byte)84);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.aq(" + ')');
        }
    }
    
    public void aj(final String s, final String s2) {
        if (null != s && !s.isEmpty()) {
            this.field3683.put(s, (s2 != null) ? s2 : "");
        }
    }
    
    public void ag(final HttpsURLConnection httpsURLConnection) {
        for (final Map.Entry<String, V> entry : this.field3683.entrySet()) {
            httpsURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
        }
    }
    
    String bl() {
        final ArrayList<Object> list = new ArrayList<Object>(this.field3685.entrySet());
        Collections.sort(list, new class395(this));
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<K, Float> entry : list) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(class435.mo((class435)entry.getKey(), 797480377));
            final float floatValue = entry.getValue();
            if (floatValue < 1.0f) {
                sb.append(";q=").append(this.field3686.format(floatValue));
            }
        }
        return sb.toString();
    }
    
    public void bz(final String s) {
        this.method2107(class393.field3680, s, (byte)84);
    }
    
    public static void kl(final class394 class394, final int n) {
        if (class394 == null) {
            class394.method2110(n);
            return;
        }
        try {
            class394.field3683.remove("Content-Type");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.at(" + ')');
        }
    }
    
    public void bj() {
        this.field3683.remove("Content-Type");
    }
    
    public static void vg(final class394 class394, final String s, final String s2) {
        if (class394 == null) {
            class394.bv();
            return;
        }
        if (null != s && !s.isEmpty()) {
            class394.field3683.put(s, (s2 != null) ? s2 : "");
        }
    }
    
    public static void rk(final class394 class394, final class435 class395, final int n) {
        if (class394 == null) {
            class394.method2109(class395, n);
        }
        try {
            class394.field3683.put("Content-Type", class435.mo(class395, 797480377));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pc.al(" + ')');
        }
    }
    
    public void bm(final String s) {
        this.method2107(class393.field3680, s, (byte)84);
    }
    
    void bk(final class393 class393, final String s) {
        this.method2106("Authorization", String.format("%s %s", class393.method2102((byte)49), s), 239388088);
    }
    
    public static void yk(final class394 class394, final HttpsURLConnection httpsURLConnection) {
        for (final Map.Entry<String, String> entry : class394.field3683.entrySet()) {
            httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }
    
    void bf(final class435 class435, final float b) {
        this.field3685.put(class435, Math.max(0.0f, Math.min(1.0f, b)));
        this.method2113(984801824);
    }
    
    void bu(final class435 class435, final float b) {
        this.field3685.put(class435, Math.max(0.0f, Math.min(1.0f, b)));
        this.method2113(874944320);
    }
    
    public static void jb(final class394 class394, final String s) {
        if (class394 == null) {
            class394.aj(s, s);
        }
        if (null != s && !s.isEmpty()) {
            class394.field3683.remove(s);
        }
    }
}
