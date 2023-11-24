package org.jsp.spring_ioc_container.constructor_injector;

public class Country {
	private int id;
	private String name;
	private double budget;
	private String pm;
	private String capital;
	private String currency;
	public Country(int id, String name, double budget, String pm, String capital, String currency) {
	
		this.id = id;
		this.name = name;
		this.budget = budget;
		this.pm = pm;
		this.capital = capital;
		this.currency = currency;
	}
	public void getDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(budget);
		System.out.println(pm);
		System.out.println(capital);
		System.out.println(currency);
	}
	
}
