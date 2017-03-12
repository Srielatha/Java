package com.jnit.session8.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleMain {

	public List<Apple>filterGreenApples(List<Apple>apples){
		List<Apple>greenApples = new ArrayList<>();
		for (Apple apple : apples) {
			if("green".equals(apple.getColor())){
				greenApples.add(apple);
			}
		}
		return greenApples;	
	}

	public List<Apple>filterHeavyApples(List<Apple>apples){
		List<Apple>heavyApples = new ArrayList<>();
		for (Apple apple : apples) {
			if(apple.getWeight() > 100){
				heavyApples.add(apple);
			}
		}
		return heavyApples;	
	}
	//strategy design pattern -> by behavior we can break down the code
	public List<Apple>filterHeavyApples(List<Apple>apples, String color,int weight,boolean filterCriteria){
		List<Apple>filteredApples = new ArrayList<>();
		for (Apple apple : apples) {
			if(filterCriteria){
				if(apple.getWeight() > weight){
					filteredApples.add(apple);
				}
			}else{
				if(color.equals(apple.getColor())){
					filteredApples.add(apple);
				}				
			}
		}
		return filteredApples;	
	
	}

	public static List<Apple>filterApples(List<Apple>apples, ApplePredicate predicate){
		List<Apple>filteredApples = new ArrayList<>();
		for (Apple apple : apples) {
			if(predicate.test(apple)){
				filteredApples.add(apple);
			}
		}
		return filteredApples;
	}

	public static List<Apple>filterApples1(List<Apple>apples, Predicate<Apple> predicate){
		List<Apple>filteredApples = new ArrayList<>();
		for (Apple apple : apples) {
			if(predicate.test(apple)){
				filteredApples.add(apple);
			}
		}
		return filteredApples;
	}

	public static <T>List<T>filter(List<T>items, Predicate<T> predicate){
		List<T>filteredItems = new ArrayList<>();
		for (T t : items) {
			if(predicate.test(t)){
				items.add(t);
			}
		}
		return filteredItems;
	}

	public static void main(String[] args) {
		List<Apple>apples = Arrays.asList(new Apple("green",50),new Apple("green",120));
		filterApples(apples, new AppleGreenColorPredicate());
		filterApples(apples, new AppleHeavyPredicate());
		//anonymous classes(classes which doesn't have a name)
//		ApplePredicate redApplePredicate = new ApplePredicate() {			
//			@Override
//			public boolean test(Apple apple) {
//				return apple.getColor().equals("red");
//			}
//		};
		//filterApples(apples,redApplePredicate);
		//lamda's -> anonymous classes
		filterApples(apples,(Apple apple) -> {return apple.getColor().equals("red");});
		filterApples(apples,(apple) -> {return apple.getColor().equals("red");});
		filterApples(apples, apple -> {return apple.getColor().equals("red");});
		filterApples(apples, apple -> apple.getColor().equals("red"));
		filterApples(apples, apple -> { int x = 20; return apple.getColor().equals("red");});
		filterApples(apples, (a) -> { int x = 20; return a.getColor().equals("red");});
		
		Calculator calc = (a,b)->{return a+b;};
		Appleprdicate1 app1= (a,b,c)-> c.getColor().equals(a) && c.getWeight()==b;	
		Predicate<Apple>predicate = new Predicate<Apple>(){

			@Override
			public boolean test(Apple t) {
				return t.getColor().equals("red");
			}			
		};
		
		filterApples1(apples,(t)-> t.getColor().equals("red"));
	}

}
