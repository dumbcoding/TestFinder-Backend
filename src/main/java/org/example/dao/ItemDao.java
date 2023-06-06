package org.example.dao;


import org.example.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDao extends JpaRepository<Item, Long> {
    @Query(value = "SELECT * FROM ITEM WHERE SCHOOL = ?", nativeQuery = true)
    List<Item> findBySchool(int school);
    @Query(value = "SELECT * FROM ITEM WHERE ID = ?", nativeQuery = true)
    Item findById(long id);
}