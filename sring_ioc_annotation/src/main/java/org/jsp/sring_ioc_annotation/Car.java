package org.jsp.sring_ioc_annotation;

import org.springframework.stereotype.Component;

@Component("car")
public class Car {

	public void start() {
		System.out.println("car Started...");
	}

	public void stop() {
		System.out.println("car Stopped");
	}
}
