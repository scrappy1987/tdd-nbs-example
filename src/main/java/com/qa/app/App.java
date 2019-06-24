package com.qa.app;

import com.qa.persistence.Todo;

public class App {

	public static void main(String[] args) {
		System.out.println("You guys are all number 2");
		Todo feedCat = new Todo("feed cat");
		System.out.println(feedCat.toString());

	}

}
