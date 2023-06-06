package org.example.service;


import org.example.model.Item;

import java.util.List;

public interface ItemService {
    Item add(Item item);
    List<Item> getAll();
    Item findById(long id);
    List<Item> findBySchool(int school);
    Item update(Item item);
    void deleteById(long id);
}
