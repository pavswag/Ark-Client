import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

class class397 implements Comparator
{
    final /* synthetic */ class398 this$0;
    static int field3691;
    
    class397(final class398 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pg.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return ov(this, (class399)o, (class399)o2, 386384998);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pg.compare(" + ')');
        }
    }
    
    public static int ov(final class397 class397, final class399 class398, final class399 class399, final int n) {
        if (class397 == null) {
            class397.method2119(class398, class398, n);
        }
        try {
            if (3457501928509627443L * class398.field3701 > 3457501928509627443L * class399.field3701) {
                if (n <= 165800406) {
                    throw new IllegalStateException();
                }
                return 1;
            }
            else {
                if (3457501928509627443L * class398.field3701 < 3457501928509627443L * class399.field3701) {
                    return -1;
                }
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pg.af(" + ')');
        }
    }
    
    public static int cn(final class397 class397, final class399 class398, final class399 class399) {
        if (class397 == null) {
            class397.aw(class398, class398);
        }
        if (3457501928509627443L * class398.field3701 > 3457501928509627443L * class399.field3701) {
            return 1;
        }
        if (3457501928509627443L * class398.field3701 < 3457501928509627443L * class399.field3701) {
            return -1;
        }
        return 0;
    }
    
    int at(final class399 class399, final class399 class400) {
        if (3457501928509627443L * class399.field3701 > 3457501928509627443L * class400.field3701) {
            return 1;
        }
        if (3457501928509627443L * class399.field3701 < 3457501928509627443L * class400.field3701) {
            return -1;
        }
        return 0;
    }
    
    int aw(final class399 class399, final class399 class400) {
        if (3457501928509627443L * class399.field3701 > 3457501928509627443L * class400.field3701) {
            return 1;
        }
        if (3457501928509627443L * class399.field3701 < 3457501928509627443L * class400.field3701) {
            return -1;
        }
        return 0;
    }
    
    public int al(final Object o, final Object o2) {
        return ov(this, (class399)o, (class399)o2, 990010626);
    }
    
    int ac(final class399 class399, final class399 class400) {
        if (3457501928509627443L * class399.field3701 > 3457501928509627443L * class400.field3701) {
            return 1;
        }
        if (3457501928509627443L * class399.field3701 < 3457501928509627443L * class400.field3701) {
            return -1;
        }
        return 0;
    }
    
    public boolean gk(final Object obj) {
        return super.equals(obj);
    }
    
    public int au(final Object o, final Object o2) {
        return ov(this, (class399)o, (class399)o2, 2015069283);
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    int method2119(final class399 class399, final class399 class400, final int n) {
        try {
            if (3457501928509627443L * class399.field3701 > 3457501928509627443L * class400.field3701) {
                if (n <= 165800406) {
                    throw new IllegalStateException();
                }
                return 1;
            }
            else {
                if (3457501928509627443L * class399.field3702 < 3457501928509627443L * class400.field3702) {
                    return -1;
                }
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pg.af(" + ')');
        }
    }
    
    public static String method2119(final CharSequence charSequence, final int n) {
        try {
            final int length = charSequence.length();
            final StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; ++i) {
                final char char1 = charSequence.charAt(i);
                Label_0258: {
                    if (char1 >= 'a') {
                        if (n <= 1423380424) {
                            throw new IllegalStateException();
                        }
                        if (char1 <= 'z') {
                            break Label_0258;
                        }
                        if (n <= 1423380424) {
                            throw new IllegalStateException();
                        }
                    }
                    if (char1 >= 'A') {
                        if (n <= 1423380424) {
                            throw new IllegalStateException();
                        }
                        if (char1 <= 'Z') {
                            break Label_0258;
                        }
                        if (n <= 1423380424) {
                            throw new IllegalStateException();
                        }
                    }
                    if (char1 >= '0') {
                        if (n <= 1423380424) {
                            throw new IllegalStateException();
                        }
                        if (char1 <= '9') {
                            break Label_0258;
                        }
                    }
                    if ('.' != char1 && char1 != '-' && '*' != char1) {
                        if (n <= 1423380424) {
                            throw new IllegalStateException();
                        }
                        if ('_' == char1) {
                            if (n <= 1423380424) {
                                throw new IllegalStateException();
                            }
                        }
                        else if (' ' == char1) {
                            if (n <= 1423380424) {
                                throw new IllegalStateException();
                            }
                            sb.append('+');
                            continue;
                        }
                        else {
                            final byte vmethod5708 = class100.vmethod5708(char1, (byte)(-20));
                            sb.append('%');
                            final int n2 = vmethod5708 >> 4 & 0xF;
                            if (n2 >= 10) {
                                if (n <= 1423380424) {
                                    throw new IllegalStateException();
                                }
                                sb.append((char)(n2 + 55));
                            }
                            else {
                                sb.append((char)(48 + n2));
                            }
                            final int n3 = vmethod5708 & 0xF;
                            if (n3 < 10) {
                                sb.append((char)(n3 + 48));
                                continue;
                            }
                            if (n <= 1423380424) {
                                throw new IllegalStateException();
                            }
                            sb.append((char)(55 + n3));
                            continue;
                        }
                    }
                }
                sb.append(char1);
            }
            return sb.toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pg.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return ov(this, (class399)o, (class399)o2, 719017983);
    }
    
    public boolean gm(final Object obj) {
        return super.equals(obj);
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
}
