package com.helloworld.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.helloworld.demo.models.ErrorMessage;

@ControllerAdvice
public class CustomExceptionHandler {
	// ExceptionHandler
	@ExceptionHandler(value = { CustomException.class })
	public ResponseEntity<ErrorMessage> exceptionHandler(CustomException e){
		return new ResponseEntity<ErrorMessage>(
				new ErrorMessage(500, e.getMessage())
				, HttpStatus.OK);
	}
}
