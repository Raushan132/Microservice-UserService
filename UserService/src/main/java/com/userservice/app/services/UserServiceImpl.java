package com.userservice.app.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.app.entities.User;
import com.userservice.app.exception.ResourceNotFoundException;
import com.userservice.app.repositories.UserRepo;


@Service
public class UserServiceImpl  implements UserServices{
	
	
	@Autowired
	private UserRepo userRepo;

	public User saveUser(User user) {
		
		
	  String userId=UUID.randomUUID().toString();
	  user.setId(userId);
		
		return userRepo.save(user);
	}

	public List<User> getAllUser() {
		
		return userRepo.findAll();
	}

	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User Not found"));
	}

}
