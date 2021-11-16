package com.adl.hellojwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	@RequestMapping("/api/hello")
	public String hello() {
		return "Hello ini bisa diakses";
	}

}
