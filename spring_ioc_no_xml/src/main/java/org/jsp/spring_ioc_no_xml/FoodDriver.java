package org.jsp.spring_ioc_no_xml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodDriver {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();

	public static void main(String[] args) {
		try {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//			Food food = context.getBean(Food.class, "food");
//
//			System.out.println(food.getId());
//			System.out.println(food.getName());
//			System.out.println(food.getPrice());

//			Employee employee = context.getBean(Employee.class, "employee");
//			saveEmployee(employee);

//			Alien alien = context.getBean(Alien.class, "alien");
//			saveAline(alien);

			Bike bike = context.getBean(Bike.class, "bike");
			Student student = context.getBean(Student.class, "student");

			saveStudent(student);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void saveEmployee(Employee employee) {
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}

	public static void saveAline(Alien alien) {
		transaction.begin();
		manager.persist(alien);
		transaction.commit();
	}

	public static void saveStudent(Student student) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}
}
