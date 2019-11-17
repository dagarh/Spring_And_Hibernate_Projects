package com.luv2code.springdemo.fortune;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String getRandomFortune(String[] fortunes) {
		return fortunes[new Random().nextInt(fortunes.length)];
	}
	
	@Override
	public String getFortune() {
	 	// Could have inserted via properties file, think about it. 
		String[] fortunes = {"You will hit century in next match", "You will be famous", 
				"You will hit so many sixes in world cup"};
		
		return getRandomFortune(fortunes);
	}

}
