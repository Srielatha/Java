package com.jnit.session8.design;
//Inheritance ->
public class Main {
	public static void test(Animal animal){
		animal.eat();
		if(animal instanceof Cat){
			((Cat)animal).drinksMilk();
		}
	}
	
	public static Animal test(){
		return new Cat();
	}
	
	public static void main(String[] args) {
		System.out.println(Dog.PI);
		System.out.println(Animal.PI);
		Animal animal = new Animal();
		Animal animal1 = new Dog();
		//Dog dog = new Animal();
		//Dog dog = (Dog)animal;
		Dog dog1 = (Dog)animal1;
		
		//Cat cat = new Cat();
		//Dog dog2 = (Dog)cat;
		
		test(new Cat());
		test(new Dog());
		test(new Animal());
		Pet pet = new Dog();
		pet.calculatePrice();
	}

}
