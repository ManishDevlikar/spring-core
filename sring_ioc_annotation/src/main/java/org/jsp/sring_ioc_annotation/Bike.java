package org.jsp.sring_ioc_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bike")
public class Bike {

	@Value(value = "101")
	private int id;

	@Value(value = "BMW")
	private String brand;

	@Override
	public String toString() {
		return "Bike [id=" + id + ", brand=" + brand + "]";
	}

}
