package org.jsp.spring_ioc_container.setter_Injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ball_Driver {

	public static void main(String[] args) {
		try {
//			ApplicationContext context = new ClassPathXmlApplicationContext("ball.xml");
//			Ball ball = (Ball) context.getBean("ball");
//			System.out.println(ball.getBrand());
//			System.out.println(ball.getColor());
//			System.out.println(ball.getPrice());
			
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ball.xml");
			Ball ball = (Ball) context.getBean("ball");
			System.out.println(ball.getBrand());
			System.out.println(ball.getColor());
			System.out.println(ball.getPrice());
			context.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
