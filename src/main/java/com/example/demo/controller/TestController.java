package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/hello")
	public String hello() {
		return "你好！";
	}


	@RequestMapping("/")
	public String index(){
		return  "hello world";
	}
}
