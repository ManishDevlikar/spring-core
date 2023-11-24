package org.jsp.sring_ioc_annotation.assi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("engineAssi")
public class Engine {

	private int id;
	private String power;
	private String type;

	public int getId() {
		return id;
	}

	@Value(value = "101")
	public void setId(int id) {
		this.id = id;
	}

	public String getPower() {
		return power;
	}

	@Value(value = "650cc")
	public void setPower(String power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	@Value(value = "car")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", power=" + power + ", type=" + type + "]";
	}

}
