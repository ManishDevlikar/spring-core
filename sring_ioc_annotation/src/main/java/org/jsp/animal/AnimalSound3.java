package org.jsp.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("aniSoundThree")
public class AnimalSound3 {
	Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	@Autowired
	@Qualifier(value = "cat")
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void sound() {
		animal.doSound();
	}
}
