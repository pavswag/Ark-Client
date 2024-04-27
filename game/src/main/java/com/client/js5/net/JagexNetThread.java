package com.client.js5.net;

import com.client.AbstractSocket;
import com.client.Buffer;
import com.client.Node;
import com.client.cache.DualNodeDeque;
import com.client.cache.IterableNodeHashTable;
import com.client.engine.task.MonotonicClock;
import com.client.js5.disk.Js5Archive;
import net.runelite.rs.api.RSNetCache;

import java.io.IOException;
import java.util.zip.CRC32;

import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.rs.api.RSNetCache;

public class JagexNetThread implements RSNetCache {
    AbstractSocket socket;

    int field3586 = 0;

    long field3594;

    IterableNodeHashTable field3602 = new IterableNodeHashTable(4096);

    int field3588 = 0;

    IterableNodeHashTable field3600 = new IterableNodeHashTable(32);

    int field3590 = 0;

    public DualNodeDeque field3597 = new DualNodeDeque();

    public IterableNodeHashTable field3601 = new IterableNodeHashTable(4096);

    int field3591 = 0;

    IterableNodeHashTable field3599 = new IterableNodeHashTable(4096);

    int field3585 = 0;

    boolean field3583;

    public NetFileRequest field3596;

    Buffer field3605 = new Buffer(8);

    public Buffer responsiveArchiveBuffer;

    int field3587 = 0;

    public CRC32 field3593 = new CRC32();

    Buffer field3603;

    Js5Archive[] field3595 = new Js5Archive[256];

    int field3589 = -1;

    int field3592 = 255;

    byte field3584 = 0;

    public int crcMissmatches = 0;

    public int ioExceptions = 0;

    public boolean processNetwork() {
        long field3596Time = MonotonicClock.currentTimeMillis();
        int timeElapsedSinceLastLoop = (int)(field3596Time - this.field3594);
        this.field3594 = field3596Time;
        if (timeElapsedSinceLastLoop > 200)
            timeElapsedSinceLastLoop = 200;
        this.field3586 += timeElapsedSinceLastLoop;
        if (this.field3585 == 0 && this.field3590 == 0 && this.field3591 == 0 && this.field3588 == 0)
            return true;
        if (this.socket == null)
            return false;
        try {
            if (this.field3586 > 30000)
                throw new IOException();
            while (this.field3590 < 200 && this.field3588 > 0) {
                NetFileRequest request = (NetFileRequest)this.field3602.first();
                Buffer buffer = new Buffer(4);
                buffer.writeByte(1);
                buffer.writeMedium((int)request.key);
                this.socket.write(buffer.payload, 0, 4);
                this.field3600.put((Node)request, request.key);
                this.field3588--;
                this.field3590++;
            }
            while (this.field3585 < 200 && this.field3591 > 0) {
                NetFileRequest request = (NetFileRequest)this.field3597.removeLast();
                Buffer buffer = new Buffer(4);
                buffer.writeByte(0);
                buffer.writeMedium((int)request.key);
                this.socket.write(buffer.payload, 0, 4);
                request.removeDual();
                this.field3599.put((Node)request, request.key);
                this.field3591--;
                this.field3585++;
            }
            for (int loopCount = 0; loopCount < 100; loopCount++) {
                int available = this.socket.available();
                if (available < 0)
                    throw new IOException();
                if (available == 0)
                    break;
                this.field3586 = 0;
                byte controlPacketType = 0;
                if (this.field3596 == null) {
                    controlPacketType = 8;
                } else if (this.field3587 == 0) {
                    controlPacketType = 1;
                }
                if (controlPacketType > 0) {
                    int bytesRead = controlPacketType - this.field3605.pos;
                    if (bytesRead > available)
                        bytesRead = available;
                    this.socket.read(this.field3605.payload, this.field3605.pos, bytesRead);
                    if (this.field3584 != 0)
                        for (int maxBytesToRead = 0; maxBytesToRead < bytesRead; maxBytesToRead++) {
                            byte[] payload = this.field3605.payload;
                            int payloadIndex = maxBytesToRead + this.field3605.pos;
                            payload[payloadIndex] = (byte)(payload[payloadIndex] ^ this.field3584);
                        }
                    Buffer responseBuffer = this.field3605;
                    responseBuffer.pos += bytesRead;
                    if (this.field3605.pos < controlPacketType)
                        break;
                    if (this.field3596 == null) {
                        this.field3605.pos = 0;
                        int maxBytesToRead = this.field3605.readUnsignedByte();
                        int data = this.field3605.readUnsignedShort();
                        int controlPacketSubType = this.field3605.readUnsignedByte();
                        int fileLength = this.field3605.readInt();
                        long key = (data + (maxBytesToRead << 16));
                        NetFileRequest netFileRequest = (NetFileRequest)this.field3600.get(key);
                        this.field3583 = true;
                        if (netFileRequest == null) {
                            netFileRequest = (NetFileRequest)this.field3599.get(key);
                            this.field3583 = false;
                        }
                        if (netFileRequest == null)
                            throw new IOException();
                        int additionalHeaderSize = (controlPacketSubType == 0) ? 5 : 9;
                        this.field3596 = netFileRequest;
                        this.responsiveArchiveBuffer = new Buffer(this.field3596.padding + additionalHeaderSize + fileLength);
                        this.responsiveArchiveBuffer.writeByte(controlPacketSubType);
                        this.responsiveArchiveBuffer.writeInt(fileLength);
                        this.field3587 = 8;
                        this.field3605.pos = 0;
                    } else if (this.field3587 == 0) {
                        if (this.field3605.payload[0] == -1) {
                            this.field3587 = 1;
                            this.field3605.pos = 0;
                        } else {
                            this.field3596 = null;
                        }
                    }
                } else {
                    int bytesRead = this.responsiveArchiveBuffer.payload.length - this.field3596.padding;
                    int maxBytesToRead = 512 - this.field3587;
                    if (maxBytesToRead > bytesRead - this.responsiveArchiveBuffer.pos)
                        maxBytesToRead = bytesRead - this.responsiveArchiveBuffer.pos;
                    if (maxBytesToRead > available)
                        maxBytesToRead = available;
                    this.socket.read(this.responsiveArchiveBuffer.payload, this.responsiveArchiveBuffer.pos, maxBytesToRead);
                    if (this.field3584 != 0)
                        for (int data = 0; data < maxBytesToRead; data++) {
                            byte[] payload = this.responsiveArchiveBuffer.payload;
                            int payloadIndex = data + this.responsiveArchiveBuffer.pos;
                            payload[payloadIndex] = (byte)(payload[payloadIndex] ^ this.field3584);
                        }
                    Buffer responseBuffer = this.responsiveArchiveBuffer;
                    responseBuffer.pos += maxBytesToRead;
                    this.field3587 += maxBytesToRead;
                    if (this.responsiveArchiveBuffer.pos == bytesRead) {
                        if (16711935L == this.field3596.key) {
                            this.field3603 = this.responsiveArchiveBuffer;
                            for (int data = 0; data < 256; data++) {
                                Js5Archive archive = this.field3595[data];
                                if (archive != null)
                                    loadArchiveIndex(archive, data);
                            }
                        } else {
                            this.field3593.reset();
                            this.field3593.update(this.responsiveArchiveBuffer.payload, 0, bytesRead);
                            int data = (int)this.field3593.getValue();
                            if (this.field3596.crc != data) {
                                try {
                                    this.socket.close();
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                                this.crcMissmatches++;
                                this.socket = null;
                                this.field3584 = (byte)(int)(Math.random() * 255.0D + 1.0D);
                                return false;
                            }
                            this.crcMissmatches = 0;
                            this.ioExceptions = 0;
                            this.field3596.js5Archive.write((int)(this.field3596.key & 0xFFFFL), this.responsiveArchiveBuffer.payload, ((this.field3596.key & 0xFF0000L) == 16711680L), this.field3583);
                        }
                        this.field3596.remove();
                        if (this.field3583) {
                            this.field3590--;
                        } else {
                            this.field3585--;
                        }
                        this.field3587 = 0;
                        this.field3596 = null;
                        this.responsiveArchiveBuffer = null;
                    } else {
                        if (this.field3587 != 512)
                            break;
                        this.field3587 = 0;
                    }
                }
            }
            return true;
        } catch (IOException ex) {
            try {
                this.socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.ioExceptions++;
            this.socket = null;
            return false;
        }
    }

    public void writePacket(boolean var1) {
        if (this.socket != null)
            try {
                Buffer var2 = new Buffer(4);
                var2.writeByte(var1 ? 2 : 3);
                var2.writeMedium(0);
                this.socket.write(var2.payload, 0, 4);
            } catch (IOException var5) {
                try {
                    this.socket.close();
                } catch (Exception var4) {
                    var4.printStackTrace();
                }
                this.ioExceptions++;
                this.socket = null;
            }
    }

    public void initializeAndWriteDataToSocket(AbstractSocket var1, boolean var2) {
        if (this.socket != null) {
            try {
                this.socket.close();
            } catch (Exception var7) {
                var7.printStackTrace();
            }
            this.socket = null;
        }
        this.socket = var1;
        writePacket(var2);
        this.field3605.pos = 0;
        this.field3596 = null;
        this.responsiveArchiveBuffer = null;
        this.field3587 = 0;
        while (true) {
            NetFileRequest var3 = (NetFileRequest)this.field3600.first();
            if (var3 == null) {
                while (true) {
                    var3 = (NetFileRequest)this.field3599.first();
                    if (var3 == null) {
                        if (this.field3584 != 0)
                            try {
                                Buffer buffer = new Buffer(4);
                                buffer.writeByte(4);
                                buffer.writeByte(this.field3584);
                                buffer.writeShort(0);
                                this.socket.write(buffer.payload, 0, 4);
                            } catch (IOException var6) {
                                try {
                                    this.socket.close();
                                } catch (Exception exception) {}
                                this.ioExceptions++;
                                this.socket = null;
                            }
                        this.field3586 = 0;
                        this.field3594 = MonotonicClock.currentTimeMillis();
                        return;
                    }
                    this.field3597.addLast(var3);
                    this.field3601.put((Node)var3, var3.key);
                    this.field3591++;
                    this.field3585--;
                }
            }
            this.field3602.put((Node)var3, var3.key);
            this.field3588++;
            this.field3590--;
        }
    }

    public void updateArchiveIndex(Js5Archive var1, int var2) {
        if (var1.prioritizeRequests) {
            if (var2 <= this.field3589)
                throw new RuntimeException("var2=" + var2 + "/field3589=" + field3589);
            if (var2 < this.field3592)
                this.field3592 = var2;
        } else {
            if (var2 >= this.field3592)
                throw new RuntimeException("var2=" + var2 + "/field3592=" + field3592);
            if (var2 > this.field3589)
                this.field3589 = var2;
        }
        if (this.field3603 != null) {
            loadArchiveIndex(var1, var2);
        } else {
            requestNetFile(null, 255, 255, 0, (byte)0, true);
            this.field3595[var2] = var1;
        }
    }

    public int method1968(boolean var1, boolean var2) {
        byte var3 = 0;
        int var4 = var3 + this.field3588 + this.field3590;
        return var4;
    }

    public void requestNetFile(Js5Archive js5Archive, int group, int file, int crc, byte padding, boolean prioritize) {
        long var6 = (file + (group << 16));
        NetFileRequest request = (NetFileRequest)this.field3602.get(var6);
        if (request == null) {
            request = (NetFileRequest)this.field3600.get(var6);
            if (request == null) {
                request = (NetFileRequest)this.field3601.get(var6);
                if (request != null) {
                    if (prioritize) {
                        request.removeDual();
                        this.field3602.put((Node)request, var6);
                        this.field3591--;
                        this.field3588++;
                    }
                } else {
                    if (!prioritize) {
                        request = (NetFileRequest)this.field3599.get(var6);
                        if (request != null)
                            return;
                    }
                    request = new NetFileRequest();
                    request.js5Archive = js5Archive;
                    request.crc = crc;
                    request.padding = padding;
                    if (prioritize) {
                        this.field3602.put((Node)request, var6);
                        this.field3588++;
                    } else {
                        this.field3597.addFirst(request);
                        this.field3601.put((Node)request, var6);
                        this.field3591++;
                    }
                }
            }
        }
    }

    public void loadArchiveIndex(Js5Archive archive, int archiveIndex) {
        this.field3603.pos = archiveIndex * 8 + 5;
        if (this.field3603.pos >= this.field3603.payload.length) {
            if (archive.prioritizeRequests) {
                archive.reset();
            } else {
                throw new RuntimeException("Index out of bounds");
            }
        } else {
            int containerId = this.field3603.readInt();
            int crc = this.field3603.readInt();
            archive.loadIndex(containerId, crc);
        }
    }

    public void closeSocketStream() {
        if (this.socket != null)
            this.socket.close();
    }
}
