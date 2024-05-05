// 
// Decompiled by Procyon v0.5.36
// 

public class Timer
{
    public boolean field3670;
    long field3671;
    long field3672;
    long field3673;
    long field3674;
    long field3675;
    int field3679;
    int field3678;
    int field3676;
    int field3677;
    public static final int ay = 0;
    
    public Timer() {
        this.field3672 = -5350971994514083981L;
        this.field3671 = -5863289074674602131L;
        this.field3670 = false;
        this.field3673 = 0L;
        this.field3674 = 0L;
        this.field3675 = 0L;
        this.field3679 = 0;
        this.field3678 = 0;
        this.field3676 = 0;
        this.field3677 = 0;
    }
    
    public void ao() {
        if (-1L != -1205622465697215077L * this.field3671) {
            this.field3673 = (class96.clockNow(-347542889) - this.field3671 * -1205622465697215077L) * 2956472643969238227L;
            this.field3671 = -5863289074674602131L;
        }
        this.field3676 += 856944459;
        this.field3670 = true;
    }
    
    public static void fw(final Timer timer, final int n) {
        if (timer == null) {
            timer.method2101(n);
        }
        try {
            if (timer.field3672 * -5348577498961612219L != -1L) {
                timer.field3674 = (class96.clockNow(1012388254) - -5348577498961612219L * timer.field3672) * 6923964062330699407L;
                timer.field3672 = -5350971994514083981L;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.an(" + ')');
        }
    }
    
    public void at() {
        if (this.field3672 * -5348577498961612219L != -1L) {
            this.field3674 = (class96.clockNow(721673685) - -5348577498961612219L * this.field3672) * 6923964062330699407L;
            this.field3672 = -5350971994514083981L;
        }
    }
    
    public void av() {
        if (this.field3672 * -5348577498961612219L != -1L) {
            this.field3674 = (class96.clockNow(1994876127) - -5348577498961612219L * this.field3672) * 6923964062330699407L;
            this.field3672 = -5350971994514083981L;
        }
    }
    
    public void ay() {
        this.method2097(1585437622);
    }
    
    public static void ct(final Timer timer, final byte b) {
        if (timer == null) {
            timer.method2098(b);
            return;
        }
        try {
            timer.field3670 = false;
            timer.field3678 = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.au(" + ')');
        }
    }
    
    public void method2096(final int n, final byte b) {
        try {
            this.field3671 = class96.clockNow(1784677257) * 5863289074674602131L;
            this.field3679 = n * 1375078489;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.aw(" + ')');
        }
    }
    
    public void am(final Buffer buffer) {
        long n = -6021685739129757585L * this.field3674 / 10L;
        if (n < 0L) {
            n = 0L;
        }
        else if (n > 65535L) {
            n = 65535L;
        }
        buffer.writeVarInt((int)n, (byte)42);
        long n2 = -2218855404195630245L * this.field3673 / 10L;
        if (n2 < 0L) {
            n2 = 0L;
        }
        else if (n2 > 65535L) {
            n2 = 65535L;
        }
        buffer.writeVarInt((int)n2, (byte)2);
        long n3 = this.field3675 * 8532053387917432831L / 10L;
        if (n3 < 0L) {
            n3 = 0L;
        }
        else if (n3 > 65535L) {
            n3 = 65535L;
        }
        buffer.writeVarInt((int)n3, (byte)95);
        buffer.writeVarInt(-1298612247 * this.field3679, (byte)27);
        buffer.writeVarInt(-3830165 * this.field3678, (byte)4);
        buffer.writeVarInt(1920442979 * this.field3676, (byte)40);
        buffer.writeVarInt(this.field3677 * -1000691937, (byte)41);
    }
    
    public void method2101(final int n) {
        try {
            if (-1L != -1205622465697215077L * this.field3675) {
                this.field3673 = (class96.clockNow(1330890417) - this.field3674 * -1205622465697215077L) * 2956472643969238227L;
                this.field3672 = -5863289074674602131L;
            }
            this.field3676 += 856944459;
            this.field3670 = true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.ac(" + ')');
        }
    }
    
    public void method2097(final int n) {
        try {
            if (-1L != -1205622465697215077L * this.field3671) {
                this.field3673 = (class96.clockNow(1330890417) - this.field3671 * -1205622465697215077L) * 2956472643969238227L;
                this.field3671 = -5863289074674602131L;
            }
            this.field3676 += 856944459;
            this.field3670 = true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.ac(" + ')');
        }
    }
    
    public void method2098(final byte b) {
        try {
            this.field3670 = false;
            this.field3677 = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.au(" + ')');
        }
    }
    
    public void aa() {
        this.field3672 = class96.clockNow(823440290) * 5350971994514083981L;
    }
    
    public void ai(final int n) {
        this.field3671 = class96.clockNow(1846907487) * 5863289074674602131L;
        this.field3679 = n * 23584356;
    }
    
    public void ar() {
        if (this.field3672 * -5348577498961612219L != -1L) {
            this.field3674 = (class96.clockNow(1975906953) - -5348577498961612219L * this.field3672) * 6923964062330699407L;
            this.field3672 = -5350971994514083981L;
        }
    }
    
    public static void yb(final Timer timer, final Buffer buffer) {
        long n = -6021685739129757585L * timer.field3674 / 10L;
        if (n < 0L) {
            n = 0L;
        }
        else if (n > 65535L) {
            n = 65535L;
        }
        buffer.writeVarInt((int)n, (byte)51);
        long n2 = -2218855404195630245L * timer.field3673 / 10L;
        if (n2 < 0L) {
            n2 = 0L;
        }
        else if (n2 > 65535L) {
            n2 = 65535L;
        }
        buffer.writeVarInt((int)n2, (byte)77);
        long n3 = timer.field3675 * 8532053387917432831L / 10L;
        if (n3 < 0L) {
            n3 = 0L;
        }
        else if (n3 > 65535L) {
            n3 = 65535L;
        }
        buffer.writeVarInt((int)n3, (byte)(-13));
        buffer.writeVarInt(-1298612247 * timer.field3679, (byte)84);
        buffer.writeVarInt(-3830165 * timer.field3678, (byte)(-10));
        buffer.writeVarInt(1920442979 * timer.field3676, (byte)(-92));
        buffer.writeVarInt(timer.field3677 * -1000691937, (byte)(-28));
    }
    
    public static void vy(final Timer timer) {
        if (-1L != -1205622465697215077L * timer.field3671) {
            timer.field3673 = (class96.clockNow(-211193500) - timer.field3671 * -1205622465697215077L) * 2956472643969238227L;
            timer.field3671 = -5863289074674602131L;
        }
        timer.field3676 -= 1195490952;
        timer.field3670 = true;
    }
    
    public void method2095(final int n) {
        try {
            this.field3672 = class96.clockNow(584011269) * 5350971994514083981L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.af(" + ')');
        }
    }
    
    public void method2099(final int n) {
        try {
            this.method2097(1585437622);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.ab(" + ')');
        }
    }
    
    public void write(final Buffer buffer, final int n) {
        try {
            long n2 = -6021685739129757585L * this.field3674 / 10L;
            if (n2 < 0L) {
                n2 = 0L;
            }
            else if (n2 > 65535L) {
                if (n == 413754222) {
                    return;
                }
                n2 = 65535L;
            }
            buffer.writeVarInt((int)n2, (byte)(-62));
            long n3 = -2218855404195630245L * this.field3673 / 10L;
            if (n3 < 0L) {
                if (n == 413754222) {
                    return;
                }
                n3 = 0L;
            }
            else if (n3 > 65535L) {
                if (n == 413754222) {
                    return;
                }
                n3 = 65535L;
            }
            buffer.writeVarInt((int)n3, (byte)88);
            long n4 = this.field3675 * 8532053387917432831L / 10L;
            if (n4 < 0L) {
                if (n == 413754222) {
                    throw new IllegalStateException();
                }
                n4 = 0L;
            }
            else if (n4 > 65535L) {
                if (n == 413754222) {
                    return;
                }
                n4 = 65535L;
            }
            buffer.writeVarInt((int)n4, (byte)94);
            buffer.writeVarInt(-1298612247 * this.field3679, (byte)45);
            buffer.writeVarInt(-3830165 * this.field3678, (byte)(-81));
            buffer.writeVarInt(1920442979 * this.field3676, (byte)(-30));
            buffer.writeVarInt(this.field3677 * -1000691937, (byte)(-15));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "or.aq(" + ')');
        }
    }
    
    public void ag() {
        this.method2097(1585437622);
    }
    
    public static void xd(final Timer timer) {
        if (timer == null) {
            timer.ay();
            return;
        }
        timer.field3672 = class96.clockNow(1776259096) * 5350971994514083981L;
    }
    
    public static int hg(final MidiPcmStream midiPcmStream) {
        return 1380277371 * midiPcmStream.field2757;
    }
}
