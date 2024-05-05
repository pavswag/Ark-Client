import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.Principal;
import java.io.IOException;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class BufferedSink implements Runnable
{
    OutputStream outputStream;
    IOException exception;
    int limit;
    byte[] buffer;
    static final int ar = 202;
    int position;
    Thread thread;
    boolean closed;
    int capacity;
    
    BufferedSink(final OutputStream outputStream, final int n) {
        this.capacity = 0;
        this.position = 0;
        this.outputStream = outputStream;
        this.limit = -1984591447 * (1 + n);
        this.buffer = new byte[this.limit * 1534274201];
        (this.thread = new Thread(this)).setDaemon(true);
        this.thread.start();
    }
    
    @Override
    public void run() {
        try {
            do {
                int len = 0;
                Label_0136: {
                    synchronized (this) {
                        while (null == this.exception) {
                            if (this.capacity * -836587695 <= this.position * -989370023) {
                                len = -989370023 * this.position - this.capacity * -836587695;
                            }
                            else {
                                len = this.position * -989370023 + (this.limit * 1534274201 - -836587695 * this.capacity);
                            }
                            if (len > 0) {
                                break Label_0136;
                            }
                            try {
                                this.outputStream.flush();
                            }
                            catch (IOException exception) {
                                this.exception = exception;
                                return;
                            }
                            if (xa(this, (byte)95)) {
                                return;
                            }
                            try {
                                this.wait();
                            }
                            catch (InterruptedException ex2) {}
                        }
                        return;
                    }
                    try {
                        if (-836587695 * this.capacity + len <= this.limit * 1534274201) {
                            this.outputStream.write(this.buffer, -836587695 * this.capacity, len);
                        }
                        else {
                            final int len2 = 1534274201 * this.limit - this.capacity * -836587695;
                            this.outputStream.write(this.buffer, this.capacity * -836587695, len2);
                            this.outputStream.write(this.buffer, 0, len - len2);
                        }
                    }
                    catch (IOException exception2) {
                        synchronized (this) {
                            this.exception = exception2;
                            return;
                        }
                    }
                }
                synchronized (this) {
                    this.capacity = (this.capacity * -836587695 + len) % (1534274201 * this.limit) * -1949304399;
                }
            } while (!xa(this, (byte)44));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qe.run(" + ')');
        }
    }
    
    void at(final byte[] array, final int n, final int n2) throws IOException {
        if (n2 < 0 || n < 0 || n2 + n > array.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (null != this.exception) {
                throw new IOException(this.exception.toString());
            }
            int n3;
            if (-836587695 * this.capacity <= -989370023 * this.position) {
                n3 = -836587695 * this.capacity + (1534274201 * this.limit - this.position * -989370023) - 1;
            }
            else {
                n3 = this.capacity * -836587695 - this.position * -989370023 - 1;
            }
            if (n3 < n2) {
                throw new IOException("");
            }
            if (this.position * -989370023 + n2 <= this.limit * 1534274201) {
                System.arraycopy(array, n, this.buffer, this.position * -989370023, n2);
            }
            else {
                final int n4 = 1534274201 * this.limit - this.position * -989370023;
                System.arraycopy(array, n, this.buffer, -989370023 * this.position, n4);
                System.arraycopy(array, n4 + n, this.buffer, 0, n2 - n4);
            }
            this.position = -832024855 * ((-989370023 * this.position + n2) % (this.limit * 1534274201));
            this.notifyAll();
        }
    }
    
    public static Principal ee(final class17 class17) throws SSLPeerUnverifiedException {
        if (class17 == null) {
            class17.an();
        }
        return null;
    }
    
    public static boolean xa(final BufferedSink bufferedSink, final byte b) {
        if (bufferedSink == null) {
            return bufferedSink.isClosed(b);
        }
        try {
            if (!bufferedSink.closed) {
                return false;
            }
            if (b <= 2) {
                throw new IllegalStateException();
            }
            try {
                bufferedSink.outputStream.close();
                if (bufferedSink.exception == null) {
                    if (b <= 2) {
                        throw new IllegalStateException();
                    }
                    bufferedSink.exception = new IOException("");
                }
            }
            catch (IOException cause) {
                if (bufferedSink.exception == null) {
                    if (b <= 2) {
                        throw new IllegalStateException();
                    }
                    bufferedSink.exception = new IOException(cause);
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qe.af(" + ')');
        }
    }
    
    void close(final int n) {
        try {
            synchronized (this) {
                this.closed = true;
                this.notifyAll();
            }
            try {
                this.thread.join();
            }
            catch (InterruptedException ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qe.aw(" + ')');
        }
    }
    
    void al(final byte[] array, final int n, final int n2) throws IOException {
        if (n2 < 0 || n < 0 || n2 + n > array.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (null != this.exception) {
                throw new IOException(this.exception.toString());
            }
            int n3;
            if (-836587695 * this.capacity <= -989370023 * this.position) {
                n3 = -836587695 * this.capacity + (1534274201 * this.limit - this.position * -989370023) - 1;
            }
            else {
                n3 = this.capacity * -836587695 - this.position * -989370023 - 1;
            }
            if (n3 < n2) {
                throw new IOException("");
            }
            if (this.position * -989370023 + n2 <= this.limit * 1534274201) {
                System.arraycopy(array, n, this.buffer, this.position * -989370023, n2);
            }
            else {
                final int n4 = 1534274201 * this.limit - this.position * -989370023;
                System.arraycopy(array, n, this.buffer, -989370023 * this.position, n4);
                System.arraycopy(array, n4 + n, this.buffer, 0, n2 - n4);
            }
            this.position = -832024855 * ((-989370023 * this.position + n2) % (this.limit * 1534274201));
            this.notifyAll();
        }
    }
    
    void write(final byte[] array, final int n, final int n2, final byte b) throws IOException {
        try {
            if (n2 >= 0) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                if (n >= 0) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    if (n2 + n <= array.length) {
                        synchronized (this) {
                            if (null != this.exception) {
                                if (b >= 0) {
                                    return;
                                }
                                throw new IOException(this.exception.toString());
                            }
                            else {
                                int n3;
                                if (-836587695 * this.capacity <= -989370023 * this.position) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    n3 = -836587695 * this.capacity + (1534274201 * this.limit - this.position * -989370023) - 1;
                                }
                                else {
                                    n3 = this.capacity * -836587695 - this.position * -989370023 - 1;
                                }
                                if (n3 < n2) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    throw new IOException("");
                                }
                                else {
                                    if (this.position * -989370023 + n2 <= this.limit * 1534274201) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        System.arraycopy(array, n, this.buffer, this.position * -989370023, n2);
                                    }
                                    else {
                                        final int n4 = 1534274201 * this.limit - this.position * -989370023;
                                        System.arraycopy(array, n, this.buffer, -989370023 * this.position, n4);
                                        System.arraycopy(array, n4 + n, this.buffer, 0, n2 - n4);
                                    }
                                    this.position = -832024855 * ((-989370023 * this.position + n2) % (this.limit * 1534274201));
                                    this.notifyAll();
                                }
                            }
                        }
                        return;
                    }
                    if (b >= 0) {
                        return;
                    }
                }
            }
            throw new IOException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qe.an(" + ')');
        }
    }
    
    public static int write(final int n, final byte b) {
        try {
            return n >>> 4 & -858518957 * class484.field4045;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qe.an(" + ')');
        }
    }
    
    public static void cx(final ScriptEvent scriptEvent, final int n) {
        if (scriptEvent == null) {
            scriptEvent.ab(n);
            return;
        }
        scriptEvent.type = 941178879 * n;
    }
    
    public void gd() {
        do {
            int len = 0;
            Label_0136: {
                synchronized (this) {
                    while (null == this.exception) {
                        if (this.capacity * -836587695 <= this.position * -989370023) {
                            len = -989370023 * this.position - this.capacity * -836587695;
                        }
                        else {
                            len = this.position * -989370023 + (this.limit * 1534274201 - -836587695 * this.capacity);
                        }
                        if (len > 0) {
                            break Label_0136;
                        }
                        try {
                            this.outputStream.flush();
                        }
                        catch (IOException exception) {
                            this.exception = exception;
                            return;
                        }
                        if (xa(this, (byte)73)) {
                            return;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                    }
                    return;
                }
                try {
                    if (-836587695 * this.capacity + len <= this.limit * 1534274201) {
                        this.outputStream.write(this.buffer, -836587695 * this.capacity, len);
                    }
                    else {
                        final int len2 = 1534274201 * this.limit - this.capacity * -836587695;
                        this.outputStream.write(this.buffer, this.capacity * -836587695, len2);
                        this.outputStream.write(this.buffer, 0, len - len2);
                    }
                }
                catch (IOException exception2) {
                    synchronized (this) {
                        this.exception = exception2;
                        return;
                    }
                }
            }
            synchronized (this) {
                this.capacity = (this.capacity * -836587695 + len) % (1534274201 * this.limit) * -1949304399;
            }
        } while (!xa(this, (byte)45));
    }
    
    boolean au() {
        if (this.closed) {
            try {
                this.outputStream.close();
                if (this.exception == null) {
                    this.exception = new IOException("");
                }
            }
            catch (IOException cause) {
                if (this.exception == null) {
                    this.exception = new IOException(cause);
                }
            }
            return true;
        }
        return false;
    }
    
    void aa() {
        synchronized (this) {
            this.closed = true;
            this.notifyAll();
        }
        try {
            this.thread.join();
        }
        catch (InterruptedException ex) {}
    }
    
    public void gy() {
        do {
            int len = 0;
            Label_0136: {
                synchronized (this) {
                    while (null == this.exception) {
                        if (this.capacity * -836587695 <= this.position * -989370023) {
                            len = -989370023 * this.position - this.capacity * -836587695;
                        }
                        else {
                            len = this.position * -989370023 + (this.limit * 1534274201 - -836587695 * this.capacity);
                        }
                        if (len > 0) {
                            break Label_0136;
                        }
                        try {
                            this.outputStream.flush();
                        }
                        catch (IOException exception) {
                            this.exception = exception;
                            return;
                        }
                        if (xa(this, (byte)75)) {
                            return;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                    }
                    return;
                }
                try {
                    if (-836587695 * this.capacity + len <= this.limit * 1534274201) {
                        this.outputStream.write(this.buffer, -836587695 * this.capacity, len);
                    }
                    else {
                        final int len2 = 1534274201 * this.limit - this.capacity * -836587695;
                        this.outputStream.write(this.buffer, this.capacity * -836587695, len2);
                        this.outputStream.write(this.buffer, 0, len - len2);
                    }
                }
                catch (IOException exception2) {
                    synchronized (this) {
                        this.exception = exception2;
                        return;
                    }
                }
            }
            synchronized (this) {
                this.capacity = (this.capacity * -836587695 + len) % (1534274201 * this.limit) * -1949304399;
            }
        } while (!xa(this, (byte)95));
    }
    
    boolean isClosed(final byte b) {
        try {
            if (!this.closed) {
                return false;
            }
            if (b <= 2) {
                throw new IllegalStateException();
            }
            try {
                this.outputStream.close();
                if (this.exception == null) {
                    if (b <= 2) {
                        throw new IllegalStateException();
                    }
                    this.exception = new IOException("");
                }
            }
            catch (IOException cause) {
                if (this.exception == null) {
                    if (b <= 2) {
                        throw new IllegalStateException();
                    }
                    this.exception = new IOException(cause);
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qe.af(" + ')');
        }
    }
    
    boolean ab() {
        if (this.closed) {
            try {
                this.outputStream.close();
                if (this.exception == null) {
                    this.exception = new IOException("");
                }
            }
            catch (IOException cause) {
                if (this.exception == null) {
                    this.exception = new IOException(cause);
                }
            }
            return true;
        }
        return false;
    }
    
    void aq(final byte[] array, final int n, final int n2) throws IOException {
        if (n2 < 0 || n < 0 || n2 + n > array.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (null != this.exception) {
                throw new IOException(this.exception.toString());
            }
            int n3;
            if (-836587695 * this.capacity <= -989370023 * this.position) {
                n3 = -836587695 * this.capacity + (1534274201 * this.limit - this.position * -989370023) - 1;
            }
            else {
                n3 = this.capacity * -836587695 - this.position * -989370023 - 1;
            }
            if (n3 < n2) {
                throw new IOException("");
            }
            if (this.position * -989370023 + n2 <= this.limit * 1534274201) {
                System.arraycopy(array, n, this.buffer, this.position * -989370023, n2);
            }
            else {
                final int n4 = 1534274201 * this.limit - this.position * -989370023;
                System.arraycopy(array, n, this.buffer, -989370023 * this.position, n4);
                System.arraycopy(array, n4 + n, this.buffer, 0, n2 - n4);
            }
            this.position = -832024855 * ((-989370023 * this.position + n2) % (this.limit * 1534274201));
            this.notifyAll();
        }
    }
    
    public static boolean yx(final BufferedSink bufferedSink) {
        if (bufferedSink.closed) {
            try {
                bufferedSink.outputStream.close();
                if (bufferedSink.exception == null) {
                    bufferedSink.exception = new IOException("");
                }
            }
            catch (IOException cause) {
                if (bufferedSink.exception == null) {
                    bufferedSink.exception = new IOException(cause);
                }
            }
            return true;
        }
        return false;
    }
    
    public static int zn(final class380 class380) {
        return 410499641 * class380.field3622;
    }
}
