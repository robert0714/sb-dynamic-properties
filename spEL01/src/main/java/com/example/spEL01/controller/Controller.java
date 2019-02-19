package com.example.spEL01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spEL01.configuration.PaymentProperties;

@RestController

public class Controller {
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	@Autowired
	private Environment env;

	@Value("${dynamicParameters00:defaultValue}")
	private String dynamicParameters00;

	@Autowired
	private PaymentProperties paymentProperties;

	@RequestMapping(value = "/test01")
	public @ResponseBody String test01() {

		log.info("dynamicParameters00: {}", dynamicParameters00);
		System.out.println(dynamicParameters00); 
		return dynamicParameters00;

	}

	@RequestMapping(value = "/test02")
	public @ResponseBody String test02() {

		log.info("paymentProperties.getIsProduction(): {}", paymentProperties.getIsProduction());
		System.out.println(paymentProperties.getIsProduction());
		;
		return Boolean.toString(paymentProperties.getIsProduction());

	}

	@RequestMapping(value = "/test03")
	public @ResponseBody String test03() {

		String isOpenInEnv = env.getProperty("maas.service.api.log.isOpen");
		log.info("maas.service.api.log.isOpen: {}", isOpenInEnv);
		System.out.println(isOpenInEnv);
		;
		return isOpenInEnv;

	}
}
