package org.jsp.spring_ioc_container.constructor_injector.assi;

public class Student {
 private int id;
 private String name;

 
 public Bike bike;

public Student(int id, String name, Bike bike) {
	super();
	this.id = id;
	this.name = name;
	
	this.bike = bike;
}
 
 public void getStudentDetails() {
	 System.out.println("Student Details");
	 System.out.println("id: "+id);
	 System.out.println("name: "+name);

 }
}
