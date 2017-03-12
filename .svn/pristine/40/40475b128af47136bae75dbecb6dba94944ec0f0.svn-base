package com.jnit.session7.encapsulation;

//protecting sensitive data
public class Book {
	String name;
	private double price;
	int isbn;

	// accessor methods(getter and setter methods)
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 1000) {
			throw new IllegalArgumentException("Price should not be greater than 1000: " + price);

		}
		this.price = price;
	}

}
