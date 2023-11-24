package org.jsp.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("aniSoundTwo")
public class AnimalSound2 {

	Animal animal;

	@Autowired
	public AnimalSound2(@Qualifier(value = "dog") Animal animal) {
		this.animal = animal;
	}

	public void sound() {
		animal.doSound();
	}
}
