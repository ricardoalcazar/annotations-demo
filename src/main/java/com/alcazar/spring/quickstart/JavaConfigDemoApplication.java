package com.alcazar.spring.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class JavaConfigDemoApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(JavaConfigDemoApplication.class);

	public static void main(String[] args) {

        //SpringApplication.run(AnnotationDemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);

		// tennis coach
		Coach tc = context.getBean("tennisCoach", TennisCoach.class);
		LOGGER.debug("Daily workout: " + tc.getDailyWorkout());
		LOGGER.debug("Daily fortune: " + tc.getDailyFortune());

		// basketball coach
		Coach bbc = context.getBean("basketballCoach", BasketballCoach.class);

		LOGGER.debug(bbc.getDailyWorkout());
		LOGGER.debug(bbc.getDailyFortune());

		// compare instance types
		Coach bbc2 = context.getBean("basketballCoach", BasketballCoach.class);
		boolean isIdentical = (bbc == bbc2);
		LOGGER.debug("Is basketball coach identical? " + isIdentical);
		LOGGER.debug(bbc.toString());
		LOGGER.debug(bbc2.toString());

		context.close();

	}

}
