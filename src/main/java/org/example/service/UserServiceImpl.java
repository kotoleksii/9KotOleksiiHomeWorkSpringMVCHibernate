package org.example.service;

import org.example.dao.UserDAO;
import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
//        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
//        return userDAO.getUserById(id);
        return null;
    }

    @Override
    @Transactional
    public void deleteUserById(int id) {
//        userDAO.deleteUserById(id);
    }
}
