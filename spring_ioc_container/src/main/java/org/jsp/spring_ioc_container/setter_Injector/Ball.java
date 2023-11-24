package org.jsp.spring_ioc_container.setter_Injector;

public class Ball {
	private String color;
	private String brand;
	private String price;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void loadFirst() {
		System.out.println("hii aliens");
	}
	
	public void destroy() {
		System.out.println("bye aliens");
	}
}
