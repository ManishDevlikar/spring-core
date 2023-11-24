package org.jsp.spring_ioc_no_xml;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Bike {
	@Id
	private int id;
	private String brand;
	private double price;

	@Value(value = "101")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "Honda")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Value(value = "50000")
	public void setPrice(double price) {
		this.price = price;
	}

}
