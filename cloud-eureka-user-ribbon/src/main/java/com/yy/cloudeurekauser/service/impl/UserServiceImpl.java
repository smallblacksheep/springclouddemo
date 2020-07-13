package com.yy.cloudeurekauser.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yy.cloudeurekauser.bean.Movie;
import com.yy.cloudeurekauser.bean.User;
import com.yy.cloudeurekauser.dao.UserDao;
import com.yy.cloudeurekauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    RestTemplate restTemplate;

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUsers(){
        return userDao.getUsers();
    }

    @HystrixCommand(fallbackMethod = "getDefaultMovie")
    @Override
    public Map<String, Object> getUserAndMovie(Integer uid, Integer mid) {
        Movie movie = restTemplate.getForObject("http://CLOUD-EUREKA-MOVIE-RIBBON/movie/getMovie/{mid}", Movie.class,mid);
        User user = getUserById(uid);
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        map.put("movie",movie);
        return map;
    }

    public Map<String,Object> getDefaultMovie(Integer uid, Integer mid){
        User user = getUserById(uid);
        Movie movie =new Movie(mid,"未查询到相关电影信息....");
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        map.put("movie",movie);
        return map;
    }
}
