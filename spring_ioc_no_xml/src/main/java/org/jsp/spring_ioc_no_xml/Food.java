package org.jsp.spring_ioc_no_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
	@Value(value = "101")
	int id;
	@Value(value = "biryani")
	String name;
	@Value(value = "500")
	double price;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
