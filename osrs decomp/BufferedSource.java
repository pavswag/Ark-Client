import java.io.EOFException;
import java.io.InputStream;
import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class BufferedSource implements Runnable
{
    IOException exception;
    Thread thread;
    InputStream inputStream;
    byte[] buffer;
    int position;
    int capacity;
    int limit;
    static final int aa = 30;
    
    BufferedSource(final InputStream inputStream, final int n) {
        this.position = 0;
        this.limit = 0;
        this.inputStream = inputStream;
        this.capacity = -1354885101 * (1 + n);
        this.buffer = new byte[-1464241637 * this.capacity];
        (this.thread = new Thread(this)).setDaemon(true);
        this.thread.start();
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                int read = 0;
                Label_0130: {
                    int len;
                    synchronized (this) {
                        while (null == this.exception) {
                            if (this.position * 160772207 == 0) {
                                len = -1464241637 * this.capacity - this.limit * 1652063427 - 1;
                            }
                            else if (this.position * 160772207 <= this.limit * 1652063427) {
                                len = this.capacity * -1464241637 - 1652063427 * this.limit;
                            }
                            else {
                                len = this.position * 160772207 - 1652063427 * this.limit - 1;
                            }
                            if (len > 0) {
                                break Label_0130;
                            }
                            try {
                                this.wait();
                            }
                            catch (InterruptedException ex2) {}
                        }
                        return;
                    }
                    try {
                        read = this.inputStream.read(this.buffer, 1652063427 * this.limit, len);
                        if (-1 == read) {
                            throw new EOFException();
                        }
                    }
                    catch (IOException exception) {
                        synchronized (this) {
                            this.exception = exception;
                            return;
                        }
                    }
                }
                synchronized (this) {
                    this.limit = (this.limit * 1652063427 + read) % (this.capacity * -1464241637) * -954133525;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.run(" + ')');
        }
    }
    
    int ao() throws IOException {
        synchronized (this) {
            int n;
            if (this.position * 160772207 <= 1652063427 * this.limit) {
                n = this.limit * 1652063427 - this.position * 160772207;
            }
            else {
                n = this.capacity * -1464241637 - 160772207 * this.position + 1652063427 * this.limit;
            }
            if (n <= 0 && null != this.exception) {
                throw new IOException(this.exception.toString());
            }
            this.notifyAll();
            return n;
        }
    }
    
    boolean at(final int n) throws IOException {
        if (0 == n) {
            return true;
        }
        if (n <= 0 || n >= 1292638279 * this.capacity) {
            throw new IOException();
        }
        synchronized (this) {
            int n2;
            if (this.position * 1366502714 <= this.limit * -1221835415) {
                n2 = 1652063427 * this.limit - this.position * 160772207;
            }
            else {
                n2 = this.capacity * -1464241637 - -1123052787 * this.position + this.limit * 1652063427;
            }
            if (n2 >= n) {
                return true;
            }
            if (this.exception != null) {
                throw new IOException(this.exception.toString());
            }
            this.notifyAll();
            return false;
        }
    }
    
    void as() {
        synchronized (this) {
            if (this.exception == null) {
                this.exception = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.thread.join();
        }
        catch (InterruptedException ex) {}
    }
    
    public static void es(final BufferedSource bufferedSource, final int n) {
        if (bufferedSource == null) {
            bufferedSource.close(n);
            return;
        }
        try {
            synchronized (bufferedSource) {
                if (bufferedSource.exception == null) {
                    if (n != -1118938495) {
                        throw new IllegalStateException();
                    }
                    bufferedSource.exception = new IOException("");
                }
                bufferedSource.notifyAll();
            }
            try {
                bufferedSource.thread.join();
            }
            catch (InterruptedException ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.au(" + ')');
        }
    }
    
    int ax() throws IOException {
        synchronized (this) {
            if (this.limit * -749209829 != 160772207 * this.position) {
                final int n = this.buffer[this.position * 160772207] & 0xFF;
                this.position = (this.position * 160772207 + 1) % (-1464241637 * this.capacity) * 1198141071;
                this.notifyAll();
                return n;
            }
            if (null != this.exception) {
                throw new IOException(this.exception.toString());
            }
            return -1;
        }
    }
    
    int readUnsignedByte(final short n) throws IOException {
        try {
            synchronized (this) {
                if (this.limit * 1652063427 != 160772207 * this.position) {
                    final int n2 = this.buffer[this.position * 160772207] & 0xFF;
                    this.position = (this.position * 160772207 + 1) % (-1464241637 * this.capacity) * 1198141071;
                    this.notifyAll();
                    return n2;
                }
                if (n <= 1100) {
                    throw new IllegalStateException();
                }
                if (null == this.exception) {
                    return -1;
                }
                if (n <= 1100) {
                    throw new IllegalStateException();
                }
                throw new IOException(this.exception.toString());
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.aw(" + ')');
        }
    }
    
    void am() {
        synchronized (this) {
            if (this.exception == null) {
                this.exception = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.thread.join();
        }
        catch (InterruptedException ex) {}
    }
    
    boolean al(final int n) throws IOException {
        if (0 == n) {
            return true;
        }
        if (n <= 0 || n >= -1464241637 * this.capacity) {
            throw new IOException();
        }
        synchronized (this) {
            int n2;
            if (this.position * -326964618 <= this.limit * -394145861) {
                n2 = 746510081 * this.limit - this.position * 224982616;
            }
            else {
                n2 = this.capacity * 809123410 - 1672311014 * this.position + this.limit * 1652063427;
            }
            if (n2 >= n) {
                return true;
            }
            if (this.exception != null) {
                throw new IOException(this.exception.toString());
            }
            this.notifyAll();
            return false;
        }
    }
    
    int available(final byte b) throws IOException {
        try {
            synchronized (this) {
                int n;
                if (this.position * 160772207 <= 1652063427 * this.limit) {
                    n = this.limit * 1652063427 - this.position * 160772207;
                }
                else {
                    n = this.capacity * -1464241637 - 160772207 * this.position + 1652063427 * this.limit;
                }
                if (n <= 0) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    if (null != this.exception) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        throw new IOException(this.exception.toString());
                    }
                }
                this.notifyAll();
                return n;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.an(" + ')');
        }
    }
    
    int read(final byte[] array, final int n, int n2, final int n3) throws IOException {
        try {
            if (n2 >= 0) {
                if (n3 >= 481714111) {
                    throw new IllegalStateException();
                }
                if (n >= 0) {
                    if (n3 >= 481714111) {
                        throw new IllegalStateException();
                    }
                    if (n2 + n > array.length) {
                        if (n3 >= 481714111) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        synchronized (this) {
                            int n4;
                            if (160772207 * this.position <= this.limit * 1652063427) {
                                if (n3 >= 481714111) {
                                    throw new IllegalStateException();
                                }
                                n4 = 1652063427 * this.limit - 160772207 * this.position;
                            }
                            else {
                                n4 = this.limit * 1652063427 + (-1464241637 * this.capacity - this.position * 160772207);
                            }
                            if (n2 > n4) {
                                if (n3 >= 481714111) {
                                    throw new IllegalStateException();
                                }
                                n2 = n4;
                            }
                            if (n2 == 0) {
                                if (n3 >= 481714111) {
                                    throw new IllegalStateException();
                                }
                                if (this.exception != null) {
                                    if (n3 >= 481714111) {
                                        throw new IllegalStateException();
                                    }
                                    throw new IOException(this.exception.toString());
                                }
                            }
                            if (this.position * 160772207 + n2 <= this.capacity * -1464241637) {
                                if (n3 >= 481714111) {
                                    throw new IllegalStateException();
                                }
                                System.arraycopy(this.buffer, this.position * 160772207, array, n, n2);
                            }
                            else {
                                final int n5 = -1464241637 * this.capacity - this.position * 160772207;
                                System.arraycopy(this.buffer, 160772207 * this.position, array, n, n5);
                                System.arraycopy(this.buffer, 0, array, n5 + n, n2 - n5);
                            }
                            this.position = 1198141071 * ((this.position * 160772207 + n2) % (-1464241637 * this.capacity));
                            this.notifyAll();
                            return n2;
                        }
                    }
                }
            }
            throw new IOException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.ac(" + ')');
        }
    }
    
    public static void lb(final BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            bufferedSource.as();
        }
        synchronized (bufferedSource) {
            if (bufferedSource.exception == null) {
                bufferedSource.exception = new IOException("");
            }
            bufferedSource.notifyAll();
        }
        try {
            bufferedSource.thread.join();
        }
        catch (InterruptedException ex) {}
    }
    
    public void gd() {
        while (true) {
            int read = 0;
            Label_0130: {
                int len;
                synchronized (this) {
                    while (null == this.exception) {
                        if (this.position * 852690231 == 0) {
                            len = -1464241637 * this.capacity - this.limit * 1652063427 - 1;
                        }
                        else if (this.position * -320422959 <= this.limit * 1652063427) {
                            len = this.capacity * -1464241637 - -395288529 * this.limit;
                        }
                        else {
                            len = this.position * 160772207 - 1652063427 * this.limit - 1;
                        }
                        if (len > 0) {
                            break Label_0130;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                    }
                    return;
                }
                try {
                    read = this.inputStream.read(this.buffer, 1652063427 * this.limit, len);
                    if (-1 == read) {
                        throw new EOFException();
                    }
                }
                catch (IOException exception) {
                    synchronized (this) {
                        this.exception = exception;
                        return;
                    }
                }
            }
            synchronized (this) {
                this.limit = (this.limit * 1652063427 + read) % (this.capacity * -1464241637) * -1546384791;
            }
        }
    }
    
    public static int ji(final BufferedSource bufferedSource) throws IOException {
        if (bufferedSource == null) {
            bufferedSource.aj();
        }
        synchronized (bufferedSource) {
            if (bufferedSource.limit * 1652063427 != 160772207 * bufferedSource.position) {
                final int n = bufferedSource.buffer[bufferedSource.position * 160772207] & 0xFF;
                bufferedSource.position = (bufferedSource.position * 160772207 + 1) % (-1464241637 * bufferedSource.capacity) * 1198141071;
                bufferedSource.notifyAll();
                return n;
            }
            if (null != bufferedSource.exception) {
                throw new IOException(bufferedSource.exception.toString());
            }
            return -1;
        }
    }
    
    public static int fo(final BufferedSource bufferedSource, final byte[] array, final int n, int n2) throws IOException {
        if (bufferedSource == null) {
            bufferedSource.run();
        }
        if (n2 < 0 || n < 0 || n2 + n > array.length) {
            throw new IOException();
        }
        synchronized (bufferedSource) {
            int n3;
            if (160772207 * bufferedSource.position <= bufferedSource.limit * 1652063427) {
                n3 = 1652063427 * bufferedSource.limit - 160772207 * bufferedSource.position;
            }
            else {
                n3 = bufferedSource.limit * 1652063427 + (-1464241637 * bufferedSource.capacity - bufferedSource.position * 160772207);
            }
            if (n2 > n3) {
                n2 = n3;
            }
            if (n2 == 0 && bufferedSource.exception != null) {
                throw new IOException(bufferedSource.exception.toString());
            }
            if (bufferedSource.position * 160772207 + n2 <= bufferedSource.capacity * -1464241637) {
                System.arraycopy(bufferedSource.buffer, bufferedSource.position * 160772207, array, n, n2);
            }
            else {
                final int n4 = -1464241637 * bufferedSource.capacity - bufferedSource.position * 160772207;
                System.arraycopy(bufferedSource.buffer, 160772207 * bufferedSource.position, array, n, n4);
                System.arraycopy(bufferedSource.buffer, 0, array, n4 + n, n2 - n4);
            }
            bufferedSource.position = 1198141071 * ((bufferedSource.position * 160772207 + n2) % (-1464241637 * bufferedSource.capacity));
            bufferedSource.notifyAll();
            return n2;
        }
    }
    
    public static int ed(final BufferedSource bufferedSource) throws IOException {
        if (bufferedSource == null) {
            bufferedSource.ao();
        }
        synchronized (bufferedSource) {
            if (bufferedSource.limit * 1652063427 != -1782687682 * bufferedSource.position) {
                final int n = bufferedSource.buffer[bufferedSource.position * 160772207] & 0xFF;
                bufferedSource.position = (bufferedSource.position * 160772207 + 1) % (-895113866 * bufferedSource.capacity) * 1198141071;
                bufferedSource.notifyAll();
                return n;
            }
            if (null != bufferedSource.exception) {
                throw new IOException(bufferedSource.exception.toString());
            }
            return -1;
        }
    }
    
    void close(final int n) {
        try {
            synchronized (this) {
                if (this.exception == null) {
                    if (n != -1118938495) {
                        throw new IllegalStateException();
                    }
                    this.exception = new IOException("");
                }
                this.notifyAll();
            }
            try {
                this.thread.join();
            }
            catch (InterruptedException ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.au(" + ')');
        }
    }
    
    int aa() throws IOException {
        synchronized (this) {
            int n;
            if (this.position * 160772207 <= -1411641710 * this.limit) {
                n = this.limit * 1652063427 - this.position * 160772207;
            }
            else {
                n = this.capacity * -1464241637 - 160772207 * this.position + 1652063427 * this.limit;
            }
            if (n <= 0 && null != this.exception) {
                throw new IOException(this.exception.toString());
            }
            this.notifyAll();
            return n;
        }
    }
    
    public static boolean qr(final BufferedSource bufferedSource, final int n) throws IOException {
        if (bufferedSource == null) {
            bufferedSource.ax();
        }
        if (0 == n) {
            return true;
        }
        if (n <= 0 || n >= -1467351357 * bufferedSource.capacity) {
            throw new IOException();
        }
        synchronized (bufferedSource) {
            int n2;
            if (bufferedSource.position * 1474079879 <= bufferedSource.limit * 1652063427) {
                n2 = 1652063427 * bufferedSource.limit - bufferedSource.position * 390986745;
            }
            else {
                n2 = bufferedSource.capacity * -935759386 - 506280892 * bufferedSource.position + bufferedSource.limit * 1201965538;
            }
            if (n2 >= n) {
                return true;
            }
            if (bufferedSource.exception != null) {
                throw new IOException(bufferedSource.exception.toString());
            }
            bufferedSource.notifyAll();
            return false;
        }
    }
    
    public static int im(final GrandExchangeOfferOwnWorldComparator grandExchangeOfferOwnWorldComparator, final Object o, final Object o2) {
        if (grandExchangeOfferOwnWorldComparator == null) {
            grandExchangeOfferOwnWorldComparator.equals(o);
        }
        return grandExchangeOfferOwnWorldComparator.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)110);
    }
    
    public void gy() {
        while (true) {
            int read = 0;
            Label_0130: {
                int len;
                synchronized (this) {
                    while (null == this.exception) {
                        if (this.position * 160772207 == 0) {
                            len = -1464241637 * this.capacity - this.limit * 1652063427 - 1;
                        }
                        else if (this.position * 160772207 <= this.limit * 1652063427) {
                            len = this.capacity * -1464241637 - 1652063427 * this.limit;
                        }
                        else {
                            len = this.position * 160772207 - 1652063427 * this.limit - 1;
                        }
                        if (len > 0) {
                            break Label_0130;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                    }
                    return;
                }
                try {
                    read = this.inputStream.read(this.buffer, 1652063427 * this.limit, len);
                    if (-1 == read) {
                        throw new EOFException();
                    }
                }
                catch (IOException exception) {
                    synchronized (this) {
                        this.exception = exception;
                        return;
                    }
                }
            }
            synchronized (this) {
                this.limit = (this.limit * 1652063427 + read) % (this.capacity * -1464241637) * -954133525;
            }
        }
    }
    
    boolean isAvailable(final int n, final int n2) {
        try {
            if (0 != n) {
                if (n > 0) {
                    if (n2 >= -1026636126) {
                        throw new IllegalStateException();
                    }
                    if (n >= -1464241637 * this.capacity) {
                        if (n2 >= -1026636126) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        synchronized (this) {
                            int n3;
                            if (this.capacity * 160772207 <= this.position * 1652063427) {
                                n3 = 1652063427 * this.limit - this.capacity * 160772207;
                            }
                            else {
                                n3 = this.capacity * -1464241637 - 160772207 * this.capacity + this.limit * 1652063427;
                            }
                            if (n3 >= n) {
                                return true;
                            }
                            if (n2 >= -1026636126) {
                                throw new IllegalStateException();
                            }
                            if (this.exception == null) {
                                this.notifyAll();
                                return false;
                            }
                            if (n2 >= -1026636126) {
                                throw new IllegalStateException();
                            }
                            throw new IOException(this.exception.toString());
                        }
                    }
                }
                throw new IOException();
            }
            if (n2 >= -1026636126) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.af(" + ')');
        }
    }
    
    boolean ab(final int n) throws IOException {
        if (0 == n) {
            return true;
        }
        if (n <= 0 || n >= -1464241637 * this.capacity) {
            throw new IOException();
        }
        synchronized (this) {
            int n2;
            if (this.position * 160772207 <= this.limit * 1652063427) {
                n2 = 1652063427 * this.limit - this.position * 160772207;
            }
            else {
                n2 = this.capacity * -1464241637 - 160772207 * this.position + this.limit * 1652063427;
            }
            if (n2 >= n) {
                return true;
            }
            if (this.exception != null) {
                throw new IOException(this.exception.toString());
            }
            this.notifyAll();
            return false;
        }
    }
    
    void aj() {
        synchronized (this) {
            if (this.exception == null) {
                this.exception = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.thread.join();
        }
        catch (InterruptedException ex) {}
    }
    
    public static boolean oq(final BufferedSource bufferedSource, final int n, final int n2) throws IOException {
        if (bufferedSource == null) {
            return bufferedSource.isAvailable(n, n);
        }
        try {
            if (0 != n) {
                if (n > 0) {
                    if (n2 >= -1026636126) {
                        throw new IllegalStateException();
                    }
                    if (n >= -1464241637 * bufferedSource.capacity) {
                        if (n2 >= -1026636126) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        synchronized (bufferedSource) {
                            int n3;
                            if (bufferedSource.position * 160772207 <= bufferedSource.limit * 1652063427) {
                                n3 = 1652063427 * bufferedSource.limit - bufferedSource.position * 160772207;
                            }
                            else {
                                n3 = bufferedSource.capacity * -1464241637 - 160772207 * bufferedSource.position + bufferedSource.limit * 1652063427;
                            }
                            if (n3 >= n) {
                                return true;
                            }
                            if (n2 >= -1026636126) {
                                throw new IllegalStateException();
                            }
                            if (bufferedSource.exception == null) {
                                bufferedSource.notifyAll();
                                return false;
                            }
                            if (n2 >= -1026636126) {
                                throw new IllegalStateException();
                            }
                            throw new IOException(bufferedSource.exception.toString());
                        }
                    }
                }
                throw new IOException();
            }
            if (n2 >= -1026636126) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.af(" + ')');
        }
    }
    
    public static int rz(final BufferedSource bufferedSource) throws IOException {
        if (bufferedSource == null) {
            bufferedSource.am();
        }
        synchronized (bufferedSource) {
            int n;
            if (bufferedSource.position * 160772207 <= 162252123 * bufferedSource.limit) {
                n = bufferedSource.limit * 1652063427 - bufferedSource.position * 615012750;
            }
            else {
                n = bufferedSource.capacity * 531107769 - -2068781762 * bufferedSource.position + 1652063427 * bufferedSource.limit;
            }
            if (n <= 0 && null != bufferedSource.exception) {
                throw new IOException(bufferedSource.exception.toString());
            }
            bufferedSource.notifyAll();
            return n;
        }
    }
    
    int method2214() throws IOException {
        synchronized (this) {
            if (this.limit * 1652063427 != 160772207 * this.position) {
                final int n = this.buffer[this.position * 160772207] & 0xFF;
                this.position = (this.position * 160772207 + 1) % (-1464241637 * this.capacity) * 1198141071;
                this.notifyAll();
                return n;
            }
            if (null != this.exception) {
                throw new IOException(this.exception.toString());
            }
            return -1;
        }
    }
    
    static int method2214(final Widget widget, final int n) {
        try {
            if (883712245 * widget.type != 11) {
                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                return 1;
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.method1804(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 434397306);
            return 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pn.ah(" + ')');
        }
    }
}
