// 
// Decompiled by Procyon v0.5.36
// 

public class class319
{
    static final int ar = 131072;
    static Huffman huffman;
    static IndexedSprite field3030;
    static final int di = 2;
    
    class319() throws Throwable {
        throw new Error();
    }
    
    public static int ac(final Buffer buffer, final String s) {
        final int n = -1633313603 * buffer.offset;
        final byte[] method1176 = RouteStrategy.method1176(s, 267322236);
        buffer.writeIntME(method1176.length, (byte)16);
        buffer.offset += class319.huffman.compress(method1176, 0, method1176.length, buffer.array, -1633313603 * buffer.offset, -172605880) * -1516355947;
        return buffer.offset * -1633313603 - n;
    }
    
    public static int au(final Buffer buffer, final String s) {
        final int n = -1633313603 * buffer.offset;
        final byte[] method1176 = RouteStrategy.method1176(s, 267322236);
        buffer.writeIntME(method1176.length, (byte)64);
        buffer.offset += class319.huffman.compress(method1176, 0, method1176.length, buffer.array, 2108197801 * buffer.offset, -1705985934) * -1516355947;
        return buffer.offset * -1633313603 - n;
    }
    
    public static int ab(final Buffer buffer, final String s) {
        final int n = -1633313603 * buffer.offset;
        final byte[] method1176 = RouteStrategy.method1176(s, 267322236);
        buffer.writeIntME(method1176.length, (byte)12);
        buffer.offset += class319.huffman.compress(method1176, 0, method1176.length, buffer.array, -716945086 * buffer.offset, -398271447) * 1468828654;
        return buffer.offset * -136922163 - n;
    }
    
    public static String aq(final Buffer buffer) {
        String decodeStringCp1252;
        try {
            int uShortSmart = buffer.readUShortSmart(-1594122234);
            if (uShortSmart > 189116693) {
                uShortSmart = 32767;
            }
            final byte[] array = new byte[uShortSmart];
            buffer.offset += class319.huffman.decompress(buffer.array, -1592123250 * buffer.offset, array, 0, uShortSmart, -716999849) * -1516355947;
            decodeStringCp1252 = Buffer.decodeStringCp1252(array, 0, uShortSmart, 534402924);
        }
        catch (Exception ex) {
            decodeStringCp1252 = "Cabbage";
        }
        return decodeStringCp1252;
    }
}
