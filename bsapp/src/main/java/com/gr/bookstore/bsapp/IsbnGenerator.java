package com.gr.bookstore.bsapp;

import java.util.Random;

public class IsbnGenerator implements NumberGenerator {

	public String generateNumber() {
		String isbn = "13-84356-" + Math.abs(new Random().nextInt());
		//logger.info("Generated ISBN : " + isbn);
		return isbn;
	}

}
