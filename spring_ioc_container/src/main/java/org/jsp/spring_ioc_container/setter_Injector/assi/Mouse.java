package org.jsp.spring_ioc_container.setter_Injector.assi;

public class Mouse {
	private int id;
	private String brand;
	private String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Mouse [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
