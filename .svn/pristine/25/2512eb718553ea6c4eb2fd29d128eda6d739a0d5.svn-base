package com.jnit.session4.list;

import java.util.ArrayList;
import java.util.List;
//Collection(Interface)
//List(Interface) extends Collection(I)-> all the methods doesn't have any body and we can not create an object
//for it
//ArrayList(C) implements List(I)
//interface List{ public boolean add(E);}
//Ordered data structure -> insertion order
//accepts duplicates
//initial size of 10, when it reaches its capacity its grows 1.5 times of its current size;
//index based collection- we can access elements by index
//arraylist equals compares the contents
public class ListMain {

	public static void main(String[] args) {
	
		int[]numbers = {1,2,3,5};
		int[]na = new int[5];
		List<String>colors = new ArrayList<>(5);//programming to interfaces
		
		colors.add("blue");//0
		colors.add("red");//1
		//colors.remove(0);
		//colors.remove("blue");
		System.out.println(colors.get(0));
		System.out.println(colors.size());
		colors.set(0, "pink");
		//System.out.println(colors.get(2));
		colors.clear();
		System.out.println(colors.size());
		na[0] = 1;
		System.out.println(na[0]);
		System.out.println(na.length);
		
		ArrayList<String>colorsa = new ArrayList<>();
		//colorsa.set(9, "hello");
		colorsa.add("pink");
		List<String>someList = new ArrayList<>(colorsa);
		System.out.println(someList.get(0));
		//enhanced for , for loop
		for(String color : someList){
			System.out.println(color);
		}
		
		for(int i=0; i<someList.size(); i++){
			System.out.println(someList.get(i));
		}
		//wrapper classes(byte(Byte),short(Short),int(Integer),char(Character),float(Float),long(Long),double(Double),boolean(Boolean))
		List<Integer>numbersList = new ArrayList<>();
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(Integer.parseInt("12"));//primitive
		numbersList.add(Integer.valueOf("10"));//Wrapper
		System.out.println(numbersList.contains(1));
		//Autoboxing(primitive to wrapper) and unboxing(wrapper to primitve)
		
		Integer j = 10;//autoboxing
		int i = numbersList.get(0);//unboxing
		
		int x = Integer.parseInt("12");
		String r = String.valueOf(12);
		String b = String.valueOf(true);
		
		List<Employee> empList = new ArrayList<>();
		Employee emp = new Employee();
		emp.age=13;
		emp.name="john";
		empList.add(emp);
		//raw list
		List rawList = new ArrayList();
		rawList.add(10);
		rawList.add("blue");
		rawList.add(true);
		//safe check
		if(rawList.get(1) instanceof String ){
			String q = (String)rawList.get(1);
		}
		
		List<Integer>intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		
		List<Integer>intList1 = new ArrayList<>();
		intList1.add(2);
		intList1.add(1);
		System.out.println(intList.equals(intList1));
		
		
		
		
		
		
		
		
		

	}

}
