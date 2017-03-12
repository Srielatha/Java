package org.jnit.session4.methods;

//private -constructors,methods,members -no access outside the class
//public - to any
//dont specify any modifier -to any
//protected - methods,members, constructors
public class AccessModifier {
	private int i = 10;
	
	public AccessModifier(){
		
	}
	
	public void test(){
		i = 20;
	}
	
	private void test1(int x){
		int y = 10;
	}
	
	public static void main(String[] args) {
		int x =10;
		new AccessModifier();
	}

}
