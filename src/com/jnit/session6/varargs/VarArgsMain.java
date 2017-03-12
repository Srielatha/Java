package com.jnit.session6.varargs;
//...
//int -> Integer ->Object
//int -> float
public class VarArgsMain {
	
	public static void test(int x){		
		System.out.println(x);
	}
	
	public static void test(int...x){
		
	}

	public static void test(int x, String...s){
		System.out.println(x);
	}

//	
//	public static void test(Integer x){
//	}
//	
//	public static void test(Object x){
//	}
	
//	public static void test(float x){		
//	}
	
	public static void main(String[] args) {
		int x = 10;
		test(x);
		test(10);
	}
	
	public static final void test(){
		
	}
	
	//public abstract void test();

}
