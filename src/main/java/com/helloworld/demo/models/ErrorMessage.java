package com.helloworld.demo.models;

public class ErrorMessage {
	private int code;
	private String msg;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ErrorMessage(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
}
