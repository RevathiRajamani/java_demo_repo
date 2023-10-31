package com.helloworld.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.demo.exceptions.CustomException;
import com.helloworld.demo.models.Product;

@RestController
public class DemoController {
	@GetMapping("/greet")
	public String greet() {
		return "Hello World";
	}
	
	@PostMapping("/getProduct")
	public String getProduct(@RequestBody Product prod) throws CustomException {
		if (prod.getProductID() == null) {
			throw new CustomException("Product ID does not exist");
		}
		return prod.toString();
	}
}
