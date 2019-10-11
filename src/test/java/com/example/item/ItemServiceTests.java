package com.example.item;

import com.example.item.item.ItemEntity;
import com.example.item.item.dto.ItemResource;
import com.example.item.item.repository.ItemRepository;
import com.example.item.item.service.ItemService;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ItemServiceTests {

    @InjectMocks
    private ItemService itemService;

    @Mock
    private ItemRepository itemRepository;

    @Test
    @DisplayName("Get all items")
    void get_all_items() {
        ItemEntity axe = new ItemEntity("Axe");
        List<ItemEntity> itemEntities = Arrays.asList(axe);
        List<ItemResource> itemResources = Arrays.asList(new ItemResource(axe));

        Mockito.when(itemRepository.findAll()).thenReturn(itemEntities);

        Assertions.assertThat(itemService.findAll()).contains(axe);
    }
}
