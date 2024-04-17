package net.runelite.client.plugins.hd.scene;

import java.io.IOException;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.plugins.hd.HdPlugin;
import net.runelite.client.plugins.hd.model.ModelPusher;
import net.runelite.client.plugins.hd.scene.model_overrides.ModelOverride;
import net.runelite.client.plugins.hd.utils.AABB;
import net.runelite.client.plugins.hd.utils.HDUtils;
import net.runelite.client.plugins.hd.utils.ModelHash;
import net.runelite.client.plugins.hd.utils.Props;
import net.runelite.client.plugins.hd.utils.ResourcePath;

import static net.runelite.client.plugins.hd.utils.ResourcePath.path;

@Singleton
@Slf4j
public class ModelOverrideManager {
    private static final ResourcePath MODEL_OVERRIDES_PATH =  Props.getPathOrDefault("rlhd.model-overrides-path",
        () -> path(ModelOverrideManager.class, "model_overrides.json"));

    @Inject
    private Client client;

    @Inject
    private ClientThread clientThread;

    @Inject
    private HdPlugin plugin;

    @Inject
    private ModelPusher modelPusher;

    private final HashMap<Long, ModelOverride> modelOverrides = new HashMap<>();
    private final HashMap<Long, AABB[]> modelsToHide = new HashMap<>();

    public void startUp() {
        MODEL_OVERRIDES_PATH.watch(path -> {
            modelOverrides.clear();
            modelsToHide.clear();

            try {
                ModelOverride[] entries = path.loadJson(plugin.getGson(), ModelOverride[].class);
                if (entries == null)
                    throw new IOException("Empty or invalid: " + path);
                for (ModelOverride override : entries) {
					override.gsonReallyShouldSupportThis();
                    for (int npcId : override.npcIds)
                        addEntry(ModelHash.packUuid(npcId, ModelHash.TYPE_NPC), override);
                    for (int objectId : override.objectIds)
                        addEntry(ModelHash.packUuid(objectId, ModelHash.TYPE_OBJECT), override);
                }

				clientThread.invoke(() -> {
					modelPusher.clearModelCache();
					if (client.getGameState() == GameState.LOGGED_IN)
						plugin.uploadScene();
				});

                if (RuneLiteProperties.DEBUG_MODE)log.debug("Loaded {} model overrides", modelOverrides.size());
            } catch (IOException ex) {
                log.error("Failed to load model overrides:", ex);
            }
        });
    }

    private void addEntry(long uuid, ModelOverride entry) {
        ModelOverride old = modelOverrides.put(uuid, entry);
        modelsToHide.put(uuid, entry.hideInAreas);

        if (Props.DEVELOPMENT && old != null) {
            if (entry.hideInAreas.length > 0) {
                log.warn("Replacing ID {} from '{}' with hideInAreas-override '{}'. This is likely a mistake...",
                    ModelHash.getIdOrIndex(uuid), old.description, entry.description);
            } else if (old.hideInAreas.length == 0) {
                log.warn("Replacing ID {} from '{}' with '{}'. The first-mentioned override should be removed.",
                    ModelHash.getIdOrIndex(uuid), old.description, entry.description);
            }
        }
    }

    public boolean shouldHideModel(long hash, int x, int z) {
		assert client.isClientThread();
        long uuid = ModelHash.getUuid(client, hash);

        AABB[] aabbs = modelsToHide.get(uuid);
        if (aabbs != null && hasNoActions(uuid)) {
            WorldPoint location = HDUtils.cameraSpaceToWorldPoint(client, x, z);
            for (AABB aabb : aabbs)
                if (aabb.contains(location))
                    return true;
        }

        return false;
    }

    private boolean hasNoActions(long uuid) {
        int id = ModelHash.getIdOrIndex(uuid);
        int type = ModelHash.getType(uuid);

        String[] actions = {};

        switch (type) {
            case ModelHash.TYPE_OBJECT:
                actions = client.getObjectDefinition(id).getActions();
                break;
            case ModelHash.TYPE_NPC:
                actions = client.getNpcDefinition(id).getActions();
                break;
        }

        for (String action : actions) {
            if (action != null)
                return false;
        }

        return true;
    }

    @NonNull
    public ModelOverride getOverride(long hash) {
        return modelOverrides.getOrDefault(ModelHash.getUuid(client, hash), ModelOverride.NONE);
    }
}
