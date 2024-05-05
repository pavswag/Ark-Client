// 
// Decompiled by Procyon v0.5.36
// 

public class class372
{
    static final int au = 2;
    
    class372() throws Throwable {
        throw new Error();
    }
    
    static int at(char lowerCase, final Language language) {
        int n = lowerCase << 4;
        if (Character.isUpperCase(lowerCase) || Character.isTitleCase(lowerCase)) {
            lowerCase = Character.toLowerCase(lowerCase);
            n = (lowerCase << 4) + 1;
        }
        if (lowerCase == '\u00f1' && language == Language.Language_ES) {
            n = 1762;
        }
        return n;
    }
    
    static char al(final char c, final Language language) {
        if (c >= '\u00c0' && c <= '\u00ff') {
            if (c >= '\u00c0' && c <= '\u00c6') {
                return 'A';
            }
            if (c == '\u00c7') {
                return 'C';
            }
            if (c >= '\u00c8' && c <= '\u00cb') {
                return 'E';
            }
            if (c >= '\u00cc' && c <= '\u00cf') {
                return 'I';
            }
            if ('\u00d1' == c && Language.Language_ES != language) {
                return 'N';
            }
            if (c >= '\u00d2' && c <= '\u00d6') {
                return 'O';
            }
            if (c >= '\u00d9' && c <= '\u00dc') {
                return 'U';
            }
            if (c == '\u00dd') {
                return 'Y';
            }
            if (c == '\u00df') {
                return 's';
            }
            if (c >= '\u00e0' && c <= '\u00e6') {
                return 'a';
            }
            if ('\u00e7' == c) {
                return 'c';
            }
            if (c >= '\u00e8' && c <= '\u00eb') {
                return 'e';
            }
            if (c >= '\u00ec' && c <= '\u00ef') {
                return 'i';
            }
            if ('\u00f1' == c && language != Language.Language_ES) {
                return 'n';
            }
            if (c >= '\u00f2' && c <= '\u00f6') {
                return 'o';
            }
            if (c >= '\u00f9' && c <= '\u00fc') {
                return 'u';
            }
            if (c == '\u00fd' || c == '\u00ff') {
                return 'y';
            }
        }
        if (c == '\u0152') {
            return 'O';
        }
        if ('\u0153' == c) {
            return 'o';
        }
        if ('\u0178' == c) {
            return 'Y';
        }
        return c;
    }
    
    public static int ac(final CharSequence charSequence, final CharSequence charSequence2, final Language language) {
        final int length = charSequence.length();
        final int length2 = charSequence2.length();
        char c = '\0';
        char c2 = '\0';
        char c3 = '\0';
        int n = 0;
        while (c - c3 < length || c2 - n < length2) {
            if (c - c3 >= length) {
                return -1;
            }
            if (c2 - n >= length2) {
                return 1;
            }
            char char1;
            if (c3 != '\0') {
                char1 = c3;
            }
            else {
                char1 = charSequence.charAt(c++);
            }
            char char2;
            if (n != 0) {
                char2 = (char)n;
            }
            else {
                char2 = charSequence2.charAt(c2++);
            }
            char c4;
            if ('\u00c6' == char1) {
                c4 = 'E';
            }
            else if ('\u00e6' == char1) {
                c4 = 'e';
            }
            else if ('\u00df' == char1) {
                c4 = 's';
            }
            else if (char1 == '\u0152') {
                c4 = 'E';
            }
            else if ('\u0153' == char1) {
                c4 = 'e';
            }
            else {
                c4 = '\0';
            }
            c3 = c4;
            char c5;
            if (char2 == '\u00c6') {
                c5 = 'E';
            }
            else if (char2 == '\u00e6') {
                c5 = 'e';
            }
            else if ('\u00df' == char2) {
                c5 = 's';
            }
            else if ('\u0152' == char2) {
                c5 = 'E';
            }
            else if (char2 == '\u0153') {
                c5 = 'e';
            }
            else {
                c5 = '\0';
            }
            n = c5;
            final char npcDefinition = AbstractArchive.getNpcDefinition(char1, language, (byte)(-84));
            final char npcDefinition2 = AbstractArchive.getNpcDefinition(char2, language, (byte)44);
            if (npcDefinition == npcDefinition2 || Character.toUpperCase(npcDefinition) == Character.toUpperCase(npcDefinition2)) {
                continue;
            }
            final char lowerCase = Character.toLowerCase(npcDefinition);
            final char lowerCase2 = Character.toLowerCase(npcDefinition2);
            if (lowerCase != lowerCase2) {
                return Archive.loadRegionFromGroup(lowerCase, language, 2061686937) - Archive.loadRegionFromGroup(lowerCase2, language, 1746795082);
            }
        }
        final int min = Math.min(length, length2);
        for (int i = 0; i < min; ++i) {
            int n2;
            int n3;
            if (Language.Language_FR == language) {
                n2 = length - 1 - i;
                n3 = length2 - 1 - i;
            }
            else {
                n3 = (n2 = i);
            }
            final char char3 = charSequence.charAt(n2);
            final char char4 = charSequence2.charAt(n3);
            if (char3 != char4 && Character.toUpperCase(char3) != Character.toUpperCase(char4)) {
                final char lowerCase3 = Character.toLowerCase(char3);
                final char lowerCase4 = Character.toLowerCase(char4);
                if (lowerCase4 != lowerCase3) {
                    return Archive.loadRegionFromGroup(lowerCase3, language, 731839886) - Archive.loadRegionFromGroup(lowerCase4, language, 1452546374);
                }
            }
        }
        final int n4 = length - length2;
        if (n4 != 0) {
            return n4;
        }
        for (int j = 0; j < min; ++j) {
            final char char5 = charSequence.charAt(j);
            final char char6 = charSequence2.charAt(j);
            if (char6 != char5) {
                return Archive.loadRegionFromGroup(char5, language, 493774300) - Archive.loadRegionFromGroup(char6, language, 1761783271);
            }
        }
        return 0;
    }
    
    public static int au(final CharSequence charSequence, final CharSequence charSequence2, final Language language) {
        final int length = charSequence.length();
        final int length2 = charSequence2.length();
        char c = '\0';
        char c2 = '\0';
        char c3 = '\0';
        int n = 0;
        while (c - c3 < length || c2 - n < length2) {
            if (c - c3 >= length) {
                return -1;
            }
            if (c2 - n >= length2) {
                return 1;
            }
            char char1;
            if (c3 != '\0') {
                char1 = c3;
            }
            else {
                char1 = charSequence.charAt(c++);
            }
            char char2;
            if (n != 0) {
                char2 = (char)n;
            }
            else {
                char2 = charSequence2.charAt(c2++);
            }
            int n2;
            if ('\u00c6' == char1) {
                n2 = 69;
            }
            else if (1945106352 == char1) {
                n2 = -1212140784;
            }
            else if (-745853887 == char1) {
                n2 = 962928149;
            }
            else if (char1 == '\u0152') {
                n2 = -2013172350;
            }
            else if ('\u0153' == char1) {
                n2 = -291909971;
            }
            else {
                n2 = 0;
            }
            c3 = (char)n2;
            int n3;
            if (char2 == 272832507) {
                n3 = 69;
            }
            else if (char2 == -102076367) {
                n3 = -1513723783;
            }
            else if ('\u00df' == char2) {
                n3 = -1390481815;
            }
            else if (-1713997472 == char2) {
                n3 = 69;
            }
            else if (char2 == '\u0153') {
                n3 = 101;
            }
            else {
                n3 = 0;
            }
            n = n3;
            final char npcDefinition = AbstractArchive.getNpcDefinition(char1, language, (byte)(-22));
            final char npcDefinition2 = AbstractArchive.getNpcDefinition(char2, language, (byte)(-51));
            if (npcDefinition == npcDefinition2 || Character.toUpperCase(npcDefinition) == Character.toUpperCase(npcDefinition2)) {
                continue;
            }
            final char lowerCase = Character.toLowerCase(npcDefinition);
            final char lowerCase2 = Character.toLowerCase(npcDefinition2);
            if (lowerCase != lowerCase2) {
                return Archive.loadRegionFromGroup(lowerCase, language, 412473035) - Archive.loadRegionFromGroup(lowerCase2, language, -839287356);
            }
        }
        final int min = Math.min(length, length2);
        for (int i = 0; i < min; ++i) {
            int n4;
            int n5;
            if (Language.Language_FR == language) {
                n4 = length - 1 - i;
                n5 = length2 - 1 - i;
            }
            else {
                n5 = (n4 = i);
            }
            final char char3 = charSequence.charAt(n4);
            final char char4 = charSequence2.charAt(n5);
            if (char3 != char4 && Character.toUpperCase(char3) != Character.toUpperCase(char4)) {
                final char lowerCase3 = Character.toLowerCase(char3);
                final char lowerCase4 = Character.toLowerCase(char4);
                if (lowerCase4 != lowerCase3) {
                    return Archive.loadRegionFromGroup(lowerCase3, language, 2111522597) - Archive.loadRegionFromGroup(lowerCase4, language, -1856723365);
                }
            }
        }
        final int n6 = length - length2;
        if (n6 != 0) {
            return n6;
        }
        for (int j = 0; j < min; ++j) {
            final char char5 = charSequence.charAt(j);
            final char char6 = charSequence2.charAt(j);
            if (char6 != char5) {
                return Archive.loadRegionFromGroup(char5, language, 958649927) - Archive.loadRegionFromGroup(char6, language, 816681642);
            }
        }
        return 0;
    }
    
    static int aa(char lowerCase, final Language language) {
        int n = lowerCase << 4;
        if (Character.isUpperCase(lowerCase) || Character.isTitleCase(lowerCase)) {
            lowerCase = Character.toLowerCase(lowerCase);
            n = (lowerCase << 4) + 1;
        }
        if (lowerCase == -365325905 && language == Language.Language_ES) {
            n = 1762;
        }
        return n;
    }
    
    public static int ab(final CharSequence charSequence, final CharSequence charSequence2, final Language language) {
        final int length = charSequence.length();
        final int length2 = charSequence2.length();
        char c = '\0';
        char c2 = '\0';
        char c3 = '\0';
        int n = 0;
        while (c - c3 < length || c2 - n < length2) {
            if (c - c3 >= length) {
                return -1;
            }
            if (c2 - n >= length2) {
                return 1;
            }
            char char1;
            if (c3 != '\0') {
                char1 = c3;
            }
            else {
                char1 = charSequence.charAt(c++);
            }
            char char2;
            if (n != 0) {
                char2 = (char)n;
            }
            else {
                char2 = charSequence2.charAt(c2++);
            }
            char c4;
            if ('\u00c6' == char1) {
                c4 = 'E';
            }
            else if ('\u00e6' == char1) {
                c4 = 'e';
            }
            else if ('\u00df' == char1) {
                c4 = 's';
            }
            else if (char1 == '\u0152') {
                c4 = 'E';
            }
            else if ('\u0153' == char1) {
                c4 = 'e';
            }
            else {
                c4 = '\0';
            }
            c3 = c4;
            char c5;
            if (char2 == '\u00c6') {
                c5 = 'E';
            }
            else if (char2 == '\u00e6') {
                c5 = 'e';
            }
            else if ('\u00df' == char2) {
                c5 = 's';
            }
            else if ('\u0152' == char2) {
                c5 = 'E';
            }
            else if (char2 == '\u0153') {
                c5 = 'e';
            }
            else {
                c5 = '\0';
            }
            n = c5;
            final char npcDefinition = AbstractArchive.getNpcDefinition(char1, language, (byte)11);
            final char npcDefinition2 = AbstractArchive.getNpcDefinition(char2, language, (byte)(-121));
            if (npcDefinition == npcDefinition2 || Character.toUpperCase(npcDefinition) == Character.toUpperCase(npcDefinition2)) {
                continue;
            }
            final char lowerCase = Character.toLowerCase(npcDefinition);
            final char lowerCase2 = Character.toLowerCase(npcDefinition2);
            if (lowerCase != lowerCase2) {
                return Archive.loadRegionFromGroup(lowerCase, language, 1667245100) - Archive.loadRegionFromGroup(lowerCase2, language, -2034517584);
            }
        }
        final int min = Math.min(length, length2);
        for (int i = 0; i < min; ++i) {
            int n2;
            int n3;
            if (Language.Language_FR == language) {
                n2 = length - 1 - i;
                n3 = length2 - 1 - i;
            }
            else {
                n3 = (n2 = i);
            }
            final char char3 = charSequence.charAt(n2);
            final char char4 = charSequence2.charAt(n3);
            if (char3 != char4 && Character.toUpperCase(char3) != Character.toUpperCase(char4)) {
                final char lowerCase3 = Character.toLowerCase(char3);
                final char lowerCase4 = Character.toLowerCase(char4);
                if (lowerCase4 != lowerCase3) {
                    return Archive.loadRegionFromGroup(lowerCase3, language, 1252792960) - Archive.loadRegionFromGroup(lowerCase4, language, 70825482);
                }
            }
        }
        final int n4 = length - length2;
        if (n4 != 0) {
            return n4;
        }
        for (int j = 0; j < min; ++j) {
            final char char5 = charSequence.charAt(j);
            final char char6 = charSequence2.charAt(j);
            if (char6 != char5) {
                return Archive.loadRegionFromGroup(char5, language, -959957324) - Archive.loadRegionFromGroup(char6, language, 411321981);
            }
        }
        return 0;
    }
    
    static char loadTerrain(final char c, final Language language) {
        if (c >= '\u00c0' && c <= '\u00ff') {
            if (c >= '\u00c0' && c <= '\u00c6') {
                return 'A';
            }
            if (c == '\u00c7') {
                return 'C';
            }
            if (c >= '\u00c8' && c <= '\u00cb') {
                return 'E';
            }
            if (c >= '\u00cc' && c <= '\u00cf') {
                return 'I';
            }
            if ('\u00d1' == c && Language.Language_ES != language) {
                return 'N';
            }
            if (c >= '\u00d2' && c <= '\u00d6') {
                return 'O';
            }
            if (c >= '\u00d9' && c <= '\u00dc') {
                return 'U';
            }
            if (c == '\u00dd') {
                return 'Y';
            }
            if (c == '\u00df') {
                return 's';
            }
            if (c >= '\u00e0' && c <= '\u00e6') {
                return 'a';
            }
            if ('\u00e7' == c) {
                return 'c';
            }
            if (c >= '\u00e8' && c <= '\u00eb') {
                return 'e';
            }
            if (c >= '\u00ec' && c <= '\u00ef') {
                return 'i';
            }
            if ('\u00f1' == c && language != Language.Language_ES) {
                return 'n';
            }
            if (c >= '\u00f2' && c <= '\u00f6') {
                return 'o';
            }
            if (c >= '\u00f9' && c <= '\u00fc') {
                return 'u';
            }
            if (c == '\u00fd' || c == '\u00ff') {
                return 'y';
            }
        }
        if (c == '\u0152') {
            return 'O';
        }
        if ('\u0153' == c) {
            return 'o';
        }
        if ('\u0178' == c) {
            return 'Y';
        }
        return c;
    }
    
    static final void loadTerrain(final Buffer buffer, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final byte b) {
        try {
            boolean b2 = false;
            Label_0067: {
                if (n >= 0 && n < 4 && n2 >= 0) {
                    if (b >= 40) {
                        throw new IllegalStateException();
                    }
                    if (n2 < 104) {
                        if (b >= 40) {
                            throw new IllegalStateException();
                        }
                        if (n3 >= 0) {
                            if (b >= 40) {
                                return;
                            }
                            if (n3 < 104) {
                                b2 = true;
                                break Label_0067;
                            }
                        }
                    }
                }
                b2 = false;
            }
            if (b2) {
                if (b >= 40) {
                    throw new IllegalStateException();
                }
                Client.gk.oo[n][n2][n3] = 0;
                while (true) {
                    final int unsignedShort = buffer.readUnsignedShort(689796545);
                    if (unsignedShort == 0) {
                        if (b >= 40) {
                            throw new IllegalStateException();
                        }
                        if (0 != n) {
                            Client.gk.kw[n][n2][n3] = Client.gk.kw[n - 1][n2][n3] - 240;
                            break;
                        }
                        if (b >= 40) {
                            throw new IllegalStateException();
                        }
                        final int[] array = Client.gk.kw[0][n2];
                        final int n7 = n4 + 932731;
                        final int n8 = n5 + 556238;
                        int n9 = 35 + (int)((class101.method634(45365 + n7, 91923 + n8, 4, (byte)(-9)) - 128 + (class101.method634(10294 + n7, 37821 + n8, 2, (byte)(-51)) - 128 >> 1) + (class101.method634(n7, n8, 1, (byte)(-84)) - 128 >> 2)) * 0.3);
                        if (n9 < 10) {
                            if (b >= 40) {
                                throw new IllegalStateException();
                            }
                            n9 = 10;
                        }
                        else if (n9 > 60) {
                            if (b >= 40) {
                                return;
                            }
                            n9 = 60;
                        }
                        array[n3] = 8 * -n9;
                        break;
                    }
                    else if (unsignedShort != 0) {
                        if (b >= 40) {
                            return;
                        }
                        int ra = Buffer.ra(buffer, (byte)7);
                        if (ra == 1) {
                            ra = 0;
                        }
                        if (0 != n) {
                            Client.gk.kw[n][n2][n3] = Client.gk.kw[n - 1][n2][n3] - 8 * ra;
                            break;
                        }
                        if (b >= 40) {
                            throw new IllegalStateException();
                        }
                        Client.gk.kw[0][n2][n3] = 8 * -ra;
                        break;
                    }
                    else if (unsignedShort <= 49) {
                        if (b >= 40) {
                            throw new IllegalStateException();
                        }
                        Client.gk.nm[n][n2][n3] = (short)buffer.readUnsignedByte((byte)(-108));
                        Client.gk.go[n][n2][n3] = (byte)((unsignedShort - 2) / 4);
                        Client.gk.mm[n][n2][n3] = (byte)(n6 + (unsignedShort - 2) & 0x3);
                    }
                    else if (unsignedShort <= 81) {
                        if (b >= 40) {
                            return;
                        }
                        Client.gk.oo[n][n2][n3] = (byte)(unsignedShort - 49);
                    }
                    else {
                        Client.gk.nq[n][n2][n3] = (short)(unsignedShort - 81);
                    }
                }
            }
            else {
                while (true) {
                    final int unsignedShort2 = buffer.readUnsignedShort(-443898580);
                    if (unsignedShort2 == 0) {
                        if (b >= 40) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else if (unsignedShort2 != 0) {
                        if (b >= 40) {
                            return;
                        }
                        Buffer.ra(buffer, (byte)7);
                        break;
                    }
                    else {
                        if (unsignedShort2 > 49) {
                            continue;
                        }
                        buffer.readUnsignedByte((byte)(-17));
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "of.aq(" + ')');
        }
    }
}
