package org.jsp.spring_ioc_container.constructor_injector.assi;

public class Engine {
 private int id;
 private String power;
 private String type;
 
 public Engine(int id,String power,String type) {
	 this.id=id;
	 this.power=power;
	 this.type=type;
 }
 public void getEngineDetails() {
	System.out.println("------------Engine Details----------");
	System.out.println("Engine ID: "+id);
	System.out.println("Engine power: "+power);
	System.out.println("Engine type: "+type);
}
}
