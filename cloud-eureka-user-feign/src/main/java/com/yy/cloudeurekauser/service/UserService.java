package com.yy.cloudeurekauser.service;

import com.yy.cloudeurekauser.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    User getUserById(Integer id);

    List<User> getUsers();

    Map<String, Object> getUserAndMovie(Integer uid, Integer mid);
}
