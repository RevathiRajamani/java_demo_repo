package com.helloworld.demo.models;

public class Product {
	private Integer productID;
	private String productName;
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Product(Integer productID, String productName) {
		super();
		this.productID = productID;
		this.productName = productName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
