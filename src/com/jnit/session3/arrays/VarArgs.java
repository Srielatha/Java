package com.jnit.session3.arrays;

public class VarArgs {
//var args should be the last param
	public static void test(int...a){
		
	}
	
	public static void test(String x,int...a){
		
	}
	
	public static void main(String[] args) {
		test(10,20);
		test(10);
		test(10,20,30);

	}

}
