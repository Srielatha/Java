package com.jnit.session8.design;
//overriding -> same signature(name and params) as your parent
//access modifier -> child class overriding method shoud be the same or less restritive
//returns types -> Parent-child return types
//exceptions ->
//public(4),private(1),protected(3),no-modifier(2)
//super()-constructors,super.(parent method/variable )
//constructor chaining -> parents constructors gets executed first
//same properties in your parent and child
//static methods -> method hiding(parent has a static method x ->
//child should not have a non static method with the same name and viceversa)
public class Dog extends Animal implements Pet{
	
	private int weight;
	public String breed ="shihtzu";
	
	public Dog(){
		super();//this has to be the first line
	}
	
	public Dog(String name, String breed, int weight){
		super(name,breed);
		this.weight = weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public void eat(){
		System.out.println("Dog is eating");
		super.eat();
	}
	
	private int test(){
		return 1;
	}
	
	public Integer test1(){
		return 1;
	}
	
	public void printBreed(){
		System.out.println("Child breed is "+breed);
	}
	
	public static void print(){
		System.out.println("Child static print");
	}



	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("Snoopy");
		dog.breed = "Shihtzu";
		dog.eat();
		dog.printBreed();
		Animal animal = new Dog();
		Dog dog1 = new Dog();
		System.out.println(animal.breed);
		System.out.println(dog1.breed);
		animal.print();		
		Dog.print();
		Animal.print();
		
	}

	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		
	}

}
