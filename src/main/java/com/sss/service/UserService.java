package com.sss.service;

import com.sss.mapper.a.UserADao;
import com.sss.mapper.b.UserBDao;
import com.sss.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserADao userDao;

    @Autowired
    private UserBDao userBDao;


    public List<User> getAll(){
        return userDao.getAll();
    }

    public List<User> getAllB(){
        return userBDao.getAll();
    }

    public void updateTest(String id,String name){
        userDao.updateTest(id,name);
        return ;
    }


}
