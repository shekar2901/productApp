package com.ojas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ResponseException> resourceNotFound(ResourceNotFoundException r){
		
		String msg=r.getMessage();
		ResponseException rx=new ResponseException(msg,false);
		return new ResponseEntity<ResponseException>(rx,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	 public ResponseEntity<ResponseException> idNotFound(IdNotFoundException i){
		 
		 String msg=i.getMessage();
		 ResponseException rx=new ResponseException(msg,false);
			return new ResponseEntity<ResponseException>(rx,HttpStatus.NOT_FOUND);
		 
	 }

	
}
