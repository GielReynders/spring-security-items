package com.example.item.item.dto;

import com.example.item.item.ItemEntity;
import org.springframework.stereotype.Repository;

public class ItemResource {
    private String name;

    public ItemResource(ItemEntity axe) {
        this.name = axe.getName();
    }

    public String getName() {
        return name;
    }

    public ItemEntity convert() {
        return new ItemEntity(this.name);
    }
}
