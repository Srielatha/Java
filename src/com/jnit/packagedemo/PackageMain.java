package com.jnit.packagedemo;
import com.jnit.basics.*;
import com.jnit.basics.test.Test;
import java.util.*;
//import com.jnit.basics.Test1;

//PIC(Package,import and class)
public class PackageMain {

	public static void main(String[] args) {
		Test.test();
		Test1.hello();
		com.jnit.basics.Test.test();
		List<String>slist = new ArrayList<>();
	}

}
