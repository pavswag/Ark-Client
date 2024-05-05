import java.applet.Applet;

// 
// Decompiled by Procyon v0.5.36
// 

final class class100 implements class308
{
    static final int dn = 20;
    static final int bp = 64;
    public static Applet RunException_applet;
    public static final int au = 5000;
    final /* synthetic */ Widget val$cc;
    public static int musicTrackVolume;
    
    class100(final Widget val$cc) {
        this.val$cc = val$cc;
    }
    
    public static void cj(final AbstractFont abstractFont, final String s, final int n) {
        if (abstractFont == null) {
            abstractFont.drawAlpha(s, n, n, n, n, n);
            return;
        }
        int n2 = 0;
        boolean b = false;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<') {
                b = true;
            }
            else if (char1 == '>') {
                b = false;
            }
            else if (!b && char1 == ' ') {
                ++n2;
            }
        }
        if (n2 > 0) {
            AbstractFont.AbstractFont_justificationTotal = (n - abstractFont.bf(s) << 8) / n2;
        }
    }
    
    public static String up(final class166 class166) {
        if (class166 == null) {
            class166.bs();
        }
        return class166.field1420;
    }
    
    @Override
    public void aw() {
        if (null != this.val$cc && this.val$cc.method1818(-349881345).field2826 != null) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, this.val$cc, (byte)76);
            scriptEvent.setArgs(this.val$cc.method1818(-643683558).field2826, 156485899);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)22).addFirst(scriptEvent);
        }
    }
    
    public static KitDefinition KitDefinition_get(final int n, final int n2) {
        try {
            final KitDefinition kitDefinition = (KitDefinition)KitDefinition.KitDefinition_cached.wr(n);
            if (null != kitDefinition) {
                return kitDefinition;
            }
            final byte[] takeFile = KitDefinition.KitDefinition_archive.takeFile(3, n, (byte)(-56));
            final KitDefinition kitDefinition2 = new KitDefinition();
            if (null != takeFile) {
                if (n2 == -1760696604) {
                    throw new IllegalStateException();
                }
                kitDefinition2.decode(new Buffer(takeFile), -1026746832);
            }
            KitDefinition.KitDefinition_cached.put(kitDefinition2, n);
            return kitDefinition2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dn.an(" + ')');
        }
    }
    
    public void KitDefinition_get() {
        if (null != this.val$cc && this.val$cc.method1818(-749241366).field2826 != null) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, this.val$cc, (byte)(-60));
            scriptEvent.setArgs(this.val$cc.method1818(-289036109).field2826, -102328987);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)111).addFirst(scriptEvent);
        }
    }
    
    static void savePreferences(final byte b) {
        try {
            final AccessFile rn = ScriptFrame.client.rn("", "oldscape", true);
            try {
                final Buffer mc = ScriptFrame.client.fi().mc();
                rn.xs(mc.vj(), 0, mc.fa());
            }
            finally {
                rn.fu(true);
            }
        }
        catch (Exception ex) {
            Client.nw.error("error saving preferences", (Throwable)ex);
        }
    }
    
    public void savePreferences() {
        if (null != this.val$cc && this.val$cc.method1818(-1070523667).field2826 != null) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, this.val$cc, (byte)(-23));
            scriptEvent.setArgs(this.val$cc.method1818(-898082793).field2826, 1579897951);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)109).addFirst(scriptEvent);
        }
    }
    
    @Override
    public void au() {
        if (null != this.val$cc && this.val$cc.method1818(-814835966).field2826 != null) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, this.val$cc, (byte)(-18));
            scriptEvent.setArgs(this.val$cc.method1818(-922215222).field2826, -30637855);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)116).addFirst(scriptEvent);
        }
    }
    
    public static byte vmethod5708(final char c, final byte b) {
        try {
            if (c > '\0') {
                if (c < '\u0080') {
                    return (byte)c;
                }
                if (b == 4) {
                    throw new IllegalStateException();
                }
            }
            if (c >= ' ') {
                if (b == 4) {
                    throw new IllegalStateException();
                }
                if (c <= '\u00ff') {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return (byte)c;
                }
            }
            if ('\u20ac' == c) {
                if (b == 4) {
                    throw new IllegalStateException();
                }
                return -128;
            }
            else if (c == '\u201a') {
                if (b == 4) {
                    throw new IllegalStateException();
                }
                return -126;
            }
            else if ('\u0192' == c) {
                if (b == 4) {
                    throw new IllegalStateException();
                }
                return -125;
            }
            else {
                if ('\u201e' == c) {
                    return -124;
                }
                if ('\u2026' == c) {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -123;
                }
                else if (c == '\u2020') {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -122;
                }
                else if ('\u2021' == c) {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -121;
                }
                else if (c == '\u02c6') {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -120;
                }
                else if (c == '\u2030') {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -119;
                }
                else if (c == '\u0160') {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -118;
                }
                else if (c == '\u2039') {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -117;
                }
                else if (c == '\u0152') {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -116;
                }
                else if ('\u017d' == c) {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -114;
                }
                else if ('\u2018' == c) {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    return -111;
                }
                else {
                    if ('\u2019' == c) {
                        return -110;
                    }
                    if (c == '\u201c') {
                        if (b == 4) {
                            throw new IllegalStateException();
                        }
                        return -109;
                    }
                    else if (c == '\u201d') {
                        if (b == 4) {
                            throw new IllegalStateException();
                        }
                        return -108;
                    }
                    else {
                        if (c == '\u2022') {
                            return -107;
                        }
                        if ('\u2013' == c) {
                            return -106;
                        }
                        if (c == '\u2014') {
                            if (b == 4) {
                                throw new IllegalStateException();
                            }
                            return -105;
                        }
                        else if ('\u02dc' == c) {
                            if (b == 4) {
                                throw new IllegalStateException();
                            }
                            return -104;
                        }
                        else if (c == '\u2122') {
                            if (b == 4) {
                                throw new IllegalStateException();
                            }
                            return -103;
                        }
                        else if (c == '\u0161') {
                            if (b == 4) {
                                throw new IllegalStateException();
                            }
                            return -102;
                        }
                        else if ('\u203a' == c) {
                            if (b == 4) {
                                throw new IllegalStateException();
                            }
                            return -101;
                        }
                        else if (c == '\u0153') {
                            if (b == 4) {
                                throw new IllegalStateException();
                            }
                            return -100;
                        }
                        else if ('\u017e' == c) {
                            if (b == 4) {
                                throw new IllegalStateException();
                            }
                            return -98;
                        }
                        else {
                            if ('\u0178' == c) {
                                return -97;
                            }
                            return 63;
                        }
                    }
                }
            }
            return (byte)c;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dn.af(" + ')');
        }
    }
    
    @Override
    public void vmethod5708(final int n) {
        try {
            if (null != this.val$cc) {
                if (n != 427135973) {
                    throw new IllegalStateException();
                }
                if (this.val$cc.method1818(-2014844391).field2826 != null) {
                    if (n != 427135973) {
                        throw new IllegalStateException();
                    }
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    ScriptEvent.sd(scriptEvent, this.val$cc, (byte)49);
                    scriptEvent.setArgs(this.val$cc.method1818(-975794212).field2826, 1928431801);
                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)66).addFirst(scriptEvent);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dn.af(" + ')');
        }
    }
}
