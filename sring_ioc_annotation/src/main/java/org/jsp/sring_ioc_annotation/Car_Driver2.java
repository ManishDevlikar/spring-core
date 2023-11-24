package org.jsp.sring_ioc_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Driver2 {
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springannotation.xml");
			System.out.println("---------ball----------");
			Ball ball = context.getBean(Ball.class, "myBall");
			System.out.println(ball.getId());
			System.out.println(ball.getBrand());
			System.out.println(ball.getPrice());
			context.destroy();

			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
