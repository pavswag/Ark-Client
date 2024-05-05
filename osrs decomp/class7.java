import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.5.36
// 

public class class7
{
    static final int nx = 500;
    final Buffer field11;
    static final int aj = 21;
    final class3 field12;
    static int playerUUIDLength;
    Future field14;
    static TextureProvider textureProvider;
    ExecutorService field16;
    
    public class7(final Buffer field11, final class3 field12) {
        this.field16 = Executors.newSingleThreadExecutor();
        this.field11 = field11;
        this.field12 = field12;
        this.method23((short)32199);
    }
    
    static final void changeGameOptions(final int n, final int n2) {
        try {
            ClientPacket.process((byte)2);
            class18.method65(-254097069);
            final int n3 = GraphicsDefaults.decode(n, -786931729).type * -1911979431;
            if (n3 == 0) {
                if (n2 >= 2146313614) {
                    throw new IllegalStateException();
                }
            }
            else {
                final int n4 = Varps.Varps_main[n];
                if (n3 != 0) {
                    if (n2 >= 2146313614) {
                        throw new IllegalStateException();
                    }
                    if (n4 != 0) {
                        if (n2 >= 2146313614) {
                            return;
                        }
                        ScriptFrame.method341(0.9);
                    }
                    if (2 == n4) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        ScriptFrame.method341(0.8);
                    }
                    if (3 == n4) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        ScriptFrame.method341(0.7);
                    }
                    if (4 == n4) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        ScriptFrame.method341(0.6);
                    }
                }
                if (3 == n3) {
                    if (n4 == 0) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class86.method502(255, (byte)(-62));
                    }
                    if (n4 != 0) {
                        if (n2 >= 2146313614) {
                            return;
                        }
                        class86.method502(192, (byte)(-55));
                    }
                    if (2 == n4) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class86.method502(128, (byte)(-21));
                    }
                    if (n4 == 3) {
                        class86.method502(64, (byte)(-41));
                    }
                    if (4 == n4) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class86.method502(0, (byte)(-57));
                    }
                }
                if (n3 == 4) {
                    if (n4 == 0) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class130.method764(127, 625679186);
                    }
                    if (n4 != 0) {
                        if (n2 >= 2146313614) {
                            return;
                        }
                        class130.method764(96, 40756470);
                    }
                    if (n4 == 2) {
                        if (n2 >= 2146313614) {
                            return;
                        }
                        class130.method764(64, -404487349);
                    }
                    if (3 == n4) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class130.method764(32, -740425721);
                    }
                    if (n4 == 4) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class130.method764(0, 818165953);
                    }
                }
                if (n3 == 5) {
                    if (n2 >= 2146313614) {
                        throw new IllegalStateException();
                    }
                    boolean leftClickOpensMenu;
                    if (n4 != 0) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        leftClickOpensMenu = true;
                    }
                    else {
                        leftClickOpensMenu = false;
                    }
                    Client.leftClickOpensMenu = leftClickOpensMenu;
                }
                if (6 == n3) {
                    if (n2 >= 2146313614) {
                        throw new IllegalStateException();
                    }
                    Client.chatEffects = n4 * 1746693153;
                }
                if (n3 == 9 && n2 >= 2146313614) {
                    throw new IllegalStateException();
                }
                if (10 == n3) {
                    if (n2 >= 2146313614) {
                        throw new IllegalStateException();
                    }
                    if (n4 == 0) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class135.method783(127, (byte)0);
                    }
                    if (n4 != 0) {
                        if (n2 >= 2146313614) {
                            return;
                        }
                        class135.method783(96, (byte)0);
                    }
                    if (n4 == 2) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class135.method783(64, (byte)0);
                    }
                    if (n4 == 3) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        class135.method783(32, (byte)0);
                    }
                    if (4 == n4) {
                        class135.method783(0, (byte)0);
                    }
                }
                if (17 == n3) {
                    if (n2 >= 2146313614) {
                        throw new IllegalStateException();
                    }
                    Client.followerIndex = (n4 & 0xFFFF) * -1296642255;
                }
                if (n3 == 18) {
                    Client.playerAttackOption = (AttackOption)StructComposition.findEnumerated(UserComparator4.method685((byte)32), n4, (short)173);
                    if (Client.playerAttackOption == null) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
                    }
                }
                if (19 == n3) {
                    if (n2 >= 2146313614) {
                        throw new IllegalStateException();
                    }
                    if (-1 == n4) {
                        if (n2 >= 2146313614) {
                            return;
                        }
                        Client.combatTargetPlayerIndex = -1035820595;
                    }
                    else {
                        Client.combatTargetPlayerIndex = 1035820595 * (n4 & 0x7FF);
                    }
                }
                if (n3 == 22) {
                    if (n2 >= 2146313614) {
                        throw new IllegalStateException();
                    }
                    Client.npcAttackOption = (AttackOption)StructComposition.findEnumerated(UserComparator4.method685((byte)(-29)), n4, (short)173);
                    if (null == Client.npcAttackOption) {
                        if (n2 >= 2146313614) {
                            throw new IllegalStateException();
                        }
                        Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "al.md(" + ')');
        }
    }
    
    public Buffer ao() {
        try {
            return this.field14.get();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public void Widget_setKey() {
        this.field16.shutdown();
        this.field16 = null;
    }
    
    static final void Widget_setKey(final Widget widget, final int n, final byte[] array, final byte[] array2, final int n2) {
        try {
            if (widget.field2954 == null) {
                if (n2 <= -400791056) {
                    return;
                }
                if (null == array) {
                    return;
                }
                if (n2 <= -400791056) {
                    throw new IllegalStateException();
                }
                widget.field2954 = new byte[11][];
                widget.field2955 = new byte[11][];
                widget.field2936 = new int[11];
                widget.field2977 = new int[11];
            }
            if (null != (widget.field2954[n] = array)) {
                if (n2 <= -400791056) {
                    throw new IllegalStateException();
                }
                widget.fill = true;
            }
            else {
                widget.fill = false;
                int i = 0;
                while (i < widget.field2954.length) {
                    if (widget.field2954[i] != null) {
                        if (n2 <= -400791056) {
                            return;
                        }
                        widget.fill = true;
                        break;
                    }
                    else {
                        ++i;
                    }
                }
            }
            widget.field2955[n] = array2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "al.at(" + ')');
        }
    }
    
    public Buffer ax() {
        try {
            return this.field14.get();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public Buffer ay() {
        try {
            return this.field14.get();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public Buffer method22(final int n) {
        try {
            try {
                return this.field14.get();
            }
            catch (Exception ex2) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "al.aw(" + ')');
        }
    }
    
    static void method22(final double n, final int n2, final int n3, final int n4) {
        try {
            int n5 = 128 * n2;
            for (int i = n2; i < n3; ++i) {
                if (n4 >= -1886422207) {
                    throw new IllegalStateException();
                }
                final double n6 = (i >> 3) / 64.0 + 0.0078125;
                final double n7 = 0.0625 + (i & 0x7) / 8.0;
                for (int j = 0; j < 128; ++j) {
                    if (n4 >= -1886422207) {
                        throw new IllegalStateException();
                    }
                    double n11;
                    double n10;
                    double n9;
                    final double n8 = n9 = (n10 = (n11 = j / 128.0));
                    if (n7 != 0.0) {
                        if (n4 >= -1886422207) {
                            throw new IllegalStateException();
                        }
                        double n12;
                        if (n8 < 0.5) {
                            if (n4 >= -1886422207) {
                                throw new IllegalStateException();
                            }
                            n12 = n8 * (1.0 + n7);
                        }
                        else {
                            n12 = n7 + n8 - n7 * n8;
                        }
                        final double n13 = n8 * 2.0 - n12;
                        double n14 = n6 + 0.3333333333333333;
                        if (n14 > 1.0) {
                            if (n4 >= -1886422207) {
                                throw new IllegalStateException();
                            }
                            --n14;
                        }
                        final double n15 = n6;
                        double n16 = n6 - 0.3333333333333333;
                        if (n16 < 0.0) {
                            ++n16;
                        }
                        if (n14 * 6.0 < 1.0) {
                            if (n4 >= -1886422207) {
                                throw new IllegalStateException();
                            }
                            n11 = n14 * (6.0 * (n12 - n13)) + n13;
                        }
                        else if (2.0 * n14 < 1.0) {
                            if (n4 >= -1886422207) {
                                return;
                            }
                            n11 = n12;
                        }
                        else if (n14 * 3.0 < 2.0) {
                            if (n4 >= -1886422207) {
                                throw new IllegalStateException();
                            }
                            n11 = n13 + 6.0 * ((0.6666666666666666 - n14) * (n12 - n13));
                        }
                        else {
                            n11 = n13;
                        }
                        if (n15 * 6.0 < 1.0) {
                            if (n4 >= -1886422207) {
                                throw new IllegalStateException();
                            }
                            n10 = n13 + (n12 - n13) * 6.0 * n15;
                        }
                        else if (n15 * 2.0 < 1.0) {
                            if (n4 >= -1886422207) {
                                throw new IllegalStateException();
                            }
                            n10 = n12;
                        }
                        else if (n15 * 3.0 < 2.0) {
                            n10 = n13 + (n12 - n13) * (0.6666666666666666 - n15) * 6.0;
                        }
                        else {
                            n10 = n13;
                        }
                        if (6.0 * n16 < 1.0) {
                            n9 = n16 * ((n12 - n13) * 6.0) + n13;
                        }
                        else if (n16 * 2.0 < 1.0) {
                            n9 = n12;
                        }
                        else if (3.0 * n16 < 2.0) {
                            if (n4 >= -1886422207) {
                                return;
                            }
                            n9 = 6.0 * ((n12 - n13) * (0.6666666666666666 - n16)) + n13;
                        }
                        else {
                            n9 = n13;
                        }
                    }
                    int rasterizer3D_brighten = UrlRequest.Rasterizer3D_brighten(((int)(256.0 * n11) << 16) + ((int)(256.0 * n10) << 8) + (int)(256.0 * n9), n);
                    if (rasterizer3D_brighten == 0) {
                        if (n4 >= -1886422207) {
                            return;
                        }
                        rasterizer3D_brighten = (true ? 1 : 0);
                    }
                    Rasterizer3D.Rasterizer3D_colorPalette[n5++] = rasterizer3D_brighten;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "al.aw(" + ')');
        }
    }
    
    public void al() {
        this.field16.shutdown();
        this.field16 = null;
    }
    
    public void method21(final byte b) {
        try {
            this.field16.shutdown();
            this.field16 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "al.an(" + ')');
        }
    }
    
    void method23(final short n) {
        try {
            this.field14 = this.field16.submit((Callable<Object>)new class1(this, this.field11, this.field12));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "al.ac(" + ')');
        }
    }
    
    public static String[] ko(final class12 class12) {
        if (class12 == null) {
            class12.getSession();
        }
        return null;
    }
    
    public boolean au() {
        return this.field14.isDone();
    }
    
    public Buffer aa() {
        try {
            return this.field14.get();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    void ai() {
        this.field14 = this.field16.submit((Callable<Object>)new class1(this, this.field11, this.field12));
    }
    
    public boolean method25(final int n) {
        try {
            return this.field14.isDone();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "al.af(" + ')');
        }
    }
    
    public void ab() {
        this.field16.shutdown();
        this.field16 = null;
    }
    
    public void aq() {
        this.field16.shutdown();
        this.field16 = null;
    }
    
    void ag() {
        this.field14 = this.field16.submit((Callable<Object>)new class1(this, this.field11, this.field12));
    }
    
    public static void oy(final DemotingHashTable demotingHashTable, final long n) {
        if (demotingHashTable == null) {
            demotingHashTable.remove(n);
            return;
        }
        demotingHashTable.removeWrapper((Wrapper)demotingHashTable.hashTable.aa(n));
    }
}
