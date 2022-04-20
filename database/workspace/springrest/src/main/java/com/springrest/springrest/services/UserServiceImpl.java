package com.springrest.springrest.services;

import com.springrest.springrest.dao.UserDao;
import com.springrest.springrest.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new User(145, "Deepraj","deeprajm35@gmail.com","8668221572"));
//        list.add(new User(146, "Raj","Raj777@gmail.com","8678954512"));
    }


    @Override
    public List<User> getUser() {
        return userDao.findAll();
    }

    @Override
    public User getUser(long UserId) {


        return userDao.getById(UserId);


    }

    @Override
    public User addUser(User user) {

        userDao.save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userDao.save(user);

        return user;
    }

    @Override
    public void deleteUser(long  parseLong) {
      User entity = userDao.getById(parseLong);
      userDao.delete(entity);
    }
}
