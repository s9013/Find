package com.find.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.find.util.WeatherUtil;

/**
 *
 * @author jay
 * @date Jan 11, 2016
 *
 */
@RestController
@RequestMapping(value = "util")
public class UtilController {

	private Logger logger = LoggerFactory.getLogger(UtilController.class);

	@RequestMapping("/weather/{city}")
	public String weather(@PathVariable String city) {
		logger.info(">> get wealther");
		String result = WeatherUtil.request(city);
		logger.info(result.toString());
		return result;
	}

	@RequestMapping("/weather")
	public JSONPObject weatherJsonp(@RequestParam(value = "city", defaultValue = "shanghai") String city,
			@RequestParam(value = "callback", defaultValue = "JSON_CALLBACK") String callback) {
		logger.info(">> get wealther jsonp" + callback);
		String result = WeatherUtil.request(city);
		logger.info(result.toString());
		return new JSONPObject(callback, result);
	}

}
