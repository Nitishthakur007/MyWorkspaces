package org.nitish.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
	
	 @RequestMapping("app") 
	 public String getHomepage() {
		 return "Hi welcome to spring boot";
		 }
	 
	

}
