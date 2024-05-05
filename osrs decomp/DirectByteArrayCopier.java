import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.5.36
// 

public class DirectByteArrayCopier extends AbstractByteArrayCopier
{
    ByteBuffer directBuffer;
    public static final Unsafe ag;
    public static final /* synthetic */ boolean zl;
    public int dc;
    public long uw;
    static int gameCyclesToDo;
    
    DirectByteArrayCopier() {
    }
    
    static {
        zl = !DirectByteArrayCopier.class.desiredAssertionStatus();
        ag = aq();
        if (DirectByteArrayCopier.ag == null) {
            Client.nw.info("unable to find Unsafe, using direct buffer");
        }
    }
    
    @Override
    byte[] av() {
        final byte[] dst = new byte[this.directBuffer.capacity()];
        this.directBuffer.position(0);
        this.directBuffer.get(dst);
        return dst;
    }
    
    public void hx() {
        if (DirectByteArrayCopier.ag != null) {
            DirectByteArrayCopier.ag.freeMemory(this.uw);
            this.uw = 0L;
            this.dc = 0;
        }
    }
    
    @Override
    byte[] get(final int n) {
        if (DirectByteArrayCopier.ag != null) {
            final byte[] destBase = new byte[this.dc];
            DirectByteArrayCopier.ag.copyMemory(null, this.uw, destBase, Unsafe.ARRAY_BYTE_BASE_OFFSET, this.dc);
            return destBase;
        }
        final byte[] dst = new byte[this.directBuffer.capacity()];
        this.directBuffer.position(0);
        this.directBuffer.get(dst);
        return dst;
    }
    
    @Override
    void set(final byte[] array, final int n) {
        if (DirectByteArrayCopier.ag != null) {
            if (!DirectByteArrayCopier.zl && this.uw != 0L) {
                throw new AssertionError();
            }
            final long allocateMemory = DirectByteArrayCopier.ag.allocateMemory(array.length);
            DirectByteArrayCopier.ag.copyMemory(array, Unsafe.ARRAY_BYTE_BASE_OFFSET, null, allocateMemory, array.length);
            this.uw = allocateMemory;
            this.dc = array.length;
        }
        else {
            (this.directBuffer = ByteBuffer.allocateDirect(array.length)).position(0);
            this.directBuffer.put(array);
        }
    }
    
    @Override
    void ar(final byte[] src) {
        (this.directBuffer = ByteBuffer.allocateDirect(src.length)).position(0);
        this.directBuffer.put(src);
    }
    
    public static Unsafe aq() {
        try {
            final Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            if (!declaredField.getType().equals(Unsafe.class)) {
                return null;
            }
            final int modifiers = declaredField.getModifiers();
            if (!Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                return null;
            }
            declaredField.setAccessible(true);
            return (Unsafe)declaredField.get(null);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
