package com.quantumflo.game;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringProfileApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GameApplication.class, args);
		try(var context = new AnnotationConfigApplicationContext(BasicConfig.class);) {
			System.out.println(context.getBean("name2"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println( context.getBean( Person.class ) );
		}




	}

}
