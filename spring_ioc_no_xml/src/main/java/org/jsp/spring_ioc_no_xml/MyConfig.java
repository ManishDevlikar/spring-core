package org.jsp.spring_ioc_no_xml;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "org.jsp.spring_ioc_no_xml")
public class MyConfig {

}
