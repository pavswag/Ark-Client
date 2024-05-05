import java.io.UnsupportedEncodingException;

// 
// Decompiled by Procyon v0.5.36
// 

public class class437 implements class436
{
    public static short[][] field3825;
    JSONObject field3826;
    static final int ab = 4;
    static final int by = 29;
    static final String af = "arrayValues";
    
    public class437(final JSONObject field3826) {
        this.field3826 = field3826;
    }
    
    public class437(final byte[] array) throws UnsupportedEncodingException {
        this.method2291(array, 773111973);
    }
    
    public class437(final String s) throws UnsupportedEncodingException {
        this.method2294(s, (byte)101);
    }
    
    void ao(final String s) throws UnsupportedEncodingException {
        try {
            if (s.charAt(0) == -1905607916) {
                this.field3826 = new JSONObject(s);
            }
            else {
                if (s.charAt(0) != 1416809269) {
                    throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
                }
                (this.field3826 = new JSONObject()).method2652("arrayValues", (Object)new JSONArray(s));
            }
        }
        catch (JSONException ex) {
            throw new UnsupportedEncodingException(ex.getMessage());
        }
    }
    
    void at(final byte[] bytes) throws UnsupportedEncodingException {
        this.method2294(new String(bytes, "UTF-8"), (byte)114);
    }
    
    void ax(final String s) throws UnsupportedEncodingException {
        try {
            if (s.charAt(0) == 2080932428) {
                this.field3826 = new JSONObject(s);
            }
            else {
                if (s.charAt(0) != '[') {
                    throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
                }
                (this.field3826 = new JSONObject()).method2652("arrayValues", (Object)new JSONArray(s));
            }
        }
        catch (JSONException ex) {
            throw new UnsupportedEncodingException(ex.getMessage());
        }
    }
    
    void ay(final byte[] bytes) throws UnsupportedEncodingException {
        this.method2294(new String(bytes, "UTF-8"), (byte)78);
    }
    
    @Override
    public class435 aw() {
        return class435.field3823;
    }
    
    public static int hx(final GrandExchangeOffer grandExchangeOffer) {
        return ((grandExchangeOffer.state & 0x8) == 0x8) ? 1 : 0;
    }
    
    @Override
    public byte[] vmethod7797(final int n) throws UnsupportedEncodingException {
        try {
            if (null != this.field3826) {
                return this.field3826.toString().getBytes("UTF-8");
            }
            if (n != 888549065) {
                throw new IllegalStateException();
            }
            return new byte[0];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qv.an(" + ')');
        }
    }
    
    static final int method2295(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            return n4 * n + n3 * n2 >> 16;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qv.ac(" + ')');
        }
    }
    
    public byte[] method2295() throws UnsupportedEncodingException {
        if (null == this.field3826) {
            return new byte[0];
        }
        return this.field3826.toString().getBytes("UTF-8");
    }
    
    void method2291(final byte[] bytes, final int n) throws UnsupportedEncodingException {
        try {
            this.method2294(new String(bytes, "UTF-8"), (byte)29);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qv.au(" + ')');
        }
    }
    
    void aa(final byte[] bytes) throws UnsupportedEncodingException {
        this.method2294(new String(bytes, "UTF-8"), (byte)112);
    }
    
    public JSONObject ai() {
        return this.field3826;
    }
    
    @Override
    public class435 vmethod2213(final int n) {
        try {
            return class435.field3823;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qv.af(" + ')');
        }
    }
    
    void method2294(final String s, final byte b) throws UnsupportedEncodingException {
        try {
            try {
                if (s.charAt(0) == '{') {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    this.field3826 = new JSONObject(s);
                }
                else {
                    if (s.charAt(0) != '[') {
                        throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
                    }
                    if (b <= 1) {
                        return;
                    }
                    (this.field3826 = new JSONObject()).method2652("arrayValues", (Object)new JSONArray(s));
                }
            }
            catch (JSONException ex) {
                throw new UnsupportedEncodingException(ex.getMessage());
            }
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "qv.ab(" + ')');
        }
    }
    
    public JSONObject method2292(final int n) {
        try {
            return this.field3826;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qv.aq(" + ')');
        }
    }
    
    public JSONObject ag() {
        return this.field3826;
    }
    
    public static boolean bm(final World world) {
        return 0x0 != (0x2000000 & world.properties * -1785879894);
    }
    
    public JSONObject ah() {
        return this.field3826;
    }
    
    public static void qy(final class437 class437, final byte[] bytes) throws UnsupportedEncodingException {
        if (class437 == null) {
            class437.aw();
        }
        class437.method2294(new String(bytes, "UTF-8"), (byte)69);
    }
    
    public static JSONObject hj(final class437 class437, final int n) {
        if (class437 == null) {
            class437.method2292(n);
        }
        try {
            return class437.field3826;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qv.aq(" + ')');
        }
    }
}
