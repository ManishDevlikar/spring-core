package org.jsp.spring_ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop_Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("laptop.xml");
			
			Laptop laptop = (Laptop) context.getBean("laptop");
			laptop.started();
			laptop.stopped();
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
