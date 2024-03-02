package com.tech.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExpection1 {
	
	@ExceptionHandler(Addrsnotfound.class)
		
public ResponseEntity<Object>exception(Exception exception){
		return new ResponseEntity<Object>(exception.getMessage(),HttpStatus.NOT_FOUND);	
	}

}
