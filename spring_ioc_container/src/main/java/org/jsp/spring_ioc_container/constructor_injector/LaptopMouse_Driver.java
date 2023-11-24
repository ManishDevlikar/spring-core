package org.jsp.spring_ioc_container.constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopMouse_Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("laptop_mouse.xml");
			Laptop laptop = (Laptop) context.getBean("laptop1");
			laptop.laptopDetails();
			laptop.mouse.mouseDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
