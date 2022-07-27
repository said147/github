package com.example.github;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	@GetMapping("/ss")
	 public String sayHello() {
		 return "Hello from Azure";
	 }
}
