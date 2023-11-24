package org.jsp.spring_ioc_container.setter_Injector.assi;

import java.util.List;

public class Laptop {
	private int id;
	private String brand;
	private String price;
	private List<Mouse> mouseList;
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
	public List<Mouse> getMouseList() {
		return mouseList;
	}
	public void setMouseList(List<Mouse> mouseList) {
		this.mouseList = mouseList;
	}
	
	
}
