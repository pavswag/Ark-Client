// 
// Decompiled by Procyon v0.5.36
// 

public final class WorldMapSprite
{
    static final int dk = 5;
    static final int af = 4096;
    public static final int av = 33;
    static final int aw = 1;
    static final int ag = 16384;
    final int[] tileColors;
    static final int aq = 6;
    
    WorldMapSprite() {
        this.tileColors = new int[4096];
    }
    
    WorldMapSprite(final int[] tileColors) {
        this.tileColors = tileColors;
    }
    
    final int aw(final int n, final int n2) {
        return this.tileColors[64 * n2 + n];
    }
    
    final int an(final int n, final int n2) {
        return this.tileColors[64 * n2 + n];
    }
    
    final int ac(final int n, final int n2) {
        return this.tileColors[1037976743 * n2 + n];
    }
    
    public static void ji(final PacketWriter packetWriter) {
        if (packetWriter == null) {
            packetWriter.al();
            return;
        }
        packetWriter.packetBufferNodes.rsClear();
        packetWriter.bufferSize = 0;
    }
    
    public static int encodeStringCp1252(final CharSequence charSequence, final int n, final int n2, final byte[] array, final int n3, final byte b) {
        try {
            final int n4 = n2 - n;
            for (int i = 0; i < n4; ++i) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                final char char1 = charSequence.charAt(i + n);
                Label_0659: {
                    if (char1 > '\0') {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (char1 < '\u0080') {
                            break Label_0659;
                        }
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                    }
                    if (char1 >= ' ') {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (char1 <= '\u00ff') {
                            break Label_0659;
                        }
                    }
                    if (char1 == '\u20ac') {
                        array[i + n3] = -128;
                        continue;
                    }
                    if (char1 == '\u201a') {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        array[n3 + i] = -126;
                        continue;
                    }
                    else {
                        if ('\u0192' == char1) {
                            array[i + n3] = -125;
                            continue;
                        }
                        if (char1 == '\u201e') {
                            array[n3 + i] = -124;
                            continue;
                        }
                        if (char1 == '\u2026') {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            array[i + n3] = -123;
                            continue;
                        }
                        else if ('\u2020' == char1) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            array[i + n3] = -122;
                            continue;
                        }
                        else if (char1 == '\u2021') {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            array[i + n3] = -121;
                            continue;
                        }
                        else if ('\u02c6' == char1) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            array[n3 + i] = -120;
                            continue;
                        }
                        else if ('\u2030' == char1) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            array[i + n3] = -119;
                            continue;
                        }
                        else if ('\u0160' == char1) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            array[i + n3] = -118;
                            continue;
                        }
                        else if ('\u2039' == char1) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            array[i + n3] = -117;
                            continue;
                        }
                        else if ('\u0152' == char1) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            array[n3 + i] = -116;
                            continue;
                        }
                        else {
                            if ('\u017d' == char1) {
                                array[n3 + i] = -114;
                                continue;
                            }
                            if (char1 == '\u2018') {
                                array[n3 + i] = -111;
                                continue;
                            }
                            if ('\u2019' == char1) {
                                array[i + n3] = -110;
                                continue;
                            }
                            if ('\u201c' == char1) {
                                array[i + n3] = -109;
                                continue;
                            }
                            if (char1 == '\u201d') {
                                if (b == 0) {
                                    throw new IllegalStateException();
                                }
                                array[i + n3] = -108;
                                continue;
                            }
                            else if ('\u2022' == char1) {
                                if (b == 0) {
                                    throw new IllegalStateException();
                                }
                                array[n3 + i] = -107;
                                continue;
                            }
                            else if (char1 == '\u2013') {
                                if (b == 0) {
                                    throw new IllegalStateException();
                                }
                                array[i + n3] = -106;
                                continue;
                            }
                            else if ('\u2014' == char1) {
                                if (b == 0) {
                                    throw new IllegalStateException();
                                }
                                array[i + n3] = -105;
                                continue;
                            }
                            else if ('\u02dc' == char1) {
                                if (b == 0) {
                                    throw new IllegalStateException();
                                }
                                array[i + n3] = -104;
                                continue;
                            }
                            else if (char1 == '\u2122') {
                                if (b == 0) {
                                    throw new IllegalStateException();
                                }
                                array[i + n3] = -103;
                                continue;
                            }
                            else {
                                if (char1 == '\u0161') {
                                    array[i + n3] = -102;
                                    continue;
                                }
                                if (char1 == '\u203a') {
                                    if (b == 0) {
                                        throw new IllegalStateException();
                                    }
                                    array[n3 + i] = -101;
                                    continue;
                                }
                                else if (char1 == '\u0153') {
                                    if (b == 0) {
                                        throw new IllegalStateException();
                                    }
                                    array[n3 + i] = -100;
                                    continue;
                                }
                                else if ('\u017e' == char1) {
                                    if (b == 0) {
                                        throw new IllegalStateException();
                                    }
                                    array[i + n3] = -98;
                                    continue;
                                }
                                else {
                                    if (char1 != '\u0178') {
                                        array[n3 + i] = 63;
                                        continue;
                                    }
                                    if (b == 0) {
                                        throw new IllegalStateException();
                                    }
                                    array[i + n3] = -97;
                                    continue;
                                }
                            }
                        }
                    }
                }
                array[i + n3] = (byte)char1;
            }
            return n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kc.au(" + ')');
        }
    }
    
    public static String getTileColor(final CharSequence[] array, final int n, final int n2, final byte b) {
        try {
            if (0 == n2) {
                if (b != 20) {
                    throw new IllegalStateException();
                }
                return "";
            }
            else {
                if (1 != n2) {
                    final int n3 = n + n2;
                    int capacity = 0;
                    for (int i = n; i < n3; ++i) {
                        if (b != 20) {
                            throw new IllegalStateException();
                        }
                        final CharSequence charSequence = array[i];
                        if (null == charSequence) {
                            capacity += 4;
                        }
                        else {
                            capacity += charSequence.length();
                        }
                    }
                    final StringBuilder sb = new StringBuilder(capacity);
                    for (int j = n; j < n3; ++j) {
                        if (b != 20) {
                            throw new IllegalStateException();
                        }
                        final CharSequence s = array[j];
                        if (null == s) {
                            if (b != 20) {
                                throw new IllegalStateException();
                            }
                            sb.append("null");
                        }
                        else {
                            sb.append(s);
                        }
                    }
                    return sb.toString();
                }
                if (b != 20) {
                    throw new IllegalStateException();
                }
                final CharSequence charSequence2 = array[n];
                if (null != charSequence2) {
                    return charSequence2.toString();
                }
                if (b != 20) {
                    throw new IllegalStateException();
                }
                return "null";
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kc.af(" + ')');
        }
    }
    
    final int getTileColor(final int n, final int n2, final int n3) {
        try {
            return this.tileColors[64 * n2 + n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kc.af(" + ')');
        }
    }
}
