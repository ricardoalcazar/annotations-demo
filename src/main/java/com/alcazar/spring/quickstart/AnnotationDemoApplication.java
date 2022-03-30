package com.alcazar.spring.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AnnotationDemoApplication {

	public static void main(String[] args) {

        //SpringApplication.run(AnnotationDemoApplication.class, args);
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// tennis coach
		Coach tc = appCtx.getBean("myTennisCoach", com.alcazar.spring.quickstart.TennisCoach.class);
		System.out.println(tc.getDailyWorkout());

		// basketball coach
		Coach bbc = appCtx.getBean("basketballCoach", com.alcazar.spring.quickstart.BasketballCoach.class);
		System.out.println(bbc.getDailyWorkout());

		appCtx.close();

	}

}
