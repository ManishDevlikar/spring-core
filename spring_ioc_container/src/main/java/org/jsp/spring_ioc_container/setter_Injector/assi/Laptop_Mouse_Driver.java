package org.jsp.spring_ioc_container.setter_Injector.assi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop_Mouse_Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("laptop_mouse_gs.xml");
			Laptop laptop = (Laptop) context.getBean("laptop");
			System.out.println(laptop.getId());
			System.out.println(laptop.getBrand());
			System.out.println(laptop.getPrice());
			System.out.println(laptop.getMouseList());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
