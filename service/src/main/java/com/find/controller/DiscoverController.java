package com.find.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.find.vo.DiscoverVo;

/**
*
*@author jay
*@date	 Jan 22, 2016
*
*/
@RestController
@RequestMapping(value="discover")
public class DiscoverController {

	private Logger logger = LoggerFactory.getLogger(DiscoverController.class);
	
	@RequestMapping("/find")
	public JSONPObject find(@RequestParam(value = "city", defaultValue = "shanghai") String city,
			@RequestParam(value = "callback", defaultValue = "JSON_CALLBACK") String callback) {
		logger.info(">> get wealther jsonp" + callback);
		String result = "hahaha";
		
		List<DiscoverVo> list = new ArrayList<>();
		
		for (int i = 0; i < 15; i++) {
			list.add(new DiscoverVo(String.valueOf(i+10),"Hello" + i ,new Date()));
		}
		
		logger.info(result.toString());
		return new JSONPObject(callback, list);
	}
	
	
	@RequestMapping("/findById")
	public JSONPObject findById(@RequestParam(value = "id") String id,
			@RequestParam(value = "callback", defaultValue = "JSON_CALLBACK") String callback) {
		logger.info(">> get wealther jsonp" + callback);
		String result = "hahaha";
		
		List<DiscoverVo> list = new ArrayList<>();
		
		for (int i = 0; i < 1; i++) {
			list.add(new DiscoverVo(String.valueOf(i+10),"Hello" + i ,new Date()));
		}
		
		logger.info(result.toString());
		return new JSONPObject(callback, list);
	}
}
