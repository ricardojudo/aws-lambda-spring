package com.example.awslambda;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
/**
 * Starting point of the servlerless function execution. This starts up the Spring Context and invoke the real function implementation.
 * Full qualified name should be used as handler value in the function code section at the lambda definition
 */
public class SpringBootLambdaHandler extends SpringBootRequestHandler<String, DummyEntity> {

}
