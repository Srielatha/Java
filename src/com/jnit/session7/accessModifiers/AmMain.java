package com.jnit.session7.accessModifiers;

import com.jnit.session7.accessModifiers1.AmMain1;

//private
//public
//no-modifier(default)-Package private access
//protected ->All classes in the same package plus child classes in different package can access it
class AmMain {

	public static void main(String[] args) {
		AmMain1 am1 = new AmMain1();
	}

}
