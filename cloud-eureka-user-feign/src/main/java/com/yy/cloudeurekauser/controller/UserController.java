package com.yy.cloudeurekauser.controller;

import com.yy.cloudeurekauser.bean.User;
import com.yy.cloudeurekauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Value("${server.port}")
    Integer port;

    @Autowired
    UserService userService;

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable(name = "id") Integer id){
        return userService.getUserById(id);
    }

    /**
     * 获取所有用户信息
     * @return
     */
    @GetMapping(value = "/getUser")
    public List<User> getUsers(){
        return userService.getUsers();
    }


    /**
     *获取用户信息和电影信息
     * @param uid
     * @param mid
     * @return
     */
    @GetMapping(value = "/getUserAndMovie/{uid}/{mid}")
    public Map<String,Object> getUserAndMovie(@PathVariable(value = "uid") Integer uid,@PathVariable(value = "mid") Integer mid){
        System.out.println("getUserAndMovie被调用... 当前服务端口号:"+port);
        return userService.getUserAndMovie(uid,mid);
    }
}
