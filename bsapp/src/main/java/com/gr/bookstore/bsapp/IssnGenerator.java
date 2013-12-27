package com.gr.bookstore.bsapp;

import java.util.Random;

public class IssnGenerator implements NumberGenerator {

	public String generateNumber() {
		String issn = "8-" + Math.abs(new Random().nextInt());
		//logger.info("Generated ISBN : " + issn);
		return issn;
	}

}
