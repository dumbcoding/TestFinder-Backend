package org.example.service;

import org.example.dao.ItemDao;
import org.example.model.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemDao itemDao;

    @Override
    public Item add(Item item) {
        return itemDao.save(item);
    }

    @Override
    public List<Item> getAll() {
        return itemDao.findAll();
    }

    @Override
    public Item findById(long id) {
        return itemDao.findById(id);
    }
    @Override
    public List<Item> findBySchool(int school) {
        return itemDao.findBySchool(school);
    }

    @Override
    public List<Item> findByUser(long user_id) {
        return itemDao.findByUser(user_id);
    }

    @Override
    public Item update(Item item) {
        return itemDao.save(item);
    }

    @Override
    public void deleteById(long id) {
        itemDao.deleteById(id);
    }
}
