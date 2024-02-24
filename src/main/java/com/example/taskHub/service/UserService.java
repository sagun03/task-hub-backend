package com.example.taskHub.service;

//package com.example.demo.service; 
import com.example.taskHub.repository.UserRepository;
import com.example.taskHub.repository.userRepositoryImpl;

import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskHub.model.User;
import com.example.taskHub.repository.UserRepository; 
@Service
public class UserService {
	 @Autowired 
	 private  UserRepository userRepository;
	 @Autowired
	 private userRepositoryImpl userRepositoryImpl;
     public User getAllUsers() {
    	 
//    	 Optional<User> user =  userRepository.findById(1);
    	 User user =  userRepositoryImpl.getUser();
    	 System.out.println(user.getCustName());
    	 return user;
	}
     public String registerUser(User user) {
    	 userRepository.save(user);
    	 return "Saved";
	} 

}
