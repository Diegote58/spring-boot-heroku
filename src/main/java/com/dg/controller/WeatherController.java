package com.dg.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WeatherController {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces={ MediaType.APPLICATION_JSON_VALUE + "; charset=UTF-8"})
	public String hello() throws ParseException, IOException {
		return "hello world heroku!!!!";
	}
		
}
