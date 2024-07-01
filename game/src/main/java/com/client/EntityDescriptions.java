package com.client;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
class EntityDescription {
    public static List<EntityDescription> entityDescriptions = null;
    public static EntityDescription getItemDescription(int id) {
        return entityDescriptions.stream().filter(it -> it.type.equalsIgnoreCase("item")).filter(it -> it.id == id).findAny().orElse(null);
    }
    public static EntityDescription getNpcDescription(int id) {
        return entityDescriptions.stream().filter(it -> it.type.equalsIgnoreCase("npc")).filter(it -> it.id == id).findAny().orElse(null);
    }
    public static EntityDescription getObjectDescription(int id) {
        return entityDescriptions.stream().filter(it -> it.type.equalsIgnoreCase("object")).filter(it -> it.id == id).findAny().orElse(null);
    }
    private String type;
    private int id;
    private String description;
    private List<GameItem> items;
}
