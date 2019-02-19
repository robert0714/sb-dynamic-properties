package com.example.spEL01.configuration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

public class PaymentAutoConfigurationTest {
	private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//	@Before
//	public void init() {
//		EnvironmentTestUtils.addEnvironment(context, "service.payment.spgateway.partnerID:123",
//				"service.payment.spgateway.isProduction:true");
//
//	}
//
//	@After
//	public void restore() {
//		context.close();
//	}
//
//	@Test
//	public void testDecoratingInDefaultOrder() throws Exception {
//		context.register( PaymentAutoConfiguration.class,
//				PropertyPlaceholderAutoConfiguration.class);
//		context.refresh();
//
//		 
//
//	}
}
