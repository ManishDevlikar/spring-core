package org.jsp.spring_ioc_container.setter_Injector.assi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Bike_Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("student_bike_gs.xml");
			Student student = (Student) context.getBean("student");
			System.out.println(student.getRollNo());
			System.out.println(student.getName());
			System.out.println(student.getBikeList());
			
//			 ConfigurableListableBeanFactory beanFactory = ((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory());
//			 beanFactory.destroyBean("bike1");
//			 	Bike bike=new Bike();
//		        bike.setPrice("250000");
//		        bike.setBrand("Yamaha");
//		        beanFactory.registerSingleton("bike1", bike);
//		        Bike dynamicBike = context.getBean("bike1", Bike.class);
//		        
//		        beanFactory.destroyBean("bike2");
//			 	Bike bike1=new Bike();
//		        bike1.setPrice("250000");
//		        bike1.setBrand("Yamaha");
//		        beanFactory.registerSingleton("bike2", bike1);
//		        Bike dynamicBike1 = context.getBean("bike2", Bike.class);
//		        System.out.println(dynamicBike.getPrice());
//		        List<Bike> bikeList = new ArrayList<Bike>();
//		        bikeList.add(dynamicBike1);
//		        bikeList.add(dynamicBike);
//		        student.setBikeList(bikeList);
//		        
//		        System.out.println(student.getBikeList());
		        

		} catch (Exception e) {
		e.printStackTrace();	
		}
	}
}
