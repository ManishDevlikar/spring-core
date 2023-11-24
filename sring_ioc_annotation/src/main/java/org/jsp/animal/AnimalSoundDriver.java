package org.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalSoundDriver {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("springannotation.xml");
//			AnimalSound animal = (AnimalSound) context.getBean("animalSound");
//			animal.sound();

//			AnimalSound2 animal2 = (AnimalSound2) context.getBean("aniSoundTwo");
//			animal2.sound();

			AnimalSound3 sound3 = (AnimalSound3) context.getBean("aniSoundThree");
			sound3.sound();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
