package org.jsp.spring_ioc_no_xml;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	private Bike bike;

	@Value(value = "101")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "manish")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "50")
	public void setAge(int age) {
		this.age = age;
	}

	@Autowired
	@Qualifier(value = "bike")
	public void setBike(Bike bike) {
		this.bike = bike;
	}

}
