package com.example.awslambda;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Function implementation. This is called for the underling serverless. Since is defined as a component, 
 * Spring Boot creates an instance that is included within the Spring Context. 
 * That allows to inject dependencies via the different Spring mechanisms.
 */
@Component
public class UpperCaseStringHandler implements Function<String, DummyEntity>{

	
	private Logger log = LoggerFactory.getLogger(UpperCaseStringHandler.class);
	
	@Override
	public DummyEntity apply(String t) {
		log.info("t: {}",t.toUpperCase());
		return DummyEntity.buildRandom();
	}
	
	

}
