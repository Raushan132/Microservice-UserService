package com.userservice.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.userservice.app.services.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourseNotFoundExcpetion(ResourceNotFoundException  e){
		
		ApiResponse response= ApiResponse.builder().status(HttpStatus.NOT_FOUND).success(false).message(e.getMessage()).build();
		
		return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
		
		
	}

}
