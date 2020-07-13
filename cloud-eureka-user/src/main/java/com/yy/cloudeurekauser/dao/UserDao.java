package com.yy.cloudeurekauser.dao;

import com.yy.cloudeurekauser.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1,"沈一刀"));
        users.add(new User(2,"马总"));
        users.add(new User(3,"巫总"));
        users.add(new User(4,"徐总"));
        users.add(new User(5,"汪总"));
        users.add(new User(6,"旻昇"));
        users.add(new User(7,"壮壮"));
        users.add(new User(8,"徐帆"));
    }

    /**
     * 根据用户id获取用户对象
     * @param id
     * @return
     */
    public User getUserById(Integer id) {
        return users.get(id-1);
    }

    /**
     * 获取所有用户对象
     * @return
     */
    public List<User> getUsers(){
        return users;
    }
}
