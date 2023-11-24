package org.jsp.spring_ioc_no_xml;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Alien {
	@Id
	int id;
	String name;
	String superPower;
	String planet;

	@Value(value = "101")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "manish")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "speed")
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	@Value(value = "mars")
	public void setPlanet(String planet) {
		this.planet = planet;
	}

//	public Alien(int id, String name, String superPower, String planet) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.superPower = superPower;
//		this.planet = planet;
//	}

}
