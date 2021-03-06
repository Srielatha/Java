package com.jnit.session3.strings;
//mutable strings
//StringBuilder ->not a thread safe buffer
//StringBuffer -> thread safe
//.equals method in stringbuilder behaves same as ==

public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		sb.append("how").append("are").append("you");
		System.out.println(sb);
		System.out.println(sb.length());

		StringBuilder sb1 = new StringBuilder(10);
		sb1.append("hello");
		StringBuilder sb2 = sb1;
		System.out.println(sb2 == sb1);
		System.out.println(sb2.equals(sb1));
		System.out.println(sb1.reverse());
		
		String s = "hello";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--){
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		


	}

}
