package com.example.awslambda;

import java.util.Random;

public class DummyEntity {
	private final String message;
	private final String status;

	public DummyEntity(String message, String status) {
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}

	public static DummyEntity buildRandom() {
		Random random = new Random();
		return new DummyEntity(String.format("Message %s", random.nextFloat()), String.valueOf(random.nextLong()));
	}
}
