package org.coresystems.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/developer")
public class ProgrammerController {
	
	@GetMapping("/hello")
	public String get(){
		return "hello world";
	}
}
