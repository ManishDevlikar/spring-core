package org.jsp.spring_ioc_container.constructor_injector;

public class Laptop {
	private String brand;
	private String color;
	private double price;
	public Mouse mouse;
	public Laptop(String brand, String color, double price, Mouse mouse) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.mouse = mouse;
	}
	
	public void laptopDetails() {
		System.out.println(brand); 
		System.out.println(color);
		System.out.println(price);
		System.out.println(mouse);
		
	}
	
}
