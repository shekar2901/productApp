package com.ojas.exception;

public class ResponseException {
	
	private String message;
	private boolean success;
	
	
	public ResponseException() {
		super();
	}
	
	
	public ResponseException(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	

}
