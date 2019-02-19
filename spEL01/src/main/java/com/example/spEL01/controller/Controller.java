package com.example.spEL01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spEL01.configuration.PaymentProperties;

@RestController

public class Controller {
	
	@Value("${dynamicParameters00:defaultValue}")
	private String dynamicParameters00;
	
	@Autowired
	private PaymentProperties paymentProperties ;
	
	@RequestMapping(value = "/test01")
	public @ResponseBody String test01( ) {
		 

		return dynamicParameters00;

	}
	@RequestMapping(value = "/test02")
	public @ResponseBody String test02( ) {
		 

		return Boolean.toString(paymentProperties.getIsProduction());

	}
}
