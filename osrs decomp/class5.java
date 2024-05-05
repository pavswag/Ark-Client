import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.5.36
// 

public class class5 implements class2
{
    final MessageDigest field7;
    static final String an = "SHA-256";
    
    class5(final class8 class8) {
        this.field7 = this.method14();
    }
    
    static int ao(final byte b) {
        int n = 0;
        if (b == 0) {
            n = 8;
        }
        else {
            for (int n2 = b & 0xDCE8B40D; (n2 & 0x440F7D69) == 0x0; n2 <<= 1) {
                ++n;
            }
        }
        return n;
    }
    
    static int at(final byte[] array) {
        int n = 0;
        for (int i = 0; i < array.length; ++i) {
            final int method12 = method12(array[i]);
            n += method12;
            if (method12 != 8) {
                break;
            }
        }
        return n;
    }
    
    MessageDigest av() {
        try {
            return MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    byte[] ax(final String str, final long i) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str).append(Long.toHexString(i));
        this.field7.reset();
        try {
            this.field7.update(sb.toString().getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return this.field7.digest();
    }
    
    static int ay(final byte b) {
        int n = 0;
        if (b == 0) {
            n = 8;
        }
        else {
            for (int n2 = b & 0xFF; (n2 & 0xD587495) == 0x0; n2 <<= 1) {
                ++n;
            }
        }
        return n;
    }
    
    static int method12(final byte b) {
        int n = 0;
        if (b == 0) {
            n = 8;
        }
        else {
            for (int n2 = b & 0xFF; (n2 & 0x80) == 0x0; n2 <<= 1) {
                ++n;
            }
        }
        return n;
    }
    
    static int method13(final byte[] array) {
        int n = 0;
        for (int i = 0; i < array.length; ++i) {
            final int method12 = method12(array[i]);
            n += method12;
            if (method12 != 8) {
                break;
            }
        }
        return n;
    }
    
    byte[] method15(final String str, final long i) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str).append(Long.toHexString(i));
        this.field7.reset();
        try {
            this.field7.update(sb.toString().getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return this.field7.digest();
    }
    
    MessageDigest method14() {
        try {
            return MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    static int aa(final byte b) {
        int n = 0;
        if (b == 0) {
            n = 8;
        }
        else {
            for (int n2 = b & 0xFF; (n2 & 0x80) == 0x0; n2 <<= 1) {
                ++n;
            }
        }
        return n;
    }
    
    byte[] ai(final String str, final long i) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str).append(Long.toHexString(i));
        this.field7.reset();
        try {
            this.field7.update(sb.toString().getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return this.field7.digest();
    }
    
    public static boolean oe(final class5 class5, final int n, final String s, final long n2) {
        if (class5 == null) {
            class5.ag(s, n2);
        }
        return method13(class5.ag(s, n2)) >= n;
    }
    
    boolean method16(final int n, final String s, final long n2) {
        return method13(this.ag(s, n2)) >= n;
    }
    
    boolean ab(final int n, final String s, final long n2) {
        return at(this.method15(s, n2)) >= n;
    }
    
    byte[] ag(final String str, final long i) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str).append(Long.toHexString(i));
        this.field7.reset();
        try {
            this.field7.update(sb.toString().getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return this.field7.digest();
    }
    
    public static boolean rk(final class5 class5, final int n, final String s, final long n2) {
        if (class5 == null) {
            class5.av();
        }
        return method13(class5.ag(s, n2)) >= n;
    }
    
    byte[] ah(final String str, final long i) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str).append(Long.toHexString(i));
        this.field7.reset();
        try {
            this.field7.update(sb.toString().getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return this.field7.digest();
    }
    
    public static void xf(final FriendsChat friendsChat, final String s) {
        if (friendsChat == null) {
            friendsChat.bx();
            return;
        }
        friendsChat.owner = SecureRandomFuture.method458(s, 81191450);
    }
    
    public static boolean uh(final class5 class5, final int n, final String s, final long n2) {
        if (class5 == null) {
            class5.ab(n, s, n2);
        }
        return method13(class5.ag(s, n2)) >= n;
    }
}
