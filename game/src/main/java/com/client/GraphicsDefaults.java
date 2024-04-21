package com.client;

import com.client.js5.disk.AbstractArchive;
import lombok.ToString;

@ToString
public class GraphicsDefaults {

    public int compass = 169;

    public int field4588 = 424;

    public int mapScenes = 317;

    public int headIconsPk = 439;

    public int headIconArchive = 440;

    public int field4587 = 441;

    public int field4591 = 442;

    public int field4589 = 299;

    public int field4590 = 300;

    public int field4586 = 317;

    public int field4592 = 423;


    public void decode(AbstractArchive archive) {
        byte[] data = archive.takeFileFlat(DefaultsGroup.groups.group);
        Buffer buffer = new Buffer(data);

        while(true) {
            int opcode = buffer.readUnsignedByte();
            if (opcode == 0) {
                return;
            }

            switch (opcode) {
                case 1:
                    buffer.readMedium();
                    break;
                case 2:
                    this.compass = buffer.readNullableLargeSmart();
                    this.field4588 = buffer.readNullableLargeSmart();
                    this.mapScenes = buffer.readNullableLargeSmart();
                    this.headIconsPk = buffer.readNullableLargeSmart();
                    this.headIconArchive = buffer.readNullableLargeSmart();
                    this.field4587 = buffer.readNullableLargeSmart();
                    this.field4591 = buffer.readNullableLargeSmart();
                    this.field4589 = buffer.readNullableLargeSmart();
                    this.field4590 = buffer.readNullableLargeSmart();
                    this.field4586 = buffer.readNullableLargeSmart();
                    this.field4592 = buffer.readNullableLargeSmart();
            }
        }
    }
}

