package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {

	@RequestMapping("/welcome")
	public @ResponseBody String welcome(){
		return "Welcome!";
	}
	
}
