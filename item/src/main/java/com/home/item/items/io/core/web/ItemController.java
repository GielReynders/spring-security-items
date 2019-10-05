package com.home.item.items.io.core.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/v1/items")
public class ItemController {

    @GetMapping()
    public ResponseEntity getAllItems() {
        return ResponseEntity.ok().build();
    }
}
