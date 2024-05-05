import java.lang.reflect.Field;
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

public class class36
{
    static final int bi = 30;
    public static IterableNodeDeque reflectionChecks;
    static SpritePixels[] headIconPkSprites;
    static int cameraX;
    static final int cd = 50;
    static final int ar = 512;
    static final int bz = 17;
    
    class36() throws Throwable {
        throw new Error();
    }
    
    static {
        class36.reflectionChecks = new IterableNodeDeque();
    }
    
    static final void setViewportShape(int n, int n2, int n3, int n4, final boolean b, final int n5) {
        if (b) {
            Client.mv();
        }
        if (n3 < 1) {
            n3 = 1;
        }
        if (n4 < 1) {
            n4 = 1;
        }
        final int n6 = n4 - 334;
        double n7;
        if (n6 < 0) {
            n7 = Client.field625;
        }
        else if (n6 >= 100) {
            n7 = Client.field626;
        }
        else {
            n7 = (Client.field626 - Client.field625) * n6 / 100 + Client.field625;
        }
        final double n8 = n4 * n7 * 512.0 / (n3 * 334);
        if (n8 < Client.field488) {
            final double n9 = Client.field488;
            n7 = n9 * n3 * 334.0 / (n4 * 512);
            if (n7 > Client.field630) {
                n7 = Client.field630;
                final int n10 = (int)((n3 - n4 * n7 * 512.0 / (n9 * 334.0)) / 2.0);
                if (b) {
                    class220.sm();
                    class220.lv(n, n2, n10, n4, -16777216);
                    class220.lv(n + n3 - n10, n2, n10, n4, -16777216);
                }
                n += n10;
                n3 -= n10 * 2;
            }
        }
        else if (n8 > Client.field562) {
            final double n11 = Client.field562;
            n7 = n11 * n3 * 334.0 / (n4 * 512);
            if (n7 < Client.field440) {
                n7 = Client.field440;
                final int n12 = (int)((n4 - n11 * n3 * 334.0 / (n7 * 512.0)) / 2.0);
                if (b) {
                    class220.sm();
                    class220.lv(n, n2, n3, n12, -16777216);
                    class220.lv(n, n4 + n2 - n12, n3, n12, -16777216);
                }
                n2 += n12;
                n4 -= n12 * 2;
            }
        }
        Client.viewportZoom = (int)(n4 * n7 / 334.0) * -787687633;
        if (n3 != Client.viewportWidth * 433849721 || n4 != Client.viewportHeight * 2042096749) {
            Client.lz(n3, n4);
        }
        Client.viewportOffsetX = n * -1528400137;
        Client.viewportOffsetY = n2 * 2017169511;
        Client.viewportWidth = n3 * -350989111;
        Client.viewportHeight = n4 * -538378907;
    }
    
    static void method198(final byte b) {
        try {
            if (null != class126.worldMap) {
                class126.worldMap.method2381(GameEngine.Client_plane * -1727408401, (1144428983 * MusicPatchNode.localPlayer.br >> 7) + -1232093375 * WorldMapData_0.baseX, 827352769 * GameObject.baseY + (MusicPatchNode.localPlayer.ep * -411750205 >> 7), false, (byte)15);
                class126.worldMap.de(216165054);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bt.ie(" + ')');
        }
    }
    
    static Class al(final String className) throws ClassNotFoundException {
        if (className.equals("B")) {
            return Byte.TYPE;
        }
        if (className.equals("I")) {
            return Integer.TYPE;
        }
        if (className.equals("S")) {
            return Short.TYPE;
        }
        if (className.equals("J")) {
            return Long.TYPE;
        }
        if (className.equals("Z")) {
            return Boolean.TYPE;
        }
        if (className.equals("F")) {
            return Float.TYPE;
        }
        if (className.equals("D")) {
            return Double.TYPE;
        }
        if (className.equals("C")) {
            return Character.TYPE;
        }
        if (className.equals("void")) {
            return Void.TYPE;
        }
        return Class.forName(className);
    }
    
    static final void method199(final int n) {
        try {
            Client.field559 = Client.cycleCntr * 1321175015;
            ItemContainer.field844 = true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bt.no(" + ')');
        }
    }
    
    public static void ac(final PacketBuffer packetBuffer) {
        final ReflectionCheck reflectionCheck = (ReflectionCheck)class36.reflectionChecks.up();
        if (null == reflectionCheck) {
            return;
        }
        final int n = -1633313603 * packetBuffer.at;
        packetBuffer.ba(reflectionCheck.id * 1600861545, -2081835031);
        for (int i = 0; i < reflectionCheck.size * -153242533; ++i) {
            if (reflectionCheck.creationErrors[i] != 0) {
                packetBuffer.bf(reflectionCheck.creationErrors[i], (byte)50);
            }
            else {
                try {
                    final int n2 = reflectionCheck.operations[i];
                    if (n2 == 0) {
                        final int int1 = reflectionCheck.field158[i].getInt(null);
                        packetBuffer.bf(0, (byte)108);
                        packetBuffer.ba(int1, -2081835031);
                    }
                    else if (n2 == 1) {
                        reflectionCheck.field158[i].setInt(null, reflectionCheck.intReplaceValues[i]);
                        packetBuffer.bf(0, (byte)38);
                    }
                    else if (n2 == 2) {
                        final int modifiers = reflectionCheck.field158[i].getModifiers();
                        packetBuffer.bf(0, (byte)67);
                        packetBuffer.ba(modifiers, -2081835031);
                    }
                    if (n2 == 3) {
                        final Method method = reflectionCheck.methods[i];
                        final byte[][] array = reflectionCheck.arguments[i];
                        final Object[] args = new Object[array.length];
                        for (int j = 0; j < array.length; ++j) {
                            args[j] = new ObjectInputStream(new ByteArrayInputStream(array[j])).readObject();
                        }
                        final Object invoke = method.invoke(null, args);
                        if (null == invoke) {
                            packetBuffer.bf(0, (byte)116);
                        }
                        else if (invoke instanceof Number) {
                            packetBuffer.bf(1, (byte)65);
                            packetBuffer.bl(((Number)invoke).longValue());
                        }
                        else if (invoke instanceof String) {
                            packetBuffer.bf(2, (byte)73);
                            packetBuffer.ce((String)invoke, -2054216186);
                        }
                        else {
                            packetBuffer.bf(4, (byte)88);
                        }
                    }
                    else if (4 == n2) {
                        final int modifiers2 = reflectionCheck.methods[i].getModifiers();
                        packetBuffer.bf(0, (byte)80);
                        packetBuffer.ba(modifiers2, -2081835031);
                    }
                }
                catch (ClassNotFoundException ex) {
                    packetBuffer.bf(-10, (byte)2);
                }
                catch (InvalidClassException ex2) {
                    packetBuffer.bf(-11, (byte)117);
                }
                catch (StreamCorruptedException ex3) {
                    packetBuffer.bf(-12, (byte)66);
                }
                catch (OptionalDataException ex4) {
                    packetBuffer.bf(-2061583612, (byte)29);
                }
                catch (IllegalAccessException ex5) {
                    packetBuffer.bf(-14, (byte)34);
                }
                catch (IllegalArgumentException ex6) {
                    packetBuffer.bf(-15, (byte)46);
                }
                catch (InvocationTargetException ex7) {
                    packetBuffer.bf(864057074, (byte)52);
                }
                catch (SecurityException ex8) {
                    packetBuffer.bf(-17, (byte)126);
                }
                catch (IOException ex9) {
                    packetBuffer.bf(-18, (byte)56);
                }
                catch (NullPointerException ex10) {
                    packetBuffer.bf(-19, (byte)29);
                }
                catch (Exception ex11) {
                    packetBuffer.bf(-20, (byte)2);
                }
                catch (Throwable t) {
                    packetBuffer.bf(-21, (byte)111);
                }
            }
        }
        packetBuffer.dg(n, 56604042);
        reflectionCheck.hw();
    }
    
    public static void lb(final ClientPreferences clientPreferences, final boolean displayFps) {
        if (clientPreferences == null) {
            clientPreferences.cc(displayFps);
            return;
        }
        clientPreferences.displayFps = displayFps;
        class100.savePreferences((byte)(-91));
    }
    
    public static void au(final PacketBuffer packetBuffer) {
        final ReflectionCheck reflectionCheck = (ReflectionCheck)class36.reflectionChecks.up();
        if (null == reflectionCheck) {
            return;
        }
        final int n = -1633313603 * packetBuffer.at;
        packetBuffer.ba(reflectionCheck.id * 1600861545, -2081835031);
        for (int i = 0; i < reflectionCheck.size * -153242533; ++i) {
            if (reflectionCheck.creationErrors[i] != 0) {
                packetBuffer.bf(reflectionCheck.creationErrors[i], (byte)26);
            }
            else {
                try {
                    final int n2 = reflectionCheck.operations[i];
                    if (n2 == 0) {
                        final int int1 = reflectionCheck.field158[i].getInt(null);
                        packetBuffer.bf(0, (byte)47);
                        packetBuffer.ba(int1, -2081835031);
                    }
                    else if (n2 == 1) {
                        reflectionCheck.field158[i].setInt(null, reflectionCheck.intReplaceValues[i]);
                        packetBuffer.bf(0, (byte)71);
                    }
                    else if (n2 == 2) {
                        final int modifiers = reflectionCheck.field158[i].getModifiers();
                        packetBuffer.bf(0, (byte)85);
                        packetBuffer.ba(modifiers, -2081835031);
                    }
                    if (n2 == 3) {
                        final Method method = reflectionCheck.methods[i];
                        final byte[][] array = reflectionCheck.arguments[i];
                        final Object[] args = new Object[array.length];
                        for (int j = 0; j < array.length; ++j) {
                            args[j] = new ObjectInputStream(new ByteArrayInputStream(array[j])).readObject();
                        }
                        final Object invoke = method.invoke(null, args);
                        if (null == invoke) {
                            packetBuffer.bf(0, (byte)127);
                        }
                        else if (invoke instanceof Number) {
                            packetBuffer.bf(1, (byte)56);
                            packetBuffer.bl(((Number)invoke).longValue());
                        }
                        else if (invoke instanceof String) {
                            packetBuffer.bf(2, (byte)55);
                            packetBuffer.ce((String)invoke, -1826907593);
                        }
                        else {
                            packetBuffer.bf(4, (byte)22);
                        }
                    }
                    else if (4 == n2) {
                        final int modifiers2 = reflectionCheck.methods[i].getModifiers();
                        packetBuffer.bf(0, (byte)22);
                        packetBuffer.ba(modifiers2, -2081835031);
                    }
                }
                catch (ClassNotFoundException ex) {
                    packetBuffer.bf(-10, (byte)86);
                }
                catch (InvalidClassException ex2) {
                    packetBuffer.bf(-11, (byte)11);
                }
                catch (StreamCorruptedException ex3) {
                    packetBuffer.bf(-12, (byte)71);
                }
                catch (OptionalDataException ex4) {
                    packetBuffer.bf(-13, (byte)42);
                }
                catch (IllegalAccessException ex5) {
                    packetBuffer.bf(-14, (byte)125);
                }
                catch (IllegalArgumentException ex6) {
                    packetBuffer.bf(-15, (byte)70);
                }
                catch (InvocationTargetException ex7) {
                    packetBuffer.bf(-16, (byte)114);
                }
                catch (SecurityException ex8) {
                    packetBuffer.bf(-17, (byte)22);
                }
                catch (IOException ex9) {
                    packetBuffer.bf(-18, (byte)65);
                }
                catch (NullPointerException ex10) {
                    packetBuffer.bf(-19, (byte)75);
                }
                catch (Exception ex11) {
                    packetBuffer.bf(-20, (byte)93);
                }
                catch (Throwable t) {
                    packetBuffer.bf(-21, (byte)50);
                }
            }
        }
        packetBuffer.dg(n, 261084734);
        reflectionCheck.hw();
    }
    
    static final void method196(int n, int n2, final int n3, final int n4, final int n5, final int n6, final byte b) {
        try {
            final int n7 = n3 - n;
            final int n8 = n4 - n2;
            int n9;
            if (n7 >= 0) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n9 = n7;
            }
            else {
                n9 = -n7;
            }
            final int n10 = n9;
            int n11;
            if (n8 >= 0) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n11 = n8;
            }
            else {
                n11 = -n8;
            }
            final int n12 = n11;
            int n13 = n10;
            if (n13 < n12) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n13 = n12;
            }
            if (n13 == 0) {
                return;
            }
            int n14 = (n7 << 16) / n13;
            int n15 = (n8 << 16) / n13;
            if (n15 <= n14) {
                n14 = -n14;
            }
            else {
                n15 = -n15;
            }
            final int n16 = n6 * n15 >> 17;
            final int n17 = 1 + n15 * n6 >> 17;
            final int n18 = n14 * n6 >> 17;
            final int n19 = n6 * n14 + 1 >> 17;
            n -= Rasterizer2D.Rasterizer2D_xClipStart;
            n2 -= Rasterizer2D.Rasterizer2D_yClipStart;
            final int n20 = n + n16;
            final int n21 = n - n17;
            final int n22 = n7 + n - n17;
            final int n23 = n + n7 + n16;
            final int n24 = n18 + n2;
            final int n25 = n2 - n19;
            final int n26 = n2 + n8 - n19;
            final int n27 = n2 + n8 + n18;
            VarpDefinition.method981(n20, n21, n22, -1740756415);
            class144.method825(n24, n25, n26, n20, n21, n22, 0.0f, 0.0f, 0.0f, n5, -515253774);
            VarpDefinition.method981(n20, n22, n23, -1740756415);
            class144.method825(n24, n26, n27, n20, n22, n23, 0.0f, 0.0f, 0.0f, n5, 714212921);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bt.la(" + ')');
        }
    }
    
    public static void ab(final Buffer buffer, final int n) {
        final ReflectionCheck reflectionCheck = new ReflectionCheck();
        reflectionCheck.size = Buffer.ra(buffer, (byte)7) * 16276435;
        reflectionCheck.id = buffer.readInt(-1164544920) * 711502553;
        reflectionCheck.operations = new int[-153242533 * reflectionCheck.size];
        reflectionCheck.creationErrors = new int[reflectionCheck.size * -153242533];
        reflectionCheck.field158 = new Field[-153242533 * reflectionCheck.size];
        reflectionCheck.intReplaceValues = new int[reflectionCheck.size * -153242533];
        reflectionCheck.methods = new Method[reflectionCheck.size * -153242533];
        reflectionCheck.arguments = new byte[-153242533 * reflectionCheck.size][][];
        for (int i = 0; i < reflectionCheck.size * -153242533; ++i) {
            try {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0 || ra == 1 || 2 == ra) {
                    final String stringCp1252NullTerminated = buffer.readStringCp1252NullTerminated((byte)0);
                    final String stringCp1252NullTerminated2 = buffer.readStringCp1252NullTerminated((byte)0);
                    int int1 = 0;
                    if (ra != 0) {
                        int1 = buffer.readInt(-1376488618);
                    }
                    reflectionCheck.operations[i] = ra;
                    reflectionCheck.intReplaceValues[i] = int1;
                    if (class33.method152(stringCp1252NullTerminated, 1287997626).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    reflectionCheck.field158[i] = class33.method152(stringCp1252NullTerminated, 1118453323).getDeclaredField(stringCp1252NullTerminated2);
                }
                else if (3 == ra || 4 == ra) {
                    final String stringCp1252NullTerminated3 = buffer.readStringCp1252NullTerminated((byte)0);
                    final String stringCp1252NullTerminated4 = buffer.readStringCp1252NullTerminated((byte)0);
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    final String[] array = new String[ra2];
                    for (int j = 0; j < ra2; ++j) {
                        array[j] = buffer.readStringCp1252NullTerminated((byte)0);
                    }
                    final String stringCp1252NullTerminated5 = buffer.readStringCp1252NullTerminated((byte)0);
                    final byte[][] array2 = new byte[ra2][];
                    if (ra == 3) {
                        for (int k = 0; k < ra2; ++k) {
                            final int int2 = buffer.readInt(-1437229668);
                            Buffer.io(buffer, array2[k] = new byte[int2], 0, int2, -1570744551);
                        }
                    }
                    reflectionCheck.operations[i] = ra;
                    final Class[] array3 = new Class[ra2];
                    for (int l = 0; l < ra2; ++l) {
                        array3[l] = class33.method152(array[l], 1620841152);
                    }
                    final Class method152 = class33.method152(stringCp1252NullTerminated5, 1114254348);
                    if (class33.method152(stringCp1252NullTerminated3, 1351533558).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    final Method[] declaredMethods = class33.method152(stringCp1252NullTerminated3, 2062334865).getDeclaredMethods();
                    for (int n2 = 0; n2 < declaredMethods.length; ++n2) {
                        final Method method153 = declaredMethods[n2];
                        if (method153.getName().equals(stringCp1252NullTerminated4)) {
                            final Class<?>[] parameterTypes = method153.getParameterTypes();
                            if (parameterTypes.length == array3.length) {
                                boolean b = true;
                                for (int n3 = 0; n3 < array3.length; ++n3) {
                                    if (array3[n3] != parameterTypes[n3]) {
                                        b = false;
                                        break;
                                    }
                                }
                                if (b && method152 == method153.getReturnType()) {
                                    reflectionCheck.methods[i] = method153;
                                }
                            }
                        }
                    }
                    reflectionCheck.arguments[i] = array2;
                }
            }
            catch (ClassNotFoundException ex) {
                reflectionCheck.creationErrors[i] = -1;
            }
            catch (SecurityException ex2) {
                reflectionCheck.creationErrors[i] = -2;
            }
            catch (NullPointerException ex3) {
                reflectionCheck.creationErrors[i] = -3;
            }
            catch (Exception ex4) {
                reflectionCheck.creationErrors[i] = -4;
            }
            catch (Throwable t) {
                reflectionCheck.creationErrors[i] = -5;
            }
        }
        class36.reflectionChecks.addFirst(reflectionCheck);
    }
    
    public static void aq(final Buffer buffer, final int n) {
        final ReflectionCheck reflectionCheck = new ReflectionCheck();
        reflectionCheck.size = Buffer.ra(buffer, (byte)7) * 16276435;
        reflectionCheck.id = buffer.readInt(-1766033006) * 711502553;
        reflectionCheck.operations = new int[-153242533 * reflectionCheck.size];
        reflectionCheck.creationErrors = new int[reflectionCheck.size * -153242533];
        reflectionCheck.field158 = new Field[-153242533 * reflectionCheck.size];
        reflectionCheck.intReplaceValues = new int[reflectionCheck.size * -153242533];
        reflectionCheck.methods = new Method[reflectionCheck.size * -153242533];
        reflectionCheck.arguments = new byte[-153242533 * reflectionCheck.size][][];
        for (int i = 0; i < reflectionCheck.size * -153242533; ++i) {
            try {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0 || ra == 1 || 2 == ra) {
                    final String stringCp1252NullTerminated = buffer.readStringCp1252NullTerminated((byte)0);
                    final String stringCp1252NullTerminated2 = buffer.readStringCp1252NullTerminated((byte)0);
                    int int1 = 0;
                    if (ra != 0) {
                        int1 = buffer.readInt(-891976923);
                    }
                    reflectionCheck.operations[i] = ra;
                    reflectionCheck.intReplaceValues[i] = int1;
                    if (class33.method152(stringCp1252NullTerminated, 2032569480).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    reflectionCheck.field158[i] = class33.method152(stringCp1252NullTerminated, 1744867594).getDeclaredField(stringCp1252NullTerminated2);
                }
                else if (3 == ra || 4 == ra) {
                    final String stringCp1252NullTerminated3 = buffer.readStringCp1252NullTerminated((byte)0);
                    final String stringCp1252NullTerminated4 = buffer.readStringCp1252NullTerminated((byte)0);
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    final String[] array = new String[ra2];
                    for (int j = 0; j < ra2; ++j) {
                        array[j] = buffer.readStringCp1252NullTerminated((byte)0);
                    }
                    final String stringCp1252NullTerminated5 = buffer.readStringCp1252NullTerminated((byte)0);
                    final byte[][] array2 = new byte[ra2][];
                    if (ra == 3) {
                        for (int k = 0; k < ra2; ++k) {
                            final int int2 = buffer.readInt(-2034506740);
                            Buffer.io(buffer, array2[k] = new byte[int2], 0, int2, -1570744551);
                        }
                    }
                    reflectionCheck.operations[i] = ra;
                    final Class[] array3 = new Class[ra2];
                    for (int l = 0; l < ra2; ++l) {
                        array3[l] = class33.method152(array[l], 1509587765);
                    }
                    final Class method152 = class33.method152(stringCp1252NullTerminated5, 1662469473);
                    if (class33.method152(stringCp1252NullTerminated3, 1472762885).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    final Method[] declaredMethods = class33.method152(stringCp1252NullTerminated3, 2133027428).getDeclaredMethods();
                    for (int n2 = 0; n2 < declaredMethods.length; ++n2) {
                        final Method method153 = declaredMethods[n2];
                        if (method153.getName().equals(stringCp1252NullTerminated4)) {
                            final Class<?>[] parameterTypes = method153.getParameterTypes();
                            if (parameterTypes.length == array3.length) {
                                boolean b = true;
                                for (int n3 = 0; n3 < array3.length; ++n3) {
                                    if (array3[n3] != parameterTypes[n3]) {
                                        b = false;
                                        break;
                                    }
                                }
                                if (b && method152 == method153.getReturnType()) {
                                    reflectionCheck.methods[i] = method153;
                                }
                            }
                        }
                    }
                    reflectionCheck.arguments[i] = array2;
                }
            }
            catch (ClassNotFoundException ex) {
                reflectionCheck.creationErrors[i] = -1;
            }
            catch (SecurityException ex2) {
                reflectionCheck.creationErrors[i] = -2;
            }
            catch (NullPointerException ex3) {
                reflectionCheck.creationErrors[i] = -3;
            }
            catch (Exception ex4) {
                reflectionCheck.creationErrors[i] = -4;
            }
            catch (Throwable t) {
                reflectionCheck.creationErrors[i] = -5;
            }
        }
        class36.reflectionChecks.addFirst(reflectionCheck);
    }
    
    public static String[] wq(final class12 class12) {
        if (class12 == null) {
            class12.as();
        }
        return null;
    }
}
