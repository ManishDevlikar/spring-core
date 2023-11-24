package org.jsp.sring_ioc_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bat")
public class Bat {
	private int id;
	private String brand;
	private double price;

	public Bat(@Value(value = "101") int id, @Value(value = "MRF") String brand,
			@Value(value = "50000.0") double price) {

		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	public void getDetails() {
		System.out.println("--------bat------------");
		System.out.println(id);
		System.out.println(brand);
		System.out.println(price);
	}
}
