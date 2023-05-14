package com.nitish.springboot.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.nitish.springboot.model.Devices;

@Controller
public class Store {
	
	private ModelAndView modelAndView;
	
	private Devices result;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String home() {
		return "home";
		
	}

	@GetMapping("/{brandName}")
	public ModelAndView samsung(@PathVariable("brandName") String brandName ) {
		
		modelAndView = new ModelAndView("viewDevices");
		switch (brandName.toLowerCase()) {
		case "samsung": {
			result = restTemplate.getForObject("http://SAMSUNG/samsung/devices", Devices.class);
			modelAndView.addObject("devices",result);
			return modelAndView;		
		}
		case "apple": {
				result = restTemplate.getForObject("http://APPLE/apple/devices", Devices.class);
				modelAndView.addObject("devices",result);
				return modelAndView;		
		}
		default:
			return new ModelAndView("redirect: /error");
		}		
	}
	
	
	
	
	}
