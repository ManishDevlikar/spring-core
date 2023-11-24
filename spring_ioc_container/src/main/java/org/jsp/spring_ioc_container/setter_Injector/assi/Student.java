package org.jsp.spring_ioc_container.setter_Injector.assi;

import java.util.List;

public class Student {
private int rollNo;
private String name;
private List<Bike> bikeList;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Bike> getBikeList() {
	return bikeList;
}
public void setBikeList(List<Bike> bikeList) {
	this.bikeList = bikeList;
}


}
