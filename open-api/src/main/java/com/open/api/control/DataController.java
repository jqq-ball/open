package com.open.api.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@Value("${profile}")
	public String profile;
	
	@GetMapping("/hello")
	public String hello(){
		return this.profile;
	}
}
