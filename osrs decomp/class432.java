import java.lang.reflect.Method;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.InvalidClassException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class432 implements class272
{
    class478 field3821;
    
    class432(final int n) {
    }
    
    boolean at() {
        return null != this.field3821;
    }
    
    Object ax() {
        if (class478.field4028 == this.field3821) {
            return 0;
        }
        if (class478.field4027 == this.field3821) {
            return -1L;
        }
        if (this.field3821 == class478.field4026) {
            return "";
        }
        return null;
    }
    
    boolean method2285() {
        return null != this.field3821;
    }
    
    public static void method2285(final int n) {
        try {
            HitSplatDefinition.HitSplatDefinition_cached.clear();
            HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
            HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qg.ay(" + ')');
        }
    }
    
    public static Object ck(final class432 class432) {
        if (class478.field4028 == class432.field3821) {
            return 0;
        }
        if (class478.field4027 == class432.field3821) {
            return -1L;
        }
        if (class432.field3821 == class478.field4026) {
            return "";
        }
        return null;
    }
    
    public void method2281(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    if (n == -253633021) {
                        return;
                    }
                }
                else {
                    final class428 obj = (class428)StructComposition.findEnumerated(new class428[] { class428.field3816, class428.field3815, class428.field3814, class428.field3817 }, ra, (short)173);
                    if (obj != null) {
                        if (n == -253633021) {
                            return;
                        }
                        switch (-1750512657 * obj.field3818) {
                            case 2: {
                                StructComposition.findEnumerated(Language.method1947((byte)(-10)), Buffer.ra(buffer, (byte)7), (short)173);
                                continue;
                            }
                            default: {
                                throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + obj);
                            }
                            case 3: {
                                buffer.readStringCp1252NullCircumfixed((short)(-4885));
                                continue;
                            }
                            case 1: {
                                final int ra2 = Buffer.ra(buffer, (byte)7);
                                this.field3821 = class103.method639(ra2, 1454430970);
                                if (null == this.field3821) {
                                    throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + ra2);
                                }
                                continue;
                            }
                        }
                    }
                    else {
                        this.vmethod7769(buffer, ra, 489961361);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qg.aw(" + ')');
        }
    }
    
    public void al(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                return;
            }
            final class428 obj = (class428)StructComposition.findEnumerated(new class428[] { class428.field3816, class428.field3815, class428.field3814, class428.field3817 }, ra, (short)173);
            if (obj != null) {
                switch (-1750512657 * obj.field3818) {
                    default: {
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + obj);
                    }
                    case 1: {
                        final int ra2 = Buffer.ra(buffer, (byte)7);
                        this.field3821 = class103.method639(ra2, -1584291508);
                        if (null == this.field3821) {
                            throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + ra2);
                        }
                        continue;
                    }
                    case 2: {
                        StructComposition.findEnumerated(Language.method1947((byte)(-122)), Buffer.ra(buffer, (byte)7), (short)173);
                        continue;
                    }
                    case 3: {
                        buffer.readStringCp1252NullCircumfixed((short)(-13430));
                        continue;
                    }
                }
            }
            else {
                this.vmethod7769(buffer, ra, -874082235);
            }
        }
    }
    
    abstract void an(final Buffer p0, final int p1);
    
    boolean method2283(final int n) {
        try {
            boolean b;
            if (null != this.field3821) {
                if (n != -108666621) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qg.ac(" + ')');
        }
    }
    
    Object method2284(final int n) {
        try {
            if (class478.field4028 == this.field3821) {
                return 0;
            }
            if (class478.field4027 == this.field3821) {
                if (n != 1458153897) {
                    throw new IllegalStateException();
                }
                return -1L;
            }
            else {
                if (this.field3821 != class478.field4026) {
                    return null;
                }
                if (n != 1458153897) {
                    throw new IllegalStateException();
                }
                return "";
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qg.au(" + ')');
        }
    }
    
    boolean aa() {
        return null != this.field3821;
    }
    
    abstract void vmethod7769(final Buffer p0, final int p1, final int p2);
    
    public static void vmethod7769(final PacketBuffer packetBuffer, final byte b) {
        try {
            final ReflectionCheck reflectionCheck = (ReflectionCheck)class36.reflectionChecks.up();
            if (null == reflectionCheck) {
                return;
            }
            final int n = -1633313603 * packetBuffer.at;
            packetBuffer.ba(reflectionCheck.id * 1600861545, -2081835031);
            for (int i = 0; i < reflectionCheck.size * -153242533; ++i) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                if (reflectionCheck.creationErrors[i] != 0) {
                    packetBuffer.bf(reflectionCheck.creationErrors[i], (byte)75);
                }
                else {
                    try {
                        final int n2 = reflectionCheck.operations[i];
                        if (n2 == 0) {
                            if (b >= 1) {
                                return;
                            }
                            final int int1 = reflectionCheck.field158[i].getInt(null);
                            packetBuffer.bf(0, (byte)118);
                            packetBuffer.ba(int1, -2081835031);
                        }
                        else if (n2 == 1) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            reflectionCheck.field158[i].setInt(null, reflectionCheck.intReplaceValues[i]);
                            packetBuffer.bf(0, (byte)96);
                        }
                        else if (n2 == 2) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            final int modifiers = reflectionCheck.field158[i].getModifiers();
                            packetBuffer.bf(0, (byte)62);
                            packetBuffer.ba(modifiers, -2081835031);
                        }
                        if (n2 == 3) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            final Method method = reflectionCheck.methods[i];
                            final byte[][] array = reflectionCheck.arguments[i];
                            final Object[] args = new Object[array.length];
                            for (int j = 0; j < array.length; ++j) {
                                args[j] = new ObjectInputStream(new ByteArrayInputStream(array[j])).readObject();
                            }
                            final Object invoke = method.invoke(null, args);
                            if (null == invoke) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                                packetBuffer.bf(0, (byte)75);
                            }
                            else if (invoke instanceof Number) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                                packetBuffer.bf(1, (byte)92);
                                packetBuffer.bl(((Number)invoke).longValue());
                            }
                            else if (invoke instanceof String) {
                                packetBuffer.bf(2, (byte)71);
                                packetBuffer.ce((String)invoke, -1787557412);
                            }
                            else {
                                packetBuffer.bf(4, (byte)93);
                            }
                        }
                        else if (4 == n2) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            final int modifiers2 = reflectionCheck.methods[i].getModifiers();
                            packetBuffer.bf(0, (byte)102);
                            packetBuffer.ba(modifiers2, -2081835031);
                        }
                    }
                    catch (ClassNotFoundException ex2) {
                        packetBuffer.bf(-10, (byte)59);
                    }
                    catch (InvalidClassException ex3) {
                        packetBuffer.bf(-11, (byte)37);
                    }
                    catch (StreamCorruptedException ex4) {
                        packetBuffer.bf(-12, (byte)106);
                    }
                    catch (OptionalDataException ex5) {
                        packetBuffer.bf(-13, (byte)112);
                    }
                    catch (IllegalAccessException ex6) {
                        packetBuffer.bf(-14, (byte)93);
                    }
                    catch (IllegalArgumentException ex7) {
                        packetBuffer.bf(-15, (byte)59);
                    }
                    catch (InvocationTargetException ex8) {
                        packetBuffer.bf(-16, (byte)122);
                    }
                    catch (SecurityException ex9) {
                        packetBuffer.bf(-17, (byte)37);
                    }
                    catch (IOException ex10) {
                        packetBuffer.bf(-18, (byte)60);
                    }
                    catch (NullPointerException ex11) {
                        packetBuffer.bf(-19, (byte)18);
                    }
                    catch (Exception ex12) {
                        packetBuffer.bf(-20, (byte)51);
                    }
                    catch (Throwable t) {
                        packetBuffer.bf(-21, (byte)99);
                    }
                }
            }
            packetBuffer.dg(n, -2013538167);
            reflectionCheck.hw();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qg.af(" + ')');
        }
    }
    
    public void ab(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                return;
            }
            final class428 obj = (class428)StructComposition.findEnumerated(new class428[] { class428.field3816, class428.field3815, class428.field3814, class428.field3817 }, ra, (short)173);
            if (obj != null) {
                switch (-1750512657 * obj.field3818) {
                    case 3: {
                        buffer.readStringCp1252NullCircumfixed((short)(-15850));
                        continue;
                    }
                    case 2: {
                        StructComposition.findEnumerated(Language.method1947((byte)(-83)), Buffer.ra(buffer, (byte)7), (short)173);
                        continue;
                    }
                    case 1: {
                        final int ra2 = Buffer.ra(buffer, (byte)7);
                        this.field3821 = class103.method639(ra2, -504914257);
                        if (null == this.field3821) {
                            throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + ra2);
                        }
                        continue;
                    }
                    default: {
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + obj);
                    }
                }
            }
            else {
                this.vmethod7769(buffer, ra, -163012967);
            }
        }
    }
    
    public void aq(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                return;
            }
            final class428 obj = (class428)StructComposition.findEnumerated(new class428[] { class428.field3816, class428.field3815, class428.field3814, class428.field3817 }, ra, (short)173);
            if (obj != null) {
                switch (-1750512657 * obj.field3818) {
                    case 3: {
                        buffer.readStringCp1252NullCircumfixed((short)(-397));
                        continue;
                    }
                    case 2: {
                        StructComposition.findEnumerated(Language.method1947((byte)(-20)), Buffer.ra(buffer, (byte)7), (short)173);
                        continue;
                    }
                    default: {
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + obj);
                    }
                    case 1: {
                        final int ra2 = Buffer.ra(buffer, (byte)7);
                        this.field3821 = class103.method639(ra2, -2022571391);
                        if (null == this.field3821) {
                            throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + ra2);
                        }
                        continue;
                    }
                }
            }
            else {
                this.vmethod7769(buffer, ra, -451202677);
            }
        }
    }
    
    public static Object yy(final class432 class432) {
        if (class478.field4028 == class432.field3821) {
            return 0;
        }
        if (class478.field4027 == class432.field3821) {
            return -1L;
        }
        if (class432.field3821 == class478.field4026) {
            return "";
        }
        return null;
    }
}
