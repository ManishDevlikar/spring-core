package org.jsp.spring_ioc_container.constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Alien_Driver {
public static void main(String[] args) {
	try {
		ApplicationContext context = new ClassPathXmlApplicationContext("alien.xml");
	 	Alien alien=(Alien) context.getBean("alien");
	 	alien.getDetails();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
