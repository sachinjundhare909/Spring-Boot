package com.first.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/get")
	public String getMessage() {
		return "Hello Sachin";
	}
}