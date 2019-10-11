package com.example.item.item;

import java.util.UUID;

public class ItemEntity {

    private UUID uuid = UUID.randomUUID();

    private String name;

    public ItemEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }
}
