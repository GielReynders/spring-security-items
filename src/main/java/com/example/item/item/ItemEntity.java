package com.example.item.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class ItemEntity {

    @Id
    private UUID uuid = UUID.randomUUID();

    @Column
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
