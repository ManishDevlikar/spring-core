package org.jsp.spring_ioc_container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Pencil_Driver {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("pencil.xml");
			Pencil pencil = (Pencil) context.getBean("pencil");
			pencil.buy(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Resource resoure = new ClassPathResource("pencil.xml");
			BeanFactory factory = new XmlBeanFactory(resoure);
			Pencil pencil = (Pencil) factory.getBean("pencil");
			pencil.buy(100);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
