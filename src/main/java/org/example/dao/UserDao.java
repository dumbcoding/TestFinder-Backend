package org.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);
}