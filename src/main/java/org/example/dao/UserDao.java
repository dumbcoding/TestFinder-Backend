package org.example.dao;

import org.example.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.example.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM USER WHERE EMAIL = ?", nativeQuery = true)
    User findByEmail(String email);
    @Query(value = "SELECT NAME FROM USER WHERE ID = ?", nativeQuery = true)
    String findById(long id);
}