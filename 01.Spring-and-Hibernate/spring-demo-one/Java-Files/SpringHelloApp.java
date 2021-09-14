package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {

		// load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		

		// call methods on the bean				
		System.out.println(theCoach.getDailyWorkout());
		
		// call new methods for fortunes;
		System.out.println(theCoach.getDailyFortune());
		
		
		
		
		
		
			
		//close the context
		context.close();
		
				
		
		
		
		
	}

}
