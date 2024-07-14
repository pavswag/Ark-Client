package com.client.js5.disk;

import com.client.Buffer;
import com.client.DirectByteArrayCopier;
import com.client.js5.Js5ArchiveIndex;
import net.runelite.rs.api.RSArchive;

import java.util.Arrays;

public class LocalArchive extends AbstractArchive implements RSArchive {
    private final ArchiveDisk archiveDisk;
    private final ArchiveDisk masterDisk;
    private final int index;
    private volatile int loading = 0;
    private final boolean verifyChecksums;
    private volatile boolean[] validGroups;
    private int indexCrc;
    private int indexVersion;
    private int field4206 = -1;
    private final boolean prioritizeRequests;

    public LocalArchive(ArchiveDisk archiveDisk, ArchiveDisk masterDisk, Js5ArchiveIndex js5ArchiveIndex, boolean useWhirlpool, boolean useGzip, boolean verifyChecksums, boolean prioritizeRequests) {
        super(useWhirlpool, useGzip);
        this.archiveDisk = archiveDisk;
        this.masterDisk = masterDisk;
        this.index = js5ArchiveIndex.getId();
        this.verifyChecksums = verifyChecksums;
        this.prioritizeRequests = prioritizeRequests;
        System.out.println(index + " - " + js5ArchiveIndex.getId() + " - " + js5ArchiveIndex.name());
        loadIndexFromDisk();
    }

    private void loadIndexFromDisk() {
        byte[] indexData = masterDisk.read(index);
        if (indexData != null) {
            Buffer buffer = new Buffer(decompressBytes(indexData));
            int version = buffer.readUnsignedByte();
            if (version == 5 || version == 6) {
                if (version >= 6) {
                    indexVersion = buffer.readInt();
                }
                decodeIndex(indexData);
                loadAllLocal();
            } else {
                throw new RuntimeException("Unsupported index version: " + version);
            }
        } else {
            throw new RuntimeException("Failed to read index from disk");
        }
    }

    private void processArchiveData(ArchiveDisk disk, int groupId, byte[] data) {
        if (index == Js5ArchiveIndex.CONFIGS.getId() && groupId == 42) {
            System.out.println("Processing config data for groupId: " + groupId);
        }
        boolean forcedLoad = false;
        if (data != null && data.length > 2) {
            Buffer buffer = new Buffer(data);
            int crc = buffer.readInt();
            int version = buffer.readUnsignedShort();
            if (index == Js5ArchiveIndex.CONFIGS.getId() && groupId == 42) {
                System.out.println("CRC: " + crc + ", Version: " + version + ", Expected CRC: " + this.groupCrcs[groupId] + ", Expected Version: " + this.groupVersions[groupId]);
            }
            if (crc == this.groupCrcs[groupId] && version == this.groupVersions[groupId]) {
                this.validGroups[groupId] = true;
                this.groups[groupId] = data;
                if (index == Js5ArchiveIndex.CONFIGS.getId() && groupId == 42) {
                    System.out.println("Group " + groupId + " is valid for configs");
                }
            } else {
                this.validGroups[groupId] = true; // Forcefully mark as valid
                this.groups[groupId] = data; // Forcefully load data
                forcedLoad = true;
                if (index == Js5ArchiveIndex.CONFIGS.getId() && groupId == 42) {
                    System.out.println("Group " + groupId + " is invalid for configs but forcefully loaded. CRC or version mismatch.");
                }
            }
        } else {
            this.validGroups[groupId] = false;
            if (index == Js5ArchiveIndex.CONFIGS.getId() && groupId == 42) {
                System.out.println("Group " + groupId + " is invalid for configs. Data is null or too short.");
                loadGroup(42);
            }
        }
    }

    public void loadAllLocal() {
        this.validGroups = new boolean[this.groups.length];
        Arrays.fill(this.validGroups, false);
        if (this.archiveDisk == null) {
            this.loading = 1;
        } else {
            this.field4206 = -1;
            for (int i = 0; i < this.validGroups.length; i++) {
                if (this.fileCounts[i] > 0) {
                    byte[] data = archiveDisk.read(i);
                    if (index == Js5ArchiveIndex.CONFIGS.getId() && i == 42) {
                        System.out.println("Loading group " + i + " for configs, data length: " + (data != null ? data.length : "null"));
                    }
                    if (data != null && index == Js5ArchiveIndex.CONFIGS.getId() && i == 42) {
                        System.out.println("Data for group " + i + ": " + Arrays.toString(data));
                    }
                    processArchiveData(archiveDisk, i, data);
                    if (this.validGroups[i]) {
                        this.field4206 = i;
                    }
                }
            }
            if (this.field4206 == -1) {
                this.loading = 1;
            }
            if (index == Js5ArchiveIndex.CONFIGS.getId() && !this.validGroups[42]) {
                System.out.println("Group 42 failed to load initially, attempting to reload");
                loadGroup(42);
            }
        }
    }

    public void loadGroup(int group) {
        if (this.archiveDisk != null && this.validGroups != null && this.validGroups[group]) {
            if (index == Js5ArchiveIndex.CONFIGS.getId() && group == 42) {
                System.out.println("Loading group " + group + " for configs");
            }
            byte[] data = archiveDisk.read(group);
            processArchiveData(archiveDisk, group, data);
        }
    }

    public boolean isLoading() {
        return this.loading == 1;
    }

    public boolean isFullyLoaded() {
        for (int i = 0; i < this.validGroups.length; i++) {
            if (index == Js5ArchiveIndex.CONFIGS.getId() && i == 42) {
                System.out.println("Checking if group " + i + " is fully loaded for configs");
            }
            if (this.fileCounts[i] > 0 && !this.validGroups[i]) {
                if (index == Js5ArchiveIndex.CONFIGS.getId() && i == 42) {
                    System.out.println("Group " + i + " is not fully loaded for configs");
                }
                return false;
            }
        }
        return true;
    }

    public int percentage() {
        if (this.loading != 1 && (!this.prioritizeRequests || this.loading != 2)) {
            return calculatePercentage();
        }
        return 100;
    }

    private int calculatePercentage() {
        int totalPercentage = 0;
        int loadedPercentage = 0;
        for (int group = 0; group < this.groups.length; group++) {
            if (this.fileCounts[group] > 0) {
                totalPercentage += 100;
                loadedPercentage += groupLoadPercent(group);
                if (index == Js5ArchiveIndex.DAT_IDX.getId() ) {
                    System.out.println("Group " + group + " load percent: " + groupLoadPercent(group) + " - file count = " + getGroupFileCount(group));
                }
            }
        }
        if (totalPercentage == 0) return 100;
        return loadedPercentage * 100 / totalPercentage;
    }

    public boolean isGroupValid(int group) {
        return this.validGroups[group];
    }

    public boolean isGroupIdsValid(int group) {
        return getGroupFileIds(group) != null;
    }

    public int loadPercent() {
        return calculatePercentage();
    }

    public void write(int groupId, byte[] data, boolean decode, boolean saveToDisk) {
        if (decode) {
            if (this.loading == 1) throw new RuntimeException("Already loading");
            if (this.masterDisk != null) writeDataToDisk(this.index, data, this.masterDisk);
            decodeIndex(data);
            loadAllLocal();
        } else {
            data[data.length - 2] = (byte) (this.groupVersions[groupId] >> 8);
            data[data.length - 1] = (byte) this.groupVersions[groupId];
            if (this.archiveDisk != null && saveToDisk) {
                writeDataToDisk(groupId, data, this.archiveDisk);
                this.validGroups[groupId] = true;
            }
            this.groups[groupId] = data;
        }
    }

    private void writeDataToDisk(int groupId, byte[] data, ArchiveDisk disk) {
        disk.write(groupId, data, data.length);
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public byte[] getConfigData(int archiveId, int fileId) {
        return takeFile(archiveId, fileId);
    }

    @Override
    public boolean isOverlayOutdated() {
        return false;
    }

    @Override
    public int[] getFileIds(int groupId) {
        return (groupId >= 0 && groupId < this.fileIds.length) ? this.fileIds[groupId] : null;
    }

    @Override
    public int[][] getFileIds() {
        return this.fileIds;
    }

    @Override
    public int[] getFileCounts() {
        return this.fileCounts;
    }
}
