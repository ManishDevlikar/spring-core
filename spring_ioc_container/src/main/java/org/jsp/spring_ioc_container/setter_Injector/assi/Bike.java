package org.jsp.spring_ioc_container.setter_Injector.assi;

public class Bike {
	private int id;
	private String price;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
}
