package com.yy.cloudeurekauser.service.impl;

import com.yy.cloudeurekauser.bean.Movie;
import com.yy.cloudeurekauser.bean.User;
import com.yy.cloudeurekauser.dao.UserDao;
import com.yy.cloudeurekauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUsers(){
        return userDao.getUsers();
    }

    @Override
    public Map<String, Object> getUserAndMovie(Integer uid, Integer mid) {
        User user = getUserById(uid);
//        Movie movie = getMovieById(mid);
        Movie movie =new Movie(mid,"哪吒");
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        map.put("movie",movie);
        return map;
    }
}
