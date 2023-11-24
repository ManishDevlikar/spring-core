package org.jsp.sring_ioc_annotation.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	public void setId(int id) {
		this.id = id;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Value(value = "101")
	private int id;
	@Value("#{address}")
	private List<String> address;
	@Value(value = "manish")
	private String name;

	public int getId() {
		return id;
	}

	public List<String> getAddress() {
		return address;
	}

}
