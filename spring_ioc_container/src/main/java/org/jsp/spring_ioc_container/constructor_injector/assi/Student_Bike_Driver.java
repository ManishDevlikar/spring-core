package org.jsp.spring_ioc_container.constructor_injector.assi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Bike_Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext contex = new ClassPathXmlApplicationContext("student_bike.xml");
			Student student = (Student) contex.getBean("student");
			student.getStudentDetails();
			student.bike.getBikeDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
