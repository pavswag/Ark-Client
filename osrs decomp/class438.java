import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.net.URLEncoder;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class class438 implements class436
{
    final Map field3827;
    static final int at = 4;
    static final int an = 8;
    
    public class438(final Map field3827) {
        this.field3827 = field3827;
    }
    
    public String at() throws UnsupportedEncodingException {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : this.field3827.entrySet()) {
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode((String)entry.getValue(), "UTF-8")).append("&");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.insert(0, "?");
        return sb.toString();
    }
    
    public String ay() throws UnsupportedEncodingException {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : this.field3827.entrySet()) {
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode((String)entry.getValue(), "UTF-8")).append("&");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.insert(0, "?");
        return sb.toString();
    }
    
    @Override
    public class435 aw() {
        return null;
    }
    
    public String al() throws UnsupportedEncodingException {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : this.field3827.entrySet()) {
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode((String)entry.getValue(), "UTF-8")).append("&");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.insert(0, "?");
        return sb.toString();
    }
    
    @Override
    public byte[] vmethod7797(final int n) throws UnsupportedEncodingException {
        try {
            return this.method2298(-759167743).getBytes("UTF-8");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qa.an(" + ')');
        }
    }
    
    @Override
    public byte[] ac() throws UnsupportedEncodingException {
        return this.method2298(-759167743).getBytes("UTF-8");
    }
    
    public String method2298(final int n) throws UnsupportedEncodingException {
        try {
            final StringBuilder sb = new StringBuilder();
            for (final Map.Entry<K, String> entry : this.field3827.entrySet()) {
                sb.append(URLEncoder.encode((String)entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8")).append("&");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, "?");
            return sb.toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qa.au(" + ')');
        }
    }
    
    public String aa() throws UnsupportedEncodingException {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<K, String> entry : this.field3827.entrySet()) {
            sb.append(URLEncoder.encode((String)entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8")).append("&");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.insert(0, "?");
        return sb.toString();
    }
    
    @Override
    public class435 vmethod2213(final int n) {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qa.af(" + ')');
        }
    }
    
    public String ab() throws UnsupportedEncodingException {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : this.field3827.entrySet()) {
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode((String)entry.getValue(), "UTF-8")).append("&");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.insert(0, "?");
        return sb.toString();
    }
    
    public String aq() throws UnsupportedEncodingException {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : this.field3827.entrySet()) {
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode((String)entry.getValue(), "UTF-8")).append("&");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.insert(0, "?");
        return sb.toString();
    }
}
