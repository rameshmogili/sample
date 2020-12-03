package org.gontuseries.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		   Restaruant restaruantObj=(Restaruant)context.getBean("restaruantBean");
		   restaruantObj.greetCustomer();
	}

}
