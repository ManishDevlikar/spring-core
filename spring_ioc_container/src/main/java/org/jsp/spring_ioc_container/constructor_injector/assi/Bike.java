package org.jsp.spring_ioc_container.constructor_injector.assi;

public class Bike {
	private int id;
	private String color;
	private String brand;
	public Bike(int id, String color, String brand) {
		super();
		this.id = id;
		this.color = color;
		this.brand = brand;
	}
	
	public void getBikeDetails() {
		System.out.println("Bike Details");
		System.out.println("id: "+id);
		System.out.println("color: "+color);
		System.out.println("brand: "+brand);
	}
}
