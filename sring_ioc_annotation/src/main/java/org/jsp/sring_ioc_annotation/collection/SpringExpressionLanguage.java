package org.jsp.sring_ioc_annotation.collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // this will return new object each type by default it was singleton
public class SpringExpressionLanguage {
	private int id;

//	invoke static method and variable
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double rating;

	@Value("#{T(java.lang.Math).PI}")
	private double PI;

//	creating object
	@Value("#{new java.lang.String('manish devlikar')}")
	private String name;
}
