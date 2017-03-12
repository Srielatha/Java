package com.jnit.session7.protectedm1;

import com.jnit.session7.protectedm.Person;

public class Employee extends Person{
	public void takeLeave(){
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.city = "Coppell";
		e.gender = 'M';
		
		Person p = new Person();
		p.city = "Irving";
		//p.gender = 'F';
		
		Employee e7 = (Employee)p;

		Person p1 = new Employee();
		p.city = "Irving";
		//p.gender = 'F';
		
		Employee e2 = (Employee)p1;
		e2.gender = 'F';
		
		Employee e3 = new Employee();
		p1 = e3;
		e3.gender = 'M';
		//e3 = p1;
		
	}
}
