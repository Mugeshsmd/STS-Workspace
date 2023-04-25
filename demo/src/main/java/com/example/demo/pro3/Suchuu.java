package com.example.demo.pro3;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Suchuu
{
	@Value("${namevalue:restapi}")
	
    public String name;
    
    @GetMapping("/velu")
	
	public String hight()
	{
		return "welcome to "+name;
	}

}
