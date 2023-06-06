package org.example.controller;

import org.example.model.Item;
import lombok.RequiredArgsConstructor;
import org.example.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/item")
    public Item add(@RequestBody Item item){
        return itemService.add(item);
    }

    @GetMapping("/item/{id}")
    public Item findById(@PathVariable long id) {
        return itemService.findById(id);
    }
    @GetMapping("/item")
    public List<Item> findBySchool(@RequestParam(value="school") int school) {
        return itemService.findBySchool(school);
    }

    @PutMapping("/item")
    public Item update(@RequestBody Item item){
        return itemService.update(item);
    }

    @DeleteMapping("/item/{id}")
    public void deleteById(@PathVariable long id){
        itemService.deleteById(id);
    }
}
