package org.jsp.sring_ioc_annotation.assi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentAssi")
public class Student {

	private int id;
	private String name;
	private int age;
	@Autowired
	private Bike bike;

	public Student(@Value(value = "101") int id, @Value(value = "manish") String name, @Value(value = "21") int age,
			@Autowired Bike bike) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.bike = bike;

	}

	public void getDetails() {
		System.out.println("--------------student details----------------");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(bike);
	}
}
