package com.alcazar.spring.quickstart;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.*;

@SpringBootApplication
public class AnnotationDemoApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(AnnotationDemoApplication.class);

	public static void main(String[] args) {

        //SpringApplication.run(AnnotationDemoApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// tennis coach
		Coach tc = context.getBean("tennisCoach", com.alcazar.spring.quickstart.TennisCoach.class);
		LOGGER.debug("Daily workout: " + tc.getDailyWorkout());
		LOGGER.debug("Daily fortune: " + tc.getDailyFortune());

		// basketball coach
		Coach bbc = context.getBean("basketballCoach", com.alcazar.spring.quickstart.BasketballCoach.class);

		LOGGER.debug(bbc.getDailyWorkout());
		LOGGER.debug(bbc.getDailyFortune());

		// compare instance types
		Coach bbc2 = context.getBean("basketballCoach", com.alcazar.spring.quickstart.BasketballCoach.class);
		boolean isIdentical = (bbc == bbc2);
		LOGGER.debug("Is basketball coach identical? " + isIdentical);
		LOGGER.debug(bbc.toString());
		LOGGER.debug(bbc2.toString());

		context.close();

	}

}
