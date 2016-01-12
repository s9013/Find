package com.find.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*
*@author jay
*@date	 Jan 11, 2016
*
*/
@RestController
@RequestMapping(value="test")
public class testController {

	@RequestMapping("/hello")
	public String hello(){
		return "hello world";
	}
	
}
