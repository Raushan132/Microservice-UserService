package com.userservice.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.app.entities.User;

public interface UserRepo extends JpaRepository<User, String> {

}
