package org.jsp.sring_ioc_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pen")
public class Pen {
// field injector 
	@Value(value = "101")
	private int id;
	@Value(value = "cello")
	private String name;
	@Value(value = "20.0")
	private double price;

	public void getDetails() {
		System.out.println("----------pen--------------");
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}
}
