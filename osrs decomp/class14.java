import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.5.36
// 

public class class14
{
    static final int as = 22;
    final int field44;
    final String field45;
    static UrlRequester urlRequester;
    static final int xp = 12;
    static final int mf = 4;
    final ThreadPoolExecutor field47;
    final ThreadFactory field48;
    
    public class14(final String field45, final int n, final int n2) {
        this.field45 = field45;
        this.field44 = -1983210819 * n;
        this.field48 = new class16(this);
        this.field47 = this.method51(n2, 140913775);
    }
    
    public final void at() {
        try {
            this.field47.shutdown();
        }
        catch (Exception obj) {
            System.err.println("Error shutting down RestRequestService\r\n" + obj);
        }
    }
    
    static void method55(final int n, final int n2) {
        try {
            class129.method763(14, (byte)54);
            Login.field738 = n * -1919975363;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ag.av(" + ')');
        }
    }
    
    public static class18 ni(final class14 class14, final class10 class15, final byte b) {
        if (class14 == null) {
            return class14.method52(class15, b);
        }
        try {
            if (class14.field47.getQueue().remainingCapacity() > 0) {
                return new class18(class14.field47.submit((Callable<Object>)new class19(class14, class15)));
            }
            if (b != 1) {
                throw new IllegalStateException();
            }
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + class14.field47.getCorePoolSize() + " Queue capacity " + class14.field44 * 1905963157);
            return new class18("Queue full");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ag.an(" + ')');
        }
    }
    
    static String method57(final char c, final int n, final byte b) {
        try {
            final char[] value = new char[n];
            for (int i = 0; i < n; ++i) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                value[i] = c;
            }
            return new String(value);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ag.ax(" + ')');
        }
    }
    
    public static ThreadPoolExecutor dl(final class14 class14, final int n) {
        return new ThreadPoolExecutor(n, n, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1905963157 * class14.field44), class14.field48);
    }
    
    static final void method53(final boolean b, final int n) {
        try {
            if (b) {
                if (n >= 12457961) {
                    throw new IllegalStateException();
                }
                class135 field394;
                if (Login.field751) {
                    if (n >= 12457961) {
                        throw new IllegalStateException();
                    }
                    field394 = class135.field1299;
                }
                else {
                    field394 = class135.field1301;
                }
                Client.field394 = field394;
            }
            else {
                class135 field395;
                if (ClientPreferences.setBrightness(class20.clientPreferences, Login.Login_username, (byte)(-11))) {
                    if (n >= 12457961) {
                        throw new IllegalStateException();
                    }
                    field395 = class135.field1302;
                }
                else {
                    field395 = class135.field1305;
                }
                Client.field394 = field395;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ag.hb(" + ')');
        }
    }
    
    public final void method54(final int n) {
        try {
            try {
                this.field47.shutdown();
            }
            catch (Exception obj) {
                System.err.println("Error shutting down RestRequestService\r\n" + obj);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ag.aw(" + ')');
        }
    }
    
    public final void al() {
        try {
            this.field47.shutdown();
        }
        catch (Exception obj) {
            System.err.println("Error shutting down RestRequestService\r\n" + obj);
        }
    }
    
    static float method52(final class125 class125, final float n, final byte b) {
        try {
            if (null != class125) {
                final float n2 = n - class125.field1221;
                return class125.field1226 + n2 * (class125.field1237 + n2 * (class125.field1223 * n2 + class125.field1224));
            }
            if (b <= 18) {
                throw new IllegalStateException();
            }
            return 0.0f;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ag.an(" + ')');
        }
    }
    
    public class18 method52(final class10 class10, final byte b) {
        try {
            if (this.field47.getQueue().remainingCapacity() > 0) {
                return new class18(this.field47.submit((Callable<Object>)new class19(this, class10)));
            }
            if (b != 1) {
                throw new IllegalStateException();
            }
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field47.getCorePoolSize() + " Queue capacity " + this.field44 * 1905963157);
            return new class18("Queue full");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ag.an(" + ')');
        }
    }
    
    final ThreadPoolExecutor au(final int n) {
        return new ThreadPoolExecutor(n, n, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1483242025 * this.field44), this.field48);
    }
    
    public static void kr(final VorbisFloor vorbisFloor, final int n, final int n2, int n3, final int n4, final float[] array, final int n5) {
        if (vorbisFloor == null) {
            vorbisFloor.readSubmapFloor();
        }
        final int n6 = n4 - n2;
        final int n7 = n3 - n;
        final int n8 = (n6 < 0) ? (-n6) : n6;
        final int n9 = n6 / n7;
        int n10 = n2;
        int n11 = 0;
        final int n12 = (n6 < 0) ? (n9 - 1) : (n9 + 1);
        final int n13 = n8 - ((n9 < 0) ? (-n9) : n9) * n7;
        array[n] *= VorbisFloor.VorbisFloor_decibelStatics[n10];
        if (n3 > n5) {
            n3 = n5;
        }
        for (int i = n + 1; i < n3; ++i) {
            n11 += n13;
            if (n11 >= n7) {
                n11 -= n7;
                n10 += n12;
            }
            else {
                n10 += n9;
            }
            final int n14 = i;
            array[n14] *= VorbisFloor.VorbisFloor_decibelStatics[n10];
        }
    }
    
    final ThreadPoolExecutor method51(final int maximumPoolSize, final int n) {
        return new ThreadPoolExecutor(0, maximumPoolSize, 2L, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(this.field44 * 1905963157), this.field48);
    }
    
    public class18 ab(final class10 class10) {
        if (this.field47.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field47.getCorePoolSize() + " Queue capacity " + this.field44 * 1905963157);
            return new class18("Queue full");
        }
        return new class18(this.field47.submit((Callable<Object>)new class19(this, class10)));
    }
    
    public class18 aq(final class10 class10) {
        if (this.field47.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field47.getCorePoolSize() + " Queue capacity " + this.field44 * 1905963157);
            return new class18("Queue full");
        }
        return new class18(this.field47.submit((Callable<Object>)new class19(this, class10)));
    }
    
    public static void method56(final int n) {
        try {
            ObjectComposition.ObjectDefinition_cached.clear();
            ObjectComposition.ObjectDefinition_cachedModelData.clear();
            ObjectComposition.ObjectDefinition_cachedEntities.clear();
            ObjectComposition.ObjectDefinition_cachedModels.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ag.ag(" + ')');
        }
    }
}
