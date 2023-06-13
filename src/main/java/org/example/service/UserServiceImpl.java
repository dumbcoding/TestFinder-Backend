package org.example.service;

import org.example.dao.UserDao;
import org.example.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Override
    public User add(User user) {
        return userDao.save(user);
    }

    /*@Override
    public List<User> getAll() {
        return userDao.findAll();
    }*/

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public String findById(long id) {
        return userDao.findById(id);
    }

    @Override
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteById(long id) {
        userDao.deleteById(id);
    }
}