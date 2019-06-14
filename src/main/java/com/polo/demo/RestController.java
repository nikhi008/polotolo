package com.polo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController 
{
	
	@GetMapping("/")
	public String show() 
	{
		System.out.println("in cnt");
	     return "hello";  
	}

}
