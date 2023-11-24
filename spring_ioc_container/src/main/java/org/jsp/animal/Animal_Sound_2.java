package org.jsp.animal;

public class Animal_Sound_2 {
	public Animal animal;
	private int id;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void sound() {
		animal.doSound();
	}
}
