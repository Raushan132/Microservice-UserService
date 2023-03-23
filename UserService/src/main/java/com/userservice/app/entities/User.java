package com.userservice.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class User {
	
	@Id
	private long id;
	private String name;
	private String email;
	private String about;

}
