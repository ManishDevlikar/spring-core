package org.jsp.sring_ioc_annotation.assi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bikeAssi")
public class Bike {

	private int id;
	private String name;

	public Bike(@Value(value = "1010") int id, @Value(value = "BMW") String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + "]";
	}

}
