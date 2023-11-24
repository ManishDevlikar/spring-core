package org.jsp.spring_ioc_container.constructor_injector;

public class Alien {
	private int id;
	private String name;
	private String planet;
	private String superPower;
	public Alien(int id, String name, String planet, String superPower) {
		super();
		this.id = id;
		this.name = name;
		this.planet = planet;
		this.superPower = superPower;
	}
	
	public void getDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(planet);
		System.out.println(superPower);
	}
}
