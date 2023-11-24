package org.jsp.sring_ioc_annotation.assi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("carAssi")
public class Car {

	private int id;
	private String brand;
	// @Autowired
	public Engine engine;

	public int getId() {
		return id;
	}

	@Value(value = "1001")
	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	@Value(value = "BMW")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void getDetails() {
		System.out.println("--------------car details----------------");
		System.out.println(id);
		System.out.println(brand);
		System.out.println(engine);
	}

}
