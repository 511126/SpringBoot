package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是一个spring-boot示例
 * @author 511126
 *
 */
@RestController 
public class HelloWorld {
	
	@RequestMapping("/helloworld")
	public String sayHello() {
		return "Hello World";
	}
}
