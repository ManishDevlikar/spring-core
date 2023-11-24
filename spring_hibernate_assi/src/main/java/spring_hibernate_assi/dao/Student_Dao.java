package spring_hibernate_assi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import spring_hibernate_assi.dto.Student;

public class Student_Dao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();

	public void saveStudent(Student student) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}

	public void getStudentById(int id) {
		Student student = manager.find(Student.class, id);
		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("Student Not Found");
		}
	}

	public void deleteStudentById(int id) {
		Student student = manager.find(Student.class, id);
		if (student != null) {
			transaction.begin();
			manager.remove(student);
			transaction.commit();
			System.out.println("Student removed from dataBase");
		} else {
			System.out.println("Student not found");
		}
	}
}
