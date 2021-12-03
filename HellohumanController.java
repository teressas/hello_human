package com.teressas.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")

public class HellohumanController {
	
	@RequestMapping("")
	public String index(@RequestParam(value="firstname") String firstQuery, 
			@RequestParam(value="lastname") String secondQuery) {

		return "Hello " + firstQuery + " " + secondQuery;
	}
	
	@RequestMapping("/test")
	public String sensei(@RequestParam(value="firstname") String firstQuery, 
			@RequestParam(value="times") int secondQuery) {
		
		String str = "Hello " + firstQuery+ " ";
		
		String repeated = new String(new char[secondQuery]).replace("\0", str);

		return repeated;
	}
	


}
