package com.example.item.item.web;

import com.example.item.item.ItemEntity;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/v1/items")
public class ItemController {

    @GetMapping
    public ResponseEntity<List<ItemEntity> > getAllItems() {
        List<ItemEntity> expected = Arrays.asList(new ItemEntity("Axe"));
        return ResponseEntity.ok(expected);
    }
}
