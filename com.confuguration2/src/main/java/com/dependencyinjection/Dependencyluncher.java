package com.dependencyinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
class Dependencyinjection{
	Dependencyluncher dependencyinjection1;
	Dependencyluncher dependencyinjection2;

	@Autowired
	public void setDependencyinjection1(Dependencyluncher dependencyinjection1) {
		System.out.println("genrated getter"+ dependencyinjection1);
		this.dependencyinjection1 = dependencyinjection1;
	}

	@Autowired
	public void setDependencyinjection2(Dependencyluncher dependencyinjection2) {
		System.out.println("genrated getter2"+ dependencyinjection2);
		this.dependencyinjection2 = dependencyinjection2;
	}



//	public Dependencyinjection(Dependencyluncher dependencyinjection1, Dependencyluncher dependencyinjection2) {
//		System.out.println("Constructor injection called");
//		this.dependencyinjection1 = dependencyinjection1;
//		this.dependencyinjection2 = dependencyinjection2;
//	}

}

@SpringBootApplication
@Configuration
@ComponentScan
public class Dependencyluncher {


	public static void main(String[] args) {

		try (var context=
					 new AnnotationConfigApplicationContext
							 (Dependencyluncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
					.forEach(System.out::println);

		};



	}

}
