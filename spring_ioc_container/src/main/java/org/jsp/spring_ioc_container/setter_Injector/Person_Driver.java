package org.jsp.spring_ioc_container.setter_Injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person_Driver {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
			Person person = (Person) context.getBean("person");
			System.out.println(person.getName());
			System.out.println(person.getAge());
			System.out.println(person.getAddress());
			System.out.println(person.getSkills());
			 System.out.println("--------------------------skills-------------------");
			for (int i=0;i<person.getSkills().size();i++) {
				System.out.println(i+1+" "+person.getSkills().get(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

