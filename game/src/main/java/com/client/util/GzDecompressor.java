package com.client.util;

import com.client.Buffer;

import java.util.zip.Inflater;

public class GzDecompressor {

    public static final GzDecompressor SINGLETON = new GzDecompressor();

    private Inflater inflater;

    public byte[] decompress(byte[] compressedData) {
        Buffer buffer = new Buffer(compressedData);
        buffer.pos = compressedData.length - 4;
        int length = buffer.readNextIntFromPayload();
        byte[] decompressed = new byte[length];
        buffer.pos = 0;
        decompress(buffer, decompressed);
        return decompressed;
    }

    public void decompress(Buffer buffer, byte[] out) {
        if (buffer.payload[buffer.pos] != 31 || -117 != buffer.payload[1 + buffer.pos]) {
            throw new RuntimeException("Not GZIP Header");
        }
        if (inflater == null) {
            inflater = new Inflater(true);
        }
        try {
            inflater.setInput(buffer.payload, buffer.pos + 10, buffer.payload.length - (buffer.pos + 10 + 8));
            inflater.inflate(out);
        } catch (Exception exception) {
            inflater.reset();
            throw new RuntimeException("Failed to unpack gzip buffer!");
        }
        inflater.reset();
    }
}
