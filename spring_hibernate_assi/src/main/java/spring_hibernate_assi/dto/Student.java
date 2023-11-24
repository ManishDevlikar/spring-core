package spring_hibernate_assi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {
	@Id
//	@Value(value = "101")
	private int id;
//	@Value(value = "manish")
	private String name;
//	@Value(value = "manish.gamil.com")
	private String email;
//	@Value(value = "OBC")
	private String cast;
	@Transient
	private String schoolName;

	public int getId() {
		return id;
	}

	@Value(value = "5")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Value(value = "khush")
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Value(value = "khush.gamil.com")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCast() {
		return cast;
	}

	@Value(value = "OBC")
	public void setCast(String cast) {
		this.cast = cast;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", cast=" + cast + "]";
	}

}
