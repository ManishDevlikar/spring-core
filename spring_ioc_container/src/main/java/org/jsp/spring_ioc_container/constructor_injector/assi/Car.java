package org.jsp.spring_ioc_container.constructor_injector.assi;

public class Car {
	private int id;
	private String brand;
	private String color;
	public Engine engine;
	
	public Car(int id,String brand,String color,Engine engine) {
		this.id=id;
		this.brand=brand;
		this.color=color;
		this.engine=engine;
	}
	
	public void getCarDetails() {
		System.out.println("-----------Car Details-----------");
		System.out.println("car id: "+id);
		System.out.println("car brand: "+brand);
		System.out.println("car color: "+color);
	}
}
