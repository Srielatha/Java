package com.jnit.session2.conditionals;

//switch,case(more than one case),default case
//long and boolean
//strings, enum constants and rest of the primitive data types

//switch can exist with out default case
//default case/any case can be written in any order
//break is optional as well
//switch would execute until it finds a break
public class SwitchMain {

	public static void main(String[] args) {
		
		for(int i=0; i<10;i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		
		
		int dayOfWeek = 5;
		final int i=4;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			//break;
		case 0:
		case i:
			//int i=10;
			System.out.println("Sunday");
			break;
		case 6:
			//i=4;
			//System.out.println(i);
			System.out.println("Saturday");
			break;
		}

	}

}
