package org.jsp.spring_ioc_container.constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Country_Driver {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
			Country country = (Country) context.getBean("country");
			country.getDetails();
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
