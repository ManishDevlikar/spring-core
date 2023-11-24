package standalone_collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
		Person person = (Person) context.getBean(Person.class, "per");
		System.out.println(person.getMobNo());
		System.out.println(person.getMarks());
		System.out.println(person.getProperties());

	}
}
