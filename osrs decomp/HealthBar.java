// 
// Decompiled by Procyon v0.5.36
// 

public class HealthBar extends Node
{
    IterableNodeDeque updates;
    static IndexedSprite[] scrollBarSprites;
    HealthBarDefinition definition;
    static final int af = 4;
    static final int cr = 30;
    public static final int ae = 23;
    static final int an = 4;
    static final int bb = 19136992;
    
    HealthBar(final HealthBarDefinition definition) {
        this.updates = new IterableNodeDeque();
        this.definition = definition;
    }
    
    public static Node id(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.bv();
        }
        return iterableNodeDeque.method1979(null);
    }
    
    HealthBarUpdate at(final int n) {
        HealthBarUpdate healthBarUpdate = (HealthBarUpdate)this.updates.up();
        if (null == healthBarUpdate || -1225111563 * healthBarUpdate.cycle > n) {
            return null;
        }
        for (HealthBarUpdate healthBarUpdate2 = (HealthBarUpdate)this.updates.by(); null != healthBarUpdate2 && -1225111563 * healthBarUpdate2.cycle <= n; healthBarUpdate2 = (HealthBarUpdate)this.updates.by()) {
            healthBarUpdate.hw();
            healthBarUpdate = healthBarUpdate2;
        }
        if (this.definition.int5 * -407931959 + (-2116244499 * healthBarUpdate.cycleOffset + -1225111563 * healthBarUpdate.cycle) > n) {
            return healthBarUpdate;
        }
        healthBarUpdate.hw();
        return null;
    }
    
    boolean isEmpty(final int n) {
        try {
            return this.updates.method1971();
        }
        catch (RuntimeException ex) {
            throw get(ex, "db.aw(" + ')');
        }
    }
    
    HealthBarUpdate al(final int n) {
        HealthBarUpdate healthBarUpdate = (HealthBarUpdate)this.updates.up();
        if (null == healthBarUpdate || -1225111563 * healthBarUpdate.cycle > n) {
            return null;
        }
        for (HealthBarUpdate healthBarUpdate2 = (HealthBarUpdate)this.updates.by(); null != healthBarUpdate2 && 810363171 * healthBarUpdate2.cycle <= n; healthBarUpdate2 = (HealthBarUpdate)this.updates.by()) {
            healthBarUpdate.hw();
            healthBarUpdate = healthBarUpdate2;
        }
        if (this.definition.int5 * -1132759969 + (-2116244499 * healthBarUpdate.cycleOffset + -1225111563 * healthBarUpdate.cycle) > n) {
            return healthBarUpdate;
        }
        healthBarUpdate.hw();
        return null;
    }
    
    public static RunException get(final Throwable t, final String str) {
        try {
            RunException ex;
            if (t instanceof RunException) {
                ex = (RunException)t;
                final StringBuilder sb = new StringBuilder();
                final RunException ex2 = ex;
                ex2.field4179 = sb.append(ex2.field4179).append(' ').append(str).toString();
            }
            else {
                ex = new RunException(t, str);
            }
            return ex;
        }
        catch (RuntimeException ex3) {
            throw get(ex3, "db.an(" + ')');
        }
    }
    
    HealthBarUpdate get(final int n, final byte b) {
        try {
            HealthBarUpdate healthBarUpdate = (HealthBarUpdate)this.updates.ae();
            if (null != healthBarUpdate) {
                if (b >= 13) {
                    throw new IllegalStateException();
                }
                if (-1225111563 * healthBarUpdate.cycle > n) {
                    if (b >= 13) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    for (HealthBarUpdate healthBarUpdate2 = (HealthBarUpdate)this.updates.by(); null != healthBarUpdate2; healthBarUpdate2 = (HealthBarUpdate)this.updates.by()) {
                        if (b >= 13) {
                            throw new IllegalStateException();
                        }
                        if (-1225111563 * healthBarUpdate2.cycleOffset > n) {
                            break;
                        }
                        healthBarUpdate.remove();
                        healthBarUpdate = healthBarUpdate2;
                    }
                    if (this.definition.int2 * -407931959 + (-2116244499 * healthBarUpdate.cycle + -1225111563 * healthBarUpdate.cycleOffset) <= n) {
                        healthBarUpdate.gh();
                        return null;
                    }
                    if (b >= 13) {
                        throw new IllegalStateException();
                    }
                    return healthBarUpdate;
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw get(ex, "db.an(" + ')');
        }
    }
    
    public static void qt(final HealthBar healthBar, final int n, final int n2, final int n3, final int n4) {
        if (healthBar == null) {
            healthBar.isEmpty(n);
        }
        Node node = null;
        int n5 = 0;
        for (HealthBarUpdate healthBarUpdate = (HealthBarUpdate)healthBar.updates.up(); healthBarUpdate != null; healthBarUpdate = (HealthBarUpdate)healthBar.updates.by()) {
            ++n5;
            if (-1225111563 * healthBarUpdate.cycle == n) {
                healthBarUpdate.set(n, n2, n3, n4, -47609229);
                return;
            }
            if (-1225111563 * healthBarUpdate.cycle <= n) {
                node = healthBarUpdate;
            }
        }
        if (node == null) {
            if (n5 < 4) {
                healthBar.updates.addLast(new HealthBarUpdate(n, n2, n3, n4));
            }
            return;
        }
        IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(n, n2, n3, n4), node);
        if (n5 >= 4) {
            healthBar.updates.up().hw();
        }
    }
    
    public static HealthBarUpdate lx(final HealthBar healthBar, final int n, final byte b) {
        if (healthBar == null) {
            healthBar.get(n, b);
        }
        try {
            HealthBarUpdate healthBarUpdate = (HealthBarUpdate)healthBar.updates.up();
            if (null != healthBarUpdate) {
                if (b >= 13) {
                    throw new IllegalStateException();
                }
                if (-1225111563 * healthBarUpdate.cycle > n) {
                    if (b >= 13) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    for (HealthBarUpdate healthBarUpdate2 = (HealthBarUpdate)healthBar.updates.by(); null != healthBarUpdate2; healthBarUpdate2 = (HealthBarUpdate)healthBar.updates.by()) {
                        if (b >= 13) {
                            throw new IllegalStateException();
                        }
                        if (-1225111563 * healthBarUpdate2.cycle > n) {
                            break;
                        }
                        healthBarUpdate.hw();
                        healthBarUpdate = healthBarUpdate2;
                    }
                    if (healthBar.definition.int5 * -407931959 + (-2116244499 * healthBarUpdate.cycleOffset + -1225111563 * healthBarUpdate.cycle) <= n) {
                        healthBarUpdate.hw();
                        return null;
                    }
                    if (b >= 13) {
                        throw new IllegalStateException();
                    }
                    return healthBarUpdate;
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw get(ex, "db.an(" + ')');
        }
    }
    
    public IterableNodeDeque vc() {
        return this.updates;
    }
    
    void au(final int n, final int n2, final int n3, final int n4) {
        Node node = null;
        int n5 = 0;
        for (HealthBarUpdate healthBarUpdate = (HealthBarUpdate)this.updates.up(); healthBarUpdate != null; healthBarUpdate = (HealthBarUpdate)this.updates.by()) {
            ++n5;
            if (-1225111563 * healthBarUpdate.cycle == n) {
                healthBarUpdate.set(n, n2, n3, n4, 1770613359);
                return;
            }
            if (-1225111563 * healthBarUpdate.cycle <= n) {
                node = healthBarUpdate;
            }
        }
        if (node == null) {
            if (n5 < 4) {
                this.updates.addLast(new HealthBarUpdate(n, n2, n3, n4));
            }
            return;
        }
        IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(n, n2, n3, n4), node);
        if (n5 >= 4) {
            this.updates.up().hw();
        }
    }
    
    boolean aa() {
        return this.updates.method1971();
    }
    
    void put(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            Node node = null;
            int n6 = 0;
            HealthBarUpdate healthBarUpdate = (HealthBarUpdate)this.updates.up();
            while (healthBarUpdate != null) {
                if (n5 != -869970014) {
                    return;
                }
                ++n6;
                if (-1225111563 * healthBarUpdate.cycle == n) {
                    if (n5 != -869970014) {
                        return;
                    }
                    healthBarUpdate.set(n, n2, n3, n4, 470045969);
                    return;
                }
                else {
                    if (-1225111563 * healthBarUpdate.cycle <= n) {
                        if (n5 != -869970014) {
                            throw new IllegalStateException();
                        }
                        node = healthBarUpdate;
                    }
                    healthBarUpdate = (HealthBarUpdate)this.updates.by();
                }
            }
            if (node != null) {
                IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(n, n2, n3, n4), node);
                if (n6 >= 4) {
                    if (n5 != -869970014) {
                        throw new IllegalStateException();
                    }
                    this.updates.up().hw();
                }
                return;
            }
            if (n5 != -869970014) {
                return;
            }
            if (n6 < 4) {
                if (n5 != -869970014) {
                    throw new IllegalStateException();
                }
                this.updates.addLast(new HealthBarUpdate(n, n2, n3, n4));
            }
        }
        catch (RuntimeException ex) {
            throw get(ex, "db.af(" + ')');
        }
    }
    
    public HealthBarDefinition wv() {
        return this.definition;
    }
    
    public static HealthBarUpdate rk(final HealthBar healthBar, final int n) {
        HealthBarUpdate healthBarUpdate = (HealthBarUpdate)healthBar.updates.up();
        if (null == healthBarUpdate || -1225111563 * healthBarUpdate.cycle > n) {
            return null;
        }
        for (HealthBarUpdate healthBarUpdate2 = (HealthBarUpdate)healthBar.updates.by(); null != healthBarUpdate2 && -1225111563 * healthBarUpdate2.cycle <= n; healthBarUpdate2 = (HealthBarUpdate)healthBar.updates.by()) {
            healthBarUpdate.hw();
            healthBarUpdate = healthBarUpdate2;
        }
        if (healthBar.definition.int5 * -407931959 + (-2116244499 * healthBarUpdate.cycleOffset + -1225111563 * healthBarUpdate.cycle) > n) {
            return healthBarUpdate;
        }
        healthBarUpdate.hw();
        return null;
    }
    
    public static void jg(final HealthBar healthBar, final int n, final int n2, final int n3, final int n4) {
        if (healthBar == null) {
            healthBar.wv();
        }
        Node node = null;
        int n5 = 0;
        for (HealthBarUpdate healthBarUpdate = (HealthBarUpdate)healthBar.updates.up(); healthBarUpdate != null; healthBarUpdate = (HealthBarUpdate)healthBar.updates.by()) {
            ++n5;
            if (-1225111563 * healthBarUpdate.cycle == n) {
                healthBarUpdate.set(n, n2, n3, n4, 71945091);
                return;
            }
            if (-1225111563 * healthBarUpdate.cycle <= n) {
                node = healthBarUpdate;
            }
        }
        if (node == null) {
            if (n5 < 4) {
                healthBar.updates.addLast(new HealthBarUpdate(n, n2, n3, n4));
            }
            return;
        }
        IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(n, n2, n3, n4), node);
        if (n5 >= 4) {
            healthBar.updates.up().hw();
        }
    }
}
