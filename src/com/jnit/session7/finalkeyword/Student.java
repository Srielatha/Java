package com.jnit.session7.finalkeyword;
//this() -> one constructor from the other
public class Student {
	String name;
	int age;
	String nameOfSchool;
	Address address;
	
	public Student(){
		
	}

	public Student(String namePassed, int age){
		name = namePassed;
		this.age = age;
	}
	
	public Student(String name, int age, String nameOfschool){
		//this.name = name;
		//this.age = age;
		this(name,age);//first line
		//this(name,age,nameOfschool,null);
		this.nameOfSchool = nameOfschool;
		//this(name,age);
	}
	
	public Student(String name, int age, String nameOfschool,Address address){
		this.name = name;
		this.age = age;
		this.nameOfSchool = nameOfschool;
		this.address = address;
	}


	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Ravi";
		s1.age = 13;
		System.out.println(s1.age);
		Student s2 = new Student("Paul",10);
		System.out.println(s2.name);
	}
	
}
