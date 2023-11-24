package org.jsp.spring_ioc_no_xml;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {
	@Id
	@Value(value = "101")
	int id;
	@Value(value = "manish")
	String name;
	@Value(value = "manish.gmail.com")
	String email;
}
