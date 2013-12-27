package com.gr.bookstore.bsapp;

import java.util.Random;
import javax.enterprise.inject.Alternative;


@Alternative
@ThirteenDigits

public class MockGenerator implements NumberGenerator {

	public String generateNumber() {
		String mock = "MOCK-" + Math.abs(new Random().nextInt());
		//logger.info("Generated Mock : " + mock);
		return mock;
		
	}

}
