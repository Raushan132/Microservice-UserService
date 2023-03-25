package com.userservice.app.services;

import java.util.List;

import com.userservice.app.entities.User;

public interface UserServices {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);

}
