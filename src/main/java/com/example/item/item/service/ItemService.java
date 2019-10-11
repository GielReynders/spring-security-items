package com.example.item.item.service;

import com.example.item.item.ItemEntity;
import com.example.item.item.repository.ItemRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemEntity> findAll() {
        return itemRepository.findAll();
    }
}
