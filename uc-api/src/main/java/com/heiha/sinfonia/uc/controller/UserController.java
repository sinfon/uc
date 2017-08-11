package com.heiha.sinfonia.uc.controller;

import com.alibaba.fastjson.JSON;
import com.heiha.sinfonia.uc.po.User;
import com.heiha.sinfonia.uc.service.UserService;
import com.heiha.sinfonia.uc.vo.UserQuery;
import com.heiha.sinfonia.uc.vo.UserResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 13:07<br>
 * <b>Author:</b> heiha<br>
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        LOGGER.info("Create User: {}", JSON.toJSONString(user));
        return userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public UserResult listUser(UserQuery userQuery) {
        return userService.listUser(userQuery);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer userId) {
        return userService.getUser(userId);
    }
}
