package com.whuaz.spring.boot.mybatis.controller;

import com.whuaz.spring.boot.mybatis.entity.User;
import com.whuaz.spring.boot.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author grez
 * @since 19-4-28
 **/
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> optionalUser = this.userMapper.selectById(id);

        return this.userMapper.selectById(id).orElseThrow(() -> new IllegalArgumentException("This user does not exit!"));
    }
}
