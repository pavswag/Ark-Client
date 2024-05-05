import java.lang.reflect.Method;
import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator3 extends AbstractUserComparator
{
    public static final int ax = 11;
    final boolean reversed;
    public static AbstractArchive Widget_archive;
    static final int wv = 600;
    static final int aq = 4095;
    static byte[][][] ByteArrayPool_arrays;
    
    public UserComparator3(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-10));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eb.compare(" + ')');
        }
    }
    
    static int method700(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (n == 4000) {
                if (n2 <= -204312908) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539] + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                return 1;
            }
            else {
                if (n == 4001) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                    return 1;
                }
                if (4002 == n) {
                    if (n2 <= -204312908) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                    return 1;
                }
                else {
                    if (n == 4003) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] / Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                        return 1;
                    }
                    if (n == 4004) {
                        if (n2 <= -204312908) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(Math.random() * Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                        return 1;
                    }
                    else if (4005 == n) {
                        if (n2 <= -204312908) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(Math.random() * (1 + Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]));
                        return 1;
                    }
                    else if (4006 == n) {
                        if (n2 <= -204312908) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize -= 2135679865;
                        final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                        final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                        final int n5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n3 + (Interpreter.Interpreter_intStack[4 + Interpreter.Interpreter_intStackSize * -964267539] - n5) * (n4 - n3) / (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 3] - n5);
                        return 1;
                    }
                    else if (4007 == n) {
                        if (n2 <= -204312908) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        final int n6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n6 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] / 100 + n6;
                        return 1;
                    }
                    else if (4008 == n) {
                        if (n2 <= -204312908) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] | 1 << Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                        return 1;
                    }
                    else {
                        if (n == 4009) {
                            Interpreter.Interpreter_intStackSize -= 854271946;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] & -1 - (1 << Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]));
                            return 1;
                        }
                        if (n == 4010) {
                            if (n2 <= -204312908) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStackSize -= 854271946;
                            final int n7 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                            final int n8 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                            final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                            final int n9 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            boolean b2;
                            if (0x0 != (n7 & 1 << n8)) {
                                if (n2 <= -204312908) {
                                    throw new IllegalStateException();
                                }
                                b2 = true;
                            }
                            else {
                                b2 = false;
                            }
                            interpreter_intStack[n9] = (b2 ? 1 : 0);
                            return 1;
                        }
                        else if (4011 == n) {
                            if (n2 <= -204312908) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStackSize -= 854271946;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] % Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                            return 1;
                        }
                        else {
                            if (4012 == n) {
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                final int n10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                                final int n11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                                if (n10 == 0) {
                                    if (n2 <= -204312908) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                }
                                else {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.pow(n10, n11);
                                }
                                return 1;
                            }
                            if (n == 4013) {
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                final int n12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                                final int n13 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                                if (n12 == 0) {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                    return 1;
                                }
                                switch (n13) {
                                    case 4: {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.sqrt(Math.sqrt(n12));
                                        break;
                                    }
                                    default: {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.pow(n12, 1.0 / n13);
                                        break;
                                    }
                                    case 3: {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.cbrt(n12);
                                        break;
                                    }
                                    case 2: {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.sqrt(n12);
                                        break;
                                    }
                                    case 1: {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n12;
                                        break;
                                    }
                                    case 0: {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Integer.MAX_VALUE;
                                        break;
                                    }
                                }
                                return 1;
                            }
                            else if (n == 4014) {
                                if (n2 <= -204312908) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] & Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                                return 1;
                            }
                            else if (n == 4015) {
                                if (n2 <= -204312908) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] | Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
                                return 1;
                            }
                            else if (4016 == n) {
                                if (n2 <= -204312908) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                final int n14 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                                final int n15 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                                final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                                final int n16 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                int n17;
                                if (n14 < n15) {
                                    if (n2 <= -204312908) {
                                        throw new IllegalStateException();
                                    }
                                    n17 = n14;
                                }
                                else {
                                    n17 = n15;
                                }
                                interpreter_intStack2[n16] = n17;
                                return 1;
                            }
                            else if (4017 == n) {
                                if (n2 <= -204312908) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                final int n18 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                                final int n19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                                final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                                final int n20 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                int n21;
                                if (n18 > n19) {
                                    if (n2 <= -204312908) {
                                        throw new IllegalStateException();
                                    }
                                    n21 = n18;
                                }
                                else {
                                    n21 = n19;
                                }
                                interpreter_intStack3[n20] = n21;
                                return 1;
                            }
                            else {
                                if (4018 == n) {
                                    Interpreter.Interpreter_intStackSize -= 1281407919;
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize] * (long)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] / Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]);
                                    return 1;
                                }
                                if (n == 4025) {
                                    if (n2 <= -204312908) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class18.method63(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -84303745);
                                    return 1;
                                }
                                else {
                                    if (n == 4026) {
                                        Interpreter.Interpreter_intStackSize -= 854271946;
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] ^ 1 << Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]);
                                        return 1;
                                    }
                                    if (n == 4027) {
                                        if (n2 <= -204312908) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 1281407919;
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class134.method780(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)0);
                                        return 1;
                                    }
                                    else if (4028 == n) {
                                        if (n2 <= -204312908) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 1281407919;
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Canvas.method91(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2], 1551365421);
                                        return 1;
                                    }
                                    else if (n == 4029) {
                                        if (n2 <= -204312908) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 1281407919;
                                        final int n22 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                                        final int n23 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                                        final int n24 = 31 - Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n22 << n24 >>> n23 + n24;
                                        return 1;
                                    }
                                    else {
                                        if (4030 == n) {
                                            Interpreter.Interpreter_intStackSize -= 1708543892;
                                            final int n25 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                                            int n26 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                                            final int n27 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                                            final int n28 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3];
                                            final int method91 = Canvas.method91(n25, n27, n28, 2061953545);
                                            final int vmethod3248 = class140.vmethod3248(n28 - n27 + 1, (byte)81);
                                            if (n26 > vmethod3248) {
                                                if (n2 <= -204312908) {
                                                    throw new IllegalStateException();
                                                }
                                                n26 = vmethod3248;
                                            }
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (method91 | n26 << n27);
                                            return 1;
                                        }
                                        if (4032 == n) {
                                            if (n2 <= -204312908) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = AttackOption.method621(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1], -1961239650);
                                            return 1;
                                        }
                                        else {
                                            if (n == 4033) {
                                                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = TriBool.method2198(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1], (byte)0);
                                                return 1;
                                            }
                                            if (n == 4034) {
                                                if (n2 <= -204312908) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStackSize -= 854271946;
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = UserComparator8.method688(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], 62977818);
                                                return 1;
                                            }
                                            else if (n == 4035) {
                                                if (n2 <= -204312908) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1]);
                                                return 1;
                                            }
                                            else {
                                                if (4036 != n) {
                                                    return 2;
                                                }
                                                if (n2 <= -204312908) {
                                                    throw new IllegalStateException();
                                                }
                                                final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                                                int release = -1;
                                                if (WorldMapSectionType.isNumber(s, -634424436)) {
                                                    if (n2 <= -204312908) {
                                                        throw new IllegalStateException();
                                                    }
                                                    release = PacketBufferNode.release(s, (byte)46);
                                                }
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = release;
                                                return 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eb.bo(" + ')');
        }
    }
    
    public static void method699(final Buffer buffer, final int n, final int n2) {
        try {
            final ReflectionCheck reflectionCheck = new ReflectionCheck();
            reflectionCheck.size = Buffer.ra(buffer, (byte)7) * 16276435;
            reflectionCheck.id = buffer.readInt(-1804398679) * 711502553;
            reflectionCheck.operations = new int[-153242533 * reflectionCheck.size];
            reflectionCheck.creationErrors = new int[reflectionCheck.size * -153242533];
            reflectionCheck.field158 = new Field[-153242533 * reflectionCheck.size];
            reflectionCheck.intReplaceValues = new int[reflectionCheck.size * -153242533];
            reflectionCheck.methods = new Method[reflectionCheck.size * -153242533];
            reflectionCheck.arguments = new byte[-153242533 * reflectionCheck.size][][];
            for (int i = 0; i < reflectionCheck.size * -153242533; ++i) {
                if (n2 <= 1543332522) {
                    throw new IllegalStateException();
                }
                try {
                    final int ra = Buffer.ra(buffer, (byte)7);
                    Label_0810: {
                        if (ra != 0) {
                            if (n2 <= 1543332522) {
                                throw new IllegalStateException();
                            }
                            if (ra != 1) {
                                if (n2 <= 1543332522) {
                                    throw new IllegalStateException();
                                }
                                if (2 == ra) {
                                    if (n2 <= 1543332522) {
                                        return;
                                    }
                                }
                                else {
                                    if (3 != ra) {
                                        if (n2 <= 1543332522) {
                                            throw new IllegalStateException();
                                        }
                                        if (4 != ra) {
                                            break Label_0810;
                                        }
                                        if (n2 <= 1543332522) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    final String stringCp1252NullTerminated = buffer.readStringCp1252NullTerminated((byte)0);
                                    final String stringCp1252NullTerminated2 = buffer.readStringCp1252NullTerminated((byte)0);
                                    final int ra2 = Buffer.ra(buffer, (byte)7);
                                    final String[] array = new String[ra2];
                                    for (int j = 0; j < ra2; ++j) {
                                        array[j] = buffer.readStringCp1252NullTerminated((byte)0);
                                    }
                                    final String stringCp1252NullTerminated3 = buffer.readStringCp1252NullTerminated((byte)0);
                                    final byte[][] array2 = new byte[ra2][];
                                    if (ra == 3) {
                                        if (n2 <= 1543332522) {
                                            return;
                                        }
                                        for (int k = 0; k < ra2; ++k) {
                                            final int int1 = buffer.readInt(-1701836625);
                                            Buffer.io(buffer, array2[k] = new byte[int1], 0, int1, -1570744551);
                                        }
                                    }
                                    reflectionCheck.operations[i] = ra;
                                    final Class[] array3 = new Class[ra2];
                                    for (int l = 0; l < ra2; ++l) {
                                        if (n2 <= 1543332522) {
                                            throw new IllegalStateException();
                                        }
                                        array3[l] = class33.method152(array[l], 1483756716);
                                    }
                                    final Class method152 = class33.method152(stringCp1252NullTerminated3, 1654672643);
                                    if (class33.method152(stringCp1252NullTerminated, 1757034561).getClassLoader() != null) {
                                        final Method[] declaredMethods = class33.method152(stringCp1252NullTerminated, 1470416793).getDeclaredMethods();
                                        for (int n3 = 0; n3 < declaredMethods.length; ++n3) {
                                            if (n2 <= 1543332522) {
                                                throw new IllegalStateException();
                                            }
                                            final Method method153 = declaredMethods[n3];
                                            if (method153.getName().equals(stringCp1252NullTerminated2)) {
                                                if (n2 <= 1543332522) {
                                                    throw new IllegalStateException();
                                                }
                                                final Class<?>[] parameterTypes = method153.getParameterTypes();
                                                if (parameterTypes.length == array3.length) {
                                                    if (n2 <= 1543332522) {
                                                        throw new IllegalStateException();
                                                    }
                                                    boolean b = true;
                                                    for (int n4 = 0; n4 < array3.length; ++n4) {
                                                        if (n2 <= 1543332522) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (array3[n4] != parameterTypes[n4]) {
                                                            b = false;
                                                            break;
                                                        }
                                                    }
                                                    if (b) {
                                                        if (n2 <= 1543332522) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (method152 == method153.getReturnType()) {
                                                            if (n2 <= 1543332522) {
                                                                throw new IllegalStateException();
                                                            }
                                                            reflectionCheck.methods[i] = method153;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        reflectionCheck.arguments[i] = array2;
                                        break Label_0810;
                                    }
                                    if (n2 <= 1543332522) {
                                        throw new IllegalStateException();
                                    }
                                    throw new SecurityException();
                                }
                            }
                        }
                        final String stringCp1252NullTerminated4 = buffer.readStringCp1252NullTerminated((byte)0);
                        final String stringCp1252NullTerminated5 = buffer.readStringCp1252NullTerminated((byte)0);
                        int int2 = 0;
                        if (ra != 0) {
                            int2 = buffer.readInt(-1987599500);
                        }
                        reflectionCheck.operations[i] = ra;
                        reflectionCheck.intReplaceValues[i] = int2;
                        if (class33.method152(stringCp1252NullTerminated4, 1290821012).getClassLoader() == null) {
                            if (n2 <= 1543332522) {
                                throw new IllegalStateException();
                            }
                            throw new SecurityException();
                        }
                        else {
                            reflectionCheck.field158[i] = class33.method152(stringCp1252NullTerminated4, 1116581823).getDeclaredField(stringCp1252NullTerminated5);
                        }
                    }
                }
                catch (ClassNotFoundException ex2) {
                    reflectionCheck.creationErrors[i] = -1;
                }
                catch (SecurityException ex3) {
                    reflectionCheck.creationErrors[i] = -2;
                }
                catch (NullPointerException ex4) {
                    reflectionCheck.creationErrors[i] = -3;
                }
                catch (Exception ex5) {
                    reflectionCheck.creationErrors[i] = -4;
                }
                catch (Throwable t) {
                    reflectionCheck.creationErrors[i] = -5;
                }
            }
            class36.reflectionChecks.addFirst(reflectionCheck);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eb.an(" + ')');
        }
    }
    
    int method699(final Buddy buddy, final Buddy buddy2) {
        if (buddy.world * 177258591 != buddy2.world * 177258591) {
            return this.reversed ? (177258591 * buddy.world - buddy2.world * 177258591) : (buddy2.world * 177258591 - buddy.world * 177258591);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public static SpritePixels[] method699(final AbstractArchive abstractArchive, final int n, final int n2, final int n3) {
        try {
            final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-22));
            boolean b;
            if (null == takeFile) {
                if (n3 != 1271520368) {
                    throw new IllegalStateException();
                }
                b = false;
            }
            else {
                class485.SpriteBuffer_decode(takeFile, 1145263442);
                b = true;
            }
            if (!b) {
                return null;
            }
            final SpritePixels[] array = new SpritePixels[class503.SpriteBuffer_spriteCount * 1606065339];
            for (int i = 0; i < 1606065339 * class503.SpriteBuffer_spriteCount; ++i) {
                if (n3 != 1271520368) {
                    throw new IllegalStateException();
                }
                final SpritePixels[] array2 = array;
                final int n4 = i;
                final SpritePixels spritePixels = new SpritePixels();
                array2[n4] = spritePixels;
                final SpritePixels spritePixels2 = spritePixels;
                spritePixels2.width = -822007097 * class503.SpriteBuffer_spriteWidth;
                spritePixels2.height = class503.SpriteBuffer_spriteHeight * 378525975;
                spritePixels2.xOffset = class503.SpriteBuffer_xOffsets[i];
                spritePixels2.yOffset = class17.SpriteBuffer_yOffsets[i];
                spritePixels2.subWidth = class97.SpriteBuffer_spriteWidths[i];
                spritePixels2.subHeight = class138.SpriteBuffer_spriteHeights[i];
                final int n5 = spritePixels2.subHeight * spritePixels2.subWidth;
                final byte[] array3 = VarbitComposition.SpriteBuffer_pixels[i];
                spritePixels2.pixels = new int[n5];
                for (int j = 0; j < n5; ++j) {
                    spritePixels2.pixels[j] = class394.SpriteBuffer_spritePalette[array3[j] & 0xFF];
                }
            }
            class398.method2125(-262861184);
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eb.an(" + ')');
        }
    }
    
    public int au(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-105));
    }
    
    int compareBuddy(final Buddy buddy, final Buddy buddy2, final byte b) {
        try {
            if (buddy.world * 177258591 == buddy2.world * 177258591) {
                return this.ao((User)buddy, (User)buddy2, 641920470);
            }
            if (b >= 2) {
                throw new IllegalStateException();
            }
            int n;
            if (this.reversed) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                n = 177258591 * buddy.world - buddy2.world * 177258591;
            }
            else {
                n = buddy2.world * 177258591 - buddy.world * 177258591;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eb.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-106));
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-100));
    }
    
    static final int method702(final byte b) {
        try {
            if (!class20.clientPreferences.getRoofsHidden(-1990949595)) {
                int n = 3;
                Label_1007: {
                    if (WorldMapSectionType.cameraPitch * 1897923909 < 310) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        int i;
                        int n2;
                        if (986256295 * Client.oculusOrbState == 1) {
                            if (b <= 0) {
                                throw new IllegalStateException();
                            }
                            i = -1958669353 * class33.oculusOrbFocalPointX >> 7;
                            n2 = -365969735 * class144.oculusOrbFocalPointY >> 7;
                        }
                        else {
                            i = 1144428983 * MusicPatchNode.localPlayer.br >> 7;
                            n2 = MusicPatchNode.localPlayer.ep * -411750205 >> 7;
                        }
                        int n3 = -2100544359 * class36.cameraX >> 7;
                        int j = class297.cameraZ * -91399205 >> 7;
                        if (n3 >= 0) {
                            if (b <= 0) {
                                throw new IllegalStateException();
                            }
                            if (j >= 0) {
                                if (b <= 0) {
                                    throw new IllegalStateException();
                                }
                                if (n3 < 104) {
                                    if (b <= 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (j < 104) {
                                        if (i >= 0 && n2 >= 0) {
                                            if (b <= 0) {
                                                throw new IllegalStateException();
                                            }
                                            if (i < 104) {
                                                if (n2 >= 104) {
                                                    if (b <= 0) {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                                else {
                                                    if (0x0 != (Tiles.Tiles_renderFlags[GameEngine.Client_plane * -1727408401][n3][j] & 0x4)) {
                                                        if (b <= 0) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n = -1727408401 * GameEngine.Client_plane;
                                                    }
                                                    int n4;
                                                    if (i > n3) {
                                                        if (b <= 0) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n4 = i - n3;
                                                    }
                                                    else {
                                                        n4 = n3 - i;
                                                    }
                                                    int n5;
                                                    if (n2 > j) {
                                                        if (b <= 0) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n5 = n2 - j;
                                                    }
                                                    else {
                                                        n5 = j - n2;
                                                    }
                                                    if (n4 > n5) {
                                                        if (b <= 0) {
                                                            throw new IllegalStateException();
                                                        }
                                                        final int n6 = 65536 * n5 / n4;
                                                        int n7 = 32768;
                                                        while (i != n3) {
                                                            if (b <= 0) {
                                                                throw new IllegalStateException();
                                                            }
                                                            if (n3 < i) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                ++n3;
                                                            }
                                                            else if (n3 > i) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                --n3;
                                                            }
                                                            if (0x0 != (Tiles.Tiles_renderFlags[GameEngine.Client_plane * -1727408401][n3][j] & 0x4)) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n = GameEngine.Client_plane * -1727408401;
                                                            }
                                                            n7 += n6;
                                                            if (n7 < 65536) {
                                                                continue;
                                                            }
                                                            if (b <= 0) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n7 -= 65536;
                                                            if (j < n2) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                ++j;
                                                            }
                                                            else if (j > n2) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                --j;
                                                            }
                                                            if (0x0 == (Tiles.Tiles_renderFlags[GameEngine.Client_plane * -1727408401][n3][j] & 0x4)) {
                                                                continue;
                                                            }
                                                            n = GameEngine.Client_plane * -1727408401;
                                                        }
                                                        break Label_1007;
                                                    }
                                                    else {
                                                        if (n5 <= 0) {
                                                            break Label_1007;
                                                        }
                                                        if (b <= 0) {
                                                            throw new IllegalStateException();
                                                        }
                                                        final int n8 = n4 * 65536 / n5;
                                                        int n9 = 32768;
                                                        while (j != n2) {
                                                            if (b <= 0) {
                                                                throw new IllegalStateException();
                                                            }
                                                            if (j < n2) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                ++j;
                                                            }
                                                            else if (j > n2) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                --j;
                                                            }
                                                            if (0x0 != (Tiles.Tiles_renderFlags[-1727408401 * GameEngine.Client_plane][n3][j] & 0x4)) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n = -1727408401 * GameEngine.Client_plane;
                                                            }
                                                            n9 += n8;
                                                            if (n9 < 65536) {
                                                                continue;
                                                            }
                                                            n9 -= 65536;
                                                            if (n3 < i) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                ++n3;
                                                            }
                                                            else if (n3 > i) {
                                                                if (b <= 0) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                --n3;
                                                            }
                                                            if (0x0 == (Tiles.Tiles_renderFlags[GameEngine.Client_plane * -1727408401][n3][j] & 0x4)) {
                                                                continue;
                                                            }
                                                            if (b <= 0) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n = GameEngine.Client_plane * -1727408401;
                                                        }
                                                        break Label_1007;
                                                    }
                                                }
                                            }
                                        }
                                        return -1727408401 * GameEngine.Client_plane;
                                    }
                                    if (b <= 0) {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        }
                        return -1727408401 * GameEngine.Client_plane;
                    }
                }
                if (MusicPatchNode.localPlayer.br * 1144428983 >= 0 && MusicPatchNode.localPlayer.ep * -411750205 >= 0) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    if (1144428983 * MusicPatchNode.localPlayer.br < 13312) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        if (-411750205 * MusicPatchNode.localPlayer.ep < 13312) {
                            if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane * -1727408401][1144428983 * MusicPatchNode.localPlayer.br >> 7][-411750205 * MusicPatchNode.localPlayer.ep >> 7] & 0x4) != 0x0) {
                                if (b <= 0) {
                                    throw new IllegalStateException();
                                }
                                n = -1727408401 * GameEngine.Client_plane;
                            }
                            return n;
                        }
                    }
                }
                return -1727408401 * GameEngine.Client_plane;
            }
            if (b <= 0) {
                throw new IllegalStateException();
            }
            return -1727408401 * GameEngine.Client_plane;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eb.jx(" + ')');
        }
    }
    
    public static int uy(final UserComparator3 userComparator3, final Buddy buddy, final Buddy buddy2) {
        if (userComparator3 == null) {
            userComparator3.method699(buddy, buddy);
        }
        if (buddy.world * 177258591 != buddy2.world * 177258591) {
            return userComparator3.reversed ? (-944512681 * buddy.world - buddy2.world * 720461912) : (buddy2.world * 700092822 - buddy.world * -861481819);
        }
        return userComparator3.ao((User)buddy, (User)buddy2, 641920470);
    }
}
