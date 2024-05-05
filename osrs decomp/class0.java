// 
// Decompiled by Procyon v0.5.36
// 

public class class0 implements class3
{
    class0() {
    }
    
    @Override
    public Buffer aw(final Buffer buffer) {
        final Buffer buffer2 = new Buffer(100);
        this.ab(buffer, buffer2);
        return buffer2;
    }
    
    void method1(final Buffer buffer, final Buffer buffer2) {
        class8 class8;
        class5 class9;
        long n;
        for (class8 = new class8(buffer), class9 = new class5(class8), n = 0L; !class9.method16(class8.method28(), class8.method29(), n); ++n) {}
        buffer2.writeLong(n);
    }
    
    @Override
    public Buffer ac(final Buffer buffer) {
        final Buffer buffer2 = new Buffer(100);
        this.ab(buffer, buffer2);
        return buffer2;
    }
    
    @Override
    public Buffer au(final Buffer buffer) {
        final Buffer buffer2 = new Buffer(100);
        this.ab(buffer, buffer2);
        return buffer2;
    }
    
    @Override
    public Buffer vmethod12(final Buffer buffer) {
        final Buffer buffer2 = new Buffer(100);
        this.ab(buffer, buffer2);
        return buffer2;
    }
    
    void ab(final Buffer buffer, final Buffer buffer2) {
        class8 class8;
        class5 class9;
        long n;
        for (class8 = new class8(buffer), class9 = new class5(class8), n = 0L; !class9.method16(class8.method28(), class8.method29(), n); ++n) {}
        buffer2.writeLong(n);
    }
}
