package com.practice.openapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {
	
	
	@GetMapping("/one")
	 public String sampleApi() {
		
		return "Sample Applcation for Open-API-03";
	}
	
	

}
