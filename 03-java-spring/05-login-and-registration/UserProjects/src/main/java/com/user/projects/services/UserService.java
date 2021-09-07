package com.user.projects.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.projects.models.User;
import com.user.projects.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
    private  UserRepository userRepository;
    
   
}