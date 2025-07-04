package com.client.js5.disk;



import com.client.AbstractByteArrayCopier;
import com.client.Buffer;
import com.client.DirectByteArrayCopier;
import com.client.IntHashTable;
import com.client.js5.util.Js5ConfigType;
import com.client.util.BZip2Decompressor;
import com.client.util.CRC32;
import com.client.util.GzDecompressor;
import com.client.util.StringUtils;

import java.util.Arrays;

public abstract class AbstractArchive {
    public static int maxSize = 0;

    int groupCount;

    int[] groupIds;

    int[] groupNameHashes;

    IntHashTable groupNameHashTable;

    int[] groupCrcs;

    int[] groupVersions;

    int[] fileCounts;

    int[][] fileIds;

    int[][] fileNameHashes;

    IntHashTable[] fileNameHashTables;

    Object[] groups;

    Object[][] files;

    public int hash;

    boolean releaseGroups;

    boolean shallowFiles;

    public static GzDecompressor gzipDecompressor = new GzDecompressor();

    AbstractArchive(boolean var1, boolean var2) {
        this.releaseGroups = var1;
        this.shallowFiles = var2;
    }

    void loadRegionFromGroup(int var1) {}

    void loadGroup(int var1) {}

    int groupLoadPercent(int var1) {
        return (this.groups[var1] != null) ? 100 : 0;
    }

    void decodeIndex(byte[] payload) {
        this.hash = CRC32.getCRC(payload, 0, payload.length);
        Buffer buffer = new Buffer(decompress(payload));
        int protocol = buffer.readUnsignedByte();
        if (protocol >= 5 && protocol <= 7) {
            if (protocol >= 6)
                buffer.readInt();
            int var6 = buffer.readUnsignedByte();
            if (protocol >= 7) {
                this.groupCount = buffer.readLargeSmart();
            } else {
                this.groupCount = buffer.readUShort();
            }
            int lastId = 0;
            int lastGroupId = -1;
            this.groupIds = new int[this.groupCount];
            if (protocol >= 7) {
                for (int i = 0; i < this.groupCount; i++) {
                    this.groupIds[i] = lastId += buffer.readLargeSmart();
                    if (this.groupIds[i] > lastGroupId)
                        lastGroupId = this.groupIds[i];
                }
            } else {
                for (int i = 0; i < this.groupCount; i++) {
                    this.groupIds[i] = lastId += buffer.readUShort();
                    if (this.groupIds[i] > lastGroupId)
                        lastGroupId = this.groupIds[i];
                }
            }
            this.groupCrcs = new int[lastGroupId + 1];
            this.groupVersions = new int[lastGroupId + 1];
            this.fileCounts = new int[lastGroupId + 1];
            this.fileIds = new int[lastGroupId + 1][];
            this.groups = new Object[lastGroupId + 1];
            this.files = new Object[lastGroupId + 1][];
            if (var6 != 0) {
                this.groupNameHashes = new int[lastGroupId + 1];
                for (int i = 0; i < this.groupCount; i++)
                    this.groupNameHashes[this.groupIds[i]] = buffer.readInt();
                this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
            }
            int index;
            for (index = 0; index < this.groupCount; index++)
                this.groupCrcs[this.groupIds[index]] = buffer.readInt();
            for (index = 0; index < this.groupCount; index++)
                this.groupVersions[this.groupIds[index]] = buffer.readInt();
            for (index = 0; index < this.groupCount; index++)
                this.fileCounts[this.groupIds[index]] = buffer.readUnsignedShort();
            if (protocol >= 7) {
                for (index = 0; index < this.groupCount; index++) {
                    int groupId = this.groupIds[index];
                    int fileCount = this.fileCounts[groupId];
                    lastId = 0;
                    int var12 = -1;
                    this.fileIds[groupId] = new int[fileCount];
                    for (int var13 = 0; var13 < fileCount; var13++) {
                        int var14 = this.fileIds[groupId][var13] = lastId += buffer.readLargeSmart();
                        if (var14 > var12)
                            var12 = var14;
                    }
                    this.files[groupId] = new Object[var12 + 1];
                }
            } else {
                for (index = 0; index < this.groupCount; index++) {
                    int groupId = this.groupIds[index];
                    int fileCount = this.fileCounts[groupId];
                    lastId = 0;
                    int var12 = -1;
                    this.fileIds[groupId] = new int[fileCount];
                    for (int var13 = 0; var13 < fileCount; var13++) {
                        int var14 = this.fileIds[groupId][var13] = lastId += buffer.readUShort();
                        if (var14 > var12)
                            var12 = var14;
                    }
                    this.files[groupId] = new Object[var12 + 1];
                }
            }
            if (var6 != 0) {
                this.fileNameHashes = new int[lastGroupId + 1][];
                this.fileNameHashTables = new IntHashTable[lastGroupId + 1];
                for (index = 0; index < this.groupCount; index++) {
                    int var10 = this.groupIds[index];
                    int var11 = this.fileCounts[var10];
                    this.fileNameHashes[var10] = new int[(this.files[var10]).length];
                    for (int var12 = 0; var12 < var11; var12++)
                        this.fileNameHashes[var10][this.fileIds[var10][var12]] = buffer.readInt();
                    this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]);
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public byte[] takeFile(Js5ConfigType var1, int var2) {
        return takeFileEncrypted(var1.getId(), var2, (int[])null);
    }

    public byte[] takeFile(int var1, int var2) {
        return takeFileEncrypted(var1, var2, (int[])null);
    }

    public byte[] takeFileEncrypted(int group, int file_id, int[] keys) {
        try {
            if (group >= 0 && group < this.files.length && this.files[group] != null && file_id >= 0 && file_id < (this.files[group]).length) {
                if (this.files[group][file_id] == null) {
                    boolean var4 = buildFiles(group, keys);
                    if (!var4) {
                        loadGroup(group);
                        var4 = buildFiles(group, keys);
                        if (!var4)
                            return null;
                    }
                }
                byte[] var5 = method5224(this.files[group][file_id], false);
                if (this.shallowFiles)
                    this.files[group][file_id] = null;
                return var5;
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized boolean tryLoadFile(int var1) {
        return tryLoadFile(var1, 0);
    }

    public synchronized boolean tryLoadFile(int var1, int var2) {
        if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < (this.files[var1]).length) {
            if (this.files[var1][var2] != null)
                return true;
            if (this.groups[var1] != null)
                return true;
            loadGroup(var1);
            return (this.groups[var1] != null);
        }
        return false;
    }

    public boolean method6603(int var1) {
        if (this.files.length == 1)
            return tryLoadFile(0, var1);
        if ((this.files[var1]).length == 1)
            return tryLoadFile(var1, 0);
        throw new RuntimeException();
    }

    public boolean tryLoadGroup(int index) {
        if (this.groups[index] != null)
            return true;
        loadGroup(index);
        return (this.groups[index] != null);
    }

    public boolean isFullyLoaded() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.groupIds.length; var2++) {
            int var3 = this.groupIds[var2];
            if (this.groups[var3] == null) {
                loadGroup(var3);
                if (this.groups[var3] == null)
                    var1 = false;
            }
        }
        return var1;
    }

    public byte[] takeFileFlat(int file) {
        if (this.files.length == 1)
            return takeFile(0, file);
        if ((this.files[file]).length == 1)
            return takeFile(file, 0);
        throw new RuntimeException("Unable to take File: " + file);
    }

    public byte[] getFile(int var1, int var2) {
        if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < (this.files[var1]).length) {
            if (this.files[var1][var2] == null) {
                boolean var3 = buildFiles(var1, (int[])null);
                if (!var3) {
                    loadGroup(var1);
                    var3 = buildFiles(var1, (int[])null);
                    if (!var3)
                        return null;
                }
            }
            byte[] var4 = method5224(this.files[var1][var2], false);
            return var4;
        }
        return null;
    }

    public byte[] getFileFlat(int file) {
        if (this.files.length == 1)
            return getFile(0, file);
        if ((this.files[file]).length == 1)
            return getFile(file, 0);
        throw new RuntimeException("Unable to take File: " + file);
    }

    public int[] getGroupFileIds(int id) {
        return (id >= 0 && id < this.fileIds.length) ? this.fileIds[id] : null;
    }

    public int getGroupFileCount(Js5ConfigType configType) {
        return getGroupFileCount(configType.getId());
    }

    public int getGroupFileCount(int group) {
        return (this.files[group]).length;
    }

    public int getGroupCount() {
        return this.files.length;
    }

    public void clearGroups() {
        Arrays.fill(this.groups, (Object)null);
    }

    public void clearFilesGroup(int var1) {
        Arrays.fill(this.files[var1], (Object)null);
    }

    public void clearFiles() {
        for (Object[] file : this.files) {
            if (file != null)
                Arrays.fill(file, (Object)null);
        }
    }

    boolean buildFiles(int groupIndex, int[] files) {
        if (this.groups[groupIndex] == null)
            return false;
        int fileCount = this.fileCounts[groupIndex];
        int[] fileId = this.fileIds[groupIndex];
        Object[] fileArray = this.files[groupIndex];
        boolean built = true;
        for (int fileIndex = 0; fileIndex < fileCount; fileIndex++) {
            if (fileArray[fileId[fileIndex]] == null) {
                built = false;
                break;
            }
        }
        if (!built) {
            byte[] data;
            if (files == null || (files[0] == 0 && files[1] == 0 && files[2] == 0 && files[3] == 0)) {
                data = method5224(this.groups[groupIndex], false);
            } else {
                data = method5224(this.groups[groupIndex], true);
                Buffer buffer = new Buffer(data);
                buffer.xteaDecrypt(files, 5, buffer.payload.length);
            }
            byte[] uncompressedData = decompress(data);
            if (this.releaseGroups)
                this.groups[groupIndex] = null;
            if (fileCount > 1) {
                int uncompressedDataLength = uncompressedData.length;
                uncompressedDataLength--;
                int lastByteIndex = uncompressedData[uncompressedDataLength] & 0xFF;
                uncompressedDataLength -= lastByteIndex * fileCount * 4;
                Buffer buffer = new Buffer(uncompressedData);
                int[] fileOffsets = new int[fileCount];
                buffer.pos = uncompressedDataLength;
                for (int var13 = 0; var13 < lastByteIndex; var13++) {
                    int offset = 0;
                    for (int j = 0; j < fileCount; j++) {
                        offset += buffer.readInt();
                        fileOffsets[j] = fileOffsets[j] + offset;
                    }
                }
                byte[][] var23 = new byte[fileCount][];
                for (int fileOffsetIndex = 0; fileOffsetIndex < fileCount; fileOffsetIndex++) {
                    var23[fileOffsetIndex] = new byte[fileOffsets[fileOffsetIndex]];
                    fileOffsets[fileOffsetIndex] = 0;
                }
                buffer.pos = uncompressedDataLength;
                int offsetIndex = 0;
                for (int currentByteIndex = 0; currentByteIndex < lastByteIndex; currentByteIndex++) {
                    int var24 = 0;
                    for (int fileIdValue = 0; fileIdValue < fileCount; fileIdValue++) {
                        var24 += buffer.readInt();
                        System.arraycopy(uncompressedData, offsetIndex, var23[fileIdValue], fileOffsets[fileIdValue], var24);
                        fileOffsets[fileIdValue] = fileOffsets[fileIdValue] + var24;
                        offsetIndex += var24;
                    }
                }
                for (int i = 0; i < fileCount; i++) {
                    if (!this.shallowFiles) {
                        Object fileObject;
                        int fileIdValue = fileId[i];
                        byte[] fileData = var23[i];
                        if (fileData == null) {
                            fileObject = null;
                        } else if (fileData.length > 136) {
                            DirectByteArrayCopier var20 = new DirectByteArrayCopier();
                            var20.set(fileData);
                            fileObject = var20;
                        } else {
                            fileObject = fileData;
                        }
                        fileArray[fileIdValue] = fileObject;
                    } else {
                        fileArray[fileId[i]] = var23[i];
                    }
                }
            } else if (!this.shallowFiles) {
                Object var26;
                int lastByteIndex = fileId[0];
                if (uncompressedData.length > 136) {
                    DirectByteArrayCopier var27 = new DirectByteArrayCopier();
                    var27.set(uncompressedData);
                    var26 = var27;
                } else {
                    var26 = uncompressedData;
                }
                fileArray[lastByteIndex] = var26;
            } else {
                fileArray[fileId[0]] = uncompressedData;
            }
        }
        return true;
    }

    public int getGroupId(String groupName) {
        groupName = groupName.toLowerCase();
        return this.groupNameHashTable.get(StringUtils.hashString(groupName));
    }

    public int getFileId(int groupID, String fileName) {
        fileName = fileName.toLowerCase();
        return this.fileNameHashTables[groupID].get(StringUtils.hashString(fileName));
    }

    public boolean isValidFileName(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var3 = this.groupNameHashTable.get(StringUtils.hashString(var1));
        if (var3 < 0)
            return false;
        int var4 = this.fileNameHashTables[var3].get(StringUtils.hashString(var2));
        return (var4 >= 0);
    }
    public byte[] takeFileByNames(int var1, String var2) {
        var2 = var2.toLowerCase();
        int var4 = this.fileNameHashTables[var1].get(StringUtils.hashString(var2));
        return takeFile(var1, var4);
    }
    public byte[] takeFileByNames(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var3 = this.groupNameHashTable.get(StringUtils.hashString(var1));
        int var4 = this.fileNameHashTables[var3].get(StringUtils.hashString(var2));
        return takeFile(var3, var4);
    }

    public boolean tryLoadFileByNames(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var3 = this.groupNameHashTable.get(StringUtils.hashString(var1));
        int var4 = this.fileNameHashTables[var3].get(StringUtils.hashString(var2));
        return tryLoadFile(var3, var4);
    }

    public boolean tryLoadGroupByName(String var1) {
        var1 = var1.toLowerCase();
        int var2 = this.groupNameHashTable.get(StringUtils.hashString(var1));
        return tryLoadGroup(var2);
    }

    public void loadRegionFromName(String var1) {
        var1 = var1.toLowerCase();
        int var2 = this.groupNameHashTable.get(StringUtils.hashString(var1));
        if (var2 >= 0)
            loadRegionFromGroup(var2);
    }

    public int groupLoadPercentByName(String var1) {
        var1 = var1.toLowerCase();
        int var2 = this.groupNameHashTable.get(StringUtils.hashString(var1));
        return groupLoadPercent(var2);
    }

    public static boolean method6619(int var0) {
        return ((var0 >> 20 & 0x1) != 0);
    }

    public static int method6625(int var0) {
        if (var0 > 0)
            return 1;
        return (var0 < 0) ? -1 : 0;
    }

    public static byte[] method5224(Object var0, boolean var1) {
        if (var0 == null)
            return null;
        if (var0 instanceof byte[]) {
            byte[] var6 = (byte[])var0;
            if (var1) {
                int var4 = var6.length;
                byte[] var5 = new byte[var4];
                System.arraycopy(var6, 0, var5, 0, var4);
                return var5;
            }
            return var6;
        }
        if (var0 instanceof AbstractByteArrayCopier) {
            AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
            return var2.get();
        }
        throw new IllegalArgumentException();
    }

    public static final byte[] decompressBytes(byte[] var0) {
        Buffer var1 = new Buffer(var0);
        int var2 = var1.readUnsignedByte();
        int var3 = var1.readInt();
        if (var3 >= 0 && (maxSize == 0 || var3 <= maxSize)) {
            if (var2 == 0) {
                byte[] var4 = new byte[var3];
                var1.readBytes(var4, 0, var3);
                return var4;
            }
            int var6 = var1.readInt();
            if (var6 < 0 || (maxSize != 0 && var6 > maxSize))
                throw new RuntimeException();
            byte[] var5 = new byte[var6];
            if (var2 == 1) {
                BZip2Decompressor.decompress(var5, var6, var0, var3, 9);
            } else {
                GzDecompressor.SINGLETON.decompress(var1, var5);
            }
            return var5;
        }
        throw new RuntimeException();
    }

    public static byte[] decompress(byte[] compressedData) {
        Buffer buffer = new Buffer(compressedData);
        int compressionType = buffer.readUnsignedByte();
        int compressedSize = buffer.readInt();
        if (compressedSize < 0 || (maxSize != 0 && compressedSize > maxSize))
            throw new IllegalArgumentException("Invalid compressed data");
        if (compressionType == 0) {
            byte[] uncompressedData = new byte[compressedSize];
            buffer.readBytes(uncompressedData, 0, compressedSize);
            return uncompressedData;
        }
        int uncompressedSize = buffer.readInt();
        if (uncompressedSize >= 0 && (maxSize == 0 || uncompressedSize <= maxSize)) {
            byte[] uncompressedData = new byte[uncompressedSize];
            if (compressionType == 1) {
                BZip2Decompressor.decompress(uncompressedData, uncompressedSize, compressedData, compressedSize, 9);
            } else {
                gzipDecompressor.decompress(buffer, uncompressedData);
            }
            return uncompressedData;
        }
        System.out.println("invalid data length: " + compressedData.length);
        throw new IllegalArgumentException("Invalid compressed data");
    }
}


