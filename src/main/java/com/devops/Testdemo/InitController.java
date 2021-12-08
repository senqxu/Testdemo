package com.devops.Testdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mytest")
public class InitController {
	@RequestMapping("/hello")
	public String hello(){
		return"If you see this info message,proves run sucess!";
	}
}
