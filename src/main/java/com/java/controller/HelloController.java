package com.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping
	public String msg()
	{
		return "Hello to Jenkins";
	}

}
