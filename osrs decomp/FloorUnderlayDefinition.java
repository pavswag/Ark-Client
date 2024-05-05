// 
// Decompiled by Procyon v0.5.36
// 

public class FloorUnderlayDefinition extends DualNode
{
    static final int sd = 2160;
    int rgb;
    public int hue;
    public static AbstractArchive FloorUnderlayDefinition_archive;
    public int saturation;
    public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
    public int hueMultiplier;
    public int lightness;
    static int field1642;
    static Archive archive11;
    static final int mr = 1;
    static PrivateChatMode privateChatMode;
    
    public FloorUnderlayDefinition() {
        this.rgb = 0;
    }
    
    static {
        FloorUnderlayDefinition.FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
    }
    
    public void ao() {
        this.setHsl(this.rgb * 86825461, -2063363905);
    }
    
    void av(final Buffer buffer, final int n, final int n2) {
        if (n == 1) {
            this.rgb = buffer.readMedium(-1655542395) * 1952729693;
        }
    }
    
    public static void as() {
        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
    }
    
    public void ax(final Buffer buffer, final int n) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, n, (byte)(-74));
        }
    }
    
    public void ay() {
        this.setHsl(this.rgb * 86825461, -2063363905);
    }
    
    public int bt() {
        return this.hueMultiplier * -2012234183;
    }
    
    public static String decode(long n) {
        try {
            if (n <= 0L || n >= 6582952005840035281L) {
                return null;
            }
            if (n % 37L == 0L) {
                return null;
            }
            int capacity = 0;
            for (long n2 = n; 0L != n2; n2 /= 37L) {
                ++capacity;
            }
            final StringBuilder sb = new StringBuilder(capacity);
            while (0L != n) {
                final long n3 = n;
                n /= 37L;
                char c = class373.base37Table[(int)(n3 - n * 37L)];
                if ('_' == c) {
                    final int n4 = sb.length() - 1;
                    sb.setCharAt(n4, Character.toUpperCase(sb.charAt(n4)));
                    c = ' ';
                }
                sb.append(c);
            }
            sb.reverse();
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            return sb.toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hr.aw(" + ')');
        }
    }
    
    public void decode(final Buffer buffer, final int n, final int n2) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, n, (byte)(-64));
            }
            if (n2 >= -1642659271) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hr.aw(" + ')');
        }
    }
    
    public void al() {
        this.setHsl(this.rgb * 1052940758, -2063363905);
    }
    
    public void postDecode(final int n) {
        try {
            this.setHsl(this.rgb * 86825461, -2063363905);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hr.an(" + ')');
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2, final byte b) {
        try {
            if (n == 1) {
                if (b >= 8) {
                    throw new IllegalStateException();
                }
                this.rgb = buffer.readMedium(407373802) * 1952729693;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hr.ac(" + ')');
        }
    }
    
    public int um() {
        return this.lightness * -1527986335;
    }
    
    public static void setHsl(final int n) {
        try {
            class475.midiPcmStream.clear((byte)37);
            class297.musicPlayerStatus = -626822165;
            class297.musicTrackArchive = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hr.au(" + ')');
        }
    }
    
    void setHsl(final int n, final int n2) {
        try {
            final double n3 = (n >> 16 & 0xFF) / 256.0;
            final double n4 = (n >> 8 & 0xFF) / 256.0;
            final double n5 = (n & 0xFF) / 256.0;
            double n6 = n3;
            if (n4 < n6) {
                if (n2 != -2063363905) {
                    throw new IllegalStateException();
                }
                n6 = n4;
            }
            if (n5 < n6) {
                if (n2 != -2063363905) {
                    return;
                }
                n6 = n5;
            }
            double n7 = n3;
            if (n4 > n7) {
                if (n2 != -2063363905) {
                    throw new IllegalStateException();
                }
                n7 = n4;
            }
            if (n5 > n7) {
                if (n2 != -2063363905) {
                    throw new IllegalStateException();
                }
                n7 = n5;
            }
            double n8 = 0.0;
            double n9 = 0.0;
            final double n10 = (n7 + n6) / 2.0;
            if (n6 != n7) {
                if (n2 != -2063363905) {
                    throw new IllegalStateException();
                }
                if (n10 < 0.5) {
                    if (n2 != -2063363905) {
                        throw new IllegalStateException();
                    }
                    n9 = (n7 - n6) / (n6 + n7);
                }
                if (n10 >= 0.5) {
                    if (n2 != -2063363905) {
                        throw new IllegalStateException();
                    }
                    n9 = (n7 - n6) / (2.0 - n7 - n6);
                }
                if (n3 == n7) {
                    if (n2 != -2063363905) {
                        throw new IllegalStateException();
                    }
                    n8 = (n4 - n5) / (n7 - n6);
                }
                else if (n4 == n7) {
                    if (n2 != -2063363905) {
                        throw new IllegalStateException();
                    }
                    n8 = (n5 - n3) / (n7 - n6) + 2.0;
                }
                else if (n5 == n7) {
                    if (n2 != -2063363905) {
                        throw new IllegalStateException();
                    }
                    n8 = 4.0 + (n3 - n4) / (n7 - n6);
                }
            }
            final double n11 = n8 / 6.0;
            this.saturation = (int)(n9 * 256.0) * 479912699;
            this.lightness = (int)(n10 * 256.0) * 239606945;
            if (1058265139 * this.saturation < 0) {
                if (n2 != -2063363905) {
                    return;
                }
                this.saturation = 0;
            }
            else if (this.saturation * 1058265139 > 255) {
                if (n2 != -2063363905) {
                    return;
                }
                this.saturation = 2118653957;
            }
            if (this.lightness * -1527986335 < 0) {
                if (n2 != -2063363905) {
                    throw new IllegalStateException();
                }
                this.lightness = 0;
            }
            else if (-1527986335 * this.lightness > 255) {
                if (n2 != -2063363905) {
                    throw new IllegalStateException();
                }
                this.lightness = 970228831;
            }
            if (n10 > 0.5) {
                if (n2 != -2063363905) {
                    throw new IllegalStateException();
                }
                this.hueMultiplier = 335859721 * (int)((1.0 - n10) * n9 * 512.0);
            }
            else {
                this.hueMultiplier = (int)(512.0 * (n10 * n9)) * 335859721;
            }
            if (this.hueMultiplier * -2012234183 < 1) {
                if (n2 != -2063363905) {
                    throw new IllegalStateException();
                }
                this.hueMultiplier = 335859721;
            }
            this.hue = 1936467539 * (int)(this.hueMultiplier * -2012234183 * n11);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hr.au(" + ')');
        }
    }
    
    public void aa() {
        this.setHsl(this.rgb * 86825461, -2063363905);
    }
    
    public void ai(final Buffer buffer, final int n) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, n, (byte)(-78));
        }
    }
    
    void ar(final int n) {
        final double n2 = (n >> 16 & 0xFF) / 256.0;
        final double n3 = (n >> 8 & 0xFF) / 256.0;
        final double n4 = (n & 0xFF) / 256.0;
        double n5 = n2;
        if (n3 < n5) {
            n5 = n3;
        }
        if (n4 < n5) {
            n5 = n4;
        }
        double n6 = n2;
        if (n3 > n6) {
            n6 = n3;
        }
        if (n4 > n6) {
            n6 = n4;
        }
        double n7 = 0.0;
        double n8 = 0.0;
        final double n9 = (n6 + n5) / 2.0;
        if (n5 != n6) {
            if (n9 < 0.5) {
                n8 = (n6 - n5) / (n5 + n6);
            }
            if (n9 >= 0.5) {
                n8 = (n6 - n5) / (2.0 - n6 - n5);
            }
            if (n2 == n6) {
                n7 = (n3 - n4) / (n6 - n5);
            }
            else if (n3 == n6) {
                n7 = (n4 - n2) / (n6 - n5) + 2.0;
            }
            else if (n4 == n6) {
                n7 = 4.0 + (n2 - n3) / (n6 - n5);
            }
        }
        final double n10 = n7 / 6.0;
        this.saturation = (int)(n8 * 256.0) * 479912699;
        this.lightness = (int)(n9 * 256.0) * 239606945;
        if (1058265139 * this.saturation < 0) {
            this.saturation = 0;
        }
        else if (this.saturation * 1058265139 > 255) {
            this.saturation = 2118653957;
        }
        if (this.lightness * -1527986335 < 0) {
            this.lightness = 0;
        }
        else if (-1527986335 * this.lightness > 255) {
            this.lightness = 970228831;
        }
        if (n9 > 0.5) {
            this.hueMultiplier = 335859721 * (int)((1.0 - n9) * n8 * 512.0);
        }
        else {
            this.hueMultiplier = (int)(512.0 * (n9 * n8)) * 335859721;
        }
        if (this.hueMultiplier * -2012234183 < 1) {
            this.hueMultiplier = 335859721;
        }
        this.hue = 1936467539 * (int)(this.hueMultiplier * -2012234183 * n10);
    }
    
    public void kb() {
        this.postDecode(875414437);
    }
    
    public static void aq(final AbstractArchive floorUnderlayDefinition_archive) {
        FloorUnderlayDefinition.FloorUnderlayDefinition_archive = floorUnderlayDefinition_archive;
    }
    
    public static void aj() {
        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
    }
    
    public void ag(final Buffer buffer, final int n) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, n, (byte)4);
        }
    }
    
    public int jo() {
        return this.saturation * 1058265139;
    }
    
    void ah(final Buffer buffer, final int n, final int n2) {
        if (n == 1) {
            this.rgb = buffer.readMedium(170052587) * 1952729693;
        }
    }
    
    public void uj(final Buffer buffer, final int n) {
        this.decode(buffer, n, -2029421932);
    }
}
