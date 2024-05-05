import java.net.HttpURLConnection;
import java.io.DataInputStream;
import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class UrlRequester implements Runnable
{
    static SpritePixels sceneMinimapSprite;
    volatile boolean isClosed;
    Queue requests;
    int field1145;
    final Thread field1146;
    static final int ca = 73;
    
    UrlRequester(final int n) {
        this.requests = new LinkedList();
        (this.field1146 = new Thread(this)).setPriority(1);
        this.field1146.start();
        this.field1145 = -502647555 * n;
    }
    
    @Override
    public void run() {
        try {
            while (!this.isClosed) {
                try {
                    final UrlRequest urlRequest;
                    synchronized (this) {
                        urlRequest = this.requests.poll();
                        if (urlRequest == null) {
                            try {
                                this.wait();
                            }
                            catch (InterruptedException ex2) {}
                            continue;
                        }
                    }
                    this.vmethod2700(urlRequest, (byte)16);
                }
                catch (Exception urlRequest) {
                    class387.RunException_sendStackTrace(null, (Throwable)urlRequest, (byte)8);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "et.run(" + ')');
        }
    }
    
    abstract void at(final UrlRequest p0) throws IOException;
    
    public UrlRequest ak(final URL url) {
        final UrlRequest urlRequest = new UrlRequest(url);
        synchronized (this) {
            this.requests.add(urlRequest);
            this.notify();
        }
        return urlRequest;
    }
    
    public void az() {
        this.isClosed = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1146.join();
        }
        catch (InterruptedException ex) {}
    }
    
    void ax(final URLConnection urlConnection) {
        urlConnection.setConnectTimeout(5000);
        urlConnection.setReadTimeout(5000);
        urlConnection.setUseCaches(false);
        urlConnection.setRequestProperty("Connection", "close");
        urlConnection.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1429112917 * this.field1145);
    }
    
    public static void fn(final UrlRequester urlRequester, final URLConnection urlConnection, final UrlRequest urlRequest) {
        if (urlRequester == null) {
            urlRequester.ar(urlConnection, urlRequest);
            return;
        }
        DataInputStream dataInputStream = null;
        try {
            final int contentLength = urlConnection.getContentLength();
            dataInputStream = new DataInputStream(urlConnection.getInputStream());
            byte[] array;
            if (contentLength >= 0) {
                array = new byte[contentLength];
                dataInputStream.readFully(array);
            }
            else {
                array = new byte[0];
                final byte[] byteArrayPool_getArray = AbstractWorldMapData.ByteArrayPool_getArray(5000, -1224377535);
                final int i = dataInputStream.read(byteArrayPool_getArray, 0, byteArrayPool_getArray.length);
                while (i > -1) {
                    final byte[] array2 = new byte[i + array.length];
                    System.arraycopy(array, 0, array2, 0, array.length);
                    System.arraycopy(byteArrayPool_getArray, 0, array2, array.length, i);
                    array = array2;
                }
                InterfaceParent.ByteArrayPool_release(byteArrayPool_getArray, (byte)89);
            }
            urlRequest.response0 = array;
            urlRequest.field1149 = urlRequester.method665(urlConnection, -1126911937) * -1425331906;
        }
        catch (IOException ex) {
            urlRequest.response0 = null;
            urlRequest.field1149 = urlRequester.method665(urlConnection, -1866310861) * -1964979829;
        }
        finally {
            urlRequest.field1149 = urlRequester.method665(urlConnection, 804375351) * -1964979829;
        }
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            }
            catch (IOException ex2) {}
        }
    }
    
    static boolean method668(final CharSequence charSequence, final int i, final boolean b, final byte b2) {
        try {
            if (i >= 2) {
                if (b2 <= 1) {
                    throw new IllegalStateException();
                }
                if (i <= 36) {
                    boolean b3 = false;
                    boolean b4 = false;
                    int n = 0;
                    for (int length = charSequence.length(), j = 0; j < length; ++j) {
                        if (b2 <= 1) {
                            throw new IllegalStateException();
                        }
                        int char1 = charSequence.charAt(j);
                        if (j == 0) {
                            if (b2 <= 1) {
                                throw new IllegalStateException();
                            }
                            if (45 == char1) {
                                if (b2 <= 1) {
                                    throw new IllegalStateException();
                                }
                                b3 = true;
                                continue;
                            }
                            else if (char1 == 43) {
                                if (b2 <= 1) {
                                    throw new IllegalStateException();
                                }
                                if (b) {
                                    if (b2 <= 1) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                            }
                        }
                        Label_0320: {
                            if (char1 >= 48) {
                                if (b2 <= 1) {
                                    throw new IllegalStateException();
                                }
                                if (char1 <= 57) {
                                    if (b2 <= 1) {
                                        throw new IllegalStateException();
                                    }
                                    char1 -= 48;
                                    break Label_0320;
                                }
                            }
                            if (char1 >= 65) {
                                if (b2 <= 1) {
                                    throw new IllegalStateException();
                                }
                                if (char1 <= 90) {
                                    if (b2 <= 1) {
                                        throw new IllegalStateException();
                                    }
                                    char1 -= 55;
                                    break Label_0320;
                                }
                            }
                            if (char1 >= 97) {
                                if (b2 <= 1) {
                                    throw new IllegalStateException();
                                }
                                if (char1 <= 122) {
                                    if (b2 <= 1) {
                                        throw new IllegalStateException();
                                    }
                                    char1 -= 87;
                                    break Label_0320;
                                }
                            }
                            return false;
                        }
                        if (char1 >= i) {
                            if (b2 <= 1) {
                                throw new IllegalStateException();
                            }
                            return false;
                        }
                        else {
                            if (b3) {
                                if (b2 <= 1) {
                                    throw new IllegalStateException();
                                }
                                char1 = -char1;
                            }
                            final int n2 = i * n + char1;
                            if (n2 / i != n) {
                                if (b2 <= 1) {
                                    throw new IllegalStateException();
                                }
                                return false;
                            }
                            else {
                                n = n2;
                                b4 = true;
                            }
                        }
                    }
                    return b4;
                }
                if (b2 <= 1) {
                    throw new IllegalStateException();
                }
            }
            throw new IllegalArgumentException("" + i);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "et.aw(" + ')');
        }
    }
    
    void method668(final URLConnection urlConnection, final int n) {
        try {
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            urlConnection.setUseCaches(false);
            urlConnection.setRequestProperty("Connection", "close");
            urlConnection.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1429112917 * this.field1145);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "et.aw(" + ')');
        }
    }
    
    public UrlRequest am(final URL url) {
        final UrlRequest urlRequest = new UrlRequest(url);
        synchronized (this) {
            this.requests.add(urlRequest);
            this.notify();
        }
        return urlRequest;
    }
    
    public static void am(final UrlRequester urlRequester, final URLConnection urlConnection) {
        if (urlRequester == null) {
            urlRequester.gy();
        }
        urlConnection.setConnectTimeout(5000);
        urlConnection.setReadTimeout(5000);
        urlConnection.setUseCaches(false);
        urlConnection.setRequestProperty("Connection", "close");
        urlConnection.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1429112917 * urlRequester.field1145);
    }
    
    abstract void al(final UrlRequest p0) throws IOException;
    
    public static UrlRequest km(final UrlRequester urlRequester, final URL url) {
        if (urlRequester == null) {
            urlRequester.aj(url);
        }
        final UrlRequest urlRequest = new UrlRequest(url);
        synchronized (urlRequester) {
            urlRequester.requests.add(urlRequest);
            urlRequester.notify();
        }
        return urlRequest;
    }
    
    int method665(final URLConnection urlConnection, final int n) {
        try {
            int responseCode = UrlRequest.field1150 * -1513206085;
            if (urlConnection != null) {
                if (n == 1278038295) {
                    throw new IllegalStateException();
                }
                try {
                    if (urlConnection instanceof HttpURLConnection) {
                        responseCode = ((HttpURLConnection)urlConnection).getResponseCode();
                    }
                }
                catch (IOException ex2) {}
            }
            return responseCode;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "et.an(" + ')');
        }
    }
    
    void method669(final URLConnection urlConnection, final UrlRequest urlRequest, final byte b) {
        try {
            DataInputStream dataInputStream = null;
            try {
                final int contentLength = urlConnection.getContentLength();
                dataInputStream = new DataInputStream(urlConnection.getInputStream());
                byte[] array;
                if (contentLength >= 0) {
                    if (b != 1) {
                        return;
                    }
                    array = new byte[contentLength];
                    dataInputStream.readFully(array);
                }
                else {
                    array = new byte[0];
                    final byte[] byteArrayPool_getArray = AbstractWorldMapData.ByteArrayPool_getArray(5000, -115934714);
                    final int i = dataInputStream.read(byteArrayPool_getArray, 0, byteArrayPool_getArray.length);
                    while (i > -1) {
                        if (b != 1) {
                            throw new IllegalStateException();
                        }
                        final byte[] array2 = new byte[i + array.length];
                        System.arraycopy(array, 0, array2, 0, array.length);
                        System.arraycopy(byteArrayPool_getArray, 0, array2, array.length, i);
                        array = array2;
                    }
                    InterfaceParent.ByteArrayPool_release(byteArrayPool_getArray, (byte)7);
                }
                urlRequest.response0 = array;
                urlRequest.field1149 = this.method665(urlConnection, -730727375) * -1964979829;
            }
            catch (IOException ex2) {
                urlRequest.response0 = null;
                urlRequest.field1149 = this.method665(urlConnection, -903419789) * -1964979829;
            }
            finally {
                urlRequest.field1149 = this.method665(urlConnection, -996917348) * -1964979829;
            }
            if (dataInputStream != null) {
                if (b != 1) {
                    return;
                }
                try {
                    dataInputStream.close();
                }
                catch (IOException ex3) {}
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "et.ac(" + ')');
        }
    }
    
    public void gd() {
        while (!this.isClosed) {
            try {
                final UrlRequest urlRequest;
                synchronized (this) {
                    urlRequest = this.requests.poll();
                    if (urlRequest == null) {
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                        continue;
                    }
                }
                this.vmethod2700(urlRequest, (byte)16);
            }
            catch (Exception urlRequest) {
                class387.RunException_sendStackTrace(null, (Throwable)urlRequest, (byte)8);
            }
        }
    }
    
    public UrlRequest request(final URL url, final int n) {
        try {
            final UrlRequest urlRequest = new UrlRequest(url);
            synchronized (this) {
                this.requests.add(urlRequest);
                this.notify();
            }
            return urlRequest;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "et.au(" + ')');
        }
    }
    
    static void request(final float[] array, final int n) {
        try {
            if (class121.field1180 + array[0] < 1.3333334f) {
                if (n != -166868527) {
                    throw new IllegalStateException();
                }
                final float n2 = array[0] - 2.0f;
                final float n3 = array[0] - 1.0f;
                final float n4 = (float)Math.sqrt(n2 * n2 - n3 * (n3 * 4.0f));
                final float n5 = 0.5f * (-n2 + n4);
                if (class121.field1180 + array[1] > n5) {
                    if (n != -166868527) {
                        throw new IllegalStateException();
                    }
                    array[1] = n5 - class121.field1180;
                }
                else {
                    final float n6 = 0.5f * (-n2 - n4);
                    if (array[1] < class121.field1180 + n6) {
                        if (n != -166868527) {
                            throw new IllegalStateException();
                        }
                        array[1] = n6 + class121.field1180;
                    }
                }
            }
            else {
                array[0] = 1.3333334f - class121.field1180;
                array[1] = 0.33333334f - class121.field1180;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "et.au(" + ')');
        }
    }
    
    int aa(final URLConnection urlConnection) {
        int responseCode = UrlRequest.field1150 * -1513206085;
        if (urlConnection != null) {
            try {
                if (urlConnection instanceof HttpURLConnection) {
                    responseCode = ((HttpURLConnection)urlConnection).getResponseCode();
                }
            }
            catch (IOException ex) {}
        }
        return responseCode;
    }
    
    void ai(final URLConnection urlConnection) {
        urlConnection.setConnectTimeout(5000);
        urlConnection.setReadTimeout(107966670);
        urlConnection.setUseCaches(false);
        urlConnection.setRequestProperty("Connection", "close");
        urlConnection.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1778804956 * this.field1145);
    }
    
    public static void lm(final UrlRequester urlRequester, final URLConnection urlConnection, final UrlRequest urlRequest) {
        if (urlRequester == null) {
            urlRequester.aa(urlConnection);
        }
        DataInputStream dataInputStream = null;
        try {
            final int contentLength = urlConnection.getContentLength();
            dataInputStream = new DataInputStream(urlConnection.getInputStream());
            byte[] array;
            if (contentLength >= 0) {
                array = new byte[contentLength];
                dataInputStream.readFully(array);
            }
            else {
                array = new byte[0];
                final byte[] byteArrayPool_getArray = AbstractWorldMapData.ByteArrayPool_getArray(5000, -673043390);
                final int i = dataInputStream.read(byteArrayPool_getArray, 0, byteArrayPool_getArray.length);
                while (i > -1) {
                    final byte[] array2 = new byte[i + array.length];
                    System.arraycopy(array, 0, array2, 0, array.length);
                    System.arraycopy(byteArrayPool_getArray, 0, array2, array.length, i);
                    array = array2;
                }
                InterfaceParent.ByteArrayPool_release(byteArrayPool_getArray, (byte)66);
            }
            urlRequest.response0 = array;
            urlRequest.field1149 = urlRequester.method665(urlConnection, 897457677) * -1964979829;
        }
        catch (IOException ex) {
            urlRequest.response0 = null;
            urlRequest.field1149 = urlRequester.method665(urlConnection, 1796275765) * -1964979829;
        }
        finally {
            urlRequest.field1149 = urlRequester.method665(urlConnection, -1827081915) * -1103804946;
        }
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            }
            catch (IOException ex2) {}
        }
    }
    
    void ar(final URLConnection urlConnection, final UrlRequest urlRequest) {
        DataInputStream dataInputStream = null;
        try {
            final int contentLength = urlConnection.getContentLength();
            dataInputStream = new DataInputStream(urlConnection.getInputStream());
            byte[] array;
            if (contentLength >= 0) {
                array = new byte[contentLength];
                dataInputStream.readFully(array);
            }
            else {
                array = new byte[0];
                final byte[] byteArrayPool_getArray = AbstractWorldMapData.ByteArrayPool_getArray(5000, -2033640276);
                final int i = dataInputStream.read(byteArrayPool_getArray, 0, byteArrayPool_getArray.length);
                while (i > -1) {
                    final byte[] array2 = new byte[i + array.length];
                    System.arraycopy(array, 0, array2, 0, array.length);
                    System.arraycopy(byteArrayPool_getArray, 0, array2, array.length, i);
                    array = array2;
                }
                InterfaceParent.ByteArrayPool_release(byteArrayPool_getArray, (byte)69);
            }
            urlRequest.response0 = array;
            urlRequest.field1149 = this.method665(urlConnection, -2016449496) * -1964979829;
        }
        catch (IOException ex) {
            urlRequest.response0 = null;
            urlRequest.field1149 = this.method665(urlConnection, -2135862454) * -1964979829;
        }
        finally {
            urlRequest.field1149 = this.method665(urlConnection, -1600304682) * -1964979829;
        }
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            }
            catch (IOException ex2) {}
        }
    }
    
    public static int ry(final UrlRequester urlRequester, final URLConnection urlConnection) {
        if (urlRequester == null) {
            urlRequester.gd();
        }
        int responseCode = UrlRequest.field1150 * -1513206085;
        if (urlConnection != null) {
            try {
                if (urlConnection instanceof HttpURLConnection) {
                    responseCode = ((HttpURLConnection)urlConnection).getResponseCode();
                }
            }
            catch (IOException ex) {}
        }
        return responseCode;
    }
    
    public void gy() {
        while (!this.isClosed) {
            try {
                final UrlRequest urlRequest;
                synchronized (this) {
                    urlRequest = this.requests.poll();
                    if (urlRequest == null) {
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                        continue;
                    }
                }
                this.vmethod2700(urlRequest, (byte)16);
            }
            catch (Exception urlRequest) {
                class387.RunException_sendStackTrace(null, (Throwable)urlRequest, (byte)8);
            }
        }
    }
    
    abstract void vmethod2700(final UrlRequest p0, final byte p1) throws IOException;
    
    public void close(final int n) {
        try {
            this.isClosed = true;
            try {
                synchronized (this) {
                    this.notify();
                }
                this.field1146.join();
            }
            catch (InterruptedException ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "et.ab(" + ')');
        }
    }
    
    abstract void aq(final UrlRequest p0) throws IOException;
    
    public UrlRequest aj(final URL url) {
        final UrlRequest urlRequest = new UrlRequest(url);
        synchronized (this) {
            this.requests.add(urlRequest);
            this.notify();
        }
        return urlRequest;
    }
    
    public static int tu(final UrlRequester urlRequester, final URLConnection urlConnection) {
        if (urlRequester == null) {
            urlRequester.gd();
        }
        int responseCode = UrlRequest.field1150 * -1513206085;
        if (urlConnection != null) {
            try {
                if (urlConnection instanceof HttpURLConnection) {
                    responseCode = ((HttpURLConnection)urlConnection).getResponseCode();
                }
            }
            catch (IOException ex) {}
        }
        return responseCode;
    }
}
