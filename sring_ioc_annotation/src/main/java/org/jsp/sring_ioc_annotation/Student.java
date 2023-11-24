package org.jsp.sring_ioc_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	@Value(value = "101")
	private int id;
	@Value(value = "manish")
	private String name;

	@Autowired
	public Bike bike;

	public void getDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(bike);
	}
}
