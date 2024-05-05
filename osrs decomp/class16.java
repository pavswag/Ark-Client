import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.5.36
// 

public class class16 implements ThreadFactory
{
    final ThreadGroup field51;
    final AtomicInteger field52;
    final /* synthetic */ class14 this$0;
    public static final int bi = 35;
    static IndexedSprite[] worldSelectFlagSprites;
    static final int qi = 31;
    static final int bb = 34;
    static int field54;
    public static final int ab = 10000;
    
    class16(final class14 this$0) {
        this.this$0 = this$0;
        this.field52 = new AtomicInteger(1);
        final SecurityManager securityManager = System.getSecurityManager();
        this.field51 = ((null != securityManager) ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup());
    }
    
    @Override
    public Thread newThread(final Runnable target) {
        try {
            final Thread thread = new Thread(this.field51, target, this.this$0.field45 + "-rest-request-" + this.field52.getAndIncrement(), 0L);
            thread.setDaemon(true);
            thread.setPriority(5);
            return thread;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "av.newThread(" + ')');
        }
    }
    
    static int method60(final int n, final Script script, final boolean b, final int n2) {
        try {
            return 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "av.bc(" + ')');
        }
    }
    
    public Thread an(final Runnable target) {
        final Thread thread = new Thread(this.field51, target, this.this$0.field45 + "-rest-request-" + this.field52.getAndIncrement(), 0L);
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }
    
    public static int compareStrings(final CharSequence charSequence, final CharSequence charSequence2, final Language language, final int n) {
        try {
            final int length = charSequence.length();
            final int length2 = charSequence2.length();
            char c = '\0';
            char c2 = '\0';
            char c3 = '\0';
            int n2 = 0;
            while (true) {
                if (c - c3 >= length) {
                    if (n <= 1463652511) {
                        throw new IllegalStateException();
                    }
                    if (c2 - n2 >= length2) {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        final int min = Math.min(length, length2);
                        for (int i = 0; i < min; ++i) {
                            if (n <= 1463652511) {
                                throw new IllegalStateException();
                            }
                            int n3;
                            int n4;
                            if (Language.Language_FR == language) {
                                if (n <= 1463652511) {
                                    throw new IllegalStateException();
                                }
                                n3 = length - 1 - i;
                                n4 = length2 - 1 - i;
                            }
                            else {
                                n4 = (n3 = i);
                            }
                            final char char1 = charSequence.charAt(n3);
                            final char char2 = charSequence2.charAt(n4);
                            if (char1 != char2) {
                                if (n <= 1463652511) {
                                    throw new IllegalStateException();
                                }
                                if (Character.toUpperCase(char1) != Character.toUpperCase(char2)) {
                                    if (n <= 1463652511) {
                                        throw new IllegalStateException();
                                    }
                                    final char lowerCase = Character.toLowerCase(char1);
                                    final char lowerCase2 = Character.toLowerCase(char2);
                                    if (lowerCase2 != lowerCase) {
                                        if (n <= 1463652511) {
                                            throw new IllegalStateException();
                                        }
                                        return Archive.loadRegionFromGroup(lowerCase, language, -1341614150) - Archive.loadRegionFromGroup(lowerCase2, language, -1124664307);
                                    }
                                }
                            }
                        }
                        final int n5 = length - length2;
                        if (n5 == 0) {
                            for (int j = 0; j < min; ++j) {
                                if (n <= 1463652511) {
                                    throw new IllegalStateException();
                                }
                                final char char3 = charSequence.charAt(j);
                                final char char4 = charSequence2.charAt(j);
                                if (char4 != char3) {
                                    return Archive.loadRegionFromGroup(char3, language, 242400549) - Archive.loadRegionFromGroup(char4, language, -1956567373);
                                }
                            }
                            return 0;
                        }
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        return n5;
                    }
                }
                if (c - c3 >= length) {
                    if (n <= 1463652511) {
                        throw new IllegalStateException();
                    }
                    return -1;
                }
                else if (c2 - n2 >= length2) {
                    if (n <= 1463652511) {
                        throw new IllegalStateException();
                    }
                    return 1;
                }
                else {
                    char char5;
                    if (c3 != '\0') {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        char5 = c3;
                    }
                    else {
                        char5 = charSequence.charAt(c++);
                    }
                    char char6;
                    if (n2 != 0) {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        char6 = (char)n2;
                    }
                    else {
                        char6 = charSequence2.charAt(c2++);
                    }
                    char c4;
                    if ('\u00c6' == char5) {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c4 = 'E';
                    }
                    else if ('\u00e6' == char5) {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c4 = 'e';
                    }
                    else if ('\u00df' == char5) {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c4 = 's';
                    }
                    else if (char5 == '\u0152') {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c4 = 'E';
                    }
                    else if ('\u0153' == char5) {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c4 = 'e';
                    }
                    else {
                        c4 = '\0';
                    }
                    c3 = c4;
                    char c5;
                    if (char6 == '\u00c6') {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c5 = 'E';
                    }
                    else if (char6 == '\u00e6') {
                        c5 = 'e';
                    }
                    else if ('\u00df' == char6) {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c5 = 's';
                    }
                    else if ('\u0152' == char6) {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c5 = 'E';
                    }
                    else if (char6 == '\u0153') {
                        if (n <= 1463652511) {
                            throw new IllegalStateException();
                        }
                        c5 = 'e';
                    }
                    else {
                        c5 = '\0';
                    }
                    n2 = c5;
                    final char npcDefinition = AbstractArchive.getNpcDefinition(char5, language, (byte)16);
                    final char npcDefinition2 = AbstractArchive.getNpcDefinition(char6, language, (byte)(-44));
                    if (npcDefinition == npcDefinition2) {
                        continue;
                    }
                    if (n <= 1463652511) {
                        throw new IllegalStateException();
                    }
                    if (Character.toUpperCase(npcDefinition) == Character.toUpperCase(npcDefinition2)) {
                        continue;
                    }
                    final char lowerCase3 = Character.toLowerCase(npcDefinition);
                    final char lowerCase4 = Character.toLowerCase(npcDefinition2);
                    if (lowerCase3 != lowerCase4) {
                        return Archive.loadRegionFromGroup(lowerCase3, language, 1902659379) - Archive.loadRegionFromGroup(lowerCase4, language, -1151048423);
                    }
                    continue;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "av.af(" + ')');
        }
    }
    
    public Thread compareStrings(final Runnable target) {
        final Thread thread = new Thread(this.field51, target, this.this$0.field45 + "-rest-request-" + this.field52.getAndIncrement(), 0L);
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }
}
