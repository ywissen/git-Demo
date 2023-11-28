package com.wissen.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.security.model.Order;

@RestController
@RequestMapping("/api")
public class GitController {
	
	@GetMapping("/order/")
	public String getOrderDetails(@RequestBody Order order) {
		System.out.println("I am developer 1st commit");
		return order.getOname()+" "+order.getOid()+" "+order.getCost();
	}

}
