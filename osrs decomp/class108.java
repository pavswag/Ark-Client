import java.net.HttpURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URLConnection;

// 
// Decompiled by Procyon v0.5.36
// 

public class class108 extends UrlRequester
{
    final boolean field1147;
    public static final String ki = "Date not valid.";
    static String param9;
    public static final int ao = 0;
    
    public class108(final boolean field1147, final int n) {
        super(n);
        this.field1147 = field1147;
    }
    
    URLConnection method673(final UrlRequest urlRequest, final byte b) throws IOException {
        try {
            final URLConnection openConnection = urlRequest.field1152.openConnection();
            this.aw(openConnection, -218004174);
            return openConnection;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ef.ad(" + ')');
        }
    }
    
    URLConnection method674(final UrlRequest urlRequest, final int n) throws IOException {
        try {
            final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)urlRequest.field1152.openConnection();
            if (!this.field1147) {
                if (n <= 191557501) {
                    throw new IllegalStateException();
                }
                final HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
                if (class15.field50 == null) {
                    if (n <= 191557501) {
                        throw new IllegalStateException();
                    }
                    class15.field50 = new class15();
                }
                httpsURLConnection2.setSSLSocketFactory(class15.field50);
            }
            this.aw((URLConnection)httpsURLConnection, 1091477024);
            return httpsURLConnection;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ef.ae(" + ')');
        }
    }
    
    @Override
    void at(final UrlRequest urlRequest) throws IOException {
        URLConnection urlConnection = null;
        try {
            final String protocol = urlRequest.field1152.getProtocol();
            if (protocol.equals("http")) {
                urlConnection = this.method673(urlRequest, (byte)103);
            }
            else {
                if (!protocol.equals("https")) {
                    urlRequest.field1149 = -1267363191 * UrlRequest.field1150;
                    return;
                }
                urlConnection = this.method674(urlRequest, 2136108192);
            }
            this.ac(urlConnection, urlRequest, (byte)1);
        }
        catch (IOException ex) {
            urlRequest.field1149 = UrlRequest.field1150 * -1267363191;
        }
        finally {
            if (null != urlConnection && urlConnection instanceof HttpURLConnection) {
                ((HttpURLConnection)urlConnection).disconnect();
            }
        }
    }
    
    URLConnection be(final UrlRequest urlRequest) throws IOException {
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)urlRequest.field1152.openConnection();
        if (!this.field1147) {
            final HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
            if (class15.field50 == null) {
                class15.field50 = new class15();
            }
            httpsURLConnection2.setSSLSocketFactory(class15.field50);
        }
        this.aw((URLConnection)httpsURLConnection, 574423489);
        return httpsURLConnection;
    }
    
    URLConnection bi(final UrlRequest urlRequest) throws IOException {
        final URLConnection openConnection = urlRequest.field1152.openConnection();
        this.aw(openConnection, 623183817);
        return openConnection;
    }
    
    URLConnection bo(final UrlRequest urlRequest) throws IOException {
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)urlRequest.field1152.openConnection();
        if (!this.field1147) {
            final HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
            if (class15.field50 == null) {
                class15.field50 = new class15();
            }
            httpsURLConnection2.setSSLSocketFactory(class15.field50);
        }
        this.aw((URLConnection)httpsURLConnection, -23259689);
        return httpsURLConnection;
    }
    
    @Override
    void al(final UrlRequest urlRequest) throws IOException {
        URLConnection urlConnection = null;
        try {
            final String protocol = urlRequest.field1152.getProtocol();
            if (protocol.equals("http")) {
                urlConnection = this.method673(urlRequest, (byte)(-122));
            }
            else {
                if (!protocol.equals("https")) {
                    urlRequest.field1149 = -1267363191 * UrlRequest.field1150;
                    return;
                }
                urlConnection = this.method674(urlRequest, 1164952618);
            }
            this.ac(urlConnection, urlRequest, (byte)1);
        }
        catch (IOException ex) {
            urlRequest.field1149 = UrlRequest.field1150 * -1267363191;
        }
        finally {
            if (null != urlConnection && urlConnection instanceof HttpURLConnection) {
                ((HttpURLConnection)urlConnection).disconnect();
            }
        }
    }
    
    URLConnection by(final UrlRequest urlRequest) throws IOException {
        final URLConnection openConnection = urlRequest.field1152.openConnection();
        this.aw(openConnection, 1383463735);
        return openConnection;
    }
    
    URLConnection bx(final UrlRequest urlRequest) throws IOException {
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)urlRequest.field1152.openConnection();
        if (!this.field1147) {
            final HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
            if (class15.field50 == null) {
                class15.field50 = new class15();
            }
            httpsURLConnection2.setSSLSocketFactory(class15.field50);
        }
        this.aw((URLConnection)httpsURLConnection, 1608808350);
        return httpsURLConnection;
    }
    
    URLConnection ap(final UrlRequest urlRequest) throws IOException {
        final URLConnection openConnection = urlRequest.field1152.openConnection();
        this.aw(openConnection, 1468655840);
        return openConnection;
    }
    
    @Override
    void vmethod2700(final UrlRequest urlRequest, final byte b) throws IOException {
        try {
            URLConnection urlConnection = null;
            try {
                final String protocol = urlRequest.field1152.getProtocol();
                if (protocol.equals("http")) {
                    if (b != 16) {
                        throw new IllegalStateException();
                    }
                    urlConnection = this.method673(urlRequest, (byte)106);
                }
                else {
                    if (!protocol.equals("https")) {
                        urlRequest.field1149 = -1267363191 * UrlRequest.field1150;
                        if (null != urlConnection) {
                            if (b != 16) {
                                throw new IllegalStateException();
                            }
                            if (urlConnection instanceof HttpURLConnection) {
                                if (b != 16) {
                                    throw new IllegalStateException();
                                }
                                ((HttpURLConnection)urlConnection).disconnect();
                            }
                        }
                        return;
                    }
                    if (b != 16) {
                        throw new IllegalStateException();
                    }
                    urlConnection = this.method674(urlRequest, 241059257);
                }
                this.ac(urlConnection, urlRequest, (byte)1);
                if (null != urlConnection) {
                    if (b != 16) {
                        throw new IllegalStateException();
                    }
                    if (urlConnection instanceof HttpURLConnection) {
                        if (b != 16) {
                            throw new IllegalStateException();
                        }
                        ((HttpURLConnection)urlConnection).disconnect();
                    }
                }
            }
            catch (IOException ex2) {
                urlRequest.field1149 = UrlRequest.field1150 * -1267363191;
                if (null != urlConnection) {
                    if (b != 16) {
                        return;
                    }
                    if (urlConnection instanceof HttpURLConnection) {
                        if (b != 16) {
                            return;
                        }
                        ((HttpURLConnection)urlConnection).disconnect();
                    }
                }
            }
            finally {
                if (null != urlConnection) {
                    if (b != 16) {
                        throw new IllegalStateException();
                    }
                    if (urlConnection instanceof HttpURLConnection) {
                        if (b != 16) {
                            return;
                        }
                        ((HttpURLConnection)urlConnection).disconnect();
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ef.af(" + ')');
        }
    }
    
    public static Object vmethod2700(final byte[] array, final boolean b, final int n) {
        try {
            if (null == array) {
                if (n <= -68216807) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                if (array.length > 136) {
                    final DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
                    directByteArrayCopier.set(array, 1503790515);
                    return directByteArrayCopier;
                }
                if (!b) {
                    return array;
                }
                if (n <= -68216807) {
                    throw new IllegalStateException();
                }
                return class143.aw(array, (byte)12);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ef.af(" + ')');
        }
    }
    
    @Override
    void aq(final UrlRequest urlRequest) throws IOException {
        URLConnection urlConnection = null;
        try {
            final String protocol = urlRequest.field1152.getProtocol();
            if (protocol.equals("http")) {
                urlConnection = this.method673(urlRequest, (byte)(-18));
            }
            else {
                if (!protocol.equals("https")) {
                    urlRequest.field1149 = -1267363191 * UrlRequest.field1150;
                    return;
                }
                urlConnection = this.method674(urlRequest, 2084063928);
            }
            this.ac(urlConnection, urlRequest, (byte)1);
        }
        catch (IOException ex) {
            urlRequest.field1149 = UrlRequest.field1150 * -1267363191;
        }
        finally {
            if (null != urlConnection && urlConnection instanceof HttpURLConnection) {
                ((HttpURLConnection)urlConnection).disconnect();
            }
        }
    }
    
    public static void nq(final Player player) {
        if (player == null) {
            player.bb();
            return;
        }
        player.isInClanChat = TriBool.TriBool_unknown;
    }
    
    URLConnection bk(final UrlRequest urlRequest) throws IOException {
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)urlRequest.field1152.openConnection();
        if (!this.field1147) {
            final HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
            if (class15.field50 == null) {
                class15.field50 = new class15();
            }
            httpsURLConnection2.setSSLSocketFactory(class15.field50);
        }
        this.aw((URLConnection)httpsURLConnection, 2045789056);
        return httpsURLConnection;
    }
}
