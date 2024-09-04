package com.chienpd.learning.controllers;

import com.chienpd.learning.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private Environment environment;

    @Value("${variables.var1}")
    private String var1;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAll() {
        return this.userService.getAllUsers();
    }
}
