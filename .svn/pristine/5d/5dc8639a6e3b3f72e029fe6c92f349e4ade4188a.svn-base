package org.jnit.session4.methods;

import java.util.Arrays;

public class Main {
	static void main(){
		System.out.println("inside  second main");
		return;
	}
	
	static String sayHello(String test, int x){
		if(test.equals("hello")){
			return "hello";
		}else{
			return "not hello";
		}
		//return "hi";
	}
	//widening/narrowing rules
	//byte,short,int,long,float,double
	//
	
	static long test(int i){
		i = i+10;
		return i;
	}
	
	static void test(StringBuffer sb){
		sb.append("world");
	}
	
	static String test(String s){
		s =s.concat("world");
		return s;
	}
	
	static void test(int[] arr){
		arr[0] = 10;
	}
	
	//pass by value(pass by copy)
	//pass by reference (pass a copy of reference)
	
	//accessmodifier(optional) opionalspecifier(optional) retuntype nameofthemethod(params(optional)) throws Exception(optional){}
	static public void main(String[] args) {
		System.out.println("hello");
		main();
		sayHello("hello",10);
		int i=10;
		long result =test(i);
		System.out.println(result);
		System.out.println(i);
		StringBuffer sb = new StringBuffer("hello");
		test(sb);
		System.out.println(sb);
		String s = "hello1";
		test(s);
		System.out.println(s);
		int[] arr = {1,2,3};
		test(arr);
		System.out.println(Arrays.toString(arr));
	}

}
