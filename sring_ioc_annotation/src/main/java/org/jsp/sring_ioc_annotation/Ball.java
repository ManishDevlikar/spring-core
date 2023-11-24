package org.jsp.sring_ioc_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ball")
public class Ball {

	private int id;
	private String brand;
	private double price;

	@Value(value = "101")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "Good Shot")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Value(value = "65.0")
	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	@PostConstruct
	public void start() {
		System.out.println("hello");
	}

	@PreDestroy
	public void stop() {
		System.out.println("bye");
	}

}
