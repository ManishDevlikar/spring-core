package org.jsp.sring_ioc_annotation.assi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("springannotation_assi.xml");
			Student student = context.getBean(Student.class, "myStudent");
			student.getDetails();
//
			Car car = (Car) context.getBean(Car.class, "myCar");
			car.getDetails();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
