package org.jsp.spring_ioc_container.constructor_injector.assi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Engine_Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext contex = new ClassPathXmlApplicationContext("car_engine.xml");
			Car bmwX7= (Car) contex.getBean("car");
			bmwX7.getCarDetails();
			bmwX7.engine.getEngineDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
