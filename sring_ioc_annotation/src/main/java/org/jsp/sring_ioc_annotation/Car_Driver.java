package org.jsp.sring_ioc_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("springannotation.xml");
			Car car = (Car) context.getBean("car");
			
			System.out.println("------car Details---------");
			car.start();
			car.stop();		
			
			Pen pen = context.getBean(Pen.class,"myPen");
			pen.getDetails();
			
			Bat bat = context.getBean(Bat.class,"myBat");
			bat.getDetails();
			
			System.out.println("---------ball----------");
			Ball ball = context.getBean(Ball.class, "myBall");
			System.out.println(ball.getId());
			System.out.println(ball.getBrand());
			System.out.println(ball.getPrice());
			
			Student student = context.getBean(Student.class,"myStudent");
			student.getDetails();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
