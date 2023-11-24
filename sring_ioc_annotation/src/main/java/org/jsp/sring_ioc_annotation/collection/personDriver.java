package org.jsp.sring_ioc_annotation.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personDriver {
	public static void main(String[] args) {
		try {

			ApplicationContext context = new ClassPathXmlApplicationContext("personCollection.xml");
			Person person = (Person) context.getBean("person", Person.class);
			System.out.println(person.getId());
			System.out.println(person.getAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
