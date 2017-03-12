package com.jnit.session8.lamdas;

public class AppleGreenColorPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor());
	}

	
}
