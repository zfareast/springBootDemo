package com.example.springBootDemo.controller;

import com.example.springBootDemo.domain.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/13.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return new User(id, "admin", 25);
    }
}
