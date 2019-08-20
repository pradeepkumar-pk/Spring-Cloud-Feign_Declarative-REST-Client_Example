package com.spring.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.feign.client.UserClient;
import com.spring.feign.model.UserResponse;

@RestController
public class UserController {
	
	@Autowired
	public UserClient userClient;
	
	@GetMapping("/findAllUsers")
	public List<UserResponse> getAllUsers() {
		return userClient.getUsers();
	}

}
