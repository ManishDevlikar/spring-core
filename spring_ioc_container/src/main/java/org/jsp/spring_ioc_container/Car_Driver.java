package org.jsp.spring_ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Driver {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
			
			if(context!=null) {
				System.out.println(context);
				Car car = (Car) context.getBean("car1");
				car.start();
				car.stop();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
