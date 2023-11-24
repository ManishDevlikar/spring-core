package org.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalSoundDriver {
	public static void main(String[] args) {
	try {
		ApplicationContext context = new ClassPathXmlApplicationContext("driver2.xml");
	
	Animal_Sound_2 aniSound =(Animal_Sound_2)context.getBean("sound2");
	aniSound.sound();
	
	
	ApplicationContext context2 = new ClassPathXmlApplicationContext("driver.xml");
	AnimalSound aniSoundCon =(AnimalSound)context2.getBean("sound");
	aniSoundCon.sound();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
