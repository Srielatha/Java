package com.jnit.session3.strings;

public class StringMain2 {

	public static void main(String[] args) {
		System.out.println("hello" == "hello");//true
		System.out.println("hell"+"o" == "hello");//true
		String s1 = "hell";
		System.out.println(s1+"o" == "hello");//false
		String s2 = s1 + "o";
		System.out.println(s2);
		System.out.println(s2 == "hello");//false
		System.out.println((s1+"o").intern() == "hello");//true
		String s3 = new String("hello");
		String s4 = s3.intern();//create hello in string pool too

	}

}
