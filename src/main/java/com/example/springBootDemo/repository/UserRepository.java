package com.example.springBootDemo.repository;

import com.example.springBootDemo.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2018/11/14.
 */
public interface UserRepository {
    User saveOrUpdateUser(User user); // 新增或修改用户

    void deleteUser(Long id); // 删除用户

    User getUserById(Long id); // 根据用户id获取用户

    List<User> userList(); // 获取所有用户的列表
}
