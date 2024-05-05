// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class430 extends class273 implements class496
{
    static final int aq = 30;
    
    protected class430(final StudioGame studioGame, final Language language, final int n) {
        super(studioGame, language, n);
    }
    
    protected abstract class432 ao(final int p0);
    
    @Override
    public Object at(final int n) {
        final class432 vmethod8207 = this.vmethod8207(n, (byte)0);
        if (null != vmethod8207 && vmethod8207.method2283(-108666621)) {
            return vmethod8207.method2284(1458153897);
        }
        return null;
    }
    
    protected abstract class432 av(final int p0);
    
    protected abstract class432 ax(final int p0);
    
    public class497 ay(final Buffer buffer) {
        final int unsignedShort = buffer.readUnsignedShort(-1903083954);
        final class432 vmethod8207 = this.vmethod8207(unsignedShort, (byte)0);
        final class497 class497 = new class497(unsignedShort);
        final Class field4031 = vmethod8207.field3821.field4031;
        if (field4031 == Integer.class) {
            class497.field4104 = buffer.readInt(-1394107003);
        }
        else if (field4031 == Long.class) {
            class497.field4104 = Buffer.ks(buffer, (byte)1);
        }
        else if (String.class == field4031) {
            class497.field4104 = buffer.readStringCp1252NullCircumfixed((short)(-28051));
        }
        else {
            if (!class492.class.isAssignableFrom(field4031)) {
                throw new IllegalStateException();
            }
            try {
                final class492 field4032 = (class492)field4031.newInstance();
                field4032.method2556(buffer, (byte)(-36));
                class497.field4104 = field4032;
            }
            catch (InstantiationException ex) {}
            catch (IllegalAccessException ex2) {}
        }
        return class497;
    }
    
    public static int pb(final class430 class430) {
        return class430.af * -1813265095;
    }
    
    @Override
    public Object vmethod8697(final int n, final short n2) {
        try {
            final class432 vmethod8207 = this.vmethod8207(n, (byte)0);
            if (null != vmethod8207) {
                if (n2 >= 6640) {
                    throw new IllegalStateException();
                }
                if (vmethod8207.method2283(-108666621)) {
                    return vmethod8207.method2284(1458153897);
                }
                if (n2 >= 6640) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qn.aw(" + ')');
        }
    }
    
    public int al() {
        return this.af * -1222541835;
    }
    
    public int method2274(final int n) {
        try {
            return this.af * -1813265095;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qn.an(" + ')');
        }
    }
    
    public class497 method2275(final Buffer buffer, final int n) {
        try {
            final int unsignedShort = buffer.readUnsignedShort(-562941646);
            final class432 vmethod8207 = this.vmethod8207(unsignedShort, (byte)0);
            final class497 class497 = new class497(unsignedShort);
            final Class field4031 = vmethod8207.field3821.field4031;
            if (field4031 == Integer.class) {
                if (n <= 1895936781) {
                    throw new IllegalStateException();
                }
                class497.field4104 = buffer.readInt(-1048705519);
            }
            else if (field4031 == Long.class) {
                if (n <= 1895936781) {
                    throw new IllegalStateException();
                }
                class497.field4104 = Buffer.ks(buffer, (byte)1);
            }
            else if (String.class == field4031) {
                if (n <= 1895936781) {
                    throw new IllegalStateException();
                }
                class497.field4104 = buffer.readStringCp1252NullCircumfixed((short)(-17323));
            }
            else {
                if (!class492.class.isAssignableFrom(field4031)) {
                    throw new IllegalStateException();
                }
                if (n <= 1895936781) {
                    throw new IllegalStateException();
                }
                try {
                    final class492 field4032 = (class492)field4031.newInstance();
                    field4032.method2556(buffer, (byte)(-32));
                    class497.field4104 = field4032;
                }
                catch (InstantiationException ex2) {}
                catch (IllegalAccessException ex3) {}
            }
            return class497;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qn.ac(" + ')');
        }
    }
    
    public int au() {
        return this.af * -1813265095;
    }
    
    public class497 aa(final Buffer buffer) {
        final int unsignedShort = buffer.readUnsignedShort(-1029001163);
        final class432 vmethod8207 = this.vmethod8207(unsignedShort, (byte)0);
        final class497 class497 = new class497(unsignedShort);
        final Class field4031 = vmethod8207.field3821.field4031;
        if (field4031 == Integer.class) {
            class497.field4104 = buffer.readInt(-1702976352);
        }
        else if (field4031 == Long.class) {
            class497.field4104 = Buffer.ks(buffer, (byte)1);
        }
        else if (String.class == field4031) {
            class497.field4104 = buffer.readStringCp1252NullCircumfixed((short)(-14545));
        }
        else {
            if (!class492.class.isAssignableFrom(field4031)) {
                throw new IllegalStateException();
            }
            try {
                final class492 field4032 = (class492)field4031.newInstance();
                field4032.method2556(buffer, (byte)(-104));
                class497.field4104 = field4032;
            }
            catch (InstantiationException ex) {}
            catch (IllegalAccessException ex2) {}
        }
        return class497;
    }
    
    protected abstract class432 ai(final int p0);
    
    protected abstract class432 vmethod8207(final int p0, final byte p1);
    
    public int ab() {
        return this.af * -1813265095;
    }
    
    protected abstract class432 ag(final int p0);
    
    protected abstract class432 ah(final int p0);
}
