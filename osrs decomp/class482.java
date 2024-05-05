import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class class482 extends DualNode
{
    List field4037;
    public static final int aw = 0;
    class478[] field4038;
    public static final int an = 0;
    
    public class482(final AbstractArchive abstractArchive, final int n) {
        this.method2447(new Buffer(abstractArchive.takeFile(n, 0, (byte)(-99))), 1796406235);
    }
    
    public class482(final AbstractArchive abstractArchive, final int n, final int n2) {
        this.method2447(new Buffer(abstractArchive.takeFile(n, n2 + 1, (byte)(-3))), 1796406235);
    }
    
    public static void pt(final class482 class482, final Buffer buffer) {
        if (class482 == null) {
            class482.au(buffer);
        }
        final int method2514 = buffer.method2514((byte)63);
        class482.field4038 = new class478[method2514];
        class482.field4037 = new ArrayList(method2514);
        for (int i = 0; i < method2514; ++i) {
            class482.field4038[i] = (class478)StructComposition.findEnumerated(class478.method2432(-2058665988), Buffer.ra(buffer, (byte)7), (short)173);
            int method2515 = buffer.method2514((byte)(-17));
            final HashMap hashMap = new HashMap<Object, List>(method2515);
            while (method2515-- > 0) {
                final Object method2516 = class482.field4038[i].method2435(buffer, -1183771146);
                int method2517 = buffer.method2514((byte)40);
                final ArrayList<Integer> list = new ArrayList<Integer>();
                while (method2517-- > 0) {
                    list.add(buffer.method2514((byte)(-28)));
                }
                hashMap.put(method2516, list);
            }
            class482.field4037.add(i, hashMap);
        }
    }
    
    public List al(final Object o, int n) {
        if (n < 0) {
            n = 0;
        }
        return this.field4037.get(n).get(o);
    }
    
    public List method2448(final Object o, int n, final int n2) {
        try {
            if (n < 0) {
                if (n2 == 741589113) {
                    throw new IllegalStateException();
                }
                n = 0;
            }
            return this.field4037.get(n).get(o);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sk.an(" + ')');
        }
    }
    
    void ac(final Buffer buffer) {
        final int method2514 = buffer.method2514((byte)59);
        this.field4038 = new class478[method2514];
        this.field4037 = new ArrayList(method2514);
        for (int i = 0; i < method2514; ++i) {
            this.field4038[i] = (class478)StructComposition.findEnumerated(class478.method2432(-1716362927), Buffer.ra(buffer, (byte)7), (short)173);
            int method2515 = buffer.method2514((byte)108);
            final HashMap hashMap = new HashMap<Object, Object>(method2515);
            while (method2515-- > 0) {
                final Object method2516 = this.field4038[i].method2435(buffer, -1183771146);
                int method2517 = buffer.method2514((byte)13);
                final ArrayList<Integer> list = new ArrayList<Integer>();
                while (method2517-- > 0) {
                    list.add(buffer.method2514((byte)(-78)));
                }
                hashMap.put(method2516, list);
            }
            this.field4037.add(i, hashMap);
        }
    }
    
    void au(final Buffer buffer) {
        final int method2514 = buffer.method2514((byte)101);
        this.field4038 = new class478[method2514];
        this.field4037 = new ArrayList(method2514);
        for (int i = 0; i < method2514; ++i) {
            this.field4038[i] = (class478)StructComposition.findEnumerated(class478.method2432(-2004555617), Buffer.ra(buffer, (byte)7), (short)173);
            int method2515 = buffer.method2514((byte)34);
            final HashMap hashMap = new HashMap<Object, List>(method2515);
            while (method2515-- > 0) {
                final Object method2516 = this.field4038[i].method2435(buffer, -1183771146);
                int method2517 = buffer.method2514((byte)(-46));
                final ArrayList<Integer> list = new ArrayList<Integer>();
                while (method2517-- > 0) {
                    list.add(buffer.method2514((byte)57));
                }
                hashMap.put(method2516, list);
            }
            this.field4037.add(i, hashMap);
        }
    }
    
    public static List dx(final class482 class482, final Object o, int n) {
        if (class482 == null) {
            class482.method2448(o, n, n);
        }
        if (n < 0) {
            n = 0;
        }
        return class482.field4037.get(n).get(o);
    }
    
    public static List hw(final class482 class482, final Object o, int n) {
        if (class482 == null) {
            return class482.method2448(o, n, n);
        }
        if (n < 0) {
            n = 0;
        }
        return class482.field4037.get(n).get(o);
    }
    
    void method2447(final Buffer buffer, final int n) {
        try {
            final int method2514 = buffer.method2514((byte)(-7));
            this.field4038 = new class478[method2514];
            this.field4037 = new ArrayList(method2514);
            for (int i = 0; i < method2514; ++i) {
                if (n != 1796406235) {
                    throw new IllegalStateException();
                }
                this.field4038[i] = (class478)StructComposition.findEnumerated(class478.method2432(-1778958600), Buffer.ra(buffer, (byte)7), (short)173);
                int method2515 = buffer.method2514((byte)51);
                final HashMap hashMap = new HashMap<Object, List>(method2515);
                while (method2515-- > 0) {
                    if (n != 1796406235) {
                        return;
                    }
                    final Object method2516 = this.field4038[i].method2435(buffer, -1183771146);
                    int method2517 = buffer.method2514((byte)52);
                    final ArrayList<Integer> list = new ArrayList<Integer>();
                    while (method2517-- > 0) {
                        list.add(buffer.method2514((byte)(-89)));
                    }
                    hashMap.put(method2516, list);
                }
                this.field4037.add(i, hashMap);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sk.af(" + ')');
        }
    }
    
    void ab(final Buffer buffer) {
        final int method2514 = buffer.method2514((byte)(-80));
        this.field4038 = new class478[method2514];
        this.field4037 = new ArrayList(method2514);
        for (int i = 0; i < method2514; ++i) {
            this.field4038[i] = (class478)StructComposition.findEnumerated(class478.method2432(-1897493049), Buffer.ra(buffer, (byte)7), (short)173);
            int method2515 = buffer.method2514((byte)42);
            final HashMap hashMap = new HashMap<Object, Object>(method2515);
            while (method2515-- > 0) {
                final Object method2516 = this.field4038[i].method2435(buffer, -1183771146);
                int method2517 = buffer.method2514((byte)(-87));
                final ArrayList<Integer> list = new ArrayList<Integer>();
                while (method2517-- > 0) {
                    list.add(buffer.method2514((byte)(-100)));
                }
                hashMap.put(method2516, list);
            }
            this.field4037.add(i, hashMap);
        }
    }
    
    public List aq(final Object o, int n) {
        if (n < 0) {
            n = 0;
        }
        return this.field4037.get(n).get(o);
    }
}
