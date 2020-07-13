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

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable(name = "id") Integer id){
        System.out.println("getUser被访问...端口:"+port);
        return userService.getUserById(id);
    }

    @GetMapping(value = "/getUser")
    public List<User> getUsers(){
        return userService.getUsers();
    }

//    public void buyMovie(Integer id){
//
//    }

    /**
     *
     * @param uid
     * @param mid
     * @return
     */
    @GetMapping(value = "/getUserAndMovie/{uid}/{mid}")
    public Map<String,Object> getUserAndMovie(@PathVariable(value = "uid") Integer uid,@PathVariable(value = "mid") Integer mid){
        System.out.println("getUserAndMovie被访问了....当前服务端口:"+port);
        return userService.getUserAndMovie(uid,mid);
    }
}
