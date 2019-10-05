package com.home.item.item;

import com.home.item.items.io.core.web.ItemController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ItemController.class)
@ExtendWith(SpringExtension.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeAll
    void setUp() {

    }

    @Test
    public void getAllItems_returnsListOfItems() throws Exception {
        mockMvc.perform(get("/v1/items"))
                .andExpect(status().isOk());
    }
}
