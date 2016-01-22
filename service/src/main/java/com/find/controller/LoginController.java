package com.find.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

/**
*
*@author jay
*@date	 Jan 22, 2016
*
*/
@RestController
@RequestMapping(value="api")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public JSONPObject find(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password,
			@RequestParam(value = "callback", defaultValue = "JSON_CALLBACK") String callback) {
		logger.info(">> login ,username:{},password:{}",username,password);
		String result = "login success";
		logger.info(result.toString());
		return new JSONPObject(callback, result);
	}

}
