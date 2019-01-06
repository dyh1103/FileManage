package com.dyh.fms.service;

import com.dyh.fms.bean.User;
import com.dyh.fms.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public List<User> findAll()
    {
         return   userDao.findAll();
    }
}
