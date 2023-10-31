package com.helloworld.demo.exceptions;

public class CustomException extends Exception {
	public CustomException() {}

	public CustomException(String m) {
		super(m);
	}
	public CustomException(Exception e) {
		super(e);
	}
	public CustomException(String m, Exception e) {
		super(m, e);
	}
}