package com.raj.demodockerexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
	
	int a=1;
	
	int b=2;
	
	@RequestMapping(value="/in")
	public String show(){
		
		return "vaule of a + b="+(a+b);
		
	}

}
