package com.example.spEL01.configuration;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 

/**
 * reference
 * https://docs.spring.io/spring-boot/docs/1.5.19.RELEASE/html/boot-features-developing-auto-configuration.html
 * 
 * https://www.baeldung.com/spring-boot-custom-starter
 * */
@Configuration
@EnableConfigurationProperties(PaymentProperties.class)  
public class PaymentAutoConfiguration { 
	
	@Autowired
    private PaymentProperties paymentProperties ;
	
	 
}
