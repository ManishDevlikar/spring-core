package org.jsp.spring_ioc_container.constructor_injector;

public class Mouse {
	private String color;
	private String price;
	public Mouse(String color, String price) {
		this.color = color;
		this.price = price;
	}
	
	public void mouseDetails() {
		System.out.println("-------------------------------");
		System.out.println(color);
		System.out.println(price);
	}
}
