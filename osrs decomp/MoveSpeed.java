import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;

// 
// Decompiled by Procyon v0.5.36
// 

public class MoveSpeed implements class356
{
    public static final MoveSpeed RUN;
    public static final MoveSpeed CRAWL;
    public static final MoveSpeed WALK;
    public static final MoveSpeed STATIONARY;
    public byte speed;
    public static final int ch = 96;
    
    MoveSpeed(final byte speed) {
        this.speed = speed;
    }
    
    static {
        STATIONARY = new MoveSpeed((byte)(-1));
        CRAWL = new MoveSpeed((byte)0);
        WALK = new MoveSpeed((byte)1);
        RUN = new MoveSpeed((byte)2);
    }
    
    public int method1179() {
        return this.speed;
    }
    
    static String method1179(Throwable field4177, final int n) throws IOException {
        try {
            String str;
            if (field4177 instanceof RunException) {
                if (n != -1633313603) {
                    throw new IllegalStateException();
                }
                final RunException ex = (RunException)field4177;
                str = ex.field4179 + " | ";
                field4177 = ex.field4177;
            }
            else {
                str = "";
            }
            final StringWriter out = new StringWriter();
            final PrintWriter s = new PrintWriter(out);
            field4177.printStackTrace(s);
            s.close();
            final BufferedReader bufferedReader = new BufferedReader(new StringReader(out.toString()));
            final String line = bufferedReader.readLine();
        Label_0453:
            while (true) {
                break Label_0453;
                String s2 = null;
                do {
                    final int index = s2.indexOf(40);
                    final int index2 = s2.indexOf(41, index + 1);
                    Label_0377: {
                        if (index < 0) {
                            break Label_0377;
                        }
                        if (n != -1633313603) {
                            throw new IllegalStateException();
                        }
                        if (index2 < 0) {
                            break Label_0377;
                        }
                        if (n != -1633313603) {
                            throw new IllegalStateException();
                        }
                        final String substring = s2.substring(1 + index, index2);
                        final int index3 = substring.indexOf(".java:");
                        if (index3 < 0) {
                            s2 = s2.substring(0, index);
                            break Label_0377;
                        }
                        if (n != -1633313603) {
                            throw new IllegalStateException();
                        }
                        str = str + (substring.substring(0, index3) + substring.substring(index3 + 5)) + ' ';
                        s2 = bufferedReader.readLine();
                        continue;
                    }
                    final String trim = s2.trim();
                    final String substring2 = trim.substring(trim.lastIndexOf(32) + 1);
                    str = str + substring2.substring(substring2.lastIndexOf(9) + 1) + ' ';
                    continue Label_0453;
                } while (null != s2);
                break;
            }
            if (n != -1633313603) {
                throw new IllegalStateException();
            }
            return str + "| " + line;
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "iu.aw(" + ')');
        }
    }
    
    @Override
    public int an() {
        return this.speed;
    }
    
    @Override
    public int ac() {
        return this.speed;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.speed;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "iu.af(" + ')');
        }
    }
}
