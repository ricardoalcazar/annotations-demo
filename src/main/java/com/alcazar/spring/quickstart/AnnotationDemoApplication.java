package com.alcazar.spring.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AnnotationDemoApplication {

	public static void main(String[] args) {

        //SpringApplication.run(AnnotationDemoApplication.class, args);
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");


		appCtx.close();


	}

}
