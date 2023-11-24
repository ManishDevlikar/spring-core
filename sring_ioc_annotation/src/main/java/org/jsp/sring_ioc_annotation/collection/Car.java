package org.jsp.sring_ioc_annotation.collection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // this will return new object each type by default it was singleton
public class Car {
	private int id;
}
