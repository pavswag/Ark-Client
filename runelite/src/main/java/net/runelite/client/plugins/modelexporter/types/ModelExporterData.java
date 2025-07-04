package net.runelite.client.plugins.modelexporter.types;

import lombok.Data;
import lombok.Getter;

import javax.inject.Inject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

@Data
public class ModelExporterData {
    @Getter
    private Set<NPCData> npcData;
    private Set<NPCData> animationGroup;
    private HashMap<Integer, String> animationNames;

    public ModelExporterData() {
        try {
            this.npcData = new DataFetcher().getNPCData();
            this.animationGroup = new DataFetcher().getAnimationGroups();
            this.animationNames = new DataFetcher().getAnimationNames();
        } catch (IOException e) {
            this.npcData = null;
            this.animationGroup = null;
        }
    }
}
