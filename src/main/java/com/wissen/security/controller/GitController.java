package com.wissen.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GitController {
	
	@GetMapping("/order/{oid}/{oname}/{cost}")
	public String getOrderDetails(@PathVariable Integer oid,@PathVariable String oname,@PathVariable Long cost) {
		return oid+" "+oname+" "+cost;
	}

}
