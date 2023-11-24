package spring_hibernate_assi.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_hibernate_assi.dao.Student_Dao;
import spring_hibernate_assi.dto.Student;

public class Student_Controller {
	static Student_Dao dao = new Student_Dao();

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
			Student student = context.getBean(Student.class, "student");
//			dao.saveStudent(student);
//			dao.getStudentById(105);
			dao.deleteStudentById(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
