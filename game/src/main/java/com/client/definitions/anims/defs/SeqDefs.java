package com.client.definitions.anims.defs;

import com.client.InputBuffer;
import com.client.definitions.SequenceDefinition;
import com.client.definitions.anims.decoder.Decoder;
import com.client.definitions.anims.decoder.impl.SeqDefinitionDecoderOSRS;
import com.client.osrs.CacheWrapper;
import com.displee.cache.index.Index;
import com.displee.cache.index.archive.Archive;
import com.displee.cache.index.archive.file.File;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class SeqDefs {

    private SequenceDefinition[] definitions;

    public SequenceDefinition get(int id) {
        return definitions[id];
    }

    public static SeqDefs load(CacheWrapper cacheWrapper) {
        return loadOSRS(cacheWrapper);
    }

    private static SeqDefs loadOSRS(CacheWrapper cacheWrapper) {

        Index index = cacheWrapper.getIndex(2);
        Archive archive = index.archive(12);

        int highestId = 0;
        if (archive != null) {
            highestId = archive.fileIds()[archive.fileIds().length - 1];
        }
        SequenceDefinition[] definitions = new SequenceDefinition[highestId + 1];

        Decoder<SequenceDefinition> decoder = new SeqDefinitionDecoderOSRS();

        if (archive != null) {
            for (File file : archive.getFiles().values()) {
                int id = file.getId();
                SequenceDefinition seqDefinition = new SequenceDefinition();
                seqDefinition.setId(id);
                InputBuffer dataBuffer = new InputBuffer(Objects.requireNonNull(file, "Data file cannot be null")
                        .getData());
                decoder.decode(dataBuffer, seqDefinition);
                seqDefinition.postDecode();
                definitions[id] = seqDefinition;
            }
        }
        System.out.println("Loaded " + definitions.length + " sequence definitions");
        return new SeqDefs(definitions);
    }
}
