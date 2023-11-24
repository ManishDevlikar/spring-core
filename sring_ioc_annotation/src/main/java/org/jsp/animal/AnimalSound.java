package org.jsp.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalSound {
	@Autowired
	@Qualifier(value = "cat")
//	@Resource(name = "dog")
	Animal animal;

	public void sound() {
		animal.doSound();
	}
}
