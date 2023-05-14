package com.nitish.springboot.store;

import org.springframework.web.bind.annotation.GetMapping;


public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	
	public String getErrorPath() {
		return("/error");
	}

	
	@GetMapping("/error")
	public String error() {
		return "error";
}
}
