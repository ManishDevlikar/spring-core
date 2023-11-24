package org.jsp.animal;

public class AnimalSound {
	private Animal animal;
	
	
	
	public AnimalSound(Animal animal) {
		this.animal = animal;
	}



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
