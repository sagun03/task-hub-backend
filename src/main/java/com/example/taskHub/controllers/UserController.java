package com.example.taskHub.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.taskHub.model.User;
import com.example.taskHub.service.UserService;
@Controller // This means that this class is a Controller
@RequestMapping(path="/taskUser") // This means URL's start with /demo (after Application path)
public class UserController {
  @Autowired
  private UserService userService;
  @PostMapping(path="/register",consumes = "application/json") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestBody (required=false)User user) {
return userService.registerUser(user);
  }
  @GetMapping(path="/getUsers")
  public @ResponseBody User getAllUsers() {
	return userService.getAllUsers();
  }

}
