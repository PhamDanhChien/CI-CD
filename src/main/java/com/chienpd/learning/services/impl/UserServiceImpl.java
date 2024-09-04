package com.chienpd.learning.services.impl;

import com.chienpd.learning.repositories.UserRepository;
import com.chienpd.learning.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String getAllUsers() {
        return "All users";
    }
}
