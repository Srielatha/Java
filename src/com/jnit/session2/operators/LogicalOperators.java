package com.jnit.session2.operators;

//&&,||
public class LogicalOperators {

	public static void main(String[] args) {
		int y=10;
		boolean p = true || (y < 4);
		String x = null;
		if(x != null && x.toLowerCase().equals("hello")) {
			// Do something
		}
		if(x != null || x.toLowerCase().equals("hello")) {
			// Do something
		}
	}

}
