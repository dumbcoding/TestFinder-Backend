package org.example.service;

import java.util.List;
import org.example.model.User;
public interface UserService {
    User add(User user);
    List<User> getAll();
    User findByEmail(String email);
    User update(User user);
    void deleteById(long id);
}