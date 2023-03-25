package com.userservice.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.app.entities.User;
import com.userservice.app.services.UserServices;

@RestController
@RequestMapping("users")
public class UserController {
    
	@Autowired
	private UserServices userServices;
	
	@GetMapping
	public List<User> getAllUser(){
		return userServices.getAllUser();
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable("userId") String id){
		
		return ResponseEntity.ok(userServices.getUser(id));
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
	     return ResponseEntity.status(HttpStatus.CREATED).body(userServices.saveUser(user));
	}
}
