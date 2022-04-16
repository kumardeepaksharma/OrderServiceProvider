package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@Value("${server.port}")
	private String port;
	
	
	@GetMapping("/status")
	public String getOrderStatus() {
	return "FINISHED:\"Hello from Order Provider\":"+port;
	}
	
	
    public void m1() {
    	System.out.println();
    }
}
