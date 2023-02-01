package com.confuguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		try (var context=new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
			//Object name = context.getBean("name");
			//System.out.println(name);
			//System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));

			//	System.out.println(context.getBean("address"));

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		};



	}

}
